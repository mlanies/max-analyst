package defpackage;

/* loaded from: classes.dex */
public final class qs3 extends yi0 {
    public final long A0;
    public final wu0 B0;
    public long C0;
    public volatile boolean D0;
    public boolean E0;
    public final int z0;

    public qs3(r24 r24Var, z24 z24Var, oy5 oy5Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, wu0 wu0Var) {
        super(r24Var, z24Var, oy5Var, i, obj, j, j2, j3, j4, j5);
        this.z0 = i2;
        this.A0 = j6;
        this.B0 = wu0Var;
    }

    @Override // defpackage.fo7
    public final void a() {
        this.D0 = true;
    }

    @Override // defpackage.f78
    public final long b() {
        return this.u0 + this.z0;
    }

    @Override // defpackage.f78
    public final boolean c() {
        return this.E0;
    }

    @Override // defpackage.fo7
    public final void load() {
        if (this.C0 == 0) {
            ph4 ph4Var = this.x0;
            np8.g(ph4Var);
            long j = this.A0;
            for (drc drcVar : (drc[]) ph4Var.b) {
                if (drcVar.F != j) {
                    drcVar.F = j;
                    drcVar.z = true;
                }
            }
            wu0 wu0Var = this.B0;
            long j2 = this.v0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.A0;
            long j4 = this.w0;
            wu0Var.b(ph4Var, j3, j4 != -9223372036854775807L ? j4 - this.A0 : -9223372036854775807L);
        }
        try {
            z24 z24VarB = this.b.b(this.C0);
            t1e t1eVar = this.t0;
            ra4 ra4Var = new ra4(t1eVar, z24VarB.f, t1eVar.L(z24VarB));
            while (!this.D0) {
                try {
                    int i = this.B0.a.i(ra4Var, wu0.u0);
                    np8.f(i != 1);
                    if (!(i == 0)) {
                        break;
                    }
                } finally {
                    this.C0 = ra4Var.o - this.b.f;
                }
            }
            kq0.f(this.t0);
            this.E0 = !this.D0;
        } catch (Throwable th) {
            kq0.f(this.t0);
            throw th;
        }
    }
}
