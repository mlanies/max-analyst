package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ree b;
    public final /* synthetic */ cc0 c;

    public /* synthetic */ nee(ree reeVar, cc0 cc0Var, int i) {
        this.a = i;
        this.b = reeVar;
        this.c = cc0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
