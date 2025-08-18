package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class wu6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zu6 b;

    public /* synthetic */ wu6(zu6 zu6Var, int i) {
        this.a = i;
        this.b = zu6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        zu6 zu6Var = this.b;
        switch (i) {
            case 0:
                zu6Var.k();
                break;
            default:
                zu6Var.w();
                break;
        }
    }
}
