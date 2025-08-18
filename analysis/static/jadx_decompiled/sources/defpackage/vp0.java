package defpackage;

/* loaded from: classes.dex */
public final class vp0 implements la5 {
    public final /* synthetic */ int a;
    public final krd b;

    public vp0(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new krd(35152, 2, "image/png");
                break;
            default:
                this.b = new krd(16973, 2, "image/bmp");
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        switch (this.a) {
            case 0:
                this.b.S(pa5Var);
                break;
            default:
                this.b.S(pa5Var);
                break;
        }
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                this.b.d(j, j2);
                break;
            default:
                this.b.d(j, j2);
                break;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        switch (this.a) {
        }
        return this.b.g(na5Var, lh4Var);
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        switch (this.a) {
        }
        return this.b.n(na5Var);
    }

    @Override // defpackage.la5
    public final void release() {
        int i = this.a;
    }
}
