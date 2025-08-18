package defpackage;

/* loaded from: classes.dex */
public final class p0f {
    public static final p0f b;
    public static final String c;
    public final zw6 a;

    static {
        ls5 ls5Var = zw6.b;
        b = new p0f(ffc.X);
        int i = oaf.a;
        c = Integer.toString(0, 36);
    }

    public p0f(ffc ffcVar) {
        this.a = zw6.j(ffcVar);
    }

    public final zw6 a() {
        return this.a;
    }

    public final boolean b(int i) {
        int i2 = 0;
        while (true) {
            zw6 zw6Var = this.a;
            if (i2 >= zw6Var.size()) {
                return false;
            }
            o0f o0fVar = (o0f) zw6Var.get(i2);
            if (o0fVar.f() && o0fVar.e() == i) {
                return true;
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p0f.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((p0f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
