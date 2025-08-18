package defpackage;

/* loaded from: classes2.dex */
public final class lp4 {
    public final ep4 a;
    public final String b;
    public final long c;
    public final int d;
    public final ref e;

    public lp4(ep4 ep4Var, String str, long j, int i, ref refVar) {
        this.a = ep4Var;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = refVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lp4)) {
            return false;
        }
        lp4 lp4Var = (lp4) obj;
        return tpa.f(this.a, lp4Var.a) && tpa.f(this.b, lp4Var.b) && this.c == lp4Var.c && this.d == lp4Var.d && tpa.f(this.e, lp4Var.e);
    }

    public final int hashCode() {
        int iG = ey8.g(this.d, h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        ref refVar = this.e;
        return iG + (refVar == null ? 0 : refVar.hashCode());
    }

    public final String toString() {
        return "DraftUpload(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + h4f.t(this.d) + ", videoConvertOptions=" + this.e + ")";
    }
}
