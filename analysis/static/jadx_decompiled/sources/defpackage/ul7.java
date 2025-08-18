package defpackage;

/* loaded from: classes.dex */
public final class ul7 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl7 b;

    public /* synthetic */ ul7(wl7 wl7Var, int i) {
        this.a = i;
        this.b = wl7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                es4 es4Var = this.b.c;
                if (es4Var != null) {
                    es4Var.setListSelectionHidden(true);
                    es4Var.requestLayout();
                    break;
                }
                break;
            default:
                wl7 wl7Var = this.b;
                es4 es4Var2 = wl7Var.c;
                if (es4Var2 != null && es4Var2.isAttachedToWindow() && wl7Var.c.getCount() > wl7Var.c.getChildCount() && wl7Var.c.getChildCount() <= wl7Var.x0) {
                    wl7Var.K0.setInputMethodMode(2);
                    wl7Var.f();
                    break;
                }
                break;
        }
    }
}
