package defpackage;

import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class yaf {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public static final long[] e = {128, 64, 32, 16, 8, 4, 2, 1};
    public byte[] a;
    public int b;
    public int c;

    public yaf(int i, boolean z) {
        switch (i) {
            case 1:
                this.a = new byte[8];
                break;
            case 2:
            default:
                this.a = new byte[8];
                break;
            case 3:
                this.a = maf.f;
                break;
        }
    }

    public static long a(int i, byte[] bArr, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static long b(int i, byte[] bArr, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~e[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public static int e(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((d[i2] & i) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public static int f(int i) {
        for (int i2 = 0; i2 < 8; i2++) {
            if ((e[i2] & i) != 0) {
                return i2 + 1;
            }
        }
        return -1;
    }

    public int A() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public long B(ra4 ra4Var, boolean z, boolean z2, int i) {
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 == 0) {
            if (!ra4Var.h(bArr, 0, 1, z)) {
                return -1L;
            }
            int iE = e(bArr[0] & 255);
            this.c = iE;
            if (iE == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i3 = this.c;
        if (i3 > i) {
            this.b = 0;
            return -2L;
        }
        if (i3 != 1) {
            ra4Var.h(bArr, 1, i3 - 1, false);
        }
        this.b = 0;
        return a(this.c, bArr, z2);
    }

    public long C(sa4 sa4Var, boolean z, boolean z2, int i) {
        int i2 = this.b;
        byte[] bArr = this.a;
        if (i2 == 0) {
            if (!sa4Var.h(bArr, 0, 1, z)) {
                return -1L;
            }
            int iF = f(bArr[0] & 255);
            this.c = iF;
            if (iF == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.b = 1;
        }
        int i3 = this.c;
        if (i3 > i) {
            this.b = 0;
            return -2L;
        }
        if (i3 != 1) {
            sa4Var.h(bArr, 1, i3 - 1, false);
        }
        this.b = 0;
        return b(this.c, bArr, z2);
    }

    public long D() {
        int i;
        int i2;
        long j = this.a[this.b];
        int i3 = 7;
        while (true) {
            if (i3 < 0) {
                break;
            }
            if (((1 << i3) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= r6 - 1;
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new NumberFormatException(sb.toString());
        }
        for (i = 1; i < i2; i++) {
            if ((this.a[this.b + i] & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (r3 & 63);
        }
        this.b += i2;
        return j;
    }

    public void E(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        F(i, bArr);
    }

    public void F(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public void G(int i) {
        np8.d(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public void H(int i) {
        np8.d(i >= 0 && i <= this.c);
        this.b = i;
    }

    public void I(int i) {
        H(this.b + i);
    }

    public int c() {
        return this.c - this.b;
    }

    public void d(int i) {
        byte[] bArr = this.a;
        if (i > bArr.length) {
            this.a = Arrays.copyOf(bArr, i);
        }
    }

    public void g(int i, byte[] bArr, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public int h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 24;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 16) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.b = i + 4;
        return (bArr[i6] & 255) | i7;
    }

    public String i() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c) {
            byte b = this.a[i];
            int i2 = maf.a;
            if (b == 10 || b == 13) {
                break;
            }
            i++;
        }
        int i3 = this.b;
        if (i - i3 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.b = i3 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i4 = this.b;
        int i5 = maf.a;
        String str = new String(bArr2, i4, i - i4, b52.c);
        this.b = i;
        int i6 = this.c;
        if (i == i6) {
            return str;
        }
        byte[] bArr3 = this.a;
        if (bArr3[i] == 13) {
            int i7 = i + 1;
            this.b = i7;
            if (i7 == i6) {
                return str;
            }
        }
        int i8 = this.b;
        if (bArr3[i8] == 10) {
            this.b = i8 + 1;
        }
        return str;
    }

    public int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        int i6 = i + 3;
        this.b = i6;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public long k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        long j2 = j | ((bArr[r8] & 255) << 24);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 32);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r8] & 255) << 40);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 48);
        this.b = i + 8;
        return ((bArr[r8] & 255) << 56) | j5;
    }

    public short l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public long m() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = (bArr[i] & 255) | ((bArr[r2] & 255) << 8) | ((bArr[r7] & 255) << 16);
        this.b = i + 4;
        return ((bArr[r4] & 255) << 24) | j;
    }

    public int n() {
        int iJ = j();
        if (iJ >= 0) {
            return iJ;
        }
        throw new IllegalStateException(z7b.h(29, iJ, "Top bit not zero: "));
    }

    public int o() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public long p() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 56) | ((bArr[r2] & 255) << 48) | ((bArr[r7] & 255) << 40);
        this.b = i + 4;
        long j2 = j | ((bArr[r4] & 255) << 32);
        this.b = i + 5;
        long j3 = j2 | ((bArr[r7] & 255) << 24);
        this.b = i + 6;
        long j4 = j3 | ((bArr[r4] & 255) << 16);
        this.b = i + 7;
        long j5 = j4 | ((bArr[r7] & 255) << 8);
        this.b = i + 8;
        return (bArr[r4] & 255) | j5;
    }

    public String q() {
        if (c() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        int i3 = maf.a;
        String str = new String(bArr, i2, i - i2, b52.c);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return str;
    }

    public String r(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        int i4 = (i3 >= this.c || this.a[i3] != 0) ? i : i - 1;
        byte[] bArr = this.a;
        int i5 = maf.a;
        String str = new String(bArr, i2, i4, b52.c);
        this.b += i;
        return str;
    }

    public short s() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public String t(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public int u() {
        return v() | (v() << 21) | (v() << 14) | (v() << 7);
    }

    public int v() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public long w() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        this.b = i + 2;
        this.b = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[r2] & 255) << 16) | ((bArr[r7] & 255) << 8);
        this.b = i + 4;
        return (bArr[r4] & 255) | j;
    }

    public int x() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        int i3 = (bArr[i] & 255) << 16;
        int i4 = i + 2;
        this.b = i4;
        int i5 = ((bArr[i2] & 255) << 8) | i3;
        this.b = i + 3;
        return (bArr[i4] & 255) | i5;
    }

    public int y() {
        int iH = h();
        if (iH >= 0) {
            return iH;
        }
        throw new IllegalStateException(z7b.h(29, iH, "Top bit not zero: "));
    }

    public long z() {
        long jP = p();
        if (jP >= 0) {
            return jP;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jP);
        throw new IllegalStateException(sb.toString());
    }

    public yaf(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public yaf(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public yaf(int i, byte[] bArr) {
        this.a = bArr;
        this.c = i;
    }
}
