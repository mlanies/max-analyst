package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.Interpolator;
import java.text.DecimalFormat;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class caa extends View implements kre, kx5 {
    public static final /* synthetic */ bc7[] P0 = {new oi9(caa.class, "textFont", "getTextFont()Lone/me/sdk/design/dynamicfont/DynamicFont;"), rh4.g(nec.a, caa.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;"), new oi9(caa.class, "appearance", "getAppearance()Lone/me/common/counter/OneMeCounter$Appearance;"), new oi9(caa.class, "hasBackgroundStroke", "getHasBackgroundStroke()Z"), new oi9(caa.class, "hasBackground", "getHasBackground()Z")};
    public final int A0;
    public final int B0;
    public final GradientDrawable C0;
    public boolean D0;
    public final baa E0;
    public final baa F0;
    public final TextPaint G0;
    public final baa H0;
    public final baa I0;
    public final baa J0;
    public long K0;
    public Interpolator L0;
    public int M0;
    public int N0;
    public int O0;
    public boolean a;
    public int b;
    public String c;
    public ValueAnimator o;
    public float s0;
    public StaticLayout t0;
    public StaticLayout u0;
    public StaticLayout v0;
    public StaticLayout w0;
    public int x0;
    public int y0;
    public final int z0;

    public caa(Context context) {
        super(context, null);
        this.b = -1;
        this.c = "";
        this.N0 = 4;
        this.s0 = 1.0f;
        float f = 20;
        this.z0 = tu0.G(fk4.d().getDisplayMetrics().density * f);
        this.A0 = tu0.G(f * fk4.d().getDisplayMetrics().density);
        this.B0 = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        float f2 = fk4.d().getDisplayMetrics().density * 20.0f;
        GradientDrawable gradientDrawableC0 = hm9.c0(null, null, null, new float[]{f2, f2, f2, f2, f2, f2, f2, f2});
        this.C0 = gradientDrawableC0;
        this.E0 = new baa(this, 0);
        this.F0 = new baa(i4f.o, this);
        TextPaint textPaint = new TextPaint(1);
        getTypography().a(textPaint, getResources().getDisplayMetrics(), du4.b);
        this.G0 = textPaint;
        this.H0 = new baa(this, 2);
        this.I0 = new baa(this, 3);
        this.J0 = new baa(this, 4);
        this.K0 = 400L;
        this.M0 = 255;
        this.O0 = 2;
        setBackground(gradientDrawableC0);
        f(qp4.u0.j(this));
    }

    public static String e(int i) {
        String str;
        String str2;
        long j = i;
        DecimalFormat decimalFormat = p9e.a;
        if (j >= 1000000000) {
            str = decimalFormat.format(j / 1.0E9d);
            str2 = "B";
        } else if (j >= 1000000) {
            str = decimalFormat.format(j / 1000000.0d);
            str2 = "M";
        } else {
            if (j < 1000) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                return sb.toString();
            }
            str = decimalFormat.format(j / 1000.0d);
            str2 = "K";
        }
        return au1.g(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final du4 getTextFont() {
        bc7 bc7Var = P0[0];
        return (du4) this.E0.b;
    }

    private final kqe getTypography() {
        bc7 bc7Var = P0[1];
        return (kqe) this.F0.b;
    }

    private final void setCounterWithoutAnimation(int i) {
        this.b = i;
        this.y0 = this.x0;
        String strE = e(i);
        int iMeasureText = (int) this.G0.measureText(strE);
        this.x0 = iMeasureText;
        this.t0 = i(iMeasureText, strE);
        if (this.x0 != this.y0) {
            requestLayout();
        }
        invalidate();
    }

    private final void setTextFont(du4 du4Var) {
        this.E0.o1(this, P0[0], du4Var);
    }

    private final void setTypographyInternal(kqe kqeVar) {
        this.F0.o1(this, P0[1], kqeVar);
    }

    @Override // defpackage.kx5
    public final void a(du4 du4Var) {
        this.D0 = true;
        setTextFont(du4Var);
        getTypography().a(this.G0, getResources().getDisplayMetrics(), du4Var);
        int iS = au1.s(this.O0);
        if (iS == 0) {
            int i = this.b;
            this.b = -1;
            ValueAnimator valueAnimator = this.o;
            g(i, valueAnimator != null && valueAnimator.isStarted());
        } else if (iS == 1) {
            this.O0 = 2;
            ValueAnimator valueAnimator2 = this.o;
            if (valueAnimator2 != null) {
                valueAnimator2.end();
            }
            this.b = 0;
            this.t0 = null;
            requestLayout();
        } else if (iS == 2) {
            h();
        } else {
            if (iS != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setText(this.c);
        }
        this.D0 = false;
        requestLayout();
        invalidate();
    }

    public final int c(String str) {
        if (str.length() == 0) {
            throw new NoSuchElementException();
        }
        char cCharAt = str.charAt(0);
        TextPaint textPaint = this.G0;
        float fMeasureText = textPaint.measureText(String.valueOf(cCharAt));
        int iV0 = w9e.v0(str);
        int i = 1;
        if (1 <= iV0) {
            while (true) {
                fMeasureText = Math.max(fMeasureText, textPaint.measureText(String.valueOf(str.charAt(i))));
                if (i == iV0) {
                    break;
                }
                i++;
            }
        }
        return (int) fMeasureText;
    }

    public final void d(Canvas canvas) {
        StaticLayout staticLayout = this.t0;
        if (staticLayout != null) {
            int iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.x0) / 2.0f, (getHeight() - staticLayout.getHeight()) / 2.0f);
            try {
                staticLayout.draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(defpackage.fka r11) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.caa.f(fka):void");
    }

    public final void g(int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        if (i == this.b || tpa.f(e(i), e(this.b))) {
            return;
        }
        this.O0 = 1;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z || this.O0 == 2 || ((i2 = this.b) == 0 && i > 0)) {
            setCounterWithoutAnimation(i);
            return;
        }
        if (i2 < 0) {
            this.G0.setAlpha(0);
            this.C0.setAlpha(0);
            i3 = 1;
        } else {
            i3 = 3;
        }
        this.N0 = i3;
        this.s0 = 0.0f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        int i5 = this.N0;
        int[] iArr = aaa.$EnumSwitchMapping$0;
        valueAnimatorOfFloat.setInterpolator(iArr[au1.s(i5)] == 1 ? this.L0 : null);
        valueAnimatorOfFloat.setDuration(iArr[au1.s(this.N0)] == 1 ? this.K0 : 150L);
        valueAnimatorOfFloat.addUpdateListener(new z00(13, this));
        valueAnimatorOfFloat.addListener(new eh(valueAnimatorOfFloat, i4, new zj7(16, this)));
        this.o = valueAnimatorOfFloat;
        String strE = e(i);
        String strE2 = e(this.b);
        if (this.t0 != null) {
            if (strE2.length() == strE.length()) {
                int iC = c(strE2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strE2);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(strE);
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(strE);
                int length = strE2.length();
                for (int i6 = 0; i6 < length; i6++) {
                    if (strE2.charAt(i6) == strE.charAt(i6)) {
                        int i7 = i6 + 1;
                        spannableStringBuilder.setSpan(new y9a(), i6, i7, 0);
                        spannableStringBuilder2.setSpan(new y9a(), i6, i7, 0);
                        spannableStringBuilder3.setSpan(new z9a(iC), i6, i7, 0);
                    } else {
                        int i8 = i6 + 1;
                        spannableStringBuilder.setSpan(new z9a(iC), i6, i8, 0);
                        spannableStringBuilder2.setSpan(new z9a(iC), i6, i8, 0);
                        spannableStringBuilder3.setSpan(new y9a(), i6, i8, 0);
                    }
                }
                int length2 = strE2.length() * iC;
                this.u0 = i(length2, spannableStringBuilder);
                this.w0 = i(length2, spannableStringBuilder3);
                this.v0 = i(length2, spannableStringBuilder2);
            } else {
                this.u0 = this.t0;
            }
        }
        this.y0 = this.x0;
        this.a = i > this.b;
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
        if (i >= 0) {
            int iC2 = c(strE);
            this.x0 = strE.length() * iC2;
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(strE);
            int length3 = strE.length();
            int i9 = 0;
            while (i9 < length3) {
                int i10 = i9 + 1;
                spannableStringBuilder4.setSpan(new z9a(iC2), i9, i10, 0);
                i9 = i10;
            }
            this.t0 = i(this.x0, spannableStringBuilder4);
        }
        this.b = i;
        if (this.x0 != this.y0) {
            requestLayout();
        }
    }

    public final x9a getAppearance() {
        bc7 bc7Var = P0[2];
        return (x9a) this.H0.b;
    }

    public final boolean getHasBackground() {
        bc7 bc7Var = P0[4];
        return ((Boolean) this.J0.b).booleanValue();
    }

    public final boolean getHasBackgroundStroke() {
        bc7 bc7Var = P0[3];
        return ((Boolean) this.I0.b).booleanValue();
    }

    public final long getReplaceDuration() {
        return this.K0;
    }

    public final Interpolator getReplaceInterpolator() {
        return this.L0;
    }

    public final void h() {
        this.O0 = 3;
        ValueAnimator valueAnimator = this.o;
        if (valueAnimator != null) {
            valueAnimator.end();
        }
        this.b = 0;
        int iMeasureText = (int) this.G0.measureText("!");
        this.x0 = iMeasureText;
        this.t0 = i(iMeasureText, "!");
        if (this.x0 != this.y0) {
            requestLayout();
        }
        invalidate();
    }

    public final StaticLayout i(int i, CharSequence charSequence) {
        return StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), this.G0, i).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(false).setMaxLines(1).build();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int iSave;
        int i;
        super.onDraw(canvas);
        float f = this.s0;
        boolean z = !(f == 1.0f);
        TextPaint textPaint = this.G0;
        if (z && ((i = this.N0) == 1 || i == 2)) {
            d(canvas);
            this.C0.setAlpha((int) (this.s0 * 255));
            textPaint.setAlpha((int) (this.s0 * this.M0));
            return;
        }
        if (!(!(f == 1.0f)) || this.N0 != 3) {
            if (!(f == 1.0f)) {
                return;
            }
            d(canvas);
            return;
        }
        float f2 = f * 2;
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        canvas.save();
        StaticLayout staticLayout = this.v0;
        if (staticLayout != null) {
            float height = ((getHeight() - staticLayout.getHeight()) / 2.0f) + ((1.0f - f2) * tu0.G((this.a ? 13 : -13) * fk4.d().getDisplayMetrics().density));
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.x0) / 2.0f, height);
            try {
                textPaint.setAlpha((int) (this.M0 * f2));
                staticLayout.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        } else {
            StaticLayout staticLayout2 = this.t0;
            if (staticLayout2 != null) {
                float height2 = ((getHeight() - staticLayout2.getHeight()) / 2.0f) + ((1.0f - f2) * tu0.G((this.a ? 13 : -13) * fk4.d().getDisplayMetrics().density));
                iSave = canvas.save();
                canvas.translate((canvas.getWidth() - this.x0) / 2.0f, height2);
                try {
                    textPaint.setAlpha((int) (this.M0 * f2));
                    staticLayout2.draw(canvas);
                    canvas.restoreToCount(iSave);
                } finally {
                }
            }
        }
        StaticLayout staticLayout3 = this.u0;
        if (staticLayout3 != null) {
            float height3 = ((getHeight() - staticLayout3.getHeight()) / 2.0f) + (tu0.G((this.a ? -13 : 13) * fk4.d().getDisplayMetrics().density) * f2);
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.x0) / 2.0f, height3);
            try {
                textPaint.setAlpha((int) ((1.0f - f2) * this.M0));
                staticLayout3.draw(canvas);
                canvas.restoreToCount(iSave);
            } finally {
            }
        }
        StaticLayout staticLayout4 = this.w0;
        if (staticLayout4 != null) {
            iSave = canvas.save();
            canvas.translate((canvas.getWidth() - this.x0) / 2.0f, (getHeight() - this.w0.getHeight()) / 2.0f);
            try {
                textPaint.setAlpha(this.M0);
                staticLayout4.draw(canvas);
            } finally {
            }
        }
        textPaint.setAlpha(this.M0);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int length;
        int iC;
        super.onMeasure(i, i2);
        if (this.O0 != 4) {
            String strE = e(this.b);
            length = strE.length();
            iC = c(strE);
        } else {
            String str = this.c;
            length = str.length();
            iC = c(str);
        }
        int i3 = iC * length;
        if (getHasBackground()) {
            int i4 = this.z0;
            i3 = i3 > i4 / 2 ? i3 + (this.B0 * 2) : i4;
        }
        Paint.FontMetrics fontMetrics = this.G0.getFontMetrics();
        setMeasuredDimension(i3, Math.max((int) Math.ceil(fontMetrics.descent - fontMetrics.ascent), this.A0));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        f(fkaVar);
    }

    public final void setAppearance(x9a x9aVar) {
        this.H0.o1(this, P0[2], x9aVar);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        f(qp4.u0.j(this));
    }

    public final void setHasBackground(boolean z) {
        this.J0.o1(this, P0[4], Boolean.valueOf(z));
    }

    public final void setHasBackgroundStroke(boolean z) {
        this.I0.o1(this, P0[3], Boolean.valueOf(z));
    }

    public final void setReplaceDuration(long j) {
        this.K0 = j;
    }

    public final void setReplaceInterpolator(Interpolator interpolator) {
        this.L0 = interpolator;
    }

    public final void setText(String str) {
        if (!(!w9e.C0(str))) {
            this.c = "";
            this.O0 = 2;
            ValueAnimator valueAnimator = this.o;
            if (valueAnimator != null) {
                valueAnimator.end();
            }
            this.b = 0;
            this.t0 = null;
            requestLayout();
            return;
        }
        this.O0 = 4;
        ValueAnimator valueAnimator2 = this.o;
        if (valueAnimator2 != null) {
            valueAnimator2.end();
        }
        this.b = 0;
        this.c = str;
        int iMeasureText = (int) this.G0.measureText(str);
        this.x0 = iMeasureText;
        this.t0 = i(iMeasureText, str);
        if (this.x0 != this.y0) {
            requestLayout();
        }
        invalidate();
    }

    public final void setTextColor(int i) {
        TextPaint textPaint = this.G0;
        textPaint.setColor(ote.b0(i, 1.0f));
        this.M0 = textPaint.getAlpha();
        invalidate();
    }

    public final void setTypography(kqe kqeVar) {
        setTypographyInternal(kqeVar);
    }
}
