package ru.ok.messages.video.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.ad;
import defpackage.bk4;
import defpackage.p0b;
import defpackage.vl;
import defpackage.y8a;
import defpackage.z7b;
import java.util.HashMap;
import org.apache.http.HttpStatus;
import ru.ok.messages.video.widgets.PinchToZoomVideoViewWrapper;

/* loaded from: classes2.dex */
public class PinchToZoomVideoViewWrapper extends FrameLayout implements ScaleGestureDetector.OnScaleGestureListener {
    public static final /* synthetic */ int K0 = 0;
    public float A0;
    public float B0;
    public float C0;
    public float D0;
    public ValueAnimator E0;
    public ValueAnimator F0;
    public ValueAnimator G0;
    public ValueAnimator H0;
    public ValueAnimator I0;
    public ValueAnimator J0;
    public final ScaleGestureDetector a;
    public final ad b;
    public p0b c;
    public float o;
    public float s0;
    public float t0;
    public float u0;
    public boolean v0;
    public final Paint w0;
    public final Rect x0;
    public float y0;
    public float z0;

    public PinchToZoomVideoViewWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(getContext(), this);
        this.a = scaleGestureDetector;
        this.b = ((y8a) vl.b()).b();
        this.c = p0b.b;
        this.s0 = 1.0f;
        this.v0 = false;
        Paint paint = new Paint();
        this.w0 = paint;
        this.x0 = new Rect();
        paint.setColor(-1);
        getContext();
        paint.setStrokeWidth(bk4.b().u);
        paint.setStyle(Paint.Style.STROKE);
        scaleGestureDetector.setQuickScaleEnabled(false);
    }

    private p0b getStateByScale() {
        p0b p0bVar = this.c;
        p0b p0bVar2 = p0b.b;
        p0b p0bVar3 = p0b.a;
        if (p0bVar == p0bVar2) {
            return this.s0 > z7b.f(this.u0, 1.0f, 0.25f, 1.0f) ? p0bVar3 : p0bVar2;
        }
        float f = this.s0;
        float f2 = this.u0;
        return f < f2 - ((f2 - 1.0f) * 0.25f) ? p0bVar2 : p0bVar3;
    }

    private View getVideoView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof VideoView) {
                return childAt;
            }
        }
        throw new IllegalStateException("Wrapper should contains VideoView");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.translate(this.C0, this.D0);
        float f = this.s0;
        canvas.scale(f, f, this.y0, this.z0);
        super.dispatchDraw(canvas);
        canvas.restore();
        if (this.v0) {
            canvas.drawRect(this.x0, this.w0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.F0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.E0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.G0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.H0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.I0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.J0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return isEnabled();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getVideoView().getMeasuredHeight();
        int measuredWidth = getVideoView().getMeasuredWidth();
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        if (measuredWidth == 0 || measuredHeight == 0 || measuredWidth2 == 0 || measuredHeight2 == 0) {
            return;
        }
        float f = measuredWidth2;
        float f2 = measuredHeight2;
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        if (f3 / f4 > f / f2) {
            this.u0 = f2 / f4;
        } else {
            this.u0 = f / f3;
        }
        this.t0 = this.u0 * 4.0f;
        this.x0.set(0, 0, measuredWidth2, measuredHeight2);
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() * this.o;
        this.s0 = scaleFactor;
        this.s0 = Math.min(this.t0, Math.max(0.9f, scaleFactor));
        if (getStateByScale() == p0b.a && this.c == p0b.b) {
            this.w0.setAlpha(HttpStatus.SC_PROCESSING);
            this.v0 = true;
        } else {
            this.v0 = false;
        }
        invalidate();
        this.C0 = scaleGestureDetector.getFocusX() - this.A0;
        this.D0 = scaleGestureDetector.getFocusY() - this.B0;
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        this.o = this.s0;
        if (this.c == p0b.b) {
            this.y0 = scaleGestureDetector.getFocusX();
            this.z0 = scaleGestureDetector.getFocusY();
        }
        this.A0 = scaleGestureDetector.getFocusX();
        this.B0 = scaleGestureDetector.getFocusY();
        ValueAnimator valueAnimator = this.E0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.E0 = null;
        }
        ValueAnimator valueAnimator2 = this.F0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            this.F0 = null;
            this.v0 = false;
        }
        ValueAnimator valueAnimator3 = this.G0;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.H0;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.I0;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.J0;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        invalidate();
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        final int i = 3;
        final int i2 = 1;
        final int i3 = 0;
        final int i4 = 2;
        p0b stateByScale = getStateByScale();
        p0b p0bVar = p0b.a;
        p0b p0bVar2 = p0b.b;
        if (stateByScale == p0bVar && this.c == p0bVar2) {
            ValueAnimator duration = ValueAnimator.ofFloat(0.4f, 1.0f, 0.0f).setDuration(600L);
            this.F0 = duration;
            duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
                public final /* synthetic */ PinchToZoomVideoViewWrapper b;

                {
                    this.b = this;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                    switch (i3) {
                        case 0:
                            int i5 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                            if (fFloatValue == 0.0d) {
                                pinchToZoomVideoViewWrapper.v0 = false;
                            }
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 1:
                            int i6 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 2:
                            int i7 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 3:
                            int i8 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        case 4:
                            int i9 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                        default:
                            int i10 = PinchToZoomVideoViewWrapper.K0;
                            pinchToZoomVideoViewWrapper.getClass();
                            pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                            pinchToZoomVideoViewWrapper.invalidate();
                            break;
                    }
                }
            });
            this.F0.start();
        }
        if (getStateByScale() == p0bVar) {
            this.c = p0bVar;
            this.E0 = ValueAnimator.ofFloat(this.s0, this.u0);
        } else {
            this.c = p0bVar2;
            this.E0 = ValueAnimator.ofFloat(this.s0, 1.0f);
        }
        HashMap map = new HashMap();
        map.put("scaleType", this.c.toString());
        map.put("orientation", Integer.valueOf(getContext().getResources().getConfiguration().orientation));
        this.b.h("PINCH_TO_ZOOM", map);
        this.E0.setDuration(300L).addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i2) {
                    case 0:
                        int i5 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.v0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i6 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i7 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i8 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i9 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i10 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.E0.start();
        ValueAnimator duration2 = ValueAnimator.ofFloat(this.y0, getWidth() / 2).setDuration(300L);
        this.G0 = duration2;
        duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i4) {
                    case 0:
                        int i5 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.v0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i6 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i7 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i8 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i9 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i10 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.G0.start();
        ValueAnimator duration3 = ValueAnimator.ofFloat(this.z0, getHeight() / 2).setDuration(300L);
        this.H0 = duration3;
        duration3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i) {
                    case 0:
                        int i5 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.v0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i6 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i7 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i8 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i9 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i10 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.H0.start();
        ValueAnimator duration4 = ValueAnimator.ofFloat(this.C0, 0.0f).setDuration(300L);
        this.I0 = duration4;
        final int i5 = 4;
        duration4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i5) {
                    case 0:
                        int i52 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.v0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i6 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i7 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i8 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i9 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i10 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.I0.start();
        ValueAnimator duration5 = ValueAnimator.ofFloat(this.D0, 0.0f).setDuration(300L);
        this.J0 = duration5;
        final int i6 = 5;
        duration5.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: o0b
            public final /* synthetic */ PinchToZoomVideoViewWrapper b;

            {
                this.b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinchToZoomVideoViewWrapper pinchToZoomVideoViewWrapper = this.b;
                switch (i6) {
                    case 0:
                        int i52 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.w0.setAlpha((int) (255.0f * fFloatValue));
                        if (fFloatValue == 0.0d) {
                            pinchToZoomVideoViewWrapper.v0 = false;
                        }
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 1:
                        int i62 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 2:
                        int i7 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.y0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 3:
                        int i8 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.z0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    case 4:
                        int i9 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.C0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                    default:
                        int i10 = PinchToZoomVideoViewWrapper.K0;
                        pinchToZoomVideoViewWrapper.getClass();
                        pinchToZoomVideoViewWrapper.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        pinchToZoomVideoViewWrapper.invalidate();
                        break;
                }
            }
        });
        this.J0.start();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        super.onTouchEvent(motionEvent);
        ScaleGestureDetector scaleGestureDetector = this.a;
        scaleGestureDetector.onTouchEvent(motionEvent);
        if (scaleGestureDetector.isInProgress()) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else {
            getVideoView().dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
