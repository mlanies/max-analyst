package defpackage;

/* loaded from: classes2.dex */
public final class kma extends ka1 {
    public final jqe b;
    public final int c;
    public final jqe d;

    public kma(int i, eqe eqeVar) {
        super(8);
        this.b = eqeVar;
        this.c = i;
        this.d = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kma)) {
            return false;
        }
        kma kmaVar = (kma) obj;
        return tpa.f(this.b, kmaVar.b) && this.c == kmaVar.c && tpa.f(this.d, kmaVar.d);
    }

    public final int hashCode() {
        int iE = k7d.e(this.c, this.b.hashCode() * 31, 31);
        jqe jqeVar = this.d;
        return iE + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.b + ", icon=" + this.c + ", description=" + this.d + ")";
    }
}
