package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class i55 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Runnable b;

    public /* synthetic */ i55(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.run();
                break;
            case 1:
                this.b.run();
                break;
            case 2:
                this.b.run();
                break;
            default:
                this.b.run();
                break;
        }
        return e5f.a;
    }
}
