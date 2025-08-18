package defpackage;

import androidx.work.WorkRequest;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class uc4 implements v1d {
    public final /* synthetic */ vc4 a;

    public uc4(vc4 vc4Var) {
        this.a = vc4Var;
    }

    @Override // defpackage.v1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.v1d
    public final t1d e(long j) {
        vc4 vc4Var = this.a;
        BigInteger bigIntegerValueOf = BigInteger.valueOf((((a9e) vc4Var.x0).f * j) / 1000000);
        long j2 = vc4Var.c;
        long j3 = vc4Var.b;
        z1d z1dVar = new z1d(j, oaf.k((bigIntegerValueOf.multiply(BigInteger.valueOf(j2 - j3)).divide(BigInteger.valueOf(vc4Var.X)).longValue() + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, vc4Var.b, j2 - 1));
        return new t1d(z1dVar, z1dVar);
    }

    @Override // defpackage.v1d
    public final long f() {
        return (this.a.X * 1000000) / ((a9e) r5.x0).f;
    }
}
