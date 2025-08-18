package defpackage;

/* loaded from: classes.dex */
public final class b5f extends wk0 {
    public final /* synthetic */ c5f a;

    public b5f(c5f c5fVar) {
        this.a = c5fVar;
    }

    @Override // defpackage.xae
    public final void cancel() {
        if (this.a.s0) {
            return;
        }
        this.a.s0 = true;
        Runnable runnable = (Runnable) this.a.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        this.a.Z.lazySet(null);
        if (this.a.u0.getAndIncrement() == 0) {
            this.a.Z.lazySet(null);
            c5f c5fVar = this.a;
            if (c5fVar.w0) {
                return;
            }
            c5fVar.b.clear();
        }
    }

    @Override // defpackage.dqd
    public final void clear() {
        this.a.b.clear();
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.a.b.isEmpty();
    }

    @Override // defpackage.xae
    public final void j(long j) {
        if (zae.d(j)) {
            c5f c5fVar = this.a;
            ngg.b(c5fVar.v0, j);
            c5fVar.i();
        }
    }

    @Override // defpackage.uqb
    public final int n(int i) {
        this.a.w0 = true;
        return 2;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        return this.a.b.poll();
    }
}
