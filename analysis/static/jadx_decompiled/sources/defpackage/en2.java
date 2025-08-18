package defpackage;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class en2 extends LinearLayout implements hk7, i33 {
    public dn2 a;
    public final kk7 b;
    public final TextView c;

    public en2(Context context) {
        super(context, null);
        j33 j33Var = new j33(context, this);
        kk7 kk7Var = new kk7(this, new md1(13, this), 4);
        this.b = kk7Var;
        TextView textView = new TextView(context);
        textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        i4f.l.b(textView, du4.b);
        textView.setMovementMethod(j33Var);
        textView.setTransformationMethod(kk7Var);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        v3c.y(new v9(3, null, 5), textView);
        textView.setGravity(16);
        this.c = textView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setOrientation(1);
        float f = 12;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        addView(textView);
    }

    @Override // defpackage.hk7
    public final void b(String str, lk7 lk7Var, ClickableSpan clickableSpan) {
        dn2 dn2Var = this.a;
        if (dn2Var != null) {
            ((gaa) ((sy4) dn2Var).b).G(str, lk7Var);
        }
    }

    @Override // defpackage.i33
    public final boolean d(ClickableSpan clickableSpan, int i, int i2, String str, lk7 lk7Var, MotionEvent motionEvent) {
        dn2 dn2Var = this.a;
        if (dn2Var == null) {
            return false;
        }
        ((gaa) ((sy4) dn2Var).b).H(str, lk7Var, motionEvent);
        return true;
    }

    public final dn2 getListener() {
        return this.a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.c(spannable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CharSequence text = this.c.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null) {
            return;
        }
        this.b.getClass();
        kk7.a(spannable);
    }

    public final void setDescription(CharSequence charSequence) {
        TextView textView = this.c;
        CharSequence text = textView.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        kk7 kk7Var = this.b;
        if (spannable != null) {
            kk7Var.getClass();
            kk7.a(spannable);
        }
        textView.setText(charSequence);
        textView.setTransformationMethod(kk7Var);
        CharSequence text2 = textView.getText();
        Spannable spannable2 = text2 instanceof Spannable ? (Spannable) text2 : null;
        if (spannable2 == null) {
            return;
        }
        kk7Var.c(spannable2);
    }

    public final void setListener(dn2 dn2Var) {
        this.a = dn2Var;
    }
}
