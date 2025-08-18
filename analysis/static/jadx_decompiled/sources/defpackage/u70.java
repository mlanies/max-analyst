package defpackage;

import android.animation.IntEvaluator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

/* loaded from: classes2.dex */
public final class u70 extends View implements kre {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public t70 H0;
    public final byte[] I0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public final float s0;
    public byte[] t0;
    public byte[] u0;
    public long v0;
    public long w0;
    public boolean x0;
    public int y0;
    public final Paint z0;

    public u70(Context context) {
        super(context, null, 0);
        this.a = new int[2];
        this.D0 = new Path();
        setLayerType(1, null);
        this.b = fk4.d().getDisplayMetrics().density * 5.0f;
        this.c = fk4.d().getDisplayMetrics().density * 2.0f;
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.s0 = fk4.d().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.z0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.C0 = paint3;
        this.A0 = new Paint(paint);
        c54.c(this);
        if (c54.K(this)) {
            setScaleX(-1.0f);
        }
        this.I0 = new byte[0];
    }

    private final int getDataWidth() {
        if (this.u0 == null) {
            return 0;
        }
        return (int) (((r0.length - 1) * this.c) + (r0.length * this.o));
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r5.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r6 = r6.getRawX()
            int r1 = r5.getWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 != 0) goto L17
        L15:
            r6 = r3
            goto L29
        L17:
            int r4 = r0 + r1
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L20
            r6 = r2
            goto L29
        L20:
            float r0 = (float) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L26
            goto L15
        L26:
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
        L29:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L35
            long r5 = r5.v0
            r0 = 1
            long r5 = r5 - r0
            float r5 = (float) r5
            float r6 = r2 / r5
        L35:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.a(android.view.MotionEvent):float");
    }

    public final void b(long j, byte[] bArr) {
        this.t0 = bArr;
        this.u0 = null;
        this.v0 = j;
        this.w0 = 0L;
        this.y0 = 0;
        onThemeChanged(qp4.u0.j(this));
        Path path = this.D0;
        if (!path.isEmpty()) {
            path.reset();
        }
        requestLayout();
        postInvalidate();
    }

    public final void c(float f, boolean z) {
        this.w0 = (long) (f * this.v0);
        this.x0 = z;
        if (!z) {
            this.G0 = false;
        }
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width;
        Path path = this.D0;
        if (path.isEmpty()) {
            return;
        }
        float measuredHeight = getMeasuredHeight() / 2.0f;
        float f = 6;
        float fM = ((this.w0 / this.v0) * wg0.m(f, fk4.d().getDisplayMetrics().density, 2, getWidth())) + tu0.G(f * fk4.d().getDisplayMetrics().density);
        boolean z = this.x0 || this.G0;
        float f2 = fk4.d().getDisplayMetrics().density * 4.0f;
        if (this.G0) {
            f2 += fk4.d().getDisplayMetrics().density * 2.0f;
        }
        if (z) {
            canvas.save();
            float f3 = (fk4.d().getDisplayMetrics().density * 2.0f) + f2;
            width = fM < f3 ? f3 : fM;
            if (width > getWidth() - f3) {
                width = getWidth() - f3;
            }
        } else {
            width = 0.0f;
        }
        Paint paint = this.z0;
        if (!z) {
            canvas.drawPath(path, paint);
            return;
        }
        int iSave = canvas.save();
        try {
            canvas.clipRect(0.0f, 0.0f, fM, canvas.getHeight());
            canvas.drawPath(path, this.A0);
            canvas.restoreToCount(iSave);
            iSave = canvas.save();
            try {
                canvas.clipRect(fM, 0.0f, canvas.getWidth(), canvas.getHeight());
                canvas.drawPath(path, paint);
                canvas.restoreToCount(iSave);
                canvas.drawCircle(width, measuredHeight, this.s0 + f2, this.C0);
                canvas.drawCircle(width, measuredHeight, f2, this.B0);
            } finally {
            }
        } finally {
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iIntValue;
        byte[] bArr = this.t0;
        if (bArr == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        byte[] bArr2 = this.u0;
        float f = this.o;
        float f2 = this.c;
        if (bArr2 == null || this.y0 != size) {
            int iG = (int) (((size + f2) - (tu0.G(6 * fk4.d().getDisplayMetrics().density) * 2)) / (f2 + f));
            if (iG < 0) {
                hm9.m0("u70", "Width is very small " + size, new Object[0]);
                bArr = this.I0;
            } else if (bArr.length != 0) {
                IntEvaluator intEvaluator = new IntEvaluator();
                byte[] bArr3 = new byte[iG];
                for (int i3 = 0; i3 < iG; i3++) {
                    if (i3 == 0 || bArr.length == 1) {
                        iIntValue = bArr[0];
                    } else if (i3 == iG - 1) {
                        iIntValue = bArr[bArr.length - 1];
                    } else {
                        float length = (i3 / iG) * (bArr.length - 1);
                        int i4 = (int) length;
                        int i5 = i4 + 1;
                        iIntValue = (i4 >= bArr.length - 1 || i5 >= bArr.length - 1) ? 0 : intEvaluator.evaluate(length - i4, Integer.valueOf(bArr[i4]), Integer.valueOf(bArr[i5])).intValue();
                    }
                    bArr3[i3] = (byte) iIntValue;
                }
                bArr = bArr3;
            }
            this.u0 = bArr;
            this.y0 = size;
        }
        setMeasuredDimension(rh4.c(6, fk4.d().getDisplayMetrics().density, getDataWidth()), View.MeasureSpec.getSize(i2));
        byte[] bArr4 = this.u0;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        Path path = this.D0;
        path.reset();
        if (bArr4 != null) {
            if (!(bArr4.length == 0)) {
                float fG = (f / 2.0f) + tu0.G(r3 * fk4.d().getDisplayMetrics().density);
                for (byte b : bArr4) {
                    float measuredHeight2 = (getMeasuredHeight() / 127.0f) * b;
                    float f3 = this.b;
                    if (measuredHeight2 < f3) {
                        measuredHeight2 = f3;
                    }
                    float f4 = measuredHeight2 / 2.0f;
                    path.moveTo(fG, measuredHeight - f4);
                    path.lineTo(fG, f4 + measuredHeight);
                    fG = fG + f + f2;
                }
            }
        }
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        boolean z = this.F0;
        pq9 pq9Var = qp4.u0;
        is0 is0VarG = z ? pq9Var.j(this).a().g() : pq9Var.j(this).a().k();
        Paint paint = this.z0;
        bs0 bs0Var = is0VarG.a;
        paint.setColor(bs0Var.f);
        this.B0.setColor(bs0Var.e);
        this.C0.setColor(is0VarG.c.a);
        this.A0.setColor(bs0Var.e);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r12) {
        /*
            r11 = this;
            boolean r0 = r11.x0
            if (r0 != 0) goto Le
            boolean r0 = r11.G0
            if (r0 == 0) goto L9
            goto Le
        L9:
            boolean r11 = super.onTouchEvent(r12)
            return r11
        Le:
            int r0 = r12.getAction()
            r1 = 1
            if (r0 == 0) goto L87
            r2 = 0
            if (r0 == r1) goto L4f
            r3 = 2
            if (r0 == r3) goto L20
            r3 = 3
            if (r0 == r3) goto L4f
            goto L99
        L20:
            boolean r0 = r11.G0
            if (r0 != 0) goto L26
            goto L99
        L26:
            boolean r0 = r11.E0
            if (r0 == 0) goto L2c
            r11.E0 = r2
        L2c:
            t70 r0 = r11.H0
            if (r0 == 0) goto L99
            float r11 = r11.a(r12)
            rxd r0 = (defpackage.rxd) r0
            java.lang.Object r12 = r0.b
            p50 r12 = (defpackage.p50) r12
            k56 r0 = r12.b
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L49
            goto L99
        L49:
            u70 r12 = r12.D0
            r12.c(r11, r1)
            goto L99
        L4f:
            r11.E0 = r2
            r11.G0 = r2
            t70 r0 = r11.H0
            if (r0 == 0) goto L7f
            float r12 = r11.a(r12)
            rxd r0 = (defpackage.rxd) r0
            java.lang.Object r0 = r0.b
            p50 r0 = (defpackage.p50) r0
            java.lang.Long r3 = r0.P0
            if (r3 == 0) goto L7f
            long r9 = r3.longValue()
            java.lang.Long r3 = r0.O0
            if (r3 == 0) goto L7f
            long r5 = r3.longValue()
            f19 r3 = new f19
            float r4 = (float) r9
            float r12 = r12 * r4
            long r7 = (long) r12
            r4 = r3
            r4.<init>(r5, r7, r9)
            m56 r12 = r0.a
            r12.invoke(r3)
        L7f:
            android.view.ViewParent r11 = r11.getParent()
            r11.requestDisallowInterceptTouchEvent(r2)
            goto L99
        L87:
            r11.E0 = r1
            r11.G0 = r1
            android.view.ViewParent r0 = r11.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            t70 r0 = r11.H0
            if (r0 == 0) goto L99
            r11.a(r12)
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u70.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setInInput(boolean z) {
    }

    public final void setIncomingMessage(boolean z) {
        this.F0 = z;
    }

    public final void setListener(t70 t70Var) {
        this.H0 = t70Var;
    }
}
