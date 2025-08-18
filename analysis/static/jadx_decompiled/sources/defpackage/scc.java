package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class scc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ adc b;
    public final /* synthetic */ nb0 c;

    public /* synthetic */ scc(adc adcVar, nb0 nb0Var, int i) {
        this.a = i;
        this.b = adcVar;
        this.c = nb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.t(this.c);
                break;
            default:
                adc adcVar = this.b;
                if (adcVar.q == this.c && !adcVar.r) {
                    if (adcVar.n()) {
                        adcVar.H.k();
                    }
                    n05 n05Var = adcVar.F;
                    if (n05Var == null) {
                        adcVar.d0 = true;
                        break;
                    } else {
                        ((d15) n05Var).k();
                        nb0 nb0Var = adcVar.q;
                        nb0Var.n(new ukf(nb0Var.s0, adcVar.k()));
                        break;
                    }
                }
                break;
        }
    }
}
