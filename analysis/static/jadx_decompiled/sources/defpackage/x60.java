package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class x60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ph4 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ x60(ph4 ph4Var, Exception exc, int i) {
        this.a = i;
        this.b = ph4Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.c;
        ph4 ph4Var = this.b;
        int i = this.a;
        ph4Var.getClass();
        switch (i) {
            case 0:
                int i2 = maf.a;
                h74 h74Var = ((n75) ph4Var.b).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1029, new b74(edVarP, exc, 26));
                break;
            default:
                int i3 = maf.a;
                h74 h74Var2 = ((n75) ph4Var.b).a.C0;
                ed edVarP2 = h74Var2.P();
                h74Var2.Q(edVarP2, 1014, new v64(edVarP2, 21, exc));
                break;
        }
    }
}
