package defpackage;

/* loaded from: classes.dex */
public final class spc implements ab3, erd, b38 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ry1 b;

    public /* synthetic */ spc(sy1 sy1Var, int i) {
        this.a = i;
        this.b = sy1Var;
    }

    @Override // defpackage.erd
    public void a(Object obj) {
        switch (this.a) {
            case 1:
                this.b.resumeWith(obj);
                break;
            default:
                this.b.resumeWith(obj);
                break;
        }
    }

    @Override // defpackage.ab3
    public void b() {
        switch (this.a) {
            case 0:
                this.b.resumeWith(e5f.a);
                break;
            default:
                this.b.resumeWith(null);
                break;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                ((sy1) this.b).d(new rpc(0, zl4Var));
                break;
            case 1:
                ((sy1) this.b).d(new rpc(0, zl4Var));
                break;
            default:
                ((sy1) this.b).d(new rpc(0, zl4Var));
                break;
        }
    }

    @Override // defpackage.ab3, defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.b.resumeWith(new njc(th));
                break;
            case 1:
                this.b.resumeWith(new njc(th));
                break;
            default:
                this.b.resumeWith(new njc(th));
                break;
        }
    }
}
