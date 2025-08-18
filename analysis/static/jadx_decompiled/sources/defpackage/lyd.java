package defpackage;

/* loaded from: classes.dex */
public final class lyd {
    public final kyd a;
    public final boolean b;
    public final boolean c;
    public final k56 d;

    public lyd(kyd kydVar, boolean z, boolean z2, k56 k56Var) {
        this.a = kydVar;
        this.b = z;
        this.c = z2;
        this.d = k56Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lyd)) {
            return false;
        }
        lyd lydVar = (lyd) obj;
        return tpa.f(this.a, lydVar.a) && this.b == lydVar.b && this.c == lydVar.c && tpa.f(this.d, lydVar.d);
    }

    public final int hashCode() {
        int iD = ms2.d(ms2.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        k56 k56Var = this.d;
        return iD + (k56Var == null ? 0 : k56Var.hashCode());
    }

    public final String toString() {
        return "StartCallParams(type=" + this.a + ", isVideo=" + this.b + ", isAudio=" + this.c + ", callbackPrepare=" + this.d + ")";
    }
}
