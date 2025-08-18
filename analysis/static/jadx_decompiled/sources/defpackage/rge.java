package defpackage;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class rge {
    public final k56 a;
    public final View b;
    public final ViewGroup c;
    public final k56 d;
    public final int e;
    public boolean f;
    public float g = -1.0f;
    public float h = -1.0f;
    public float i = -1.0f;
    public float j = -1.0f;
    public final int k;
    public final int l;
    public View m;
    public final l6 n;
    public final gic o;
    public final je7 p;
    public nge q;
    public Long r;
    public ValueAnimator s;
    public ValueAnimator t;

    public rge(Integer num, rzd rzdVar, View view, ViewGroup viewGroup, a81 a81Var, int i) {
        this.a = rzdVar;
        this.b = view;
        this.c = viewGroup;
        this.d = a81Var;
        this.e = i;
        this.k = br7.D(view.getContext());
        this.l = view.getContext().getResources().getDisplayMetrics().heightPixels;
        l6 l6Var = new l6(view.getContext(), 1);
        l6Var.setId(wwb.swipe_fade);
        l6Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        l6Var.setBackgroundColor(num != null ? num.intValue() : f8.G(-16777216, 0.5f));
        this.n = l6Var;
        this.o = nu0.L(new xid(20));
        this.p = tu0.r(3, new rzd(6, this));
    }

    public final View a() {
        View view = this.m;
        if (view != null) {
            return view;
        }
        View view2 = (View) this.d.invoke();
        this.m = view2;
        return view2;
    }

    public final boolean b() {
        return this.e == 2;
    }

    public final void c(float f, boolean z) {
        ValueAnimator valueAnimator = this.s;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            Long l = this.r;
            long jLongValue = l != null ? l.longValue() : 200L;
            ValueAnimator duration = ValueAnimator.ofFloat(f, 0.0f).setDuration(ote.f((long) (Math.abs(f) * jLongValue), 0L, jLongValue));
            duration.addUpdateListener(new qge(this, 1));
            duration.addListener(new ag(this, z, f));
            this.s = duration;
            duration.start();
        }
    }

    public final void d(float f) {
        boolean zB = b();
        l6 l6Var = this.n;
        View view = this.b;
        ViewGroup viewGroup = this.c;
        if (!zB) {
            kq0.x(viewGroup, a(), view, l6Var, f);
            return;
        }
        a();
        if (view != null) {
            view.setTranslationX(viewGroup.getMeasuredWidth() * f);
        }
        if (l6Var != null) {
            l6Var.setAlpha(1.0f - f);
        }
    }
}
