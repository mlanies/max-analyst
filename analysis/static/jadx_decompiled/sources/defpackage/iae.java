package defpackage;

/* loaded from: classes2.dex */
public final class iae {
    public final hae a;
    public final jae b;
    public final kae c;

    public iae(hae haeVar, jae jaeVar, kae kaeVar) {
        this.a = haeVar;
        this.b = jaeVar;
        this.c = kaeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iae)) {
            return false;
        }
        iae iaeVar = (iae) obj;
        return tpa.f(this.a, iaeVar.a) && tpa.f(this.b, iaeVar.b) && tpa.f(this.c, iaeVar.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + k7d.e(this.b.a, Integer.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        return "StrokeLocalColors(carver=" + this.a + ", tabBar=" + this.b + ", topBar=" + this.c + ")";
    }
}
