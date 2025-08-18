package org.msgpack.core.buffer;

import defpackage.i24;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes2.dex */
public class OutputStreamBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private OutputStream out;

    public OutputStreamBufferOutput(OutputStream outputStream) {
        this(outputStream, 8192);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.out.flush();
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) throws IOException {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public OutputStream reset(OutputStream outputStream) throws IOException {
        OutputStream outputStream2 = this.out;
        this.out = outputStream;
        return outputStream2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) throws IOException {
        write(this.buffer.array(), this.buffer.arrayOffset(), i);
    }

    public OutputStreamBufferOutput(OutputStream outputStream, int i) {
        i24.h(outputStream, "output is null");
        this.out = outputStream;
        this.buffer = MessageBuffer.allocate(i);
    }
}
