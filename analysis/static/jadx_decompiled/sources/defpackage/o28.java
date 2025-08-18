package defpackage;

/* loaded from: classes.dex */
public final class o28 extends f28 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ o28(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.f28
    public final void g(b38 b38Var) {
        switch (this.a) {
            case 0:
                ((iqd) this.b).k(new n28(b38Var, (b7b) this.c, 0));
                break;
            case 1:
                ((f38) this.b).a(new r28(b38Var, (b66) this.c, 0));
                break;
            default:
                ((iqd) this.b).k(new r28(b38Var, (b66) this.c, 1));
                break;
        }
    }
}
