package net.jpountz.lz4;

import defpackage.tv0;
import defpackage.vqc;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;

/* loaded from: classes.dex */
final class LZ4JNIFastDecompressor extends LZ4FastDecompressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4JNIFastDecompressor INSTANCE = new LZ4JNIFastDecompressor();
    private static LZ4FastDecompressor SAFE_INSTANCE;

    @Override // net.jpountz.lz4.LZ4FastDecompressor, net.jpountz.lz4.LZ4Decompressor
    public final int decompress(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        vqc.a(i, bArr);
        vqc.b(i2, bArr2, i3);
        int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, null, i, bArr2, null, i2, i3);
        if (iLZ4_decompress_fast >= 0) {
            return iLZ4_decompress_fast;
        }
        throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_fast) + " of input buffer");
    }

    @Override // net.jpountz.lz4.LZ4FastDecompressor
    public int decompress(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3) {
        ByteBuffer byteBuffer3;
        byte[] bArr;
        ByteBuffer byteBuffer4;
        int iArrayOffset;
        byte[] bArrArray;
        if (!byteBuffer2.isReadOnly()) {
            tv0.a(i, byteBuffer);
            tv0.b(byteBuffer2, i2, i3);
            if ((!byteBuffer.hasArray() && !byteBuffer.isDirect()) || (!byteBuffer2.hasArray() && !byteBuffer2.isDirect())) {
                LZ4FastDecompressor lZ4FastDecompressorFastDecompressor = SAFE_INSTANCE;
                if (lZ4FastDecompressorFastDecompressor == null) {
                    lZ4FastDecompressorFastDecompressor = LZ4Factory.safeInstance().fastDecompressor();
                    SAFE_INSTANCE = lZ4FastDecompressorFastDecompressor;
                }
                return lZ4FastDecompressorFastDecompressor.decompress(byteBuffer, i, byteBuffer2, i2, i3);
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
                iArrayOffset = i2 + byteBuffer2.arrayOffset();
                byteBuffer4 = null;
            } else {
                byteBuffer4 = byteBuffer2;
                iArrayOffset = i2;
                bArrArray = null;
            }
            int iLZ4_decompress_fast = LZ4JNI.LZ4_decompress_fast(bArr, byteBuffer3, i, bArrArray, byteBuffer4, iArrayOffset, i3);
            if (iLZ4_decompress_fast >= 0) {
                return iLZ4_decompress_fast;
            }
            throw new LZ4Exception("Error decoding offset " + (i - iLZ4_decompress_fast) + " of input buffer");
        }
        throw new ReadOnlyBufferException();
    }
}
