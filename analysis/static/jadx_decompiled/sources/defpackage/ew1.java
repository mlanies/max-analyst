package defpackage;

import android.animation.FloatEvaluator;
import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class ew1 extends FrameLayout {
    public static final /* synthetic */ int A0 = 0;
    public rrb a;
    public ValueAnimator b;
    public final IntEvaluator c;
    public final FloatEvaluator o;
    public int s0;
    public int t0;
    public float u0;
    public int v0;
    public int w0;
    public final axe x0;
    public dw1 y0;
    public boolean z0;

    public ew1(Context context) {
        super(context, null, 0, 0);
        this.c = new IntEvaluator();
        this.o = new FloatEvaluator();
        axe axeVar = new axe();
        axeVar.a = 0;
        axeVar.b = 0;
        this.x0 = axeVar;
        setOutlineProvider(axeVar);
    }

    public static final void b(ew1 ew1Var, int i, int i2, int i3, int i4, float f, float f2, int i5, int i6, int i7, int i8, float f3) {
        Integer numEvaluate = ew1Var.c.evaluate(f3, Integer.valueOf(i), Integer.valueOf(i2));
        IntEvaluator intEvaluator = ew1Var.c;
        Integer numEvaluate2 = intEvaluator.evaluate(f3, Integer.valueOf(i3), Integer.valueOf(i4));
        Float fEvaluate = ew1Var.o.evaluate(f3, (Number) Float.valueOf(f), (Number) Float.valueOf(f2));
        Integer numEvaluate3 = intEvaluator.evaluate(f3, Integer.valueOf(i5), Integer.valueOf(i6));
        Integer numEvaluate4 = intEvaluator.evaluate(f3, Integer.valueOf(i7), Integer.valueOf(i8));
        ew1Var.getLayoutParams().width = numEvaluate.intValue();
        ew1Var.getLayoutParams().height = numEvaluate2.intValue();
        ew1Var.setLayoutParams(ew1Var.getLayoutParams());
        ew1Var.setTranslationY(fEvaluate.floatValue());
        int iIntValue = numEvaluate3.intValue();
        axe axeVar = ew1Var.x0;
        axeVar.a = iIntValue;
        axeVar.b = numEvaluate4.intValue();
        ew1Var.invalidateOutline();
    }

    public final void a(boolean z, boolean z2) {
        if (this.z0 == z) {
            return;
        }
        this.z0 = z;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        rrb rrbVar = this.a;
        if (rrbVar == null) {
            rrbVar = null;
        }
        boolean z3 = this.z0;
        if (rrbVar.b != z3) {
            rrbVar.b = z3;
            ValueAnimator valueAnimator2 = rrbVar.c;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float alpha = rrbVar.v0.getAlpha();
            float f = z3 ? 0.0f : 1.0f;
            float alpha2 = rrbVar.D0.getAlpha();
            float f2 = z3 ? 1.0f : 0.0f;
            if (z2) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                rrbVar.c = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new nrb(rrbVar, alpha, f, alpha2, f2, 0));
                valueAnimatorOfFloat.setStartDelay(z3 ? 50L : 0L);
                valueAnimatorOfFloat.setDuration(150L);
                valueAnimatorOfFloat.start();
            } else {
                rrb.b(rrbVar, alpha, f, alpha2, f2, 1.0f);
            }
        }
        final int measuredWidth = getMeasuredWidth();
        final int measuredHeight = getMeasuredHeight();
        final int measuredWidth2 = this.z0 ? ay7.u(this).getMeasuredWidth() : this.s0;
        final int measuredHeight2 = this.z0 ? ay7.u(this).getMeasuredHeight() : this.t0;
        final float translationY = getTranslationY();
        boolean z4 = this.z0;
        float f3 = z4 ? 0.0f : this.u0;
        axe axeVar = this.x0;
        final int i = axeVar.a;
        int i2 = z4 ? 0 : this.v0;
        final int i3 = axeVar.b;
        final int i4 = z4 ? 0 : this.w0;
        if (!z2) {
            b(this, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f3, i, i2, i3, i4, 1.0f);
            return;
        }
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.b = valueAnimatorOfFloat2;
        final float f4 = f3;
        final int i5 = i2;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cw1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ew1.b(this.a, measuredWidth, measuredWidth2, measuredHeight, measuredHeight2, translationY, f4, i, i5, i3, i4, ((Float) valueAnimator3.getAnimatedValue()).floatValue());
            }
        });
        valueAnimatorOfFloat2.setDuration(200L);
        valueAnimatorOfFloat2.start();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof rrb)) {
            throw new IllegalArgumentException("child must be QuickCameraView instance".toString());
        }
        super.addView(view, layoutParams);
    }

    public final dw1 getListener() {
        return this.y0;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return !this.z0;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        axe axeVar = this.x0;
        boolean z = y <= ((float) axeVar.a);
        boolean z2 = motionEvent.getY() >= ((float) (getMeasuredHeight() - axeVar.b));
        if (this.z0 || !(z || z2)) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setListener(dw1 dw1Var) {
        this.y0 = dw1Var;
    }

    public final void setPreviewTranslationY(float f) {
        this.u0 = f;
        if (this.z0) {
            return;
        }
        setTranslationY(f);
    }
}
