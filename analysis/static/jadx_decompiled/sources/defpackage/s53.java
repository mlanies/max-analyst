package defpackage;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s53 {
    public Typeface A;
    public Typeface B;
    public Typeface C;
    public py1 D;
    public py1 E;
    public CharSequence G;
    public CharSequence H;
    public boolean I;
    public Bitmap K;
    public float L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public int[] R;
    public boolean S;
    public final TextPaint T;
    public final TextPaint U;
    public TimeInterpolator V;
    public TimeInterpolator W;
    public float X;
    public float Y;
    public float Z;
    public final View a;
    public ColorStateList a0;
    public float b;
    public float b0;
    public boolean c;
    public float c0;
    public float d;
    public float d0;
    public float e;
    public ColorStateList e0;
    public int f;
    public float f0;
    public final Rect g;
    public float g0;
    public final Rect h;
    public float h0;
    public final RectF i;
    public StaticLayout i0;
    public float j0;
    public float k0;
    public float l0;
    public CharSequence m0;
    public ColorStateList n;
    public ColorStateList o;
    public int p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public Typeface w;
    public Typeface x;
    public Typeface y;
    public Typeface z;
    public int j = 16;
    public int k = 16;
    public float l = 15.0f;
    public float m = 15.0f;
    public TextUtils.TruncateAt F = TextUtils.TruncateAt.END;
    public boolean J = true;
    public int n0 = 1;
    public float o0 = 0.0f;
    public float p0 = 1.0f;
    public int q0 = 1;

    public s53(View view) {
        this.a = view;
        TextPaint textPaint = new TextPaint(129);
        this.T = textPaint;
        this.U = new TextPaint(textPaint);
        this.h = new Rect();
        this.g = new Rect();
        this.i = new RectF();
        float f = this.d;
        this.e = z7b.f(1.0f, f, 0.5f, f);
        h(view.getContext().getResources().getConfiguration());
    }

    public static int a(int i, float f, int i2) {
        float f2 = 1.0f - f;
        return Color.argb(Math.round((Color.alpha(i2) * f) + (Color.alpha(i) * f2)), Math.round((Color.red(i2) * f) + (Color.red(i) * f2)), Math.round((Color.green(i2) * f) + (Color.green(i) * f2)), Math.round((Color.blue(i2) * f) + (Color.blue(i) * f2)));
    }

    public static float g(float f, float f2, float f3, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f3 = timeInterpolator.getInterpolation(f3);
        }
        return og.a(f, f2, f3);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = zmf.a;
        boolean z = this.a.getLayoutDirection() == 1;
        if (this.J) {
            return (z ? bpe.d : bpe.c).T1(charSequence.length(), charSequence);
        }
        return z;
    }

    public final void c(float f, boolean z) {
        float f2;
        float f3;
        Typeface typeface;
        boolean z2;
        Layout.Alignment alignment;
        if (this.G == null) {
            return;
        }
        float fWidth = this.h.width();
        float fWidth2 = this.g.width();
        if (Math.abs(f - 1.0f) < 1.0E-5f) {
            f2 = this.m;
            f3 = this.f0;
            this.L = 1.0f;
            typeface = this.w;
        } else {
            float f4 = this.l;
            float f5 = this.g0;
            Typeface typeface2 = this.z;
            if (Math.abs(f - 0.0f) < 1.0E-5f) {
                this.L = 1.0f;
            } else {
                this.L = g(this.l, this.m, f, this.W) / this.l;
            }
            float f6 = this.m / this.l;
            fWidth = (z || this.c || fWidth2 * f6 <= fWidth) ? fWidth2 : Math.min(fWidth / f6, fWidth2);
            f2 = f4;
            f3 = f5;
            typeface = typeface2;
        }
        TextPaint textPaint = this.T;
        if (fWidth > 0.0f) {
            boolean z3 = this.M != f2;
            boolean z4 = this.h0 != f3;
            boolean z5 = this.C != typeface;
            StaticLayout staticLayout = this.i0;
            boolean z6 = z3 || z4 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z5 || this.S;
            this.M = f2;
            this.h0 = f3;
            this.C = typeface;
            this.S = false;
            textPaint.setLinearText(this.L != 1.0f);
            z2 = z6;
        } else {
            z2 = false;
        }
        if (this.H == null || z2) {
            textPaint.setTextSize(this.M);
            textPaint.setTypeface(this.C);
            textPaint.setLetterSpacing(this.h0);
            boolean zB = b(this.G);
            this.I = zB;
            int i = this.n0;
            if (i <= 1 || (zB && !this.c)) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.j, zB ? 1 : 0) & 7;
                alignment = absoluteGravity != 1 ? absoluteGravity != 5 ? this.I ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : this.I ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_CENTER;
            }
            i1e i1eVar = new i1e(this.G, textPaint, (int) fWidth);
            i1eVar.l = this.F;
            i1eVar.k = zB;
            i1eVar.e = alignment;
            i1eVar.j = false;
            i1eVar.f = i;
            float f7 = this.o0;
            float f8 = this.p0;
            i1eVar.g = f7;
            i1eVar.h = f8;
            i1eVar.i = this.q0;
            StaticLayout staticLayoutA = i1eVar.a();
            staticLayoutA.getClass();
            this.i0 = staticLayoutA;
            this.H = staticLayoutA.getText();
        }
    }

    public final void d(Canvas canvas) {
        int iSave = canvas.save();
        if (this.H != null) {
            RectF rectF = this.i;
            if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
                return;
            }
            TextPaint textPaint = this.T;
            textPaint.setTextSize(this.M);
            float f = this.u;
            float f2 = this.v;
            float f3 = this.L;
            if (f3 != 1.0f && !this.c) {
                canvas.scale(f3, f3, f, f2);
            }
            if (this.n0 <= 1 || ((this.I && !this.c) || (this.c && this.b <= this.e))) {
                canvas.translate(f, f2);
                this.i0.draw(canvas);
            } else {
                float lineStart = this.u - this.i0.getLineStart(0);
                int alpha = textPaint.getAlpha();
                canvas.translate(lineStart, f2);
                if (!this.c) {
                    textPaint.setAlpha((int) (this.l0 * alpha));
                    if (Build.VERSION.SDK_INT >= 31) {
                        textPaint.setShadowLayer(this.N, this.O, this.P, mr0.j(this.Q, textPaint.getAlpha()));
                    }
                    this.i0.draw(canvas);
                }
                if (!this.c) {
                    textPaint.setAlpha((int) (this.k0 * alpha));
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, mr0.j(this.Q, textPaint.getAlpha()));
                }
                int lineBaseline = this.i0.getLineBaseline(0);
                CharSequence charSequence = this.m0;
                float f4 = lineBaseline;
                canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f4, textPaint);
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, this.Q);
                }
                if (!this.c) {
                    String strTrim = this.m0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    textPaint.setAlpha(alpha);
                    canvas.drawText(strTrim, 0, Math.min(this.i0.getLineEnd(0), strTrim.length()), 0.0f, f4, (Paint) textPaint);
                }
            }
            canvas.restoreToCount(iSave);
        }
    }

    public final float e() {
        TextPaint textPaint = this.U;
        textPaint.setTextSize(this.m);
        textPaint.setTypeface(this.w);
        textPaint.setLetterSpacing(this.f0);
        return -textPaint.ascent();
    }

    public final int f(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.R;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void h(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.y;
            if (typeface != null) {
                this.x = m6d.x(configuration, typeface);
            }
            Typeface typeface2 = this.B;
            if (typeface2 != null) {
                this.A = m6d.x(configuration, typeface2);
            }
            Typeface typeface3 = this.x;
            if (typeface3 == null) {
                typeface3 = this.y;
            }
            this.w = typeface3;
            Typeface typeface4 = this.A;
            if (typeface4 == null) {
                typeface4 = this.B;
            }
            this.z = typeface4;
            i(true);
        }
    }

    public final void i(boolean z) {
        float fMeasureText;
        float f;
        StaticLayout staticLayout;
        View view = this.a;
        if ((view.getHeight() <= 0 || view.getWidth() <= 0) && !z) {
            return;
        }
        c(1.0f, z);
        CharSequence charSequence = this.H;
        TextPaint textPaint = this.T;
        if (charSequence != null && (staticLayout = this.i0) != null) {
            this.m0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.F);
        }
        CharSequence charSequence2 = this.m0;
        if (charSequence2 != null) {
            this.j0 = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.j0 = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.k, this.I ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.h;
        if (i == 48) {
            this.r = rect.top;
        } else if (i != 80) {
            this.r = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.r = textPaint.ascent() + rect.bottom;
        }
        int i2 = absoluteGravity & 8388615;
        if (i2 == 1) {
            this.t = rect.centerX() - (this.j0 / 2.0f);
        } else if (i2 != 5) {
            this.t = rect.left;
        } else {
            this.t = rect.right - this.j0;
        }
        c(0.0f, z);
        float height = this.i0 != null ? r1.getHeight() : 0.0f;
        StaticLayout staticLayout2 = this.i0;
        if (staticLayout2 == null || this.n0 <= 1) {
            CharSequence charSequence3 = this.H;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout2.getWidth();
        }
        StaticLayout staticLayout3 = this.i0;
        this.p = staticLayout3 != null ? staticLayout3.getLineCount() : 0;
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.j, this.I ? 1 : 0);
        int i3 = absoluteGravity2 & 112;
        Rect rect2 = this.g;
        if (i3 == 48) {
            this.q = rect2.top;
        } else if (i3 != 80) {
            this.q = rect2.centerY() - (height / 2.0f);
        } else {
            this.q = textPaint.descent() + (rect2.bottom - height);
        }
        int i4 = absoluteGravity2 & 8388615;
        if (i4 == 1) {
            this.s = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i4 != 5) {
            this.s = rect2.left;
        } else {
            this.s = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.K;
        if (bitmap != null) {
            bitmap.recycle();
            this.K = null;
        }
        q(this.b);
        float f2 = this.b;
        boolean z2 = this.c;
        RectF rectF = this.i;
        if (z2) {
            if (f2 < this.e) {
                rect = rect2;
            }
            rectF.set(rect);
        } else {
            rectF.left = g(rect2.left, rect.left, f2, this.V);
            rectF.top = g(this.q, this.r, f2, this.V);
            rectF.right = g(rect2.right, rect.right, f2, this.V);
            rectF.bottom = g(rect2.bottom, rect.bottom, f2, this.V);
        }
        if (!this.c) {
            this.u = g(this.s, this.t, f2, this.V);
            this.v = g(this.q, this.r, f2, this.V);
            q(f2);
            f = f2;
        } else if (f2 < this.e) {
            this.u = this.s;
            this.v = this.q;
            q(0.0f);
            f = 0.0f;
        } else {
            this.u = this.t;
            this.v = this.r - Math.max(0, this.f);
            q(1.0f);
            f = 1.0f;
        }
        wb5 wb5Var = og.b;
        this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - f2, wb5Var);
        WeakHashMap weakHashMap = zmf.a;
        view.postInvalidateOnAnimation();
        this.l0 = g(1.0f, 0.0f, f2, wb5Var);
        view.postInvalidateOnAnimation();
        ColorStateList colorStateList = this.o;
        ColorStateList colorStateList2 = this.n;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f(colorStateList2), f, f(this.o)));
        } else {
            textPaint.setColor(f(colorStateList));
        }
        int i5 = Build.VERSION.SDK_INT;
        float f3 = this.f0;
        float f4 = this.g0;
        if (f3 != f4) {
            textPaint.setLetterSpacing(g(f4, f3, f2, wb5Var));
        } else {
            textPaint.setLetterSpacing(f3);
        }
        this.N = og.a(this.b0, this.X, f2);
        this.O = og.a(this.c0, this.Y, f2);
        this.P = og.a(this.d0, this.Z, f2);
        int iA = a(f(this.e0), f2, f(this.a0));
        this.Q = iA;
        textPaint.setShadowLayer(this.N, this.O, this.P, iA);
        if (this.c) {
            int alpha = textPaint.getAlpha();
            float f5 = this.e;
            textPaint.setAlpha((int) ((f2 <= f5 ? og.b(1.0f, 0.0f, this.d, f5, f2) : og.b(0.0f, 1.0f, f5, 1.0f, f2)) * alpha));
            if (i5 >= 31) {
                textPaint.setShadowLayer(this.N, this.O, this.P, mr0.j(this.Q, textPaint.getAlpha()));
            }
        }
        view.postInvalidateOnAnimation();
    }

    public final void j(ColorStateList colorStateList) {
        if (this.o == colorStateList && this.n == colorStateList) {
            return;
        }
        this.o = colorStateList;
        this.n = colorStateList;
        i(false);
    }

    public final void k(int i) {
        View view = this.a;
        voe voeVar = new voe(view.getContext(), i);
        ColorStateList colorStateList = voeVar.j;
        if (colorStateList != null) {
            this.o = colorStateList;
        }
        float f = voeVar.k;
        if (f != 0.0f) {
            this.m = f;
        }
        ColorStateList colorStateList2 = voeVar.a;
        if (colorStateList2 != null) {
            this.a0 = colorStateList2;
        }
        this.Y = voeVar.e;
        this.Z = voeVar.f;
        this.X = voeVar.g;
        this.f0 = voeVar.i;
        py1 py1Var = this.E;
        if (py1Var != null) {
            py1Var.Y = true;
        }
        fd7 fd7Var = new fd7(this);
        voeVar.a();
        this.E = new py1(fd7Var, voeVar.n);
        voeVar.c(view.getContext(), this.E);
        i(false);
    }

    public final void l(int i) {
        if (this.k != i) {
            this.k = i;
            i(false);
        }
    }

    public final boolean m(Typeface typeface) {
        py1 py1Var = this.E;
        if (py1Var != null) {
            py1Var.Y = true;
        }
        if (this.y == typeface) {
            return false;
        }
        this.y = typeface;
        Typeface typefaceX = m6d.x(this.a.getContext().getResources().getConfiguration(), typeface);
        this.x = typefaceX;
        if (typefaceX == null) {
            typefaceX = this.y;
        }
        this.w = typefaceX;
        return true;
    }

    public final void n(int i) {
        View view = this.a;
        voe voeVar = new voe(view.getContext(), i);
        ColorStateList colorStateList = voeVar.j;
        if (colorStateList != null) {
            this.n = colorStateList;
        }
        float f = voeVar.k;
        if (f != 0.0f) {
            this.l = f;
        }
        ColorStateList colorStateList2 = voeVar.a;
        if (colorStateList2 != null) {
            this.e0 = colorStateList2;
        }
        this.c0 = voeVar.e;
        this.d0 = voeVar.f;
        this.b0 = voeVar.g;
        this.g0 = voeVar.i;
        py1 py1Var = this.D;
        if (py1Var != null) {
            py1Var.Y = true;
        }
        gaa gaaVar = new gaa(this);
        voeVar.a();
        this.D = new py1(gaaVar, voeVar.n);
        voeVar.c(view.getContext(), this.D);
        i(false);
    }

    public final boolean o(Typeface typeface) {
        py1 py1Var = this.D;
        if (py1Var != null) {
            py1Var.Y = true;
        }
        if (this.B == typeface) {
            return false;
        }
        this.B = typeface;
        Typeface typefaceX = m6d.x(this.a.getContext().getResources().getConfiguration(), typeface);
        this.A = typefaceX;
        if (typefaceX == null) {
            typefaceX = this.B;
        }
        this.z = typefaceX;
        return true;
    }

    public final void p(float f) {
        float f2;
        float fO = z04.o(f, 0.0f, 1.0f);
        if (fO != this.b) {
            this.b = fO;
            boolean z = this.c;
            RectF rectF = this.i;
            Rect rect = this.h;
            Rect rect2 = this.g;
            if (z) {
                if (fO < this.e) {
                    rect = rect2;
                }
                rectF.set(rect);
            } else {
                rectF.left = g(rect2.left, rect.left, fO, this.V);
                rectF.top = g(this.q, this.r, fO, this.V);
                rectF.right = g(rect2.right, rect.right, fO, this.V);
                rectF.bottom = g(rect2.bottom, rect.bottom, fO, this.V);
            }
            if (!this.c) {
                this.u = g(this.s, this.t, fO, this.V);
                this.v = g(this.q, this.r, fO, this.V);
                q(fO);
                f2 = fO;
            } else if (fO < this.e) {
                this.u = this.s;
                this.v = this.q;
                q(0.0f);
                f2 = 0.0f;
            } else {
                this.u = this.t;
                this.v = this.r - Math.max(0, this.f);
                q(1.0f);
                f2 = 1.0f;
            }
            wb5 wb5Var = og.b;
            this.k0 = 1.0f - g(0.0f, 1.0f, 1.0f - fO, wb5Var);
            WeakHashMap weakHashMap = zmf.a;
            View view = this.a;
            view.postInvalidateOnAnimation();
            this.l0 = g(1.0f, 0.0f, fO, wb5Var);
            view.postInvalidateOnAnimation();
            ColorStateList colorStateList = this.o;
            ColorStateList colorStateList2 = this.n;
            TextPaint textPaint = this.T;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f(colorStateList2), f2, f(this.o)));
            } else {
                textPaint.setColor(f(colorStateList));
            }
            int i = Build.VERSION.SDK_INT;
            float f3 = this.f0;
            float f4 = this.g0;
            if (f3 != f4) {
                textPaint.setLetterSpacing(g(f4, f3, fO, wb5Var));
            } else {
                textPaint.setLetterSpacing(f3);
            }
            this.N = og.a(this.b0, this.X, fO);
            this.O = og.a(this.c0, this.Y, fO);
            this.P = og.a(this.d0, this.Z, fO);
            int iA = a(f(this.e0), fO, f(this.a0));
            this.Q = iA;
            textPaint.setShadowLayer(this.N, this.O, this.P, iA);
            if (this.c) {
                int alpha = textPaint.getAlpha();
                float f5 = this.e;
                textPaint.setAlpha((int) ((fO <= f5 ? og.b(1.0f, 0.0f, this.d, f5, fO) : og.b(0.0f, 1.0f, f5, 1.0f, fO)) * alpha));
                if (i >= 31) {
                    textPaint.setShadowLayer(this.N, this.O, this.P, mr0.j(this.Q, textPaint.getAlpha()));
                }
            }
            view.postInvalidateOnAnimation();
        }
    }

    public final void q(float f) {
        c(f, false);
        WeakHashMap weakHashMap = zmf.a;
        this.a.postInvalidateOnAnimation();
    }
}
