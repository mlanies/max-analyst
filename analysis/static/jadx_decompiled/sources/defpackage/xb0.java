package defpackage;

import android.util.Size;

/* loaded from: classes.dex */
public final class xb0 {
    public final int a;
    public final dee b;
    public final long c;

    public xb0(int i, dee deeVar, long j) {
        if (i == 0) {
            throw new NullPointerException("Null configType");
        }
        this.a = i;
        this.b = deeVar;
        this.c = j;
    }

    public static int a(int i) {
        if (i == 35) {
            return 2;
        }
        if (i == 256) {
            return 3;
        }
        if (i == 4101) {
            return 4;
        }
        return i == 32 ? 5 : 1;
    }

    public static xb0 b(int i, int i2, Size size, dc0 dc0Var) {
        int iA = a(i2);
        dee deeVar = dee.NOT_SUPPORT;
        int iA2 = msd.a(size);
        if (i == 1) {
            if (iA2 <= msd.a((Size) dc0Var.b.get(Integer.valueOf(i2)))) {
                deeVar = dee.s720p;
            } else {
                if (iA2 <= msd.a((Size) dc0Var.d.get(Integer.valueOf(i2)))) {
                    deeVar = dee.s1440p;
                }
            }
        } else if (iA2 <= msd.a(dc0Var.a)) {
            deeVar = dee.VGA;
        } else if (iA2 <= msd.a(dc0Var.c)) {
            deeVar = dee.PREVIEW;
        } else if (iA2 <= msd.a(dc0Var.e)) {
            deeVar = dee.RECORD;
        } else {
            if (iA2 <= msd.a((Size) dc0Var.f.get(Integer.valueOf(i2)))) {
                deeVar = dee.MAXIMUM;
            } else {
                Size size2 = (Size) dc0Var.g.get(Integer.valueOf(i2));
                if (size2 != null) {
                    if (iA2 <= size2.getHeight() * size2.getWidth()) {
                        deeVar = dee.ULTRA_MAXIMUM;
                    }
                }
            }
        }
        return new xb0(iA, deeVar, 0L);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb0)) {
            return false;
        }
        xb0 xb0Var = (xb0) obj;
        return au1.c(this.a, xb0Var.a) && this.b.equals(xb0Var.b) && this.c == xb0Var.c;
    }

    public final int hashCode() {
        int iS = (((au1.s(this.a) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        long j = this.c;
        return ((int) (j ^ (j >>> 32))) ^ iS;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceConfig{configType=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "RAW" : "JPEG_R" : "JPEG" : "YUV" : "PRIV");
        sb.append(", configSize=");
        sb.append(this.b);
        sb.append(", streamUseCase=");
        return zr6.k(sb, this.c, "}");
    }
}
