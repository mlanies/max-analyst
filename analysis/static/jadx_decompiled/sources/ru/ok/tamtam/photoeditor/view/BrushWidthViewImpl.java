package ru.ok.tamtam.photoeditor.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import defpackage.b;
import defpackage.tu0;
import defpackage.yr0;
import java.util.HashSet;
import ru.ok.tamtam.photoeditor.view.BrushWidthViewImpl;

/* loaded from: classes2.dex */
public class BrushWidthViewImpl extends View implements yr0 {
    public float A0;
    public float B0;
    public final boolean C0;
    public final HashSet D0;
    public final Paint a;
    public final Paint b;
    public final Paint c;
    public final Paint o;
    public final int s0;
    public final float t0;
    public float u0;
    public float v0;
    public float w0;
    public float x0;
    public float y0;
    public boolean z0;

    public BrushWidthViewImpl(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C0 = false;
        this.D0 = new HashSet();
        setLayerType(1, null);
        this.u0 = tu0.f(getContext(), 2);
        this.t0 = tu0.f(getContext(), 11);
        this.A0 = tu0.f(getContext(), 2);
        this.B0 = tu0.f(getContext(), 32);
        this.s0 = tu0.f(getContext(), 1);
        Paint paint = new Paint();
        this.a = paint;
        paint.setColor(-1);
        this.a.setStrokeWidth(this.u0);
        this.a.setAntiAlias(true);
        this.a.setShadowLayer(tu0.f(getContext(), 2), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setColor(-1);
        this.b.setAntiAlias(true);
        this.b.setShadowLayer(tu0.f(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setColor(-1);
        this.c.setAntiAlias(true);
        Paint paint4 = new Paint();
        this.o = paint4;
        paint4.setColor(-1);
        this.o.setAntiAlias(true);
        this.o.setShadowLayer(tu0.f(getContext(), 3), 0.0f, 0.0f, Integer.MIN_VALUE);
        if (getContext().getResources().getConfiguration().getLayoutDirection() == 1) {
            this.C0 = true;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            super.onDraw(canvas);
            return;
        }
        super.onDraw(canvas);
        if (this.C0) {
            canvas.save();
            canvas.scale(-1.0f, 1.0f, canvas.getWidth() / 2, canvas.getHeight() / 2);
        }
        float f = this.v0;
        canvas.drawLine(f, this.x0, f, this.y0, this.a);
        float f2 = this.w0;
        float f3 = this.y0;
        float f4 = this.x0;
        float f5 = this.A0;
        float f6 = (((this.B0 - f5) * ((f3 - f2) / (f3 - f4))) + f5) / 2.0f;
        canvas.drawCircle(this.v0 - (this.t0 * 3.0f), f2, this.s0 + f6, this.o);
        canvas.drawCircle(this.v0 - (this.t0 * 3.0f), this.w0, f6, this.c);
        canvas.drawCircle(this.v0, this.w0, this.t0, this.b);
        if (this.C0) {
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        if (this.v0 == 0.0f) {
            this.v0 = (float) (width * 0.8d);
            double d = height;
            this.x0 = (float) (0.1d * d);
            float f = (float) (d * 0.9d);
            this.y0 = f;
            this.w0 = f;
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (this.C0) {
            x = getWidth() - x;
        }
        if (motionEvent.getAction() == 0) {
            float f = this.v0;
            float f2 = this.t0;
            if (x > f - (f2 * 2.0f) && x < (f2 * 2.0f) + f && motionEvent.getY() > this.x0 - (this.t0 * 2.0f)) {
                if (motionEvent.getY() < (this.t0 * 2.0f) + this.y0) {
                    this.z0 = true;
                }
            }
        }
        if (motionEvent.getAction() != 2 || !this.z0) {
            if (motionEvent.getAction() == 1 && this.z0) {
                this.z0 = false;
                post(new b(19, this));
            }
            return true;
        }
        float f3 = this.w0;
        float y = motionEvent.getY();
        float f4 = this.x0;
        if (y < f4) {
            this.w0 = f4;
        } else {
            float y2 = motionEvent.getY();
            float f5 = this.y0;
            if (y2 > f5) {
                this.w0 = f5;
            } else {
                this.w0 = motionEvent.getY();
            }
        }
        if (this.w0 != f3) {
            invalidate();
        }
        return true;
    }

    @Override // defpackage.yr0
    public void setBrushWidth(final float f) {
        post(new Runnable() { // from class: zr0
            @Override // java.lang.Runnable
            public final void run() {
                BrushWidthViewImpl brushWidthViewImpl = this.a;
                float f2 = brushWidthViewImpl.A0;
                float f3 = (f - f2) / (brushWidthViewImpl.B0 - f2);
                if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                float f4 = brushWidthViewImpl.y0;
                brushWidthViewImpl.w0 = f4 - ((f4 - brushWidthViewImpl.x0) * f3);
                brushWidthViewImpl.invalidate();
            }
        });
    }

    public void setMaxBrushWidth(float f) {
        this.B0 = f;
    }

    public void setMinBrushWidth(float f) {
        this.A0 = f;
    }

    @Override // defpackage.yr0
    public void setPreviewColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public void setSeekBarLineColor(int i) {
        this.a.setColor(i);
    }

    public void setSeekBarLineWidth(float f) {
        this.u0 = f;
    }

    public void setSeekBarToggleColor(int i) {
        this.b.setColor(i);
    }
}
