package defpackage;

import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.util.Rational;
import androidx.camera.core.CameraControl$OperationCanceledException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class xs5 {
    public static final MeteringRectangle[] x = new MeteringRectangle[0];
    public final st1 a;
    public final Executor b;
    public final ScheduledExecutorService c;
    public final re6 f;
    public ScheduledFuture i;
    public ScheduledFuture j;
    public MeteringRectangle[] q;
    public MeteringRectangle[] r;
    public MeteringRectangle[] s;
    public lq1 t;
    public lq1 u;
    public boolean v;
    public ws5 w;
    public volatile boolean d = false;
    public volatile Rational e = null;
    public boolean g = false;
    public Integer h = 0;
    public long k = 0;
    public boolean l = false;
    public boolean m = false;
    public int n = 1;
    public rs5 o = null;
    public ts5 p = null;

    public xs5(st1 st1Var, zh6 zh6Var, q6d q6dVar, bj6 bj6Var) {
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.t = null;
        this.u = null;
        this.v = false;
        this.w = null;
        this.a = st1Var;
        this.b = q6dVar;
        this.c = zh6Var;
        this.f = new re6(21, bj6Var);
    }

    public final void a(boolean z, boolean z2) {
        if (this.d) {
            u40 u40Var = new u40();
            u40Var.b = true;
            u40Var.c = this.n;
            mi9 mi9VarB = mi9.b();
            if (z) {
                mi9VarB.j(cv1.v0(CaptureRequest.CONTROL_AF_TRIGGER), 2);
            }
            if (z2) {
                mi9VarB.j(cv1.v0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 2);
            }
            u40Var.c(new cv1(8, wma.a(mi9VarB)));
            this.a.z(Collections.singletonList(u40Var.d()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [rt1, ts5] */
    public final void b() {
        ts5 ts5Var = this.p;
        st1 st1Var = this.a;
        ((HashSet) st1Var.b.b).remove(ts5Var);
        lq1 lq1Var = this.u;
        if (lq1Var != null) {
            lq1Var.d(new CameraControl$OperationCanceledException("Cancelled by another cancelFocusAndMetering()"));
            this.u = null;
        }
        ((HashSet) st1Var.b.b).remove(this.o);
        lq1 lq1Var2 = this.t;
        if (lq1Var2 != null) {
            lq1Var2.d(new CameraControl$OperationCanceledException("Cancelled by cancelFocusAndMetering()"));
            this.t = null;
        }
        this.u = null;
        ScheduledFuture scheduledFuture = this.i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.i = null;
        }
        ScheduledFuture scheduledFuture2 = this.j;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(true);
            this.j = null;
        }
        if (this.q.length > 0) {
            a(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = x;
        this.q = meteringRectangleArr;
        this.r = meteringRectangleArr;
        this.s = meteringRectangleArr;
        this.g = false;
        final long jA = st1Var.A();
        if (this.u != null) {
            final int iU = st1Var.u(this.n != 3 ? 4 : 3);
            ?? r4 = new rt1() { // from class: ts5
                @Override // defpackage.rt1
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    xs5 xs5Var = this;
                    xs5Var.getClass();
                    if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != iU || !st1.x(totalCaptureResult, jA)) {
                        return false;
                    }
                    lq1 lq1Var3 = xs5Var.u;
                    if (lq1Var3 != null) {
                        lq1Var3.b(null);
                        xs5Var.u = null;
                    }
                    return true;
                }
            };
            this.p = r4;
            st1Var.p(r4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List c(java.util.List r21, int r22, android.util.Rational r23, android.graphics.Rect r24, int r25) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xs5.c(java.util.List, int, android.util.Rational, android.graphics.Rect, int):java.util.List");
    }

    public final void d(lq1 lq1Var) {
        if (!this.d) {
            lq1Var.d(new CameraControl$OperationCanceledException("Camera is not active."));
            return;
        }
        u40 u40Var = new u40();
        u40Var.c = this.n;
        u40Var.b = true;
        mi9 mi9VarB = mi9.b();
        mi9VarB.j(cv1.v0(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER), 1);
        u40Var.c(new cv1(8, wma.a(mi9VarB)));
        u40Var.b(new ru1(lq1Var, 2));
        this.a.z(Collections.singletonList(u40Var.d()));
    }

    public final void e(boolean z) {
        if (this.d) {
            u40 u40Var = new u40();
            u40Var.c = this.n;
            u40Var.b = true;
            mi9 mi9VarB = mi9.b();
            mi9VarB.j(cv1.v0(CaptureRequest.CONTROL_AF_TRIGGER), 1);
            if (z) {
                CaptureRequest.Key key = CaptureRequest.CONTROL_AE_MODE;
                Integer numValueOf = Integer.valueOf(st1.t(this.a.e, 1));
                mi9VarB.d(cv1.v0(key), be3.b, numValueOf);
            }
            u40Var.c(new cv1(8, wma.a(mi9VarB)));
            u40Var.b(new ru1());
            this.a.z(Collections.singletonList(u40Var.d()));
        }
    }
}
