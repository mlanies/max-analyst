package defpackage;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class lpd extends vh0 {
    public int n;
    public boolean o;
    public int p;
    public long q;
    public byte[] s;
    public byte[] v;
    public int r = 0;
    public int t = 0;
    public int u = 0;
    public final long l = 100000;
    public final float i = 0.2f;
    public final long m = 2000000;
    public final int k = 10;
    public final short j = 1024;

    public lpd() {
        byte[] bArr = oaf.f;
        this.s = bArr;
        this.v = bArr;
    }

    @Override // defpackage.m60
    public final void b(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.g.hasRemaining()) {
            int i = this.p;
            short s = this.j;
            if (i == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s) {
                        int i2 = this.n;
                        iPosition = ((iLimit3 / i2) * i2) + i2;
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    k(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i != 1) {
                    throw new IllegalStateException();
                }
                fm9.k(this.t < this.s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s) {
                        int i3 = this.n;
                        iLimit = (iPosition2 / i3) * i3;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.t;
                int i4 = this.u;
                int length2 = length + i4;
                byte[] bArr = this.s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i4 - (bArr.length - length);
                }
                int i5 = length - length2;
                boolean z = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i5);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.s, length2, iMin);
                int i6 = this.u + iMin;
                this.u = i6;
                fm9.k(i6 <= this.s.length);
                boolean z2 = z && iPosition3 < i5;
                m(z2);
                if (z2) {
                    this.p = 0;
                    this.r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }

    @Override // defpackage.vh0
    public final j60 g(j60 j60Var) throws AudioProcessor$UnhandledAudioFormatException {
        if (j60Var.c == 2) {
            return j60Var.a == -1 ? j60.e : j60Var;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(j60Var);
    }

    @Override // defpackage.vh0
    public final void h() {
        if (isActive()) {
            int i = this.b.b * 2;
            this.n = i;
            int i2 = ((((int) ((this.l * r0.a) / 1000000)) / 2) / i) * i * 2;
            if (this.s.length != i2) {
                this.s = new byte[i2];
                this.v = new byte[i2];
            }
        }
        this.p = 0;
        this.q = 0L;
        this.r = 0;
        this.t = 0;
        this.u = 0;
    }

    @Override // defpackage.vh0
    public final void i() {
        if (this.u > 0) {
            m(true);
            this.r = 0;
        }
    }

    @Override // defpackage.vh0, defpackage.m60
    public final boolean isActive() {
        return super.isActive() && this.o;
    }

    @Override // defpackage.vh0
    public final void j() {
        this.o = false;
        byte[] bArr = oaf.f;
        this.s = bArr;
        this.v = bArr;
    }

    public final int l(int i) {
        int length = ((((int) ((this.m * this.b.a) / 1000000)) - this.r) * this.n) - (this.s.length / 2);
        fm9.k(length >= 0);
        int iMin = (int) Math.min((i * this.i) + 0.5f, length);
        int i2 = this.n;
        return (iMin / i2) * i2;
    }

    public final void m(boolean z) {
        int length;
        int iL;
        int i = this.u;
        byte[] bArr = this.s;
        if (i == bArr.length || z) {
            if (this.r == 0) {
                if (z) {
                    n(i, 3);
                    length = i;
                } else {
                    fm9.k(i >= bArr.length / 2);
                    length = this.s.length / 2;
                    n(length, 0);
                }
                iL = length;
            } else if (z) {
                int length2 = i - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iL2 = l(length2) + (this.s.length / 2);
                n(iL2, 2);
                iL = iL2;
                length = length3;
            } else {
                length = i - (bArr.length / 2);
                iL = l(length);
                n(iL, 1);
            }
            fm9.j("bytesConsumed is not aligned to frame size: %s" + length, length % this.n == 0);
            fm9.k(i >= iL);
            this.u -= length;
            int i2 = this.t + length;
            this.t = i2;
            this.t = i2 % this.s.length;
            this.r = (iL / this.n) + this.r;
            this.q += (length - iL) / r2;
        }
    }

    public final void n(int i, int i2) {
        if (i == 0) {
            return;
        }
        fm9.f(this.u >= i);
        if (i2 == 2) {
            int i3 = this.t;
            int i4 = this.u;
            int i5 = i3 + i4;
            byte[] bArr = this.s;
            if (i5 <= bArr.length) {
                System.arraycopy(bArr, i5 - i, this.v, 0, i);
            } else {
                int length = i4 - (bArr.length - i3);
                if (length >= i) {
                    System.arraycopy(bArr, length - i, this.v, 0, i);
                } else {
                    int i6 = i - length;
                    System.arraycopy(bArr, bArr.length - i6, this.v, 0, i6);
                    System.arraycopy(this.s, 0, this.v, i6, length);
                }
            }
        } else {
            int i7 = this.t;
            int i8 = i7 + i;
            byte[] bArr2 = this.s;
            if (i8 <= bArr2.length) {
                System.arraycopy(bArr2, i7, this.v, 0, i);
            } else {
                int length2 = bArr2.length - i7;
                System.arraycopy(bArr2, i7, this.v, 0, length2);
                System.arraycopy(this.s, 0, this.v, length2, i - length2);
            }
        }
        fm9.e("sizeToOutput is not aligned to frame size: " + i, i % this.n == 0);
        fm9.k(this.t < this.s.length);
        byte[] bArr3 = this.v;
        fm9.e("byteOutput size is not aligned to frame size " + i, i % this.n == 0);
        if (i2 != 3) {
            for (int i9 = 0; i9 < i; i9 += 2) {
                int i10 = i9 + 1;
                int i11 = (bArr3[i10] << 8) | (bArr3[i9] & 255);
                int i12 = this.k;
                if (i2 == 0) {
                    i12 = ((((i9 * 1000) / (i - 1)) * (i12 - 100)) / 1000) + 100;
                } else if (i2 == 2) {
                    i12 += (((i9 * 1000) * (100 - i12)) / (i - 1)) / 1000;
                }
                int i13 = (i11 * i12) / 100;
                if (i13 >= 32767) {
                    bArr3[i9] = -1;
                    bArr3[i10] = Byte.MAX_VALUE;
                } else if (i13 <= -32768) {
                    bArr3[i9] = 0;
                    bArr3[i10] = Byte.MIN_VALUE;
                } else {
                    bArr3[i9] = (byte) (i13 & 255);
                    bArr3[i10] = (byte) (i13 >> 8);
                }
            }
        }
        k(i).put(bArr3, 0, i).flip();
    }
}
