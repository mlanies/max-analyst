package defpackage;

/* loaded from: classes.dex */
public final class g48 implements j48 {
    public final q4d a;
    public final int b;

    public g48(q4d q4dVar, int i) {
        this.a = q4dVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g48)) {
            return false;
        }
        g48 g48Var = (g48) obj;
        return tpa.f(this.a, g48Var.a) && this.b == g48Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowMediaItem(item=" + this.a + ", uiPosition=" + this.b + ")";
    }
}
