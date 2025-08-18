package defpackage;

/* loaded from: classes.dex */
public final class c38 extends n2 {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public c38(e38 e38Var, t28 t28Var) {
        super(e38Var);
        this.c = t28Var;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        switch (this.b) {
            case 0:
                this.a.a(new n28(b38Var, (b7b) this.c, 1));
                break;
            default:
                this.a.a(new iq1(b38Var, 4, (f38) this.c));
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c38(e38 e38Var) {
        super(e38Var);
        yb9 yb9Var = ft.g;
        this.c = yb9Var;
    }
}
