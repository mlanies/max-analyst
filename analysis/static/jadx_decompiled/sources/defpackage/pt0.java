package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class pt0 {
    public final int a;
    public final int b;
    public final ByteBuffer c;
    public long d;

    public pt0(ByteBuffer byteBuffer, q90 q90Var, int i, int i2) {
        byteBuffer.rewind();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        if (iLimit != q90Var.a) {
            StringBuilder sbN = rh4.n(iLimit, "Byte buffer size is not match with packet info: ", " != ");
            sbN.append(q90Var.a);
            throw new IllegalStateException(sbN.toString());
        }
        this.a = i;
        this.b = i2;
        this.c = byteBuffer;
        this.d = q90Var.b;
    }

    public final q90 a(ByteBuffer byteBuffer) {
        int iRemaining;
        long j = this.d;
        ByteBuffer byteBuffer2 = this.c;
        int iPosition = byteBuffer2.position();
        int iPosition2 = byteBuffer.position();
        if (byteBuffer2.remaining() > byteBuffer.remaining()) {
            iRemaining = byteBuffer.remaining();
            this.d += ote.k(this.b, ote.V(this.a, iRemaining));
            ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
            byteBufferDuplicate.position(iPosition).limit(iPosition + iRemaining);
            byteBuffer.put(byteBufferDuplicate).limit(iPosition2 + iRemaining).position(iPosition2);
        } else {
            iRemaining = byteBuffer2.remaining();
            byteBuffer.put(byteBuffer2).limit(iPosition2 + iRemaining).position(iPosition2);
        }
        byteBuffer2.position(iPosition + iRemaining);
        return new q90(iRemaining, j);
    }
}
