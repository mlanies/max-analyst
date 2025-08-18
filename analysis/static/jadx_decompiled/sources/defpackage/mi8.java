package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class mi8 implements ri8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;
    public final /* synthetic */ int c;

    public /* synthetic */ mi8(si8 si8Var, int i, int i2) {
        this.a = i2;
        this.b = si8Var;
        this.c = i;
    }

    @Override // defpackage.ri8
    public final void b(oh8 oh8Var) {
        switch (this.a) {
            case 0:
                this.b.f.s.setRepeatMode(gf7.s(this.c));
                break;
            default:
                this.b.f.s.w(gf7.u(this.c));
                break;
        }
    }
}
