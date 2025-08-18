package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class hl5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ il5 b;

    public /* synthetic */ hl5(il5 il5Var, int i) {
        this.a = i;
        this.b = il5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            default:
                this.b.a();
                break;
        }
    }
}
