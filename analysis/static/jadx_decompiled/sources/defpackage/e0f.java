package defpackage;

/* loaded from: classes.dex */
public final class e0f implements su0 {
    public static final e0f b = new e0f(kfc.s0);
    public final cx6 a;

    public e0f(kfc kfcVar) {
        this.a = cx6.b(kfcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e0f.class != obj.getClass()) {
            return false;
        }
        cx6 cx6Var = this.a;
        cx6Var.getClass();
        return ngg.q(cx6Var, ((e0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
