package defpackage;

import java.io.File;
import ru.ok.tamtam.upload.workers.DownloadFileAttachWorker;
import ru.ok.tamtam.util.HandledException;

/* loaded from: classes2.dex */
public final class ao4 implements cfe {
    public final /* synthetic */ DownloadFileAttachWorker a;

    public ao4(DownloadFileAttachWorker downloadFileAttachWorker) {
        this.a = downloadFileAttachWorker;
    }

    @Override // defpackage.cfe
    public final void a() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadFailed: " + downloadFileAttachWorker.g(), null);
        }
        if (this.a.g().h) {
            ((av0) this.a.u0.getValue()).c(new hn4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        this.a.D0 = qn4.a;
    }

    @Override // defpackage.cfe
    public final e5f b() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", zr6.h(downloadFileAttachWorker.g().l, "invalidate count="), null);
        }
        int i = this.a.g().l;
        e5f e5fVar = e5f.a;
        tn4 tn4Var = tn4.a;
        if (i >= 10) {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Reached max link invalidate count:", null);
            ((cba) ((o45) this.a.t0.getValue())).c(new HandledException("Reached max link invalidate count"), true);
            this.a.D0 = tn4Var;
            return e5fVar;
        }
        cu8 cu8VarQ = this.a.e().q(this.a.g().a);
        if (cu8VarQ == null || !cu8VarQ.u() || cu8VarQ.v0 == vx8.DELETED) {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Message deleted or now audio", null);
            this.a.D0 = tn4Var;
            return e5fVar;
        }
        e52 e52VarC = ((p82) this.a.X.getValue()).C(cu8VarQ.t0);
        if (e52VarC != null) {
            hm9.n("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Create invalidateAndDownloadAudio task");
            pk pkVar = (pk) this.a.s0.getValue();
            File file = this.a.E0;
            String absolutePath = (file != null ? file : null).getAbsolutePath();
            long j = e52VarC.b.a;
            long j2 = cu8VarQ.c;
            pne pneVarG = this.a.g();
            k4a k4aVar = (k4a) pkVar;
            k4aVar.getClass();
            c37.d(ome.d(k4aVar.z(), new q47(((p7b) k4aVar.y()).a.o(), absolutePath, j, j2, pneVarG), false, 0, 12));
        } else {
            hm9.p("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "Chat is null", null);
            this.a.D0 = tn4Var;
        }
        return e5fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0114 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // defpackage.cfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(float r19, long r20, long r22, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.c(float, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.cfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r13 instanceof defpackage.xn4
            if (r0 == 0) goto L14
            r0 = r13
            xn4 r0 = (defpackage.xn4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r10 = r0
            goto L1a
        L14:
            xn4 r0 = new xn4
            r0.<init>(r12, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r10.X
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.Z
            e5f r11 = defpackage.e5f.a
            r2 = 1
            if (r1 == 0) goto L35
            if (r1 != r2) goto L2d
            ao4 r12 = r10.o
            defpackage.od2.a0(r13)
            goto L93
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            defpackage.od2.a0(r13)
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            ir6 r1 = defpackage.hm9.m
            if (r1 != 0) goto L3f
            goto L5f
        L3f:
            boolean r3 = r1.c()
            if (r3 == 0) goto L5f
            us7 r3 = defpackage.us7.X
            pne r13 = r13.g()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "onFileDownloadCancelled: "
            r4.<init>(r5)
            r4.append(r13)
            java.lang.String r13 = r4.toString()
            r4 = 0
            java.lang.String r5 = "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker"
            r1.d(r3, r5, r13, r4)
        L5f:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r13 = r12.a
            pne r13 = r13.g()
            boolean r13 = r13.a()
            if (r13 == 0) goto L93
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r1 = r12.a
            d20 r3 = defpackage.d20.b
            int r4 = r1.B0
            r10.o = r12
            r10.Z = r2
            au8 r13 = r1.e()
            pne r2 = r1.g()
            long r5 = r2.a
            cu8 r2 = r13.q(r5)
            r9 = 0
            r5 = 0
            r7 = 0
            java.lang.Object r13 = r1.h(r2, r3, r4, r5, r7, r9, r10)
            if (r13 != r0) goto L8f
            goto L90
        L8f:
            r13 = r11
        L90:
            if (r13 != r0) goto L93
            return r0
        L93:
            ru.ok.tamtam.upload.workers.DownloadFileAttachWorker r12 = r12.a
            on4 r13 = defpackage.on4.a
            r12.D0 = r13
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.d(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.cfe
    public final void e(boolean z, boolean z2) {
        un4 rn4Var;
        d20 d20Var;
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "onFileDownloadInterrupted: " + downloadFileAttachWorker.g() + ", isNetworkProblem:" + z + ", retryCount:" + downloadFileAttachWorker.A0.get(), null);
        }
        if (this.a.g().h) {
            ((av0) this.a.u0.getValue()).c(new hn4(this.a.g().g, this.a.g().b, this.a.g().o, this.a.g().a));
        }
        l20 l20VarA = s5c.A(this.a.e().q(this.a.g().a), this.a.g().b);
        int iIncrementAndGet = z ? this.a.A0.incrementAndGet() : 0;
        DownloadFileAttachWorker downloadFileAttachWorker2 = this.a;
        if (l20VarA == null || (d20Var = l20VarA.o) == null || !d20Var.a()) {
            rn4Var = (!z || iIncrementAndGet > 10) ? new rn4(false) : new rn4(true);
        } else {
            hm9.m0("ru.ok.tamtam.upload.workers.DownloadFileAttachWorker", "File download. onFileDownloadInterrupted: cancelled outside!", new Object[0]);
            rn4Var = on4.a;
        }
        downloadFileAttachWorker2.D0 = rn4Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // defpackage.cfe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.io.File r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao4.f(java.io.File, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.cfe
    public final String getDownloadContext() {
        DownloadFileAttachWorker downloadFileAttachWorker = this.a;
        if (downloadFileAttachWorker.g().c > 0) {
            long j = downloadFileAttachWorker.g().a;
            long j2 = downloadFileAttachWorker.g().c;
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(j2);
            return sb.toString();
        }
        if (downloadFileAttachWorker.g().d > 0) {
            long j3 = downloadFileAttachWorker.g().a;
            long j4 = downloadFileAttachWorker.g().d;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j3);
            sb2.append(j4);
            return sb2.toString();
        }
        if (downloadFileAttachWorker.g().e > 0) {
            long j5 = downloadFileAttachWorker.g().a;
            long j6 = downloadFileAttachWorker.g().e;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j5);
            sb3.append(j6);
            return sb3.toString();
        }
        if (downloadFileAttachWorker.g().f > 0) {
            long j7 = downloadFileAttachWorker.g().a;
            long j8 = downloadFileAttachWorker.g().f;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(j7);
            sb4.append(j8);
            return sb4.toString();
        }
        if (downloadFileAttachWorker.g().j <= 0) {
            throw new AssertionError("DownloadListener.getContext() must return not null value");
        }
        long j9 = downloadFileAttachWorker.g().a;
        long j10 = downloadFileAttachWorker.g().j;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(j9);
        sb5.append(j10);
        return sb5.toString();
    }
}
