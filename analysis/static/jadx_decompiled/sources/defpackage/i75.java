package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class i75 implements mm7, km7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u75 b;

    public /* synthetic */ i75(u75 u75Var, int i) {
        this.a = i;
        this.b = u75Var;
    }

    @Override // defpackage.mm7
    public void d(Object obj, tm5 tm5Var) {
        u75 u75Var = this.b;
        u75Var.getClass();
        ((n3b) obj).Y(u75Var.Z, new l3b(tm5Var));
    }

    @Override // defpackage.km7
    public void invoke(Object obj) {
        n3b n3bVar = (n3b) obj;
        switch (this.a) {
            case 1:
                n3bVar.c0(this.b.Z0);
                break;
            default:
                n3bVar.q0(this.b.X0);
                break;
        }
    }
}
