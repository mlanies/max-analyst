package defpackage;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.view.View;
import com.futuremind.recyclerviewfastscroll.FastScroller;

/* loaded from: classes.dex */
public abstract class gxc {
    public FastScroller a;
    public lq9 b;

    public final lq9 a() {
        if (this.b == null) {
            View view = ((ld4) this).c;
            int i = hsb.fastscroll__default_show;
            int i2 = hsb.fastscroll__default_hide;
            kx1 kx1Var = new kx1();
            kx1Var.c = view;
            kx1Var.a = 1.0f;
            kx1Var.b = 1.0f;
            AnimatorSet animatorSet = (AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i2);
            animatorSet.setStartDelay(1000);
            animatorSet.setTarget(view);
            ((AnimatorSet) AnimatorInflater.loadAnimator(view.getContext(), i)).setTarget(view);
            animatorSet.addListener(new tv3(view));
            kx1Var.a();
            this.b = new lq9(kx1Var);
        }
        return this.b;
    }
}
