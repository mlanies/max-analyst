package defpackage;

/* loaded from: classes2.dex */
public final class is0 {
    public final bs0 a;
    public final js0 b;
    public final ks0 c;
    public final ls0 d;

    public is0(bs0 bs0Var, js0 js0Var, ks0 ks0Var, ls0 ls0Var) {
        this.a = bs0Var;
        this.b = js0Var;
        this.c = ks0Var;
        this.d = ls0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is0)) {
            return false;
        }
        is0 is0Var = (is0) obj;
        return tpa.f(this.a, is0Var.a) && tpa.f(this.b, is0Var.b) && tpa.f(this.c, is0Var.c) && tpa.f(this.d, is0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BubbleColors(background=" + this.a + ", icon=" + this.b + ", stroke=" + this.c + ", text=" + this.d + ")";
    }
}
