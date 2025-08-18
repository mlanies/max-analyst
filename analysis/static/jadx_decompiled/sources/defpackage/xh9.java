package defpackage;

/* loaded from: classes.dex */
public final class xh9 {
    public float[] a;
    public int b;

    public final float a(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        StringBuilder sbN = rh4.n(i, "Index ", " must be in 0..");
        sbN.append(this.b - 1);
        throw new IndexOutOfBoundsException(sbN.toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xh9) {
            xh9 xh9Var = (xh9) obj;
            int i = xh9Var.b;
            int i2 = this.b;
            if (i == i2) {
                float[] fArr = this.a;
                float[] fArr2 = xh9Var.a;
                j37 j37VarY = ote.Y(0, i2);
                int i3 = j37VarY.a;
                int i4 = j37VarY.b;
                if (i3 > i4) {
                    return true;
                }
                while (fArr[i3] == fArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        float[] fArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iHashCode += Float.hashCode(fArr[i2]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        float[] fArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            float f = fArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(f);
            i2++;
        }
        return sb.toString();
    }
}
