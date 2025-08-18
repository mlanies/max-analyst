package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class p5b extends InputStream {
    public int X;
    public boolean Y;
    public final InputStream a;
    public final byte[] b;
    public final pic c;
    public int o;

    public p5b(InputStream inputStream, byte[] bArr, pic picVar) {
        this.a = inputStream;
        bArr.getClass();
        this.b = bArr;
        picVar.getClass();
        this.c = picVar;
        this.o = 0;
        this.X = 0;
        this.Y = false;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        od2.p(this.X <= this.o);
        m();
        return this.a.available() + (this.o - this.X);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.Y) {
            return;
        }
        this.Y = true;
        this.c.e(this.b);
        super.close();
    }

    public final void finalize() throws Throwable {
        if (!this.Y) {
            if (ta5.a.i(6)) {
                ta5.a.e("PooledByteInputStream", "Finalized without closing");
            }
            close();
        }
        super.finalize();
    }

    public final void m() throws IOException {
        if (this.Y) {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        od2.p(this.X <= this.o);
        m();
        int i = this.X;
        int i2 = this.o;
        byte[] bArr = this.b;
        if (i >= i2) {
            int i3 = this.a.read(bArr);
            if (i3 <= 0) {
                return -1;
            }
            this.o = i3;
            this.X = 0;
        }
        int i4 = this.X;
        this.X = i4 + 1;
        return bArr[i4] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        od2.p(this.X <= this.o);
        m();
        int i = this.o;
        int i2 = this.X;
        long j2 = i - i2;
        if (j2 >= j) {
            this.X = (int) (i2 + j);
            return j;
        }
        this.X = i;
        return this.a.skip(j - j2) + j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        od2.p(this.X <= this.o);
        m();
        int i3 = this.X;
        int i4 = this.o;
        byte[] bArr2 = this.b;
        if (i3 >= i4) {
            int i5 = this.a.read(bArr2);
            if (i5 <= 0) {
                return -1;
            }
            this.o = i5;
            this.X = 0;
        }
        int iMin = Math.min(this.o - this.X, i2);
        System.arraycopy(bArr2, this.X, bArr, i, iMin);
        this.X += iMin;
        return iMin;
    }
}
