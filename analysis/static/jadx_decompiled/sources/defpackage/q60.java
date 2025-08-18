package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class q60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ q60(qz7 qz7Var, n54 n54Var, int i) {
        this.a = i;
        this.b = qz7Var;
        this.c = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qz7 qz7Var = this.b;
                qz7Var.getClass();
                int i = oaf.a;
                u75 u75Var = ((o75) qz7Var.c).a;
                u75Var.getClass();
                i74 i74Var = u75Var.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1007, new w64(fdVarF, this.c, 2));
                break;
            default:
                qz7 qz7Var2 = this.b;
                n54 n54Var = this.c;
                qz7Var2.getClass();
                synchronized (n54Var) {
                }
                o75 o75Var = (o75) qz7Var2.c;
                int i2 = oaf.a;
                i74 i74Var2 = o75Var.a.D0;
                fd fdVarG = i74Var2.g((yj8) i74Var2.o.X);
                i74Var2.I(fdVarG, 1013, new w64(fdVarG, n54Var, 0));
                break;
        }
    }
}
