package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class iw3 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rj3 b;

    public /* synthetic */ iw3(rj3 rj3Var, int i) {
        this.a = i;
        this.b = rj3Var;
    }

    @Override // defpackage.qj3
    public final void accept(Object obj) {
        int i = this.a;
        rj3 rj3Var = this.b;
        switch (i) {
            case 0:
                rj3Var.accept((String) obj);
                break;
            default:
                rj3Var.accept((Throwable) obj);
                break;
        }
    }
}
