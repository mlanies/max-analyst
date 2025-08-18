package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class te0 implements nv4 {
    public final Drawable a;
    public final Rect b = new Rect();
    public int c;
    public int d;

    public te0(Drawable drawable) {
        this.a = drawable;
        this.c = drawable.getIntrinsicWidth();
        this.d = drawable.getIntrinsicHeight();
    }

    public static void a(te0 te0Var, int i, int i2, Rect rect) {
        int i3;
        int i4 = te0Var.d;
        int i5 = te0Var.c;
        int i6 = (int) ((i4 / i5) * i);
        if (i6 > i2) {
            i3 = (int) ((i5 / i4) * i2);
            i6 = i2;
        } else {
            i3 = i;
        }
        int i7 = (int) ((i2 - i6) / 2.0f);
        int i8 = (int) ((i - i3) / 2.0f);
        rect.set(i8, i7, i3 + i8, i6 + i7);
    }

    @Override // defpackage.nv4
    public final void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();
        Rect rect = this.b;
        a(this, width, height, rect);
        Drawable drawable = this.a;
        drawable.setBounds(rect);
        drawable.draw(canvas);
    }
}
