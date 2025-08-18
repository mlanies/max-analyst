package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.ule;
import java.io.IOException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.event.EventQueueCollector;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/UploadStarter;", "", "<init>", "()V", "", "apiMethod", "Le5f;", "upload", "(Ljava/lang/String;)V", "startUpload", "LOG_TAG", "Ljava/lang/String;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class UploadStarter {
    public static final UploadStarter INSTANCE = new UploadStarter();
    private static final String LOG_TAG = "UploadStarter";

    private UploadStarter() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startUpload$lambda$0(String str) {
        try {
            INSTANCE.upload(str);
        } catch (IOException e) {
            CallAnalyticsConfigStorage.INSTANCE.getLogger().e(LOG_TAG, "Cannot upload", e);
        }
    }

    public final void startUpload(String apiMethod) {
        Executor uploadExecutor = CallAnalyticsConfigStorage.INSTANCE.getUpload().getUploadExecutor();
        if (uploadExecutor == null) {
            UploadService.startUpload(apiMethod);
        } else {
            uploadExecutor.execute(new ule(8, apiMethod));
        }
    }

    public final void upload(String apiMethod) throws IOException {
        EventQueueCollector.getInstance(apiMethod).upload();
    }
}
