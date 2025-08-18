package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class eee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ iee b;

    public /* synthetic */ eee(iee ieeVar, int i) {
        this.a = i;
        this.b = ieeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                iee ieeVar = this.b;
                ieeVar.getClass();
                ju0.D().execute(new eee(ieeVar, 1));
                break;
            default:
                iee ieeVar2 = this.b;
                if (!ieeVar2.n) {
                    ieeVar2.e();
                    break;
                }
                break;
        }
    }
}
