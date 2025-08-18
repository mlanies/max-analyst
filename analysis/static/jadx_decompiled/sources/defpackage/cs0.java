package defpackage;

/* loaded from: classes2.dex */
public final class cs0 {
    public final ds0 a;
    public final es0 b;
    public final fs0 c;

    public cs0(ds0 ds0Var, es0 es0Var, fs0 fs0Var) {
        this.a = ds0Var;
        this.b = es0Var;
        this.c = fs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cs0)) {
            return false;
        }
        cs0 cs0Var = (cs0) obj;
        return tpa.f(this.a, cs0Var.a) && tpa.f(this.b, cs0Var.b) && tpa.f(this.c, cs0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BubbleBackgroundFocusColors(regular=" + this.a + ", singleMedia=" + this.b + ", transparent=" + this.c + ")";
    }
}
