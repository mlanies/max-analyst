package defpackage;

/* loaded from: classes.dex */
public final class mc4 implements la5 {
    public final /* synthetic */ int a = 1;
    public final Object b;

    public mc4(int i) {
        if ((i & 1) != 0) {
            this.b = new krd(65496, 2, "image/jpeg");
        } else {
            this.b = new q97();
        }
    }

    private final void a() {
    }

    private final void b(long j, long j2) {
    }

    @Override // defpackage.la5
    public final void S(pa5 pa5Var) {
        switch (this.a) {
            case 0:
                yze yzeVarMo6B = pa5Var.mo6B(0, 3);
                pa5Var.J(new wd0(-9223372036854775807L));
                pa5Var.w();
                qy5 qy5Var = (qy5) this.b;
                ny5 ny5VarA = qy5Var.a();
                ny5VarA.m = ia9.l("text/x-unknown");
                ny5VarA.i = qy5Var.n;
                yzeVarMo6B.e(new qy5(ny5VarA));
                break;
            default:
                ((la5) this.b).S(pa5Var);
                break;
        }
    }

    @Override // defpackage.la5
    public final void d(long j, long j2) {
        switch (this.a) {
            case 0:
                break;
            default:
                ((la5) this.b).d(j, j2);
                break;
        }
    }

    @Override // defpackage.la5
    public final int g(na5 na5Var, lh4 lh4Var) {
        switch (this.a) {
            case 0:
                return ((sa4) na5Var).g(Integer.MAX_VALUE) == -1 ? -1 : 0;
            default:
                return ((la5) this.b).g(na5Var, lh4Var);
        }
    }

    @Override // defpackage.la5
    public final boolean n(na5 na5Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return ((la5) this.b).n(na5Var);
        }
    }

    @Override // defpackage.la5
    public final void release() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((la5) this.b).release();
                break;
        }
    }

    public mc4(qy5 qy5Var) {
        this.b = qy5Var;
    }
}
