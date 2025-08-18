package defpackage;

/* loaded from: classes2.dex */
public final class r38 {
    public final p38 a;
    public final q38 b;

    public r38() {
        p38 p38Var = new p38();
        q38 q38Var = new q38();
        this.a = p38Var;
        this.b = q38Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r38)) {
            return false;
        }
        r38 r38Var = (r38) obj;
        return tpa.f(this.a, r38Var.a) && tpa.f(this.b, r38Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaAdaptationConfig(badNetwork=" + this.a + ", goodNetwork=" + this.b + ")";
    }
}
