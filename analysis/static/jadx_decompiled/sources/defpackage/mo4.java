package defpackage;

import java.io.File;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker;

/* loaded from: classes2.dex */
public final class mo4 implements cfe {
    public final /* synthetic */ DownloadFileFromWebAppWorker a;

    public mo4(DownloadFileFromWebAppWorker downloadFileFromWebAppWorker) {
        this.a = downloadFileFromWebAppWorker;
    }

    @Override // defpackage.cfe
    public final void a() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadFailed: " + downloadFileFromWebAppWorker.c(), null);
        }
        av0 av0VarD = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        av0VarD.c(new zg5(j));
        this.a.x0 = fo4.a;
    }

    @Override // defpackage.cfe
    public final e5f b() {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onUrlExpired", null);
        }
        av0 av0VarD = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        av0VarD.c(new zg5(j));
        return e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.cfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(float r18, long r19, long r21, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof defpackage.lo4
            if (r2 == 0) goto L17
            r2 = r1
            lo4 r2 = (defpackage.lo4) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            lo4 r2 = new lo4
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            e5f r5 = defpackage.e5f.a
            r6 = 0
            r7 = 2
            r8 = 1
            if (r4 == 0) goto L41
            if (r4 == r8) goto L3a
            if (r4 != r7) goto L32
            defpackage.od2.a0(r1)
            goto Lc5
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r0 = r2.o
            defpackage.od2.a0(r1)
            goto Lb8
        L41:
            defpackage.od2.a0(r1)
            long r9 = java.lang.System.currentTimeMillis()
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r0.a
            long r11 = r1.w0
            long r11 = r9 - r11
            r13 = 500(0x1f4, double:2.47E-321)
            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r4 >= 0) goto L55
            return r5
        L55:
            r1.w0 = r9
            ho4 r4 = new ho4
            yne r9 = r1.c()
            long r13 = r9.e
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r9 = r0.a
            yne r9 = r9.c()
            long r9 = r9.b
            r11 = r4
            r12 = r18
            r15 = r9
            r11.<init>(r12, r13, r15)
            r1.x0 = r4
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r1 = r0.a
            io4 r1 = r1.x0
            boolean r4 = r1 instanceof defpackage.ho4
            if (r4 == 0) goto L7b
            ho4 r1 = (defpackage.ho4) r1
            goto L7c
        L7b:
            r1 = r6
        L7c:
            if (r1 != 0) goto L7f
            return r5
        L7f:
            ir6 r4 = defpackage.hm9.m
            if (r4 != 0) goto L84
            goto La1
        L84:
            boolean r9 = r4.c()
            if (r9 == 0) goto La1
            us7 r9 = defpackage.us7.X
            float r10 = r1.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "update notification "
            r11.<init>(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            java.lang.String r11 = "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker"
            r4.d(r9, r11, r10, r6)
        La1:
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r4 = r0.a
            float r1 = r1.a
            boolean r1 = r4.needToShowNotification(r1)
            if (r1 == 0) goto Lc5
            ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker r0 = r0.a
            r2.o = r0
            r2.Z = r8
            java.lang.Object r1 = r0.getForegroundInfo(r2)
            if (r1 != r3) goto Lb8
            return r3
        Lb8:
            ay5 r1 = (defpackage.ay5) r1
            r2.o = r6
            r2.Z = r7
            java.lang.Object r0 = r0.setForeground(r1, r2)
            if (r0 != r3) goto Lc5
            return r3
        Lc5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mo4.c(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.cfe
    public final Object d(Continuation continuation) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCancelled: " + downloadFileFromWebAppWorker.c(), null);
        }
        av0 av0VarD = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        av0VarD.c(new xg5(j));
        this.a.x0 = do4.a;
        return e5f.a;
    }

    @Override // defpackage.cfe
    public final void e(boolean z, boolean z2) {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadInterrupted: " + downloadFileFromWebAppWorker.c() + ", isNetworkProblem:" + z + ", retryCount:" + downloadFileFromWebAppWorker.v0.get(), null);
        }
        av0 av0VarD = this.a.d();
        long j = this.a.c().a;
        String str = this.a.c().c;
        av0VarD.c(new zg5(j));
        this.a.x0 = (!z || (z ? this.a.v0.incrementAndGet() : 0) > 10) ? new go4(false) : new go4(true);
    }

    @Override // defpackage.cfe
    public final Object f(File file, Continuation continuation) {
        hm9.m("ru.ok.tamtam.upload.workers.DownloadFileFromWebAppWorker", "onFileDownloadCompleted: %s", this.a.c());
        if (file != null) {
            this.a.d().c(new ah5(this.a.c().a, this.a.c().c));
            ((mh5) this.a.Y.getValue()).b(file);
        }
        this.a.x0 = eo4.a;
        return e5f.a;
    }

    @Override // defpackage.cfe
    public final String getDownloadContext() {
        DownloadFileFromWebAppWorker downloadFileFromWebAppWorker = this.a;
        long j = downloadFileFromWebAppWorker.c().b;
        long j2 = downloadFileFromWebAppWorker.c().e;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append(j2);
        return sb.toString();
    }
}
