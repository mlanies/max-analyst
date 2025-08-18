package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class io {
    public final TextView a;
    public qh3 b;
    public qh3 c;
    public qh3 d;
    public qh3 e;
    public qh3 f;
    public qh3 g;
    public qh3 h;
    public final po i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public io(TextView textView) {
        this.a = textView;
        this.i = new po(textView);
    }

    public static qh3 c(Context context, gn gnVar, int i) {
        ColorStateList colorStateListH;
        synchronized (gnVar) {
            colorStateListH = gnVar.a.h(context, i);
        }
        if (colorStateListH == null) {
            return null;
        }
        qh3 qh3Var = new qh3(2);
        qh3Var.c = true;
        qh3Var.d = colorStateListH;
        return qh3Var;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            eu3.c(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            eu3.c(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            kq0.I(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            kq0.I(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            kq0.I(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        kq0.I(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    public final void a(Drawable drawable, qh3 qh3Var) {
        if (drawable == null || qh3Var == null) {
            return;
        }
        gn.e(drawable, qh3Var, this.a.getDrawableState());
    }

    public final void b() {
        qh3 qh3Var = this.b;
        TextView textView = this.a;
        if (qh3Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final ColorStateList d() {
        qh3 qh3Var = this.h;
        if (qh3Var != null) {
            return (ColorStateList) qh3Var.d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        qh3 qh3Var = this.h;
        if (qh3Var != null) {
            return (PorterDuff.Mode) qh3Var.e;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:236:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io.f(android.util.AttributeSet, int):void");
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, p3c.TextAppearance);
        k8g k8gVar = new k8g(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(p3c.TextAppearance_textAllCaps);
        TextView textView = this.a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(p3c.TextAppearance_textAllCaps, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(p3c.TextAppearance_android_textSize) && typedArrayObtainStyledAttributes.getDimensionPixelSize(p3c.TextAppearance_android_textSize, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        k(k8gVar, context);
        if (typedArrayObtainStyledAttributes.hasValue(p3c.TextAppearance_fontVariationSettings) && (string = typedArrayObtainStyledAttributes.getString(p3c.TextAppearance_fontVariationSettings)) != null) {
            go.d(textView, string);
        }
        k8gVar.z();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new qh3(2);
        }
        qh3 qh3Var = this.h;
        qh3Var.d = colorStateList;
        qh3Var.c = colorStateList != null;
        this.b = qh3Var;
        this.c = qh3Var;
        this.d = qh3Var;
        this.e = qh3Var;
        this.f = qh3Var;
        this.g = qh3Var;
    }

    public final void j(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new qh3(2);
        }
        qh3 qh3Var = this.h;
        qh3Var.e = mode;
        qh3Var.b = mode != null;
        this.b = qh3Var;
        this.c = qh3Var;
        this.d = qh3Var;
        this.e = qh3Var;
        this.f = qh3Var;
        this.g = qh3Var;
    }

    public final void k(k8g k8gVar, Context context) {
        String string;
        int i = p3c.TextAppearance_android_textStyle;
        int i2 = this.j;
        TypedArray typedArray = (TypedArray) k8gVar.b;
        this.j = typedArray.getInt(i, i2);
        int i3 = typedArray.getInt(p3c.TextAppearance_android_textFontWeight, -1);
        this.k = i3;
        if (i3 != -1) {
            this.j &= 2;
        }
        if (!typedArray.hasValue(p3c.TextAppearance_android_fontFamily) && !typedArray.hasValue(p3c.TextAppearance_fontFamily)) {
            if (typedArray.hasValue(p3c.TextAppearance_android_typeface)) {
                this.m = false;
                int i4 = typedArray.getInt(p3c.TextAppearance_android_typeface, 1);
                if (i4 == 1) {
                    this.l = Typeface.SANS_SERIF;
                    return;
                } else if (i4 == 2) {
                    this.l = Typeface.SERIF;
                    return;
                } else {
                    if (i4 != 3) {
                        return;
                    }
                    this.l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.l = null;
        int i5 = typedArray.hasValue(p3c.TextAppearance_fontFamily) ? p3c.TextAppearance_fontFamily : p3c.TextAppearance_android_fontFamily;
        int i6 = this.k;
        int i7 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceP = k8gVar.p(i5, this.j, new co(this, i6, i7, new WeakReference(this.a)));
                if (typefaceP != null) {
                    if (this.k != -1) {
                        this.l = ho.a(Typeface.create(typefaceP, 0), this.k, (this.j & 2) != 0);
                    } else {
                        this.l = typefaceP;
                    }
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (string = typedArray.getString(i5)) == null) {
            return;
        }
        if (this.k != -1) {
            this.l = ho.a(Typeface.create(string, 0), this.k, (this.j & 2) != 0);
        } else {
            this.l = Typeface.create(string, this.j);
        }
    }
}
