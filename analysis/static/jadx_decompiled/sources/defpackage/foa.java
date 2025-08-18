package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.view.View;
import one.me.image.crop.view.ImageCropView;

/* loaded from: classes2.dex */
public final class foa extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Paint D0;
    public int E0;
    public float F0;
    public float G0;
    public int H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public goa M0;
    public boolean N0;
    public final RectF a;
    public final RectF b;
    public float[] c;
    public int o;
    public int s0;
    public float t0;
    public float[] u0;
    public boolean v0;
    public boolean w0;
    public boolean x0;
    public int y0;
    public final Path z0;

    public foa(Context context) {
        super(context, null, 0);
        this.a = new RectF();
        this.b = new RectF();
        this.u0 = null;
        this.z0 = new Path();
        Paint paint = new Paint(1);
        this.A0 = paint;
        Paint paint2 = new Paint(1);
        this.B0 = paint2;
        Paint paint3 = new Paint(1);
        this.C0 = paint3;
        Paint paint4 = new Paint(1);
        this.D0 = paint4;
        this.E0 = 0;
        this.F0 = -1.0f;
        this.G0 = -1.0f;
        this.H0 = -1;
        this.I0 = Math.round(getResources().getDisplayMetrics().density * 30.0f);
        this.J0 = Math.round(getResources().getDisplayMetrics().density * 100.0f);
        this.K0 = Math.round(getResources().getDisplayMetrics().density * 10.0f);
        this.L0 = Math.round(getResources().getDisplayMetrics().density * 20.0f);
        this.y0 = -1946157056;
        paint.setColor(-1946157056);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(1.0f);
        paint3.setStrokeWidth(Math.round(getResources().getDisplayMetrics().density * 1.0f));
        paint3.setColor(-1);
        paint3.setStyle(style);
        paint4.setStrokeWidth(r9 * 3);
        paint4.setColor(-1);
        paint4.setStyle(style);
        this.v0 = true;
        paint2.setStrokeWidth(Math.round(getResources().getDisplayMetrics().density * 1.0f));
        paint2.setColor(-2130706433);
        this.o = 2;
        this.s0 = 2;
        this.w0 = true;
    }

    public final void a(RectF rectF, float f) {
        int measuredWidth = getMeasuredWidth();
        int i = this.L0;
        int i2 = measuredWidth - (i * 2);
        int measuredHeight = getMeasuredHeight() - (i * 2);
        int i3 = (int) (i2 / f);
        if (i3 <= measuredHeight) {
            int i4 = (measuredHeight - i3) / 2;
            rectF.set(i, i4 + i, i2 + i, i3 + i4 + i);
        } else {
            int i5 = (i2 - ((int) (measuredHeight * f))) / 2;
            rectF.set(i5 + i, i, r6 + i5 + i, measuredHeight + i);
        }
    }

    public final void b() {
        RectF rectF = this.a;
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = ((f3 - f) / 2.0f) + f;
        float f5 = rectF.bottom;
        float f6 = ((f5 - f2) / 2.0f) + f2;
        this.c = new float[]{f, f2, f4, f2, f3, f2, f3, f6, f3, f5, f4, f5, f, f5, f, f6, f4, f6};
        rectF.centerX();
        rectF.centerY();
        this.u0 = null;
        Path path = this.z0;
        path.reset();
        path.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
    }

    public RectF getCropViewRect() {
        return this.a;
    }

    public int getFreestyleCropMode() {
        return this.E0;
    }

    public goa getOverlayViewChangeListener() {
        return this.M0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        boolean z = this.x0;
        RectF rectF = this.a;
        if (z) {
            canvas.clipPath(this.z0, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(rectF, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.y0);
        canvas.restore();
        if (this.x0) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A0);
        }
        if (this.w0) {
            if (this.u0 == null && !rectF.isEmpty()) {
                this.u0 = new float[(this.s0 * 4) + (this.o * 4)];
                int i = 0;
                for (int i2 = 0; i2 < this.o; i2++) {
                    float[] fArr = this.u0;
                    fArr[i] = rectF.left;
                    float f = i2 + 1.0f;
                    fArr[i + 1] = ((f / (this.o + 1)) * rectF.height()) + rectF.top;
                    float[] fArr2 = this.u0;
                    int i3 = i + 3;
                    fArr2[i + 2] = rectF.right;
                    i += 4;
                    fArr2[i3] = ((f / (this.o + 1)) * rectF.height()) + rectF.top;
                }
                for (int i4 = 0; i4 < this.s0; i4++) {
                    float f2 = i4 + 1.0f;
                    this.u0[i] = ((f2 / (this.s0 + 1)) * rectF.width()) + rectF.left;
                    float[] fArr3 = this.u0;
                    fArr3[i + 1] = rectF.top;
                    int i5 = i + 3;
                    fArr3[i + 2] = ((f2 / (this.s0 + 1)) * rectF.width()) + rectF.left;
                    i += 4;
                    this.u0[i5] = rectF.bottom;
                }
            }
            float[] fArr4 = this.u0;
            if (fArr4 != null) {
                canvas.drawLines(fArr4, this.B0);
            }
        }
        if (this.v0) {
            canvas.drawRect(rectF, this.C0);
        }
        if (this.E0 != 0) {
            canvas.save();
            RectF rectF2 = this.b;
            float f3 = rectF.left;
            float f4 = this.K0;
            rectF2.set(f3 + f4, rectF.top - f4, ((rectF.width() / 2.0f) + f3) - f4, rectF.bottom + f4);
            Region.Op op = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF2, op);
            rectF2.set((f4 / 2.0f) + (rectF.right - (rectF.width() / 2.0f)), rectF.top - f4, rectF.right - f4, rectF.bottom + f4);
            canvas.clipRect(rectF2, op);
            float f5 = rectF.left - f4;
            float f6 = rectF.top;
            rectF2.set(f5, f6 + f4, rectF.right + f4, ((rectF.height() / 2.0f) + f6) - f4);
            canvas.clipRect(rectF2, op);
            rectF2.set(rectF.left - f4, (rectF.bottom - (rectF.height() / 2.0f)) + f4, rectF.right + f4, rectF.bottom - f4);
            canvas.clipRect(rectF2, op);
            canvas.drawRect(rectF, this.D0);
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && this.N0) {
            this.N0 = false;
            setTargetAspectRatio(this.t0);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f7  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.foa.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setCircleDimmedLayer(boolean z) {
        this.x0 = z;
    }

    public void setCropFrameColor(int i) {
        this.C0.setColor(i);
    }

    public void setCropFrameStrokeWidth(int i) {
        this.C0.setStrokeWidth(i);
    }

    public void setCropGridColor(int i) {
        this.B0.setColor(i);
    }

    public void setCropGridColumnCount(int i) {
        this.s0 = i;
        this.u0 = null;
    }

    public void setCropGridRowCount(int i) {
        this.o = i;
        this.u0 = null;
    }

    public void setCropGridStrokeWidth(int i) {
        this.B0.setStrokeWidth(i);
    }

    public void setDimmedColor(int i) {
        this.y0 = i;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z) {
        this.E0 = z ? 1 : 0;
    }

    public void setFreestyleCropMode(int i) {
        this.E0 = i;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(goa goaVar) {
        this.M0 = goaVar;
    }

    public void setShowCropFrame(boolean z) {
        this.v0 = z;
    }

    public void setShowCropGrid(boolean z) {
        this.w0 = z;
    }

    public void setTargetAspectRatio(float f) {
        this.t0 = f;
        if (getMeasuredWidth() <= 0) {
            this.N0 = true;
            return;
        }
        RectF rectF = this.a;
        a(rectF, this.t0);
        goa goaVar = this.M0;
        if (goaVar != null) {
            ((ImageCropView) goaVar).a.setCropRect(rectF);
        }
        b();
        postInvalidate();
    }
}
