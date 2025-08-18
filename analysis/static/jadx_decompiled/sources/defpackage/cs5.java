package defpackage;

/* loaded from: classes.dex */
public final class cs5 extends p0 {
    public final Object X;
    public final /* synthetic */ int c;
    public final boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs5(wq5 wq5Var, Object obj, int i) {
        super(wq5Var);
        this.c = i;
        this.X = obj;
        this.o = true;
    }

    @Override // defpackage.wq5
    public final void g(vae vaeVar) {
        switch (this.c) {
            case 0:
                this.b.c(new bs5(vaeVar, this.X, this.o));
                break;
            default:
                xtc xtcVarA = ((ztc) this.X).a();
                fs5 fs5Var = new fs5(vaeVar, xtcVarA, this.b, this.o);
                vaeVar.f(fs5Var);
                xtcVarA.b(fs5Var);
                break;
        }
    }
}
