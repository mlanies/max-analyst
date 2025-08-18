package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o73 {
    public final int[] a;
    public final int b;

    public o73(int i, int[] iArr) {
        this.a = iArr;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o73)) {
            return false;
        }
        o73 o73Var = (o73) obj;
        return tpa.f(this.a, o73Var.a) && this.b == o73Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return zr6.j(au1.m("CommonBackgroundSkeletonBubbleGradientPrimaryColors(gradient=", Arrays.toString(this.a), ", staticBackground="), this.b, ")");
    }
}
