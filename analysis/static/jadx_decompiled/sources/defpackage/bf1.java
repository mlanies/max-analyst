package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.view.View;

/* loaded from: classes.dex */
public final class bf1 extends hqd {
    public final ey1 F0;

    public bf1(Context context, ey1 ey1Var) {
        lk3 lk3Var = new lk3(context, null);
        super(lk3Var);
        this.F0 = ey1Var;
        lk3Var.setCustomTheme(qp4.u0.o(context).c);
    }

    @Override // defpackage.hqd
    public final void A(ol7 ol7Var) {
        ve1 ve1Var = (ve1) ol7Var;
        View view = this.a;
        lk3 lk3Var = (lk3) view;
        lk3Var.setId(Long.hashCode(ve1Var.t0));
        String str = ve1Var.b;
        lk3Var.setName(str);
        gg1 gg1Var = ve1Var.a;
        lk3Var.O(gg1Var.a, str, ve1Var.c);
        Integer num = ve1Var.s0;
        lk3Var.setMessage(num != null ? lk3Var.getContext().getString(num.intValue()) : null);
        pq9 pq9Var = qp4.u0;
        int i = pq9Var.p(lk3Var).c.d().a.a.c;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
        shapeDrawable.getPaint().setColor(pq9Var.p(lk3Var).c.b().k);
        lk3Var.setBackground(new RippleDrawable(ColorStateList.valueOf(i), shapeDrawable, null));
        E(gg1Var, ve1Var.o);
        ((lk3) view).setIconInfo(ve1Var.Y ? Integer.valueOf(x7a.J) : null);
        lk3Var.setCustomTheme(pq9Var.p(lk3Var).c);
    }

    public final void E(gg1 gg1Var, boolean z) {
        View view = this.a;
        ((lk3) view).R(Integer.valueOf(x7a.y0), b7a.o, z6a.X, new x2(this, 14, gg1Var));
        if (z) {
            view.setOnClickListener(null);
        } else {
            tu0.K(view, 300L, new tb(this, 5, gg1Var));
        }
    }
}
