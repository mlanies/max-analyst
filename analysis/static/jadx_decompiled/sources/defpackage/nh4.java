package defpackage;

/* loaded from: classes.dex */
public final class nh4 {
    public final lqb a;
    public final int b;
    public final int c;

    public nh4(int i, int i2, Class cls) {
        this(lqb.a(cls), i, i2);
    }

    public static nh4 a(Class cls) {
        return new nh4(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nh4)) {
            return false;
        }
        nh4 nh4Var = (nh4) obj;
        return this.a.equals(nh4Var.a) && this.b == nh4Var.b && this.c == nh4Var.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        int i2 = this.c;
        if (i2 == 0) {
            str = "direct";
        } else if (i2 == 1) {
            str = "provider";
        } else {
            if (i2 != 2) {
                throw new AssertionError(zr6.h(i2, "Unsupported injection: "));
            }
            str = "deferred";
        }
        return zr6.l(sb, str, "}");
    }

    public nh4(lqb lqbVar, int i, int i2) {
        this.a = lqbVar;
        this.b = i;
        this.c = i2;
    }
}
