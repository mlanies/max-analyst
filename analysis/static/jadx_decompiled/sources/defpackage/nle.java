package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class nle implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lme b;
    public final /* synthetic */ pke c;

    public /* synthetic */ nle(lme lmeVar, pke pkeVar, int i) {
        this.a = i;
        this.b = lmeVar;
        this.c = pkeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.g(this.c);
                break;
            case 1:
                this.b.g(this.c);
                break;
            default:
                this.b.g(this.c);
                break;
        }
    }
}
