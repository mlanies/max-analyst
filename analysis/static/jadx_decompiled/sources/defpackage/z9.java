package defpackage;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z9 implements hx3 {
    public final hx3 a;
    public final float b;

    public z9(float f, hx3 hx3Var) {
        while (hx3Var instanceof z9) {
            hx3Var = ((z9) hx3Var).a;
            f += ((z9) hx3Var).b;
        }
        this.a = hx3Var;
        this.b = f;
    }

    @Override // defpackage.hx3
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return this.a.equals(z9Var.a) && this.b == z9Var.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
