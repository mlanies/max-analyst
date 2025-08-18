package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class za5 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cb5 b;

    public /* synthetic */ za5(cb5 cb5Var, int i) {
        this.a = i;
        this.b = cb5Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                n31 n31Var = n31.a;
                oqa oqaVar = (oqa) n31Var.getAccessor().c(oqa.class);
                os1 os1VarC = n31Var.c();
                cb5 cb5Var = this.b;
                return new t1b(oqaVar, (kr1) cb5Var.e.getValue(), os1VarC, new o9g(15, cb5Var), yi1.b());
            default:
                return (ugf) this.b.b().Y.getValue();
        }
    }
}
