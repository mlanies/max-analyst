package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class w60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ Exception c;

    public /* synthetic */ w60(qz7 qz7Var, Exception exc, int i) {
        this.a = i;
        this.b = qz7Var;
        this.c = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Exception exc = this.c;
        qz7 qz7Var = this.b;
        int i = this.a;
        qz7Var.getClass();
        switch (i) {
            case 0:
                int i2 = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1029, new v64(fdVarF, 18, exc));
                break;
            default:
                int i3 = oaf.a;
                i74 i74Var2 = ((o75) qz7Var.c).a.D0;
                fd fdVarF2 = i74Var2.F();
                i74Var2.I(fdVarF2, 1014, new v64(fdVarF2, 22, exc));
                break;
        }
    }
}
