package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* loaded from: classes2.dex */
public final class n63 extends View {
    public Paint a;
    public Paint b;
    public int c;

    public int getColor() {
        return this.a.getColor();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2;
        float height = getHeight() / 2;
        canvas.drawCircle(width, height, getWidth() / 2, this.b);
        canvas.drawCircle(width, height, (getWidth() - (this.c * 2)) / 2, this.a);
    }

    public void setColor(int i) {
        this.a.setColor(i);
        invalidate();
    }
}
