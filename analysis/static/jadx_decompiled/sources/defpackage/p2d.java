package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p2d extends l2d {
    public final pkg j;
    public final pkg k;
    public final long l;

    public p2d(q4c q4cVar, long j, long j2, long j3, long j4, long j5, List list, long j6, pkg pkgVar, pkg pkgVar2, long j7, long j8) {
        super(q4cVar, j, j2, j3, j5, list, j6, j7, j8);
        this.j = pkgVar;
        this.k = pkgVar2;
        this.l = j4;
    }

    @Override // defpackage.v2d
    public final q4c a(khc khcVar) {
        pkg pkgVar = this.j;
        if (pkgVar == null) {
            return (q4c) this.c;
        }
        oy5 oy5Var = khcVar.a;
        return new q4c(0L, pkgVar.a(oy5Var.s0, 0L, 0L, oy5Var.a), -1L);
    }

    @Override // defpackage.l2d
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

    @Override // defpackage.l2d
    public final q4c i(long j, khc khcVar) {
        long j2 = this.d;
        List list = this.f;
        long j3 = list != null ? ((r2d) list.get((int) (j - j2))).a : (j - j2) * this.e;
        oy5 oy5Var = khcVar.a;
        return new q4c(0L, this.k.a(oy5Var.s0, j, j3, oy5Var.a), -1L);
    }
}
