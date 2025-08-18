package defpackage;

/* loaded from: classes2.dex */
public final class np4 {
    public final fp4 a;
    public final String b;
    public final long c;
    public final int d;
    public final i20 e;

    public np4(fp4 fp4Var, String str, long j, int i, i20 i20Var) {
        this.a = fp4Var;
        this.b = str;
        this.c = j;
        this.d = i;
        this.e = i20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof np4)) {
            return false;
        }
        np4 np4Var = (np4) obj;
        return tpa.f(this.a, np4Var.a) && tpa.f(this.b, np4Var.b) && this.c == np4Var.c && this.d == np4Var.d && tpa.f(this.e, np4Var.e);
    }

    public final int hashCode() {
        int iG = ey8.g(this.d, h4f.m(rh4.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        i20 i20Var = this.e;
        return iG + (i20Var == null ? 0 : i20Var.hashCode());
    }

    public final String toString() {
        return "DraftUploadDb(draftMediaUploadKey=" + this.a + ", path=" + this.b + ", lastModified=" + this.c + ", uploadType=" + h4f.t(this.d) + ", videoConvertOptions=" + this.e + ")";
    }
}
