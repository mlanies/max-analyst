package defpackage;

import java.util.Random;

/* loaded from: classes.dex */
public final class ld7 extends Random {
    public final n4c a;
    public boolean b;

    public ld7(n4c n4cVar) {
        this.a = n4cVar;
    }

    @Override // java.util.Random
    public final int next(int i) {
        return this.a.a(i);
    }

    @Override // java.util.Random
    public final boolean nextBoolean() {
        return this.a.b();
    }

    @Override // java.util.Random
    public final void nextBytes(byte[] bArr) {
        this.a.c(bArr);
    }

    @Override // java.util.Random
    public final double nextDouble() {
        return this.a.d();
    }

    @Override // java.util.Random
    public final float nextFloat() {
        return this.a.e();
    }

    @Override // java.util.Random
    public final int nextInt() {
        return this.a.f();
    }

    @Override // java.util.Random
    public final long nextLong() {
        return this.a.h();
    }

    @Override // java.util.Random
    public final void setSeed(long j) {
        if (this.b) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.b = true;
    }

    @Override // java.util.Random
    public final int nextInt(int i) {
        return this.a.g(i);
    }
}
