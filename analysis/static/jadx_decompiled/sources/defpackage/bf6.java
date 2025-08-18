package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bf6 {
    public final int[] a;
    public final int[] b;
    public final int[] c;

    public bf6(int[] iArr, int[] iArr2, int[] iArr3) {
        this.a = iArr;
        this.b = iArr2;
        this.c = iArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf6)) {
            return false;
        }
        bf6 bf6Var = (bf6) obj;
        return tpa.f(this.a, bf6Var.a) && tpa.f(this.b, bf6Var.b) && tpa.f(this.c, bf6Var.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.c) + ((Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.a);
        String string2 = Arrays.toString(this.b);
        return zr6.l(k7d.k("GradientsButtonTextPromoColors(defaultGradient=", string, ", disabledGradient=", string2, ", pressedGradient="), Arrays.toString(this.c), ")");
    }
}
