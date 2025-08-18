package net.jpountz.lz4;

import defpackage.tv0;
import defpackage.vqc;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4JNISafeDecompressor extends LZ4SafeDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNISafeDecompressor INSTANCE = new LZ4JNISafeDecompressor();
    private static LZ4SafeDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    public final int decompress(byte[] bArr, int i, int i2, byte[] bArr2, int i3, int i4) {
        vqc.b(i, bArr, i2);
        vqc.b(i3, bArr2, i4);
        int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, null, i, i2, bArr2, null, i3, i4);
        if (iLZ4_decompress_safe >= 0) {
            return iLZ4_decompress_safe;
        }
        throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_safe) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        ByteBuffer byteBuffer4;
        int iArrayOffset;
        byte[] bArrArray;
        if (!byteBuffer2.isReadOnly()) {
            tv0.b(byteBuffer, i, i2);
            tv0.b(byteBuffer2, i3, i4);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4SafeDecompressor lZ4SafeDecompressorSafeDecompressor = SAFE_INSTANCE;
                if (lZ4SafeDecompressorSafeDecompressor == null) {
                    lZ4SafeDecompressorSafeDecompressor = LZ4Factory.safeInstance().safeDecompressor();
                    SAFE_INSTANCE = lZ4SafeDecompressorSafeDecompressor;
                }
                return lZ4SafeDecompressorSafeDecompressor.decompress(byteBuffer, i, i2, byteBuffer2, i3, i4);
            }
            if (byteBuffer.hasArray()) {
                byte[] bArrArray2 = byteBuffer.array();
                i += byteBuffer.arrayOffset();
                bArr = bArrArray2;
                byteBuffer3 = null;
            } else {
                byteBuffer3 = byteBuffer;
                bArr = null;
            }
            if (byteBuffer2.hasArray()) {
                bArrArray = byteBuffer2.array();
                iArrayOffset = i3 + byteBuffer2.arrayOffset();
                byteBuffer4 = null;
            } else {
                byteBuffer4 = byteBuffer2;
                iArrayOffset = i3;
                bArrArray = null;
            }
            int iLZ4_decompress_safe = LZ4JNI.LZ4_decompress_safe(bArr, byteBuffer3, i, i2, bArrArray, byteBuffer4, iArrayOffset, i4);
            if (iLZ4_decompress_safe >= 0) {
                return iLZ4_decompress_safe;
            }
            throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_safe) + " of input buffer");
        }
        throw new ReadOnlyBufferException();
    }
}
