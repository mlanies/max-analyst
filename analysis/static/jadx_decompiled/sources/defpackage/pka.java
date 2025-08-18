package defpackage;

/* loaded from: classes2.dex */
public final class pka implements ska {
    public final yka a;
    public final yka b;

    public pka(yka ykaVar, yka ykaVar2) {
        this.a = ykaVar;
        this.b = ykaVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pka)) {
            return false;
        }
        pka pkaVar = (pka) obj;
        return tpa.f(this.a, pkaVar.a) && tpa.f(this.b, pkaVar.b);
    }

    public final int hashCode() {
        yka ykaVar = this.a;
        int iHashCode = (ykaVar == null ? 0 : ykaVar.hashCode()) * 31;
        yka ykaVar2 = this.b;
        return iHashCode + (ykaVar2 != null ? ykaVar2.hashCode() : 0);
    }

    public final String toString() {
        return "IconButtons(secondaryButton=" + this.a + ", primaryButton=" + this.b + ")";
    }
}
