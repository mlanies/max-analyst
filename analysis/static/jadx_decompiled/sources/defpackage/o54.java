package defpackage;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class o54 extends oy {
    public boolean X;
    public long Y;
    public ByteBuffer Z;
    public final rz3 c;
    public ByteBuffer o;
    public final int s0;
    public final int t0;

    static {
        h85.a("goog.exo.decoder");
    }

    public o54(int i) {
        super(2);
        this.c = new rz3(0);
        this.s0 = i;
        this.t0 = 0;
    }

    public void v() {
        this.b = 0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.X = false;
    }

    public final ByteBuffer w(int i) {
        int i2 = this.s0;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.o;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb = new StringBuilder(44);
        sb.append("Buffer too small (");
        sb.append(iCapacity);
        sb.append(" < ");
        sb.append(i);
        sb.append(")");
        throw new DecoderInputBuffer$InsufficientCapacityException(sb.toString());
    }

    public final void x(int i) {
        int i2 = i + this.t0;
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer == null) {
            this.o = w(i2);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i3 = i2 + iPosition;
        if (iCapacity >= i3) {
            this.o = byteBuffer;
            return;
        }
        ByteBuffer byteBufferW = w(i3);
        byteBufferW.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferW.put(byteBuffer);
        }
        this.o = byteBufferW;
    }

    public final void y() {
        ByteBuffer byteBuffer = this.o;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.Z;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
