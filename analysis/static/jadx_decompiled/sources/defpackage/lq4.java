package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public final class lq4 extends g06 {
    public final Drawable X;
    public final int Y;
    public final int Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq4(Drawable drawable, Drawable drawable2) {
        super(drawable);
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        this.X = drawable2;
        this.Y = intrinsicWidth;
        this.Z = intrinsicHeight;
    }

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int iCenterX = getBounds().centerX();
        int i = this.Y;
        int i2 = iCenterX - (i / 2);
        int iCenterY = getBounds().centerY();
        int i3 = this.Z;
        int i4 = iCenterY - (i3 / 2);
        int iCenterX2 = (i / 2) + getBounds().centerX();
        int iCenterY2 = (i3 / 2) + getBounds().centerY();
        Drawable drawable = this.X;
        drawable.setBounds(i2, i4, iCenterX2, iCenterY2);
        drawable.draw(canvas);
    }
}
