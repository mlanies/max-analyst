package defpackage;

/* loaded from: classes2.dex */
public final class zc9 {
    public final cd9 a;
    public final String b;
    public final String c;
    public final id9 d;
    public final kp e;
    public final pd9 f;

    public zc9(cd9 cd9Var, String str, String str2, id9 id9Var, kp kpVar, pd9 pd9Var) {
        this.a = cd9Var;
        this.b = str;
        this.c = str2;
        this.d = id9Var;
        this.e = kpVar;
        this.f = pd9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zc9)) {
            return false;
        }
        zc9 zc9Var = (zc9) obj;
        return tpa.f(this.a, zc9Var.a) && tpa.f(this.b, zc9Var.b) && tpa.f(this.c, zc9Var.c) && this.d == zc9Var.d && tpa.f(this.e, zc9Var.e) && tpa.f(this.f, zc9Var.f);
    }

    public final int hashCode() {
        return this.f.a.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + rh4.d(rh4.d(Long.hashCode(this.a.a) * 31, 31, this.b), 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "Movie(movieId=" + this.a + ", externalMovieId=" + this.b + ", title=" + this.c + ", sourceType=" + this.d + ", duration=" + this.e + ", thumbnail=" + this.f + ")";
    }
}
