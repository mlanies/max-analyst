package defpackage;

/* loaded from: classes.dex */
public final class f0f {
    public static final f0f d = new f0f(new qk9());
    public static final String e;
    public static final String f;
    public static final String g;
    public final int a;
    public final boolean b;
    public final boolean c;

    static {
        int i = oaf.a;
        e = Integer.toString(1, 36);
        f = Integer.toString(2, 36);
        g = Integer.toString(3, 36);
    }

    public f0f(qk9 qk9Var) {
        this.a = qk9Var.a;
        this.b = qk9Var.b;
        this.c = qk9Var.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f0f.class != obj.getClass()) {
            return false;
        }
        f0f f0fVar = (f0f) obj;
        return this.a == f0fVar.a && this.b == f0fVar.b && this.c == f0fVar.c;
    }

    public final int hashCode() {
        return ((((this.a + 31) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0);
    }
}
