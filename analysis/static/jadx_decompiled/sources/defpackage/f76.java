package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class f76 implements mq1, wu {
    public final /* synthetic */ int a;
    public final /* synthetic */ bm7 b;

    public /* synthetic */ f76(bm7 bm7Var, int i) {
        this.a = i;
        this.b = bm7Var;
    }

    @Override // defpackage.wu
    public bm7 apply(Object obj) {
        switch (this.a) {
            case 2:
                return ((ov1) this.b.get()).a();
            default:
                return ((ov1) this.b.get()).b();
        }
    }

    @Override // defpackage.mq1
    public String q(lq1 lq1Var) {
        switch (this.a) {
            case 0:
                zd4 zd4Var = new zd4(lq1Var, 1);
                ok4 ok4VarK = ju0.k();
                bm7 bm7Var = this.b;
                bm7Var.d(zd4Var, ok4VarK);
                return "transformVoidFuture [" + bm7Var + "]";
            default:
                ok4 ok4VarK2 = ju0.k();
                bm7 bm7Var2 = this.b;
                kq0.z(false, bm7Var2, lq1Var, ok4VarK2);
                return "nonCancellationPropagating[" + bm7Var2 + "]";
        }
    }
}
