package net.jpountz.lz4;

import defpackage.paf;
import defpackage.tv0;
import defpackage.vqc;
import defpackage.z5f;
import defpackage.zr6;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import sun.misc.Unsafe;

/* loaded from: classes.dex */
final class LZ4JavaUnsafeFastDecompressor extends LZ4FastDecompressor {
    public static final LZ4FastDecompressor INSTANCE = new LZ4JavaUnsafeFastDecompressor();

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        int i4;
        byte bA;
        int i5;
        byte bA2;
        Unsafe unsafe = z5f.a;
        vqc.a(i, bArr);
        vqc.b(i2, bArr2, i3);
        if (i3 == 0) {
            if (z5f.a(i, bArr) == 0) {
                return 1;
            }
            throw new LZ4Exception(zr6.h(i, "Malformed input at "));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte bA3 = z5f.a(i7, bArr);
            int i9 = i7 + 1;
            int i10 = (bA3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    bA2 = z5f.a(i9, bArr);
                    if (bA2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += bA2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 != i6) {
                    throw new LZ4Exception(zr6.h(i9, "Malformed input at "));
                }
                LZ4UnsafeUtils.safeArraycopy(bArr, i9, bArr2, i8, i10);
                return (i9 + i10) - i;
            }
            LZ4UnsafeUtils.wildArraycopy(bArr, i9, bArr2, i8, i10);
            int i13 = i9 + i10;
            short sF = z5f.f(i13, bArr);
            if (paf.a == ByteOrder.BIG_ENDIAN) {
                sF = Short.reverseBytes(sF);
            }
            i7 = i13 + 2;
            int i14 = i11 - (sF & 65535);
            if (i14 < i2) {
                throw new LZ4Exception(zr6.h(i7, "Malformed input at "));
            }
            int i15 = bA3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    bA = z5f.a(i7, bArr);
                    if (bA != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += bA & 255;
                i7 = i4;
            }
            int i16 = i15 + 4;
            int i17 = i11 + i16;
            if (i17 <= i12) {
                LZ4UnsafeUtils.wildIncrementalCopy(bArr2, i14, i11, i17);
            } else {
                if (i17 > i6) {
                    throw new LZ4Exception(zr6.h(i7, "Malformed input at "));
                }
                LZ4UnsafeUtils.safeIncrementalCopy(bArr2, i14, i11, i16);
            }
            i8 = i17;
        }
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        int i4;
        byte b;
        int i5;
        byte b2;
        if (byteBuffer.hasArray() && byteBuffer2.hasArray()) {
            return decompress(byteBuffer.array(), byteBuffer.arrayOffset() + i, byteBuffer2.array(), byteBuffer2.arrayOffset() + i2, i3);
        }
        ByteBuffer byteBufferC = tv0.c(byteBuffer);
        ByteBuffer byteBufferC2 = tv0.c(byteBuffer2);
        tv0.a(i, byteBufferC);
        tv0.b(byteBufferC2, i2, i3);
        if (i3 == 0) {
            if (byteBufferC.get(i) == 0) {
                return 1;
            }
            throw new LZ4Exception(zr6.h(i, "Malformed input at "));
        }
        int i6 = i3 + i2;
        int i7 = i;
        int i8 = i2;
        while (true) {
            byte b3 = byteBufferC.get(i7);
            int i9 = i7 + 1;
            int i10 = (b3 & 255) >>> 4;
            if (i10 == 15) {
                while (true) {
                    i5 = i9 + 1;
                    b2 = byteBufferC.get(i9);
                    if (b2 != -1) {
                        break;
                    }
                    i10 += 255;
                    i9 = i5;
                }
                i10 += b2 & 255;
                i9 = i5;
            }
            int i11 = i8 + i10;
            int i12 = i6 - 8;
            if (i11 > i12) {
                if (i11 == i6) {
                    LZ4ByteBufferUtils.safeArraycopy(byteBufferC, i9, byteBufferC2, i8, i10);
                    return (i9 + i10) - i;
                }
                throw new LZ4Exception(zr6.h(i9, "Malformed input at "));
            }
            LZ4ByteBufferUtils.wildArraycopy(byteBufferC, i9, byteBufferC2, i8, i10);
            int i13 = i9 + i10;
            int iD = tv0.d(i13, byteBufferC);
            i7 = i13 + 2;
            int i14 = i11 - iD;
            if (i14 < i2) {
                throw new LZ4Exception(zr6.h(i7, "Malformed input at "));
            }
            int i15 = b3 & 15;
            if (i15 == 15) {
                while (true) {
                    i4 = i7 + 1;
                    b = byteBufferC.get(i7);
                    if (b != -1) {
                        break;
                    }
                    i15 += 255;
                    i7 = i4;
                }
                i15 += b & 255;
                i7 = i4;
            }
            int i16 = i15 + 4;
            int i17 = i11 + i16;
            if (i17 <= i12) {
                LZ4ByteBufferUtils.wildIncrementalCopy(byteBufferC2, i14, i11, i17);
            } else if (i17 <= i6) {
                LZ4ByteBufferUtils.safeIncrementalCopy(byteBufferC2, i14, i11, i16);
            } else {
                throw new LZ4Exception(zr6.h(i7, "Malformed input at "));
            }
            i8 = i17;
        }
    }
}
