package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public abstract class l2d extends v2d {
    public final long d;
    public final long e;
    public final List f;
    public final long g;
    public final long h;
    public final long i;

    public l2d(q4c q4cVar, long j, long j2, long j3, long j4, List list, long j5, long j6, long j7) {
        super(q4cVar, j, j2);
        this.d = j3;
        this.e = j4;
        this.f = list;
        this.i = j5;
        this.g = j6;
        this.h = j7;
    }

    public final long c(long j, long j2) {
        long jE = e(j);
        return jE != -1 ? jE : (int) (g((j2 - this.h) + this.i, j) - d(j, j2));
    }

    public final long d(long j, long j2) {
        long jE = e(j);
        long j3 = this.d;
        if (jE == -1) {
            long j4 = this.g;
            if (j4 != -9223372036854775807L) {
                return Math.max(j3, g((j2 - this.h) - j4, j));
            }
        }
        return j3;
    }

    public abstract long e(long j);

    public final long f(long j, long j2) {
        long j3 = this.a;
        long j4 = this.d;
        List list = this.f;
        if (list != null) {
            return (((r2d) list.get((int) (j - j4))).b * 1000000) / j3;
        }
        long jE = e(j2);
        return (jE == -1 || j != (j4 + jE) - 1) ? (this.e * 1000000) / j3 : j2 - h(j);
    }

    public final long g(long j, long j2) {
        long jE = e(j2);
        long j3 = this.d;
        if (jE == 0) {
            return j3;
        }
        if (this.f == null) {
            long j4 = (j / ((this.e * 1000000) / this.a)) + j3;
            return j4 < j3 ? j3 : jE == -1 ? j4 : Math.min(j4, (j3 + jE) - 1);
        }
        long j5 = (jE + j3) - 1;
        long j6 = j3;
        while (j6 <= j5) {
            long j7 = ((j5 - j6) / 2) + j6;
            long jH = h(j7);
            if (jH < j) {
                j6 = j7 + 1;
            } else {
                if (jH <= j) {
                    return j7;
                }
                j5 = j7 - 1;
            }
        }
        return j6 == j3 ? j6 : j5;
    }

    public final long h(long j) {
        long j2 = this.d;
        List list = this.f;
        return maf.J(list != null ? ((r2d) list.get((int) (j - j2))).a - this.b : (j - j2) * this.e, 1000000L, this.a);
    }

    public abstract q4c i(long j, khc khcVar);

    public boolean j() {
        return this.f != null;
    }
}
