package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* loaded from: classes2.dex */
public final class cc2 extends ol implements lme {
    public final long X;
    public final long Y;
    public final long Z;
    public final long o;
    public final String s0;
    public final int t0;
    public final long u0;
    public final int v0;
    public final long w0;
    public final boolean x0;
    public final boolean y0;
    public final mg4 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cc2(long j, long j2, long j3, long j4, long j5, String str, int i, int i2, long j6, mg4 mg4Var, int i3) {
        super(j);
        String str2 = (i3 & 32) != 0 ? null : str;
        int i4 = (i3 & 64) != 0 ? 0 : i;
        int i5 = (i3 & 256) != 0 ? 0 : i2;
        long j7 = (i3 & 512) != 0 ? 0L : j6;
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
        this.s0 = str2;
        this.t0 = i4;
        this.u0 = 0L;
        this.v0 = i5;
        this.w0 = j7;
        this.x0 = false;
        this.y0 = true;
        this.z0 = mg4Var;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) throws Throwable {
        une uneVarJ;
        dc2 dc2Var = (dc2) gleVar;
        try {
            j47.f0(hz4.a, new bc2(this, dc2Var, null));
        } catch (TamErrorException unused) {
            String name = cc2.class.getName();
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.s0, name, "fail to get missed contacts for chat history", null);
            }
        }
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        ((jc2) plVar.T.getValue()).a(this.a, this.o, this.Y, this.t0, this.u0, this.v0, this.w0, dc2Var, this.z0);
        long j = this.Z;
        if (j == 0 || (uneVarJ = t().j(j)) == null) {
            return;
        }
        pl plVar2 = this.c;
        if (plVar2 == null) {
            plVar2 = null;
        }
        ((s8g) plVar2.g.getValue()).a((q9d) uneVarJ.f);
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        uj3 uj3VarL;
        if ("not.found".equals(pkeVar.b)) {
            e52 e52VarC = m().C(this.o);
            if (e52VarC != null && e52VarC.M() && (uj3VarL = e52VarC.l()) != null) {
                n().o(uj3VarL.n());
            }
        } else {
            l().c(new oi0(this.a, pkeVar));
        }
        long j = this.Z;
        if (j != 0) {
            if (pkeVar instanceof gke) {
                t().n(j, goe.c);
            } else {
                t().d(j);
            }
        }
    }

    @Override // defpackage.ol
    public final dle i() {
        return new au(this.X, this.Y, this.t0, this.u0, this.v0, this.w0, this.x0, this.y0, this.s0, this.z0);
    }
}
