package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class t73 {
    public final int[] a;
    public final int b;

    public t73(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t73)) {
            return false;
        }
        t73 t73Var = (t73) obj;
        return tpa.f(this.a, t73Var.a) && this.b == t73Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(au1.m("CommonBackgroundSkeletonStickerSecondaryBaseGradientColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
