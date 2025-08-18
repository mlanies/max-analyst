package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class hs0 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;

    public hs0(int i, int i2, int i3, int[] iArr) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hs0)) {
            return false;
        }
        hs0 hs0Var = (hs0) obj;
        return tpa.f(this.a, hs0Var.a) && this.b == hs0Var.b && this.c == hs0Var.c && this.d == hs0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + k7d.e(this.c, k7d.e(this.b, Arrays.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = au1.m("BubbleBackgroundSystemAssetGradientColors(gradient=", Arrays.toString(this.a), ", strokeStep1=");
        sbM.append(this.b);
        sbM.append(", strokeStep2=");
        sbM.append(this.c);
        sbM.append(", strokeStep3=");
        return zr6.j(sbM, this.d, ")");
    }
}
