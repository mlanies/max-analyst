package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spanned;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class tc0 extends Drawable implements kre {
    public static final /* synthetic */ bc7[] u0;
    public static final int[][] v0;
    public final Rect X = new Rect();
    public final char[] Y;
    public final je7 Z;
    public final m5a a;
    public final int[] b;
    public final je7 c;
    public final je7 o;
    public final Drawable s0;
    public final sc0 t0;

    static {
        oi9 oi9Var = new oi9(tc0.class, "isGradientEnabled", "isGradientEnabled$common_release()Z");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
        v0 = tpa.b;
    }

    public tc0(m5a m5aVar, uc0 uc0Var, final fka fkaVar) {
        dvd dvdVar;
        Spanned spanned;
        this.a = m5aVar;
        this.b = v0[(int) Math.abs(uc0Var.a % r7.length)];
        final int i = 0;
        this.c = tu0.r(3, new k56() { // from class: rc0
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setColor(fkaVar.b().l);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        fkaVar.getText();
                        paint2.setColor(-1);
                        paint2.setAntiAlias(true);
                        paint2.setDither(true);
                        paint2.setSubpixelText(true);
                        paint2.setLinearText(true);
                        paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
                        return paint2;
                }
            }
        });
        final int i2 = 1;
        this.o = tu0.r(3, new k56() { // from class: rc0
            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        Paint paint = new Paint();
                        paint.setAntiAlias(true);
                        paint.setColor(fkaVar.b().l);
                        return paint;
                    default:
                        Paint paint2 = new Paint();
                        fkaVar.getText();
                        paint2.setColor(-1);
                        paint2.setAntiAlias(true);
                        paint2.setDither(true);
                        paint2.setSubpixelText(true);
                        paint2.setLinearText(true);
                        paint2.setTypeface(Typeface.create(Typeface.SANS_SERIF, 600, false));
                        return paint2;
                }
            }
        });
        char[] cArr = {0, 0};
        CharSequence charSequence = uc0Var.b;
        Drawable drawableB = null;
        if (charSequence.length() != 0) {
            Character chW0 = w9e.w0(0, charSequence);
            Character chValueOf = chW0 != null ? Character.valueOf(Character.toUpperCase(chW0.charValue())) : null;
            Character chW02 = w9e.w0(1, charSequence);
            char upperCase = chW02 != null ? Character.toUpperCase(chW02.charValue()) : (char) 0;
            if (chValueOf != null) {
                cArr[0] = chValueOf.charValue();
                cArr[1] = upperCase;
            }
        }
        this.Y = cArr;
        this.Z = tu0.r(3, new m(16));
        this.t0 = new sc0(this, fkaVar);
        int length = charSequence.length();
        try {
            spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        } catch (Throwable unused) {
        }
        Object[] spans = spanned != null ? spanned.getSpans(0, length, dvd.class) : null;
        dvd[] dvdVarArr = (dvd[]) spans;
        if (dvdVarArr != null && (dvdVar = (dvd) ys.e0(dvdVarArr)) != null) {
            drawableB = dvdVar.b();
        }
        this.s0 = drawableB;
        if (this.a instanceof l5a) {
            qjd.a((Path) this.Z.getValue(), getBounds());
        }
        c();
    }

    public final Paint a() {
        return (Paint) this.c.getValue();
    }

    public final Paint b() {
        return (Paint) this.o.getValue();
    }

    public final void c() {
        LinearGradient linearGradient;
        Paint paintA = a();
        bc7 bc7Var = u0[0];
        if (((Boolean) this.t0.b).booleanValue()) {
            linearGradient = new LinearGradient(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, this.b, (float[]) null, Shader.TileMode.CLAMP);
        } else {
            linearGradient = null;
        }
        paintA.setShader(linearGradient);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        m5a m5aVar = this.a;
        if (m5aVar instanceof j5a) {
            canvas.drawCircle(getBounds().exactCenterX(), getBounds().exactCenterY(), getBounds().width() / 2.0f, a());
        } else if (m5aVar instanceof l5a) {
            canvas.drawPath((Path) this.Z.getValue(), a());
        } else if (!tpa.f(m5aVar, k5a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        b().setTextSize(getBounds().height() * 0.33f);
        Paint paintB = b();
        char[] cArr = this.Y;
        int length = cArr.length;
        Rect rect = this.X;
        paintB.getTextBounds(cArr, 0, length, rect);
        float fExactCenterX = getBounds().exactCenterX() - rect.exactCenterX();
        float fExactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
        Drawable drawable = this.s0;
        if (drawable == null) {
            canvas.drawText(cArr, 0, cArr.length, fExactCenterX, fExactCenterY, b());
            return;
        }
        int i = b().getFontMetricsInt().descent - b().getFontMetricsInt().ascent;
        drawable.setBounds(0, 0, i, i);
        float fExactCenterX2 = getBounds().exactCenterX() - (drawable.getBounds().width() / 2);
        float fExactCenterY2 = getBounds().exactCenterY() - (drawable.getBounds().height() / 2);
        int iSave = canvas.save();
        canvas.translate(fExactCenterX2, fExactCenterY2);
        try {
            drawable.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        if (this.a instanceof l5a) {
            qjd.a((Path) this.Z.getValue(), rect);
        }
        c();
        invalidateSelf();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        bc7 bc7Var = u0[0];
        if (((Boolean) this.t0.b).booleanValue()) {
            return;
        }
        b().setColor(fkaVar.getText().e);
        a().setColor(fkaVar.b().l);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        a().setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        a().setColorFilter(colorFilter);
        invalidateSelf();
    }
}
