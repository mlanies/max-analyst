package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class kt0 implements oq8, Closeable {
    public ByteBuffer a;
    public final int b;
    public final long c = System.identityHashCode(this);

    public kt0(int i) {
        this.a = ByteBuffer.allocateDirect(i);
        this.b = i;
    }

    @Override // defpackage.oq8
    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        od2.p(!isClosed());
        this.a.getClass();
        iA = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, iA, this.b);
        this.a.position(i);
        this.a.get(bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.oq8
    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        od2.p(!isClosed());
        this.a.getClass();
        iA = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, iA, this.b);
        this.a.position(i);
        this.a.put(bArr, i2, iA);
        return iA;
    }

    public final void a(oq8 oq8Var, int i) {
        if (!(oq8Var instanceof kt0)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        od2.p(!isClosed());
        kt0 kt0Var = (kt0) oq8Var;
        od2.p(!kt0Var.isClosed());
        this.a.getClass();
        ema.i(0, kt0Var.b, 0, i, this.b);
        this.a.position(0);
        ByteBuffer byteBufferR = kt0Var.r();
        byteBufferR.getClass();
        byteBufferR.position(0);
        byte[] bArr = new byte[i];
        this.a.get(bArr, 0, i);
        byteBufferR.put(bArr, 0, i);
    }

    @Override // defpackage.oq8, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.a = null;
    }

    @Override // defpackage.oq8
    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // defpackage.oq8
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.oq8
    public final synchronized boolean isClosed() {
        return this.a == null;
    }

    @Override // defpackage.oq8
    public final long m() {
        return this.c;
    }

    @Override // defpackage.oq8
    public final void n(oq8 oq8Var, int i) {
        oq8Var.getClass();
        long jM = oq8Var.m();
        long j = this.c;
        if (jM == j) {
            Long.toHexString(j);
            Long.toHexString(oq8Var.m());
            od2.j(Boolean.FALSE);
        }
        if (oq8Var.m() < this.c) {
            synchronized (oq8Var) {
                synchronized (this) {
                    a(oq8Var, i);
                }
            }
        } else {
            synchronized (this) {
                synchronized (oq8Var) {
                    a(oq8Var, i);
                }
            }
        }
    }

    @Override // defpackage.oq8
    public final synchronized byte o(int i) {
        od2.p(!isClosed());
        od2.j(Boolean.valueOf(i >= 0));
        od2.j(Boolean.valueOf(i < this.b));
        this.a.getClass();
        return this.a.get(i);
    }

    @Override // defpackage.oq8
    public final synchronized ByteBuffer r() {
        return this.a;
    }
}
