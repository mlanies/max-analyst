package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class gw4 implements fw4 {
    public File a;
    public FileInputStream b;
    public FileChannel c;

    @Override // defpackage.fw4
    public final int b(long j, ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer, j);
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.b.close();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return this.c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        return this.c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        return this.c.write(byteBuffer);
    }
}
