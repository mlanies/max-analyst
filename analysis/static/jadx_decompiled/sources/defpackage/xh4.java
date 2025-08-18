package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class xh4 extends LinearLayout implements kre {
    public static final /* synthetic */ bc7[] v0 = {new oi9(xh4.class, "maxCount", "getMaxCount()I"), rh4.g(nec.a, xh4.class, "backgroundColorAttr", "getBackgroundColorAttr()Ljava/lang/Integer;"), new oi9(xh4.class, "textColorAttr", "getTextColorAttr()I"), new oi9(xh4.class, "hintColorAttr", "getHintColorAttr()I"), new oi9(xh4.class, "limitTextColorAttr", "getLimitTextColorAttr()I")};
    public final wh4 a;
    public final wh4 b;
    public final wh4 c;
    public final wh4 o;
    public final wh4 s0;
    public final EditText t0;
    public final TextView u0;

    public xh4(Context context) {
        super(context, null);
        this.a = new wh4(this, 0);
        this.b = new wh4(this, 1);
        this.c = new wh4(Integer.valueOf(wfa.W), this, 2);
        int i = wfa.X;
        this.o = new wh4(Integer.valueOf(i), this, 3);
        this.s0 = new wh4(Integer.valueOf(i), this, 4);
        EditText editText = new EditText(context);
        editText.setId(xoc.N);
        i4f.l.b(editText, du4.b);
        editText.setBackground(null);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setSize(tu0.G(2 * fk4.d().getDisplayMetrics().density), editText.getLineHeight());
        editText.setTextCursorDrawable(gradientDrawable);
        editText.setGravity(8388659);
        editText.setMinLines(2);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 8388659;
        editText.setLayoutParams(layoutParams);
        editText.setPadding(0, 0, 0, 0);
        this.t0 = editText;
        TextView textView = new TextView(context);
        i4f.v.b(textView, du4.b);
        textView.setPadding(0, 0, 0, 0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388693;
        textView.setLayoutParams(layoutParams2);
        this.u0 = textView;
        setOrientation(0);
        setGravity(16);
        setClipToOutline(true);
        setOutlineProvider(new ix3(tu0.G(16 * fk4.d().getDisplayMetrics().density)));
        addView(editText);
        addView(textView);
        float f = 12;
        setPaddingRelative(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f));
        onThemeChanged(qp4.u0.j(this));
    }

    public final Integer getBackgroundColorAttr() {
        bc7 bc7Var = v0[1];
        return (Integer) this.b.b;
    }

    public final int getHintColorAttr() {
        bc7 bc7Var = v0[3];
        return ((Number) this.o.b).intValue();
    }

    public final int getLimitTextColorAttr() {
        bc7 bc7Var = v0[4];
        return ((Number) this.s0.b).intValue();
    }

    public final int getMaxCount() {
        bc7 bc7Var = v0[0];
        return ((Number) this.a.b).intValue();
    }

    public final int getTextColorAttr() {
        bc7 bc7Var = v0[2];
        return ((Number) this.c.b).intValue();
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        EditText editText = this.t0;
        Drawable textCursorDrawable = editText.getTextCursorDrawable();
        GradientDrawable gradientDrawable = textCursorDrawable instanceof GradientDrawable ? (GradientDrawable) textCursorDrawable : null;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(ColorStateList.valueOf(fkaVar.getText().j));
        }
        Integer backgroundColorAttr = getBackgroundColorAttr();
        pq9 pq9Var = qp4.u0;
        if (backgroundColorAttr != null) {
            setBackgroundColor(pq9Var.j(this).c(backgroundColorAttr.intValue()));
        }
        editText.setTextColor(pq9Var.j(this).c(getTextColorAttr()));
        editText.setHintTextColor(pq9Var.j(this).c(getHintColorAttr()));
        this.u0.setTextColor(pq9Var.j(this).c(getLimitTextColorAttr()));
    }

    public final void setBackgroundColorAttr(Integer num) {
        this.b.o1(this, v0[1], num);
    }

    public final void setHint(jqe jqeVar) {
        this.t0.setHint(jqeVar.d(this));
    }

    public final void setHintColorAttr(int i) {
        this.o.o1(this, v0[3], Integer.valueOf(i));
    }

    public final void setLimitTextColorAttr(int i) {
        this.s0.o1(this, v0[4], Integer.valueOf(i));
    }

    public final void setMaxCount(int i) {
        this.a.o1(this, v0[0], Integer.valueOf(i));
    }

    public final void setText(String str) {
        this.t0.setText(str);
        TextView textView = this.u0;
        textView.setVisibility(getMaxCount() != Integer.MAX_VALUE ? 0 : 8);
        textView.setText(String.valueOf(getMaxCount() - (str != null ? str.length() : 0)));
    }

    public final void setTextColorAttr(int i) {
        this.c.o1(this, v0[2], Integer.valueOf(i));
    }
}
