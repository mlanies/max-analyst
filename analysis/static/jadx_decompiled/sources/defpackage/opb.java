package defpackage;

/* loaded from: classes.dex */
public final class opb {
    public boolean a;
    public boolean b;
    public boolean c;
    public long d;
    public long e;
    public long f;
    public final Object g;
    public final Object h;

    public opb(int i) {
        switch (i) {
            case 1:
                this.g = new tue(0L);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new wpa();
                break;
            default:
                this.g = new sue(0L);
                this.d = -9223372036854775807L;
                this.e = -9223372036854775807L;
                this.f = -9223372036854775807L;
                this.h = new yaf(3, false);
                break;
        }
    }

    public static int c(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long e(wpa wpaVar) {
        int i = wpaVar.b;
        if (wpaVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        wpaVar.e(0, bArr, 9);
        wpaVar.G(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long f(yaf yafVar) {
        int i = yafVar.b;
        if (yafVar.c() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        yafVar.g(0, bArr, 9);
        yafVar.H(i);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = b;
                    long j2 = b2;
                    return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((bArr[1] & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((bArr[3] & 255) << 5) | ((b3 & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    public void a(ra4 ra4Var) {
        byte[] bArr = maf.f;
        yaf yafVar = (yaf) this.h;
        yafVar.getClass();
        yafVar.F(bArr.length, bArr);
        this.a = true;
        ra4Var.Y = 0;
    }

    public void b(sa4 sa4Var) {
        byte[] bArr = oaf.f;
        wpa wpaVar = (wpa) this.h;
        wpaVar.getClass();
        wpaVar.E(bArr.length, bArr);
        this.a = true;
        sa4Var.Y = 0;
    }
}
