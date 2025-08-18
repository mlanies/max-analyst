package defpackage;

/* loaded from: classes2.dex */
public final class mka implements ska {
    public final m56 a;

    public mka(m56 m56Var) {
        this.a = m56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mka) && tpa.f(this.a, ((mka) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Done(onClick=" + this.a + ")";
    }
}
