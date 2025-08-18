package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class q18 extends Drawable implements rjd {
    public static final Paint I0;
    public final ejd A0;
    public final ey1 B0;
    public final vk8 C0;
    public PorterDuffColorFilter D0;
    public PorterDuffColorFilter E0;
    public int F0;
    public final RectF G0;
    public final boolean H0;
    public boolean X;
    public final Matrix Y;
    public final Path Z;
    public p18 a;
    public final ojd[] b;
    public final ojd[] c;
    public final BitSet o;
    public final Path s0;
    public final RectF t0;
    public final RectF u0;
    public final Region v0;
    public final Region w0;
    public gjd x0;
    public final Paint y0;
    public final Paint z0;

    static {
        Paint paint = new Paint(1);
        I0 = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public q18() {
        this(new gjd());
    }

    public void a() {
        invalidateSelf();
    }

    public final void b(RectF rectF, Path path) {
        p18 p18Var = this.a;
        this.C0.d(p18Var.a, p18Var.j, rectF, this.B0, path);
        if (this.a.i != 1.0f) {
            Matrix matrix = this.Y;
            matrix.reset();
            float f = this.a.i;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.G0, true);
    }

    public final PorterDuffColorFilter c(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = d(colorForState);
            }
            this.F0 = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z) {
            int color = paint.getColor();
            int iD = d(color);
            this.F0 = iD;
            if (iD != color) {
                return new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN);
            }
        }
        return null;
    }

    public final int d(int i) {
        p18 p18Var = this.a;
        float f = p18Var.n + p18Var.o + p18Var.m;
        ew4 ew4Var = p18Var.b;
        return ew4Var != null ? ew4Var.a(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.y0;
        paint.setColorFilter(this.D0);
        int alpha = paint.getAlpha();
        int i = this.a.l;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.z0;
        paint2.setColorFilter(this.E0);
        paint2.setStrokeWidth(this.a.k);
        int alpha2 = paint2.getAlpha();
        int i2 = this.a.l;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z = this.X;
        Path path = this.Z;
        if (z) {
            float f = -(i() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            gjd gjdVar = this.a.a;
            i8g i8gVarE = gjdVar.e();
            hx3 z9Var = gjdVar.e;
            if (!(z9Var instanceof nfc)) {
                z9Var = new z9(f, z9Var);
            }
            i8gVarE.e = z9Var;
            hx3 z9Var2 = gjdVar.f;
            if (!(z9Var2 instanceof nfc)) {
                z9Var2 = new z9(f, z9Var2);
            }
            i8gVarE.f = z9Var2;
            hx3 z9Var3 = gjdVar.h;
            if (!(z9Var3 instanceof nfc)) {
                z9Var3 = new z9(f, z9Var3);
            }
            i8gVarE.h = z9Var3;
            hx3 z9Var4 = gjdVar.g;
            if (!(z9Var4 instanceof nfc)) {
                z9Var4 = new z9(f, z9Var4);
            }
            i8gVarE.g = z9Var4;
            gjd gjdVarC = i8gVarE.c();
            this.x0 = gjdVarC;
            float f2 = this.a.j;
            RectF rectF = this.u0;
            rectF.set(h());
            float strokeWidth = i() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.C0.d(gjdVarC, f2, rectF, null, this.s0);
            b(h(), path);
            this.X = false;
        }
        p18 p18Var = this.a;
        int i3 = p18Var.p;
        if (i3 != 1 && p18Var.q > 0) {
            if (i3 == 2) {
                canvas.save();
                p18 p18Var2 = this.a;
                int iSin = (int) (Math.sin(Math.toRadians(p18Var2.s)) * p18Var2.r);
                p18 p18Var3 = this.a;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(p18Var3.s)) * p18Var3.r));
                if (this.H0) {
                    RectF rectF2 = this.G0;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.a.q * 2) + ((int) rectF2.width()) + iWidth, (this.a.q * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f3 = (getBounds().left - this.a.q) - iWidth;
                    float f4 = (getBounds().top - this.a.q) - iHeight;
                    canvas2.translate(-f3, -f4);
                    e(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f3, f4, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    e(canvas);
                    canvas.restore();
                }
            } else if (!p18Var.a.d(h())) {
                path.isConvex();
            }
        }
        p18 p18Var4 = this.a;
        Paint.Style style = p18Var4.u;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            f(canvas, paint, path, p18Var4.a, h());
        }
        if (i()) {
            g(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas) {
        this.o.cardinality();
        int i = this.a.r;
        Path path = this.Z;
        ejd ejdVar = this.A0;
        if (i != 0) {
            canvas.drawPath(path, ejdVar.a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            ojd ojdVar = this.b[i2];
            int i3 = this.a.q;
            Matrix matrix = ojd.b;
            ojdVar.a(matrix, ejdVar, i3, canvas);
            this.c[i2].a(matrix, ejdVar, this.a.q, canvas);
        }
        if (this.H0) {
            p18 p18Var = this.a;
            int iSin = (int) (Math.sin(Math.toRadians(p18Var.s)) * p18Var.r);
            p18 p18Var2 = this.a;
            int iCos = (int) (Math.cos(Math.toRadians(p18Var2.s)) * p18Var2.r);
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, I0);
            canvas.translate(iSin, iCos);
        }
    }

    public final void f(Canvas canvas, Paint paint, Path path, gjd gjdVar, RectF rectF) {
        if (!gjdVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = gjdVar.f.a(rectF) * this.a.j;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void g(Canvas canvas) {
        Paint paint = this.z0;
        Path path = this.s0;
        gjd gjdVar = this.x0;
        RectF rectF = this.u0;
        rectF.set(h());
        float strokeWidth = i() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        f(canvas, paint, path, gjdVar, rectF);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.a.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        p18 p18Var = this.a;
        if (p18Var.p == 2) {
            return;
        }
        if (p18Var.a.d(h())) {
            outline.setRoundRect(getBounds(), this.a.a.e.a(h()) * this.a.j);
            return;
        }
        RectF rectFH = h();
        Path path = this.Z;
        b(rectFH, path);
        if (Build.VERSION.SDK_INT >= 30) {
            gq4.a(outline, path);
        } else {
            try {
                fq4.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.h;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.v0;
        region.set(bounds);
        RectF rectFH = h();
        Path path = this.Z;
        b(rectFH, path);
        Region region2 = this.w0;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final RectF h() {
        RectF rectF = this.t0;
        rectF.set(getBounds());
        return rectF;
    }

    public final boolean i() {
        Paint.Style style = this.a.u;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.z0.getStrokeWidth() > 0.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.X = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.a.f) != null && colorStateList.isStateful()) || (((colorStateList2 = this.a.e) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.a.d) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.a.c) != null && colorStateList4.isStateful())));
    }

    public final void j(Context context) {
        this.a.b = new ew4(context);
        q();
    }

    public final void k(float f) {
        p18 p18Var = this.a;
        if (p18Var.n != f) {
            p18Var.n = f;
            q();
        }
    }

    public final void l(ColorStateList colorStateList) {
        p18 p18Var = this.a;
        if (p18Var.c != colorStateList) {
            p18Var.c = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m() {
        p18 p18Var = this.a;
        if (p18Var.p != 2) {
            p18Var.p = 2;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.a = new p18(this.a);
        return this;
    }

    public final void n(ColorStateList colorStateList) {
        p18 p18Var = this.a;
        if (p18Var.d != colorStateList) {
            p18Var.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean o(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.a.c == null || color2 == (colorForState2 = this.a.c.getColorForState(iArr, (color2 = (paint2 = this.y0).getColor())))) {
            z = false;
        } else {
            paint2.setColor(colorForState2);
            z = true;
        }
        if (this.a.d == null || color == (colorForState = this.a.d.getColorForState(iArr, (color = (paint = this.z0).getColor())))) {
            return z;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.X = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, defpackage.cpe
    public boolean onStateChange(int[] iArr) {
        boolean z = o(iArr) || p();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final boolean p() {
        PorterDuffColorFilter porterDuffColorFilter = this.D0;
        PorterDuffColorFilter porterDuffColorFilter2 = this.E0;
        p18 p18Var = this.a;
        this.D0 = c(p18Var.f, p18Var.g, this.y0, true);
        p18 p18Var2 = this.a;
        this.E0 = c(p18Var2.e, p18Var2.g, this.z0, false);
        p18 p18Var3 = this.a;
        if (p18Var3.t) {
            int colorForState = p18Var3.f.getColorForState(getState(), 0);
            ejd ejdVar = this.A0;
            ejdVar.getClass();
            ejdVar.d = s63.i(colorForState, 68);
            ejdVar.e = s63.i(colorForState, 20);
            ejdVar.f = s63.i(colorForState, 0);
            ejdVar.a.setColor(ejdVar.d);
        }
        return (Objects.equals(porterDuffColorFilter, this.D0) && Objects.equals(porterDuffColorFilter2, this.E0)) ? false : true;
    }

    public final void q() {
        p18 p18Var = this.a;
        float f = p18Var.n + p18Var.o;
        p18Var.q = (int) Math.ceil(0.75f * f);
        this.a.r = (int) Math.ceil(f * 0.25f);
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        p18 p18Var = this.a;
        if (p18Var.l != i) {
            p18Var.l = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.a.getClass();
        super.invalidateSelf();
    }

    @Override // defpackage.rjd
    public final void setShapeAppearanceModel(gjd gjdVar) {
        this.a.a = gjdVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.a.f = colorStateList;
        p();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        p18 p18Var = this.a;
        if (p18Var.g != mode) {
            p18Var.g = mode;
            p();
            super.invalidateSelf();
        }
    }

    public q18(Context context, AttributeSet attributeSet, int i, int i2) {
        this(gjd.b(context, attributeSet, i, i2).c());
    }

    public q18(gjd gjdVar) {
        this(new p18(gjdVar));
    }

    public q18(p18 p18Var) {
        vk8 vk8Var;
        this.b = new ojd[4];
        this.c = new ojd[4];
        this.o = new BitSet(8);
        this.Y = new Matrix();
        this.Z = new Path();
        this.s0 = new Path();
        this.t0 = new RectF();
        this.u0 = new RectF();
        this.v0 = new Region();
        this.w0 = new Region();
        Paint paint = new Paint(1);
        this.y0 = paint;
        Paint paint2 = new Paint(1);
        this.z0 = paint2;
        this.A0 = new ejd();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            vk8Var = hjd.a;
        } else {
            vk8Var = new vk8();
        }
        this.C0 = vk8Var;
        this.G0 = new RectF();
        this.H0 = true;
        this.a = p18Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        p();
        o(getState());
        this.B0 = new ey1(20, this);
    }
}
