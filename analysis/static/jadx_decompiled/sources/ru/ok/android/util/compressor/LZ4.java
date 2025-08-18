package ru.ok.android.util.compressor;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public abstract class LZ4 {
    public static int a(byte[] bArr, byte[] bArr2) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(bArr.length);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(bArr2.length);
        try {
            byteBufferAllocateDirect.rewind();
            byteBufferAllocateDirect.put(bArr, 0, bArr.length);
            byteBufferAllocateDirect.rewind();
            int iNativeDecompress = nativeDecompress(byteBufferAllocateDirect, 0, byteBufferAllocateDirect.capacity(), byteBufferAllocateDirect2, 0, byteBufferAllocateDirect2.capacity());
            if (iNativeDecompress > 0 && iNativeDecompress <= bArr2.length && iNativeDecompress <= byteBufferAllocateDirect2.limit()) {
                byteBufferAllocateDirect2.rewind();
                byteBufferAllocateDirect2.get(bArr2, 0, iNativeDecompress);
            }
            return iNativeDecompress;
        } catch (Throwable unused) {
            return -1;
        }
    }

    private static native int nativeDecompress(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);
}
