package net.jpountz.lz4;

/* loaded from: classes.dex */
final class LZ4JavaUnsafeSafeDecompressor extends LZ4SafeDecompressor {
    public static final LZ4SafeDecompressor INSTANCE = new LZ4JavaUnsafeSafeDecompressor();

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c0, code lost:
    
        if (r12 > r5) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        if ((r1 + r10) != r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c6, code lost:
    
        net.jpountz.lz4.LZ4UnsafeUtils.safeArraycopy(r18, r1, r21, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ca, code lost:
    
        return r12 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d4, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception(defpackage.zr6.h(r1, "Malformed input at "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00da, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception();
     */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor, net.jpountz.lz4.LZ4UnknownSizeDecompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decompress(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e2, code lost:
    
        if (r11 > r5) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        if ((r0 + r8) != r3) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e8, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.safeArraycopy(r2, r0, r4, r6, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ec, code lost:
    
        return r11 - r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f6, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception(defpackage.zr6.h(r0, "Malformed input at "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception();
     */
    @Override // net.jpountz.lz4.LZ4SafeDecompressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int decompress(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeSafeDecompressor.decompress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
