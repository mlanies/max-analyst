package defpackage;

/* loaded from: classes.dex */
public final class gm0 implements u1d {
    public final jm0 a;
    public final long b;
    public final long c = 0;
    public final long d;
    public final long e;
    public final long f;
    public final long g;

    public gm0(jm0 jm0Var, long j, long j2, long j3, long j4, long j5) {
        this.a = jm0Var;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        y1d y1dVar = new y1d(j, im0.a(this.a.b(j), this.c, this.d, this.e, this.f, this.g));
        return new s1d(y1dVar, y1dVar);
    }

    @Override // defpackage.u1d
    public final long f() {
        return this.b;
    }
}
