package defpackage;

import android.os.SharedMemory;
import android.system.ErrnoException;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class et implements oq8, Closeable {
    public SharedMemory a;
    public ByteBuffer b;
    public final long c;

    public et(int i) throws ErrnoException {
        od2.j(Boolean.valueOf(i > 0));
        try {
            SharedMemory sharedMemoryCreate = SharedMemory.create("AshmemMemoryChunk", i);
            this.a = sharedMemoryCreate;
            this.b = sharedMemoryCreate.mapReadWrite();
            this.c = System.identityHashCode(this);
        } catch (ErrnoException e) {
            throw new RuntimeException("Fail to create AshmemMemory", e);
        }
    }

    @Override // defpackage.oq8
    public final synchronized int S(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        this.b.getClass();
        iA = ema.a(i, i3, getSize());
        ema.i(i, bArr.length, i2, iA, getSize());
        this.b.position(i);
        this.b.get(bArr, i2, iA);
        return iA;
    }

    @Override // defpackage.oq8
    public final synchronized int U(int i, int i2, int i3, byte[] bArr) {
        int iA;
        bArr.getClass();
        this.b.getClass();
        iA = ema.a(i, i3, getSize());
        ema.i(i, bArr.length, i2, iA, getSize());
        this.b.position(i);
        this.b.put(bArr, i2, iA);
        return iA;
    }

    public final void a(oq8 oq8Var, int i) {
        if (!(oq8Var instanceof et)) {
            throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
        }
        od2.p(!isClosed());
        et etVar = (et) oq8Var;
        od2.p(!etVar.isClosed());
        this.b.getClass();
        etVar.b.getClass();
        ema.i(0, etVar.getSize(), 0, i, getSize());
        this.b.position(0);
        etVar.b.position(0);
        byte[] bArr = new byte[i];
        this.b.get(bArr, 0, i);
        etVar.b.put(bArr, 0, i);
    }

    @Override // defpackage.oq8, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (!isClosed()) {
                SharedMemory sharedMemory = this.a;
                if (sharedMemory != null) {
                    sharedMemory.close();
                }
                ByteBuffer byteBuffer = this.b;
                if (byteBuffer != null) {
                    SharedMemory.unmap(byteBuffer);
                }
                this.b = null;
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.oq8
    public final long e0() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // defpackage.oq8
    public final int getSize() {
        this.a.getClass();
        return this.a.getSize();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000e  */
    @Override // defpackage.oq8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean isClosed() {
        /*
            r1 = this;
            monitor-enter(r1)
            java.nio.ByteBuffer r0 = r1.b     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            android.os.SharedMemory r0 = r1.a     // Catch: java.lang.Throwable -> Lc
            if (r0 != 0) goto La
            goto Le
        La:
            r0 = 0
            goto Lf
        Lc:
            r0 = move-exception
            goto L11
        Le:
            r0 = 1
        Lf:
            monitor-exit(r1)
            return r0
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et.isClosed():boolean");
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
        od2.j(Boolean.valueOf(i < getSize()));
        this.b.getClass();
        return this.b.get(i);
    }

    @Override // defpackage.oq8
    public final ByteBuffer r() {
        return this.b;
    }
}
