package defpackage;

/* loaded from: classes.dex */
public final class tp1 implements up1 {
    public final gg1 a;
    public final jqe b;
    public final jqe c;
    public final uc0 d;
    public final String e;
    public final long f;

    public tp1(gg1 gg1Var, iqe iqeVar, iqe iqeVar2, uc0 uc0Var, String str, long j) {
        this.a = gg1Var;
        this.b = iqeVar;
        this.c = iqeVar2;
        this.d = uc0Var;
        this.e = str;
        this.f = j;
    }

    @Override // defpackage.up1
    public final long a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp1)) {
            return false;
        }
        tp1 tp1Var = (tp1) obj;
        return tpa.f(this.a, tp1Var.a) && tpa.f(this.b, tp1Var.b) && tpa.f(this.c, tp1Var.c) && tpa.f(this.d, tp1Var.d) && tpa.f(this.e, tp1Var.e) && this.f == tp1Var.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + k7d.f(k7d.f(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        String str = this.e;
        return Long.hashCode(this.f) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "Single(id=" + this.a + ", title=" + this.b + ", subtitle=" + this.c + ", avatarAbbreviationModel=" + this.d + ", url=" + this.e + ", lastUpdate=" + this.f + ")";
    }
}
