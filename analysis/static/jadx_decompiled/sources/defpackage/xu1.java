package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xu1 implements tu1 {
    public static final long f = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int g = 0;
    public final st1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final eu6 d;
    public final w4d e;

    public xu1(st1 st1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, w4d w4dVar) {
        this.a = st1Var;
        this.b = executor;
        this.c = scheduledExecutorService;
        this.e = w4dVar;
        eu6 eu6Var = st1Var.q;
        Objects.requireNonNull(eu6Var);
        this.d = eu6Var;
    }

    @Override // defpackage.tu1
    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        AtomicReference atomicReference = new AtomicReference();
        oq1 oq1VarG = f8.g(new dt0(atomicReference, 1));
        b76 b76VarA = b76.a(f8.g(new f9(this, 14, atomicReference)));
        vu1 vu1Var = new vu1(this, 1);
        b76VarA.getClass();
        Executor executor = this.b;
        k12 k12VarK = kq0.K(kq0.K(kq0.K(kq0.K(kq0.K(b76VarA, vu1Var, executor), new vu1(this, 2), executor), new f9(this, 15, oq1VarG), executor), new vu1(this, 3), executor), new vu1(this, 4), executor);
        mu1 mu1Var = new mu1(3);
        return kq0.K(k12VarK, new re6(15, mu1Var), ju0.k());
    }

    @Override // defpackage.tu1
    public final boolean b() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001b  */
    @Override // defpackage.tu1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            w4d r0 = r6.e
            java.lang.Object r0 = r0.b
            androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk r0 = (androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk) r0
            r1 = 1
            r2 = 5
            r3 = 0
            if (r0 == 0) goto L1b
            xv1 r0 = r0.a
            int r0 = defpackage.st1.t(r0, r2)
            if (r0 != r2) goto L15
            r0 = r1
            goto L16
        L15:
            r0 = r3
        L16:
            r0 = r0 ^ r1
            if (r0 == 0) goto L1b
            r0 = r1
            goto L1c
        L1b:
            r0 = r3
        L1c:
            st1 r4 = r6.a
            if (r0 == 0) goto L23
            r4.r(r3)
        L23:
            xs5 r0 = r4.h
            st1 r5 = r0.a
            xv1 r5 = r5.e
            int r5 = defpackage.st1.t(r5, r2)
            if (r5 == r2) goto L32
            dw6 r0 = defpackage.dw6.c
            goto L3c
        L32:
            fe4 r2 = new fe4
            r5 = 1
            r2.<init>(r0, r3, r5)
            oq1 r0 = defpackage.f8.g(r2)
        L3c:
            kc r2 = new kc
            r5 = 6
            r2.<init>(r5)
            java.util.concurrent.Executor r5 = r6.b
            r0.d(r2, r5)
            xs5 r0 = r4.h
            r0.a(r3, r1)
            zh6 r0 = defpackage.ju0.D()
            eu6 r6 = r6.d
            java.util.Objects.requireNonNull(r6)
            cu1 r1 = new cu1
            r2 = 2
            r1.<init>(r2, r6)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xu1.c():void");
    }
}
