package defpackage;

/* loaded from: classes.dex */
public final class sse implements dab {
    public final /* synthetic */ int a;
    public final dab b;
    public final Object c;

    public /* synthetic */ sse(dab dabVar, Object obj, int i) {
        this.a = i;
        this.b = dabVar;
        this.c = obj;
    }

    @Override // defpackage.dab
    public final void a(fi0 fi0Var, eab eabVar) {
        switch (this.a) {
            case 0:
                f46.I();
                oj0 oj0Var = (oj0) eabVar;
                oj0Var.w0.v.getClass();
                ip7 ip7Var = new ip7(fi0Var, oj0Var.c, eabVar, this);
                oj0Var.a(new xq6(ip7Var, 4, this));
                ((aab) this.c).g(ip7Var);
                break;
            default:
                this.b.a(new tr0(this, fi0Var, eabVar), eabVar);
                break;
        }
    }
}
