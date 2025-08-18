package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class zd4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lq1 b;

    public /* synthetic */ zd4(lq1 lq1Var, int i) {
        this.a = i;
        this.b = lq1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
                break;
            default:
                this.b.b(null);
                break;
        }
    }
}
