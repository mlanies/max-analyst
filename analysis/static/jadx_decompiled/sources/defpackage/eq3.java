package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class eq3 extends LinearLayout implements hk7, i33 {
    public dq3 a;
    public final j33 b;
    public final kk7 c;
    public final TextView o;
    public final p85 s0;

    public eq3(Context context) {
        super(context, null);
        this.b = new j33(context, this);
        this.c = new kk7(this, new md1(27, this), 4);
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        i4f.p.b(textView, du4.b);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v3c.y(new v9(3, null, 10), textView);
        textView.setGravity(8388627);
        textView.setSingleLine(true);
        this.o = textView;
        p85 p85Var = new p85(context);
        p85Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setGravity(16);
        p85Var.setTypography(i4f.H);
        p85Var.setCollapsedLines(5);
        p85Var.setExpandWithAnimation(true);
        p85Var.setOnTouchListener(new rf1(p85Var, 1, this));
        this.s0 = p85Var;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = 12;
        float f2 = 8;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        addView(textView);
        addView(p85Var);
        ViewGroup.LayoutParams layoutParams = p85Var.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = tu0.G(2 * fk4.d().getDisplayMetrics().density);
        p85Var.setLayoutParams(marginLayoutParams);
    }

    @Override // defpackage.hk7
    public final void b(String str, lk7 lk7Var, ClickableSpan clickableSpan) {
        dq3 dq3Var = this.a;
        if (dq3Var != null) {
            ((gaa) ((ey1) dq3Var).b).G(str, lk7Var);
        }
    }

    @Override // defpackage.i33
    public final boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7Var, MotionEvent motionEvent) {
        dq3 dq3Var = this.a;
        if (dq3Var == null) {
            return false;
        }
        ((gaa) ((ey1) dq3Var).b).H(str, lk7Var, motionEvent);
        return true;
    }

    public final dq3 getListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SpannableString text = this.s0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.c.c(text);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SpannableString text = this.s0.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        if (text == null) {
            return;
        }
        this.c.getClass();
        kk7.a(text);
    }

    public final void setDescription(CharSequence charSequence) {
        p85 p85Var = this.s0;
        SpannableString text = p85Var.getText();
        if (!(text instanceof Spannable)) {
            text = null;
        }
        kk7 kk7Var = this.c;
        if (text != null) {
            kk7Var.getClass();
            kk7.a(text);
        }
        p85Var.setText(kk7Var.getTransformation(charSequence, p85Var));
        SpannableString text2 = p85Var.getText();
        SpannableString spannableString = text2 instanceof Spannable ? text2 : null;
        if (spannableString == null) {
            return;
        }
        kk7Var.c(spannableString);
    }

    public final void setListener(dq3 dq3Var) {
        this.a = dq3Var;
    }

    public final void setTitle(CharSequence charSequence) {
        this.o.setText(charSequence);
    }
}
