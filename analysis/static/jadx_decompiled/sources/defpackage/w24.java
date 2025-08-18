package defpackage;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class w24 extends InputStream {
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a;
    public final byte[] b;
    public boolean c;
    public boolean o;

    public w24(r24 r24Var, z24 z24Var) {
        this.a = 0;
        this.c = false;
        this.o = false;
        this.X = r24Var;
        this.Y = z24Var;
        this.b = new byte[1];
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                if (!this.o) {
                    ((r24) this.X).close();
                    this.o = true;
                    break;
                }
                break;
            default:
                if (!this.o) {
                    ((t24) this.X).close();
                    this.o = true;
                    break;
                }
                break;
        }
    }

    public final void m() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    ((r24) this.X).L((z24) this.Y);
                    this.c = true;
                    break;
                }
                break;
            default:
                if (!this.c) {
                    ((t24) this.X).G((a34) this.Y);
                    this.c = true;
                    break;
                }
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        switch (this.a) {
            case 0:
                byte[] bArr = this.b;
                if (read(bArr, 0, bArr.length) == -1) {
                    return -1;
                }
                return bArr[0] & 255;
            default:
                byte[] bArr2 = this.b;
                if (read(bArr2, 0, bArr2.length) == -1) {
                    return -1;
                }
                return bArr2[0] & 255;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        switch (this.a) {
        }
        return read(bArr, 0, bArr.length);
    }

    public w24(t24 t24Var, a34 a34Var) {
        this.a = 1;
        this.c = false;
        this.o = false;
        this.X = t24Var;
        this.Y = a34Var;
        this.b = new byte[1];
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        switch (this.a) {
            case 0:
                np8.f(!this.o);
                m();
                int i3 = ((r24) this.X).read(bArr, i, i2);
                if (i3 == -1) {
                    break;
                }
                break;
            default:
                fm9.k(!this.o);
                m();
                int i4 = ((t24) this.X).read(bArr, i, i2);
                if (i4 == -1) {
                    break;
                }
                break;
        }
        return -1;
    }
}
