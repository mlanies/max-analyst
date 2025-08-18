package defpackage;

/* loaded from: classes.dex */
public final class ji3 extends hi3 implements d2d {
    public final int s0;
    public final long t0;

    public ji3(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        this.s0 = i;
        this.t0 = j == -1 ? -1L : j;
    }

    @Override // defpackage.d2d
    public final long a() {
        return this.t0;
    }

    @Override // defpackage.d2d
    public final long b(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.X;
    }

    @Override // defpackage.d2d
    public final int h() {
        return this.s0;
    }
}
