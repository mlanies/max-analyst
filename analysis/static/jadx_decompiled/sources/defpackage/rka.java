package defpackage;

/* loaded from: classes2.dex */
public final class rka implements ska {
    public final m56 a;

    public rka(m56 m56Var) {
        this.a = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rka) && tpa.f(this.a, ((rka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "More(onClick=" + this.a + ")";
    }
}
