package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class xag extends awc {
    public final int b;
    public final int c;
    public final int d;
    public final ByteBuffer e;

    public xag(byte[] bArr) {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        byteBufferWrap.get();
        this.b = byteBufferWrap.getShort() & 65535;
        byteBufferWrap.getInt();
        byte b = byteBufferWrap.get();
        int[] iArrV = au1.v(2);
        int length = iArrV.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = iArrV[i2];
            byte b2 = 1;
            if (i3 == 1) {
                b2 = 0;
            } else if (i3 != 2) {
                throw null;
            }
            if (b2 == b) {
                i = i3;
                break;
            }
            i2++;
        }
        this.c = i;
        this.d = byteBufferWrap.getShort() & 65535;
        this.a = byteBufferWrap.get();
        this.e = byteBufferWrap.slice();
    }
}
