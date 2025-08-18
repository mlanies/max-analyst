package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class lsc extends AtomicInteger implements vqb {
    public final Object a;
    public final vae b;

    public lsc(vae vaeVar, Object obj) {
        this.b = vaeVar;
        this.a = obj;
    }

    @Override // defpackage.xae
    public final void cancel() {
        lazySet(2);
    }

    @Override // defpackage.dqd
    public final void clear() {
        lazySet(1);
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return get() != 0;
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j) && compareAndSet(0, 1)) {
            Object obj = this.a;
            vae vaeVar = this.b;
            vaeVar.e(obj);
            if (get() != 2) {
                vaeVar.b();
            }
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        return 1;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // defpackage.dqd
    public final Object poll() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.a;
    }
}
