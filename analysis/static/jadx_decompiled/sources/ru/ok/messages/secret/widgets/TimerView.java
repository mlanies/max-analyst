package ru.ok.messages.secret.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.b3c;
import defpackage.bk4;
import defpackage.fm9;
import defpackage.khe;
import defpackage.s63;
import defpackage.sme;
import defpackage.z00;

/* loaded from: classes2.dex */
public class TimerView extends FrameLayout {
    public static final /* synthetic */ int y0 = 0;
    public RectF a;
    public final Paint b;
    public final Paint c;
    public final AppCompatImageView o;
    public float s0;
    public ValueAnimator t0;
    public long u0;
    public long v0;
    public long w0;
    public boolean x0;

    public TimerView(Context context, AttributeSet attributeSet) {
        int color;
        int i;
        Drawable drawable;
        TypedArray typedArrayObtainStyledAttributes;
        super(context, attributeSet, 0);
        this.s0 = 360.0f;
        this.u0 = -1L;
        this.v0 = -1L;
        this.w0 = -1L;
        this.x0 = true;
        int i2 = bk4.b().b;
        if (attributeSet == null || (typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b3c.TimerView)) == null) {
            color = Integer.MIN_VALUE;
            i = Integer.MIN_VALUE;
            drawable = null;
        } else {
            int i3 = b3c.TimerView_circleColor;
            Context context2 = getContext();
            khe kheVar = sme.a0;
            color = typedArrayObtainStyledAttributes.getColor(i3, fm9.R(context2).k);
            i = typedArrayObtainStyledAttributes.getColor(b3c.TimerView_circleSecondaryColor, s63.i(color, 76));
            drawable = typedArrayObtainStyledAttributes.getDrawable(b3c.TimerView_arrowResource);
            typedArrayObtainStyledAttributes.recycle();
        }
        if (color == Integer.MIN_VALUE) {
            Context context3 = getContext();
            khe kheVar2 = sme.a0;
            color = fm9.R(context3).k;
        }
        i = i == Integer.MIN_VALUE ? s63.i(color, 76) : i;
        Paint paint = new Paint();
        this.b = paint;
        paint.setAntiAlias(true);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        setColor(color);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setAntiAlias(true);
        paint2.setStyle(style);
        setSecondaryColor(i);
        setStrokeWidth(i2);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        this.o = appCompatImageView;
        appCompatImageView.setScaleType(ImageView.ScaleType.CENTER);
        if (drawable != null) {
            appCompatImageView.setImageDrawable(drawable);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(appCompatImageView, layoutParams);
        setWillNotDraw(false);
    }

    public final void a(long j, long j2, long j3) {
        this.u0 = j;
        this.v0 = j2;
        this.w0 = j3;
        if (j3 >= j2) {
            b(0.0f);
            return;
        }
        b(-1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - ((j3 - j) / (j2 - j)), 0.0f);
        this.t0 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j2 - j3);
        this.t0.addUpdateListener(new z00(20, this));
        this.t0.start();
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.t0;
        if (valueAnimator != null && valueAnimator.isStarted()) {
            this.t0.cancel();
        }
        if (f != -1.0f) {
            this.s0 = f * 360.0f;
            invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.x0) {
            long j = this.u0;
            if (j != -1) {
                long j2 = this.v0;
                if (j2 != -1) {
                    long j3 = this.w0;
                    if (j3 != -1) {
                        a(j, j2, j3);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.x0 = true;
        b(-1.0f);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        AppCompatImageView appCompatImageView = this.o;
        float rotation = appCompatImageView.getRotation();
        float f = this.s0;
        if (rotation != f) {
            appCompatImageView.setRotation(f);
        }
        super.onDraw(canvas);
        float fCenterX = this.a.centerX();
        canvas.drawCircle(fCenterX, this.a.centerY(), this.a.right - fCenterX, this.c);
        float f2 = this.s0;
        if (f2 > 0.0f) {
            canvas.drawArc(this.a, 270.0f, f2, false, this.b);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Paint paint = this.b;
        this.a = new RectF((paint.getStrokeWidth() / 2.0f) + getPaddingLeft(), (paint.getStrokeWidth() / 2.0f) + getPaddingTop(), (getWidth() - (paint.getStrokeWidth() / 2.0f)) - getPaddingRight(), (getHeight() - (paint.getStrokeWidth() / 2.0f)) - getPaddingBottom());
        invalidate();
    }

    public void setArrorColor(int i) {
        this.o.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }

    public void setColor(int i) {
        this.b.setColor(i);
    }

    public void setImageResource(int i) {
        this.o.setImageResource(i);
    }

    public void setSecondaryColor(int i) {
        this.c.setColor(i);
    }

    public void setStrokeWidth(int i) {
        float f = i;
        this.b.setStrokeWidth(f);
        this.c.setStrokeWidth(f);
    }

    public void setupColorsFrom(int i) {
        setColor(i);
        setSecondaryColor(s63.i(i, 76));
    }
}
