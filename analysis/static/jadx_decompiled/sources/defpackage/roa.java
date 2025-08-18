package defpackage;

import android.os.Handler;
import android.os.Message;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes2.dex */
public final class roa implements Handler.Callback {
    public static final ThreadLocal X;
    public static final ExecutorService o;
    public final d4c c;
    public final Handler b = null;
    public final ExecutorService a = o;

    static {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        o = executorServiceNewSingleThreadExecutor;
        X = new ThreadLocal();
        executorServiceNewSingleThreadExecutor.execute(new kc(10));
    }

    public roa(d4c d4cVar) {
        this.c = d4cVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        mcg mcgVar = (mcg) message.obj;
        if (mcgVar.c) {
            return true;
        }
        mcgVar.o++;
        this.c.log(e0e.app_event, "rtc.long.executor.task." + mcgVar.o, mcgVar.a);
        if (mcgVar.o >= 4) {
            return true;
        }
        Handler handler = this.b;
        if (handler == null) {
            throw new IllegalStateException("No task duration check thread");
        }
        Message messageObtainMessage = handler.obtainMessage();
        messageObtainMessage.obj = mcgVar;
        this.b.sendMessageDelayed(messageObtainMessage, MultiFileUploader.UPLOAD_NEXT_INTERVAL);
        return true;
    }
}
