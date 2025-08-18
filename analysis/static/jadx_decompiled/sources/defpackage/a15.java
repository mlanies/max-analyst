package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class a15 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o05 b;

    public /* synthetic */ a15(o05 o05Var, int i) {
        this.a = i;
        this.b = o05Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        o05 o05Var = this.b;
        switch (i) {
            case 0:
                o05Var.getClass();
                break;
            default:
                o05Var.d();
                break;
        }
    }
}
