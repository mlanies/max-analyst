package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;

/* loaded from: classes.dex */
public final class i47 extends AbstractOwnableSynchronizer implements Runnable {
    public final d3f a;

    public i47(d3f d3fVar) {
        this.a = d3fVar;
    }

    public static void a(i47 i47Var, Thread thread) {
        i47Var.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
