package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zkf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wva b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ zkf(wva wvaVar, n54 n54Var, int i) {
        this.a = i;
        this.b = wvaVar;
        this.c = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                wva wvaVar = this.b;
                n54 n54Var = this.c;
                wvaVar.getClass();
                synchronized (n54Var) {
                }
                n75 n75Var = (n75) wvaVar.c;
                int i = maf.a;
                h74 h74Var = n75Var.a.C0;
                h74Var.Q(h74Var.J((xj8) h74Var.o.e), 1020, new v64(9));
                break;
            default:
                wva wvaVar2 = this.b;
                wvaVar2.getClass();
                int i2 = maf.a;
                t75 t75Var = ((n75) wvaVar2.c).a;
                t75Var.getClass();
                h74 h74Var2 = t75Var.C0;
                ed edVarP = h74Var2.P();
                h74Var2.Q(edVarP, 1015, new v64(edVarP, 5, this.c));
                break;
        }
    }
}
