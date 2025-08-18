package defpackage;

import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

/* loaded from: classes.dex */
public final class n4f extends Reader {
    public int X;
    public final boolean Y;
    public char Z = 0;
    public final wr6 a;
    public InputStream b;
    public byte[] c;
    public int o;
    public int s0;
    public int t0;
    public final boolean u0;
    public char[] v0;

    public n4f(wr6 wr6Var, InputStream inputStream, byte[] bArr, int i, int i2, boolean z) {
        this.a = wr6Var;
        this.b = inputStream;
        this.c = bArr;
        this.o = i;
        this.X = i2;
        this.Y = z;
        this.u0 = inputStream != null;
    }

    public final void a(int i) throws CharConversionException {
        throw new CharConversionException(zr6.j(wg0.j("Unexpected EOF in the middle of a 4-byte UTF-32 char: got ", i, ", needed 4, at char #", this.s0, ", byte #"), this.t0 + i, ")"));
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            this.b = null;
            byte[] bArr = this.c;
            if (bArr != null) {
                this.c = null;
                this.a.a(bArr);
            }
            inputStream.close();
        }
    }

    @Override // java.io.Reader
    public final int read() {
        if (this.v0 == null) {
            this.v0 = new char[1];
        }
        if (read(this.v0, 0, 1) < 1) {
            return -1;
        }
        return this.v0[0];
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x016c A[LOOP:0: B:58:0x00a8->B:77:0x016c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0114 A[SYNTHETIC] */
    @Override // java.io.Reader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int read(char[] r13, int r14, int r15) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n4f.read(char[], int, int):int");
    }
}
