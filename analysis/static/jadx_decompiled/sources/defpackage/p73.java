package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class p73 {
    public final int[] a;
    public final int b;

    public p73(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p73)) {
            return false;
        }
        p73 p73Var = (p73) obj;
        return tpa.f(this.a, p73Var.a) && this.b == p73Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(au1.m("CommonBackgroundSkeletonBubbleGradientSecondaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
