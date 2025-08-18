package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class df6 {
    public final int[] a;

    public df6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof df6) && tpa.f(this.a, ((df6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zr6.i("GradientsComplexColors(overlayFloatingGradient=", Arrays.toString(this.a), ")");
    }
}
