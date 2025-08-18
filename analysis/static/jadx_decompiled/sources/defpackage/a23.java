package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a23 extends dle {
    public ObjectAnimator X;
    public final wb5 Y;
    public final e23 Z;
    public ObjectAnimator o;
    public int s0;
    public float t0;
    public float u0;
    public le v0;
    public static final int[] w0 = {0, 1350, 2700, 4050};
    public static final int[] x0 = {667, 2017, 3367, 4717};
    public static final int[] y0 = {1000, 2350, 3700, 5050};
    public static final l12 z0 = new l12(Float.class, "animationFraction", 5);
    public static final l12 A0 = new l12(Float.class, "completeEndFraction", 6);

    public a23(e23 e23Var) {
        super(1);
        this.s0 = 0;
        this.v0 = null;
        this.Z = e23Var;
        this.Y = new wb5();
    }

    @Override // defpackage.dle
    public final void S() {
        this.s0 = 0;
        ((vq4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.u0 = 0.0f;
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
        if (((tz6) this.b).isVisible()) {
            this.X.start();
        } else {
            x();
        }
    }

    @Override // defpackage.dle
    public final void e0() {
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, z0, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.o.setInterpolator(null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new z13(this, 0));
        }
        if (this.X == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, A0, 0.0f, 1.0f);
            this.X = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.X.setInterpolator(this.Y);
            this.X.addListener(new z13(this, 1));
        }
        this.s0 = 0;
        ((vq4) ((ArrayList) this.c).get(0)).c = this.Z.c[0];
        this.u0 = 0.0f;
        this.o.start();
    }

    @Override // defpackage.dle
    public final void f0() {
        this.v0 = null;
    }

    @Override // defpackage.dle
    public final void x() {
        ObjectAnimator objectAnimator = this.o;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }
}
