package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class bbf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float[] f;

    public bbf(float f, float f2, float f3, float f4, float f5, float[] fArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbf)) {
            return false;
        }
        bbf bbfVar = (bbf) obj;
        return Float.compare(this.a, bbfVar.a) == 0 && Float.compare(this.b, bbfVar.b) == 0 && Float.compare(this.c, bbfVar.c) == 0 && Float.compare(this.d, bbfVar.d) == 0 && Float.compare(this.e, bbfVar.e) == 0 && tpa.f(this.f, bbfVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ms2.c(ms2.c(ms2.c(ms2.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31);
    }

    public final String toString() {
        return "GradientEllipse(cx=" + this.a + ", cy=" + this.b + ", rx=" + this.c + ", ry=" + this.d + ", rotation=" + this.e + ", stops=" + Arrays.toString(this.f) + ")";
    }
}
