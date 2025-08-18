package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;

/* loaded from: classes.dex */
public final class c94 {
    public final /* synthetic */ int a;
    public final long b;
    public final long c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public /* synthetic */ c94(long j, Object obj, Object obj2, Object obj3, long j2, Object obj4, int i) {
        this.a = i;
        this.b = j;
        this.e = obj;
        this.f = obj2;
        this.c = j2;
        this.d = obj3;
        this.g = obj4;
    }

    public c94 a(long j, khc khcVar) throws BehindLiveWindowException {
        long jV;
        z14 z14VarC = ((khc) this.e).c();
        z14 z14VarC2 = khcVar.c();
        if (z14VarC == null) {
            return new c94(j, khcVar, (lk0) this.f, (wu0) this.d, this.c, z14VarC, 0);
        }
        if (!z14VarC.A()) {
            return new c94(j, khcVar, (lk0) this.f, (wu0) this.d, this.c, z14VarC2, 0);
        }
        long jD = z14VarC.D(j);
        if (jD == 0) {
            return new c94(j, khcVar, (lk0) this.f, (wu0) this.d, this.c, z14VarC2, 0);
        }
        long jC = z14VarC.C();
        long jB = z14VarC.b(jC);
        long jV2 = jD + jC;
        long j2 = jV2 - 1;
        long j3 = z14VarC.j(j2, j) + z14VarC.b(j2);
        long jC2 = z14VarC2.C();
        long jB2 = z14VarC2.b(jC2);
        long j4 = this.c;
        if (j3 == jB2) {
            jV = (jV2 - jC2) + j4;
        } else {
            if (j3 < jB2) {
                throw new BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jV = j4 - (z14VarC2.v(jB, j) - jC);
            } else {
                jV2 = z14VarC.v(jB2, j);
                jV = (jV2 - jC2) + j4;
            }
        }
        return new c94(j, khcVar, (lk0) this.f, (wu0) this.d, jV, z14VarC2, 0);
    }

    public c94 b(long j, lhc lhcVar) throws androidx.media3.exoplayer.source.BehindLiveWindowException {
        long jV;
        a24 a24VarC = ((lhc) this.e).c();
        a24 a24VarC2 = lhcVar.c();
        if (a24VarC == null) {
            return new c94(j, lhcVar, (mk0) this.f, (k13) this.d, this.c, a24VarC, 1);
        }
        if (!a24VarC.A()) {
            return new c94(j, lhcVar, (mk0) this.f, (k13) this.d, this.c, a24VarC2, 1);
        }
        long jD = a24VarC.D(j);
        if (jD == 0) {
            return new c94(j, lhcVar, (mk0) this.f, (k13) this.d, this.c, a24VarC2, 1);
        }
        fm9.l(a24VarC2);
        long jC = a24VarC.C();
        long jB = a24VarC.b(jC);
        long jV2 = jD + jC;
        long j2 = jV2 - 1;
        long j3 = a24VarC.j(j2, j) + a24VarC.b(j2);
        long jC2 = a24VarC2.C();
        long jB2 = a24VarC2.b(jC2);
        long j4 = this.c;
        if (j3 == jB2) {
            jV = (jV2 - jC2) + j4;
        } else {
            if (j3 < jB2) {
                throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jV = j4 - (a24VarC2.v(jB, j) - jC);
            } else {
                jV2 = a24VarC.v(jB2, j);
                jV = (jV2 - jC2) + j4;
            }
        }
        return new c94(j, lhcVar, (mk0) this.f, (k13) this.d, jV, a24VarC2, 1);
    }

    public long c(long j) {
        a24 a24Var = (a24) this.g;
        fm9.l(a24Var);
        return a24Var.k(this.b, j) + this.c;
    }

    public final long d(long j) {
        switch (this.a) {
            case 0:
                z14 z14Var = (z14) this.g;
                long j2 = this.b;
                return (z14Var.E(j2, j) + (z14Var.k(j2, j) + this.c)) - 1;
            default:
                long jC = c(j);
                a24 a24Var = (a24) this.g;
                fm9.l(a24Var);
                return (a24Var.E(this.b, j) + jC) - 1;
        }
    }

    public long e() {
        a24 a24Var = (a24) this.g;
        fm9.l(a24Var);
        return a24Var.D(this.b);
    }

    public final long f(long j) {
        switch (this.a) {
            case 0:
                return ((z14) this.g).j(j - this.c, this.b) + g(j);
            default:
                long jG = g(j);
                a24 a24Var = (a24) this.g;
                fm9.l(a24Var);
                return a24Var.j(j - this.c, this.b) + jG;
        }
    }

    public final long g(long j) {
        switch (this.a) {
            case 0:
                return ((z14) this.g).b(j - this.c);
            default:
                a24 a24Var = (a24) this.g;
                fm9.l(a24Var);
                return a24Var.b(j - this.c);
        }
    }

    public boolean h(long j, long j2) {
        a24 a24Var = (a24) this.g;
        fm9.l(a24Var);
        return a24Var.A() || j2 == -9223372036854775807L || f(j) <= j2;
    }
}
