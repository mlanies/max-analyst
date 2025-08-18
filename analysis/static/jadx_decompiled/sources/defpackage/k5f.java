package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class k5f extends LinearLayout {
    public final i4a a;
    public final i4a b;

    public k5f(Context context) {
        super(context);
        i4a i4aVar = new i4a(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        float f = 12;
        float f2 = 8;
        layoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(16 * fk4.d().getDisplayMetrics().density), tu0.G(fk4.d().getDisplayMetrics().density * f2));
        layoutParams.weight = 1.0f;
        i4aVar.setLayoutParams(layoutParams);
        i4aVar.setAppearance(h4a.a);
        i4aVar.setText(oea.f);
        this.a = i4aVar;
        i4a i4aVar2 = new i4a(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.setMargins(0, tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(f * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density));
        layoutParams2.weight = 1.0f;
        i4aVar2.setLayoutParams(layoutParams2);
        i4aVar2.setAppearance(h4a.b);
        i4aVar2.setText(oea.g);
        this.b = i4aVar2;
        setOrientation(0);
        addView(i4aVar);
        addView(i4aVar2);
    }

    public final void setOnAddContactClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.a, 300L, onClickListener);
    }

    public final void setOnBlockContactClickListener(View.OnClickListener onClickListener) {
        tu0.K(this.b, 300L, onClickListener);
    }
}
