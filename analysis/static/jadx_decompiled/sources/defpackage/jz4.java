package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class jz4 extends Drawable {
    public final Rect a = new Rect();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        Rect rect2 = this.a;
        rect2.set(rect);
        rect2.right = 0;
        super.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
