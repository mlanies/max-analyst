package defpackage;

/* loaded from: classes2.dex */
public final class ohb extends phb {
    public final jqe a;
    public final int b;

    public ohb(int i, eqe eqeVar) {
        this.a = eqeVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohb)) {
            return false;
        }
        ohb ohbVar = (ohb) obj;
        return tpa.f(this.a, ohbVar.a) && this.b == ohbVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowSuccessSnackbar(title=" + this.a + ", icon=" + this.b + ")";
    }
}
