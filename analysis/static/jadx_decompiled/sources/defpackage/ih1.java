package defpackage;

/* loaded from: classes.dex */
public final class ih1 {
    public final int a;
    public final jqe b;

    public ih1(int i, eqe eqeVar) {
        this.a = i;
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1)) {
            return false;
        }
        ih1 ih1Var = (ih1) obj;
        return this.a == ih1Var.a && tpa.f(this.b, ih1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "ChipData(id=" + this.a + ", title=" + this.b + ")";
    }
}
