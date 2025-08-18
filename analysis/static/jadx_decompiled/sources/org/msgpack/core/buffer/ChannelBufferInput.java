package org.msgpack.core.buffer;

import defpackage.i24;
import defpackage.zr6;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;

/* loaded from: classes2.dex */
public class ChannelBufferInput implements MessageBufferInput {
    private final MessageBuffer buffer;
    private ReadableByteChannel channel;

    public ChannelBufferInput(ReadableByteChannel readableByteChannel) {
        this(readableByteChannel, 8192);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.channel.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        ByteBuffer byteBufferSliceAsByteBuffer = this.buffer.sliceAsByteBuffer();
        if (this.channel.read(byteBufferSliceAsByteBuffer) == -1) {
            return null;
        }
        byteBufferSliceAsByteBuffer.flip();
        return this.buffer.slice(0, byteBufferSliceAsByteBuffer.limit());
    }

    public ReadableByteChannel reset(ReadableByteChannel readableByteChannel) throws IOException {
        ReadableByteChannel readableByteChannel2 = this.channel;
        this.channel = readableByteChannel;
        return readableByteChannel2;
    }

    public ChannelBufferInput(ReadableByteChannel readableByteChannel, int i) {
        i24.h(readableByteChannel, "input channel is null");
        this.channel = readableByteChannel;
        boolean z = i > 0;
        String strH = zr6.h(i, "buffer size must be > 0: ");
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(strH));
        }
        this.buffer = MessageBuffer.allocate(i);
    }
}
