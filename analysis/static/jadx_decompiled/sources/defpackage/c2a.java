package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class c2a extends AtomicReference implements zl4, Runnable {
    public final f2a a;

    public c2a(f2a f2aVar) {
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
        if (h()) {
            return;
        }
        f2a f2aVar = this.a;
        f2aVar.e(0L);
        lazySet(iz4.a);
        f2aVar.b();
    }
}
