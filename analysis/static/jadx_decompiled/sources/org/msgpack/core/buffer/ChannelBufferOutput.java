package org.msgpack.core.buffer;

import defpackage.i24;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;

/* loaded from: classes2.dex */
public class ChannelBufferOutput implements MessageBufferOutput {
    private MessageBuffer buffer;
    private WritableByteChannel channel;

    public ChannelBufferOutput(WritableByteChannel writableByteChannel) {
        this(writableByteChannel, 8192);
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void add(byte[] bArr, int i, int i2) throws IOException {
        write(bArr, i, i2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public MessageBuffer next(int i) throws IOException {
        if (this.buffer.size() < i) {
            this.buffer = MessageBuffer.allocate(i);
        }
        return this.buffer;
    }

    public WritableByteChannel reset(WritableByteChannel writableByteChannel) throws IOException {
        WritableByteChannel writableByteChannel2 = this.channel;
        this.channel = writableByteChannel;
        return writableByteChannel2;
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void write(byte[] bArr, int i, int i2) throws IOException {
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i, i2);
        while (byteBufferWrap.hasRemaining()) {
            this.channel.write(byteBufferWrap);
        }
    }

    @Override // org.msgpack.core.buffer.MessageBufferOutput
    public void writeBuffer(int i) throws IOException {
        ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer(0, i);
        while (byteBufferSliceAsByteBuffer.hasRemaining()) {
            this.channel.write(byteBufferSliceAsByteBuffer);
        }
    }

    public ChannelBufferOutput(WritableByteChannel writableByteChannel, int i) {
        i24.h(writableByteChannel, "output channel is null");
        this.channel = writableByteChannel;
        this.buffer = MessageBuffer.allocate(i);
    }
}
