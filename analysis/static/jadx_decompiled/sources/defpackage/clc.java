package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class clc implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ elc b;
    public final /* synthetic */ long c;

    public /* synthetic */ clc(elc elcVar, long j, int i) {
        this.a = i;
        this.b = elcVar;
        this.c = j;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        la2 la2VarE;
        switch (this.a) {
            case 0:
                elc elcVar = this.b;
                yrc yrcVarA = elcVar.d().a(this.c);
                if (yrcVarA == null || (la2VarE = elcVar.c().e(yrcVarA.b)) == null) {
                    return null;
                }
                return elcVar.a(la2VarE);
            default:
                long j = this.c;
                elc elcVar2 = this.b;
                dt2 dt2VarC = elcVar2.c();
                ilc ilcVar = dt2VarC.a;
                ilcVar.c();
                try {
                    dt2.c(dt2VarC, j);
                    ilcVar.r();
                    ilcVar.l();
                    ((t19) elcVar2.d.getValue()).e(j);
                    xrc xrcVarD = elcVar2.d();
                    ilc ilcVar2 = xrcVarD.a;
                    ilcVar2.b();
                    zkc zkcVar = xrcVarD.c;
                    q36 q36VarF = zkcVar.f();
                    q36VarF.j(1, j);
                    try {
                        ilcVar2.c();
                        try {
                            q36VarF.n();
                            ilcVar2.r();
                            zkcVar.t(q36VarF);
                            return e5f.a;
                        } finally {
                            ilcVar2.l();
                        }
                    } catch (Throwable th) {
                        zkcVar.t(q36VarF);
                        throw th;
                    }
                } catch (Throwable th2) {
                    ilcVar.l();
                    throw th2;
                }
        }
    }
}
