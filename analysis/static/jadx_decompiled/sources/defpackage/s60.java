package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class s60 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qz7 b;
    public final /* synthetic */ a70 c;

    public /* synthetic */ s60(qz7 qz7Var, a70 a70Var, int i) {
        this.a = i;
        this.b = qz7Var;
        this.c = a70Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final a70 a70Var = this.c;
        qz7 qz7Var = this.b;
        int i = this.a;
        qz7Var.getClass();
        switch (i) {
            case 0:
                int i2 = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                final fd fdVarF = i74Var.F();
                final int i3 = 1;
                i74Var.I(fdVarF, 1032, new km7() { // from class: y64
                    @Override // defpackage.km7
                    public final void invoke(Object obj) {
                        gd gdVar = (gd) obj;
                        switch (i3) {
                            case 0:
                                gdVar.P(fdVarF, a70Var);
                                break;
                            default:
                                gdVar.h0(fdVarF, a70Var);
                                break;
                        }
                    }
                });
                break;
            default:
                int i4 = oaf.a;
                i74 i74Var2 = ((o75) qz7Var.c).a.D0;
                final fd fdVarF2 = i74Var2.F();
                final int i5 = 0;
                i74Var2.I(fdVarF2, 1031, new km7() { // from class: y64
                    @Override // defpackage.km7
                    public final void invoke(Object obj) {
                        gd gdVar = (gd) obj;
                        switch (i5) {
                            case 0:
                                gdVar.P(fdVarF2, a70Var);
                                break;
                            default:
                                gdVar.h0(fdVarF2, a70Var);
                                break;
                        }
                    }
                });
                break;
        }
    }
}
