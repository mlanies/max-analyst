package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class z2f extends vh0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.vh0, defpackage.m60
    public final ByteBuffer a() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            k(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = Math.min(i, this.l);
        this.o += iMin / this.b.d;
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i2 = i - iMin;
        int length = (this.n + i2) - this.m.length;
        ByteBuffer byteBufferK = k(length);
        int iJ = oaf.j(length, 0, this.n);
        byteBufferK.put(this.m, 0, iJ);
        int iJ2 = oaf.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferK.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferK.flip();
    }

    @Override // defpackage.vh0, defpackage.m60
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // defpackage.m60
    public final long f(long j) {
        return j - oaf.Y(this.b.a, this.j + this.i);
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (j60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? j60.e : j60Var;
    }

    @Override // defpackage.vh0
    public final void h() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.vh0
    public final void i() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.vh0
    public final void j() {
        this.m = oaf.f;
    }
}
