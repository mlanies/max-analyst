package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class z8c extends RecyclerView {
    public final jv5 V1;
    public final GradientDrawable W1;

    public z8c(Context context, zu2 zu2Var) {
        super(context, null);
        jv5 jv5Var = new jv5(zu2Var, jyc.a.p().a(), 11);
        this.V1 = jv5Var;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setSize(tu0.G(1 * fk4.d().getDisplayMetrics().density), tu0.F(fk4.d().getDisplayMetrics().density * 0.5d));
        this.W1 = gradientDrawable;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setLayoutManager(new LinearLayoutManager(0, false));
        setAdapter(jv5Var);
        setItemAnimator(null);
        j(new kq(8));
        lm4 lm4Var = new lm4(context);
        lm4Var.c = gradientDrawable;
        j(lm4Var);
        v3c.y(new r1b(3, (Continuation) null, 5), this);
    }

    public final void setContacts(List<v8c> list) {
        this.V1.E(list);
    }
}
