package net.jpountz.lz4;

import defpackage.z5f;
import java.nio.ByteBuffer;
import java.util.Arrays;
import net.jpountz.lz4.LZ4Utils;

/* loaded from: classes.dex */
final class LZ4HCJavaUnsafeCompressor extends LZ4Compressor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final LZ4Compressor INSTANCE = new LZ4HCJavaUnsafeCompressor();
    final int compressionLevel;
    private final int maxAttempts;

    public LZ4HCJavaUnsafeCompressor() {
        this(9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x007d, code lost:
    
        r13 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0238, code lost:
    
        r16 = net.jpountz.lz4.LZ4UnsafeUtils.encodeSequence(r22, r16, r8.start, r8.ref, r8.len, r25, r17, r12);
        r2 = r8.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(byte[] r22, int r23, int r24, byte[] r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(byte[], int, int, byte[], int, int):int");
    }

    public class HashTable {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        static final int MASK = 65535;
        private final int base;
        private final short[] chainTable;
        private final int[] hashTable;
        int nextToUpdate;

        public HashTable(int i) {
            this.base = i;
            this.nextToUpdate = i;
            int[] iArr = new int[32768];
            this.hashTable = iArr;
            Arrays.fill(iArr, -1);
            this.chainTable = new short[65536];
        }

        private void addHash(ByteBuffer byteBuffer, int i) {
            addHash(byteBuffer.getInt(i), i);
        }

        private int hashPointer(byte[] bArr, int i) {
            return hashPointer(z5f.b(i, bArr));
        }

        private int next(int i) {
            return i - (this.chainTable[i & MASK] & MASK);
        }

        public void insert(int i, byte[] bArr) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 >= i) {
                    return;
                }
                addHash(bArr, i2);
                this.nextToUpdate++;
            }
        }

        public boolean insertAndFindBestMatch(byte[] bArr, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            if (iHashPointer < i - 4 || iHashPointer > i || iHashPointer < this.base) {
                i3 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i4 = 0; i4 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - MASK) && iHashPointer <= i; i4++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i) && (iCommonBytes2 = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[i & MASK] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & MASK] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(z5f.b(i, bArr))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            return match.len != 0;
        }

        public boolean insertAndFindWiderMatch(byte[] bArr, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, bArr);
            int iHashPointer = hashPointer(bArr, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - MASK) && iHashPointer <= i; i5++) {
                if (LZ4UnsafeUtils.readIntEquals(bArr, iHashPointer, i)) {
                    int iCommonBytes = LZ4UnsafeUtils.commonBytes(bArr, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4UnsafeUtils.commonBytesBackward(bArr, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i4;
        }

        private void addHash(byte[] bArr, int i) {
            addHash(z5f.b(i, bArr), i);
        }

        private int hashPointer(ByteBuffer byteBuffer, int i) {
            return hashPointer(byteBuffer.getInt(i));
        }

        public void insert(int i, ByteBuffer byteBuffer) {
            while (true) {
                int i2 = this.nextToUpdate;
                if (i2 >= i) {
                    return;
                }
                addHash(byteBuffer, i2);
                this.nextToUpdate++;
            }
        }

        private void addHash(int i, int i2) {
            int iHashHC = LZ4Utils.hashHC(i);
            int[] iArr = this.hashTable;
            int i3 = i2 - iArr[iHashHC];
            if (i3 >= 65536) {
                i3 = MASK;
            }
            this.chainTable[i2 & MASK] = (short) i3;
            iArr[iHashHC] = i2;
        }

        private int hashPointer(int i) {
            return this.hashTable[LZ4Utils.hashHC(i)];
        }

        public boolean insertAndFindWiderMatch(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, LZ4Utils.Match match) {
            match.len = i4;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            for (int i5 = 0; i5 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - MASK) && iHashPointer <= i; i5++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    int iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i3) + 4;
                    int iCommonBytesBackward = LZ4ByteBufferUtils.commonBytesBackward(byteBuffer, iHashPointer, i, this.base, i2);
                    int i6 = iCommonBytes + iCommonBytesBackward;
                    if (i6 > match.len) {
                        match.len = i6;
                        match.ref = iHashPointer - iCommonBytesBackward;
                        match.start = i - iCommonBytesBackward;
                    }
                }
                iHashPointer = next(iHashPointer);
            }
            return match.len > i4;
        }

        public boolean insertAndFindBestMatch(ByteBuffer byteBuffer, int i, int i2, LZ4Utils.Match match) {
            int i3;
            int iCommonBytes;
            int iCommonBytes2;
            match.start = i;
            match.len = 0;
            insert(i, byteBuffer);
            int iHashPointer = hashPointer(byteBuffer, i);
            if (iHashPointer < i - 4 || iHashPointer > i || iHashPointer < this.base) {
                i3 = 0;
                iCommonBytes = 0;
            } else {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i)) {
                    i3 = i - iHashPointer;
                    iCommonBytes = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4;
                    match.len = iCommonBytes;
                    match.ref = iHashPointer;
                } else {
                    i3 = 0;
                    iCommonBytes = 0;
                }
                iHashPointer = next(iHashPointer);
            }
            for (int i4 = 0; i4 < LZ4HCJavaUnsafeCompressor.this.maxAttempts && iHashPointer >= Math.max(this.base, i - MASK) && iHashPointer <= i; i4++) {
                if (LZ4ByteBufferUtils.readIntEquals(byteBuffer, iHashPointer, i) && (iCommonBytes2 = LZ4ByteBufferUtils.commonBytes(byteBuffer, iHashPointer + 4, i + 4, i2) + 4) > match.len) {
                    match.ref = iHashPointer;
                    match.len = iCommonBytes2;
                }
                iHashPointer = next(iHashPointer);
            }
            if (iCommonBytes != 0) {
                int i5 = (iCommonBytes + i) - 3;
                while (i < i5 - i3) {
                    this.chainTable[i & MASK] = (short) i3;
                    i++;
                }
                do {
                    this.chainTable[i & MASK] = (short) i3;
                    this.hashTable[LZ4Utils.hashHC(byteBuffer.getInt(i))] = i;
                    i++;
                } while (i < i5);
                this.nextToUpdate = i5;
            }
            return match.len != 0;
        }
    }

    public LZ4HCJavaUnsafeCompressor(int i) {
        this.maxAttempts = 1 << (i - 1);
        this.compressionLevel = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x025c, code lost:
    
        r0 = net.jpountz.lz4.LZ4ByteBufferUtils.encodeSequence(r10, r0, r1.start, r1.ref, r1.len, r11, r16, r13);
        r3 = r1.end();
     */
    @Override // net.jpountz.lz4.LZ4Compressor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int compress(java.nio.ByteBuffer r23, int r24, int r25, java.nio.ByteBuffer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: net.jpountz.lz4.LZ4HCJavaUnsafeCompressor.compress(java.nio.ByteBuffer, int, int, java.nio.ByteBuffer, int, int):int");
    }
}
