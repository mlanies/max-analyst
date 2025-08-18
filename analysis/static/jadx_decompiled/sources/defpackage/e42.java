package defpackage;

import android.util.SparseArray;
import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e42 extends vh0 {
    public final SparseArray i = new SparseArray();

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        f42 f42Var = (f42) this.i.get(this.b.b);
        fm9.l(f42Var);
        int iRemaining = byteBuffer.remaining() / this.b.d;
        ByteBuffer byteBufferK = k(this.c.d * iRemaining);
        j1e.B(byteBuffer, this.b, byteBufferK, this.c, f42Var, iRemaining, false, true);
        byteBufferK.flip();
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (j60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
        }
        f42 f42Var = (f42) this.i.get(j60Var.b);
        if (f42Var != null) {
            return f42Var.e ? j60.e : new j60(j60Var.a, f42Var.b, 2);
        }
        throw new AudioProcessor$UnhandledAudioFormatException("No mixing matrix for input channel count", j60Var);
    }
}
