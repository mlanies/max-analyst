package defpackage;

/* loaded from: classes2.dex */
public final class xka implements yka {
    public final bha a;

    public xka(bha bhaVar) {
        this.a = bhaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xka) && tpa.f(this.a, ((xka) obj).a);
    }

    public final int hashCode() {
        bha bhaVar = this.a;
        if (bhaVar == null) {
            return 0;
        }
        return bhaVar.hashCode();
    }

    public final String toString() {
        return "Search(listener=" + this.a + ")";
    }
}
