package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import java.util.List;

/* loaded from: classes.dex */
public final class tl8 extends LinearLayout implements kre {
    public m56 a;
    public final View b;
    public final LinearLayout c;

    public tl8(Context context) {
        super(context, null, 0);
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, tu0.G(1 * fk4.d().getDisplayMetrics().density)));
        this.b = view;
        LinearLayout linearLayout = new LinearLayout(context);
        float f = 12;
        linearLayout.setPadding(tu0.G(fk4.d().getDisplayMetrics().density * f), linearLayout.getPaddingTop(), tu0.G(f * fk4.d().getDisplayMetrics().density), linearLayout.getPaddingBottom());
        this.c = linearLayout;
        setOrientation(1);
        addView(view);
        addView(linearLayout);
        view.setBackgroundColor(qp4.u0.j(this).i().b.c);
    }

    public final m56 getOnClickListener() {
        return this.a;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        pq9 pq9Var = qp4.u0;
        qp4.d(pq9Var.b(getContext()), this);
        this.b.setBackgroundColor(pq9Var.j(this).i().b.c);
    }

    public final void setOnClickListener(m56 m56Var) {
        this.a = m56Var;
    }

    public final void setSelected(jm8 jm8Var) {
        u1 u1Var = new u1(4, this.c);
        while (u1Var.hasNext()) {
            View view = (View) u1Var.next();
            sl8 sl8Var = view instanceof sl8 ? (sl8) view : null;
            if (sl8Var != null) {
                sl8Var.setIsSelected(tpa.f(sl8Var.getState(), jm8Var));
            }
        }
    }

    public final void setState(List<? extends jm8> list) {
        LinearLayout linearLayout = this.c;
        linearLayout.removeAllViews();
        for (jm8 jm8Var : list) {
            sl8 sl8Var = new sl8(getContext());
            sl8Var.setIsSelected(false);
            sl8Var.setState(jm8Var);
            tu0.K(sl8Var, 300L, new vu5(this, 13, jm8Var));
            linearLayout.addView(sl8Var);
        }
    }
}
