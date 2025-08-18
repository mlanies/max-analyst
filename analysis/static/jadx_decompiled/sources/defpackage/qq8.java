package defpackage;

import java.io.Closeable;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class qq8 implements Closeable {
    public final int a;
    public o43 b;

    public qq8(int i, o43 o43Var) {
        o43Var.getClass();
        if (!(i >= 0 && i <= ((oq8) o43Var.e0()).getSize())) {
            throw new IllegalArgumentException();
        }
        this.b = o43Var.clone();
        this.a = i;
    }

    public final synchronized void S(int i, int i2, int i3, byte[] bArr) {
        m();
        if (!(i + i3 <= this.a)) {
            throw new IllegalArgumentException();
        }
        this.b.getClass();
        ((oq8) this.b.e0()).S(i, i2, i3, bArr);
    }

    public final synchronized int U() {
        m();
        return this.a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        o43.S(this.b);
        this.b = null;
    }

    public final synchronized void m() {
        synchronized (this) {
        }
        if (!o43.n0(this.b)) {
            throw new RuntimeException() { // from class: com.facebook.common.memory.PooledByteBuffer$ClosedException
            };
        }
    }

    public final synchronized long n() {
        m();
        this.b.getClass();
        return ((oq8) this.b.e0()).e0();
    }

    public final synchronized byte o(int i) {
        m();
        od2.j(Boolean.valueOf(i >= 0));
        od2.j(Boolean.valueOf(i < this.a));
        this.b.getClass();
        return ((oq8) this.b.e0()).o(i);
    }

    public final synchronized ByteBuffer r() {
        this.b.getClass();
        return ((oq8) this.b.e0()).r();
    }
}
