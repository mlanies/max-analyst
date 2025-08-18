package net.jpountz.lz4;

import defpackage.paf;
import defpackage.z5f;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
enum LZ4UnsafeUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static int commonBytes(byte[] bArr, int i, int i2, int i3) {
        int iNumberOfTrailingZeros;
        int i4 = 0;
        while (i2 <= i3 - 8) {
            if (z5f.d(i2, bArr) != z5f.d(i, bArr)) {
                if (paf.a == ByteOrder.BIG_ENDIAN) {
                    iNumberOfTrailingZeros = Long.numberOfLeadingZeros(z5f.d(i, bArr) ^ z5f.d(i2, bArr));
                } else {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(z5f.d(i, bArr) ^ z5f.d(i2, bArr));
                }
                return i4 + (iNumberOfTrailingZeros >>> 3);
            }
            i4 += 8;
            i += 8;
            i2 += 8;
        }
        while (i2 < i3) {
            int i5 = i + 1;
            int i6 = i2 + 1;
            if (z5f.a(i, bArr) != z5f.a(i2, bArr)) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public static int commonBytesBackward(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (z5f.a(i, bArr) != z5f.a(i2, bArr)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static int encodeSequence(byte[] bArr, int i, int i2, int i3, int i4, byte[] bArr2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int iWriteLen = i5 + 1;
        if (i9 >= 15) {
            iWriteLen = writeLen(i9 - 15, bArr2, iWriteLen);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        wildArraycopy(bArr, i, bArr2, iWriteLen, i9);
        int i10 = iWriteLen + i9;
        int i11 = i2 - i3;
        bArr2[i10] = (byte) i11;
        int iWriteLen2 = i10 + 2;
        bArr2[i10 + 1] = (byte) (i11 >>> 8);
        int i12 = i4 - 4;
        if (i10 + 8 + (i12 >>> 8) > i6) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i12 >= 15) {
            i8 = i7 | 15;
            iWriteLen2 = writeLen(i4 - 19, bArr2, iWriteLen2);
        } else {
            i8 = i12 | i7;
        }
        bArr2[i5] = (byte) i8;
        return iWriteLen2;
    }

    public static int lastLiterals(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        return LZ4SafeUtils.lastLiterals(bArr, i, i2, bArr2, i3, i4);
    }

    public static boolean readIntEquals(byte[] bArr, int i, int i2) {
        return z5f.b(i, bArr) == z5f.b(i2, bArr);
    }

    public static int readShortLittleEndian(byte[] bArr, int i) {
        short sF = z5f.f(i, bArr);
        if (paf.a == ByteOrder.BIG_ENDIAN) {
            sF = Short.reverseBytes(sF);
        }
        return sF & 65535;
    }

    public static void safeArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4 = i3 & (-8);
        wildArraycopy(bArr, i, bArr2, i2, i4);
        int i5 = i3 & 7;
        for (int i6 = 0; i6 < i5; i6++) {
            z5f.g(bArr2, i2 + i4 + i6, z5f.a(i + i4 + i6, bArr));
        }
    }

    public static void safeIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = i2 + i4;
            int i6 = i + i4;
            bArr[i5] = bArr[i6];
            z5f.g(bArr, i5, z5f.a(i6, bArr));
        }
    }

    public static void wildArraycopy(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            z5f.j(i2 + i4, bArr2, z5f.d(i + i4, bArr));
        }
    }

    public static void wildIncrementalCopy(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                z5f.g(bArr, i2 + i6, z5f.a(i + i6, bArr));
            }
            int i7 = i2 + 4;
            int i8 = i + 4;
            int i9 = i7 - i8;
            if (i9 == 1) {
                i8 = i + 1;
            } else if (i9 == 2) {
                i8 = i + 2;
            } else if (i9 == 3) {
                i8 = i + 1;
                i5 = -1;
            } else if (i9 == 5) {
                i5 = 1;
            } else if (i9 == 6) {
                i5 = 2;
            } else if (i9 == 7) {
                i5 = 3;
            }
            z5f.i(i7, bArr, z5f.b(i8, bArr));
            i2 += 8;
            i = i8 - i5;
        } else if (i4 < 8) {
            z5f.j(i2, bArr, z5f.d(i, bArr));
            i2 += i4;
        }
        while (i2 < i3) {
            z5f.j(i2, bArr, z5f.d(i, bArr));
            i2 += 8;
            i += 8;
        }
    }

    public static int writeLen(int i, byte[] bArr, int i2) {
        while (i >= 255) {
            z5f.g(bArr, i2, (byte) 255);
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        z5f.g(bArr, i2, (byte) i);
        return i3;
    }

    public static void writeShortLittleEndian(byte[] bArr, int i, int i2) {
        short sReverseBytes = (short) i2;
        if (paf.a == ByteOrder.BIG_ENDIAN) {
            sReverseBytes = Short.reverseBytes(sReverseBytes);
        }
        z5f.k(bArr, i, sReverseBytes);
    }
}
