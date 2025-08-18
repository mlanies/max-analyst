package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class qf6 {
    public final pf6 a;
    public final rf6 b;
    public final int[] c;
    public final int[] d;

    public qf6(pf6 pf6Var, rf6 rf6Var, int[] iArr, int[] iArr2) {
        this.a = pf6Var;
        this.b = rf6Var;
        this.c = iArr;
        this.d = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qf6)) {
            return false;
        }
        qf6 qf6Var = (qf6) obj;
        return tpa.f(this.a, qf6Var.a) && tpa.f(this.b, qf6Var.b) && tpa.f(this.c, qf6Var.c) && tpa.f(this.d, qf6Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + k7d.e(this.b.a, Integer.hashCode(this.a.a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "GradientsSkeletonGradientColors(cell=" + this.a + ", grid=" + this.b + ", cellGradient=" + Arrays.toString(this.c) + ", gridGradient=" + Arrays.toString(this.d) + ")";
    }
}
