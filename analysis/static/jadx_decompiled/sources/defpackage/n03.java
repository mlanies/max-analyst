package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class n03 extends q18 implements Drawable.Callback, cpe {
    public static final int[] S1 = {R.attr.state_enabled};
    public static final ShapeDrawable T1 = new ShapeDrawable(new OvalShape());
    public int A1;
    public int B1;
    public int C1;
    public boolean D1;
    public int E1;
    public int F1;
    public ColorFilter G1;
    public PorterDuffColorFilter H1;
    public ColorStateList I1;
    public ColorStateList J0;
    public PorterDuff.Mode J1;
    public ColorStateList K0;
    public int[] K1;
    public float L0;
    public boolean L1;
    public float M0;
    public ColorStateList M1;
    public ColorStateList N0;
    public WeakReference N1;
    public float O0;
    public TextUtils.TruncateAt O1;
    public ColorStateList P0;
    public boolean P1;
    public CharSequence Q0;
    public int Q1;
    public boolean R0;
    public boolean R1;
    public Drawable S0;
    public ColorStateList T0;
    public float U0;
    public boolean V0;
    public boolean W0;
    public Drawable X0;
    public RippleDrawable Y0;
    public ColorStateList Z0;
    public float a1;
    public SpannableStringBuilder b1;
    public boolean c1;
    public boolean d1;
    public Drawable e1;
    public ColorStateList f1;
    public wc9 g1;
    public wc9 h1;
    public float i1;
    public float j1;
    public float k1;
    public float l1;
    public float m1;
    public float n1;
    public float o1;
    public float p1;
    public final Context q1;
    public final Paint r1;
    public final Paint.FontMetrics s1;
    public final RectF t1;
    public final PointF u1;
    public final Path v1;
    public final dpe w1;
    public int x1;
    public int y1;
    public int z1;

    public n03(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.M0 = -1.0f;
        this.r1 = new Paint(1);
        this.s1 = new Paint.FontMetrics();
        this.t1 = new RectF();
        this.u1 = new PointF();
        this.v1 = new Path();
        this.F1 = 255;
        this.J1 = PorterDuff.Mode.SRC_IN;
        this.N1 = new WeakReference(null);
        j(context);
        this.q1 = context;
        dpe dpeVar = new dpe(this);
        this.w1 = dpeVar;
        this.Q0 = "";
        dpeVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = S1;
        setState(iArr);
        if (!Arrays.equals(this.K1, iArr)) {
            this.K1 = iArr;
            if (W()) {
                z(getState(), iArr);
            }
        }
        this.P1 = true;
        T1.setTint(-1);
    }

    public static void X(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean w(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean x(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z) {
        if (this.c1 != z) {
            this.c1 = z;
            float fT = t();
            if (!z && this.D1) {
                this.D1 = false;
            }
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void B(Drawable drawable) {
        if (this.e1 != drawable) {
            float fT = t();
            this.e1 = drawable;
            float fT2 = t();
            X(this.e1);
            r(this.e1);
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void C(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f1 != colorStateList) {
            this.f1 = colorStateList;
            if (this.d1 && (drawable = this.e1) != null && this.c1) {
                aq4.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void D(boolean z) {
        if (this.d1 != z) {
            boolean zU = U();
            this.d1 = z;
            boolean zU2 = U();
            if (zU != zU2) {
                if (zU2) {
                    r(this.e1);
                } else {
                    X(this.e1);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void E(float f) {
        if (this.M0 != f) {
            this.M0 = f;
            i8g i8gVarE = this.a.a.e();
            i8gVarE.e = new a0(f);
            i8gVarE.f = new a0(f);
            i8gVarE.g = new a0(f);
            i8gVarE.h = new a0(f);
            setShapeAppearanceModel(i8gVarE.c());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.S0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof y8g;
            drawable2 = drawable3;
            if (z) {
                ((z8g) ((y8g) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fT = t();
            this.S0 = drawable != null ? drawable.mutate() : null;
            float fT2 = t();
            X(drawable2);
            if (V()) {
                r(this.S0);
            }
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void G(float f) {
        if (this.U0 != f) {
            float fT = t();
            this.U0 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void H(ColorStateList colorStateList) {
        this.V0 = true;
        if (this.T0 != colorStateList) {
            this.T0 = colorStateList;
            if (V()) {
                aq4.h(this.S0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void I(boolean z) {
        if (this.R0 != z) {
            boolean zV = V();
            this.R0 = z;
            boolean zV2 = V();
            if (zV != zV2) {
                if (zV2) {
                    r(this.S0);
                } else {
                    X(this.S0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void J(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            if (this.R1) {
                n(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void K(float f) {
        if (this.O0 != f) {
            this.O0 = f;
            this.r1.setStrokeWidth(f);
            if (this.R1) {
                this.a.k = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void L(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.X0;
        if (drawable3 != 0) {
            boolean z = drawable3 instanceof y8g;
            drawable2 = drawable3;
            if (z) {
                ((z8g) ((y8g) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float fU = u();
            this.X0 = drawable != null ? drawable.mutate() : null;
            ColorStateList colorStateListValueOf = this.P0;
            if (colorStateListValueOf == null) {
                colorStateListValueOf = ColorStateList.valueOf(0);
            }
            this.Y0 = new RippleDrawable(colorStateListValueOf, this.X0, T1);
            float fU2 = u();
            X(drawable2);
            if (W()) {
                r(this.X0);
            }
            invalidateSelf();
            if (fU != fU2) {
                y();
            }
        }
    }

    public final void M(float f) {
        if (this.o1 != f) {
            this.o1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void N(float f) {
        if (this.a1 != f) {
            this.a1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void O(float f) {
        if (this.n1 != f) {
            this.n1 = f;
            invalidateSelf();
            if (W()) {
                y();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        if (this.Z0 != colorStateList) {
            this.Z0 = colorStateList;
            if (W()) {
                aq4.h(this.X0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void Q(boolean z) {
        if (this.W0 != z) {
            boolean zW = W();
            this.W0 = z;
            boolean zW2 = W();
            if (zW != zW2) {
                if (zW2) {
                    r(this.X0);
                } else {
                    X(this.X0);
                }
                invalidateSelf();
                y();
            }
        }
    }

    public final void R(float f) {
        if (this.k1 != f) {
            float fT = t();
            this.k1 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void S(float f) {
        if (this.j1 != f) {
            float fT = t();
            this.j1 = f;
            float fT2 = t();
            invalidateSelf();
            if (fT != fT2) {
                y();
            }
        }
    }

    public final void T(ColorStateList colorStateList) {
        if (this.P0 != colorStateList) {
            this.P0 = colorStateList;
            if (!this.L1) {
                colorStateList = null;
            } else if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(0);
            }
            this.M1 = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean U() {
        return this.d1 && this.e1 != null && this.D1;
    }

    public final boolean V() {
        return this.R0 && this.S0 != null;
    }

    public final boolean W() {
        return this.W0 && this.X0 != null;
    }

    @Override // defpackage.q18, defpackage.cpe
    public final void a() {
        y();
        invalidateSelf();
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        RectF rectF;
        int i2;
        int i3;
        int i4;
        RectF rectF2;
        int iSave;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.F1) == 0) {
            return;
        }
        int iSaveLayerAlpha = i < 255 ? canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i) : 0;
        boolean z = this.R1;
        Paint paint = this.r1;
        RectF rectF3 = this.t1;
        if (!z) {
            paint.setColor(this.x1);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (!this.R1) {
            paint.setColor(this.y1);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.G1;
            if (colorFilter == null) {
                colorFilter = this.H1;
            }
            paint.setColorFilter(colorFilter);
            rectF3.set(bounds);
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (this.R1) {
            super.draw(canvas);
        }
        if (this.O0 > 0.0f && !this.R1) {
            paint.setColor(this.A1);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.R1) {
                ColorFilter colorFilter2 = this.G1;
                if (colorFilter2 == null) {
                    colorFilter2 = this.H1;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f = bounds.left;
            float f2 = this.O0 / 2.0f;
            rectF3.set(f + f2, bounds.top + f2, bounds.right - f2, bounds.bottom - f2);
            float f3 = this.M0 - (this.O0 / 2.0f);
            canvas.drawRoundRect(rectF3, f3, f3, paint);
        }
        paint.setColor(this.B1);
        paint.setStyle(Paint.Style.FILL);
        rectF3.set(bounds);
        if (this.R1) {
            RectF rectF4 = new RectF(bounds);
            Path path = this.v1;
            p18 p18Var = this.a;
            this.C0.d(p18Var.a, p18Var.j, rectF4, this.B0, path);
            f(canvas, paint, path, this.a.a, h());
        } else {
            canvas.drawRoundRect(rectF3, v(), v(), paint);
        }
        if (V()) {
            s(bounds, rectF3);
            float f4 = rectF3.left;
            float f5 = rectF3.top;
            canvas.translate(f4, f5);
            this.S0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.S0.draw(canvas);
            canvas.translate(-f4, -f5);
        }
        if (U()) {
            s(bounds, rectF3);
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            canvas.translate(f6, f7);
            this.e1.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
            this.e1.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (!this.P1 || this.Q0 == null) {
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
        } else {
            PointF pointF = this.u1;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.Q0;
            dpe dpeVar = this.w1;
            if (charSequence != null) {
                float fT = t() + this.i1 + this.l1;
                if (bq4.a(this) == 0) {
                    pointF.x = bounds.left + fT;
                } else {
                    pointF.x = bounds.right - fT;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = dpeVar.a;
                Paint.FontMetrics fontMetrics = this.s1;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF3.setEmpty();
            if (this.Q0 != null) {
                float fT2 = t() + this.i1 + this.l1;
                float fU = u() + this.p1 + this.m1;
                if (bq4.a(this) == 0) {
                    rectF3.left = bounds.left + fT2;
                    rectF3.right = bounds.right - fU;
                } else {
                    rectF3.left = bounds.left + fU;
                    rectF3.right = bounds.right - fT2;
                }
                rectF3.top = bounds.top;
                rectF3.bottom = bounds.bottom;
            }
            voe voeVar = dpeVar.g;
            TextPaint textPaint2 = dpeVar.a;
            if (voeVar != null) {
                textPaint2.drawableState = getState();
                dpeVar.g.e(this.q1, textPaint2, dpeVar.b);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(dpeVar.a(this.Q0.toString())) > Math.round(rectF3.width());
            if (z2) {
                iSave = canvas.save();
                canvas.clipRect(rectF3);
            } else {
                iSave = 0;
            }
            CharSequence charSequenceEllipsize = this.Q0;
            if (z2 && this.O1 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF3.width(), this.O1);
            }
            CharSequence charSequence2 = charSequenceEllipsize;
            int length = charSequence2.length();
            float f8 = pointF.x;
            float f9 = pointF.y;
            rectF = rectF3;
            i2 = iSaveLayerAlpha;
            i3 = 0;
            i4 = 255;
            canvas.drawText(charSequence2, 0, length, f8, f9, textPaint2);
            if (z2) {
                canvas.restoreToCount(iSave);
            }
        }
        if (W()) {
            rectF.setEmpty();
            if (W()) {
                float f10 = this.p1 + this.o1;
                if (bq4.a(this) == 0) {
                    float f11 = bounds.right - f10;
                    rectF2 = rectF;
                    rectF2.right = f11;
                    rectF2.left = f11 - this.a1;
                } else {
                    rectF2 = rectF;
                    float f12 = bounds.left + f10;
                    rectF2.left = f12;
                    rectF2.right = f12 + this.a1;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f13 = this.a1;
                float f14 = fExactCenterY - (f13 / 2.0f);
                rectF2.top = f14;
                rectF2.bottom = f14 + f13;
            } else {
                rectF2 = rectF;
            }
            float f15 = rectF2.left;
            float f16 = rectF2.top;
            canvas.translate(f15, f16);
            this.X0.setBounds(i3, i3, (int) rectF2.width(), (int) rectF2.height());
            this.Y0.setBounds(this.X0.getBounds());
            this.Y0.jumpToCurrentState();
            this.Y0.draw(canvas);
            canvas.translate(-f15, -f16);
        }
        if (this.F1 < i4) {
            canvas.restoreToCount(i2);
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.F1;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.G1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(u() + this.w1.a(this.Q0.toString()) + t() + this.i1 + this.l1 + this.m1 + this.p1), this.Q1);
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.R1) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.L0, this.M0);
        } else {
            outline.setRoundRect(bounds, this.M0);
        }
        outline.setAlpha(this.F1 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        voe voeVar;
        ColorStateList colorStateList;
        return w(this.J0) || w(this.K0) || w(this.N0) || (this.L1 && w(this.M1)) || (!((voeVar = this.w1.g) == null || (colorStateList = voeVar.j) == null || !colorStateList.isStateful()) || ((this.d1 && this.e1 != null && this.c1) || x(this.S0) || x(this.e1) || w(this.I1)));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (V()) {
            zOnLayoutDirectionChanged |= bq4.b(this.S0, i);
        }
        if (U()) {
            zOnLayoutDirectionChanged |= bq4.b(this.e1, i);
        }
        if (W()) {
            zOnLayoutDirectionChanged |= bq4.b(this.X0, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (V()) {
            zOnLevelChange |= this.S0.setLevel(i);
        }
        if (U()) {
            zOnLevelChange |= this.e1.setLevel(i);
        }
        if (W()) {
            zOnLevelChange |= this.X0.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable, defpackage.cpe
    public final boolean onStateChange(int[] iArr) {
        if (this.R1) {
            super.onStateChange(iArr);
        }
        return z(iArr, this.K1);
    }

    public final void r(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        bq4.b(drawable, bq4.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.X0) {
            if (drawable.isStateful()) {
                drawable.setState(this.K1);
            }
            aq4.h(drawable, this.Z0);
            return;
        }
        Drawable drawable2 = this.S0;
        if (drawable == drawable2 && this.V0) {
            aq4.h(drawable2, this.T0);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void s(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (V() || U()) {
            float f = this.i1 + this.j1;
            Drawable drawable = this.D1 ? this.e1 : this.S0;
            float intrinsicWidth = this.U0;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (bq4.a(this) == 0) {
                float f2 = rect.left + f;
                rectF.left = f2;
                rectF.right = f2 + intrinsicWidth;
            } else {
                float f3 = rect.right - f;
                rectF.right = f3;
                rectF.left = f3 - intrinsicWidth;
            }
            Drawable drawable2 = this.D1 ? this.e1 : this.S0;
            float fCeil = this.U0;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(mqd.h(this.q1, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.F1 != i) {
            this.F1 = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.G1 != colorFilter) {
            this.G1 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.I1 != colorStateList) {
            this.I1 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.q18, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.J1 != mode) {
            this.J1 = mode;
            ColorStateList colorStateList = this.I1;
            this.H1 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (V()) {
            visible |= this.S0.setVisible(z, z2);
        }
        if (U()) {
            visible |= this.e1.setVisible(z, z2);
        }
        if (W()) {
            visible |= this.X0.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final float t() {
        if (!V() && !U()) {
            return 0.0f;
        }
        float f = this.j1;
        Drawable drawable = this.D1 ? this.e1 : this.S0;
        float intrinsicWidth = this.U0;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f + this.k1;
    }

    public final float u() {
        if (W()) {
            return this.n1 + this.a1 + this.o1;
        }
        return 0.0f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final float v() {
        return this.R1 ? this.a.a.e.a(h()) : this.M0;
    }

    public final void y() {
        m03 m03Var = (m03) this.N1.get();
        if (m03Var != null) {
            Chip chip = (Chip) m03Var;
            chip.d(chip.E0);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean z(int[] iArr, int[] iArr2) {
        boolean z;
        boolean z2;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.J0;
        int iD = d(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.x1) : 0);
        boolean state = true;
        if (this.x1 != iD) {
            this.x1 = iD;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.K0;
        int iD2 = d(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.y1) : 0);
        if (this.y1 != iD2) {
            this.y1 = iD2;
            zOnStateChange = true;
        }
        int iG = s63.g(iD2, iD);
        if ((this.z1 != iG) | (this.a.c == null)) {
            this.z1 = iG;
            l(ColorStateList.valueOf(iG));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.N0;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.A1) : 0;
        if (this.A1 != colorForState) {
            this.A1 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.M1 == null || !xfg.y(iArr)) ? 0 : this.M1.getColorForState(iArr, this.B1);
        if (this.B1 != colorForState2) {
            this.B1 = colorForState2;
            if (this.L1) {
                zOnStateChange = true;
            }
        }
        voe voeVar = this.w1.g;
        int colorForState3 = (voeVar == null || (colorStateList = voeVar.j) == null) ? 0 : colorStateList.getColorForState(iArr, this.C1);
        if (this.C1 != colorForState3) {
            this.C1 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 == null) {
            z = false;
        } else {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (state2[i] != 16842912) {
                    i++;
                } else if (this.c1) {
                    z = true;
                }
            }
            z = false;
        }
        if (this.D1 == z || this.e1 == null) {
            z2 = false;
        } else {
            float fT = t();
            this.D1 = z;
            if (fT != t()) {
                zOnStateChange = true;
                z2 = true;
            } else {
                z2 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.I1;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.E1) : 0;
        if (this.E1 != colorForState4) {
            this.E1 = colorForState4;
            ColorStateList colorStateList6 = this.I1;
            PorterDuff.Mode mode = this.J1;
            this.H1 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (x(this.S0)) {
            state |= this.S0.setState(iArr);
        }
        if (x(this.e1)) {
            state |= this.e1.setState(iArr);
        }
        if (x(this.X0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.X0.setState(iArr3);
        }
        if (x(this.Y0)) {
            state |= this.Y0.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z2) {
            y();
        }
        return state;
    }
}
