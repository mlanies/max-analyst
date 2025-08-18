package defpackage;

/* loaded from: classes.dex */
public final class es5 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;

    public es5(long j, xae xaeVar) {
        this.c = xaeVar;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((xae) this.c).j(this.b);
                break;
            default:
                ((a2a) this.c).a(this.b);
                break;
        }
    }

    public es5(long j, a2a a2aVar) {
        this.b = j;
        this.c = a2aVar;
    }
}
