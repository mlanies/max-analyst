package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class ohf extends View implements kre {
    public static final /* synthetic */ bc7[] N0;
    public ValueAnimator A0;
    public float B0;
    public boolean C0;
    public Float D0;
    public ValueAnimator E0;
    public float F0;
    public float G0;
    public ValueAnimator H0;
    public boolean I0;
    public final RectF J0;
    public final je7 K0;
    public final je7 L0;
    public final GestureDetector M0;
    public mhf a;
    public boolean b;
    public int c;
    public final Paint o;
    public int s0;
    public PorterDuffColorFilter t0;
    public final je7 u0;
    public final Paint v0;
    public int w0;
    public final Paint x0;
    public final yj y0;
    public float z0;

    static {
        oi9 oi9Var = new oi9(ohf.class, "isInPause", "isInPause()Z");
        nec.a.getClass();
        N0 = new bc7[]{oi9Var};
    }

    public ohf(Context context) {
        super(context);
        this.b = true;
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        this.o = paint;
        this.u0 = tu0.r(3, new bse(11));
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        paint2.setStrokeWidth(fk4.d().getDisplayMetrics().density * 4.0f);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        this.v0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(Paint.Style.FILL);
        this.x0 = paint3;
        this.y0 = new yj(this);
        this.F0 = fk4.d().getDisplayMetrics().density * 4.0f;
        this.G0 = fk4.d().getDisplayMetrics().density * 12.0f;
        this.J0 = new RectF();
        this.K0 = o19.a.getAccessor().d(go0.class);
        je7 je7VarR = tu0.r(3, new khf(this, 0, context));
        this.L0 = je7VarR;
        this.M0 = new GestureDetector(context, new q00(17, this));
        onThemeChanged(qp4.u0.j(this));
        if (isAttachedToWindow()) {
            addOnAttachStateChangeListener(new o50(this, 13, this));
        } else if (je7VarR.a()) {
            getBitmapPool().e(je7VarR.getValue());
        }
    }

    public static Bitmap a(ohf ohfVar, Context context) {
        return i24.l(ohfVar.getBitmapPool(), context, gpc.z0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final go0 getBitmapPool() {
        return (go0) this.K0.getValue();
    }

    private final Paint getDragPaint() {
        return (Paint) this.u0.getValue();
    }

    public static void k(ohf ohfVar, float f) {
        if (ohfVar.i()) {
            ohfVar.setInPause(false);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(ohfVar.z0, ote.d(f, 0.0f, 100.0f));
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.addUpdateListener(new lhf(ohfVar, 1));
        valueAnimatorOfFloat.start();
        ohfVar.A0 = valueAnimatorOfFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setInPause(boolean z) {
        this.y0.o1(this, N0[0], Boolean.valueOf(z));
    }

    public final void d(boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        ValueAnimator valueAnimator = this.H0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float f5 = this.G0;
        if (z) {
            f = fk4.d().getDisplayMetrics().density;
            f2 = 16.0f;
        } else {
            f = fk4.d().getDisplayMetrics().density;
            f2 = 12.0f;
        }
        float f6 = f * f2;
        float f7 = this.F0;
        if (z) {
            f3 = fk4.d().getDisplayMetrics().density;
            f4 = 5.0f;
        } else {
            f3 = fk4.d().getDisplayMetrics().density;
            f4 = 4.0f;
        }
        float f8 = f3 * f4;
        if (!z) {
            this.I0 = true;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(100L);
        valueAnimatorOfFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new nrb(this, f5, f6, f7, f8, 1));
        valueAnimatorOfFloat.addListener(new nhf(this, 0));
        valueAnimatorOfFloat.start();
        this.H0 = valueAnimatorOfFloat;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        ValueAnimator valueAnimator = this.E0;
        if ((valueAnimator != null && valueAnimator.isRunning() && !this.I0) || (i() && !this.C0)) {
            Paint paint = this.x0;
            paint.setAlpha(f(this.w0));
            canvas.drawOval(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            getDragPaint().setAlpha(f(this.s0));
            float f = fk4.d().getDisplayMetrics().density * 48.0f;
            RectF rectF = this.J0;
            float f2 = f / 2.0f;
            rectF.set(width - f2, height - f2, width + f2, f2 + height);
            canvas.drawBitmap((Bitmap) this.L0.getValue(), (Rect) null, rectF, getDragPaint());
        }
        ValueAnimator valueAnimator2 = this.E0;
        if ((valueAnimator2 == null || !valueAnimator2.isRunning()) && !i()) {
            if (i()) {
                return;
            }
            h(canvas, width, height);
            return;
        }
        Paint paint2 = this.o;
        paint2.setAlpha(f(this.c));
        canvas.drawCircle(width, height, this.B0, paint2);
        h(canvas, width, height);
        getDragPaint().setAlpha(f(this.s0));
        long jE = e(width, height);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jE >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE & 4294967295L));
        ValueAnimator valueAnimator3 = this.E0;
        float animatedFraction = valueAnimator3 != null ? valueAnimator3.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator4 = this.E0;
        canvas.drawCircle(fIntBitsToFloat, fIntBitsToFloat2, (valueAnimator4 != null && valueAnimator4.isRunning() && i()) ? animatedFraction * this.G0 : this.G0 * (1 - animatedFraction), getDragPaint());
    }

    public final long e(float f, float f2) {
        double radians = Math.toRadians(((this.z0 * 360.0f) / 100.0f) - 90);
        return mr0.k((this.B0 * ((float) Math.cos(radians))) + f, (this.B0 * ((float) Math.sin(radians))) + f2);
    }

    public final int f(int i) {
        ValueAnimator valueAnimator = this.E0;
        float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
        ValueAnimator valueAnimator2 = this.E0;
        return (valueAnimator2 != null && valueAnimator2.isRunning() && i()) ? tu0.G(animatedFraction * i) : rh4.q(animatedFraction, i, i);
    }

    public final float g() {
        int iMin = Math.min(getWidth(), getHeight());
        return (i() ? wg0.m(27, fk4.d().getDisplayMetrics().density, 2, iMin) : wg0.m(8, fk4.d().getDisplayMetrics().density, 2, iMin)) / 2.0f;
    }

    public final mhf getListener() {
        return this.a;
    }

    public final void h(Canvas canvas, float f, float f2) {
        float f3 = (this.z0 * 360.0f) / 100.0f;
        RectF rectF = this.J0;
        float f4 = this.B0;
        rectF.set(f - f4, f2 - f4, f + f4, f2 + f4);
        canvas.drawArc(rectF, -90.0f, f3, false, this.v0);
    }

    public final boolean i() {
        bc7 bc7Var = N0[0];
        return ((Boolean) this.y0.b).booleanValue();
    }

    public final void j() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.z0 = 0.0f;
        setInPause(false);
    }

    public final void l(float f, float f2) {
        float f3 = 360;
        this.z0 = ((((((float) Math.toDegrees(Math.atan2(f2, f))) + 90) + f3) % f3) / 360.0f) * 100.0f;
        postInvalidateOnAnimation();
        Float f4 = this.D0;
        if (f4 != null && Math.signum(f) != Math.signum(f4.floatValue()) && f2 < 0.0f) {
            pag.F(this, ni6.LONG_PRESS);
        }
        this.D0 = Float.valueOf(f);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.B0 = g();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        fkaVar.a().s().b.getClass();
        Paint paint = this.o;
        paint.setColor(1392508927);
        this.c = paint.getAlpha();
        fkaVar.a().s().a.b.getClass();
        this.t0 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
        Paint dragPaint = getDragPaint();
        fkaVar.a().s().a.b.getClass();
        dragPaint.setColor(-1);
        Paint dragPaint2 = getDragPaint();
        PorterDuffColorFilter porterDuffColorFilter = this.t0;
        if (porterDuffColorFilter == null) {
            porterDuffColorFilter = null;
        }
        dragPaint2.setColorFilter(porterDuffColorFilter);
        this.s0 = getDragPaint().getAlpha();
        fkaVar.a().s().b.getClass();
        this.v0.setColor(-1191182337);
        ne0 ne0VarB = fkaVar.b();
        Paint paint2 = this.x0;
        paint2.setColor(ne0VarB.e);
        this.w0 = paint2.getAlpha();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        if (!this.C0 || motionEvent.getAction() != 1) {
            if (!this.C0 || motionEvent.getAction() != 2) {
                return this.M0.onTouchEvent(motionEvent);
            }
            l(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
            mhf mhfVar = this.a;
            if (mhfVar != null) {
                ((dif) mhfVar).w(this.z0);
            }
            return true;
        }
        l(motionEvent.getX() - (getWidth() / 2.0f), motionEvent.getY() - (getHeight() / 2.0f));
        mhf mhfVar2 = this.a;
        if (mhfVar2 != null) {
            ((dif) mhfVar2).v();
        }
        setInPause(false);
        this.C0 = false;
        this.D0 = null;
        getParent().requestDisallowInterceptTouchEvent(false);
        d(false);
        return true;
    }

    public final void setListener(mhf mhfVar) {
        this.a = mhfVar;
    }

    public final void setPausingEnabled(boolean z) {
        this.b = z;
    }
}
