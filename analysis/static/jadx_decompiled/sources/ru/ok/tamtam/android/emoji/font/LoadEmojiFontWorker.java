package ru.ok.tamtam.android.emoji.font;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Keep;
import androidx.work.WorkerParameters;
import defpackage.ay5;
import defpackage.bea;
import defpackage.bu9;
import defpackage.fx4;
import defpackage.gpc;
import defpackage.hm9;
import defpackage.je7;
import defpackage.jpc;
import defpackage.jyc;
import defpackage.khe;
import defpackage.l7;
import defpackage.nt9;
import defpackage.oag;
import defpackage.qn7;
import defpackage.s7g;
import defpackage.sn7;
import defpackage.un7;
import defpackage.v7g;
import defpackage.zj7;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

@Keep
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0013\u001bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0094@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0094@¢\u0006\u0004\b\f\u0010\nR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ok/tamtam/android/emoji/font/LoadEmojiFontWorker;", "Lru/ok/tamtam/upload/workers/ForegroundWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Lfm7;", "doForegroundWork", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lay5;", "createForegroundInfo", "Lfx4;", "emojiFontLoadingNotifications$delegate", "Lje7;", "getEmojiFontLoadingNotifications", "()Lfx4;", "emojiFontLoadingNotifications", "Lun7;", "state", "Lun7;", "", "getName", "()Ljava/lang/String;", "name", "Companion", "qn7", "tamtam-android-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes2.dex */
public final class LoadEmojiFontWorker extends ForegroundWorker {
    public static final qn7 Companion = new qn7();
    public static final String TAG = "LoadEmojiFontWorker";
    public static final String WAITING_FOR_WIFI = "waiting_for_wifi";

    /* renamed from: emojiFontLoadingNotifications$delegate, reason: from kotlin metadata */
    private final je7 emojiFontLoadingNotifications;
    private volatile un7 state;

    public LoadEmojiFontWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.emojiFontLoadingNotifications = new khe(new zj7(1, this));
        this.state = new sn7(-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fx4 emojiFontLoadingNotifications_delegate$lambda$0(LoadEmojiFontWorker loadEmojiFontWorker) {
        return (fx4) ((jyc) loadEmojiFontWorker.getTamComponent()).l().j.getValue();
    }

    private final fx4 getEmojiFontLoadingNotifications() {
        return (fx4) this.emojiFontLoadingNotifications.getValue();
    }

    public static final void start(v7g v7gVar, boolean z) {
        Companion.getClass();
        qn7.a(v7gVar, z);
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public Object createForegroundInfo(Continuation<? super ay5> continuation) {
        un7 un7Var = this.state;
        sn7 sn7Var = un7Var instanceof sn7 ? (sn7) un7Var : null;
        int i = sn7Var != null ? sn7Var.a : -1;
        PendingIntent pendingIntentC = s7g.d(getApplicationContext()).c(getId());
        fx4 emojiFontLoadingNotifications = getEmojiFontLoadingNotifications();
        l7 l7Var = emojiFontLoadingNotifications.a;
        l7Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = l7Var.c;
        if (j == 0 || jCurrentTimeMillis - j > l7Var.b) {
            l7Var.c = jCurrentTimeMillis;
            hm9.m("fx4", "getEmojiFontLoadingNotification: progress = %d", Integer.valueOf(i));
        }
        bea beaVar = emojiFontLoadingNotifications.c;
        beaVar.c();
        Intent intentF = beaVar.f(false);
        Context context = emojiFontLoadingNotifications.b;
        PendingIntent pendingIntentP = oag.p(context, 11, intentF);
        emojiFontLoadingNotifications.e.getClass();
        bu9 bu9VarH = beaVar.h("ru.oneme.app.fileUpload", true, true);
        emojiFontLoadingNotifications.f.getClass();
        bu9VarH.e = bu9.c(context.getString(jpc.a0));
        emojiFontLoadingNotifications.d.getClass();
        int i2 = gpc.m0;
        Notification notification = bu9VarH.F;
        notification.icon = i2;
        boolean z = i == -1;
        bu9VarH.o = 100;
        bu9VarH.p = i;
        bu9VarH.q = z;
        bu9VarH.k = 0;
        bu9VarH.g(0);
        bu9VarH.p(null);
        bu9VarH.i(16, false);
        bu9VarH.v = "progress";
        notification.when = 0L;
        bu9VarH.i(2, true);
        bu9VarH.b.add(new nt9(0, context.getString(jpc.r), pendingIntentC));
        bu9VarH.g = pendingIntentP;
        Notification notificationB = bu9VarH.b();
        getEmojiFontLoadingNotifications().getClass();
        return new ay5(11, notificationB, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:32:0x0093, B:40:0x00a2], limit reached: 89 */
    /* JADX WARN: Path cross not found for [B:40:0x00a2, B:32:0x0093], limit reached: 89 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0093 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #5 {all -> 0x005d, blocks: (B:30:0x008d, B:32:0x0093, B:71:0x013d, B:77:0x014c, B:40:0x00a2, B:42:0x00a8, B:44:0x00b2, B:46:0x00b6, B:48:0x00c2, B:50:0x00d4, B:54:0x00e9, B:59:0x0102, B:64:0x0117, B:66:0x011b, B:80:0x0159, B:81:0x015e, B:24:0x0058, B:29:0x007e), top: B:93:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: all -> 0x005d, TryCatch #5 {all -> 0x005d, blocks: (B:30:0x008d, B:32:0x0093, B:71:0x013d, B:77:0x014c, B:40:0x00a2, B:42:0x00a8, B:44:0x00b2, B:46:0x00b6, B:48:0x00c2, B:50:0x00d4, B:54:0x00e9, B:59:0x0102, B:64:0x0117, B:66:0x011b, B:80:0x0159, B:81:0x015e, B:24:0x0058, B:29:0x007e), top: B:93:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2 A[Catch: all -> 0x005d, TryCatch #5 {all -> 0x005d, blocks: (B:30:0x008d, B:32:0x0093, B:71:0x013d, B:77:0x014c, B:40:0x00a2, B:42:0x00a8, B:44:0x00b2, B:46:0x00b6, B:48:0x00c2, B:50:0x00d4, B:54:0x00e9, B:59:0x0102, B:64:0x0117, B:66:0x011b, B:80:0x0159, B:81:0x015e, B:24:0x0058, B:29:0x007e), top: B:93:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00fb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014c A[Catch: all -> 0x005d, TRY_ENTER, TryCatch #5 {all -> 0x005d, blocks: (B:30:0x008d, B:32:0x0093, B:71:0x013d, B:77:0x014c, B:40:0x00a2, B:42:0x00a8, B:44:0x00b2, B:46:0x00b6, B:48:0x00c2, B:50:0x00d4, B:54:0x00e9, B:59:0x0102, B:64:0x0117, B:66:0x011b, B:80:0x0159, B:81:0x015e, B:24:0x0058, B:29:0x007e), top: B:93:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0143 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker, ru.ok.tamtam.workmanager.SdkCoroutineWorker] */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, oke] */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v4, types: [gm7, ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker, ru.ok.tamtam.upload.workers.ForegroundWorker] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6, types: [oke] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x00d2 -> B:59:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00e5 -> B:54:0x00e9). Please report as a decompilation issue!!! */
    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object doForegroundWork(kotlin.coroutines.Continuation<? super defpackage.fm7> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker.doForegroundWork(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ru.ok.tamtam.upload.workers.ForegroundWorker
    public String getName() {
        return TAG;
    }

    public static final void start(v7g v7gVar) {
        Companion.getClass();
        qn7.a(v7gVar, false);
    }
}
