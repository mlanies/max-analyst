package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;

/* loaded from: classes2.dex */
public final class dj9 {
    public final int a;
    public final ByteBuffer b;
    public final MediaCodec.BufferInfo c;

    public dj9(int i, ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        this.a = i;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteBuffer.capacity());
        this.b = byteBufferAllocate;
        byteBufferAllocate.put(byteBuffer);
        byteBufferAllocate.limit(byteBuffer.limit());
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.c = bufferInfo2;
        bufferInfo2.set(bufferInfo.offset, bufferInfo.size, bufferInfo.presentationTimeUs, bufferInfo.flags);
    }
}
