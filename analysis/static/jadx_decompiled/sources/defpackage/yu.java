package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class yu implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tf2 b;

    public /* synthetic */ yu(tf2 tf2Var, int i) {
        this.a = i;
        this.b = tf2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dv dvVar = this.b.Z;
                break;
            default:
                dv dvVar2 = this.b.Z;
                if (dvVar2 != null) {
                    ((gi2) dvVar2).k();
                    break;
                }
                break;
        }
    }
}
