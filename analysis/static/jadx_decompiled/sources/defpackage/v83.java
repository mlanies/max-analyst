package defpackage;

/* loaded from: classes2.dex */
public final class v83 {
    public final j73 a;
    public final m73 b;
    public final w83 c;
    public final b93 d;
    public final j93 e;
    public final o93 f;
    public final q93 g;

    public v83(j73 j73Var, m73 m73Var, w83 w83Var, b93 b93Var, j93 j93Var, o93 o93Var, q93 q93Var) {
        this.a = j73Var;
        this.b = m73Var;
        this.c = w83Var;
        this.d = b93Var;
        this.e = j93Var;
        this.f = o93Var;
        this.g = q93Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v83)) {
            return false;
        }
        v83 v83Var = (v83) obj;
        return tpa.f(this.a, v83Var.a) && tpa.f(this.b, v83Var.b) && tpa.f(this.c, v83Var.c) && tpa.f(this.d, v83Var.d) && tpa.f(this.e, v83Var.e) && tpa.f(this.f, v83Var.f) && tpa.f(this.g, v83Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "CommonColors(action=" + this.a + ", background=" + this.b + ", icon=" + this.c + ", shadows=" + this.d + ", states=" + this.e + ", stroke=" + this.f + ", text=" + this.g + ")";
    }
}
