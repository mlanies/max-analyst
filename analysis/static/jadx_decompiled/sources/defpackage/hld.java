package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class hld implements cm4 {
    public final kld a;
    public final long b;
    public final Object c;
    public final Continuation o;

    public hld(kld kldVar, long j, Object obj, sy1 sy1Var) {
        this.a = kldVar;
        this.b = j;
        this.c = obj;
        this.o = sy1Var;
    }

    @Override // defpackage.cm4
    public final void dispose() {
        kld kldVar = this.a;
        synchronized (kldVar) {
            if (this.b < kldVar.s()) {
                return;
            }
            Object[] objArr = kldVar.s0;
            if (lld.c(objArr, this.b) != this) {
                return;
            }
            lld.d(objArr, this.b, lld.a);
            kldVar.n();
        }
    }
}
