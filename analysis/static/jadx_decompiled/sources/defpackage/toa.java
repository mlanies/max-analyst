package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public final class toa extends uoa {
    public final ByteBuffer d;

    public toa(byte[] bArr, int i, int i2) {
        super(bArr, i2 >> 2, i);
        this.d = ByteBuffer.wrap(bArr, i, i2).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Override // defpackage.uoa
    public final short a(int i) {
        return (short) (((int) ((this.d.getFloat(i << 2) + 1.0d) * 32767.5d)) - 32768);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PCM float (");
        int i = this.a;
        sb.append(i);
        sb.append(") {");
        if (i > 0) {
            ByteBuffer byteBuffer = this.d;
            sb.append(byteBuffer.getFloat(0));
            for (int i2 = 1; i2 < i; i2++) {
                sb.append(", ");
                sb.append(byteBuffer.getFloat(i2 << 2));
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
