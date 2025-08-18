package defpackage;

/* loaded from: classes.dex */
public final class lrd extends yi0 {
    public final oy5 A0;
    public long B0;
    public boolean C0;
    public final int z0;

    public lrd(r24 r24Var, z24 z24Var, oy5 oy5Var, int i, Object obj, long j, long j2, long j3, int i2, oy5 oy5Var2) {
        super(r24Var, z24Var, oy5Var, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.z0 = i2;
        this.A0 = oy5Var2;
    }

    @Override // defpackage.fo7
    public final void a() {
    }

    @Override // defpackage.f78
    public final boolean c() {
        return this.C0;
    }

    @Override // defpackage.fo7
    public final void load() {
        xze dt4Var;
        t1e t1eVar = this.t0;
        ph4 ph4Var = this.x0;
        np8.g(ph4Var);
        drc[] drcVarArr = (drc[]) ph4Var.b;
        for (drc drcVar : drcVarArr) {
            if (drcVar.F != 0) {
                drcVar.F = 0L;
                drcVar.z = true;
            }
        }
        int i = 0;
        while (true) {
            int[] iArr = (int[]) ph4Var.a;
            if (i >= iArr.length) {
                dt4Var = new dt4();
                break;
            }
            if (this.z0 == iArr[i]) {
                dt4Var = drcVarArr[i];
                break;
            }
            i++;
        }
        xze xzeVar = dt4Var;
        xzeVar.d(this.A0);
        try {
            long jL = t1eVar.L(this.b.b(this.B0));
            if (jL != -1) {
                jL += this.B0;
            }
            l24 ra4Var = new ra4(this.t0, this.B0, jL);
            for (int iA = 0; iA != -1; iA = xzeVar.a(ra4Var, Integer.MAX_VALUE, true)) {
                this.B0 += iA;
            }
            xzeVar.b(this.Z, 1, (int) this.B0, 0, null);
            kq0.f(t1eVar);
            this.C0 = true;
        } catch (Throwable th) {
            kq0.f(t1eVar);
            throw th;
        }
    }
}
