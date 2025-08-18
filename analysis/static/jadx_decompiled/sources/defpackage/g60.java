package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class g60 extends AppCompatTextView implements nse {
    public boolean A0;
    public final Paint u0;
    public final float v0;
    public final Path w0;
    public final float x0;
    public Animator y0;
    public boolean z0;

    public g60(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.u0 = paint;
        float f = 4;
        this.v0 = getContext().getResources().getDisplayMetrics().density * f;
        this.w0 = new Path();
        float f2 = ((float) 6.8d) * getContext().getResources().getDisplayMetrics().density;
        this.x0 = f2;
        setClickable(false);
        setOutlineProvider(ViewOutlineProvider.BOUNDS);
        setMinWidth(tu0.G(64 * getContext().getResources().getDisplayMetrics().density));
        float f3 = 12;
        setElevation(getContext().getResources().getDisplayMetrics().density * f3);
        setPadding(tu0.G(f3 * getContext().getResources().getDisplayMetrics().density), tu0.G(getContext().getResources().getDisplayMetrics().density * f), tu0.G(getContext().getResources().getDisplayMetrics().density * f3), tu0.G(f * getContext().getResources().getDisplayMetrics().density) + ((int) f2));
        setTextSize(16.0f);
        setGravity(17);
        setTextAlignment(4);
        setLineHeight(19);
        c();
    }

    @Override // defpackage.nse
    public final void c() {
        sme smeVarR;
        if (isInEditMode()) {
            smeVarR = ee4.e0;
        } else {
            Context context = getContext();
            khe kheVar = sme.a0;
            smeVarR = fm9.R(context);
        }
        this.u0.setColor(smeVarR.D);
        setTextColor(smeVarR.F);
    }

    @Override // android.view.View
    public final boolean isClickable() {
        return false;
    }

    public final ObjectAnimator j(float f, float f2) {
        return ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator = this.y0;
        if (animator != null) {
            animator.cancel();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawPath(this.w0, this.u0);
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(tu0.G(getContext().getResources().getDisplayMetrics().density * 33.8f), 1073741824));
        setPivotX(getMeasuredWidth() * 0.5f);
        setPivotY(getMeasuredHeight());
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Path path = this.w0;
        path.reset();
        float f = i;
        float f2 = this.v0;
        float f3 = 2 * f2;
        float f4 = i2;
        float f5 = f4 - f3;
        path.moveTo(f, f2 + 0.0f);
        float f6 = f - f3;
        float f7 = f3 + 0.0f;
        path.arcTo(f6, 0.0f, f, f7, 0.0f, -90.0f, false);
        path.rLineTo(-f6, 0.0f);
        path.arcTo(0.0f, 0.0f, f7, f7, 270.0f, -90.0f, false);
        path.rLineTo(0.0f, f5);
        path.arcTo(0.0f, f5, f7, f4, 180.0f, -90.0f, false);
        float f8 = this.x0;
        path.lineTo((0.5f * f) - f8, f4);
        path.rLineTo(f8, f8);
        path.rLineTo(f8, -f8);
        path.lineTo(f - f2, f4);
        path.arcTo(f6, f5, f, f4, 90.0f, -90.0f, false);
        path.rLineTo(0.0f, -f5);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    public final void setCurrentAudioPosition(long j) {
        setText(tfg.c(j));
    }

    public final void setLayoutPosition(float f) {
        setX(f - (getMeasuredWidth() * 0.5f));
    }
}
