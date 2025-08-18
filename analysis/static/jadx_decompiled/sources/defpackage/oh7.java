package defpackage;

import android.animation.ObjectAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class oh7 extends dle {
    public static final l12 u0 = new l12(Float.class, "animationFraction", 8);
    public final wb5 X;
    public final xh7 Y;
    public int Z;
    public ObjectAnimator o;
    public boolean s0;
    public float t0;

    public oh7(xh7 xh7Var) {
        super(3);
        this.Z = 1;
        this.Y = xh7Var;
        this.X = new wb5();
    }

    @Override // defpackage.dle
    public final void S() {
        h0();
    }

    @Override // defpackage.dle
    public final void a0(rj0 rj0Var) {
    }

    @Override // defpackage.dle
    public final void c0() {
    }

    @Override // defpackage.dle
    public final void e0() {
        if (this.o == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, u0, 0.0f, 1.0f);
            this.o = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.o.setInterpolator(null);
            this.o.setRepeatCount(-1);
            this.o.addListener(new h6(7, this));
        }
        h0();
        this.o.start();
    }

    @Override // defpackage.dle
    public final void f0() {
    }

    public final void h0() {
        this.s0 = true;
        this.Z = 1;
        Iterator it = ((ArrayList) this.c).iterator();
        while (it.hasNext()) {
            vq4 vq4Var = (vq4) it.next();
            xh7 xh7Var = this.Y;
            vq4Var.c = xh7Var.c[0];
            vq4Var.d = xh7Var.g / 2;
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
