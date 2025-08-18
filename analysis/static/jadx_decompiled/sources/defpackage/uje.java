package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class uje implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vje b;

    public /* synthetic */ uje(vje vjeVar, int i) {
        this.a = i;
        this.b = vjeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vje vjeVar = this.b;
                vjeVar.o = null;
                vjeVar.c();
                break;
            default:
                this.b.c();
                break;
        }
    }
}
