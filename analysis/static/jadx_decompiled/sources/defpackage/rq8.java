package defpackage;

import com.facebook.imagepipeline.memory.MemoryPooledByteBufferOutputStream$InvalidStreamException;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class rq8 extends OutputStream {
    public final pq8 a;
    public v84 b;
    public int c;

    public rq8(pq8 pq8Var, int i) {
        if (i <= 0) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.a = pq8Var;
        this.c = 0;
        this.b = o43.p0(pq8Var.get(i), pq8Var, o43.Y);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        o43.S(this.b);
        this.b = null;
        this.c = -1;
        m();
    }

    public final void m() throws IOException {
        try {
            super.close();
        } catch (IOException e) {
            nu0.H(e);
            throw null;
        }
    }

    public final qq8 n() {
        if (!o43.n0(this.b)) {
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        v84 v84Var = this.b;
        if (v84Var != null) {
            return new qq8(this.c, v84Var);
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (o43.n0(this.b)) {
                int i3 = this.c + i2;
                if (o43.n0(this.b)) {
                    v84 v84Var = this.b;
                    if (v84Var != null) {
                        if (i3 > ((oq8) v84Var.e0()).getSize()) {
                            pq8 pq8Var = this.a;
                            oq8 oq8Var = (oq8) pq8Var.get(i3);
                            v84 v84Var2 = this.b;
                            if (v84Var2 != null) {
                                ((oq8) v84Var2.e0()).n(oq8Var, this.c);
                                this.b.close();
                                this.b = o43.p0(oq8Var, pq8Var, o43.Y);
                            } else {
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                        }
                        v84 v84Var3 = this.b;
                        if (v84Var3 != null) {
                            ((oq8) v84Var3.e0()).U(this.c, i, i2, bArr);
                            this.c += i2;
                            return;
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
            }
            throw new MemoryPooledByteBufferOutputStream$InvalidStreamException();
        }
        StringBuilder sbJ = wg0.j("length=", bArr.length, "; regionStart=", i, "; regionLength=");
        sbJ.append(i2);
        throw new ArrayIndexOutOfBoundsException(sbJ.toString());
    }

    public rq8(pq8 pq8Var) {
        this(pq8Var, pq8Var.v0[0]);
    }
}
