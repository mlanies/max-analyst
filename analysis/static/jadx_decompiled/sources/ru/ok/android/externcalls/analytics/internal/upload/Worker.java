package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.ey8;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.events.CallAnalyticsEvent;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.storage.FileCacheWriter;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

/* loaded from: classes2.dex */
public final class Worker {
    private static final String LOG_TAG = "CallAnalyticsWorker";
    private static final int MSG_APPEND = 0;
    private static final int MSG_FLUSH = 1;
    private static final int MSG_UPLOAD_MAX_TIMEOUT = 3;
    private static final int MSG_UPLOAD_SILENCE_TIMEOUT = 2;
    private static volatile Looper looper;
    private final String apiMethod;
    private final FileCacheWriter fileCacheWriter;
    private final Handler handler;
    private volatile long millisToUploadAny = Long.MAX_VALUE;
    private final ConcurrentHashMap<String, Long> millisToUpload = new ConcurrentHashMap<>();
    private int itemCount = 0;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();

    public class Callback implements Handler.Callback {
        public /* synthetic */ Callback(Worker worker, int i) {
            this();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                Worker.this.handleAppend((CallAnalyticsEvent) message.obj);
                return true;
            }
            if (i == 1) {
                Worker.this.handleFlush((ConditionVariable) message.obj);
                return true;
            }
            if (i == 2) {
                Worker.this.handleUploadSilenceTimeout();
                return true;
            }
            if (i != 3) {
                return false;
            }
            Worker.this.handleUploadMaxTimeout();
            return true;
        }

        private Callback() {
        }
    }

    public Worker(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z) {
        this.apiMethod = str;
        this.fileCacheWriter = new FileCacheWriter(provider2, z, lock);
        this.handler = new Handler(provider.get(), new Callback(this, 0));
    }

    private long getMaxTimeToUpload(String str) {
        Long l = this.millisToUpload.get(str);
        return (l == null || l.longValue() >= Long.MAX_VALUE) ? this.millisToUploadAny < Long.MAX_VALUE ? this.millisToUploadAny : CallAnalyticsConfigStorage.INSTANCE.getUpload().getMaxTimeToUploadMillis() : l.longValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleAppend(CallAnalyticsEvent callAnalyticsEvent) {
        this.fileCacheWriter.writeToCache(callAnalyticsEvent);
        this.itemCount++;
        UploadConfig upload = CallAnalyticsConfigStorage.INSTANCE.getUpload();
        int fileLengthTriggerToUploadBytes = upload.getFileLengthTriggerToUploadBytes();
        int eventCountToUploadNumber = upload.getEventCountToUploadNumber();
        long length = this.fileCacheWriter.length();
        if (length >= fileLengthTriggerToUploadBytes) {
            this.logger.d(LOG_TAG, "trigger | log file size exceeded " + (fileLengthTriggerToUploadBytes / 1000) + "Kb, log items count: " + this.itemCount);
            startUpload();
            return;
        }
        if (this.itemCount >= eventCountToUploadNumber) {
            this.logger.d(LOG_TAG, "trigger | log items count exceeded " + eventCountToUploadNumber + "s, file size: " + length);
            startUpload();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleFlush(ConditionVariable conditionVariable) {
        conditionVariable.open();
        this.logger.d(LOG_TAG, "trigger flush");
        startUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadMaxTimeout() {
        this.logger.d(LOG_TAG, "trigger | max time since log item passed");
        startUpload();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleUploadSilenceTimeout() {
        this.logger.d(LOG_TAG, ey8.i(CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis(), "trigger | time since last log item exceeded ", "ms"));
        startUpload();
    }

    private void startUpload() {
        UploadStarter.INSTANCE.startUpload(this.apiMethod);
    }

    public void clearMaxMillisToUpload() {
        this.millisToUploadAny = Long.MAX_VALUE;
        this.millisToUpload.clear();
    }

    public void drop() {
        try {
            this.fileCacheWriter.drop();
        } catch (IOException e) {
            this.logger.e(LOG_TAG, "drop failed", e);
        }
    }

    public void flush() {
        flush(new ConditionVariable());
    }

    public void grab(Provider<File> provider) throws IOException {
        if (provider == null) {
            return;
        }
        this.fileCacheWriter.grab(provider);
    }

    public void scheduleEventSend(CallAnalyticsEvent callAnalyticsEvent) {
        Handler handler = this.handler;
        handler.sendMessage(Message.obtain(handler, 0, callAnalyticsEvent));
        long silenceToUploadMillis = CallAnalyticsConfigStorage.INSTANCE.getUpload().getSilenceToUploadMillis();
        if (silenceToUploadMillis < Long.MAX_VALUE) {
            this.handler.removeMessages(2);
            this.handler.sendEmptyMessageDelayed(2, silenceToUploadMillis);
        }
    }

    public void setMaxMillisToUpload(String str, long j) {
        if (j < Long.MAX_VALUE) {
            this.millisToUpload.put(str, Long.valueOf(j));
        } else {
            this.millisToUpload.remove(str);
        }
    }

    public void setMaxMillisToUploadAny(long j) {
        this.millisToUploadAny = j;
    }

    private void flush(ConditionVariable conditionVariable) {
        Message.obtain(this.handler, 1, conditionVariable).sendToTarget();
        conditionVariable.block();
    }
}
