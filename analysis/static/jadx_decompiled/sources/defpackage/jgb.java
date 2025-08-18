package defpackage;

/* loaded from: classes2.dex */
public final class jgb {
    public final jqe a;
    public final int b;
    public final xha c;

    public jgb(eqe eqeVar, int i, v02 v02Var) {
        this.a = eqeVar;
        this.b = i;
        this.c = v02Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jgb)) {
            return false;
        }
        jgb jgbVar = (jgb) obj;
        return tpa.f(this.a, jgbVar.a) && this.b == jgbVar.b && tpa.f(this.c, jgbVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + k7d.e(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "ShowCancellableSnackbar(title=" + this.a + ", bottomMargin=" + this.b + ", cancelAction=" + this.c + ")";
    }
}
