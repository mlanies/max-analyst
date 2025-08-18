package defpackage;

/* loaded from: classes.dex */
public final class i38 extends cg4 implements b38, erd {
    public final /* synthetic */ int c;
    public zl4 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i38(f2a f2aVar, int i) {
        super(f2aVar);
        this.c = i;
    }

    @Override // defpackage.b38, defpackage.ab3
    public void b() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.a.b();
    }

    @Override // defpackage.b38, defpackage.erd
    public final void c(zl4 zl4Var) {
        switch (this.c) {
            case 0:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.a.c(this);
                    break;
                }
                break;
            default:
                if (dm4.f(this.o, zl4Var)) {
                    this.o = zl4Var;
                    this.a.c(this);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.cg4, defpackage.zl4
    public final void g() {
        switch (this.c) {
            case 0:
                super.g();
                this.o.g();
                break;
            default:
                super.g();
                this.o.g();
                break;
        }
    }

    @Override // defpackage.b38, defpackage.erd
    public final void onError(Throwable th) {
        switch (this.c) {
            case 0:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.a.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
            default:
                if ((get() & 54) == 0) {
                    lazySet(2);
                    this.a.onError(th);
                    break;
                } else {
                    j47.Z(th);
                    break;
                }
        }
    }
}
