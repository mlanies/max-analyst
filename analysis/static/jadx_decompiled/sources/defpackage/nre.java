package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class nre {
    public final int[] a;
    public final float b;

    public nre(int[] iArr, float f) {
        this.a = iArr;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nre)) {
            return false;
        }
        nre nreVar = (nre) obj;
        return tpa.f(this.a, nreVar.a) && Float.compare(this.b, nreVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Arrays.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Gradient(colors=" + Arrays.toString(this.a) + ", angle=" + this.b + ")";
    }
}
