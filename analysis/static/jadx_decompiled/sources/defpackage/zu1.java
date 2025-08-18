package defpackage;

import android.hardware.camera2.TotalCaptureResult;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class zu1 implements tu1 {
    public static final long g = TimeUnit.SECONDS.toNanos(2);
    public static final /* synthetic */ int h = 0;
    public final st1 a;
    public final int b;
    public boolean c = false;
    public final Executor d;
    public final ScheduledExecutorService e;
    public final boolean f;

    public zu1(st1 st1Var, int i, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z) {
        this.a = st1Var;
        this.b = i;
        this.d = executor;
        this.e = scheduledExecutorService;
        this.f = z;
    }

    @Override // defpackage.tu1
    public final bm7 a(TotalCaptureResult totalCaptureResult) {
        u40.g(this.b, totalCaptureResult);
        if (!u40.g(this.b, totalCaptureResult) || this.a.r) {
            return kq0.r(Boolean.FALSE);
        }
        this.c = true;
        b76 b76VarA = b76.a(f8.g(new yu1(this, 0)));
        yu1 yu1Var = new yu1(this, 1);
        Executor executor = this.d;
        b76VarA.getClass();
        k12 k12VarK = kq0.K(kq0.K(b76VarA, yu1Var, executor), new yu1(this, 2), this.d);
        mu1 mu1Var = new mu1(4);
        return kq0.K(k12VarK, new re6(15, mu1Var), ju0.k());
    }

    @Override // defpackage.tu1
    public final boolean b() {
        return this.b == 0;
    }

    @Override // defpackage.tu1
    public final void c() {
        if (this.c) {
            st1 st1Var = this.a;
            st1Var.j.a(null, false);
            if (this.f) {
                st1Var.h.a(false, true);
            }
        }
    }
}
