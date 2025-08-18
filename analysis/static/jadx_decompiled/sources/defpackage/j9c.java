package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class j9c implements b7b, b66 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k9c b;

    public /* synthetic */ j9c(k9c k9cVar, int i) {
        this.a = i;
        this.b = k9cVar;
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 4:
                k9c k9cVar = this.b;
                k9cVar.getClass();
                return new sa3(1, new p00(k9cVar, 7, (uj3) obj));
            default:
                k9c k9cVar2 = this.b;
                k9cVar2.getClass();
                return new sa3(1, new p00(k9cVar2, 8, (e52) obj));
        }
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        uj3 uj3VarL;
        uj3 uj3VarL2;
        uj3 uj3VarL3;
        es8 es8Var;
        switch (this.a) {
            case 0:
                e52 e52VarF = this.b.a.F(((uj3) obj).n());
                if (e52VarF == null || e52VarF.b.Y == 0) {
                }
                break;
            case 1:
                e52 e52Var = (e52) obj;
                if (this.b.a.P(e52Var) || e52Var.b.Z == 0 || !e52Var.M() || ((uj3VarL = e52Var.l()) != null && uj3VarL.s())) {
                }
                break;
            case 2:
                e52 e52Var2 = (e52) obj;
                this.b.getClass();
                if (e52Var2.b.Y == 0 || ((uj3VarL2 = e52Var2.l()) != null && uj3VarL2.s())) {
                }
                break;
            case 3:
                e52 e52Var3 = (e52) obj;
                this.b.getClass();
                if (!e52Var3.M() || (((uj3VarL3 = e52Var3.l()) != null && uj3VarL3.s()) || !e52Var3.b.g() || (es8Var = e52Var3.c) == null || es8Var.a.x())) {
                }
                break;
            default:
                uj3 uj3Var = (uj3) obj;
                this.b.getClass();
                if (uj3Var.a.c.r == 0 || uj3Var.s()) {
                }
                break;
        }
        return false;
    }
}
