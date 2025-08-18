package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Looper;
import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.UploadConfig;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u0000 \r2\u00020\u0001:\u0002\r\u000eJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "", "Le5f;", "upload", "()V", "drop", "Ljava/io/File;", "getSink", "()Ljava/io/File;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "Companion", "IdleStateProvider", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public interface Uploader {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$Companion;", "", "()V", "create", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "looperProvider", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "uploadFile", "Ljava/io/File;", "uploadLock", "Ljava/util/concurrent/locks/Lock;", "apiMethod", "", "isContentCompressed", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final Uploader create(Provider<Looper> looperProvider, Provider<File> uploadFile, Lock uploadLock, String apiMethod, boolean isContentCompressed) {
            UploadConfig upload;
            UploadConfig upload2;
            UploadConfig upload3;
            CallAnalyticsConfigStorage callAnalyticsConfigStorage = CallAnalyticsConfigStorage.INSTANCE;
            CallAnalyticsConfig config = callAnalyticsConfigStorage.getConfig();
            int maxLocalCacheFileCount = (config == null || (upload3 = config.getUpload()) == null) ? 1 : upload3.getMaxLocalCacheFileCount();
            CallAnalyticsConfig config2 = callAnalyticsConfigStorage.getConfig();
            Long timeToUploadNextMs = (config2 == null || (upload2 = config2.getUpload()) == null) ? null : upload2.getTimeToUploadNextMs();
            CallAnalyticsConfig config3 = callAnalyticsConfigStorage.getConfig();
            return maxLocalCacheFileCount > 1 ? new MultiFileUploader(looperProvider, uploadFile, uploadLock, apiMethod, isContentCompressed, maxLocalCacheFileCount, timeToUploadNextMs) : new SingleFileUploader(uploadFile, uploadLock, apiMethod, (config3 == null || (upload = config3.getUpload()) == null) ? false : upload.getDisableUploadWhenCallIsActive(), isContentCompressed);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0004À\u0006\u0001"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "", "isIdle", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface IdleStateProvider {
        boolean isIdle();
    }

    static Uploader create(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z) {
        return INSTANCE.create(provider, provider2, lock, str, z);
    }

    void drop();

    File getSink();

    default void setIdleStateProvider(IdleStateProvider idleStateProvider) {
    }

    void upload();
}
