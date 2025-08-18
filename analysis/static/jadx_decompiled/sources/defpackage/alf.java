package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class alf implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ aab b;
    public final /* synthetic */ n54 c;

    public /* synthetic */ alf(aab aabVar, n54 n54Var, int i) {
        this.a = i;
        this.b = aabVar;
        this.c = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                aab aabVar = this.b;
                aabVar.getClass();
                int i = oaf.a;
                u75 u75Var = ((o75) aabVar.b).a;
                u75Var.getClass();
                i74 i74Var = u75Var.D0;
                fd fdVarF = i74Var.F();
                i74Var.I(fdVarF, 1015, new w64(fdVarF, this.c, 1));
                break;
            default:
                aab aabVar2 = this.b;
                n54 n54Var = this.c;
                aabVar2.getClass();
                synchronized (n54Var) {
                }
                o75 o75Var = (o75) aabVar2.b;
                int i2 = oaf.a;
                i74 i74Var2 = o75Var.a.D0;
                fd fdVarG = i74Var2.g((yj8) i74Var2.o.X);
                i74Var2.I(fdVarG, 1020, new f9(fdVarG, 29, n54Var));
                break;
        }
    }
}
