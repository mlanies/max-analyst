package net.jpountz.lz4;

import defpackage.zr6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
enum LZ4ByteBufferUtils {
    ;

    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static class Match {
        int len;
        int ref;
        int start;

        public int end() {
            return this.start + this.len;
        }

        public void fix(int i) {
            this.start += i;
            this.ref += i;
            this.len -= i;
        }
    }

    public static int commonBytes(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int iNumberOfTrailingZeros;
        int i4 = 0;
        while (i2 <= i3 - 8) {
            if (byteBuffer.getLong(i2) != byteBuffer.getLong(i)) {
                if (byteBuffer.order() == ByteOrder.BIG_ENDIAN) {
                    iNumberOfTrailingZeros = Long.numberOfLeadingZeros(byteBuffer.getLong(i) ^ byteBuffer.getLong(i2));
                } else {
                    iNumberOfTrailingZeros = Long.numberOfTrailingZeros(byteBuffer.getLong(i) ^ byteBuffer.getLong(i2));
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
            if (byteBuffer.get(i) != byteBuffer.get(i2)) {
                break;
            }
            i4++;
            i = i5;
            i2 = i6;
        }
        return i4;
    }

    public static int commonBytesBackward(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = 0;
        while (i > i3 && i2 > i4) {
            i--;
            i2--;
            if (byteBuffer.get(i) != byteBuffer.get(i2)) {
                break;
            }
            i5++;
        }
        return i5;
    }

    public static void copyTo(Match match, Match match2) {
        match2.len = match.len;
        match2.start = match.start;
        match2.ref = match.ref;
    }

    public static int encodeSequence(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, ByteBuffer byteBuffer2, int i5, int i6) {
        int i7;
        int i8;
        int i9 = i2 - i;
        int iWriteLen = i5 + 1;
        if (iWriteLen + i9 + 8 + (i9 >>> 8) > i6) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i9 >= 15) {
            iWriteLen = writeLen(i9 - 15, byteBuffer2, iWriteLen);
            i7 = -16;
        } else {
            i7 = i9 << 4;
        }
        wildArraycopy(byteBuffer, i, byteBuffer2, iWriteLen, i9);
        int i10 = iWriteLen + i9;
        int i11 = i2 - i3;
        byteBuffer2.put(i10, (byte) i11);
        int iWriteLen2 = i10 + 2;
        byteBuffer2.put(i10 + 1, (byte) (i11 >>> 8));
        int i12 = i4 - 4;
        if (i10 + 8 + (i12 >>> 8) > i6) {
            throw new LZ4Exception("maxDestLen is too small");
        }
        if (i12 >= 15) {
            i8 = i7 | 15;
            iWriteLen2 = writeLen(i4 - 19, byteBuffer2, iWriteLen2);
        } else {
            i8 = i12 | i7;
        }
        byteBuffer2.put(i5, (byte) i8);
        return iWriteLen2;
    }

    public static int hash(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash(byteBuffer.getInt(i));
    }

    public static int hash64k(ByteBuffer byteBuffer, int i) {
        return LZ4Utils.hash64k(byteBuffer.getInt(i));
    }

    public static int lastLiterals(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        int iWriteLen;
        if (((i2 + 240) / 255) + i3 + i2 + 1 > i4) {
            throw new LZ4Exception();
        }
        if (i2 >= 15) {
            byteBuffer2.put(i3, (byte) -16);
            iWriteLen = writeLen(i2 - 15, byteBuffer2, i3 + 1);
        } else {
            byteBuffer2.put(i3, (byte) (i2 << 4));
            iWriteLen = i3 + 1;
        }
        safeArraycopy(byteBuffer, i, byteBuffer2, iWriteLen, i2);
        return iWriteLen + i2;
    }

    public static boolean readIntEquals(ByteBuffer byteBuffer, int i, int i2) {
        return byteBuffer.getInt(i) == byteBuffer.getInt(i2);
    }

    public static void safeArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byteBuffer2.put(i2 + i4, byteBuffer.get(i + i4));
        }
    }

    public static void safeIncrementalCopy(ByteBuffer byteBuffer, int i, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            byteBuffer.put(i2 + i4, byteBuffer.get(i + i4));
        }
    }

    public static void wildArraycopy(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4 += 8) {
            try {
                byteBuffer2.putLong(i2 + i4, byteBuffer.getLong(i + i4));
            } catch (IndexOutOfBoundsException unused) {
                throw new LZ4Exception(zr6.h(i, "Malformed input at offset "));
            }
        }
    }

    public static void wildIncrementalCopy(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 4) {
            int i5 = 0;
            for (int i6 = 0; i6 < 4; i6++) {
                byteBuffer.put(i2 + i6, byteBuffer.get(i + i6));
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
            byteBuffer.putInt(i7, byteBuffer.getInt(i8));
            i2 += 8;
            i = i8 - i5;
        } else if (i4 < 8) {
            byteBuffer.putLong(i2, byteBuffer.getLong(i));
            i2 += i4;
        }
        while (i2 < i3) {
            byteBuffer.putLong(i2, byteBuffer.getLong(i));
            i2 += 8;
            i += 8;
        }
    }

    public static int writeLen(int i, ByteBuffer byteBuffer, int i2) {
        while (i >= 255) {
            byteBuffer.put(i2, (byte) -1);
            i -= 255;
            i2++;
        }
        int i3 = i2 + 1;
        byteBuffer.put(i2, (byte) i);
        return i3;
    }
}
