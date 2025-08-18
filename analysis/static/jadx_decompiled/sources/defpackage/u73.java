package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class u73 {
    public final t73 a;
    public final int[] b;

    public u73(t73 t73Var, int[] iArr) {
        this.a = t73Var;
        this.b = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u73)) {
            return false;
        }
        u73 u73Var = (u73) obj;
        return tpa.f(this.a, u73Var.a) && tpa.f(this.b, u73Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CommonBackgroundSkeletonStickerSecondaryColors(baseGradient=" + this.a + ", tongueGradient=" + Arrays.toString(this.b) + ")";
    }
}
