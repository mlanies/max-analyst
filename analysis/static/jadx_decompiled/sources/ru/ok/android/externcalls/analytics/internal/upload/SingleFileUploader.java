package ru.ok.android.externcalls.analytics.internal.upload;

import defpackage.k56;
import defpackage.rd7;
import defpackage.z84;
import java.io.File;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B7\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013¨\u0006\u0015"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/SingleFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "file", "Ljava/util/concurrent/locks/Lock;", "lock", "", "collector", "", "disableUploadWhenCallIsActive", "isContentCompressed", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZZ)V", "Le5f;", "upload", "()V", "getSink", "()Ljava/io/File;", "Z", "Companion", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class SingleFileUploader extends AbstractUploader {
    private static final String LOG_TAG = "CallAnalyticsUploader";
    private final boolean disableUploadWhenCallIsActive;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.SingleFileUploader$getSink$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.k56
        public final File invoke() {
            return SingleFileUploader.this.ensureStorageIsOfCorrectType(false);
        }
    }

    public /* synthetic */ SingleFileUploader(Provider provider, Lock lock, String str, boolean z, boolean z2, int i, z84 z84Var) {
        this(provider, lock, str, (i & 8) != 0 ? false : z, z2);
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return (File) withLock(new AnonymousClass1());
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState;
        if (this.disableUploadWhenCallIsActive && (idleState = getIdleState()) != null && !idleState.isIdle()) {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
            return;
        }
        try {
            uploadFile(getStorage().get());
        } catch (Throwable th) {
            getLogger().report(LOG_TAG, "Upload failed", new UploadException(getCollector(), th));
        }
    }

    public SingleFileUploader(Provider<File> provider, Lock lock, String str, boolean z, boolean z2) {
        super(provider, lock, str, z2, LOG_TAG);
        this.disableUploadWhenCallIsActive = z;
    }
}
