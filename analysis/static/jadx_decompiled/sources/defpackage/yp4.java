package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public final class yp4 extends View implements kre {
    public final Paint a;
    public final RectF b;
    public float c;

    public yp4(Context context) {
        super(context);
        this.a = new Paint();
        this.b = new RectF();
        onThemeChanged(qp4.u0.j(this));
        setClickable(false);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 49));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        RectF rectF = this.b;
        float f = this.c;
        canvas.drawRoundRect(rectF, f, f, this.a);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        RectF rectF = this.b;
        rectF.set(0.0f, 0.0f, fk4.d().getDisplayMetrics().density * 40.0f, fk4.d().getDisplayMetrics().density * 4.0f);
        this.c = rectF.centerY();
        setMeasuredDimension((int) rectF.width(), (int) rectF.height());
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setColor(fkaVar.getIcon().h);
    }
}
