package defpackage;

import android.animation.ValueAnimator;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes2.dex */
public class bmd extends Drawable {
    public final z00 a = new z00(16, this);
    public final Paint b = new Paint(1);
    public final Rect c = new Rect();
    public final Matrix d = new Matrix();
    public ValueAnimator e;
    public yld f;

    public final void a() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator.isStarted()) {
            return;
        }
        yld yldVar = this.f;
        if (yldVar == null) {
            yldVar = null;
        }
        if (!yldVar.k || getCallback() == null) {
            return;
        }
        this.e.start();
    }

    public final void b(yld yldVar) {
        boolean zIsStarted;
        ValueAnimator valueAnimator;
        this.f = yldVar;
        Paint paint = this.b;
        yld yldVar2 = this.f;
        if (yldVar2 == null) {
            yldVar2 = null;
        }
        paint.setXfermode(new PorterDuffXfermode(yldVar2.l ? PorterDuff.Mode.DST_IN : PorterDuff.Mode.SRC_IN));
        e();
        ValueAnimator valueAnimator2 = this.e;
        if (valueAnimator2 != null) {
            zIsStarted = valueAnimator2.isStarted();
            valueAnimator2.cancel();
            valueAnimator2.removeAllUpdateListeners();
        } else {
            zIsStarted = false;
        }
        yld yldVar3 = this.f;
        yld yldVar4 = yldVar3 != null ? yldVar3 : null;
        ValueAnimator valueAnimatorOfFloat = yldVar4.r;
        if (valueAnimatorOfFloat == null) {
            valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, (yldVar4.p / yldVar4.o) + 1.0f);
            valueAnimatorOfFloat.setRepeatMode(yldVar4.n);
            valueAnimatorOfFloat.setRepeatCount(yldVar4.m);
            valueAnimatorOfFloat.setDuration(yldVar4.o);
            valueAnimatorOfFloat.setInterpolator(yldVar4.q);
            yldVar4.r = valueAnimatorOfFloat;
        }
        this.e = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(this.a);
        if (zIsStarted && (valueAnimator = this.e) != null) {
            valueAnimator.start();
        }
        invalidateSelf();
    }

    public final void c() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator != null) {
            if ((valueAnimator == null || !valueAnimator.isStarted()) && getCallback() != null) {
                this.e.start();
            }
        }
    }

    public final void d() {
        ValueAnimator valueAnimator = this.e;
        if (valueAnimator == null || valueAnimator == null || !valueAnimator.isStarted()) {
            return;
        }
        this.e.cancel();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0081  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            android.graphics.Paint r0 = r10.b
            android.graphics.Shader r1 = r0.getShader()
            if (r1 != 0) goto L9
            return
        L9:
            yld r1 = r10.f
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = r2
        Lf:
            float r1 = r1.i
            double r3 = (double) r1
            double r3 = java.lang.Math.toRadians(r3)
            double r3 = java.lang.Math.tan(r3)
            float r1 = (float) r3
            android.graphics.Rect r3 = r10.c
            int r4 = r3.height()
            float r4 = (float) r4
            int r5 = r3.width()
            float r5 = (float) r5
            float r5 = r5 * r1
            float r5 = r5 + r4
            int r4 = r3.width()
            float r4 = (float) r4
            int r6 = r3.height()
            float r6 = (float) r6
            float r1 = r1 * r6
            float r1 = r1 + r4
            android.animation.ValueAnimator r4 = r10.e
            r6 = 0
            if (r4 == 0) goto L3f
            float r4 = r4.getAnimatedFraction()
            goto L40
        L3f:
            r4 = r6
        L40:
            yld r7 = r10.f
            if (r7 != 0) goto L45
            r7 = r2
        L45:
            int r7 = r7.c
            int r7 = defpackage.au1.s(r7)
            if (r7 == 0) goto L71
            r8 = 1
            if (r7 == r8) goto L6b
            r8 = 2
            if (r7 == r8) goto L62
            r1 = 3
            if (r7 != r1) goto L5c
            float r1 = -r5
            float r1 = defpackage.z7b.f(r1, r5, r4, r5)
            goto L77
        L5c:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L62:
            float r5 = -r1
            float r1 = defpackage.z7b.f(r5, r1, r4, r1)
        L67:
            r9 = r6
            r6 = r1
            r1 = r9
            goto L77
        L6b:
            float r1 = -r5
            float r1 = defpackage.z7b.f(r5, r1, r4, r1)
            goto L77
        L71:
            float r5 = -r1
            float r1 = defpackage.z7b.f(r1, r5, r4, r5)
            goto L67
        L77:
            android.graphics.Matrix r4 = r10.d
            r4.reset()
            yld r10 = r10.f
            if (r10 != 0) goto L81
            goto L82
        L81:
            r2 = r10
        L82:
            float r10 = r2.i
            int r2 = r3.width()
            float r2 = (float) r2
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r7 = r3.height()
            float r7 = (float) r7
            float r7 = r7 / r5
            r4.setRotate(r10, r2, r7)
            r4.postTranslate(r6, r1)
            android.graphics.Shader r10 = r0.getShader()
            r10.setLocalMatrix(r4)
            r11.drawRect(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.draw(android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            r13 = this;
            android.graphics.Rect r0 = r13.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
            if (r1 == 0) goto L72
            if (r0 != 0) goto L12
            goto L72
        L12:
            yld r2 = r13.f
            r3 = 0
            if (r2 != 0) goto L18
            r2 = r3
        L18:
            int r4 = r2.f
            if (r4 <= 0) goto L1d
            goto L25
        L1d:
            float r2 = r2.g
            float r1 = (float) r1
            float r2 = r2 * r1
            int r4 = defpackage.tu0.G(r2)
        L25:
            yld r1 = r13.f
            if (r1 != 0) goto L2a
            r1 = r3
        L2a:
            float r1 = r1.h
            float r0 = (float) r0
            float r1 = r1 * r0
            int r0 = defpackage.tu0.G(r1)
            yld r1 = r13.f
            if (r1 != 0) goto L38
            r2 = r3
            goto L39
        L38:
            r2 = r1
        L39:
            int r2 = r2.c
            r5 = 2
            r6 = 0
            if (r2 == r5) goto L4a
            if (r1 != 0) goto L42
            r1 = r3
        L42:
            int r1 = r1.c
            r2 = 4
            if (r1 != r2) goto L48
            goto L4a
        L48:
            r1 = r6
            goto L4b
        L4a:
            r1 = 1
        L4b:
            if (r1 == 0) goto L4e
            r4 = r6
        L4e:
            if (r1 == 0) goto L51
            goto L52
        L51:
            r0 = r6
        L52:
            android.graphics.LinearGradient r1 = new android.graphics.LinearGradient
            float r8 = (float) r4
            float r9 = (float) r0
            yld r0 = r13.f
            if (r0 != 0) goto L5c
            r2 = r3
            goto L5d
        L5c:
            r2 = r0
        L5d:
            int[] r10 = r2.b
            if (r0 != 0) goto L62
            goto L63
        L62:
            r3 = r0
        L63:
            float[] r11 = r3.a
            android.graphics.Shader$TileMode r12 = android.graphics.Shader.TileMode.CLAMP
            r6 = 0
            r7 = 0
            r5 = r1
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            android.graphics.Paint r13 = r13.b
            r13.setShader(r1)
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.e():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        yld yldVar = this.f;
        if (!(yldVar == null ? null : yldVar).j) {
            if (yldVar == null) {
                yldVar = null;
            }
            if (!yldVar.l) {
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.c.set(0, 0, rect.width(), rect.height());
        e();
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
