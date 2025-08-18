package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.TypedValue;

/* loaded from: classes.dex */
public final class voe {
    public final ColorStateList a;
    public final String b;
    public final int c;
    public final int d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;
    public final float i;
    public ColorStateList j;
    public float k;
    public final int l;
    public boolean m = false;
    public Typeface n;

    public voe(Context context, int i) throws Resources.NotFoundException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, z2c.TextAppearance);
        this.k = typedArrayObtainStyledAttributes.getDimension(z2c.TextAppearance_android_textSize, 0.0f);
        this.j = ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColor);
        ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColorHint);
        ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_textColorLink);
        this.c = typedArrayObtainStyledAttributes.getInt(z2c.TextAppearance_android_textStyle, 0);
        this.d = typedArrayObtainStyledAttributes.getInt(z2c.TextAppearance_android_typeface, 1);
        int i2 = z2c.TextAppearance_fontFamily;
        i2 = typedArrayObtainStyledAttributes.hasValue(i2) ? i2 : z2c.TextAppearance_android_fontFamily;
        this.l = typedArrayObtainStyledAttributes.getResourceId(i2, 0);
        this.b = typedArrayObtainStyledAttributes.getString(i2);
        typedArrayObtainStyledAttributes.getBoolean(z2c.TextAppearance_textAllCaps, false);
        this.a = ju0.q(context, typedArrayObtainStyledAttributes, z2c.TextAppearance_android_shadowColor);
        this.e = typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDx, 0.0f);
        this.f = typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowDy, 0.0f);
        this.g = typedArrayObtainStyledAttributes.getFloat(z2c.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, z2c.MaterialTextAppearance);
        this.h = typedArrayObtainStyledAttributes2.hasValue(z2c.MaterialTextAppearance_android_letterSpacing);
        this.i = typedArrayObtainStyledAttributes2.getFloat(z2c.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.n;
        int i = this.c;
        if (typeface == null && (str = this.b) != null) {
            this.n = Typeface.create(str, i);
        }
        if (this.n == null) {
            int i2 = this.d;
            if (i2 == 1) {
                this.n = Typeface.SANS_SERIF;
            } else if (i2 == 2) {
                this.n = Typeface.SERIF;
            } else if (i2 != 3) {
                this.n = Typeface.DEFAULT;
            } else {
                this.n = Typeface.MONOSPACE;
            }
            this.n = Typeface.create(this.n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.m) {
            return this.n;
        }
        if (!context.isRestricted()) {
            try {
                Typeface typefaceA = vic.a(context, this.l);
                this.n = typefaceA;
                if (typefaceA != null) {
                    this.n = Typeface.create(typefaceA, this.c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException | Exception unused) {
            }
        }
        a();
        this.m = true;
        return this.n;
    }

    public final void c(Context context, ote oteVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.l;
        if (i == 0) {
            this.m = true;
        }
        if (this.m) {
            oteVar.K(this.n, true);
            return;
        }
        try {
            toe toeVar = new toe(this, oteVar);
            ThreadLocal threadLocal = vic.a;
            if (context.isRestricted()) {
                toeVar.c(-4);
            } else {
                vic.b(context, i, new TypedValue(), 0, toeVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.m = true;
            oteVar.J(1);
        } catch (Exception unused2) {
            this.m = true;
            oteVar.J(-3);
        }
    }

    public final boolean d(Context context) throws Resources.NotFoundException {
        Typeface typefaceB = null;
        int i = this.l;
        if (i != 0) {
            ThreadLocal threadLocal = vic.a;
            if (!context.isRestricted()) {
                typefaceB = vic.b(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceB != null;
    }

    public final void e(Context context, TextPaint textPaint, ote oteVar) {
        f(context, textPaint, oteVar);
        ColorStateList colorStateList = this.j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.a;
        textPaint.setShadowLayer(this.g, this.e, this.f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, ote oteVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.n);
        c(context, new uoe(this, context, textPaint, oteVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceX = m6d.x(context.getResources().getConfiguration(), typeface);
        if (typefaceX != null) {
            typeface = typefaceX;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}
