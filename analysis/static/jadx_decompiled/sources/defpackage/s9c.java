package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class s9c extends FrameLayout implements kre {
    public final TextView a;
    public final TextView b;

    public s9c(e09 e09Var, Context context) {
        super(context);
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388627;
        float f = 12;
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        textView.setLayoutParams(layoutParams);
        textView.setText(context.getString(j0c.chats_list_search_recent_header));
        i4f.r.b(textView, du4.b);
        pq9 pq9Var = qp4.u0;
        textView.setTextColor(pq9Var.j(textView).getText().i);
        this.a = textView;
        TextView textView2 = new TextView(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 8388629;
        layoutParams2.setMarginEnd(tu0.G(f * fk4.d().getDisplayMetrics().density));
        textView2.setLayoutParams(layoutParams2);
        textView2.setText(context.getString(j0c.chats_list_search_recent_header_clear));
        i4f.n.b(textView2, du4.b);
        textView2.setTextColor(pq9Var.j(textView2).getText().i);
        tu0.K(textView2, 300L, new m6(20, e09Var));
        this.b = textView2;
        setLayoutParams(new ViewGroup.LayoutParams(-1, tu0.G(40 * fk4.d().getDisplayMetrics().density)));
        addView(textView);
        addView(textView2);
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        this.a.setTextColor(fkaVar.getText().i);
        this.b.setTextColor(fkaVar.getText().i);
    }
}
