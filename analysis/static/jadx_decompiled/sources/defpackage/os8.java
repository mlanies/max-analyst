package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class os8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ts8 b;

    public /* synthetic */ os8(ts8 ts8Var, int i) {
        this.a = i;
        this.b = ts8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        ts8 ts8Var = this.b;
        switch (i) {
            case 0:
                ts8Var.setCornersForCollage(ts8Var.u0);
                break;
            default:
                ts8Var.N();
                break;
        }
    }
}
