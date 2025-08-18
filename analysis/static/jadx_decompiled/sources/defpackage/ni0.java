package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public abstract class ni0 extends LinearLayout implements kre {
    public ni0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        int iG = tu0.G(14 * fk4.d().getDisplayMetrics().density);
        setPadding(iG, iG, iG, iG);
        pq9 pq9Var = qp4.u0;
        e17 e17Var = new e17(fk4.d().getDisplayMetrics().density * 2.0f, fk4.d().getDisplayMetrics().density * 24.0f, pq9Var.j(this).a().s().f.c);
        e17Var.h.o1(e17Var, e17.j[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, pq9Var.j(this).a().s().b.x));
        setBackground(e17Var);
    }

    public void onThemeChanged(fka fkaVar) {
        Drawable background = getBackground();
        e17 e17Var = background instanceof e17 ? (e17) background : null;
        if (e17Var != null) {
            pq9 pq9Var = qp4.u0;
            int i = pq9Var.j(this).a().s().f.c;
            bc7[] bc7VarArr = e17.j;
            e17Var.i.o1(e17Var, bc7VarArr[1], Integer.valueOf(i));
            e17Var.h.o1(e17Var, bc7VarArr[0], new GradientDrawable(GradientDrawable.Orientation.TL_BR, pq9Var.j(this).a().s().b.x));
        }
    }
}
