package defpackage;

/* loaded from: classes2.dex */
public final class t0b extends ol implements lme {
    public final boolean o;

    public t0b(long j, boolean z) {
        super(j);
        this.o = z;
    }

    @Override // defpackage.lme
    public final void e(gle gleVar) {
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
        gs9 gs9Var = new gs9((sla) null, 2);
        gs9Var.d("interactive", this.o);
        return gs9Var;
    }
}
