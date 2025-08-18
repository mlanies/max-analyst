package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class wf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xf4 b;

    public /* synthetic */ wf4(xf4 xf4Var, int i) {
        this.a = i;
        this.b = xf4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        xf4 xf4Var = this.b;
        switch (i) {
            case 0:
                xf4Var.getClass();
                try {
                    xf4Var.e.get();
                    xf4.m.decrementAndGet();
                    xf4.l.get();
                    xf4Var.toString();
                    return;
                } catch (Exception e) {
                    xf4Var.toString();
                    synchronized (xf4Var.a) {
                        throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", xf4Var, Boolean.valueOf(xf4Var.c), Integer.valueOf(xf4Var.b)), e);
                    }
                }
            case 1:
                xf4Var.a();
                return;
            default:
                xf4Var.b();
                return;
        }
    }

    public /* synthetic */ wf4(xf4 xf4Var, String str) {
        this.a = 0;
        this.b = xf4Var;
    }
}
