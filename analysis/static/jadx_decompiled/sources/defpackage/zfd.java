package defpackage;

/* loaded from: classes2.dex */
public final class zfd extends bgd {
    public final String a;
    public final jqe b;

    public zfd(String str, eqe eqeVar) {
        this.a = str;
        this.b = eqeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfd)) {
            return false;
        }
        zfd zfdVar = (zfd) obj;
        return tpa.f(this.a, zfdVar.a) && tpa.f(this.b, zfdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CopyToClipboard(textToCopy=" + this.a + ", snackbarTitle=" + this.b + ")";
    }
}
