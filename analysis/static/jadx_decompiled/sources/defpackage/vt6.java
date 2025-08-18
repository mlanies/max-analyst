package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class vt6 extends qt6 {
    public ov6 A0;
    public ut6 B0;
    public final Executor y0;
    public final Object z0 = new Object();

    public vt6(Executor executor) {
        this.y0 = executor;
    }

    @Override // defpackage.qt6
    public final ov6 a(qv6 qv6Var) {
        return qv6Var.g();
    }

    @Override // defpackage.qt6
    public final void c() {
        synchronized (this.z0) {
            try {
                ov6 ov6Var = this.A0;
                if (ov6Var != null) {
                    ov6Var.close();
                    this.A0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.qt6
    public final void e(ov6 ov6Var) {
        synchronized (this.z0) {
            try {
                if (!this.x0) {
                    ov6Var.close();
                    return;
                }
                if (this.B0 == null) {
                    ut6 ut6Var = new ut6(ov6Var, this);
                    this.B0 = ut6Var;
                    kq0.a(b(ut6Var), new w4d(16, ut6Var), ju0.k());
                } else {
                    if (ov6Var.getImageInfo().getTimestamp() <= this.B0.b.getImageInfo().getTimestamp()) {
                        ov6Var.close();
                    } else {
                        ov6 ov6Var2 = this.A0;
                        if (ov6Var2 != null) {
                            ov6Var2.close();
                        }
                        this.A0 = ov6Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
