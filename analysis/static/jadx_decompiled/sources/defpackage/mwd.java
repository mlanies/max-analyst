package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class mwd extends Drawable {
    public static final Paint d;
    public final nwd a;
    public final Rect b;
    public final Paint c;

    static {
        Paint paint = new Paint();
        paint.setColor(0);
        d = paint;
    }

    public mwd(nwd nwdVar) {
        this.a = nwdVar;
        this.b = new Rect();
        this.c = new Paint(2);
        int i = nwdVar.b;
        setBounds(0, 0, i, i);
        a();
    }

    public final void a() {
        int iCenterX = getBounds().centerX();
        int iCenterY = getBounds().centerY();
        int i = this.a.b / 2;
        this.b.set(iCenterX - i, iCenterY - i, iCenterX + i, iCenterY + i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        nwd nwdVar = this.a;
        Bitmap bitmapO = nwdVar.e.o(nwdVar.a);
        Rect rect = this.b;
        if (bitmapO == null) {
            canvas.drawRect(rect, d);
        } else {
            Rect rect2 = iy4.c;
            canvas.drawBitmap(bitmapO, iy4.c, rect, this.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mwd) && tpa.f(this.a, ((mwd) obj).a);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return getBounds().height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.a.b = i4;
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.c.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public final String toString() {
        return "SpriteEmojiDrawable(state=" + this.a + ")";
    }

    public mwd(ty4 ty4Var, int i, nw4 nw4Var) {
        this(new nwd(new nx4(ty4Var.b, ty4Var.c, ty4Var.d), i, nw4Var));
    }
}
