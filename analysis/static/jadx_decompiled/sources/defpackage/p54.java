package defpackage;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class p54 extends oy {
    public ByteBuffer X;
    public boolean Y;
    public long Z;
    public qy5 c;
    public final rz3 o;
    public ByteBuffer s0;
    public final int t0;
    public final int u0;

    static {
        nc8.a("media3.decoder");
    }

    public p54(int i) {
        super(3);
        this.o = new rz3(1);
        this.t0 = i;
        this.u0 = 0;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.s0;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.Y = false;
    }

    public final ByteBuffer w(int i) {
        int i2 = this.t0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.X;
        throw new DecoderInputBuffer$InsufficientCapacityException(wg0.h("Buffer too small (", byteBuffer == null ? 0 : byteBuffer.capacity(), " < ", i, ")"));
    }

    public final void x(int i) {
        int i2 = i + this.u0;
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer == null) {
            this.X = w(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.X = byteBuffer;
            return;
        }
        ByteBuffer byteBufferW = w(i3);
        byteBufferW.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferW.put(byteBuffer);
        }
        this.X = byteBufferW;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.X;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.s0;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
