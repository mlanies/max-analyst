package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* loaded from: classes2.dex */
public final class hc8 {
    public static final /* synthetic */ bc7[] m;
    public final znc a;
    public final View b;
    public final View c;
    public final k56 d;
    public final boolean e;
    public final pg7 f;
    public boolean g;
    public final k56 h;
    public AnimatorSet i;
    public final w4d j = mqd.D();
    public final int k = tu0.G(100 * fk4.d().getDisplayMetrics().density);
    public boolean l;

    static {
        oi9 oi9Var = new oi9(hc8.class, "keyboardObserverJob", "getKeyboardObserverJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        m = new bc7[]{oi9Var};
    }

    public hc8(znc zncVar, w12 w12Var, ViewGroup viewGroup, k56 k56Var, boolean z, pg7 pg7Var, boolean z2, k56 k56Var2) {
        this.a = zncVar;
        this.b = w12Var;
        this.c = viewGroup;
        this.d = k56Var;
        this.e = z;
        this.f = pg7Var;
        this.g = z2;
        this.h = k56Var2;
    }

    public final void a() {
        bc7[] bc7VarArr = m;
        bc7 bc7Var = bc7VarArr[0];
        w4d w4dVar = this.j;
        x77 x77Var = (x77) w4dVar.T0(this, bc7Var);
        if (x77Var != null) {
            x77Var.cancel(null);
        }
        w4dVar.o1(this, bc7VarArr[0], null);
        znc zncVar = this.a;
        if (zncVar.n()) {
            zncVar.C();
        }
    }

    public final ValueAnimator b(int i) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.c.getPaddingBottom(), i);
        valueAnimatorOfInt.addUpdateListener(new ec8(this, 0));
        return valueAnimatorOfInt;
    }

    public final int c() {
        int i = vc7.a;
        return vc7.a(this.b.getContext());
    }

    public final MediaKeyboardWidget d() {
        coc cocVar = (coc) x53.i0(this.a.e());
        uu3 uu3Var = cocVar != null ? cocVar.a : null;
        if (uu3Var instanceof MediaKeyboardWidget) {
            return (MediaKeyboardWidget) uu3Var;
        }
        return null;
    }

    public final void e(boolean z) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.a.n()) {
            boolean z2 = this.e;
            View view = this.b;
            if (!z2) {
                view.setTranslationY(view.getHeight());
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                int i = marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0;
                View view2 = this.c;
                view2.setPadding(view2.getPaddingLeft(), view2.getPaddingTop(), view2.getPaddingRight(), i);
                this.l = false;
                a();
                return;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), view.getHeight());
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                animatorSet2.playTogether(b(marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), objectAnimatorOfFloat);
            } else {
                animatorSet2.play(objectAnimatorOfFloat);
            }
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new fh(animatorSet2, new dc8(this, 1), 0));
            animatorSet2.start();
            this.i = animatorSet2;
        }
    }

    public final void f() {
        this.l = true;
        boolean z = this.e;
        View view = this.c;
        View view2 = this.b;
        if (z) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, view2.getTranslationY(), 0.0f);
            int iC = c();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i = iC + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            boolean z2 = view.getPaddingBottom() != i;
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z2) {
                animatorSet2.playTogether(b(i), objectAnimatorOfFloat);
            } else {
                animatorSet2.play(objectAnimatorOfFloat);
            }
            animatorSet2.setDuration(200L);
            animatorSet2.addListener(new fh(animatorSet2, new dc8(this, 0), 1));
            animatorSet2.start();
            this.i = animatorSet2;
        } else {
            int i2 = vc7.a;
            boolean zB = vc7.b(vc7.c);
            uc7 uc7Var = (uc7) this.d.invoke();
            if (uc7Var != null) {
                uc7Var.m();
            }
            if (zB) {
                zmf.l(view, new ff(view, this));
            } else {
                int iC2 = c();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i3 = iC2 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                boolean z3 = view.getPaddingBottom() != i3;
                view2.setTranslationY(0.0f);
                if (z3) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i3);
                }
            }
        }
        q0e q0eVar = vc7.f;
        mn5 m58Var = new m58(q0eVar, 3);
        if (((Boolean) q0eVar.getValue()).booleanValue()) {
            m58Var = new jp5(m58Var, 0);
        }
        this.j.o1(this, m[0], i24.s(new zn5(m58Var, new gc8(this, null), 5), this.f));
    }
}
