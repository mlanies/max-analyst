package defpackage;

import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class y2f extends uh0 {
    public int i;
    public int j;
    public boolean k;
    public int l;
    public byte[] m;
    public int n;
    public long o;

    @Override // defpackage.uh0, defpackage.k60
    public final ByteBuffer a() {
        int i;
        if (super.d() && (i = this.n) > 0) {
            j(i).put(this.m, 0, this.n).flip();
            this.n = 0;
        }
        return super.a();
    }

    @Override // defpackage.k60
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
        ByteBuffer byteBufferJ = j(length);
        int iJ = maf.j(length, 0, this.n);
        byteBufferJ.put(this.m, 0, iJ);
        int iJ2 = maf.j(length - iJ, 0, i2);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferJ.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i3 = i2 - iJ2;
        int i4 = this.n - iJ;
        this.n = i4;
        byte[] bArr = this.m;
        System.arraycopy(bArr, iJ, bArr, 0, i4);
        byteBuffer.get(this.m, this.n, i3);
        this.n += i3;
        byteBufferJ.flip();
    }

    @Override // defpackage.uh0, defpackage.k60
    public final boolean d() {
        return super.d() && this.n == 0;
    }

    @Override // defpackage.uh0
    public final i60 f(i60 i60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (i60Var.c != 2) {
            throw new AudioProcessor$UnhandledAudioFormatException(i60Var);
        }
        this.k = true;
        return (this.i == 0 && this.j == 0) ? i60.e : i60Var;
    }

    @Override // defpackage.uh0
    public final void g() {
        if (this.k) {
            this.k = false;
            int i = this.j;
            int i2 = this.b.d;
            this.m = new byte[i * i2];
            this.l = this.i * i2;
        }
        this.n = 0;
    }

    @Override // defpackage.uh0
    public final void h() {
        if (this.k) {
            if (this.n > 0) {
                this.o += r0 / this.b.d;
            }
            this.n = 0;
        }
    }

    @Override // defpackage.uh0
    public final void i() {
        this.m = maf.f;
    }
}
