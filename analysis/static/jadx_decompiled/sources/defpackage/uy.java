package defpackage;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class uy implements ry, sy {
    public int X;
    public Object Y;
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public int o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uy(int i, byte b) {
        this(16);
        this.a = i;
        switch (i) {
            case 4:
                break;
            default:
                this.b = 0;
                this.c = -1;
                this.o = 0;
                this.Y = new int[16];
                this.X = r1.length - 1;
                break;
        }
    }

    @Override // defpackage.ry, defpackage.sy
    public int a() {
        switch (this.a) {
        }
        return -1;
    }

    @Override // defpackage.ry, defpackage.sy
    public int b() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.ry, defpackage.sy
    public int c() {
        switch (this.a) {
            case 0:
                yaf yafVar = (yaf) this.Y;
                int i = this.c;
                if (i != 8) {
                    if (i != 16) {
                        int i2 = this.o;
                        this.o = i2 + 1;
                        if (i2 % 2 != 0) {
                            break;
                        } else {
                            int iV = yafVar.v();
                            this.X = iV;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            default:
                wpa wpaVar = (wpa) this.Y;
                int i3 = this.c;
                if (i3 != 8) {
                    if (i3 != 16) {
                        int i4 = this.o;
                        this.o = i4 + 1;
                        if (i4 % 2 != 0) {
                            break;
                        } else {
                            int iU = wpaVar.u();
                            this.X = iU;
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
        }
        return this.X & 15;
    }

    public void d(int i) {
        int i2 = this.o;
        int[] iArr = (int[]) this.Y;
        if (i2 == iArr.length) {
            int length = iArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i3 = this.b;
            int i4 = length2 - i3;
            System.arraycopy(iArr, i3, iArr2, 0, i4);
            System.arraycopy((int[]) this.Y, 0, iArr2, i4, i3);
            this.b = 0;
            this.c = this.o - 1;
            this.Y = iArr2;
            this.X = length - 1;
        }
        int i5 = (this.c + 1) & this.X;
        this.c = i5;
        ((int[]) this.Y)[i5] = i;
        this.o++;
    }

    public void e(long j) {
        int i = this.o;
        long[] jArr = (long[]) this.Y;
        if (i == jArr.length) {
            int length = jArr.length << 1;
            if (length < 0) {
                throw new IllegalStateException();
            }
            long[] jArr2 = new long[length];
            int length2 = jArr.length;
            int i2 = this.b;
            int i3 = length2 - i2;
            System.arraycopy(jArr, i2, jArr2, 0, i3);
            System.arraycopy((long[]) this.Y, 0, jArr2, i3, i2);
            this.b = 0;
            this.c = this.o - 1;
            this.Y = jArr2;
            this.X = length - 1;
        }
        int i4 = (this.c + 1) & this.X;
        this.c = i4;
        ((long[]) this.Y)[i4] = j;
        this.o++;
    }

    public long f() {
        if (this.o != 0) {
            return ((long[]) this.Y)[this.b];
        }
        throw new NoSuchElementException();
    }

    public int g() {
        int i = this.o;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = (int[]) this.Y;
        int i2 = this.b;
        int i3 = iArr[i2];
        this.b = (i2 + 1) & this.X;
        this.o = i - 1;
        return i3;
    }

    public long h() {
        int i = this.o;
        if (i == 0) {
            throw new NoSuchElementException();
        }
        long[] jArr = (long[]) this.Y;
        int i2 = this.b;
        long j = jArr[i2];
        this.b = this.X & (i2 + 1);
        this.o = i - 1;
        return j;
    }

    public uy(int i) {
        this.a = 4;
        fm9.f(i >= 0 && i <= 1073741824);
        i = i == 0 ? 1 : i;
        i = Integer.bitCount(i) != 1 ? Integer.highestOneBit(i - 1) << 1 : i;
        this.b = 0;
        this.c = -1;
        this.o = 0;
        long[] jArr = new long[i];
        this.Y = jArr;
        this.X = jArr.length - 1;
    }

    public uy(int i, int i2, int i3, int i4, String str) {
        this.a = 2;
        this.Y = str;
        this.b = i;
        this.c = i2;
        this.o = i3;
        this.X = i4;
    }

    public uy(my myVar) {
        this.a = 0;
        yaf yafVar = myVar.c;
        this.Y = yafVar;
        yafVar.H(12);
        this.c = yafVar.y() & 255;
        this.b = yafVar.y();
    }

    public uy(ny nyVar) {
        this.a = 1;
        wpa wpaVar = nyVar.c;
        this.Y = wpaVar;
        wpaVar.G(12);
        this.c = wpaVar.y() & 255;
        this.b = wpaVar.y();
    }
}
