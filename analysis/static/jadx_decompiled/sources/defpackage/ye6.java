package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ye6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;
    public final int[] d;

    public ye6(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
        this.d = iArr4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ye6)) {
            return false;
        }
        ye6 ye6Var = (ye6) obj;
        return tpa.f(this.a, ye6Var.a) && tpa.f(this.b, ye6Var.b) && tpa.f(this.c, ye6Var.c) && tpa.f(this.d, ye6Var.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        String string3 = Arrays.toString(this.c);
        String string4 = Arrays.toString(this.d);
        StringBuilder sbK = k7d.k("GradientsBannerDKBackgroundColors(fantasyGradient=", string, ", iconContainerGradient=", string2, ", paleBlueGradient=");
        sbK.append(string3);
        sbK.append(", vibrantGradient=");
        sbK.append(string4);
        sbK.append(")");
        return sbK.toString();
    }
}
