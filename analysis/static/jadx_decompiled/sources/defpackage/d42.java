package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d42 extends vh0 {
    public int[] i;
    public int[] j;

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        int[] iArr = this.j;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferK = k(((iLimit - iPosition) / this.b.d) * this.c.d);
        while (iPosition < iLimit) {
            for (int i : iArr) {
                byteBufferK.putShort(byteBuffer.getShort((i * 2) + iPosition));
            }
            iPosition += this.b.d;
        }
        byteBuffer.position(iLimit);
        byteBufferK.flip();
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        int[] iArr = this.i;
        if (iArr == null) {
            return j60.e;
        }
        if (j60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
        }
        int length = iArr.length;
        int i = j60Var.b;
        boolean z = i != length;
        int i2 = 0;
        while (i2 < iArr.length) {
            int i3 = iArr[i2];
            if (i3 >= i) {
                throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
            }
            z |= i3 != i2;
            i2++;
        }
        return z ? new j60(j60Var.a, iArr.length, 2) : j60.e;
    }

    @Override // defpackage.vh0
    public final void h() {
        this.j = this.i;
    }

    @Override // defpackage.vh0
    public final void j() {
        this.j = null;
        this.i = null;
    }
}
