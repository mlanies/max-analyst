package net.jpountz.lz4;

/* loaded from: classes.dex */
final class LZ4JavaUnsafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaUnsafeCompressor();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        defpackage.z5f.g(r20, r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r20, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        defpackage.z5f.g(r20, r10, (byte) (r11 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r17, r9, r20, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        r9 = (short) (r8 - r15);
        defpackage.z5f.g(r20, r12, (byte) r9);
        defpackage.z5f.g(r20, r12 + 1, (byte) (r9 >>> 8));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0095, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009c, code lost:
    
        defpackage.z5f.g(r20, r10, (byte) (defpackage.z5f.a(r10, r20) | 15));
        r9 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r11 - 15, r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ab, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ad, code lost:
    
        defpackage.z5f.g(r20, r10, (byte) (r11 | defpackage.z5f.a(r10, r20)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b9, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bb, code lost:
    
        r9 = r8 - 2;
        defpackage.z5f.l(r2, net.jpountz.lz4.LZ4Utils.hash64k(defpackage.z5f.b(r9, r17)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(defpackage.z5f.b(r8, r17));
        r15 = defpackage.z5f.e(r2, r9) + r1;
        defpackage.z5f.l(r2, r9, r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e0, code lost:
    
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00eb, code lost:
    
        defpackage.z5f.g(r20, r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f9, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ff, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(byte[] r17, int r18, int r19, byte[] r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006b, code lost:
    
        r15 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytesBackward(r20, r7, r10, r1, r12);
        r10 = r10 - r15;
        r7 = r7 - r15;
        r15 = r10 - r12;
        r5 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0083, code lost:
    
        if ((((r5 + r15) + 8) + (r15 >>> 8)) > r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0087, code lost:
    
        if (r15 < 15) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0089, code lost:
    
        defpackage.z5f.g(r23, r13, (byte) 240);
        r16 = r10;
        r5 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r15 - 15, r23, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009a, code lost:
    
        r16 = r10;
        defpackage.z5f.g(r23, r13, (byte) (r15 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a2, code lost:
    
        net.jpountz.lz4.LZ4UnsafeUtils.wildArraycopy(r20, r12, r23, r5, r15);
        r5 = r5 + r15;
        r1 = r7;
        r10 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        defpackage.z5f.g(r23, r5, (byte) r14);
        defpackage.z5f.g(r23, r5 + 1, (byte) (r14 >>> 8));
        r12 = r5 + 2;
        r10 = r10 + 4;
        r1 = net.jpountz.lz4.LZ4UnsafeUtils.commonBytes(r20, r1 + 4, r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c6, code lost:
    
        if (((r5 + 8) + (r1 >>> 8)) > r8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c8, code lost:
    
        r10 = r10 + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00cb, code lost:
    
        if (r1 < 15) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cd, code lost:
    
        defpackage.z5f.g(r23, r13, (byte) (defpackage.z5f.a(r13, r23) | 15));
        r13 = net.jpountz.lz4.LZ4UnsafeUtils.writeLen(r1 - 15, r23, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00dd, code lost:
    
        defpackage.z5f.g(r23, r13, (byte) (r1 | defpackage.z5f.a(r13, r23)));
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e7, code lost:
    
        if (r10 <= r9) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        r1 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f8, code lost:
    
        r1 = r10 - 2;
        defpackage.z5f.h(net.jpountz.lz4.LZ4Utils.hash(defpackage.z5f.b(r1, r20)), r1, r11);
        r1 = net.jpountz.lz4.LZ4Utils.hash(defpackage.z5f.b(r10, r20));
        r12 = defpackage.z5f.c(r1, r11);
        defpackage.z5f.h(r1, r10, r11);
        r14 = r10 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0118, code lost:
    
        if (r14 >= 65536) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x011e, code lost:
    
        if (net.jpountz.lz4.LZ4UnsafeUtils.readIntEquals(r20, r12, r10) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0123, code lost:
    
        defpackage.z5f.g(r23, r13, (byte) 0);
        r1 = r12;
        r5 = r13 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x013f, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0145, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r20, int r21, int r22, byte[] r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r17, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005a, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r22) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0060, code lost:
    
        r20.put(r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r20, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        r20.put(r10, (byte) (r11 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r17, r9, r20, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
    
        defpackage.tv0.e(r20, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r17, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r22) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008e, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        r20.put(r10, (byte) (r20.get(r10) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r20, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a2, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a4, code lost:
    
        r20.put(r10, (byte) (r11 | r20.get(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b0, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        r9 = r8 - 2;
        defpackage.z5f.l(r2, net.jpountz.lz4.LZ4Utils.hash64k(r17.getInt(r9)), r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(r17.getInt(r8));
        r15 = defpackage.z5f.e(r2, r9) + r1;
        defpackage.z5f.l(r2, r9, r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r17, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        r20.put(r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f0, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f6, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(java.nio.ByteBuffer r17, int r18, int r19, java.nio.ByteBuffer r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b1, code lost:
    
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b5, code lost:
    
        if (r14 < 15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b7, code lost:
    
        r8.put(r11, (byte) 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c4, code lost:
    
        r8.put(r11, (byte) (r14 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d0, code lost:
    
        defpackage.tv0.e(r8, r15, r13);
        r9 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e2, code lost:
    
        if (((r15 + 8) + (r12 >>> 8)) > r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e4, code lost:
    
        r1 = r1 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e7, code lost:
    
        if (r12 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e9, code lost:
    
        r8.put(r11, (byte) (r8.get(r11) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12 - 15, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f8, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00fa, code lost:
    
        r8.put(r11, (byte) (r12 | r8.get(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0104, code lost:
    
        if (r1 <= r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0106, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0111, code lost:
    
        r9 = r1 - 2;
        defpackage.z5f.h(net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r9)), r9, r7);
        r9 = net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r1));
        r12 = defpackage.z5f.c(r9, r7);
        defpackage.z5f.h(r9, r1, r7);
        r9 = r1 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        if (r9 >= 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0137, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x013a, code lost:
    
        r15 = r11 + 1;
        r8.put(r11, (byte) 0);
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014f, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0155, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
