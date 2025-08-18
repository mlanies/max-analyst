package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class dn5 extends uh0 {
    public static final int i = Float.floatToIntBits(Float.NaN);

    @Override // defpackage.k60
    public final void b(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferJ;
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i2 = iLimit - iPosition;
        int i3 = this.b.c;
        int i4 = i;
        if (i3 == 536870912) {
            byteBufferJ = j((i2 / 3) * 4);
            while (iPosition < iLimit) {
                int iFloatToIntBits = Float.floatToIntBits((float) ((((byteBuffer.get(iPosition) & 255) << 8) | ((byteBuffer.get(iPosition + 1) & 255) << 16) | ((byteBuffer.get(iPosition + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits == i4) {
                    iFloatToIntBits = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits);
                iPosition += 3;
            }
        } else {
            if (i3 != 805306368) {
                throw new IllegalStateException();
            }
            byteBufferJ = j(i2);
            while (iPosition < iLimit) {
                int iFloatToIntBits2 = Float.floatToIntBits((float) (((byteBuffer.get(iPosition) & 255) | ((byteBuffer.get(iPosition + 1) & 255) << 8) | ((byteBuffer.get(iPosition + 2) & 255) << 16) | ((byteBuffer.get(iPosition + 3) & 255) << 24)) * 4.656612875245797E-10d));
                if (iFloatToIntBits2 == i4) {
                    iFloatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                byteBufferJ.putInt(iFloatToIntBits2);
                iPosition += 4;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferJ.flip();
    }

    @Override // defpackage.uh0
    public final i60 f(i60 i60Var) throws AudioProcessor$UnhandledAudioFormatException {
        int i2 = i60Var.c;
        if (i2 == 536870912 || i2 == 805306368 || i2 == 4) {
            return i2 != 4 ? new i60(i60Var.a, i60Var.b, 4) : i60.e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(i60Var);
    }
}
