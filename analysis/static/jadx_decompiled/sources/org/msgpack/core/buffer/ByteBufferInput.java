package org.msgpack.core.buffer;

import defpackage.i24;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public class ByteBufferInput implements MessageBufferInput {
    private ByteBuffer input;
    private boolean isRead = false;

    public ByteBufferInput(ByteBuffer byteBuffer) {
        i24.h(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // org.msgpack.core.buffer.MessageBufferInput
    public MessageBuffer next() {
        if (this.isRead) {
            return null;
        }
        MessageBuffer messageBufferWrap = MessageBuffer.wrap(this.input);
        this.isRead = true;
        return messageBufferWrap;
    }

    public ByteBuffer reset(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2 = this.input;
        i24.h(byteBuffer, "input ByteBuffer is null");
        this.input = byteBuffer.slice();
        this.isRead = false;
        return byteBuffer2;
    }
}
