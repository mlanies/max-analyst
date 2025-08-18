package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class ld5 implements kde {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ld5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kde
    public final Object get() {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return new q28(((hc5) ((md5) obj).a.get()).a(), new ta4(25), 3);
            default:
                ml0 ml0Var = ((v7g) obj).d;
                hm9.n("v7g", "getWorkManager: enable = " + ml0Var.A());
                Boolean bool = (Boolean) ml0Var.A();
                if (bool != null && bool.booleanValue()) {
                    return qy9.m(Boolean.TRUE);
                }
                hm9.n("v7g", "waiting for enable ...");
                return ml0Var;
        }
    }
}
