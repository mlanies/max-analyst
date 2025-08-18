package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.view.View;

/* loaded from: classes2.dex */
public final class w5d extends View {
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
        int height;
        Layout layout = this.a;
        int lineMax = 0;
        if (layout != null) {
            lineMax = layout.getLineCount() > 0 ? (int) layout.getLineMax(0) : layout.getWidth();
            height = layout.getHeight();
        } else {
            height = 0;
        }
        setMeasuredDimension(lineMax, height);
    }
}
