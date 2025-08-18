package defpackage;

/* loaded from: classes.dex */
public final class mrd extends zi0 {
    public final qy5 A0;
    public long B0;
    public boolean C0;
    public final int z0;

    public mrd(t24 t24Var, a34 a34Var, qy5 qy5Var, int i, Object obj, long j, long j2, long j3, int i2, qy5 qy5Var2) {
        super(t24Var, a34Var, qy5Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.z0 = i2;
        this.A0 = qy5Var2;
    }

    @Override // defpackage.go7
    public final void a() {
    }

    @Override // defpackage.g78
    public final boolean c() {
        return this.C0;
    }

    @Override // defpackage.go7
    public final void load() {
        u1e u1eVar = this.t0;
        qz7 qz7Var = this.x0;
        fm9.l(qz7Var);
        for (erc ercVar : (erc[]) qz7Var.c) {
            if (ercVar.F != 0) {
                ercVar.F = 0L;
                ercVar.z = true;
            }
        }
        yze yzeVarY = qz7Var.Y(this.z0);
        yzeVarY.e(this.A0);
        try {
            long jG = u1eVar.G(this.b.b(this.B0));
            if (jG != -1) {
                jG += this.B0;
            }
            sa4 sa4Var = new sa4(this.t0, this.B0, jG);
            for (int iC = 0; iC != -1; iC = yzeVarY.c(sa4Var, Integer.MAX_VALUE, true)) {
                this.B0 += iC;
            }
            yzeVarY.a(this.Z, 1, (int) this.B0, 0, null);
            mr0.i(u1eVar);
            this.C0 = true;
        } catch (Throwable th) {
            mr0.i(u1eVar);
            throw th;
        }
    }
}
