package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class af6 {
    public final int[] a;

    public af6(int[] iArr) {
        this.a = iArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof af6) && tpa.f(this.a, ((af6) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zr6.i("GradientsBannerDKStrokeColors(iconContainerGradient=", Arrays.toString(this.a), ")");
    }
}
