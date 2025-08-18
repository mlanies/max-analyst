package defpackage;

/* loaded from: classes.dex */
public final class ui4 {
    public static final ui4 e = new sv0(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    static {
        int i2 = oaf.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public ui4(sv0 sv0Var) {
        this.a = sv0Var.b;
        this.b = sv0Var.c;
        this.c = sv0Var.d;
        this.d = (String) sv0Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ui4)) {
            return false;
        }
        ui4 ui4Var = (ui4) obj;
        return this.a == ui4Var.a && this.b == ui4Var.b && this.c == ui4Var.c && oaf.a(this.d, ui4Var.d);
    }

    public final int hashCode() {
        int i2 = (((((527 + this.a) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        return i2 + (str == null ? 0 : str.hashCode());
    }
}
