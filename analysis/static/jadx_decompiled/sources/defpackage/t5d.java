package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.TextPaint;
import android.view.View;

/* loaded from: classes2.dex */
public final class t5d extends View {
    public Layout a;
    public int b;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Layout layout = this.a;
        if (layout != null) {
            layout.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int width;
        int height;
        Layout layout = this.a;
        if (layout != null) {
            width = layout.getWidth();
            height = layout.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        setMeasuredDimension(width, height);
    }

    public final void setLayout(Layout layout) {
        this.a = layout;
        TextPaint paint = layout.getPaint();
        if (paint != null) {
            paint.setColor(this.b);
        }
        requestLayout();
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint paint;
        this.b = i;
        Layout layout = this.a;
        if (layout != null && (paint = layout.getPaint()) != null) {
            paint.setColor(i);
        }
        invalidate();
    }
}
