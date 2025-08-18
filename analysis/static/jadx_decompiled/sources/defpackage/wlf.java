package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class wlf implements xlf {
    public final float[] a;

    public wlf(float[] fArr) {
        this.a = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlf) && tpa.f(this.a, ((wlf) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return zr6.i("WithCorners(corners=", Arrays.toString(this.a), ")");
    }
}
