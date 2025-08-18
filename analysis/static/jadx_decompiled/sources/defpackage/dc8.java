package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class dc8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc8 b;

    public /* synthetic */ dc8(hc8 hc8Var, int i) {
        this.a = i;
        this.b = hc8Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                uc7 uc7Var = (uc7) this.b.d.invoke();
                if (uc7Var != null) {
                    uc7Var.m();
                }
                break;
            default:
                hc8 hc8Var = this.b;
                hc8Var.a();
                hc8Var.l = false;
                break;
        }
        return e5f.a;
    }
}
