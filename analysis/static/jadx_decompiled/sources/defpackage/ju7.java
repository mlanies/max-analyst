package defpackage;

/* loaded from: classes2.dex */
public final class ju7 extends ol implements lme {
    public final String o;

    public ju7(long j, String str) {
        super(j);
        this.o = str;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new su(this.a, 8));
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        pl plVar = this.c;
        if (plVar == null) {
            plVar = null;
        }
        plVar.b().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        lu7 lu7Var = new lu7(sla.w0);
        String str = this.o;
        if (str != null && str.length() != 0) {
            lu7Var.p("pushToken", str);
        }
        return lu7Var;
    }
}
