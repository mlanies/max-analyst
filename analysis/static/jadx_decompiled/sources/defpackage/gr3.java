package defpackage;

import android.content.Context;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class gr3 extends dec {
    public static final int[] H0 = {-16239405, -16737808};
    public static final int[] I0 = {-11664148, -7436801};
    public final wq3 F0;
    public final kh0 G0;

    public gr3(Context context, wq3 wq3Var) {
        kh0 kh0Var = (kh0) dh0.a.getAccessor().c(kh0.class);
        x8a x8aVar = new x8a(context, null);
        super(x8aVar);
        this.F0 = wq3Var;
        this.G0 = kh0Var;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        float f = 12;
        marginLayoutParams.setMargins(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(f * fk4.d().getDisplayMetrics().density));
        x8aVar.setLayoutParams(marginLayoutParams);
    }
}
