package defpackage;

import java.io.IOException;
import java.io.OutputStream;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class ju8 extends OutputStream {
    public final OutputStream a;
    public final MessageDigest b;

    public ju8(g9f g9fVar, MessageDigest messageDigest) {
        this.a = g9fVar;
        this.b = messageDigest;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.a.write(i);
        this.b.update((byte) i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.a.write(bArr, i, i2);
        this.b.update(bArr, i, i2);
    }
}
