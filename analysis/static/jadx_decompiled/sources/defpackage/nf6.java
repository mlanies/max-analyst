package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nf6 {
    public final int[] a;

    public nf6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nf6) && tpa.f(this.a, ((nf6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zr6.i("GradientsLocalColors(promoTextGradient=", Arrays.toString(this.a), ")");
    }
}
