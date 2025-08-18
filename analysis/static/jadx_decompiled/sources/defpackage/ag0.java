package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

/* loaded from: classes2.dex */
public final class ag0 {
    public final Drawable a;
    public final int b;
    public final int c;
    public final float d;

    public ag0(GradientDrawable gradientDrawable, int i, float f, int i2) {
        f = (i2 & 8) != 0 ? 12.0f : f;
        this.a = gradientDrawable;
        this.b = i;
        this.c = 20;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ag0)) {
            return false;
        }
        ag0 ag0Var = (ag0) obj;
        return tpa.f(this.a, ag0Var.a) && this.b == ag0Var.b && this.c == ag0Var.c && Float.compare(this.d, ag0Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "Style(backgroundDrawable=" + this.a + ", width=" + this.b + ", height=" + this.c + ", textSize=" + this.d + ")";
    }
}
