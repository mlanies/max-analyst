package defpackage;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class asc extends ni0 {
    public final s5a a;
    public final TextView b;
    public final TextView c;

    public asc(Context context) {
        super(context, null, 0);
        float f = 24;
        setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(20 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        s5a s5aVar = new s5a(context);
        float f2 = 72;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams.gravity = 1;
        s5aVar.setLayoutParams(layoutParams);
        this.a = s5aVar;
        TextView textView = new TextView(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        textView.setLayoutParams(layoutParams2);
        textView.setTextAlignment(4);
        i4f.k.b(textView, du4.b);
        this.b = textView;
        TextView textView2 = new TextView(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = tu0.G(8 * fk4.d().getDisplayMetrics().density);
        textView2.setLayoutParams(layoutParams3);
        i4f.s.b(textView2, du4.b);
        textView2.setTextAlignment(4);
        textView2.setGravity(17);
        this.c = textView2;
        addView(s5aVar);
        addView(textView);
        addView(textView2);
        onThemeChanged(qp4.u0.b(context).i());
    }

    @Override // defpackage.ni0, defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        super.onThemeChanged(fkaVar);
        this.b.setTextColor(fkaVar.getText().e);
        this.c.setTextColor(fkaVar.getText().h);
    }

    public final void setState(zz4 zz4Var) {
        this.a.setAvatarUrl(zz4Var.a);
        this.b.setText(zz4Var.b.d(this));
        this.c.setText(zz4Var.c.d(this));
    }
}
