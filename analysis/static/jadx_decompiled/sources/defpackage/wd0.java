package defpackage;

/* loaded from: classes.dex */
public class wd0 implements v1d {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public /* synthetic */ wd0(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    @Override // defpackage.v1d
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        switch (this.a) {
            case 0:
                xd0 xd0Var = (xd0) this.c;
                t1d t1dVarB = xd0Var.t0[0].b(j);
                int i = 1;
                while (true) {
                    n13[] n13VarArr = xd0Var.t0;
                    if (i >= n13VarArr.length) {
                        return t1dVarB;
                    }
                    t1d t1dVarB2 = n13VarArr[i].b(j);
                    if (t1dVarB2.a.b < t1dVarB.a.b) {
                        t1dVarB = t1dVarB2;
                    }
                    i++;
                }
            case 1:
                qm5 qm5Var = (qm5) this.c;
                fm9.l((h7b) qm5Var.l);
                h7b h7bVar = (h7b) qm5Var.l;
                long[] jArr = (long[]) h7bVar.b;
                int iF = oaf.f(jArr, oaf.k((qm5Var.f * j) / 1000000, 0L, qm5Var.k - 1), false);
                long j2 = iF == -1 ? 0L : jArr[iF];
                long[] jArr2 = (long[]) h7bVar.c;
                long j3 = iF != -1 ? jArr2[iF] : 0L;
                int i2 = qm5Var.f;
                long j4 = (j2 * 1000000) / i2;
                long j5 = this.b;
                z1d z1dVar = new z1d(j4, j3 + j5);
                if (j4 == j || iF == jArr.length - 1) {
                    return new t1d(z1dVar, z1dVar);
                }
                int i3 = iF + 1;
                return new t1d(z1dVar, new z1d((jArr[i3] * 1000000) / i2, j5 + jArr2[i3]));
            default:
                return (t1d) this.c;
        }
    }

    @Override // defpackage.v1d
    public final long f() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((qm5) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public wd0(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public wd0(long j, long j2) {
        this.a = 2;
        this.b = j;
        z1d z1dVar = j2 == 0 ? z1d.c : new z1d(0L, j2);
        this.c = new t1d(z1dVar, z1dVar);
    }
}
