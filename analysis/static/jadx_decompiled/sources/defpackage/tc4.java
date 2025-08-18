package defpackage;

import androidx.work.WorkRequest;

/* loaded from: classes.dex */
public final class tc4 implements u1d {
    public final /* synthetic */ vc4 a;

    public tc4(vc4 vc4Var) {
        this.a = vc4Var;
    }

    @Override // defpackage.u1d
    public final boolean c() {
        return true;
    }

    @Override // defpackage.u1d
    public final s1d e(long j) {
        vc4 vc4Var = this.a;
        long j2 = vc4Var.c;
        long j3 = vc4Var.b;
        y1d y1dVar = new y1d(j, maf.k(((((j2 - j3) * ((((a9e) vc4Var.x0).f * j) / 1000000)) / vc4Var.X) + j3) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, j3, j2 - 1));
        return new s1d(y1dVar, y1dVar);
    }

    @Override // defpackage.u1d
    public final long f() {
        return (this.a.X * 1000000) / ((a9e) r5.x0).f;
    }
}
