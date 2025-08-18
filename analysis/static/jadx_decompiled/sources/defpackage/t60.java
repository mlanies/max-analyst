package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class t60 implements Runnable {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long o;

    public /* synthetic */ t60(int i, int i2, long j, long j2, Object obj) {
        this.a = i2;
        this.X = obj;
        this.b = i;
        this.c = j;
        this.o = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.X;
        switch (this.a) {
            case 0:
                ph4 ph4Var = (ph4) obj;
                ph4Var.getClass();
                int i = maf.a;
                h74 h74Var = ((n75) ph4Var.b).a.C0;
                ed edVarP = h74Var.P();
                h74Var.Q(edVarP, 1011, new yv3(edVarP, this.b, this.c, this.o, 14));
                break;
            case 1:
                qz7 qz7Var = (qz7) obj;
                qz7Var.getClass();
                int i2 = oaf.a;
                i74 i74Var = ((o75) qz7Var.c).a.D0;
                final fd fdVarF = i74Var.F();
                final int i3 = this.b;
                final long j = this.c;
                final long j2 = this.o;
                i74Var.I(fdVarF, 1011, new km7() { // from class: o64
                    @Override // defpackage.km7
                    public final void invoke(Object obj2) {
                        ((gd) obj2).o0(fdVarF, i3, j, j2);
                    }
                });
                break;
            case 2:
                h74 h74Var2 = ((eg0) obj).b;
                z23 z23Var = h74Var2.o;
                ed edVarJ = h74Var2.J(((zw6) z23Var.a).isEmpty() ? null : (xj8) mqd.m((zw6) z23Var.a));
                h74Var2.Q(edVarJ, 1006, new yv3(edVarJ, this.b, this.c, this.o, 25));
                break;
            default:
                i74 i74Var2 = ((fg0) obj).b;
                ai3 ai3Var = i74Var2.o;
                fd fdVarG = i74Var2.g(((zw6) ai3Var.b).isEmpty() ? null : (yj8) mqd.m((zw6) ai3Var.b));
                i74Var2.I(fdVarG, 1006, new e74(fdVarG, this.b, this.c, this.o));
                break;
        }
    }
}
