package defpackage;

/* loaded from: classes.dex */
public final class rs3 extends zi0 {
    public final long A0;
    public final k13 B0;
    public long C0;
    public volatile boolean D0;
    public boolean E0;
    public final int z0;

    public rs3(t24 t24Var, a34 a34Var, qy5 qy5Var, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, k13 k13Var) {
        super(t24Var, a34Var, qy5Var, i, obj, j, j2, j3, j4, j5);
        this.z0 = i2;
        this.A0 = j6;
        this.B0 = k13Var;
    }

    @Override // defpackage.go7
    public final void a() {
        this.D0 = true;
    }

    @Override // defpackage.g78
    public final long b() {
        return this.u0 + this.z0;
    }

    @Override // defpackage.g78
    public final boolean c() {
        return this.E0;
    }

    public final void e(qz7 qz7Var) {
        qy5 qy5Var = this.o;
        if (ia9.i(qy5Var.m)) {
            int i = qy5Var.I;
            int i2 = qy5Var.J;
            if ((i <= 1 && i2 <= 1) || i == -1 || i2 == -1) {
                return;
            }
            yze yzeVarY = qz7Var.Y(4);
            int i3 = i * i2;
            long j = (this.s0 - this.Z) / i3;
            for (int i4 = 1; i4 < i3; i4++) {
                yzeVarY.b(new wpa(), 0, 0);
                yzeVarY.a(i4 * j, 0, 0, 0, null);
            }
        }
    }

    @Override // defpackage.go7
    public final void load() {
        qz7 qz7Var = this.x0;
        fm9.l(qz7Var);
        if (this.C0 == 0) {
            long j = this.A0;
            for (erc ercVar : (erc[]) qz7Var.c) {
                if (ercVar.F != j) {
                    ercVar.F = j;
                    ercVar.z = true;
                }
            }
            k13 k13Var = this.B0;
            long j2 = this.v0;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.A0;
            long j4 = this.w0;
            ((xu0) k13Var).b(qz7Var, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.A0);
        }
        try {
            a34 a34VarB = this.b.b(this.C0);
            u1e u1eVar = this.t0;
            sa4 sa4Var = new sa4(u1eVar, a34VarB.f, u1eVar.G(a34VarB));
            while (!this.D0) {
                try {
                    int iG = ((xu0) this.B0).a.g(sa4Var, xu0.v0);
                    fm9.k(iG != 1);
                    if (!(iG == 0)) {
                        break;
                    }
                } finally {
                    this.C0 = sa4Var.o - this.b.f;
                }
            }
            e(qz7Var);
            this.C0 = sa4Var.o - this.b.f;
            mr0.i(this.t0);
            this.E0 = !this.D0;
        } catch (Throwable th) {
            mr0.i(this.t0);
            throw th;
        }
    }
}
