package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class c42 extends uh0 {
    public int[] i;
    public int[] j;

    @Override // defpackage.k60
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferJ = j(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferJ.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferJ.flip();
    }

    @Override // defpackage.uh0
    public final i60 f(i60 i60Var) throws AudioProcessor$UnhandledAudioFormatException {
        int[] iArr = this.i;
        if (iArr == null) {
            return i60.e;
        }
        if (i60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(i60Var);
        }
        int length = iArr.length;
        int i = i60Var.b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new AudioProcessor$UnhandledAudioFormatException(i60Var);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new i60(i60Var.a, iArr.length, 2) : i60.e;
    }

    @Override // defpackage.uh0
    public final void g() {
        this.j = this.i;
    }

    @Override // defpackage.uh0
    public final void i() {
        this.j = null;
        this.i = null;
    }
}
