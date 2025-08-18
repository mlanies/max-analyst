package defpackage;

/* loaded from: classes.dex */
public class gi3 implements u1d {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public gi3(long j, long j2, int i, int i2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return this.d != -1 || this.g;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            y1d y1dVar = new y1d(0L, j3);
            return new s1d(y1dVar, y1dVar);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        y1d y1dVar2 = new y1d(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.a) {
                return new s1d(y1dVar2, new y1d((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new s1d(y1dVar2, y1dVar2);
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.f;
    }
}
