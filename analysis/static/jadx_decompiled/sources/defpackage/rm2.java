package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class rm2 extends LinearLayout {
    public final ppe a;
    public final ppe b;
    public final vs8 c;
    public final vs8 o;

    public rm2(Context context) {
        super(context, null);
        ppe ppeVar = new ppe(context);
        this.a = ppeVar;
        ppe ppeVar2 = new ppe(context);
        this.b = ppeVar2;
        pq9 pq9Var = qp4.u0;
        this.c = new vs8(pq9Var.j(this).a().g().a.o, pq9Var.j(this).a().k().a.o, true, 1, true, true, 384);
        this.o = new vs8(pq9Var.j(this).a().g().a.o, pq9Var.j(this).a().k().a.o, false, 1, true, true, 384);
        setOrientation(1);
        setGravity(16);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388611;
        float f = 16;
        layoutParams.topMargin = tu0.G(fk4.d().getDisplayMetrics().density * f);
        layoutParams.setMarginStart(tu0.G(fk4.d().getDisplayMetrics().density * f));
        addView(ppeVar, layoutParams);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = tu0.G(12 * fk4.d().getDisplayMetrics().density);
        layoutParams2.setMarginEnd(tu0.G(fk4.d().getDisplayMetrics().density * f));
        layoutParams2.bottomMargin = tu0.G(f * fk4.d().getDisplayMetrics().density);
        layoutParams2.gravity = 8388613;
        addView(ppeVar2, layoutParams2);
    }

    public final void setBackgroundPreview(Drawable drawable) {
        setBackground(drawable);
    }
}
