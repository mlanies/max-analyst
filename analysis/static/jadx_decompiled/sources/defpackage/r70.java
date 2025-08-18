package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes2.dex */
public final class r70 extends View implements kre {
    public static final IntEvaluator F0 = new IntEvaluator();
    public hs A0;
    public Byte B0;
    public long C0;
    public boolean D0;
    public q70 E0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public byte[] s0;
    public long t0;
    public boolean u0;
    public boolean v0;
    public final Paint w0;
    public final Paint x0;
    public final Paint y0;
    public final Path z0;

    public r70(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        this.z0 = new Path();
        setLayerType(1, null);
        setPadding((int) ((fk4.d().getDisplayMetrics().density * 2.0f) + (fk4.d().getDisplayMetrics().density * 4.0f)), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        this.b = fk4.d().getDisplayMetrics().density * 4.0f;
        this.c = fk4.d().getDisplayMetrics().density * 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.w0 = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        this.y0 = paint2;
        this.x0 = new Paint(paint);
        c54.c(this);
        if (c54.K(this)) {
            setScaleX(-1.0f);
        }
        onThemeChanged(qp4.u0.j(this));
    }

    public final float a(MotionEvent motionEvent) {
        int[] iArr = this.a;
        getLocationOnScreen(iArr);
        float rawX = motionEvent.getRawX();
        int paddingLeft = getPaddingLeft() + iArr[0];
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        if (rawX >= paddingLeft + width) {
            return 1.0f;
        }
        float f = paddingLeft;
        if (rawX <= f) {
            return 0.0f;
        }
        return (rawX - f) / width;
    }

    public final long getDuration() {
        return this.C0;
    }

    public final int getPeaksCount() {
        return (int) ((getMeasuredWidth() - getPaddingLeft()) / (this.c + this.o));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Path path = this.z0;
        if (path.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float width2 = ((this.t0 / this.C0) * getWidth()) + getPaddingLeft();
        boolean z = this.v0 || this.D0;
        float f = fk4.d().getDisplayMetrics().density * 4.0f;
        if (this.D0) {
            f += fk4.d().getDisplayMetrics().density * 2.0f;
        }
        if (z) {
            canvas.save();
            width = width2 > ((float) getWidth()) - f ? getWidth() - f : width2;
        } else {
            width = 0.0f;
        }
        Paint paint = this.w0;
        if (!z) {
            canvas.drawPath(path, paint);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, width2, canvas.getHeight());
            canvas.drawPath(path, this.x0);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(width2, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, f, this.y0);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.s0 == null) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        int iG;
        if (this.u0) {
            fkaVar.getIcon();
            iG = f8.G(-1, 0.5f);
        } else {
            iG = f8.G(fkaVar.getIcon().k, 0.5f);
        }
        this.w0.setColor(iG);
        fkaVar.getIcon();
        this.y0.setColor(-1);
        this.x0.setColor(-1);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.v0
            if (r0 != 0) goto Le
            boolean r0 = r5.D0
            if (r0 == 0) goto L9
            goto Le
        L9:
            boolean r5 = super.onTouchEvent(r6)
            return r5
        Le:
            int r0 = r6.getAction()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L9a
            if (r0 == r2) goto L57
            r3 = 2
            if (r0 == r3) goto L20
            r3 = 3
            if (r0 == r3) goto L57
            goto La9
        L20:
            boolean r0 = r5.D0
            if (r0 != 0) goto L26
            goto La9
        L26:
            float r0 = r5.a(r6)
            long r3 = r5.C0
            float r1 = (float) r3
            float r0 = r0 * r1
            long r0 = (long) r0
            r5.t0 = r0
            q70 r0 = r5.E0
            if (r0 == 0) goto L53
            float r6 = r5.a(r6)
            wva r0 = (defpackage.wva) r0
            java.lang.Object r1 = r0.b
            r70 r1 = (defpackage.r70) r1
            long r3 = r1.getDuration()
            float r1 = (float) r3
            float r1 = r1 * r6
            long r3 = (long) r1
            java.lang.String r6 = defpackage.tfg.d(r3)
            java.lang.Object r0 = r0.c
            lsf r0 = (defpackage.lsf) r0
            android.widget.TextView r0 = r0.x0
            r0.setText(r6)
        L53:
            r5.postInvalidate()
            goto L98
        L57:
            r5.D0 = r1
            q70 r0 = r5.E0
            if (r0 == 0) goto L91
            float r6 = r5.a(r6)
            wva r0 = (defpackage.wva) r0
            java.lang.Object r0 = r0.c
            lsf r0 = (defpackage.lsf) r0
            isf r0 = r0.o
            if (r0 == 0) goto L91
            y8 r0 = (defpackage.y8) r0
            bc7[] r3 = one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget.b1
            java.lang.Object r0 = r0.a
            one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget r0 = (one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget) r0
            cbc r0 = r0.I0()
            w7c r3 = r0.x0
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Long r3 = (java.lang.Long) r3
            if (r3 == 0) goto L91
            long r3 = r3.longValue()
            am7 r0 = r0.u()
            float r3 = (float) r3
            float r6 = r6 * r3
            long r3 = (long) r6
            r0.seekTo(r3)
        L91:
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
        L98:
            r1 = r2
            goto La9
        L9a:
            boolean r6 = r5.u0
            if (r6 != 0) goto L9f
            goto La9
        L9f:
            r5.D0 = r2
            android.view.ViewParent r5 = r5.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L98
        La9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r70.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setLinesColor(int i) {
        this.w0.setColor(i);
        invalidate();
    }

    public final void setListener(q70 q70Var) {
        this.E0 = q70Var;
    }
}
