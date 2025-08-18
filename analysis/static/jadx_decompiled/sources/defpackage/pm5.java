package defpackage;

/* loaded from: classes.dex */
public class pm5 implements u1d {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public pm5(qm5 qm5Var, long j) {
        this.c = qm5Var;
        this.b = j;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        switch (this.a) {
            case 0:
                qm5 qm5Var = (qm5) this.c;
                np8.g((va8) qm5Var.l);
                va8 va8Var = (va8) qm5Var.l;
                long[] jArr = (long[]) va8Var.b;
                int iF = maf.f(jArr, maf.k((qm5Var.f * j) / 1000000, 0L, qm5Var.k - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long[] jArr2 = (long[]) va8Var.c;
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i = qm5Var.f;
                long j4 = (j2 * 1000000) / i;
                long j5 = this.b;
                y1d y1dVar = new y1d(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new s1d(y1dVar, y1dVar);
                }
                int i2 = iF + 1;
                return new s1d(y1dVar, new y1d((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
            default:
                return (s1d) this.c;
        }
    }

    @Override // defpackage.u1d
    public final long f() {
        switch (this.a) {
            case 0:
                return ((qm5) this.c).c();
            default:
                return this.b;
        }
    }

    public pm5(long j) {
        this(j, 0L);
    }

    public pm5(long j, long j2) {
        this.b = j;
        y1d y1dVar = j2 == 0 ? y1d.c : new y1d(0L, j2);
        this.c = new s1d(y1dVar, y1dVar);
    }
}
