package defpackage;

/* loaded from: classes2.dex */
public final class j93 {
    public final h93 a;
    public final k93 b;
    public final m93 c;

    public j93(h93 h93Var, k93 k93Var, m93 m93Var) {
        this.a = h93Var;
        this.b = k93Var;
        this.c = m93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j93)) {
            return false;
        }
        j93 j93Var = (j93) obj;
        return tpa.f(this.a, j93Var.a) && tpa.f(this.b, j93Var.b) && tpa.f(this.c, j93Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + ((this.b.a.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CommonStatesColors(background=" + this.a + ", icon=" + this.b + ", text=" + this.c + ")";
    }
}
