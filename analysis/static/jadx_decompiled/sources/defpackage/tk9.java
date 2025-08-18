package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes2.dex */
public final class tk9 extends kp {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ tk9(int i, Object obj) {
        this.e = i;
        this.f = obj;
    }

    @Override // defpackage.kp
    public final void p() {
        switch (this.e) {
            case 0:
                uk9 uk9Var = (uk9) this.f;
                uk9Var.Y.setAnimation(null);
                uk9Var.Y.setVisibility(8);
                uk9Var.n(new fj0(23));
                break;
            default:
                o1b o1bVar = (o1b) this.f;
                jn5 jn5Var = o1bVar.D0;
                if (jn5Var != null) {
                    try {
                        ValueAnimator valueAnimator = jn5Var.v0;
                        if (valueAnimator != null) {
                            valueAnimator.cancel();
                        }
                        nd7.z(o1bVar.D0.getContext()).removeView(o1bVar.D0);
                    } catch (Exception unused) {
                    }
                }
                o1bVar.D0 = null;
                break;
        }
    }
}
