package defpackage;

import android.os.SystemClock;

/* loaded from: classes.dex */
public final class qj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sj0 b;

    public /* synthetic */ qj0(sj0 sj0Var, int i) {
        this.a = i;
        this.b = sj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sj0 sj0Var = this.b;
                if (sj0Var.o > 0) {
                    SystemClock.uptimeMillis();
                }
                sj0Var.setVisibility(0);
                break;
            default:
                sj0 sj0Var2 = this.b;
                ((jq4) sj0Var2.getCurrentDrawable()).d(false, false, true);
                if ((sj0Var2.getProgressDrawable() == null || !sj0Var2.getProgressDrawable().isVisible()) && (sj0Var2.getIndeterminateDrawable() == null || !sj0Var2.getIndeterminateDrawable().isVisible())) {
                    sj0Var2.setVisibility(4);
                }
                sj0Var2.getClass();
                break;
        }
    }
}
