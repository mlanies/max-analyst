package defpackage;

/* loaded from: classes.dex */
public final class by9 implements cc7 {
    public final cc7 a = s9e.a;
    public final s6d b = new s6d(s9e.b);

    @Override // defpackage.cc7
    public final Object a(x8 x8Var) {
        if (x8Var.r()) {
            return x8Var.u(this.a);
        }
        return null;
    }

    @Override // defpackage.cc7
    public final void b(xu3 xu3Var, Object obj) {
        if (obj != null) {
            xu3Var.l(this.a, obj);
        } else {
            xu3Var.h();
        }
    }

    @Override // defpackage.cc7
    public final r6d d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && by9.class == obj.getClass() && tpa.f(this.a, ((by9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
