package defpackage;

/* loaded from: classes2.dex */
public final class xia implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yia b;

    public /* synthetic */ xia(yia yiaVar, int i) {
        this.a = i;
        this.b = yiaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.invalidate();
                break;
            default:
                this.b.invalidate();
                break;
        }
    }
}
