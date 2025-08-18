package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class li8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si8 b;
    public final /* synthetic */ x4b c;

    public /* synthetic */ li8(si8 si8Var, x4b x4bVar, int i) {
        this.a = i;
        this.b = si8Var;
        this.c = x4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si8 si8Var = this.b;
                si8Var.getClass();
                x4b x4bVar = this.c;
                si8Var.j.c(x4bVar.j());
                si8Var.h.F(x4bVar.s().a(17) ? x4bVar.x0() : mue.a);
                break;
            default:
                si8 si8Var2 = this.b;
                si8Var2.getClass();
                si8Var2.j.c(this.c.j());
                break;
        }
    }
}
