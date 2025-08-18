package defpackage;

/* loaded from: classes.dex */
public class hi3 implements v1d {
    public final int X;
    public final long Y;
    public final boolean Z;
    public final long a;
    public final long b;
    public final int c;
    public final long o;

    public hi3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.X = i;
        this.Z = z;
        if (j == -1) {
            this.o = -1L;
            this.Y = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.o = j3;
            this.Y = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return this.o != -1 || this.Z;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        long j2 = this.o;
        long j3 = this.b;
        if (j2 == -1 && !this.Z) {
            z1d z1dVar = new z1d(0L, j3);
            return new t1d(z1dVar, z1dVar);
        }
        int i = this.X;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        z1d z1dVar2 = new z1d(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new t1d(z1dVar2, new z1d((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new t1d(z1dVar2, z1dVar2);
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.Y;
    }
}
