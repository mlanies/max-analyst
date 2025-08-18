package ru.ok.android.externcalls.analytics.internal.upload;

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import defpackage.e5f;
import defpackage.k56;
import defpackage.nd7;
import defpackage.rd7;
import defpackage.sr0;
import defpackage.u25;
import defpackage.uk;
import defpackage.v25;
import defpackage.z84;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import ru.ok.android.api.core.ApiException;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.api.core.ApiRequestException;
import ru.ok.android.commons.app.ApplicationProvider;
import ru.ok.android.externcalls.analytics.config.CallAnalyticsConfig;
import ru.ok.android.externcalls.analytics.config.EventMetaParamsConfig;
import ru.ok.android.externcalls.analytics.internal.api.CallAnalyticsApiRequest;
import ru.ok.android.externcalls.analytics.internal.api.StreamingItemsApiValue;
import ru.ok.android.externcalls.analytics.internal.config.CallAnalyticsConfigStorage;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;
import ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\b \u0018\u0000 A2\u00020\u0001:\u0002ABB5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\tH\u0004¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0003H\u0004¢\u0006\u0004\b(\u0010)J#\u0010-\u001a\u00028\u0000\"\u0004\b\u0000\u0010*2\f\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000+H\u0004¢\u0006\u0004\b-\u0010.R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u00102R\u001a\u0010\b\u001a\u00020\u00078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b4\u00105R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00106R\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00103R\u001a\u00108\u001a\u0002078\u0004X\u0084\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R$\u0010<\u001a\u0004\u0018\u00010!8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010$¨\u0006C"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader;", "Ljavax/inject/Provider;", "Ljava/io/File;", "storage", "Ljava/util/concurrent/locks/Lock;", "lock", "", "collector", "", "isContentCompressed", "logTag", "<init>", "(Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZLjava/lang/String;)V", "Luk;", "client", "file", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "uploadFileWithContent", "(Luk;Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "apiClient", "apiMethod", "Lsr0;", "items", "Le5f;", "executeApiMethod", "(Luk;Ljava/lang/String;Lsr0;)V", "Lru/ok/android/externcalls/analytics/internal/upload/UploadException;", "ex", "reportApiInvocationError", "(Lru/ok/android/externcalls/analytics/internal/upload/UploadException;)V", "drop", "()V", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "idleStateProvider", "setIdleStateProvider", "(Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;)V", "isDirectory", "ensureStorageIsOfCorrectType", "(Z)Ljava/io/File;", "uploadFile", "(Ljava/io/File;)Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "T", "Lkotlin/Function0;", "block", "withLock", "(Lk56;)Ljava/lang/Object;", "Ljavax/inject/Provider;", "getStorage", "()Ljavax/inject/Provider;", "Ljava/util/concurrent/locks/Lock;", "Ljava/lang/String;", "getCollector", "()Ljava/lang/String;", "Z", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "logger", "Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "getLogger", "()Lru/ok/android/externcalls/analytics/log/CallAnalyticsLogger;", "idleState", "Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "getIdleState", "()Lru/ok/android/externcalls/analytics/internal/upload/Uploader$IdleStateProvider;", "setIdleState", "Companion", "UploadResult", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class AbstractUploader implements Uploader {

    @Deprecated
    public static final String SDK_TYPE_STRING = "ANDROID";

    @Deprecated
    public static final int VERSION_INT = 1;
    private static String appVersionString;
    private final String collector;
    private volatile Uploader.IdleStateProvider idleState;
    private final boolean isContentCompressed;
    private final Lock lock;
    private final String logTag;
    private final CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
    private final Provider<File> storage;
    private static final Companion Companion = new Companion(null);
    private static final String sdkVersionString = "125.1.0.48.3";

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$Companion;", "", "()V", "SDK_TYPE_STRING", "", "VERSION_INT", "", "appVersionString", "applicationVersionParams", "getApplicationVersionParams$annotations", "getApplicationVersionParams", "()Ljava/lang/String;", "platformParam", "getPlatformParam", "sdkVersionString", "getSdkVersionString", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void getApplicationVersionParams$annotations() {
        }

        public final String getApplicationVersionParams() throws PackageManager.NameNotFoundException {
            int iIntValue;
            String str = AbstractUploader.appVersionString;
            if (str != null) {
                return str;
            }
            String str2 = ApplicationProvider.c;
            if (str2 == null) {
                Application applicationT = nd7.t();
                PackageInfo packageInfo = applicationT.getPackageManager().getPackageInfo(applicationT.getPackageName(), 0);
                String str3 = packageInfo.versionName;
                ApplicationProvider.c = str3;
                if (ApplicationProvider.b == null) {
                    ApplicationProvider.b = Integer.valueOf(packageInfo.versionCode);
                }
                str2 = str3;
            }
            Integer num = ApplicationProvider.b;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                PackageInfo packageInfo2 = nd7.t().getPackageManager().getPackageInfo(nd7.t().getPackageName(), 0);
                int i = packageInfo2.versionCode;
                ApplicationProvider.b = Integer.valueOf(i);
                if (ApplicationProvider.c == null) {
                    ApplicationProvider.c = packageInfo2.versionName;
                }
                iIntValue = i;
            }
            String str4 = str2 + ":" + iIntValue;
            Companion unused = AbstractUploader.Companion;
            AbstractUploader.appVersionString = str4;
            return str4;
        }

        public final String getPlatformParam() {
            EventMetaParamsConfig eventMetaParams;
            k56 appName;
            String str;
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            return (config == null || (eventMetaParams = config.getEventMetaParams()) == null || (appName = eventMetaParams.getAppName()) == null || (str = (String) appName.invoke()) == null) ? "debug" : str;
        }

        public final String getSdkVersionString() {
            return AbstractUploader.sdkVersionString;
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0084\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "", "(Ljava/lang/String;I)V", "SUCCESS", "SKIP", "ERROR", "BAD_CONTENT", "RECOVERABLE_ERROR", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class UploadResult {
        private static final /* synthetic */ u25 $ENTRIES;
        private static final /* synthetic */ UploadResult[] $VALUES;
        public static final UploadResult SUCCESS = new UploadResult("SUCCESS", 0);
        public static final UploadResult SKIP = new UploadResult("SKIP", 1);
        public static final UploadResult ERROR = new UploadResult("ERROR", 2);
        public static final UploadResult BAD_CONTENT = new UploadResult("BAD_CONTENT", 3);
        public static final UploadResult RECOVERABLE_ERROR = new UploadResult("RECOVERABLE_ERROR", 4);

        private static final /* synthetic */ UploadResult[] $values() {
            return new UploadResult[]{SUCCESS, SKIP, ERROR, BAD_CONTENT, RECOVERABLE_ERROR};
        }

        static {
            UploadResult[] uploadResultArr$values = $values();
            $VALUES = uploadResultArr$values;
            $ENTRIES = new v25(uploadResultArr$values);
        }

        private UploadResult(String str, int i) {
        }

        public static u25 getEntries() {
            return $ENTRIES;
        }

        public static UploadResult valueOf(String str) {
            return (UploadResult) Enum.valueOf(UploadResult.class, str);
        }

        public static UploadResult[] values() {
            return (UploadResult[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$drop$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m76invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m76invoke() {
            File file = AbstractUploader.this.getStorage().get();
            try {
                if (file.exists()) {
                    Files.delete(file);
                    AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "storage dropped:  " + file);
                    return;
                }
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "don't drop storage " + file + ", file doesn't exist");
            } catch (IOException e) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "storage drop failed " + file, e);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader$UploadResult;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader$uploadFile$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00061 extends rd7 implements k56 {
        final /* synthetic */ File $file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00061(File file) {
            super(0);
            this.$file = file;
        }

        @Override // defpackage.k56
        public final UploadResult invoke() {
            CallAnalyticsConfig config = CallAnalyticsConfigStorage.INSTANCE.getConfig();
            if (config == null) {
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "api not initialized, will retry");
                return UploadResult.SKIP;
            }
            try {
                if (this.$file.isFile() && Files.length(this.$file) != 0) {
                    UploadResult uploadResultUploadFileWithContent = AbstractUploader.this.uploadFileWithContent(config.getOkApi().a(), this.$file);
                    Files.delete(this.$file);
                    return uploadResultUploadFileWithContent;
                }
                AbstractUploader.this.getLogger().d(AbstractUploader.this.logTag, "nothing to upload");
                try {
                    Files.delete(this.$file);
                } catch (Throwable th) {
                    AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "can't delete empty file " + this.$file.getPath(), th);
                }
                return UploadResult.SKIP;
            } catch (IOException e) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "upload failed due to io error", e);
                return UploadResult.ERROR;
            } catch (ApiException e2) {
                AbstractUploader.this.getLogger().e(AbstractUploader.this.logTag, "upload failed due to api error", e2);
                return UploadResult.RECOVERABLE_ERROR;
            }
        }
    }

    public AbstractUploader(Provider<File> provider, Lock lock, String str, boolean z, String str2) {
        this.storage = provider;
        this.lock = lock;
        this.collector = str;
        this.isContentCompressed = z;
        this.logTag = str2;
    }

    private final void executeApiMethod(uk apiClient, String apiMethod, sr0 items) throws IOException, ApiException {
        Companion companion = Companion;
        try {
            apiClient.a(new CallAnalyticsApiRequest(apiMethod, companion.getPlatformParam(), companion.getApplicationVersionParams(), SDK_TYPE_STRING, sdkVersionString, 1, items, CallAnalyticsConfigStorage.INSTANCE.getLogger()));
        } catch (ApiInvocationException e) {
            reportApiInvocationError(new UploadException(apiMethod, e));
            throw e;
        } catch (Throwable th) {
            reportApiInvocationError(new UploadException(apiMethod, th));
            throw th;
        }
    }

    public static final String getApplicationVersionParams() {
        return Companion.getApplicationVersionParams();
    }

    private final void reportApiInvocationError(UploadException ex) {
        CallAnalyticsLogger logger = CallAnalyticsConfigStorage.INSTANCE.getLogger();
        if (logger == null) {
            return;
        }
        String message = ex.getMessage();
        String str = this.logTag;
        if (message == null) {
            message = "";
        }
        logger.report(str, message, ex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UploadResult uploadFileWithContent(uk client, File file) throws IOException, ApiException {
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            executeApiMethod(client, this.collector, new StreamingItemsApiValue(file, this.isContentCompressed));
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            this.logger.d(this.logTag, "upload completed, took " + jCurrentTimeMillis2 + "ms");
            return UploadResult.SUCCESS;
        } catch (ApiInvocationException e) {
            int i = e.a;
            if (i == 2 || i == 453 || i == 102 || i == 103) {
                this.logger.w(this.logTag, "recoverable invocation error occurred, will retry");
                throw e;
            }
            this.logger.e(this.logTag, "upload failed: " + e.b + ", removing possibly broken logs");
            return UploadResult.BAD_CONTENT;
        } catch (ApiRequestException e2) {
            this.logger.e(this.logTag, "upload failed: " + e2.getMessage() + ", removing likely broken logs");
            return UploadResult.BAD_CONTENT;
        }
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void drop() {
        withLock(new AnonymousClass1());
    }

    public final File ensureStorageIsOfCorrectType(boolean isDirectory) {
        File file = this.storage.get();
        if (file.exists() && file.isDirectory() != isDirectory) {
            try {
                Files.delete(file);
            } catch (IOException unused) {
                this.logger.d(this.logTag, "File " + file.getName() + " isDirectory != " + isDirectory + " but can not be deleted");
            }
        }
        return file;
    }

    public final String getCollector() {
        return this.collector;
    }

    public final Uploader.IdleStateProvider getIdleState() {
        return this.idleState;
    }

    public final CallAnalyticsLogger getLogger() {
        return this.logger;
    }

    public final Provider<File> getStorage() {
        return this.storage;
    }

    public final void setIdleState(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void setIdleStateProvider(Uploader.IdleStateProvider idleStateProvider) {
        this.idleState = idleStateProvider;
    }

    public final UploadResult uploadFile(File file) {
        return (UploadResult) withLock(new C00061(file));
    }

    public final <T> T withLock(k56 block) {
        try {
            this.lock.lock();
            return (T) block.invoke();
        } finally {
            this.lock.unlock();
        }
    }
}
