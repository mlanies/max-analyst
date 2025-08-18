package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class of6 {
    public final int[] a;
    public final int[] b;

    public of6(int[] iArr, int[] iArr2) {
        this.a = iArr;
        this.b = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof of6)) {
            return false;
        }
        of6 of6Var = (of6) obj;
        return tpa.f(this.a, of6Var.a) && tpa.f(this.b, of6Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return k7d.j("GradientsOverlayColors(surfaceGroundGradient=", Arrays.toString(this.a), ", surfacePrimaryGradient=", Arrays.toString(this.b), ")");
    }
}
