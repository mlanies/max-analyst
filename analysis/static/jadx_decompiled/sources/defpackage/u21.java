package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class u21 extends LinearLayout {
    public final int a;
    public final int b;
    public final int c;
    public final int o;
    public final int s0;
    public final int t0;
    public final TextView u0;
    public final v21 v0;

    public u21(Context context) {
        super(context, null);
        int iG = tu0.G(16 * fk4.d().getDisplayMetrics().density);
        this.a = iG;
        int iG2 = tu0.G(28 * fk4.d().getDisplayMetrics().density);
        this.b = iG2;
        int iG3 = tu0.G(4 * fk4.d().getDisplayMetrics().density);
        this.c = iG3;
        this.o = tu0.G(44 * fk4.d().getDisplayMetrics().density);
        this.s0 = tu0.G(72 * fk4.d().getDisplayMetrics().density);
        this.t0 = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.bottomMargin = tu0.G(6 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams);
        textView.setText(z7.B(context, f0c.call_change_mode_text_hint));
        textView.setGravity(17);
        textView.setTextColor(qp4.u0.p(textView).c.getText().g);
        i4f.q.b(textView, du4.b);
        this.u0 = textView;
        v21 v21Var = new v21(context);
        v21Var.setLayoutParams(new LinearLayout.LayoutParams(iG, iG2));
        v21Var.setPadding(iG3, iG3, iG3, iG3);
        this.v0 = v21Var;
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        setOrientation(1);
        setGravity(17);
        addView(textView);
        addView(v21Var);
    }
}
