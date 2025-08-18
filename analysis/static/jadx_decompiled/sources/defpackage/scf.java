package defpackage;

/* loaded from: classes2.dex */
public final class scf {
    public final pcf a;
    public final tcf b;

    public scf(pcf pcfVar, tcf tcfVar) {
        this.a = pcfVar;
        this.b = tcfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof scf)) {
            return false;
        }
        scf scfVar = (scf) obj;
        return tpa.f(this.a, scfVar.a) && tpa.f(this.b, scfVar.b);
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VfxColors(buttonIconOverlayPlain=" + this.a + ", emptyBlock=" + this.b + ")";
    }
}
