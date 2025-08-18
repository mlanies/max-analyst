package defpackage;

/* loaded from: classes.dex */
public final class i28 extends wq5 {
    public final /* synthetic */ int b;
    public final f38[] c;

    public /* synthetic */ i28(f38[] f38VarArr, int i) {
        this.b = i;
        this.c = f38VarArr;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        switch (this.b) {
            case 0:
                h28 h28Var = new h28(vaeVar, this.c);
                vaeVar.f(h28Var);
                h28Var.d();
                break;
            default:
                f38[] f38VarArr = this.c;
                int length = f38VarArr.length;
                w28 w28Var = new w28(vaeVar, length, length <= wq5.a ? new x28(length) : new v28());
                vaeVar.f(w28Var);
                az azVar = w28Var.X;
                for (f38 f38Var : f38VarArr) {
                    if (!w28Var.Z && azVar.get() == null) {
                        f38Var.a(w28Var);
                    }
                }
                break;
        }
    }
}
