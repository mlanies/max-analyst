package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class wnc {
    public int a = 2;
    public boolean b = false;
    public float[] c = null;
    public int d = 0;
    public float e = 0.0f;
    public int f = 0;
    public float g = 0.0f;
    public boolean h = false;

    public static wnc a(float f, float f2, float f3, float f4) {
        wnc wncVar = new wnc();
        wncVar.c(f, f2, f3, f4);
        return wncVar;
    }

    public static wnc b(float[] fArr) {
        wnc wncVar = new wnc();
        fArr.getClass();
        od2.k("radii should have exactly 8 values", fArr.length == 8);
        if (wncVar.c == null) {
            wncVar.c = new float[8];
        }
        System.arraycopy(fArr, 0, wncVar.c, 0, 8);
        return wncVar;
    }

    public final void c(float f, float f2, float f3, float f4) {
        if (this.c == null) {
            this.c = new float[8];
        }
        float[] fArr = this.c;
        fArr[1] = f;
        fArr[0] = f;
        fArr[3] = f2;
        fArr[2] = f2;
        fArr[5] = f3;
        fArr[4] = f3;
        fArr[7] = f4;
        fArr[6] = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wnc.class != obj.getClass()) {
            return false;
        }
        wnc wncVar = (wnc) obj;
        if (this.b == wncVar.b && this.d == wncVar.d && Float.compare(wncVar.e, this.e) == 0 && this.f == wncVar.f && Float.compare(wncVar.g, this.g) == 0 && this.a == wncVar.a && this.h == wncVar.h) {
            return Arrays.equals(this.c, wncVar.c);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int iS = (((i != 0 ? au1.s(i) : 0) * 31) + (this.b ? 1 : 0)) * 31;
        float[] fArr = this.c;
        int iHashCode = (((iS + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.d) * 31;
        float f = this.e;
        int iFloatToIntBits = (((iHashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31) + this.f) * 31;
        float f2 = this.g;
        return ((iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 961) + (this.h ? 1 : 0);
    }
}
