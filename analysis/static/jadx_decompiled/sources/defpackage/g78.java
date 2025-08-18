package defpackage;

/* loaded from: classes.dex */
public abstract class g78 extends j13 {
    public final long u0;

    public g78(t24 t24Var, a34 a34Var, qy5 qy5Var, int i, Object obj, long j, long j2, long j3) {
        super(t24Var, a34Var, 1, qy5Var, i, obj, j, j2);
        qy5Var.getClass();
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
