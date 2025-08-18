package defpackage;

/* loaded from: classes2.dex */
public final class lka implements qka, ska {
    public final m56 a;

    public lka(m56 m56Var) {
        this.a = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lka) && tpa.f(this.a, ((lka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Close(onClick=" + this.a + ")";
    }
}
