package defpackage;

/* loaded from: classes2.dex */
public final class pcf {
    public final qcf a;
    public final rcf b;

    public pcf(qcf qcfVar, rcf rcfVar) {
        this.a = qcfVar;
        this.b = rcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pcf)) {
            return false;
        }
        pcf pcfVar = (pcf) obj;
        return tpa.f(this.a, pcfVar.a) && tpa.f(this.b, pcfVar.b);
    }

    public final int hashCode() {
        this.a.getClass();
        int iHashCode = Integer.hashCode(520093696) * 31;
        this.b.getClass();
        return Integer.hashCode(687865856) + iHashCode;
    }

    public final String toString() {
        return "VfxButtonIconOverlayPlainColors(elevation1=" + this.a + ", elevation2=" + this.b + ")";
    }
}
