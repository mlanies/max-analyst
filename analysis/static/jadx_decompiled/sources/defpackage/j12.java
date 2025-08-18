package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class j12 implements xff {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd6 b;

    public /* synthetic */ j12(gd6 gd6Var, int i) {
        this.a = i;
        this.b = gd6Var;
    }

    @Override // defpackage.xff
    public final void run() {
        int i = this.a;
        gd6 gd6Var = this.b;
        switch (i) {
            case 0:
                gd6Var.flush();
                break;
            default:
                gd6Var.b();
                break;
        }
    }
}
