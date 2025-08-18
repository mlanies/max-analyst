package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public final class oe extends View {
    public final Paint a;

    public oe(Context context) {
        super(context, null, 0);
        this.a = new Paint();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, getWidth() / 2.0f, this.a);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        super.onMeasure(i, i2);
    }
}
