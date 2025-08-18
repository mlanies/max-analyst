package ru.ok.android.externcalls.analytics.internal.upload;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import defpackage.e5f;
import defpackage.ey8;
import defpackage.je7;
import defpackage.k56;
import defpackage.khe;
import defpackage.nz4;
import defpackage.rd7;
import defpackage.tpa;
import defpackage.w9e;
import defpackage.wg0;
import defpackage.ys;
import defpackage.z84;
import defpackage.zr6;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.analytics.internal.upload.Uploader;
import ru.ok.android.externcalls.analytics.internal.utils.Files;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 92\u00020\u0001:\u00039:;BO\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0005H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\t2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\t2\u0006\u0010)\u001a\u00020\rH\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0005H\u0016¢\u0006\u0004\b,\u0010\u001dJ\u000f\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b-\u0010\u0015R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010.R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010/R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00100R\u0014\u00101\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00102\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010/R\u001b\u00108\u001a\u0002038BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107¨\u0006<"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "Lru/ok/android/externcalls/analytics/internal/upload/AbstractUploader;", "Ljavax/inject/Provider;", "Landroid/os/Looper;", "looperProvider", "Ljava/io/File;", "dir", "Ljava/util/concurrent/locks/Lock;", "lock", "", "collector", "", "isContentCompressed", "", "fileCountLimit", "", "timeBeforeNextUploadMs", "<init>", "(Ljavax/inject/Provider;Ljavax/inject/Provider;Ljava/util/concurrent/locks/Lock;Ljava/lang/String;ZILjava/lang/Long;)V", "Le5f;", "scheduleNextUpload", "()V", "triggerUpload", "uploadImpl", "()Z", "file", "uploadFileWithResultCheck", "(Ljava/io/File;)Z", "createNewFile", "()Ljava/io/File;", "", "getAllFiles", "()Ljava/util/List;", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "getStorageInfo", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "dropOldestFile", "(Ljava/io/File;)V", "files", "calcBestNameForNewFile", "(Ljava/util/List;)Ljava/lang/String;", "index", "getFileNameForIndex", "(I)Ljava/lang/String;", "getSink", "upload", "Ljavax/inject/Provider;", "I", "Ljava/lang/Long;", "fileIndexStringLength", "scaleUpNextUploadTimeout", "Landroid/os/Handler;", "handler$delegate", "Lje7;", "getHandler", "()Landroid/os/Handler;", "handler", "Companion", "LooperCallback", "StorageInfo", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class MultiFileUploader extends AbstractUploader {

    @Deprecated
    public static final String CHUNK_FILE_NAME_PREFIX = "chunk";
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String LOG_TAG = "CallAnalyticsUploaderV2";

    @Deprecated
    public static final int MSG_TRY_UPLOAD_NEXT = 1001;

    @Deprecated
    public static final long UPLOAD_NEXT_INTERVAL = 5000;
    private final int fileCountLimit;
    private final int fileIndexStringLength;

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    private final je7 handler;
    private final Provider<Looper> looperProvider;
    private volatile int scaleUpNextUploadTimeout;
    private final Long timeBeforeNextUploadMs;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$Companion;", "", "()V", "CHUNK_FILE_NAME_PREFIX", "", "LOG_TAG", "MSG_TRY_UPLOAD_NEXT", "", "UPLOAD_NEXT_INTERVAL", "", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(z84 z84Var) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$LooperCallback;", "Landroid/os/Handler$Callback;", "uploader", "Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "(Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;)V", "getUploader", "()Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader;", "handleMessage", "", "msg", "Landroid/os/Message;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LooperCallback implements Handler.Callback {
        private final MultiFileUploader uploader;

        public LooperCallback(MultiFileUploader multiFileUploader) {
            this.uploader = multiFileUploader;
        }

        public final MultiFileUploader getUploader() {
            return this.uploader;
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message msg) {
            if (msg.what != 1001) {
                return false;
            }
            this.uploader.triggerUpload();
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ok/android/externcalls/analytics/internal/upload/MultiFileUploader$StorageInfo;", "", "oldestFile", "Ljava/io/File;", "allFiles", "", "(Ljava/io/File;Ljava/util/List;)V", "getAllFiles", "()Ljava/util/List;", "getOldestFile", "()Ljava/io/File;", "calls-sdk-analytics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class StorageInfo {
        private final List<File> allFiles;
        private final File oldestFile;

        /* JADX WARN: Multi-variable type inference failed */
        public StorageInfo(File file, List<? extends File> list) {
            this.oldestFile = file;
            this.allFiles = list;
        }

        public final List<File> getAllFiles() {
            return this.allFiles;
        }

        public final File getOldestFile() {
            return this.oldestFile;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AbstractUploader.UploadResult.values().length];
            try {
                iArr[AbstractUploader.UploadResult.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractUploader.UploadResult.RECOVERABLE_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractUploader.UploadResult.SKIP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractUploader.UploadResult.BAD_CONTENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractUploader.UploadResult.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$createNewFile$1, reason: invalid class name */
    public static final class AnonymousClass1 extends rd7 implements k56 {
        public AnonymousClass1() {
            super(0);
        }

        /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
        @Override // defpackage.k56
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.io.File invoke() {
            /*
                r6 = this;
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r0 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                javax.inject.Provider r0 = r0.getStorage()
                java.lang.Object r0 = r0.get()
                java.io.File r0 = (java.io.File) r0
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$StorageInfo r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getStorageInfo(r1)
                java.util.List r2 = r1.getAllFiles()
                int r2 = r2.size()
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                int r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getFileCountLimit$p(r3)
                if (r2 < r3) goto L38
                java.io.File r2 = r1.getOldestFile()
                if (r2 == 0) goto L33
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r3 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$dropOldestFile(r3, r2)
                java.util.List r2 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$getAllFiles(r3)
                if (r2 != 0) goto L3c
            L33:
                java.util.List r2 = r1.getAllFiles()
                goto L3c
            L38:
                java.util.List r2 = r1.getAllFiles()
            L3c:
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                java.lang.String r1 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.access$calcBestNameForNewFile(r1, r2)
                ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader r6 = ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.this
                ru.ok.android.externcalls.analytics.log.CallAnalyticsLogger r6 = r6.getLogger()
                long r2 = ru.ok.android.externcalls.analytics.internal.utils.Files.length(r2)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "Propose new file for upload cache: "
                r4.<init>(r5)
                r4.append(r1)
                java.lang.String r5 = ", total files size: "
                r4.append(r5)
                r4.append(r2)
                java.lang.String r2 = r4.toString()
                java.lang.String r3 = "CallAnalyticsUploaderV2"
                r6.d(r3, r2)
                java.io.File r6 = new java.io.File
                r6.<init>(r0, r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader.AnonymousClass1.invoke():java.io.File");
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$getSink$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00071 extends rd7 implements k56 {
        public C00071() {
            super(0);
        }

        @Override // defpackage.k56
        public final File invoke() {
            MultiFileUploader.this.ensureStorageIsOfCorrectType(true);
            return MultiFileUploader.this.createNewFile();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Le5f;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader$upload$1, reason: invalid class name and case insensitive filesystem */
    public static final class C00081 extends rd7 implements k56 {
        public C00081() {
            super(0);
        }

        @Override // defpackage.k56
        public /* bridge */ /* synthetic */ Object invoke() {
            m77invoke();
            return e5f.a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m77invoke() {
            try {
                MultiFileUploader.this.uploadImpl();
            } catch (Throwable th) {
                MultiFileUploader.this.getLogger().report(MultiFileUploader.LOG_TAG, "Upload failed", new UploadException(MultiFileUploader.this.getCollector(), th));
            }
            MultiFileUploader.this.scheduleNextUpload();
        }
    }

    public /* synthetic */ MultiFileUploader(Provider provider, Provider provider2, Lock lock, String str, boolean z, int i, Long l, int i2, z84 z84Var) {
        this(provider, provider2, lock, str, z, (i2 & 32) != 0 ? 10 : i, l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String calcBestNameForNewFile(List<? extends File> files) {
        Object next;
        int i = this.fileCountLimit;
        for (int i2 = 0; i2 < i; i2++) {
            String fileNameForIndex = getFileNameForIndex(i2);
            Iterator<T> it = files.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (tpa.f(fileNameForIndex, ((File) next).getName())) {
                    break;
                }
            }
            if (next == null) {
                if (!new File(getStorage().get(), fileNameForIndex).exists()) {
                    getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not found, provide it");
                    return fileNameForIndex;
                }
                getLogger().d(LOG_TAG, "Name: " + fileNameForIndex + " not listed but file exists");
            }
        }
        String fileNameForIndex2 = getFileNameForIndex(0);
        getLogger().d(LOG_TAG, "Nothing found, default to " + fileNameForIndex2);
        return fileNameForIndex2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File createNewFile() {
        return (File) withLock(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dropOldestFile(File file) {
        try {
            Files.delete(file);
            getLogger().d(LOG_TAG, "Oldest file " + file.getPath() + " dropped");
        } catch (IOException e) {
            getLogger().e(LOG_TAG, zr6.i("Oldest file ", file.getPath(), " drop request failed"), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<File> getAllFiles() {
        File[] fileArrListFiles = getStorage().get().listFiles();
        return fileArrListFiles != null ? ys.d0(fileArrListFiles) : nz4.a;
    }

    private final String getFileNameForIndex(int index) {
        return this.fileIndexStringLength > 1 ? wg0.i("chunk_", w9e.H0(String.valueOf(index), this.fileIndexStringLength, '_')) : zr6.h(index, "chunk_");
    }

    private final Handler getHandler() {
        return (Handler) this.handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final StorageInfo getStorageInfo() {
        List<File> allFiles = getAllFiles();
        File file = null;
        long jLastModified = 0;
        for (File file2 : allFiles) {
            if (file2.exists() && (file == null || file2.lastModified() < jLastModified)) {
                jLastModified = file2.lastModified();
                file = file2;
            }
        }
        return new StorageInfo(file, allFiles);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleNextUpload() {
        if (!(!getStorageInfo().getAllFiles().isEmpty())) {
            getLogger().d(LOG_TAG, "empty storage, won't schedule new upload");
            return;
        }
        Handler handler = getHandler();
        Long l = this.timeBeforeNextUploadMs;
        long jLongValue = (l != null ? l.longValue() : UPLOAD_NEXT_INTERVAL) * this.scaleUpNextUploadTimeout;
        getLogger().d(LOG_TAG, ey8.i(jLongValue, "schedule next upload pass in ", " ms"));
        handler.removeMessages(MSG_TRY_UPLOAD_NEXT);
        handler.sendMessageDelayed(handler.obtainMessage(MSG_TRY_UPLOAD_NEXT), jLongValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void triggerUpload() {
        UploadStarter.INSTANCE.startUpload(getCollector());
    }

    private final boolean uploadFileWithResultCheck(File file) {
        int i = WhenMappings.$EnumSwitchMapping$0[uploadFile(file).ordinal()];
        if (i == 1 || i == 2) {
            this.scaleUpNextUploadTimeout = 1;
            return true;
        }
        if (i != 3 && i != 4) {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            if (this.scaleUpNextUploadTimeout < 6) {
                this.scaleUpNextUploadTimeout *= 2;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean uploadImpl() {
        StorageInfo storageInfo = getStorageInfo();
        File oldestFile = storageInfo.getOldestFile();
        getLogger().d(LOG_TAG, "Try to upload oldest file first");
        if (oldestFile != null && uploadFileWithResultCheck(oldestFile)) {
            getLogger().d(LOG_TAG, "Oldest file upload completed: " + oldestFile.getPath());
            return true;
        }
        getLogger().d(LOG_TAG, "Try to upload first from the list");
        for (File file : storageInfo.getAllFiles()) {
            if (uploadFileWithResultCheck(file)) {
                getLogger().d(LOG_TAG, "File upload completed: " + file.getPath());
                return true;
            }
        }
        getLogger().d(LOG_TAG, "No files were uploaded");
        return false;
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public File getSink() {
        return (File) withLock(new C00071());
    }

    @Override // ru.ok.android.externcalls.analytics.internal.upload.Uploader
    public void upload() {
        Uploader.IdleStateProvider idleState = getIdleState();
        if (idleState == null || idleState.isIdle()) {
            withLock(new C00081());
        } else {
            getLogger().d(LOG_TAG, "call is not idle, postpone upload");
        }
    }

    public MultiFileUploader(Provider<Looper> provider, Provider<File> provider2, Lock lock, String str, boolean z, int i, Long l) {
        super(provider2, lock, str, z, LOG_TAG);
        this.looperProvider = provider;
        this.fileCountLimit = i;
        this.timeBeforeNextUploadMs = l;
        int i2 = 10;
        if (i <= 10) {
            i2 = 1;
        } else if (i <= 100) {
            i2 = 2;
        } else if (i <= 1000) {
            i2 = 3;
        }
        this.fileIndexStringLength = i2;
        this.scaleUpNextUploadTimeout = 1;
        this.handler = new khe(new MultiFileUploader$handler$2(this));
    }
}
