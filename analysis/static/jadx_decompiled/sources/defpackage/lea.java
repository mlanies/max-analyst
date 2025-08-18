package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.method.DigitsKeyListener;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes2.dex */
public final class lea extends LinearLayout implements kre {
    public kea a;
    public m56 b;
    public eaa c;
    public final qec o;
    public boolean s0;
    public final AppCompatImageView t0;
    public final AppCompatTextView u0;
    public final AppCompatImageView v0;
    public final EditText w0;
    public z2 x0;

    public lea(Context context) {
        super(context, null);
        this.o = new qec("^[+\\d][\\d\\s\\u00A0-]*$");
        InputFilter[] inputFilterArr = {new InputFilter() { // from class: jea
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.a.o.a(charSequence) ? charSequence : "";
            }
        }};
        AppCompatImageView appCompatImageView = new AppCompatImageView(context, null);
        appCompatImageView.setId(View.generateViewId());
        this.t0 = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(xoc.P);
        kqe kqeVar = i4f.l;
        kqeVar.b(appCompatTextView, du4.b);
        float f = 4;
        float f2 = 0;
        appCompatTextView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        this.u0 = appCompatTextView;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(context, null);
        appCompatImageView2.setId(View.generateViewId());
        appCompatImageView2.setImageResource(woc.Y);
        this.v0 = appCompatImageView2;
        hra hraVar = new hra(context, new wz7(13, this));
        EditText editText = new EditText(context);
        editText.setId(xoc.Q);
        editText.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(tu0.G(8 * fk4.d().getDisplayMetrics().density), 0, 0, 0);
        editText.setLayoutParams(layoutParams);
        kqeVar.b(editText, du4.b);
        editText.setAutofillHints("phone");
        editText.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.F(fk4.d().getDisplayMetrics().density * 1.5d), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.setFilters(inputFilterArr);
        editText.setKeyListener(DigitsKeyListener.getInstance("0123456789 -()"));
        editText.setImportantForAutofill(1);
        editText.setInputType(3);
        editText.setSingleLine(true);
        editText.setSaveEnabled(false);
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.setCustomSelectionActionModeCallback(hraVar);
        editText.setCustomInsertionActionModeCallback(hraVar);
        editText.setOnFocusChangeListener(new e33(2, this));
        editText.setOnKeyListener(new b09(1, this));
        this.w0 = editText;
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        float f3 = 12;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f3), getPaddingTop(), tu0.G(f3 * fk4.d().getDisplayMetrics().density), getPaddingBottom());
        setOrientation(0);
        setMinimumHeight(tu0.G(52 * fk4.d().getDisplayMetrics().density));
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        addView(appCompatImageView);
        addView(appCompatTextView);
        addView(appCompatImageView2);
        addView(editText);
        onThemeChanged(qp4.u0.j(this));
        z2 z2Var = new z2(4, this);
        editText.addTextChangedListener(z2Var);
        this.x0 = z2Var;
    }

    public final String getCode() {
        return String.valueOf(this.u0.getText());
    }

    public final m56 getOnWindowFocusChanged() {
        return this.b;
    }

    public final String getPhone() {
        CharSequence text = this.u0.getText();
        Editable text2 = this.w0.getText();
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append((Object) text2);
        return sb.toString();
    }

    public final kea getPhoneFormatterProvider() {
        return this.a;
    }

    public final String getPhoneWithoutCode() {
        return String.valueOf(this.w0.getText());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        this.w0.removeTextChangedListener(this.x0);
        this.x0 = null;
        this.a = null;
        super.onDetachedFromWindow();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        setBackgroundColor(fkaVar.b().a.g);
        EditText editText = this.w0;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fkaVar.getText().j));
        }
        editText.setTextColor(fkaVar.getText().e);
        editText.setHintTextColor(fkaVar.getText().g);
        this.v0.setImageTintList(ColorStateList.valueOf(fkaVar.getIcon().j));
        this.u0.setTextColor(fkaVar.getText().e);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m56 m56Var = this.b;
        if (m56Var != null) {
            m56Var.invoke(Boolean.valueOf(z));
        }
    }

    public final void setCountry(eaa eaaVar) {
        Drawable drawableB;
        this.c = eaaVar;
        AppCompatImageView appCompatImageView = this.t0;
        Integer num = eaaVar.o;
        if (num != null) {
            drawableB = kt3.b(getContext(), num.intValue());
        } else {
            drawableB = null;
        }
        appCompatImageView.setImageDrawable(drawableB);
        this.u0.setText("+" + eaaVar.b);
    }

    public final void setHint(CharSequence charSequence) {
        this.w0.setHint(charSequence);
    }

    public final void setOnCountryViewClickListener(k56 k56Var) {
        m6 m6Var = new m6(16, k56Var);
        this.t0.setOnClickListener(m6Var);
        this.u0.setOnClickListener(m6Var);
        this.v0.setOnClickListener(m6Var);
    }

    public final void setOnWindowFocusChanged(m56 m56Var) {
        this.b = m56Var;
    }

    public final void setPhoneFormatterProvider(kea keaVar) {
        this.a = keaVar;
    }

    public final void setText(CharSequence charSequence) {
        EditText editText = this.w0;
        editText.setText(charSequence, TextView.BufferType.NORMAL);
        try {
            editText.setSelection(charSequence.length());
        } catch (IndexOutOfBoundsException e) {
            hm9.p(lea.class.getName(), e.toString(), e);
        }
    }
}
