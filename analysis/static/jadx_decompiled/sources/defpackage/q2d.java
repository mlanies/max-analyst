package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class q2d extends m2d {
    public final pl8 j;
    public final pl8 k;
    public final long l;

    public q2d(r4c r4cVar, long j, long j2, long j3, long j4, long j5, List list, long j6, pl8 pl8Var, pl8 pl8Var2, long j7, long j8) {
        super(r4cVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = pl8Var;
        this.k = pl8Var2;
        this.l = j4;
    }

    @Override // defpackage.v2d
    public final r4c b(lhc lhcVar) {
        pl8 pl8Var = this.j;
        if (pl8Var == null) {
            return (r4c) this.c;
        }
        qy5 qy5Var = lhcVar.a;
        return new r4c(0L, pl8Var.i(qy5Var.i, 0L, 0L, qy5Var.a), -1L);
    }

    @Override // defpackage.m2d
    public final long e(long j) {
        if (this.f != null) {
            return r0.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger bigIntegerMultiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.a));
        BigInteger bigIntegerMultiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = dm0.a;
        return new BigDecimal(bigIntegerMultiply).divide(new BigDecimal(bigIntegerMultiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.m2d
    public final r4c i(long j, lhc lhcVar) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((s2d) list.get((int) (j - j2))).a : (j - j2) * this.e;
        qy5 qy5Var = lhcVar.a;
        return new r4c(0L, this.k.i(qy5Var.i, j, j3, qy5Var.a), -1L);
    }
}
