package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Looper;

/* loaded from: classes2.dex */
public final class r20 extends Drawable {
    public static final int t = (int) vl.o.getResources().getDimension(jtb.attach_drawable);
    public final int a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public boolean k;
    public final Paint l;
    public final Paint m;
    public final Drawable n;
    public final RectF o;
    public ValueAnimator p;
    public final q20 q;
    public final q20 r;
    public final b s;

    public r20(Context context) {
        this(context, woc.m0);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00d8 A[PHI: r4
      0x00d8: PHI (r4v13 boolean) = (r4v12 boolean), (r4v14 boolean) binds: [B:35:0x00a6, B:52:0x00ce] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.graphics.Canvas r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r20.b(android.graphics.Canvas, boolean):void");
    }

    public final boolean c() {
        return (this.b != 0 && this.g == this.e && this.f == 270) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        b(canvas, true);
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
    public final void invalidateSelf() {
        b bVar = this.s;
        unscheduleSelf(bVar);
        scheduleSelf(bVar, 0L);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        if (this.b == 0 && i != 0) {
            this.g = i;
            if (this.f == 270) {
                this.e = i;
            }
        }
        float f = i / 10000.0f;
        if (f == -0.1f) {
            this.k = false;
        } else if (f == -0.2f) {
            this.k = true;
        } else {
            if (i == 0) {
                this.j = System.currentTimeMillis() + 150;
            }
            boolean zC = c();
            q20 q20Var = this.r;
            q20 q20Var2 = this.q;
            if (zC || i < this.b || i == 10000) {
                this.b = i;
                if (this.p != null) {
                    if (Looper.getMainLooper().isCurrentThread()) {
                        this.p.cancel();
                    } else {
                        unscheduleSelf(q20Var2);
                        unscheduleSelf(q20Var);
                        scheduleSelf(q20Var2, 0L);
                    }
                }
            } else {
                if (this.p == null) {
                    ValueAnimator valueAnimator = new ValueAnimator();
                    this.p = valueAnimator;
                    valueAnimator.addUpdateListener(new z00(1, this));
                    this.p.setDuration(200L);
                } else if (Looper.getMainLooper().isCurrentThread()) {
                    this.p.cancel();
                } else {
                    unscheduleSelf(q20Var2);
                    unscheduleSelf(q20Var);
                    scheduleSelf(q20Var2, 0L);
                }
                this.p.setIntValues(this.b, i);
                if (Looper.getMainLooper().isCurrentThread()) {
                    this.p.start();
                } else {
                    unscheduleSelf(q20Var2);
                    unscheduleSelf(q20Var);
                    scheduleSelf(q20Var, 0L);
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
        if (this.d || rect.width() <= 0 || rect.width() >= t) {
            return;
        }
        this.c = rect.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public r20(Context context, int i) {
        this.c = t;
        this.e = 0;
        this.f = 270;
        this.j = 0L;
        this.k = true;
        this.o = new RectF();
        this.q = new q20(this, 0);
        this.r = new q20(this, 1);
        this.s = new b(11, this);
        int i2 = bk4.b().b;
        this.a = i2;
        khe kheVar = sme.a0;
        sme smeVarR = fm9.R(context);
        Paint paint = new Paint();
        this.l = paint;
        paint.setColor(smeVarR.r);
        paint.setAntiAlias(true);
        int i3 = smeVarR.t;
        if (i > 0) {
            this.n = ngg.u(i, i3, context);
        }
        Paint paint2 = new Paint();
        this.m = paint2;
        paint2.setColor(i3);
        paint2.setStrokeWidth(i2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAntiAlias(true);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        if (this.d || getBounds().width() <= 0 || getBounds().width() >= t) {
            return;
        }
        this.c = getBounds().width();
    }
}
