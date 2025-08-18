package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class bwe extends vh0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    public static void l(int i2, ByteBuffer byteBuffer) {
        int iFloatToIntBits = Float.floatToIntBits((float) (i2 * 4.656612875245797E-10d));
        if (iFloatToIntBits == i) {
            iFloatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(iFloatToIntBits);
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferK;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        if (i3 == 21) {
            byteBufferK = k((i2 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else if (i3 == 22) {
            byteBufferK = k(i2);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        } else if (i3 == 1342177280) {
            byteBufferK = k((i2 / 3) * 4);
            while (iPosition < iLimit) {
                l(((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 3;
            }
        } else {
            if (i3 != 1610612736) {
                throw new IllegalStateException();
            }
            byteBufferK = k(i2);
            while (iPosition < iLimit) {
                l((byteBuffer.get(iPosition + 3) & 255) | ((byteBuffer.get(iPosition + 2) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition) & 255) << 24), byteBufferK);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferK.flip();
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i2 = j60Var.c;
        if (i2 == 21 || i2 == 1342177280 || i2 == 22 || i2 == 1610612736 || i2 == 4) {
            return i2 != 4 ? new j60(j60Var.a, j60Var.b, 4) : j60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
    }
}
