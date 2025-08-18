package defpackage;

/* loaded from: classes.dex */
public final class f42 {
    public final int a;
    public final int b;
    public final float[] c;
    public final boolean d;
    public final boolean e;

    public f42(int i, int i2, float[] fArr) {
        boolean z = false;
        fm9.e("Input channel count must be positive.", i > 0);
        fm9.e("Output channel count must be positive.", i2 > 0);
        fm9.e("Coefficient array length is invalid.", fArr.length == i * i2);
        this.a = i;
        this.b = i2;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (fArr[i3] < 0.0f) {
                throw new IllegalArgumentException(wg0.g(i3, "Coefficient at index ", " is negative."));
            }
        }
        this.c = fArr;
        int i4 = 0;
        boolean z2 = true;
        boolean z3 = true;
        boolean z4 = true;
        while (i4 < i) {
            int i5 = 0;
            while (i5 < i2) {
                float f = this.c[(this.b * i4) + i5];
                boolean z5 = i4 == i5;
                if (f != 1.0f && z5) {
                    z4 = false;
                }
                if (f != 0.0f) {
                    z2 = false;
                    if (!z5) {
                        z3 = false;
                    }
                }
                i5++;
            }
            i4++;
        }
        this.d = z2;
        if (this.a == this.b && z3 && z4) {
            z = true;
        }
        this.e = z;
    }

    public static f42 a(int i, int i2) {
        float[] fArr;
        if (i == i2) {
            fArr = new float[i2 * i2];
            for (int i3 = 0; i3 < i2; i3++) {
                fArr[(i2 * i3) + i3] = 1.0f;
            }
        } else if (i == 1 && i2 == 2) {
            fArr = new float[]{1.0f, 1.0f};
        } else {
            if (i != 2 || i2 != 1) {
                throw new UnsupportedOperationException(wg0.h("Default channel mixing coefficients for ", i, "->", i2, " are not yet implemented."));
            }
            fArr = new float[]{0.5f, 0.5f};
        }
        return new f42(i, i2, fArr);
    }
}
