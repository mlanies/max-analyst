package defpackage;

import android.widget.TextView;

/* loaded from: classes2.dex */
public final class dm2 extends c8e implements kre {
    public final TextView o;

    public dm2(TextView textView) {
        super(textView);
        this.o = textView;
        textView.setLayoutParams(new pdc(-1, -2));
        float f = 16;
        float f2 = 7;
        textView.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        i4f.o.b(textView, du4.b);
        onThemeChanged(qp4.u0.j(textView));
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        xoe text = fkaVar.getText();
        TextView textView = this.o;
        textView.setTextColor(text.i);
        textView.setBackgroundColor(fkaVar.b().j);
    }
}
