package defpackage;

/* loaded from: classes.dex */
public abstract class f78 extends h13 {
    public final long u0;

    public f78(r24 r24Var, z24 z24Var, oy5 oy5Var, int i, Object obj, long j, long j2, long j3) {
        super(r24Var, z24Var, 1, oy5Var, i, obj, j, j2);
        oy5Var.getClass();
        this.u0 = j3;
    }

    public long b() {
        long j = this.u0;
        if (j != -1) {
            return 1 + j;
        }
        return -1L;
    }

    public abstract boolean c();
}
