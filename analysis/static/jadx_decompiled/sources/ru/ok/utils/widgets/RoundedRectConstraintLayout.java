package ru.ok.utils.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.g3c;
import defpackage.vnc;

/* loaded from: classes2.dex */
public class RoundedRectConstraintLayout extends ConstraintLayout {
    public Path G0;
    public Paint H0;
    public float[] I0;
    public boolean J0;

    public RoundedRectConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        if (attributeSet == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g3c.RoundedRectConstraintLayout);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(g3c.RoundedRectConstraintLayout_roundRadius, -1);
        typedArrayObtainStyledAttributes.recycle();
        if (dimensionPixelSize != -1) {
            setCornerRadius(dimensionPixelSize);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) throws NumberFormatException {
        super.dispatchDraw(canvas);
        if (this.J0) {
            canvas.drawPath(this.G0, this.H0);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        try {
            return super.drawChild(canvas, view, j);
        } catch (Throwable unused) {
            return false;
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.I0 == null) {
            return;
        }
        Rect rect = new Rect(0, 0, i, i2);
        if (!this.J0) {
            setOutlineProvider(new vnc(rect, this.I0[0], 0));
            return;
        }
        this.G0.reset();
        this.G0.addRoundRect(new RectF(rect), this.I0, Path.Direction.CW);
        if (this.G0.isInverseFillType()) {
            return;
        }
        this.G0.toggleInverseFillType();
    }

    public void setCornerRadius(float f) {
        setCornersRadii(new float[]{f, f, f, f, f, f, f, f});
    }

    public void setCornersRadii(float[] fArr) {
        if (fArr != null && fArr.length != 8) {
            throw new IllegalArgumentException("radii must be array with size == 8");
        }
        this.I0 = fArr;
        boolean z = false;
        if (fArr != null) {
            float f = fArr[0];
            if (f == fArr[1] && f == fArr[2] && f == fArr[3] && f == fArr[4] && f == fArr[5] && f == fArr[6] && f == fArr[7]) {
                z = true;
            }
        }
        boolean z2 = !z;
        this.J0 = z2;
        if (!z2) {
            setClipToOutline(true);
            return;
        }
        setLayerType(2, null);
        this.G0 = new Path();
        Paint paint = new Paint(1);
        this.H0 = paint;
        paint.setColor(-16777216);
        this.H0.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
