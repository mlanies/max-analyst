package defpackage;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class n04 extends LinearLayout {
    public int a;
    public final EditText b;
    public final TextView c;

    public n04(Context context) {
        super(context, null);
        this.a = Integer.MAX_VALUE;
        EditText editText = new EditText(context);
        i4f.l.b(editText, du4.b);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        editText.setHintTextColor(qp4.u0.j(editText).getText().i);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.b = editText;
        TextView textView = new TextView(context);
        i4f.v.b(textView, du4.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.c = textView;
        setOrientation(0);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new ix3(fk4.d().getDisplayMetrics().density * 16.0f));
        addView(editText);
        addView(textView);
        float f = 12;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f));
        v3c.y(new xh0(3, (Continuation) null, 8), this);
    }

    public final String getText() {
        return this.b.getText().toString();
    }

    public final void setHint(CharSequence charSequence) {
        this.b.setHint(charSequence);
    }

    public final void setMaxCount(int i) {
        this.a = i;
        TextView textView = this.c;
        EditText editText = this.b;
        Editable text = editText.getText();
        textView.setText(String.valueOf(i - (text != null ? text.length() : 0)));
        editText.setFilters(this.a != Integer.MAX_VALUE ? new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(this.a)} : new InputFilter[0]);
    }

    public final void setTextChangeListener(m56 m56Var) {
        this.b.addTextChangedListener(new vf1(m56Var, 1, this));
    }
}
