package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class y60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph4 b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ y60(ph4 ph4Var, n54 n54Var, int i) {
        this.a = i;
        this.b = ph4Var;
        this.c = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ph4 ph4Var = this.b;
                ph4Var.getClass();
                int i = maf.a;
                t75 t75Var = ((n75) ph4Var.b).a;
                t75Var.getClass();
                h74 h74Var = t75Var.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1007, new b74(edVarP, this.c, 2));
                break;
            default:
                ph4 ph4Var2 = this.b;
                n54 n54Var = this.c;
                ph4Var2.getClass();
                synchronized (n54Var) {
                }
                n75 n75Var = (n75) ph4Var2.b;
                int i2 = maf.a;
                h74 h74Var2 = n75Var.a.C0;
                h74Var2.Q(h74Var2.J((xj8) h74Var2.o.e), 1013, new v64(10));
                break;
        }
    }
}
