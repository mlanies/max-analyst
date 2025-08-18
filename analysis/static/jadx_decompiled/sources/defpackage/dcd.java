package defpackage;

/* loaded from: classes.dex */
public final class dcd extends l1 {
    public final boolean j(Object obj) {
        if (obj == null) {
            obj = l1.Z;
        }
        if (!l1.Y.d(this, null, obj)) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!l1.Y.d(this, null, new u0(th))) {
            return false;
        }
        l1.b(this);
        return true;
    }

    public final boolean l(bm7 bm7Var) {
        u0 u0Var;
        bm7Var.getClass();
        Object obj = this.a;
        if (obj == null) {
            if (bm7Var.isDone()) {
                if (!l1.Y.d(this, null, l1.f(bm7Var))) {
                    return false;
                }
                l1.b(this);
            } else {
                a1 a1Var = new a1(this, bm7Var);
                if (l1.Y.d(this, null, a1Var)) {
                    try {
                        bm7Var.d(a1Var, mk4.a);
                    } catch (Throwable th) {
                        try {
                            u0Var = new u0(th);
                        } catch (Throwable unused) {
                            u0Var = u0.b;
                        }
                        l1.Y.d(this, a1Var, u0Var);
                    }
                } else {
                    obj = this.a;
                }
            }
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        bm7Var.cancel(((r0) obj).a);
        return false;
    }
}
