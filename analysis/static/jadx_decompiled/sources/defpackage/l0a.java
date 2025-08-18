package defpackage;

/* loaded from: classes.dex */
public final class l0a implements f2a, zl4 {
    public final /* synthetic */ int a;
    public zl4 b;
    public final Object c;

    public /* synthetic */ l0a(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }

    private final void a(Object obj) {
    }

    private final void d(Object obj) {
    }

    @Override // defpackage.f2a
    public final void b() {
        switch (this.a) {
            case 0:
                ((f2a) this.c).b();
                break;
            default:
                ((ab3) this.c).b();
                break;
        }
    }

    @Override // defpackage.f2a
    public final void c(zl4 zl4Var) {
        switch (this.a) {
            case 0:
                this.b = zl4Var;
                ((f2a) this.c).c(this);
                break;
            default:
                this.b = zl4Var;
                ((ab3) this.c).c(this);
                break;
        }
    }

    @Override // defpackage.f2a
    public final void e(Object obj) {
        int i = this.a;
    }

    @Override // defpackage.zl4
    public final void g() {
        switch (this.a) {
            case 0:
                this.b.g();
                break;
            default:
                this.b.g();
                break;
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        switch (this.a) {
        }
        return this.b.h();
    }

    @Override // defpackage.f2a
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                ((f2a) this.c).onError(th);
                break;
            default:
                ((ab3) this.c).onError(th);
                break;
        }
    }
}
