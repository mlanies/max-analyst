package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class us0 extends InputStream {
    public final /* synthetic */ int a;
    public final /* synthetic */ fu0 b;

    public /* synthetic */ us0(fu0 fu0Var, int i) {
        this.a = i;
        this.b = fu0Var;
    }

    private final void m() {
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        switch (this.a) {
            case 0:
                return (int) Math.min(((bt0) this.b).b, Integer.MAX_VALUE);
            default:
                y7c y7cVar = (y7c) this.b;
                if (y7cVar.b) {
                    throw new IOException("closed");
                }
                return (int) Math.min(y7cVar.a.b, Integer.MAX_VALUE);
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((y7c) this.b).close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.a) {
            case 0:
                bt0 bt0Var = (bt0) this.b;
                if (bt0Var.b > 0) {
                    return bt0Var.readByte() & 255;
                }
                return -1;
            default:
                y7c y7cVar = (y7c) this.b;
                if (y7cVar.b) {
                    throw new IOException("closed");
                }
                bt0 bt0Var2 = y7cVar.a;
                if (bt0Var2.b == 0) {
                    if (y7cVar.c.c(bt0Var2, 8192) == -1) {
                        return -1;
                    }
                }
                return bt0Var2.readByte() & 255;
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return ((bt0) this.b) + ".inputStream()";
            default:
                return ((y7c) this.b) + ".inputStream()";
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        switch (this.a) {
            case 0:
                return ((bt0) this.b).e0(bArr, i, i2);
            default:
                y7c y7cVar = (y7c) this.b;
                if (!y7cVar.b) {
                    hm9.g(bArr.length, i, i2);
                    bt0 bt0Var = y7cVar.a;
                    if (bt0Var.b == 0) {
                        if (y7cVar.c.c(bt0Var, 8192) == -1) {
                            return -1;
                        }
                    }
                    return bt0Var.e0(bArr, i, i2);
                }
                throw new IOException("closed");
        }
    }
}
