package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class zbe implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q40 b;

    public /* synthetic */ zbe(q40 q40Var, int i) {
        this.a = i;
        this.b = q40Var;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        uj3 uj3Var = (uj3) obj;
        switch (this.a) {
            case 0:
                if (!uj3Var.t()) {
                    this.b.getClass();
                }
                return true;
            case 1:
                return this.b.p(uj3Var, "@");
            case 2:
                return this.b.p(uj3Var, "@");
            default:
                if (!uj3Var.t()) {
                    this.b.getClass();
                }
                return true;
        }
    }
}
