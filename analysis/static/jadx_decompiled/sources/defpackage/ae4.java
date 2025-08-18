package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class ae4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ see b;

    public /* synthetic */ ae4(see seeVar, int i) {
        this.a = i;
        this.b = seeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            default:
                this.b.g.cancel(true);
                break;
        }
    }
}
