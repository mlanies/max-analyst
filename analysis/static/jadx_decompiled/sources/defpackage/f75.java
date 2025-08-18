package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class f75 implements km7, pj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gd8 b;

    public /* synthetic */ f75(gd8 gd8Var, int i) {
        this.a = i;
        this.b = gd8Var;
    }

    @Override // defpackage.pj3
    public void accept(Object obj) {
        ((x4b) obj).n0(this.b);
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 0:
                n3bVar.b0(this.b);
                break;
            default:
                n3bVar.c0(this.b);
                break;
        }
    }
}
