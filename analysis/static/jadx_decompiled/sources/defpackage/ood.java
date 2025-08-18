package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Html;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.LinearInterpolator;
import java.math.BigDecimal;
import java.text.NumberFormat;

/* loaded from: classes2.dex */
public final class ood extends View {
    public int A0;
    public final RectF A1;
    public boolean B0;
    public int B1;
    public boolean C0;
    public int C1;
    public boolean D0;
    public int D1;
    public int E0;
    public final Point E1;
    public int F0;
    public final Point F1;
    public int G0;
    public final Point G1;
    public int H0;
    public Paint H1;
    public boolean I0;
    public Paint I1;
    public int J0;
    public StaticLayout J1;
    public int K0;
    public final Path K1;
    public boolean L0;
    public final Path L1;
    public boolean M0;
    public String M1;
    public boolean N0;
    public boolean N1;
    public long O0;
    public TextPaint O1;
    public boolean P0;
    public NumberFormat P1;
    public boolean Q0;
    public nod Q1;
    public float R0;
    public final bk4 R1;
    public int S0;
    public float S1;
    public boolean T0;
    public int U0;
    public final int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public ValueAnimator a;
    public int a1;
    public float b;
    public int b1;
    public float c;
    public int c1;
    public float d1;
    public float e1;
    public float f1;
    public float g1;
    public float h1;
    public boolean i1;
    public final int j1;
    public boolean k1;
    public float l1;
    public float m1;
    public final Paint n1;
    public float o;
    public final Rect o1;
    public boolean p1;
    public float q1;
    public hod r1;
    public boolean s0;
    public String[] s1;
    public int t0;
    public boolean t1;
    public int u0;
    public float u1;
    public int v0;
    public float v1;
    public int w0;
    public boolean w1;
    public int x0;
    public boolean x1;
    public int y0;
    public boolean y1;
    public int z0;
    public final Rect z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ood(Context context) {
        super(context, null, 0);
        boolean z = false;
        this.G0 = -1;
        this.p1 = true;
        getContext();
        this.R1 = bk4.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, b3c.SignSeekBar, 0, 0);
        this.b = typedArrayObtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_min, 0.0f);
        this.c = typedArrayObtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_max, 100.0f);
        this.o = typedArrayObtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_progress, this.b);
        this.s0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_is_float_type, false);
        int i = (int) 2.0f;
        this.t0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_track_size, fk4.b(i));
        this.j1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_text_space, fk4.b(i));
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_second_track_size, fk4.b(i) + this.t0);
        this.u0 = dimensionPixelSize;
        this.v0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_radius, fk4.b(i) + dimensionPixelSize);
        this.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_radius, this.u0 * 2);
        this.S0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_border_size, fk4.b((int) 1.0f));
        this.A0 = typedArrayObtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_count, 10);
        int i2 = b3c.SignSeekBar_ssb_track_color;
        int i3 = epc.a;
        this.x0 = typedArrayObtainStyledAttributes.getColor(i2, lt3.a(context, i3));
        int color = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_second_track_color, lt3.a(context, i3));
        this.y0 = color;
        this.z0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_thumb_color, color);
        this.D0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_section_text, false);
        this.E0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_section_text_size, (int) fk4.e(14.0f));
        this.F0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_section_text_color, this.x0);
        this.N0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_seek_by_section, false);
        int integer = typedArrayObtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_text_position, -1);
        if (integer == 0) {
            this.G0 = 0;
        } else if (integer == 1) {
            this.G0 = 1;
        } else if (integer == 2) {
            this.G0 = 2;
        } else {
            this.G0 = -1;
        }
        this.H0 = typedArrayObtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_section_text_interval, 1);
        this.I0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_thumb_text, false);
        this.J0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_thumb_text_size, (int) fk4.e(14.0f));
        this.K0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_thumb_text_color, this.y0);
        this.W0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_color, this.y0);
        this.U0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_border_color, this.y0);
        this.V0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_unusable_color, -7829368);
        this.X0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_text_size, (int) fk4.e(14.0f));
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_height, fk4.b((int) 32.0f));
        this.a1 = dimensionPixelSize2;
        this.Z0 = dimensionPixelSize2;
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_width, fk4.b((int) 40.0f));
        this.c1 = dimensionPixelSize3;
        this.b1 = dimensionPixelSize3;
        int i4 = (int) 3.0f;
        this.B1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_arrow_height, fk4.b(i4));
        this.C1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_arrow_width, fk4.b((int) 5.0f));
        this.D1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(b3c.SignSeekBar_ssb_sign_round, fk4.b(i4));
        this.Y0 = typedArrayObtainStyledAttributes.getColor(b3c.SignSeekBar_ssb_sign_text_color, -1);
        this.B0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_section_mark, false);
        this.C0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_auto_adjust_section_mark, false);
        this.L0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_progress_in_float, false);
        int integer2 = typedArrayObtainStyledAttributes.getInteger(b3c.SignSeekBar_ssb_anim_duration, -1);
        this.O0 = integer2 < 0 ? 200L : integer2;
        this.M0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_touch_to_seek, false);
        this.T0 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_sign_show_border, false);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(b3c.SignSeekBar_ssb_sides_labels, 0);
        this.u1 = typedArrayObtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_thumb_bg_alpha, 0.2f);
        this.v1 = typedArrayObtainStyledAttributes.getFloat(b3c.SignSeekBar_ssb_thumb_ratio, 0.7f);
        this.w1 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_thumb_shadow, false);
        this.x1 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_show_sign, false);
        this.y1 = typedArrayObtainStyledAttributes.getBoolean(b3c.SignSeekBar_ssb_sign_arrow_autofloat, true);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.n1 = paint;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setTextAlign(Paint.Align.CENTER);
        this.o1 = new Rect();
        if (resourceId > 0) {
            this.s1 = getResources().getStringArray(resourceId);
        }
        String[] strArr = this.s1;
        if (strArr != null && strArr.length > 0) {
            z = true;
        }
        this.t1 = z;
        this.A1 = new RectF();
        this.z1 = new Rect();
        this.E1 = new Point();
        this.F1 = new Point();
        this.G1 = new Point();
        Path path = new Path();
        this.K1 = path;
        path.setFillType(Path.FillType.EVEN_ODD);
        this.L1 = new Path();
        d();
        e();
    }

    private String getMaxText() {
        boolean z = this.s0;
        float f = this.c;
        return z ? String.valueOf(BigDecimal.valueOf(f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private String getMinText() {
        boolean z = this.s0;
        float f = this.b;
        return z ? String.valueOf(BigDecimal.valueOf(f).setScale(1, 4).floatValue()) : String.valueOf((int) f);
    }

    private int getSignAndThumbSpace() {
        this.R1.getClass();
        return fk4.b((int) 1.0f);
    }

    private int getSignOnTouchJumpHeight() {
        this.R1.getClass();
        return fk4.b((int) 10.0f) + this.w0;
    }

    public final void a(boolean z) {
        if (this.x1) {
            ValueAnimator valueAnimator = this.a;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.R0, z ? 1.0f : 0.0f);
            this.a = valueAnimatorOfFloat;
            valueAnimatorOfFloat.setDuration(100L);
            this.a.addUpdateListener(new z00(17, this));
            this.a.start();
        }
    }

    public final void b() {
        ValueAnimator valueAnimatorOfFloat;
        float f = 0.0f;
        int i = 0;
        while (i <= this.A0) {
            float f2 = this.h1;
            f = (i * f2) + this.l1;
            float f3 = this.f1;
            if (f <= f3 && f3 - f <= f2) {
                break;
            } else {
                i++;
            }
        }
        boolean z = BigDecimal.valueOf((double) this.f1).setScale(1, 4).floatValue() == f;
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            valueAnimatorOfFloat = null;
        } else {
            float f4 = this.f1;
            float f5 = f4 - f;
            float f6 = this.h1;
            valueAnimatorOfFloat = f5 <= f6 / 2.0f ? ValueAnimator.ofFloat(f4, f) : ValueAnimator.ofFloat(f4, ((i + 1) * f6) + this.l1);
            valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            valueAnimatorOfFloat.addUpdateListener(new yj0(6, this));
        }
        if (!z) {
            animatorSet.setDuration(this.O0).playTogether(valueAnimatorOfFloat);
        }
        animatorSet.addListener(new lod(this, 1));
        animatorSet.start();
    }

    public final void c() {
        String strValueOf;
        String str;
        if (this.L0) {
            float progressFloat = getProgressFloat();
            strValueOf = String.valueOf(progressFloat);
            NumberFormat numberFormat = this.P1;
            if (numberFormat != null) {
                strValueOf = numberFormat.format(progressFloat);
            }
        } else {
            int progress = getProgress();
            strValueOf = String.valueOf(progress);
            NumberFormat numberFormat2 = this.P1;
            if (numberFormat2 != null) {
                strValueOf = numberFormat2.format(progress);
            }
        }
        nod nodVar = this.Q1;
        if (nodVar != null) {
            strValueOf = ((o46) nodVar).a(Float.parseFloat(strValueOf));
        } else if (strValueOf != null && (str = this.M1) != null && !str.isEmpty()) {
            if (this.N1) {
                strValueOf = (" " + this.M1 + " ").concat(strValueOf);
            } else {
                strValueOf = strValueOf.concat(" <small>" + this.M1 + "</small> ");
            }
        }
        this.J1 = new StaticLayout(Html.fromHtml(strValueOf), this.O1, this.b1, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
    }

    public final void d() {
        Paint paint = new Paint(1);
        this.H1 = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.H1.setAntiAlias(true);
        this.H1.setColor(this.W0);
        Paint paint2 = new Paint(1);
        this.I1 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.I1.setStrokeWidth(this.S0);
        this.I1.setColor(this.U0);
        this.I1.setAntiAlias(true);
        TextPaint textPaint = new TextPaint(1);
        this.O1 = textPaint;
        textPaint.setStyle(style);
        this.O1.setTextSize(this.X0);
        this.O1.setColor(this.Y0);
    }

    public final void e() {
        if (this.b == this.c) {
            this.b = 0.0f;
            this.c = 100.0f;
        }
        float f = this.b;
        float f2 = this.c;
        if (f > f2) {
            this.c = f;
            this.b = f2;
        }
        float f3 = this.o;
        float f4 = this.b;
        if (f3 < f4) {
            this.o = f4;
        }
        float f5 = this.o;
        float f6 = this.c;
        if (f5 > f6) {
            this.o = f6;
        }
        int i = this.u0;
        int i2 = this.t0;
        bk4 bk4Var = this.R1;
        if (i < i2) {
            bk4Var.getClass();
            this.u0 = fk4.b((int) 2.0f) + i2;
        }
        int i3 = this.v0;
        int i4 = this.u0;
        if (i3 <= i4) {
            bk4Var.getClass();
            this.v0 = fk4.b((int) 2.0f) + i4;
        }
        int i5 = this.w0;
        int i6 = this.u0;
        if (i5 <= i6) {
            this.w0 = i6 * 2;
        }
        if (this.A0 <= 0) {
            this.A0 = 10;
        }
        float f7 = this.c - this.b;
        this.d1 = f7;
        float f8 = f7 / this.A0;
        this.e1 = f8;
        if (f8 < 1.0f) {
            this.s0 = true;
        }
        if (this.s0) {
            this.L0 = true;
        }
        int i7 = this.G0;
        if (i7 != -1) {
            this.D0 = true;
        }
        if (this.D0) {
            if (i7 == -1) {
                this.G0 = 0;
            }
            if (this.G0 == 2) {
                this.B0 = true;
            }
        }
        if (this.H0 < 1) {
            this.H0 = 1;
        }
        if (this.C0 && !this.B0) {
            this.C0 = false;
        }
        if (this.N0) {
            this.q1 = this.o;
            this.B0 = true;
            this.C0 = true;
            this.M0 = false;
        }
        setProgress(this.o);
        this.J0 = (this.s0 || this.N0 || (this.D0 && this.G0 == 2)) ? this.E0 : this.J0;
    }

    public final void f() {
        String strA = null;
        if (this.L0) {
            float progressFloat = getProgressFloat();
            nod nodVar = this.Q1;
            if (nodVar != null) {
                strA = ((o46) nodVar).a(progressFloat);
            }
        } else {
            int progress = getProgress();
            nod nodVar2 = this.Q1;
            if (nodVar2 != null) {
                strA = ((o46) nodVar2).a(progress);
            }
        }
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        TextPaint textPaint = this.O1;
        int length = strA.length();
        Rect rect = this.o1;
        textPaint.getTextBounds(strA, 0, length, rect);
        bk4 bk4Var = this.R1;
        bk4Var.getClass();
        int iB = fk4.b((int) 14.0f);
        bk4Var.getClass();
        int iB2 = fk4.b((int) 7.0f);
        int iWidth = rect.width() + iB + iB;
        int i = this.c1;
        if (iWidth > i) {
            this.b1 = iWidth;
        } else {
            this.b1 = i;
        }
        int iHeight = rect.height() + iB2 + this.B1 + iB2;
        int i2 = this.a1;
        if (iHeight > i2) {
            this.Z0 = iHeight;
        } else {
            this.Z0 = i2;
        }
    }

    public hod getConfigBuilder() {
        if (this.r1 == null) {
            hod hodVar = new hod();
            hodVar.a = this;
            this.r1 = hodVar;
        }
        hod hodVar2 = this.r1;
        hodVar2.b = this.b;
        hodVar2.c = this.c;
        hodVar2.d = this.o;
        hodVar2.e = this.s0;
        hodVar2.f = this.t0;
        hodVar2.g = this.u0;
        hodVar2.h = this.v0;
        hodVar2.i = this.w0;
        hodVar2.j = this.x0;
        hodVar2.k = this.y0;
        hodVar2.l = this.z0;
        hodVar2.m = this.A0;
        hodVar2.n = this.B0;
        hodVar2.o = this.C0;
        hodVar2.p = this.D0;
        hodVar2.q = this.E0;
        hodVar2.r = this.F0;
        hodVar2.s = this.G0;
        hodVar2.t = this.H0;
        hodVar2.u = this.I0;
        hodVar2.v = this.J0;
        hodVar2.w = this.K0;
        hodVar2.x = this.L0;
        hodVar2.y = this.O0;
        hodVar2.z = this.M0;
        hodVar2.A = this.N0;
        hodVar2.F = this.s1;
        hodVar2.G = this.u1;
        hodVar2.H = this.v1;
        hodVar2.I = this.w1;
        hodVar2.J = this.M1;
        hodVar2.U = this.N1;
        hodVar2.T = this.P1;
        hodVar2.B = this.W0;
        hodVar2.C = this.X0;
        hodVar2.D = this.Y0;
        hodVar2.E = this.x1;
        hodVar2.K = this.B1;
        hodVar2.L = this.C1;
        hodVar2.M = this.D1;
        hodVar2.N = this.Z0;
        hodVar2.O = this.b1;
        hodVar2.Q = this.T0;
        hodVar2.P = this.S0;
        hodVar2.S = this.U0;
        hodVar2.R = this.y1;
        hodVar2.V = this.P0;
        hodVar2.W = this.Q0;
        return hodVar2;
    }

    public float getMax() {
        return this.c;
    }

    public float getMin() {
        return this.b;
    }

    public int getProgress() {
        if (!this.N0 || !this.k1) {
            return Math.round(this.o);
        }
        float f = this.e1;
        float f2 = f / 2.0f;
        float f3 = this.o;
        float f4 = this.q1;
        if (f3 >= f4) {
            if (f3 < f2 + f4) {
                return Math.round(f4);
            }
            float f5 = f4 + f;
            this.q1 = f5;
            return Math.round(f5);
        }
        if (f3 >= f4 - f2) {
            return Math.round(f4);
        }
        float f6 = f4 - f;
        this.q1 = f6;
        return Math.round(f6);
    }

    public float getProgressFloat() {
        return BigDecimal.valueOf(this.o).setScale(1, 4).floatValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bb, code lost:
    
        if (r1 != r21.c) goto L159;
     */
    /* JADX WARN: Removed duplicated region for block: B:203:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 1492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ood.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        String maxText;
        super.onMeasure(i, i2);
        int signOnTouchJumpHeight = this.w0 * 2;
        boolean z = this.I0;
        int i3 = this.j1;
        Paint paint = this.n1;
        Rect rect = this.o1;
        if (z) {
            paint.setTextSize(this.J0);
            paint.getTextBounds("j", 0, 1, rect);
            signOnTouchJumpHeight += rect.height() + i3;
        }
        if (this.D0 && this.G0 >= 1) {
            String str = this.t1 ? this.s1[0] : "j";
            paint.setTextSize(this.E0);
            paint.getTextBounds(str, 0, str.length(), rect);
            signOnTouchJumpHeight = Math.max(signOnTouchJumpHeight, rect.height() + (this.w0 * 2) + i3);
        }
        if (this.x1) {
            f();
            signOnTouchJumpHeight = signOnTouchJumpHeight + this.Z0 + getSignOnTouchJumpHeight();
            if (this.T0) {
                signOnTouchJumpHeight += this.S0;
            }
        }
        setMeasuredDimension(View.resolveSize(getSuggestedMinimumWidth(), i), signOnTouchJumpHeight);
        this.l1 = getPaddingLeft() + this.w0;
        this.m1 = (getMeasuredWidth() - getPaddingRight()) - this.w0;
        if (this.D0) {
            paint.setTextSize(this.E0);
            int i4 = this.G0;
            if (i4 == 0) {
                String minText = getMinText();
                paint.getTextBounds(minText, 0, minText.length(), rect);
                this.l1 += rect.width() + i3;
                String maxText2 = getMaxText();
                paint.getTextBounds(maxText2, 0, maxText2.length(), rect);
                this.m1 -= rect.width() + i3;
            } else if (i4 >= 1) {
                String minText2 = this.t1 ? this.s1[0] : getMinText();
                paint.getTextBounds(minText2, 0, minText2.length(), rect);
                this.l1 = getPaddingLeft() + Math.max(this.w0, rect.width() / 2.0f) + i3;
                if (this.t1) {
                    String[] strArr = this.s1;
                    maxText = strArr[strArr.length - 1];
                } else {
                    maxText = getMaxText();
                }
                paint.getTextBounds(maxText, 0, maxText.length(), rect);
                this.m1 = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.w0, rect.width() / 2.0f)) - i3;
            }
        } else if (this.I0 && this.G0 == -1) {
            paint.setTextSize(this.J0);
            String minText3 = getMinText();
            paint.getTextBounds(minText3, 0, minText3.length(), rect);
            this.l1 = getPaddingLeft() + Math.max(this.w0, rect.width() / 2.0f) + i3;
            String maxText3 = getMaxText();
            paint.getTextBounds(maxText3, 0, maxText3.length(), rect);
            this.m1 = ((getMeasuredWidth() - getPaddingRight()) - Math.max(this.w0, rect.width() / 2.0f)) - i3;
        }
        if (this.x1 && !this.y1) {
            this.l1 = Math.max(this.l1, (this.b1 / 2) + getPaddingLeft() + this.S0);
            this.m1 = Math.min(this.m1, ((getMeasuredWidth() - getPaddingRight()) - (this.b1 / 2)) - this.S0);
        }
        float f = this.m1 - this.l1;
        this.g1 = f;
        this.h1 = (f * 1.0f) / this.A0;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.o = bundle.getFloat("progress");
        super.onRestoreInstanceState(bundle.getParcelable("save_instance"));
        setProgress(this.o);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("save_instance", super.onSaveInstanceState());
        bundle.putFloat("progress", this.o);
        return bundle;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new kod(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ood.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setOnProgressChangedListener(mod modVar) {
    }

    public void setProgress(float f) {
        this.o = f;
        postInvalidate();
    }

    public void setUnit(String str) {
        this.M1 = str;
        c();
        invalidate();
        requestLayout();
    }

    public void setValueFormatListener(nod nodVar) {
        this.Q1 = nodVar;
    }
}
