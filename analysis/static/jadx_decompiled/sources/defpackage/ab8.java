package defpackage;

/* loaded from: classes.dex */
public abstract class ab8 implements su0 {
    public static final wa8 Y;
    public final boolean X;
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean o;

    static {
        new za8().b();
        Y = new wa8(1);
    }

    public ab8(za8 za8Var) {
        this.a = za8Var.a;
        this.b = za8Var.b;
        this.c = za8Var.c;
        this.o = za8Var.d;
        this.X = za8Var.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab8)) {
            return false;
        }
        ab8 ab8Var = (ab8) obj;
        return this.a == ab8Var.a && this.b == ab8Var.b && this.c == ab8Var.c && this.o == ab8Var.o && this.X == ab8Var.X;
    }

    public final int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.b;
        return ((((((i + ((int) ((j2 >>> 32) ^ j2))) * 31) + (this.c ? 1 : 0)) * 31) + (this.o ? 1 : 0)) * 31) + (this.X ? 1 : 0);
    }
}
