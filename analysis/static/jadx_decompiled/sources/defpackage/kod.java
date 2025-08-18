package defpackage;

/* loaded from: classes2.dex */
public final class kod implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ood b;

    public /* synthetic */ kod(ood oodVar, int i) {
        this.a = i;
        this.b = oodVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.requestLayout();
                break;
            default:
                ood oodVar = this.b;
                oodVar.p1 = false;
                oodVar.b();
                break;
        }
    }
}
