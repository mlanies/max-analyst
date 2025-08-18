package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class uo1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ap1 b;

    public /* synthetic */ uo1(ap1 ap1Var, int i) {
        this.a = i;
        this.b = ap1Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ap1.x(this.b);
            case 1:
                k56 k56Var = this.b.Q0;
                if (k56Var != null) {
                    return (ugf) k56Var.invoke();
                }
                return null;
            default:
                return ap1.C(this.b);
        }
    }
}
