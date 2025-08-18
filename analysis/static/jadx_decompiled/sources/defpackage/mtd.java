package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;

/* loaded from: classes.dex */
public final class mtd extends Drawable implements Animatable, kre {
    public int Y;
    public int Z;
    public final Context a;
    public final m56 b;
    public boolean t0;
    public float u0;
    public final Integer[] c = {3, 1, 2};
    public final Paint o = new Paint(1);
    public final RectF X = new RectF();
    public final q57 s0 = new q57(24, this);

    public mtd(Context context, fka fkaVar, we1 we1Var) {
        this.a = context;
        this.b = we1Var;
        onThemeChanged(fkaVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        float fWidth = bounds.width() / 2.0f;
        float fHeight = bounds.height() / 2.0f;
        int i = this.Y;
        Integer[] numArr = this.c;
        float f = 2;
        float length = fWidth - ((((numArr.length - 1) * tu0.G(fk4.d().getDisplayMetrics().density * f)) + (i * numArr.length)) / 2);
        int length2 = numArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length2) {
            int i4 = i3 + 1;
            int iIntValue = numArr[i2].intValue();
            RectF rectF = this.X;
            float fG = ((tu0.G(fk4.d().getDisplayMetrics().density * f) + this.Y) * i3) + length;
            rectF.left = fG;
            int i5 = this.Z;
            rectF.top = fHeight - (i5 / 2);
            rectF.right = fG + this.Y;
            rectF.bottom = (i5 / 2) + fHeight;
            float fHeight2 = rectF.height() * Math.max(0.3f, (((float) Math.sin(this.u0 + ((numArr.length - iIntValue) + 1))) + 1) / f);
            canvas.drawRoundRect(rectF.left, fHeight - fHeight2, rectF.right, fHeight + fHeight2, fk4.d().getDisplayMetrics().density * 4.0f, fk4.d().getDisplayMetrics().density * 4.0f, this.o);
            i2++;
            i3 = i4;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return this.t0;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        int iWidth = getBounds().width();
        int iG = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        Integer[] numArr = this.c;
        this.Y = (int) (((iWidth - ((numArr.length - 1) * iG)) / numArr.length) * 0.5f);
        this.Z = (int) (r5.height() * 0.3f);
        invalidateSelf();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.o.setColor(((Number) this.b.invoke(qp4.u0.o(this.a).c)).intValue());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.o.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        if (z) {
            start();
        } else {
            stop();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (this.t0) {
            return;
        }
        this.t0 = true;
        scheduleSelf(this.s0, SystemClock.uptimeMillis() + 3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        if (this.t0) {
            this.t0 = false;
            unscheduleSelf(this.s0);
        }
    }
}
