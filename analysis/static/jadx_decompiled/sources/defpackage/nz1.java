package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class nz1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hqc b;

    public /* synthetic */ nz1(hqc hqcVar, int i) {
        this.a = i;
        this.b = hqcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.a();
                break;
            case 1:
                hqc hqcVar = this.b;
                if (hqcVar != null) {
                    hqcVar.a();
                    break;
                }
                break;
            default:
                this.b.a();
                break;
        }
    }
}
