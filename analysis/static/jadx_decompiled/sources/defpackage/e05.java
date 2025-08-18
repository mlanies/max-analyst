package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e05 implements d05 {
    public final oq1 X;
    public final lq1 Y;
    public final AtomicBoolean Z = new AtomicBoolean(false);
    public final MediaCodec a;
    public final MediaCodec.BufferInfo b;
    public final int c;
    public final ByteBuffer o;

    public e05(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        mediaCodec.getClass();
        this.a = mediaCodec;
        this.c = i;
        this.o = mediaCodec.getOutputBuffer(i);
        this.b = bufferInfo;
        AtomicReference atomicReference = new AtomicReference();
        this.X = f8.g(new dt0(atomicReference, 2));
        lq1 lq1Var = (lq1) atomicReference.get();
        lq1Var.getClass();
        this.Y = lq1Var;
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
        lq1 lq1Var = this.Y;
        if (this.Z.getAndSet(true)) {
            return;
        }
        try {
            this.a.releaseOutputBuffer(this.c, false);
            lq1Var.b(null);
        } catch (IllegalStateException e) {
            lq1Var.d(e);
        }
    }

    @Override // defpackage.d05
    public final ByteBuffer r() {
        if (this.Z.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
        MediaCodec.BufferInfo bufferInfo = this.b;
        int i = bufferInfo.offset;
        ByteBuffer byteBuffer = this.o;
        byteBuffer.position(i);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return byteBuffer;
    }

    @Override // defpackage.d05
    public final long size() {
        return this.b.size;
    }
}
