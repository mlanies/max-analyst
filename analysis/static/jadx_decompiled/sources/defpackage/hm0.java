package defpackage;

/* loaded from: classes.dex */
public final class hm0 implements v1d {
    public final long X;
    public final long Y;
    public final long Z;
    public final km0 a;
    public final long b;
    public final long c = 0;
    public final long o;

    public hm0(km0 km0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = km0Var;
        this.b = j;
        this.o = j2;
        this.X = j3;
        this.Y = j4;
        this.Z = j5;
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        z1d z1dVar = new z1d(j, im0.b(this.a.b(j), this.c, this.o, this.X, this.Y, this.Z));
        return new t1d(z1dVar, z1dVar);
    }

    @Override // defpackage.v1d
    public final long f() {
        return this.b;
    }
}
