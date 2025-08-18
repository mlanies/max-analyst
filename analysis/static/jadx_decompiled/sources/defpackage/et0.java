package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class et0 implements d05 {
    public final ByteBuffer a;
    public final MediaCodec.BufferInfo b;
    public final lq1 c;

    public et0(d05 d05Var) {
        MediaCodec.BufferInfo bufferInfoF = d05Var.F();
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        bufferInfo.set(0, bufferInfoF.size, bufferInfoF.presentationTimeUs, bufferInfoF.flags);
        this.b = bufferInfo;
        ByteBuffer byteBufferR = d05Var.r();
        MediaCodec.BufferInfo bufferInfoF2 = d05Var.F();
        byteBufferR.position(bufferInfoF2.offset);
        byteBufferR.limit(bufferInfoF2.offset + bufferInfoF2.size);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bufferInfoF2.size);
        byteBufferAllocate.order(byteBufferR.order());
        byteBufferAllocate.put(byteBufferR);
        byteBufferAllocate.flip();
        this.a = byteBufferAllocate;
        AtomicReference atomicReference = new AtomicReference();
        f8.g(new dt0(atomicReference, 0));
        lq1 lq1Var = (lq1) atomicReference.get();
        lq1Var.getClass();
        this.c = lq1Var;
    }

    @Override // defpackage.d05
    public final MediaCodec.BufferInfo F() {
        return this.b;
    }

    @Override // defpackage.d05
    public final boolean I() {
        return (this.b.flags & 1) != 0;
    }

    @Override // defpackage.d05
    public final long Y() {
        return this.b.presentationTimeUs;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.c.b(null);
    }

    @Override // defpackage.d05
    public final ByteBuffer r() {
        return this.a;
    }

    @Override // defpackage.d05
    public final long size() {
        return this.b.size;
    }
}
