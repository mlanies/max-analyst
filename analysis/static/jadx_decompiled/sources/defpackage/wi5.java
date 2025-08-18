package defpackage;

import android.view.animation.AccelerateInterpolator;

/* loaded from: classes2.dex */
public final class wi5 {
    public long a;
    public long b;
    public long c;
    public long d;
    public final float e = tu0.G(2 * fk4.d().getDisplayMetrics().density);
    public long f = dy7.l(-1, -1);
    public final AccelerateInterpolator g = new AccelerateInterpolator();
    public float h = 1.0f;
    public float i;
    public float j;
    public final /* synthetic */ yi5 k;

    public wi5(yi5 yi5Var) {
        this.k = yi5Var;
        float f = 0;
        this.a = mr0.k(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.b = mr0.k(tu0.G(fk4.d().getDisplayMetrics().density * f), tu0.G(fk4.d().getDisplayMetrics().density * f));
        float f2 = 8;
        this.c = mr0.k(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f));
        this.d = mr0.k(tu0.G(f2 * fk4.d().getDisplayMetrics().density), tu0.G(f * fk4.d().getDisplayMetrics().density));
    }

    public final String toString() {
        return naf.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.h));
    }
}
