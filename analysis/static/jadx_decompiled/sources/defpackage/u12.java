package defpackage;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.LinearLayout;
import android.widget.TextView;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class u12 extends LinearLayout implements kre {
    public final /* synthetic */ int a = 0;
    public final TextView b;
    public final TextView c;
    public final OneMeButton o;

    public u12(ForgotPinCodeDialog forgotPinCodeDialog, Context context) {
        super(context);
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        i4f.d.b(textView, du4.b);
        textView.setGravity(1);
        textView.setText(p1c.oneme_settings_privacy_forgot_pin_code);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        i4f.m.b(textView2, du4.b);
        textView2.setText(p1c.oneme_settings_privacy_forgot_pin_code_write_support);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(jpc.w3);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        tu0.K(oneMeButton, 300L, new xx5(1, forgotPinCodeDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(qp4.u0.j(this));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        switch (this.a) {
            case 0:
                this.b.setTextColor(fkaVar.getText().e);
                this.c.setTextColor(fkaVar.getText().g);
                this.o.onThemeChanged(fkaVar);
                break;
            default:
                this.b.setTextColor(fkaVar.getText().e);
                this.c.setTextColor(fkaVar.getText().g);
                this.o.onThemeChanged(fkaVar);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u12(ChangeDisabledDialog changeDisabledDialog, Context context) {
        pq9 pq9Var;
        super(context);
        int i = 0;
        setOrientation(1);
        setGravity(17);
        TextView textView = new TextView(getContext());
        i4f.d.b(textView, du4.b);
        textView.setGravity(1);
        textView.setText(p1c.oneme_settings_privacy_change_disabled_title);
        textView.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = tu0.G(10 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        addView(textView);
        this.b = textView;
        TextView textView2 = new TextView(getContext());
        i4f.m.b(textView2, du4.b);
        int i2 = ChangeDisabledDialog.y0;
        SpannableString spannableStringValueOf = SpannableString.valueOf(changeDisabledDialog.getContext().getText(p1c.oneme_settings_privacy_change_disabled_description));
        URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringValueOf.getSpans(0, spannableStringValueOf.length(), URLSpan.class);
        qyc qycVar = (qyc) ((y7d) ehd.a.getAccessor().d(y7d.class).getValue());
        qycVar.getClass();
        String strS = qycVar.s(PmsKey.f120supportaccount, "max.ru/support");
        int length = uRLSpanArr.length;
        while (true) {
            pq9Var = qp4.u0;
            if (i >= length) {
                break;
            }
            URLSpan uRLSpan = uRLSpanArr[i];
            int spanStart = spannableStringValueOf.getSpanStart(uRLSpan);
            int spanEnd = spannableStringValueOf.getSpanEnd(uRLSpan);
            if (spanStart >= 0 && spanStart < spanEnd) {
                spannableStringValueOf.removeSpan(uRLSpan);
                xoe text = pq9Var.j(textView2).getText();
                v02 v02Var = new v02(2, changeDisabledDialog);
                ek7 ek7Var = new ek7(strS, text.j);
                ek7Var.c = v02Var;
                ft.B(spannableStringValueOf, ek7Var, spanStart, spanEnd);
                break;
            }
            i++;
        }
        textView2.setText(spannableStringValueOf);
        textView2.setGravity(1);
        textView2.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams2);
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        addView(textView2);
        this.c = textView2;
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        oneMeButton.setSize(c7a.c);
        oneMeButton.setMode(b7a.a);
        oneMeButton.setAppearance(z6a.c);
        oneMeButton.setText(jpc.k0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = tu0.G(32 * fk4.d().getDisplayMetrics().density);
        oneMeButton.setLayoutParams(layoutParams3);
        tu0.K(oneMeButton, 300L, new c5(15, changeDisabledDialog));
        addView(oneMeButton);
        this.o = oneMeButton;
        onThemeChanged(pq9Var.j(this));
    }
}
