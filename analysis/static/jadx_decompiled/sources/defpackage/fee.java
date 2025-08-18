package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class fee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hee b;

    public /* synthetic */ fee(hee heeVar, int i) {
        this.a = i;
        this.b = heeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                this.b.b();
                break;
            default:
                hee heeVar = this.b;
                kee keeVar = heeVar.q;
                if (keeVar != null) {
                    keeVar.m();
                }
                if (heeVar.p == null) {
                    heeVar.o.c();
                    break;
                }
                break;
        }
    }
}
