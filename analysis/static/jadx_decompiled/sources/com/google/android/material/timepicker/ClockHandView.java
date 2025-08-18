package com.google.android.material.timepicker;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import defpackage.f43;
import defpackage.m2c;
import defpackage.mqd;
import defpackage.og;
import defpackage.stb;
import defpackage.tsb;
import defpackage.z2c;
import defpackage.z7;
import defpackage.zmf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
class ClockHandView extends View {
    public int A0;
    public final ValueAnimator a;
    public boolean b;
    public final ArrayList c;
    public final int o;
    public final float s0;
    public final Paint t0;
    public final RectF u0;
    public final int v0;
    public float w0;
    public boolean x0;
    public double y0;
    public int z0;

    /* JADX WARN: Illegal instructions before constructor call */
    public ClockHandView(Context context, AttributeSet attributeSet) {
        int i = tsb.materialClockStyle;
        super(context, attributeSet, i);
        this.a = new ValueAnimator();
        this.c = new ArrayList();
        Paint paint = new Paint();
        this.t0 = paint;
        this.u0 = new RectF();
        this.A0 = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z2c.ClockHandView, i, m2c.Widget_MaterialComponents_TimePicker_Clock);
        z7.P(tsb.motionDurationLong2, 200, context);
        z7.Q(context, tsb.motionEasingEmphasizedInterpolator, og.b);
        this.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.ClockHandView_materialCircleRadius, 0);
        this.o = typedArrayObtainStyledAttributes.getDimensionPixelSize(z2c.ClockHandView_selectorSize, 0);
        this.v0 = getResources().getDimensionPixelSize(stb.material_clock_hand_stroke_width);
        this.s0 = r0.getDimensionPixelSize(stb.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(z2c.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        b(0.0f);
        ViewConfiguration.get(context).getScaledTouchSlop();
        WeakHashMap weakHashMap = zmf.a;
        setImportantForAccessibility(2);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final int a(int i) {
        int i2 = this.z0;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }

    public final void b(float f) {
        ValueAnimator valueAnimator = this.a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        c(f);
    }

    public final void c(float f) {
        float f2 = f % 360.0f;
        this.w0 = f2;
        this.y0 = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fA = a(this.A0);
        float fCos = (((float) Math.cos(this.y0)) * fA) + width;
        float fSin = (fA * ((float) Math.sin(this.y0))) + height;
        float f3 = this.o;
        this.u0.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ClockFaceView clockFaceView = (ClockFaceView) ((f43) it.next());
            if (Math.abs(clockFaceView.W0 - f2) > 0.001f) {
                clockFaceView.W0 = f2;
                clockFaceView.x();
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fA = a(this.A0);
        float fCos = (((float) Math.cos(this.y0)) * fA) + f;
        float f2 = height;
        float fSin = (fA * ((float) Math.sin(this.y0))) + f2;
        Paint paint = this.t0;
        paint.setStrokeWidth(0.0f);
        canvas.drawCircle(fCos, fSin, this.o, paint);
        double dSin = Math.sin(this.y0);
        paint.setStrokeWidth(this.v0);
        canvas.drawLine(f, f2, width + ((int) (Math.cos(this.y0) * d)), height + ((int) (d * dSin)), paint);
        canvas.drawCircle(f, f2, this.s0, paint);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.a.isRunning()) {
            return;
        }
        b(this.w0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        boolean z3 = false;
        if (actionMasked == 0) {
            this.x0 = false;
            z = true;
            z2 = false;
        } else if (actionMasked == 1 || actionMasked == 2) {
            z2 = this.x0;
            if (this.b) {
                this.A0 = ((float) Math.hypot((double) (x - ((float) (getWidth() / 2))), (double) (y - ((float) (getHeight() / 2))))) <= ((float) a(2)) + mqd.h(getContext(), 12) ? 2 : 1;
            }
            z = false;
        } else {
            z2 = false;
            z = false;
        }
        boolean z4 = this.x0;
        int degrees = (int) Math.toDegrees(Math.atan2(y - (getHeight() / 2), x - (getWidth() / 2)));
        int i = degrees + 90;
        if (i < 0) {
            i = degrees + 450;
        }
        float f = i;
        boolean z5 = this.w0 != f;
        if (z && z5) {
            z3 = true;
        } else if (z5 || z2) {
            b(f);
            z3 = true;
        }
        this.x0 = z4 | z3;
        return true;
    }
}
