package defpackage;

/* loaded from: classes.dex */
public final class vi6 {
    public static final aw0 d = oq9.j(":");
    public static final aw0 e = oq9.j(":status");
    public static final aw0 f = oq9.j(":method");
    public static final aw0 g = oq9.j(":path");
    public static final aw0 h = oq9.j(":scheme");
    public static final aw0 i = oq9.j(":authority");
    public final int a;
    public final aw0 b;
    public final aw0 c;

    public vi6(aw0 aw0Var, aw0 aw0Var2) {
        this.b = aw0Var;
        this.c = aw0Var2;
        this.a = aw0Var2.c() + aw0Var.c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vi6)) {
            return false;
        }
        vi6 vi6Var = (vi6) obj;
        return tpa.f(this.b, vi6Var.b) && tpa.f(this.c, vi6Var.c);
    }

    public final int hashCode() {
        aw0 aw0Var = this.b;
        int iHashCode = (aw0Var != null ? aw0Var.hashCode() : 0) * 31;
        aw0 aw0Var2 = this.c;
        return iHashCode + (aw0Var2 != null ? aw0Var2.hashCode() : 0);
    }

    public final String toString() {
        return this.b.j() + ": " + this.c.j();
    }

    public vi6(aw0 aw0Var, String str) {
        aw0 aw0Var2 = new aw0(str.getBytes(a52.a));
        aw0Var2.b = str;
        this(aw0Var, aw0Var2);
    }

    public vi6(String str, String str2) {
        aw0 aw0Var = new aw0(str.getBytes(a52.a));
        aw0Var.b = str;
        aw0 aw0Var2 = new aw0(str2.getBytes(a52.a));
        aw0Var2.b = str2;
        this(aw0Var, aw0Var2);
    }
}
