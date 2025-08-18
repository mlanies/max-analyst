package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class h90 extends g06 implements Runnable {
    public int X;
    public boolean Y;
    public float Z;
    public boolean s0;

    @Override // defpackage.g06, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int iSave = canvas.save();
        Rect bounds = getBounds();
        int i = bounds.right - bounds.left;
        int i2 = bounds.bottom - bounds.top;
        float f = this.Z;
        if (!this.Y) {
            f = 360.0f - f;
        }
        canvas.rotate(f, (i / 2) + r3, (i2 / 2) + r1);
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        if (this.s0) {
            return;
        }
        this.s0 = true;
        scheduleSelf(this, SystemClock.uptimeMillis() + 20);
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.s0 = false;
        this.Z += (int) ((20.0f / this.X) * 360.0f);
        invalidateSelf();
    }
}
