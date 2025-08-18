package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class n0a extends AtomicReference implements zl4, Runnable {
    public final f2a a;
    public long b;

    public n0a(f2a f2aVar) {
        this.a = f2aVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        dm4.a(this);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == dm4.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get() != dm4.a) {
            long j = this.b;
            this.b = 1 + j;
            this.a.e(Long.valueOf(j));
        }
    }
}
