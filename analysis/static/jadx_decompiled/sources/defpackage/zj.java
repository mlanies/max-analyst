package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class zj extends Drawable implements Animatable {
    public static final /* synthetic */ bc7[] A0;
    public static final ThreadLocal B0;
    public static final je7 C0;
    public static final oq9 z0;
    public final boolean X;
    public final cx7 Y;
    public final yj Z;
    public final int a;
    public final mn5 b;
    public final mi c;
    public final fi o;
    public final String s0;
    public final pf t0;
    public final je7 u0;
    public final Drawable v0;
    public final khe w0;
    public RLottieDrawable x0;
    public ContextScope y0;

    static {
        oi9 oi9Var = new oi9(zj.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;");
        nec.a.getClass();
        A0 = new bc7[]{oi9Var};
        z0 = new oq9(6);
        B0 = ThreadLocal.withInitial(new tj(0));
        C0 = tu0.r(3, new m(6));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zj(Context context, int i, q0e q0eVar, mi miVar, fi fiVar) {
        this(context, i, q0eVar, miVar, fiVar, true, MainDispatcherLoader.dispatcher);
        jd4 jd4Var = ql4.a;
    }

    public final void a(Canvas canvas, float f, float f2, float f3, Paint paint) throws InterruptedException {
        Canvas canvasBeginRecording;
        Drawable drawableB = b();
        canvas.save();
        float f4 = f3 - f2;
        canvas.translate(f, f4 > ((float) drawableB.getBounds().height()) ? (f4 / 2) - (drawableB.getBounds().height() / 2) : f3 - drawableB.getBounds().height());
        if (this.X && paint.getAlpha() != 255) {
            paint.setAlpha(255);
        }
        RLottieDrawable rLottieDrawable = this.x0;
        if (drawableB == rLottieDrawable) {
            Picture picture = (Picture) B0.get();
            if (picture != null) {
                try {
                    canvasBeginRecording = picture.beginRecording(((RLottieDrawable) drawableB).getBounds().width(), ((RLottieDrawable) drawableB).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) drawableB;
                    canvasBeginRecording = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvasBeginRecording = null;
            }
            try {
                ((RLottieDrawable) drawableB).draw(canvasBeginRecording, paint);
            } catch (IllegalStateException e) {
                hm9.p(zj.class.getName(), "fail to draw drawable", e);
                if (w9e.p0(e.toString(), "Underflow in restore", false) && isRunning()) {
                    d();
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            drawableB.setAlpha(paint.getAlpha());
            drawableB.draw(canvas);
        }
        canvas.restore();
        if (rLottieDrawable == null || drawableB != rLottieDrawable) {
            return;
        }
        Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
        if (renderingBitmap != null) {
            canvas.save();
            canvas.translate(f, f3 - rLottieDrawable.getBounds().height());
            canvas.scale(rLottieDrawable.getBounds().width() / rLottieDrawable.getIntrinsicWidth(), rLottieDrawable.getBounds().height() / rLottieDrawable.getIntrinsicHeight());
            canvas.drawBitmap(renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
            return;
        }
        String name = zj.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.Z, name, wg0.i("Can't draw lottie because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), null);
        }
        khe kheVar = this.w0;
        (kheVar.a() ? (Drawable) kheVar.getValue() : this.v0).draw(canvas);
        d();
    }

    public final Drawable b() {
        bc7 bc7Var = A0[0];
        int iOrdinal = ((uj) this.Z.b).ordinal();
        Drawable drawable = this.v0;
        if (iOrdinal == 0) {
            return drawable;
        }
        if (iOrdinal == 1) {
            return (Drawable) this.w0.getValue();
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable == null) {
            return drawable;
        }
        if (!(!rLottieDrawable.isLoadingFailed())) {
            rLottieDrawable = null;
        }
        return rLottieDrawable != null ? rLottieDrawable : drawable;
    }

    public final void c(String str) {
        f9f f9fVar = (f9f) this.w0.getValue();
        f9fVar.c(null, str);
        rq4 rq4Var = f9fVar.a.o;
        rq4Var.getClass();
        ((la6) rq4Var).i(this.v0, 1);
        f9fVar.invalidateSelf();
        f9fVar.c = new ga(this, 1, f9fVar);
        e(uj.b);
    }

    public final void d() {
        Drawable drawableB = b();
        RLottieDrawable rLottieDrawable = this.x0;
        if (drawableB != rLottieDrawable) {
            b().invalidateSelf();
        } else if (rLottieDrawable != null) {
            rLottieDrawable.invalidateInternal();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) throws InterruptedException {
        float fHeight = getBounds().height();
        z0.getClass();
        a(canvas, 0.0f, 0.0f, fHeight, (Paint) C0.getValue());
    }

    public final void e(uj ujVar) {
        this.Z.o1(this, A0[0], ujVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zj) {
            return tpa.f(this.b, ((zj) obj).b);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return b().getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return b().getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return b().getOpacity();
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + zj.class.hashCode();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        d();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawableB = b();
        RLottieDrawable rLottieDrawable = this.x0;
        return drawableB == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        b().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        khe kheVar = this.w0;
        if (kheVar.a()) {
            ((f9f) kheVar.getValue()).setBounds(i, i2, i3, i4);
        }
        this.v0.setBounds(i, i2, i3, i4);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(i, i2, i3, i4);
        }
        super.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        b().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        hm9.n(zj.class.getName(), "start");
        if (!j1e.z(this.y0)) {
            this.y0 = j1e.a(f46.a().plus(this.Y));
            od2.L(new zn5(new t03(this.b, 11), new xj(this, null), 5), this.y0);
        }
        Drawable drawable = this.v0;
        pf pfVar = this.t0;
        drawable.setCallback(pfVar);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(pfVar);
        }
        khe kheVar = this.w0;
        if (kheVar.a()) {
            ((f9f) kheVar.getValue()).setCallback(pfVar);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable drawableB = b();
        RLottieDrawable rLottieDrawable3 = this.x0;
        if (drawableB != rLottieDrawable3 || rLottieDrawable3 == null) {
            return;
        }
        rLottieDrawable3.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        hm9.n(zj.class.getName(), "stop");
        j1e.i(this.y0, null);
        this.v0.setCallback(null);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        khe kheVar = this.w0;
        if (kheVar.a()) {
            ((f9f) kheVar.getValue()).setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }

    public zj(Context context, int i, mn5 mn5Var, mi miVar, fi fiVar, boolean z, cx7 cx7Var) {
        Drawable drawable;
        this.a = i;
        this.b = mn5Var;
        this.c = miVar;
        this.o = fiVar;
        this.X = z;
        this.Y = cx7Var;
        this.Z = new yj(this);
        this.s0 = zj.class.getName();
        this.t0 = new pf(1, this);
        je7 je7VarR = tu0.r(3, new x5(8, this));
        this.u0 = je7VarR;
        if (miVar instanceof ki) {
            drawable = ((ki) miVar).a;
        } else if (miVar instanceof li) {
            drawable = (jz4) je7VarR.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.v0 = drawable;
        this.w0 = new khe(new x2(context, 1, this));
        this.y0 = j1e.a(f46.a().plus(cx7Var));
        od2.L(new zn5(new t03(mn5Var, 11), new xj(this, null), 5), this.y0);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        khe kheVar = this.w0;
        if (kheVar.a()) {
            ((f9f) kheVar.getValue()).setBounds(rect);
        }
        this.v0.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
        super.setBounds(b().getBounds());
    }
}
