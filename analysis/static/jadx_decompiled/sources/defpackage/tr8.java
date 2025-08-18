package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class tr8 extends InputStream {
    public final int X;
    public final wr6 a;
    public final InputStream b;
    public byte[] c;
    public int o;

    public tr8(wr6 wr6Var, InputStream inputStream, byte[] bArr, int i, int i2) {
        this.a = wr6Var;
        this.b = inputStream;
        this.c = bArr;
        this.o = i;
        this.X = i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.c != null ? this.X - this.o : this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        m();
        this.b.close();
    }

    public final void m() {
        byte[] bArr = this.c;
        if (bArr != null) {
            this.c = null;
            wr6 wr6Var = this.a;
            if (wr6Var != null) {
                wr6Var.a(bArr);
            }
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        if (this.c == null) {
            this.b.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.c == null && this.b.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.c;
        if (bArr == null) {
            return this.b.read();
        }
        int i = this.o;
        int i2 = i + 1;
        this.o = i2;
        int i3 = bArr[i] & 255;
        if (i2 >= this.X) {
            m();
        }
        return i3;
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        if (this.c == null) {
            this.b.reset();
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long j2;
        if (this.c != null) {
            int i = this.o;
            j2 = this.X - i;
            if (j2 > j) {
                this.o = i + ((int) j);
                return j;
            }
            m();
            j -= j2;
        } else {
            j2 = 0;
        }
        return j > 0 ? j2 + this.b.skip(j) : j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.c;
        if (bArr2 != null) {
            int i3 = this.o;
            int i4 = this.X;
            int i5 = i4 - i3;
            if (i2 > i5) {
                i2 = i5;
            }
            System.arraycopy(bArr2, i3, bArr, i, i2);
            int i6 = this.o + i2;
            this.o = i6;
            if (i6 >= i4) {
                m();
            }
            return i2;
        }
        return this.b.read(bArr, i, i2);
    }
}
