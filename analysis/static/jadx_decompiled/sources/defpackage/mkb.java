package defpackage;

/* loaded from: classes2.dex */
public final class mkb extends ka1 {
    public final long b;
    public final hdb c;
    public final boolean d;
    public final String e;

    public mkb(long j, hdb hdbVar, boolean z, String str) {
        super(11);
        this.b = j;
        this.c = hdbVar;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mkb)) {
            return false;
        }
        mkb mkbVar = (mkb) obj;
        return this.b == mkbVar.b && this.c == mkbVar.c && this.d == mkbVar.d && tpa.f(this.e, mkbVar.e);
    }

    public final int hashCode() {
        int iD = ms2.d((this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31, 31, this.d);
        String str = this.e;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OpenCall(id=" + this.b + ", type=" + this.c + ", isVideo=" + this.d + ", joinLink=" + this.e + ")";
    }
}
