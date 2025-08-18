package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class ebf {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final int[] f;
    public final float[] g;

    public ebf(float f, float f2, float f3, float f4, float f5, float[] fArr, int[] iArr) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = iArr;
        this.g = fArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebf)) {
            return false;
        }
        ebf ebfVar = (ebf) obj;
        return Float.compare(this.a, ebfVar.a) == 0 && Float.compare(this.b, ebfVar.b) == 0 && Float.compare(this.c, ebfVar.c) == 0 && Float.compare(this.d, ebfVar.d) == 0 && Float.compare(this.e, ebfVar.e) == 0 && tpa.f(this.f, ebfVar.f) && tpa.f(this.g, ebfVar.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f) + ms2.c(ms2.c(ms2.c(ms2.c(Float.hashCode(this.a) * 31, this.b, 31), this.c, 31), this.d, 31), this.e, 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.f);
        String string2 = Arrays.toString(this.g);
        StringBuilder sb = new StringBuilder("GradientEllipse(x=");
        sb.append(this.a);
        sb.append(", y=");
        sb.append(this.b);
        sb.append(", radiusX=");
        sb.append(this.c);
        sb.append(", radiusY=");
        sb.append(this.d);
        sb.append(", angle=");
        sb.append(this.e);
        sb.append(", color=");
        sb.append(string);
        sb.append(", stops=");
        return zr6.l(sb, string2, ")");
    }
}
