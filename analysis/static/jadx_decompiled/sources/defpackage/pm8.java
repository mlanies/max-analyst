package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public final class pm8 extends View implements kre {
    public final int a;
    public final int b;
    public final float c;
    public final Drawable o;
    public final je7 s0;

    public pm8(Context context) {
        super(context);
        int iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.a = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        this.b = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        this.c = fk4.d().getDisplayMetrics().density * 16.0f;
        Drawable drawableB = kt3.b(getContext(), woc.Q);
        drawableB.setBounds(0, 0, iG, iG);
        drawableB.setTint(getDrawableColor());
        this.o = drawableB;
        this.s0 = tu0.r(3, new j78(5));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setTranslationZ(Float.MAX_VALUE);
    }

    private final int getBackgroundColor() {
        qp4.u0.j(this).a().s().b.getClass();
        return 1543503872;
    }

    private final Paint getBackgroundPaint() {
        return (Paint) this.s0.getValue();
    }

    private final int getDrawableColor() {
        qp4.u0.j(this).a().s().c.getClass();
        return -1;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        getBackgroundPaint().setColor(getBackgroundColor());
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        float f = this.c;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, getBackgroundPaint());
        float f2 = this.b;
        float f3 = this.a;
        int iSave = canvas.save();
        canvas.translate(f2, f3);
        try {
            this.o.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Drawable drawable = this.o;
        setMeasuredDimension((this.b * 2) + drawable.getBounds().width(), (this.a * 2) + drawable.getBounds().height());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setTint(getDrawableColor());
    }
}
