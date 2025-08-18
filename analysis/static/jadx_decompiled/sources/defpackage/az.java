package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class az extends AtomicReference {
    public final boolean a(Throwable th) {
        if (q45.a(this, th)) {
            return true;
        }
        j47.Z(th);
        return false;
    }

    public final void b() {
        Throwable thD = q45.d(this);
        if (thD == null || thD == q45.a) {
            return;
        }
        j47.Z(thD);
    }

    public final void c(ab3 ab3Var) {
        Throwable thD = q45.d(this);
        if (thD == null) {
            ab3Var.b();
        } else if (thD != q45.a) {
            ab3Var.onError(thD);
        }
    }

    public final void d(f2a f2aVar) {
        Throwable thD = q45.d(this);
        if (thD == null) {
            f2aVar.b();
        } else if (thD != q45.a) {
            f2aVar.onError(thD);
        }
    }

    public final void e(vae vaeVar) {
        Throwable thD = q45.d(this);
        if (thD == null) {
            vaeVar.b();
        } else if (thD != q45.a) {
            vaeVar.onError(thD);
        }
    }
}
