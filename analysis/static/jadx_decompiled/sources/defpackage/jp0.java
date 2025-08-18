package defpackage;

import java.util.concurrent.locks.LockSupport;

/* loaded from: classes.dex */
public final class jp0 extends d0 {
    public final Thread a;
    public final a45 b;

    public jp0(lx3 lx3Var, Thread thread, a45 a45Var) {
        super(lx3Var, true, true);
        this.a = thread;
        this.b = a45Var;
    }

    @Override // defpackage.z87
    public final void afterCompletion(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.a;
        if (tpa.f(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
