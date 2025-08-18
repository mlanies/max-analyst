package org.msgpack.core.buffer;

import defpackage.i24;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

/* loaded from: classes2.dex */
public class InputStreamBufferInput implements MessageBufferInput {
    private final byte[] buffer;
    private InputStream in;

    public InputStreamBufferInput(InputStream inputStream) {
        this(inputStream, 8192);
    }

    public static MessageBufferInput newBufferInput(InputStream inputStream) {
        FileChannel channel;
        i24.h(inputStream, "InputStream is null");
        return (!(inputStream instanceof FileInputStream) || (channel = ((FileInputStream) inputStream).getChannel()) == null) ? new InputStreamBufferInput(inputStream) : new ChannelBufferInput(channel);
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.in.close();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() throws IOException {
        int i = this.in.read(this.buffer);
        if (i == -1) {
            return null;
        }
        return MessageBuffer.wrap(this.buffer, 0, i);
    }

    public InputStream reset(InputStream inputStream) throws IOException {
        InputStream inputStream2 = this.in;
        this.in = inputStream;
        return inputStream2;
    }

    public InputStreamBufferInput(InputStream inputStream, int i) {
        i24.h(inputStream, "input is null");
        this.in = inputStream;
        this.buffer = new byte[i];
    }
}
