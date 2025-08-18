package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ij9 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lj9 b;

    public /* synthetic */ ij9(lj9 lj9Var, int i) {
        this.a = i;
        this.b = lj9Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        lj9 lj9Var = this.b;
        switch (this.a) {
            case 0:
                lj9Var.getClass();
                hm9.k("lj9", "hideControls");
                hkf hkfVarA = lj9Var.z0.a();
                hkfVarA.a = false;
                hkf hkfVar = new hkf(hkfVarA);
                lj9Var.z0 = hkfVar;
                ((pl9) ((kk9) lj9Var.b)).d(hkfVar);
                kj9 kj9Var = lj9Var.u0;
                if (kj9Var != null) {
                    kj9Var.r(false);
                    break;
                }
                break;
            case 1:
                fef fefVar = (fef) obj;
                g8c g8cVar = lj9Var.B0;
                if (g8cVar != null) {
                    g8cVar.d = fefVar;
                    hm9.n("g8c", "sendVideoRePlayStat");
                    int i = g8cVar.b;
                    g8cVar.f("replay", null, null, null, i == 1, g8cVar.a(), i == 5, i == 3 ? "auto" : null);
                }
                String str = lj9Var.A0.d;
                ((bq7) lj9Var.c).s(fefVar, lj9Var);
                hkf hkfVarA2 = lj9Var.z0.a();
                hkfVarA2.n = fefVar;
                hkfVarA2.p = null;
                hkfVarA2.q = null;
                hkf hkfVar2 = new hkf(hkfVarA2);
                lj9Var.z0 = hkfVar2;
                pl9 pl9Var = (pl9) ((kk9) lj9Var.b);
                pl9Var.d(hkfVar2);
                lj9Var.n2();
                pl9Var.b(lj9Var);
                break;
            case 2:
                lj9Var.d2((Throwable) obj);
                break;
            case 3:
                lj9Var.getClass();
                hkf hkfVarA3 = lj9Var.z0.a();
                k20 k20Var = lj9Var.A0;
                m7b m7bVar = lj9Var.t0;
                hkfVarA3.h = s5c.a0(m7bVar, k20Var);
                hkf hkfVar3 = new hkf(hkfVarA3);
                lj9Var.z0 = hkfVar3;
                ((pl9) ((kk9) lj9Var.b)).d(hkfVar3);
                if (!s5c.Q(m7bVar, lj9Var.A0)) {
                    cqc.b(lj9Var.F0);
                    lj9Var.i2();
                    break;
                }
                break;
            default:
                hkf hkfVarA4 = lj9Var.z0.a();
                bq7 bq7Var = (bq7) lj9Var.c;
                hkfVarA4.k = bq7Var.f();
                hkfVarA4.l = bq7Var.d();
                hkfVarA4.q = null;
                hkfVarA4.p = null;
                hkf hkfVar4 = new hkf(hkfVarA4);
                lj9Var.z0 = hkfVar4;
                ((pl9) ((kk9) lj9Var.b)).d(hkfVar4);
                break;
        }
    }
}
