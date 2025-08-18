package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class qh7 extends dle {
    public static final int[] w0 = {533, 567, 850, 750};
    public static final int[] x0 = {1267, 1000, 333, 0};
    public static final l12 y0 = new l12(Float.class, "animationFraction", 9);
    public ObjectAnimator X;
    public final Interpolator[] Y;
    public final xh7 Z;
    public ObjectAnimator o;
    public int s0;
    public boolean t0;
    public float u0;
    public le v0;

    public qh7(Context context, xh7 xh7Var) {
        super(2);
        this.s0 = 0;
        this.v0 = null;
        this.Z = xh7Var;
        this.Y = new Interpolator[]{AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, dsb.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // defpackage.dle
    public final void S() {
        h0();
    }

    @Override // defpackage.dle
    public final void a0(rj0 rj0Var) {
        this.v0 = rj0Var;
    }

    @Override // defpackage.dle
    public final void c0() {
        ObjectAnimator objectAnimator = this.X;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        x();
        if (((tz6) this.b).isVisible()) {
            this.X.setFloatValues(this.u0, 1.0f);
            this.X.setDuration((long) ((1.0f - this.u0) * 1800.0f));
            this.X.start();
        }
    }

    @Override // defpackage.dle
    public final void e0() {
        ObjectAnimator objectAnimator = this.o;
        l12 l12Var = y0;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, l12Var, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.o.setInterpolator(null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new ph7(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, l12Var, 1.0f);
            this.X = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.X.setInterpolator(null);
            this.X.addListener(new ph7(this, 1));
        }
        h0();
        this.o.start();
    }

    @Override // defpackage.dle
    public final void f0() {
        this.v0 = null;
    }

    public final void h0() {
        this.s0 = 0;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            ((vq4) it.next()).c = this.Z.c[0];
        }
    }

    @Override // defpackage.dle
    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
