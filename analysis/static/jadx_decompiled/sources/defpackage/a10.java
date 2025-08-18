package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class a10 extends Drawable {
    public Drawable a;
    public boolean b;
    public int c = tu0.G(56 * fk4.d().getDisplayMetrics().density);
    public boolean d = true;
    public boolean e = true;
    public int f;
    public final float g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public long l;
    public final RectF m;
    public ValueAnimator n;
    public long o;
    public final Paint p;

    public a10() {
        float f = fk4.d().getDisplayMetrics().density * 2.0f;
        this.g = f;
        this.i = 270;
        this.m = new RectF();
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        this.p = paint;
    }

    public final boolean a() {
        return (this.f != 0 && this.j == this.h && this.i == 270) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9 A[PHI: r14
      0x00d9: PHI (r14v6 boolean) = (r14v5 boolean), (r14v7 boolean) binds: [B:37:0x00a6, B:53:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a10.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.f == 0 && i != 0) {
            this.j = i;
            this.h = i;
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.d = false;
        } else if (f == -0.2f) {
            this.d = true;
        } else {
            if (i == 0) {
                this.o = System.currentTimeMillis() + 150;
            }
            if (a() || i < this.f || i == 10000) {
                this.f = i;
                ValueAnimator valueAnimator = this.n;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
            } else {
                ValueAnimator valueAnimator2 = this.n;
                if (valueAnimator2 == null) {
                    ValueAnimator valueAnimator3 = new ValueAnimator();
                    valueAnimator3.addUpdateListener(new z00(0, this));
                    valueAnimator3.setDuration(200L);
                    this.n = valueAnimator3;
                } else if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator valueAnimator4 = this.n;
                if (valueAnimator4 != null) {
                    valueAnimator4.setIntValues(this.f, i);
                }
                ValueAnimator valueAnimator5 = this.n;
                if (valueAnimator5 != null) {
                    valueAnimator5.start();
                }
            }
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        super.setBounds(rect);
        if (this.b || rect.width() <= 0 || rect.width() >= tu0.G(56 * fk4.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        super.setTint(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setTint(i);
        }
        this.p.setColor(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.b || getBounds().width() <= 0 || getBounds().width() >= tu0.G(56 * fk4.d().getDisplayMetrics().density)) {
            return;
        }
        this.c = getBounds().width();
    }
}
