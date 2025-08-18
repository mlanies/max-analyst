package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class uge extends FrameLayout {
    public static final /* synthetic */ int s0 = 0;
    public final dnf a;
    public boolean b;
    public ValueAnimator c;
    public tge o;

    public uge(Context context) {
        super(context, null);
        dnf dnfVar = new dnf(getContext(), this, new br0(2, this));
        dnfVar.b = (int) (1.0f * dnfVar.b);
        this.a = dnfVar;
    }

    public static void a(uge ugeVar, float f) {
        ugeVar.setBackgroundAlpha(f);
    }

    public static void b(uge ugeVar, float f, float f2) {
        if (f2 != 0.0f) {
            f2 = 1 - f2;
        }
        if (f > f2) {
            ugeVar.setBackgroundAlpha(1 - f);
        }
    }

    private final void setBackgroundAlpha(float f) {
        Drawable background = getBackground();
        if (background != null) {
            background.setAlpha((int) (ote.d(f, 0.0f, 1.0f) * 255));
        }
    }

    public final void c(int i, int i2, k56 k56Var, k56 k56Var2, a66 a66Var) {
        tge tgeVar = this.o;
        if (tgeVar == null) {
            return;
        }
        ValueAnimator valueAnimator = this.c;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.c;
        if (valueAnimator2 != null) {
            ju0.i(valueAnimator2);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        valueAnimatorOfInt.setDuration(200L);
        valueAnimatorOfInt.addUpdateListener(new jf(tgeVar, a66Var, animatedFraction, 2));
        valueAnimatorOfInt.addListener(new sg(k56Var2, this, k56Var, 2));
        valueAnimatorOfInt.start();
        this.c = valueAnimatorOfInt;
    }

    @Override // android.view.View
    public final void computeScroll() {
        if (this.a.f()) {
            postInvalidateOnAnimation();
        }
    }

    public final void d() {
        tge tgeVar = this.o;
        if (tgeVar == null) {
            return;
        }
        if (tgeVar.q().getHeight() > 0) {
            c(tgeVar.y(), tgeVar.h(), new xid(21), new xid(21), new sge(this, 0));
        }
        invalidate();
    }

    public final tge getCallback() {
        return this.o;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.a.o(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        tge tgeVar = this.o;
        if (tgeVar == null) {
            return;
        }
        View viewQ = tgeVar.q();
        int top = viewQ.getHeight() > 0 ? viewQ.getTop() : tgeVar.y();
        super.onLayout(z, i, i2, i3, i4);
        viewQ.offsetTopAndBottom(top);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.a.i(motionEvent);
        return true;
    }

    public final void setCallback(tge tgeVar) {
        this.o = tgeVar;
    }
}
