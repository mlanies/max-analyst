package com.facebook.imagepipeline.memory;

import defpackage.ema;
import defpackage.hm9;
import defpackage.od2;
import defpackage.oq8;
import defpackage.pm4;
import java.io.Closeable;
import java.nio.ByteBuffer;

@pm4
/* loaded from: classes.dex */
public class NativeMemoryChunk implements oq8, Closeable {
    public final long a;
    public final int b;
    public boolean c;

    static {
        hm9.M("imagepipeline");
    }

    public NativeMemoryChunk(int i) {
        od2.j(Boolean.valueOf(i > 0));
        this.b = i;
        this.a = nativeAllocate(i);
        this.c = false;
    }

    @pm4
    private static native long nativeAllocate(int i);

    @pm4
    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    @pm4
    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    @pm4
    private static native void nativeFree(long j);

    @pm4
    private static native void nativeMemcpy(long j, long j2, int i);

    @pm4
    private static native byte nativeReadByte(long j);

    @Override // defpackage.oq8
    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        od2.p(!isClosed());
        iA = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, iA, this.b);
        nativeCopyToByteArray(this.a + i, bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.oq8
    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        od2.p(!isClosed());
        iA = ema.a(i, i3, this.b);
        ema.i(i, bArr.length, i2, iA, this.b);
        nativeCopyFromByteArray(this.a + i, bArr, i2, iA);
        return iA;
    }

    public final void a(oq8 oq8Var, int i) {
        if (!(oq8Var instanceof NativeMemoryChunk)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        od2.p(!isClosed());
        NativeMemoryChunk nativeMemoryChunk = (NativeMemoryChunk) oq8Var;
        od2.p(!nativeMemoryChunk.isClosed());
        ema.i(0, nativeMemoryChunk.b, 0, i, this.b);
        long j = 0;
        nativeMemcpy(nativeMemoryChunk.a + j, this.a + j, i);
    }

    @Override // defpackage.oq8, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            nativeFree(this.a);
        }
    }

    @Override // defpackage.oq8
    public final long e0() {
        return this.a;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        Integer.toHexString(System.identityHashCode(this));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // defpackage.oq8
    public final int getSize() {
        return this.b;
    }

    @Override // defpackage.oq8
    public final synchronized boolean isClosed() {
        return this.c;
    }

    @Override // defpackage.oq8
    public final long m() {
        return this.a;
    }

    @Override // defpackage.oq8
    public final void n(oq8 oq8Var, int i) {
        oq8Var.getClass();
        if (oq8Var.m() == this.a) {
            Integer.toHexString(System.identityHashCode(this));
            Integer.toHexString(System.identityHashCode(oq8Var));
            Long.toHexString(this.a);
            od2.j(Boolean.FALSE);
        }
        if (oq8Var.m() < this.a) {
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
        return nativeReadByte(this.a + i);
    }

    @Override // defpackage.oq8
    public final ByteBuffer r() {
        return null;
    }

    public NativeMemoryChunk() {
        this.b = 0;
        this.a = 0L;
        this.c = true;
    }
}
