package defpackage;

/* loaded from: classes.dex */
public final class xp1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uge b;

    public /* synthetic */ xp1(uge ugeVar, uge ugeVar2, int i) {
        this.a = i;
        this.b = ugeVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.d();
                break;
            case 1:
                this.b.d();
                break;
            default:
                this.b.d();
                break;
        }
    }
}
