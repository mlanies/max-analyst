package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ore {
    public final float a;
    public final float b;
    public final int[] c;
    public final float[] d;
    public final float e;
    public final float f;
    public final float g;

    public ore(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = iArr;
        this.d = fArr;
        this.e = f3;
        this.f = f4;
        this.g = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ore)) {
            return false;
        }
        ore oreVar = (ore) obj;
        return Float.compare(this.a, oreVar.a) == 0 && Float.compare(this.b, oreVar.b) == 0 && tpa.f(this.c, oreVar.c) && tpa.f(this.d, oreVar.d) && Float.compare(this.e, oreVar.e) == 0 && Float.compare(this.f, oreVar.f) == 0 && Float.compare(this.g, oreVar.g) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.g) + ms2.c(ms2.c((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + ms2.c(Float.hashCode(this.a) * 31, this.b, 31)) * 31)) * 31, this.e, 31), this.f, 31);
    }

    public final String toString() {
        return "GradientEllipse(x=" + this.a + ", y=" + this.b + ", color=" + Arrays.toString(this.c) + ", stops=" + Arrays.toString(this.d) + ", radiusX=" + this.e + ", radiusY=" + this.f + ", angle=" + this.g + ")";
    }
}
