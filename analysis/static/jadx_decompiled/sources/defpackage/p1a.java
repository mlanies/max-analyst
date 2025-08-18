package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p1a extends AtomicInteger implements tqb, Runnable {
    public final f2a a;
    public final Object b;

    public p1a(f2a f2aVar, Object obj) {
        this.a = f2aVar;
        this.b = obj;
    }

    @Override // defpackage.dqd
    public final void clear() {
        lazySet(3);
    }

    @Override // defpackage.zl4
    public final void g() {
        set(3);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == 3;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return get() != 1;
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        lazySet(1);
        return 1;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.dqd
    public final Object poll() {
        if (get() != 1) {
            return null;
        }
        lazySet(3);
        return this.b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() == 0 && compareAndSet(0, 2)) {
            Object obj = this.b;
            f2a f2aVar = this.a;
            f2aVar.e(obj);
            if (get() == 2) {
                lazySet(3);
                f2aVar.b();
            }
        }
    }
}
