package defpackage;

/* loaded from: classes.dex */
public final class s28 extends n2 {
    public final /* synthetic */ int b;
    public final b66 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s28(f38 f38Var, b66 b66Var, int i) {
        super(f38Var);
        this.b = i;
        this.c = b66Var;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        switch (this.b) {
            case 0:
                this.a.a(new g28(b38Var, this.c));
                break;
            default:
                this.a.a(new cb3(b38Var, 1, this.c));
                break;
        }
    }
}
