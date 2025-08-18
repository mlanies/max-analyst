package defpackage;

import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes2.dex */
public final class xi5 {
    public float c;
    public float d;
    public final float e;
    public float f;
    public float g;
    public float h;
    public float k;
    public final /* synthetic */ yi5 m;
    public final float a = 1.0f / ((float) Math.sqrt(2.0f));
    public final int b = tu0.G(fk4.d().getDisplayMetrics().density * 2);
    public float i = 1.0f;
    public int j = -1;
    public final AccelerateDecelerateInterpolator l = new AccelerateDecelerateInterpolator();

    public xi5(yi5 yi5Var) {
        this.m = yi5Var;
        this.e = tu0.G(r3 * fk4.d().getDisplayMetrics().density);
    }

    public final String toString() {
        return naf.h("(%.1f, %.1f, %.1f)", Float.valueOf(this.f), Float.valueOf(this.g), Float.valueOf(this.h));
    }
}
