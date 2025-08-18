package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class p85 extends View implements kre {
    public static final /* synthetic */ bc7[] C0;
    public Integer A0;
    public qp0 B0;
    public final fe7 a;
    public final CharSequence b;
    public final yj c;
    public final TextPaint o;
    public SpannableString s0;
    public int t0;
    public Layout u0;
    public Layout v0;
    public Layout w0;
    public boolean x0;
    public boolean y0;
    public boolean z0;

    static {
        oi9 oi9Var = new oi9(p85.class, "typography", "getTypography()Lone/me/sdk/design/TextStyle;");
        nec.a.getClass();
        C0 = new bc7[]{oi9Var};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p85(Context context) {
        super(context);
        fe7 fe7Var = (fe7) xcb.a.getAccessor().c(fe7.class);
        this.a = fe7Var;
        String strD = new eqe(yea.l).d(this);
        this.b = strD == null ? "" : strD;
        this.c = new yj(8, this, i4f.H);
        TextPaint textPaint = new TextPaint(1);
        getTypography().a(textPaint, getResources().getDisplayMetrics(), du4.b);
        pq9 pq9Var = qp4.u0;
        textPaint.setColor(pq9Var.j(this).getText().e);
        this.o = textPaint;
        this.t0 = Integer.MAX_VALUE;
        onThemeChanged(pq9Var.j(this));
    }

    public final Layout a(int i, CharSequence charSequence) {
        int i2 = gvd.a;
        return this.a.a(crd.l(charSequence, true), this.o, i, Integer.MAX_VALUE, false, TextUtils.TruncateAt.END);
    }

    public final void b(int i) {
        Layout layoutA;
        CharSequence charSequenceSubSequence;
        CharSequence charSequence = this.s0;
        if (charSequence == null) {
            return;
        }
        Layout layoutA2 = a(i, charSequence);
        this.w0 = layoutA2;
        if (layoutA2.getLineCount() <= this.t0) {
            layoutA = this.w0;
        } else {
            StringBuilder sb = new StringBuilder("… ");
            CharSequence charSequence2 = this.b;
            sb.append((Object) charSequence2);
            String string = sb.toString();
            TextPaint textPaint = this.o;
            float fMeasureText = textPaint.measureText(string);
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) string);
            Layout layoutA3 = a(i, spannableStringBuilderAppend);
            int lineCount = layoutA3.getLineCount();
            int i2 = this.t0;
            if (lineCount > i2) {
                int lineStart = layoutA3.getLineStart(i2 - 1);
                CharSequence charSequenceSubSequence2 = spannableStringBuilderAppend.subSequence(0, layoutA3.getLineEnd(this.t0 - 1));
                while (layoutA3.getWidth() <= textPaint.measureText(charSequenceSubSequence2, lineStart, charSequenceSubSequence2.length()) + fMeasureText) {
                    int length = charSequenceSubSequence2.length() - 1;
                    if (length < 0) {
                        length = 0;
                    }
                    charSequenceSubSequence2 = w9e.X0(length, charSequenceSubSequence2);
                }
                int length2 = charSequenceSubSequence2.length() - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i3 = length2 - 1;
                        if (charSequenceSubSequence2.charAt(length2) != '\n') {
                            charSequenceSubSequence = charSequenceSubSequence2.subSequence(0, length2 + 1);
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            length2 = i3;
                        }
                    }
                    charSequenceSubSequence = "";
                    spannableStringBuilderAppend = (SpannableStringBuilder) charSequenceSubSequence;
                } else {
                    charSequenceSubSequence = "";
                    spannableStringBuilderAppend = (SpannableStringBuilder) charSequenceSubSequence;
                }
            }
            layoutA = a(i, new SpannableStringBuilder(kp.z(spannableStringBuilderAppend)).append((CharSequence) "… ").append(charSequence2, new e27(2, this), 33));
        }
        this.v0 = layoutA;
        if (this.z0) {
            layoutA = this.w0;
        }
        this.u0 = layoutA;
    }

    public final void c() {
        if (isAttachedToWindow() && getMeasuredWidth() > 0) {
            b(getMeasuredWidth());
            this.x0 = true;
            requestLayout();
        } else {
            if (this.B0 != null) {
                return;
            }
            this.B0 = new qp0(1, this);
            getViewTreeObserver().addOnPreDrawListener(this.B0);
        }
    }

    public final SpannableString getText() {
        return this.s0;
    }

    public final Layout getTextLayout() {
        return this.u0;
    }

    public final kqe getTypography() {
        bc7 bc7Var = C0[0];
        return (kqe) this.c.b;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        qp0 qp0Var = this.B0;
        if (qp0Var != null) {
            if (getViewTreeObserver().isAlive()) {
                getViewTreeObserver().removeOnPreDrawListener(qp0Var);
            }
            this.B0 = null;
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = getPaddingLeft();
        float paddingTop = getPaddingTop();
        int iSave = canvas.save();
        canvas.translate(paddingLeft, paddingTop);
        try {
            Layout layout = this.u0;
            if (layout != null) {
                layout.draw(canvas);
            }
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0008 A[PHI: r2
      0x0008: PHI (r2v9 java.lang.Integer) = (r2v1 java.lang.Integer), (r2v4 java.lang.Integer) binds: [B:3:0x0006, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r1, int r2) {
        /*
            r0 = this;
            int r1 = android.view.View.MeasureSpec.getSize(r1)
            java.lang.Integer r2 = r0.A0
            if (r2 == 0) goto Ld
        L8:
            int r2 = r2.intValue()
            goto L1f
        Ld:
            android.text.Layout r2 = r0.u0
            if (r2 == 0) goto L1a
            int r2 = r2.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L1b
        L1a:
            r2 = 0
        L1b:
            if (r2 == 0) goto L1e
            goto L8
        L1e:
            r2 = 0
        L1f:
            r0.setMeasuredDimension(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p85.onMeasure(int, int):void");
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        Object[] spans;
        this.o.setColor(fkaVar.getText().e);
        SpannableString spannableString = this.s0;
        if (spannableString != null) {
            try {
                spans = spannableString.getSpans(0, spannableString.length(), gk7.class);
            } catch (Throwable unused) {
                spans = null;
            }
            gk7[] gk7VarArr = (gk7[]) spans;
            if (gk7VarArr != null) {
                for (gk7 gk7Var : gk7VarArr) {
                    gk7Var.b = qp4.u0.j(this).getText().j;
                }
            }
        }
        invalidate();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        CharSequence text;
        if (motionEvent.getAction() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout = this.u0;
        if (layout == null || (text = layout.getText()) == null) {
            return super.onTouchEvent(motionEvent);
        }
        Layout layout2 = this.u0;
        if (layout2 == null) {
            return super.onTouchEvent(motionEvent);
        }
        int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical((int) (motionEvent.getY() - getPaddingTop())), motionEvent.getX() - getPaddingLeft());
        float f = 2;
        int iQ = rh4.q(f, fk4.d().getDisplayMetrics().density, offsetForHorizontal);
        if (iQ < 0) {
            iQ = 0;
        }
        int iC = rh4.c(f, fk4.d().getDisplayMetrics().density, offsetForHorizontal);
        int length = text.length();
        if (iC > length) {
            iC = length;
        }
        Object[] spans = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                spans = spanned.getSpans(iQ, iC, ClickableSpan.class);
            }
        } catch (Throwable unused) {
        }
        ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spans;
        if (clickableSpanArr == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (!(!(clickableSpanArr.length == 0))) {
            return super.onTouchEvent(motionEvent);
        }
        clickableSpanArr[0].onClick(this);
        return true;
    }

    public final void setCollapsedLines(int i) {
        this.t0 = i;
    }

    public final void setExpandWithAnimation(boolean z) {
        this.y0 = z;
    }

    public final void setText(SpannableString spannableString) {
        this.s0 = spannableString;
    }

    public final void setTextColor(int i) {
        this.o.setColor(i);
        invalidate();
    }

    public final void setTypography(kqe kqeVar) {
        this.c.o1(this, C0[0], kqeVar);
    }

    public final void setText(CharSequence charSequence) {
        gvd gvdVarL;
        Spannable spannableK = qx7.k(charSequence, qp4.u0.j(this).getText().j, (28 & 4) != 0, false, null);
        if (spannableK != null) {
            int i = gvd.a;
            gvdVarL = crd.l(spannableK, true);
        } else {
            gvdVarL = null;
        }
        this.s0 = gvdVarL;
        this.z0 = false;
        this.x0 = false;
        c();
    }
}
