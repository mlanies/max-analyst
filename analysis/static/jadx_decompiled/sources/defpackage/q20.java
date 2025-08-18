package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class q20 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ r20 b;

    public /* synthetic */ q20(r20 r20Var, int i) {
        this.a = i;
        this.b = r20Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ValueAnimator valueAnimator = this.b.p;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    break;
                }
                break;
            default:
                ValueAnimator valueAnimator2 = this.b.p;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                    break;
                }
                break;
        }
    }
}
