package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class bq6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ zl4 o;

    public /* synthetic */ bq6(zl4 zl4Var, float f, long j, int i) {
        this.a = i;
        this.o = zl4Var;
        this.b = f;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zl4 zl4Var = this.o;
        switch (this.a) {
            case 0:
                cq6 cq6Var = (cq6) zl4Var;
                if (!cq6Var.Y.get()) {
                    long jNanoTime = System.nanoTime();
                    long j = cq6Var.Z;
                    float f = this.b;
                    if (j == 0 || Math.abs(jNanoTime - j) > 1000000000) {
                        cq6Var.Z = jNanoTime;
                        hm9.m("dq6", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f), Long.valueOf(this.c));
                    }
                    cq6Var.X.e(new zp6(f, false));
                    break;
                }
                break;
            default:
                tq6 tq6Var = (tq6) zl4Var;
                if (!tq6Var.s0.get()) {
                    long jNanoTime2 = System.nanoTime();
                    long j2 = tq6Var.t0;
                    float f2 = this.b;
                    long j3 = this.c;
                    if (j2 == 0 || Math.abs(jNanoTime2 - j2) > 1000000000) {
                        tq6Var.t0 = jNanoTime2;
                        hm9.m("uq6", "onFileUploadProgress: progress=%f, total %d", Float.valueOf(f2), Long.valueOf(j3));
                    }
                    tq6Var.Z.e(new sq6(false, null, f2, j3));
                    break;
                }
                break;
        }
    }
}
