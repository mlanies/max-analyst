package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class f24 extends awc {
    public final int b;
    public final long c;

    public f24(int i, long j, boolean z, boolean z2, boolean z3, boolean z4, ByteBuffer byteBuffer) {
        this.b = i;
        this.c = j;
        byte b = this.a;
        if (z) {
            this.a = (byte) (b | 1);
        } else {
            this.a = (byte) (b & (-2));
        }
        byte b2 = this.a;
        if (z2) {
            this.a = (byte) (b2 | 2);
        } else {
            this.a = (byte) (b2 & (-3));
        }
        byte b3 = this.a;
        if (z3) {
            this.a = (byte) (b3 | 4);
        } else {
            this.a = (byte) (b3 & (-5));
        }
        byte b4 = this.a;
        if (z4) {
            this.a = (byte) (b4 | 8);
        } else {
            this.a = (byte) (b4 & (-9));
        }
    }

    public final ByteBuffer a() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(11);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.putShort((short) this.b);
        byteBufferAllocate.putInt((int) this.c);
        byteBufferAllocate.put((byte) 1);
        byteBufferAllocate.putShort((short) 0);
        byteBufferAllocate.put(this.a);
        byteBufferAllocate.rewind();
        return byteBufferAllocate;
    }
}
