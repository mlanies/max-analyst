package defpackage;

import android.R;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* loaded from: classes2.dex */
public final /* synthetic */ class gg9 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jg9 b;

    public /* synthetic */ gg9(jg9 jg9Var, int i) {
        this.a = i;
        this.b = jg9Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                this.b.c.a();
                return e5f.a;
            default:
                Context context = this.b.a.getContext();
                EnhancedVectorDrawable enhancedVectorDrawable = new EnhancedVectorDrawable(context, yfa.k);
                pq9 pq9Var = qp4.u0;
                c54.Z(enhancedVectorDrawable, "circle_background", k7d.h(pq9Var, context).k);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                float f = 24;
                gradientDrawable.setSize(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
                gradientDrawable.setColor(pq9Var.b(context).i().b().e);
                gradientDrawable.setStroke(tu0.G(2 * fk4.d().getDisplayMetrics().density), pq9Var.b(context).i().i().c);
                StateListDrawable stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(new int[]{R.attr.state_checked}, enhancedVectorDrawable);
                stateListDrawable.addState(new int[]{-16842912}, gradientDrawable);
                return stateListDrawable;
        }
    }
}
