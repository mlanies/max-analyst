package defpackage;

/* loaded from: classes2.dex */
public final class vka implements yka {
    public final int a;
    public final m56 b;

    public vka(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vka)) {
            return false;
        }
        vka vkaVar = (vka) obj;
        return this.a == vkaVar.a && tpa.f(this.b, vkaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Custom(iconRes=" + this.a + ", onClick=" + this.b + ")";
    }
}
