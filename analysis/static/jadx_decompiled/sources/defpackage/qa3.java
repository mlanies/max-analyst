package defpackage;

/* loaded from: classes.dex */
public final class qa3 extends pa3 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qa3(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.pa3
    public final void j(ab3 ab3Var) {
        switch (this.a) {
            case 0:
                ((pa3) this.b).i(new iq1(ab3Var, 1, (pa3) this.c));
                break;
            case 1:
                ((pa3) this.b).i(new y7g(this, ab3Var, false, 11));
                break;
            default:
                iq1 iq1Var = new iq1(ab3Var, 7, (b66) this.c);
                ab3Var.c(iq1Var);
                ((iqd) this.b).k(iq1Var);
                break;
        }
    }
}
