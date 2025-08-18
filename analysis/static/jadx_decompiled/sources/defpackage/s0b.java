package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class s0b extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public float A0;
    public float B0;
    public float C0;
    public ValueAnimator D0;
    public AnimatorSet E0;
    public fye F0;
    public final ScaleGestureDetector a;
    public r0b b;
    public float c;
    public float o;
    public float s0;
    public float t0;
    public boolean u0;
    public final Paint v0;
    public final Rect w0;
    public float x0;
    public float y0;
    public float z0;

    public s0b(Context context) {
        super(context);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        this.b = r0b.b;
        this.o = 1.0f;
        Paint paint = new Paint();
        this.v0 = paint;
        this.w0 = new Rect();
        paint.setColor(-1);
        paint.setStrokeWidth(40.0f);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private final r0b getStateByScale() {
        r0b r0bVar = this.b;
        r0b r0bVar2 = r0b.b;
        r0b r0bVar3 = r0b.a;
        if (r0bVar == r0bVar2) {
            float f = 1;
            if (this.o <= z7b.f(this.t0, f, 0.25f, f)) {
                return r0bVar2;
            }
        } else {
            float f2 = this.o;
            float f3 = this.t0;
            if (f2 < f3 - ((f3 - 1) * 0.25f)) {
                return r0bVar2;
            }
        }
        return r0bVar3;
    }

    private final View getVideoView() {
        Object next;
        u1 u1Var = new u1(4, this);
        while (true) {
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            if (((View) next) instanceof amf) {
                break;
            }
        }
        return (View) next;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.B0, this.C0);
        float f = this.o;
        canvas.scale(f, f, this.x0, this.y0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.u0) {
            canvas.drawRect(this.w0, this.v0);
        }
    }

    public final fye getTouchEventDelegate() {
        return this.F0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        fye fyeVar = this.F0;
        if (fyeVar != null) {
            ((zm4) fyeVar).d();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return true;
        }
        return this.F0 != null && motionEvent.getPointerCount() <= 1;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View videoView = getVideoView();
        if (videoView == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        int measuredHeight = videoView.getMeasuredHeight();
        int measuredWidth = videoView.getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || measuredWidth2 == 0 || measuredHeight2 == 0) {
            return;
        }
        float f = measuredWidth2;
        float f2 = measuredHeight2;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4 > f / f2 ? f2 / f4 : f / f3;
        this.t0 = f5;
        this.s0 = f5 * 4.0f;
        this.w0.set(0, 0, measuredWidth2, measuredHeight2);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.c;
        this.o = scaleFactor;
        this.o = (float) Math.min(this.s0, Math.max(0.8999999761581421d, scaleFactor));
        if (getStateByScale() == r0b.a && this.b == r0b.b) {
            this.v0.setAlpha(HttpStatus.SC_PROCESSING);
            this.u0 = true;
        } else {
            this.u0 = false;
        }
        invalidate();
        this.B0 = scaleGestureDetector.getFocusX() - this.z0;
        this.C0 = scaleGestureDetector.getFocusY() - this.A0;
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.c = this.o;
        if (this.b == r0b.b) {
            this.x0 = scaleGestureDetector.getFocusX();
            this.y0 = scaleGestureDetector.getFocusY();
        }
        this.z0 = scaleGestureDetector.getFocusX();
        this.A0 = scaleGestureDetector.getFocusY();
        if (this.D0 != null) {
            this.D0 = null;
            this.u0 = false;
        }
        AnimatorSet animatorSet = this.E0;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.E0 = null;
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        ValueAnimator valueAnimatorOfFloat;
        final int i = 3;
        final int i2 = 1;
        final int i3 = 2;
        final int i4 = 0;
        ArrayList arrayList = new ArrayList();
        r0b stateByScale = getStateByScale();
        r0b r0bVar = r0b.a;
        r0b r0bVar2 = r0b.b;
        if (stateByScale == r0bVar && this.b == r0bVar2) {
            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.4f, 1.0f, 0.0f);
            valueAnimatorOfFloat2.setDuration(600L);
            valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
                public final /* synthetic */ s0b b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    switch (i4) {
                        case 0:
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar = this.b;
                            s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                            if (fFloatValue == 0.0f) {
                                s0bVar.u0 = false;
                            }
                            s0bVar.invalidate();
                            break;
                        case 1:
                            float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar2 = this.b;
                            s0bVar2.o = fFloatValue2;
                            s0bVar2.invalidate();
                            break;
                        case 2:
                            float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar3 = this.b;
                            s0bVar3.x0 = fFloatValue3;
                            s0bVar3.invalidate();
                            break;
                        case 3:
                            float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar4 = this.b;
                            s0bVar4.y0 = fFloatValue4;
                            s0bVar4.invalidate();
                            break;
                        case 4:
                            float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar5 = this.b;
                            s0bVar5.B0 = fFloatValue5;
                            s0bVar5.invalidate();
                            break;
                        default:
                            float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            s0b s0bVar6 = this.b;
                            s0bVar6.C0 = fFloatValue6;
                            s0bVar6.invalidate();
                            break;
                    }
                }
            });
            arrayList.add(valueAnimatorOfFloat2);
            this.D0 = valueAnimatorOfFloat2;
        }
        if (getStateByScale() == r0bVar) {
            this.b = r0bVar;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.o, this.t0);
        } else {
            this.b = r0bVar2;
            valueAnimatorOfFloat = ValueAnimator.ofFloat(this.o, 1.0f);
        }
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
            public final /* synthetic */ s0b b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar = this.b;
                        s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            s0bVar.u0 = false;
                        }
                        s0bVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar2 = this.b;
                        s0bVar2.o = fFloatValue2;
                        s0bVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar3 = this.b;
                        s0bVar3.x0 = fFloatValue3;
                        s0bVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar4 = this.b;
                        s0bVar4.y0 = fFloatValue4;
                        s0bVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar5 = this.b;
                        s0bVar5.B0 = fFloatValue5;
                        s0bVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar6 = this.b;
                        s0bVar6.C0 = fFloatValue6;
                        s0bVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(this.x0, getWidth() / 2.0f);
        valueAnimatorOfFloat3.setDuration(300L);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
            public final /* synthetic */ s0b b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i3) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar = this.b;
                        s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            s0bVar.u0 = false;
                        }
                        s0bVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar2 = this.b;
                        s0bVar2.o = fFloatValue2;
                        s0bVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar3 = this.b;
                        s0bVar3.x0 = fFloatValue3;
                        s0bVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar4 = this.b;
                        s0bVar4.y0 = fFloatValue4;
                        s0bVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar5 = this.b;
                        s0bVar5.B0 = fFloatValue5;
                        s0bVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar6 = this.b;
                        s0bVar6.C0 = fFloatValue6;
                        s0bVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat3);
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.y0, getHeight() / 2.0f);
        valueAnimatorOfFloat4.setDuration(300L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
            public final /* synthetic */ s0b b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar = this.b;
                        s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            s0bVar.u0 = false;
                        }
                        s0bVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar2 = this.b;
                        s0bVar2.o = fFloatValue2;
                        s0bVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar3 = this.b;
                        s0bVar3.x0 = fFloatValue3;
                        s0bVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar4 = this.b;
                        s0bVar4.y0 = fFloatValue4;
                        s0bVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar5 = this.b;
                        s0bVar5.B0 = fFloatValue5;
                        s0bVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar6 = this.b;
                        s0bVar6.C0 = fFloatValue6;
                        s0bVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat4);
        ValueAnimator valueAnimatorOfFloat5 = ValueAnimator.ofFloat(this.B0, 0.0f);
        valueAnimatorOfFloat5.setDuration(300L);
        final int i5 = 4;
        valueAnimatorOfFloat5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
            public final /* synthetic */ s0b b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i5) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar = this.b;
                        s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            s0bVar.u0 = false;
                        }
                        s0bVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar2 = this.b;
                        s0bVar2.o = fFloatValue2;
                        s0bVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar3 = this.b;
                        s0bVar3.x0 = fFloatValue3;
                        s0bVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar4 = this.b;
                        s0bVar4.y0 = fFloatValue4;
                        s0bVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar5 = this.b;
                        s0bVar5.B0 = fFloatValue5;
                        s0bVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar6 = this.b;
                        s0bVar6.C0 = fFloatValue6;
                        s0bVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat5);
        ValueAnimator valueAnimatorOfFloat6 = ValueAnimator.ofFloat(this.C0, 0.0f);
        valueAnimatorOfFloat6.setDuration(300L);
        final int i6 = 5;
        valueAnimatorOfFloat6.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: q0b
            public final /* synthetic */ s0b b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i6) {
                    case 0:
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar = this.b;
                        s0bVar.v0.setAlpha((int) (255 * fFloatValue));
                        if (fFloatValue == 0.0f) {
                            s0bVar.u0 = false;
                        }
                        s0bVar.invalidate();
                        break;
                    case 1:
                        float fFloatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar2 = this.b;
                        s0bVar2.o = fFloatValue2;
                        s0bVar2.invalidate();
                        break;
                    case 2:
                        float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar3 = this.b;
                        s0bVar3.x0 = fFloatValue3;
                        s0bVar3.invalidate();
                        break;
                    case 3:
                        float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar4 = this.b;
                        s0bVar4.y0 = fFloatValue4;
                        s0bVar4.invalidate();
                        break;
                    case 4:
                        float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar5 = this.b;
                        s0bVar5.B0 = fFloatValue5;
                        s0bVar5.invalidate();
                        break;
                    default:
                        float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        s0b s0bVar6 = this.b;
                        s0bVar6.C0 = fFloatValue6;
                        s0bVar6.invalidate();
                        break;
                }
            }
        });
        arrayList.add(valueAnimatorOfFloat6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.E0 = animatorSet;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        fye fyeVar = this.F0;
        if (fyeVar != null) {
            zm4 zm4Var = (zm4) fyeVar;
            FrameLayout frameLayout = (FrameLayout) zm4Var.c;
            Rect rect = (Rect) zm4Var.j;
            frameLayout.getHitRect(rect);
            int x = (int) motionEvent.getX();
            int i = rect.right;
            int i2 = rect.left;
            int i3 = (i - i2) / 6;
            if (x >= i2 && x <= rect.centerX() - i3) {
                ((GestureDetector) ((jn) zm4Var.g).o).onTouchEvent(motionEvent);
            } else if (x < rect.centerX() + i3 || x > rect.right) {
                ((GestureDetector) zm4Var.h).onTouchEvent(motionEvent);
            } else {
                ((GestureDetector) ((jn) zm4Var.f).o).onTouchEvent(motionEvent);
            }
        }
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            View videoView = getVideoView();
            if (videoView != null) {
                videoView.dispatchTouchEvent(motionEvent);
            }
        }
        return true;
    }

    public final void setTouchEventDelegate(fye fyeVar) {
        this.F0 = fyeVar;
    }
}
