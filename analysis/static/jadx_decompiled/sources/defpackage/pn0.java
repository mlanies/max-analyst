package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.animated.gif.GifImage;

/* loaded from: classes.dex */
public final class pn0 implements vf {
    public final boolean X;
    public final xn0 Y;
    public final l84 Z;
    public final s2b a;
    public final wn0 b;
    public final gg c;
    public final te o;
    public final Bitmap.Config s0 = Bitmap.Config.ARGB_8888;
    public final Paint t0 = new Paint(6);
    public Rect u0;
    public int v0;
    public int w0;

    public pn0(s2b s2bVar, wn0 wn0Var, re6 re6Var, te teVar, boolean z, xn0 xn0Var, l84 l84Var) {
        this.a = s2bVar;
        this.b = wn0Var;
        this.c = re6Var;
        this.o = teVar;
        this.X = z;
        this.Y = xn0Var;
        this.Z = l84Var;
        new Path();
        new Matrix();
        c();
    }

    @Override // defpackage.vf
    public final void B(ColorFilter colorFilter) {
        this.t0.setColorFilter(colorFilter);
    }

    @Override // defpackage.gg
    public final int G() {
        return this.c.G();
    }

    @Override // defpackage.gg
    public final int M(int i) {
        return this.c.M(i);
    }

    @Override // defpackage.vf
    public final int V() {
        return this.w0;
    }

    @Override // defpackage.vf
    public final void Z(Rect rect) {
        this.u0 = rect;
        te teVar = this.o;
        ue ueVar = (ue) teVar.c;
        if (!ue.a((GifImage) ueVar.e, rect).equals((Rect) ueVar.f)) {
            ueVar = new ue((oz7) ueVar.c, (a8g) ueVar.d, rect, ueVar.b);
        }
        if (ueVar != ((ue) teVar.c)) {
            teVar.c = ueVar;
            teVar.o = new w36(ueVar, teVar.a, (fd7) teVar.X);
        }
        c();
    }

    public final boolean a(int i, o43 o43Var, Canvas canvas, int i2) {
        if (o43Var == null || !o43.n0(o43Var)) {
            return false;
        }
        Bitmap bitmap = (Bitmap) o43Var.e0();
        Rect rect = this.u0;
        Paint paint = this.t0;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        } else {
            rect.width();
            rect.height();
            canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
        }
        if (i2 == 3 || this.X) {
            return true;
        }
        this.b.c(i, o43Var);
        return true;
    }

    @Override // defpackage.vf
    public final int a0() {
        return this.v0;
    }

    public final boolean b(Canvas canvas, int i, int i2) throws Throwable {
        o43 o43VarF;
        boolean zA;
        boolean zD;
        boolean zD2;
        o43 o43Var = null;
        try {
            boolean z = false;
            int i3 = 1;
            if (this.X) {
                xn0 xn0Var = this.Y;
                o43 o43VarJ = xn0Var != null ? xn0Var.j(i, canvas.getWidth(), canvas.getHeight()) : null;
                if (o43VarJ != null) {
                    try {
                        if (o43VarJ.m0()) {
                            Bitmap bitmap = (Bitmap) o43VarJ.e0();
                            Rect rect = this.u0;
                            Paint paint = this.t0;
                            if (rect == null) {
                                canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
                            } else {
                                rect.width();
                                rect.height();
                                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                            }
                            o43.S(o43VarJ);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        o43Var = o43VarJ;
                        o43.S(o43Var);
                        throw th;
                    }
                }
                if (xn0Var != null) {
                    xn0Var.l(canvas.getWidth(), canvas.getHeight());
                }
                o43.S(o43VarJ);
                return false;
            }
            wn0 wn0Var = this.b;
            if (i2 != 0) {
                te teVar = this.o;
                if (i2 == 1) {
                    o43VarF = wn0Var.e();
                    if (o43VarF == null || !o43VarF.m0()) {
                        zD = false;
                    } else {
                        zD = teVar.d((Bitmap) o43VarF.e0(), i);
                        if (!zD) {
                            o43.S(o43VarF);
                        }
                    }
                    if (zD && a(i, o43VarF, canvas, 1)) {
                        z = true;
                    }
                    zA = z;
                    i3 = 2;
                } else if (i2 == 2) {
                    try {
                        o43VarF = this.a.c(this.v0, this.w0, this.s0);
                        if (o43VarF == null || !o43VarF.m0()) {
                            zD2 = false;
                        } else {
                            zD2 = teVar.d((Bitmap) o43VarF.e0(), i);
                            if (!zD2) {
                                o43.S(o43VarF);
                            }
                        }
                        if (zD2 && a(i, o43VarF, canvas, 2)) {
                            z = true;
                        }
                        zA = z;
                        i3 = 3;
                    } catch (RuntimeException e) {
                        ta5.i(pn0.class, "Failed to create frame bitmap", e);
                        return false;
                    }
                } else {
                    if (i2 != 3) {
                        return false;
                    }
                    o43VarF = wn0Var.b();
                    zA = a(i, o43VarF, canvas, 3);
                    i3 = -1;
                }
            } else {
                o43VarF = wn0Var.f(i);
                zA = a(i, o43VarF, canvas, 0);
            }
            o43.S(o43VarF);
            return (zA || i3 == -1) ? zA : b(canvas, i, i3);
        } catch (Throwable th2) {
            th = th2;
            o43.S(o43Var);
            throw th;
        }
    }

    @Override // defpackage.vf
    public final void b0(av1 av1Var) {
    }

    public final void c() {
        te teVar = this.o;
        int iK = ((GifImage) ((ue) teVar.c).e).k();
        this.v0 = iK;
        if (iK == -1) {
            Rect rect = this.u0;
            this.v0 = rect != null ? rect.width() : -1;
        }
        int iH = ((GifImage) ((ue) teVar.c).e).h();
        this.w0 = iH;
        if (iH == -1) {
            Rect rect2 = this.u0;
            this.w0 = rect2 != null ? rect2.height() : -1;
        }
    }

    @Override // defpackage.vf
    public final boolean c0(Drawable drawable, Canvas canvas, int i) throws Throwable {
        l84 l84Var;
        xn0 xn0Var;
        boolean zB = b(canvas, i, 0);
        if (!this.X && (l84Var = this.Z) != null && (xn0Var = this.Y) != null) {
            xn0Var.i(l84Var, this.b, this, i, null);
        }
        return zB;
    }

    @Override // defpackage.vf
    public final void clear() {
        if (!this.X) {
            this.b.clear();
            return;
        }
        xn0 xn0Var = this.Y;
        if (xn0Var != null) {
            xn0Var.k();
        }
    }

    @Override // defpackage.gg
    public final int g0() {
        return this.c.g0();
    }

    @Override // defpackage.vf
    public final void p(int i) {
        this.t0.setAlpha(i);
    }

    @Override // defpackage.gg
    public final int x() {
        return this.c.x();
    }
}
