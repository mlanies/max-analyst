package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class mld extends p3 {
    public long a;
    public sy1 b;

    @Override // defpackage.p3
    public final boolean a(o3 o3Var) {
        kld kldVar = (kld) o3Var;
        if (this.a >= 0) {
            return false;
        }
        long j = kldVar.t0;
        if (j < kldVar.u0) {
            kldVar.u0 = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.p3
    public final Continuation[] b(o3 o3Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((kld) o3Var).y(j);
    }
}
