package net.jpountz.lz4;

/* loaded from: classes.dex */
final class LZ4JavaSafeCompressor extends LZ4Compressor {
    public static final LZ4Compressor INSTANCE = new LZ4JavaSafeCompressor();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r18, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r23) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r21[r10] = (byte) 240;
        r12 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r21, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006f, code lost:
    
        r21[r10] = (byte) (r11 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r18, r9, r21, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
    
        r9 = (short) (r8 - r15);
        r21[r12] = (byte) r9;
        r21[r12 + 1] = (byte) (r9 >>> 8);
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r18, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0094, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r23) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009b, code lost:
    
        r21[r10] = (byte) (r21[r10] | 15);
        r9 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r11 - 15, r21, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a7, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a9, code lost:
    
        r21[r10] = (byte) (r11 | r21[r10]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b0, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b2, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b4, code lost:
    
        r9 = r8 - 2;
        r2[net.jpountz.lz4.LZ4Utils.hash64k(defpackage.vqc.c(r9, r18))] = (short) (r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(defpackage.vqc.c(r8, r18));
        r15 = r1 + (r2[r9] & 65535);
        r2[r9] = (short) (r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r18, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e4, code lost:
    
        r21[r10] = (byte) 0;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f1, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f7, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(byte[] r18, int r19, int r20, byte[] r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
    
        r14 = net.jpountz.lz4.LZ4SafeUtils.commonBytesBackward(r19, r12, r8, r1, r10);
        r8 = r8 - r14;
        r12 = r12 - r14;
        r14 = r8 - r10;
        r15 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        if (r14 < 15) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:
    
        r22[r11] = (byte) 240;
        r15 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r14 - 15, r22, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008d, code lost:
    
        r22[r11] = (byte) (r14 << 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0092, code lost:
    
        net.jpountz.lz4.LZ4SafeUtils.wildArraycopy(r19, r10, r22, r15, r14);
        r15 = r15 + r14;
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r22[r15] = (byte) r13;
        r22[r15 + 1] = (byte) (r13 >>> 8);
        r10 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4SafeUtils.commonBytes(r19, r12 + 4, r1, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b1, code lost:
    
        if (((r15 + 8) + (r12 >>> 8)) > r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b3, code lost:
    
        r1 = r1 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b6, code lost:
    
        if (r12 < 15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b8, code lost:
    
        r22[r11] = (byte) (r22[r11] | 15);
        r10 = net.jpountz.lz4.LZ4SafeUtils.writeLen(r12 - 15, r22, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        r11 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c6, code lost:
    
        r22[r11] = (byte) (r12 | r22[r11]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cd, code lost:
    
        if (r1 <= r7) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        r10 = r1 - 2;
        r9[net.jpountz.lz4.LZ4Utils.hash(defpackage.vqc.c(r10, r19))] = r10;
        r10 = net.jpountz.lz4.LZ4Utils.hash(defpackage.vqc.c(r1, r19));
        r12 = r9[r10];
        r9[r10] = r1;
        r10 = r1 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f8, code lost:
    
        if (r10 >= 65536) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fe, code lost:
    
        if (net.jpountz.lz4.LZ4SafeUtils.readIntEquals(r19, r12, r1) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        r15 = r11 + 1;
        r22[r11] = (byte) 0;
        r13 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0115, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x011b, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r19, int r20, int r21, byte[] r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r18, r15, r8, r1, r9);
        r8 = r8 - r11;
        r15 = r15 - r11;
        r11 = r8 - r9;
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005d, code lost:
    
        if ((((r12 + r11) + 8) + (r11 >>> 8)) > r23) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (r11 < 15) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0063, code lost:
    
        r21.put(r10, (byte) 240);
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r21, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        r21.put(r10, (byte) (r11 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0076, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r18, r9, r21, r12, r11);
        r12 = r12 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007a, code lost:
    
        defpackage.tv0.e(r21, r12, (short) (r8 - r15));
        r9 = r12 + 2;
        r8 = r8 + 4;
        r11 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r18, r15 + 4, r8, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        if (((r12 + 8) + (r11 >>> 8)) > r23) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0091, code lost:
    
        r8 = r8 + r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0094, code lost:
    
        if (r11 < 15) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
    
        r21.put(r10, (byte) (r21.get(r10) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r11 - 15, r21, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a5, code lost:
    
        r10 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a7, code lost:
    
        r21.put(r10, (byte) (r11 | r21.get(r10)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b1, code lost:
    
        if (r8 <= r7) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b3, code lost:
    
        r1 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b5, code lost:
    
        r9 = r8 - 2;
        r2[net.jpountz.lz4.LZ4Utils.hash64k(r18.getInt(r9))] = (short) (r9 - r1);
        r9 = net.jpountz.lz4.LZ4Utils.hash64k(r18.getInt(r8));
        r15 = r1 + (r2[r9] & 65535);
        r2[r9] = (short) (r8 - r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00da, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r18, r8, r15) != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e5, code lost:
    
        r21.put(r10, (byte) 0);
        r12 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00f3, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f9, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int compress64k(java.nio.ByteBuffer r18, int r19, int r20, java.nio.ByteBuffer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress64k(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        r14 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytesBackward(r5, r12, r6, r1, r9);
        r6 = r6 - r14;
        r12 = r12 - r14;
        r14 = r6 - r9;
        r15 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ae, code lost:
    
        if ((((r15 + r14) + 8) + (r14 >>> 8)) > r10) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b2, code lost:
    
        if (r14 < 15) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b4, code lost:
    
        r8.put(r11, (byte) 240);
        r15 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r14 - 15, r8, r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c1, code lost:
    
        r8.put(r11, (byte) (r14 << 4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        net.jpountz.lz4.LZ4ByteBufferUtils.wildArraycopy(r5, r9, r8, r15, r14);
        r15 = r15 + r14;
        r1 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cd, code lost:
    
        defpackage.tv0.e(r8, r15, r13);
        r9 = r15 + 2;
        r1 = r1 + 4;
        r12 = net.jpountz.lz4.LZ4ByteBufferUtils.commonBytes(r5, r12 + 4, r1, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
    
        if (((r15 + 8) + (r12 >>> 8)) > r10) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e1, code lost:
    
        r1 = r1 + r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e4, code lost:
    
        if (r12 < 15) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e6, code lost:
    
        r8.put(r11, (byte) (r8.get(r11) | 15));
        r9 = net.jpountz.lz4.LZ4ByteBufferUtils.writeLen(r12 - 15, r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00f5, code lost:
    
        r11 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f7, code lost:
    
        r8.put(r11, (byte) (r12 | r8.get(r11)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0101, code lost:
    
        if (r1 <= r3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0103, code lost:
    
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010e, code lost:
    
        r9 = r1 - 2;
        r7[net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r9))] = r9;
        r9 = net.jpountz.lz4.LZ4Utils.hash(r5.getInt(r1));
        r12 = r7[r9];
        r7[r9] = r1;
        r9 = r1 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x012a, code lost:
    
        if (r9 >= 65536) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0130, code lost:
    
        if (net.jpountz.lz4.LZ4ByteBufferUtils.readIntEquals(r5, r12, r1) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0133, code lost:
    
        r15 = r11 + 1;
        r8.put(r11, (byte) 0);
        r13 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x014e, code lost:
    
        throw new net.jpountz.lz4.LZ4Exception("maxDestLen is too small");
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r19, int r20, int r21, java.nio.ByteBuffer r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4JavaSafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
