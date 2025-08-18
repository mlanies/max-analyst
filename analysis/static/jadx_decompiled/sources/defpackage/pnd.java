package defpackage;

/* loaded from: classes2.dex */
public final class pnd implements s29 {
    public final jqe a;
    public final int b;
    public final jqe c;

    public pnd(jqe jqeVar, int i, eqe eqeVar, int i2) {
        i = (i2 & 2) != 0 ? woc.I : i;
        eqeVar = (i2 & 4) != 0 ? null : eqeVar;
        this.a = jqeVar;
        this.b = i;
        this.c = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pnd)) {
            return false;
        }
        pnd pndVar = (pnd) obj;
        return tpa.f(this.a, pndVar.a) && this.b == pndVar.b && tpa.f(this.c, pndVar.c);
    }

    public final int hashCode() {
        int iE = k7d.e(this.b, this.a.hashCode() * 31, 31);
        jqe jqeVar = this.c;
        return iE + (jqeVar == null ? 0 : jqeVar.hashCode());
    }

    public final String toString() {
        return "ShowSnackbar(text=" + this.a + ", icon=" + this.b + ", description=" + this.c + ")";
    }
}
