package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hm1 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ mm1 b;

    public /* synthetic */ hm1(mm1 mm1Var, int i) {
        this.a = i;
        this.b = mm1Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                mm1.B(this.b);
                return e5f.a;
            case 1:
                return this.b.R0;
            case 2:
                return this.b.U0;
            case 3:
                return this.b.R0;
            case 4:
                nnf nnfVar = nnf.a;
                mm1 mm1Var = this.b;
                return new af1(nnfVar, new lm1(mm1Var), new hm1(mm1Var, 1), new hm1(mm1Var, 2), null, 34);
            default:
                return this.b.R0;
        }
    }
}
