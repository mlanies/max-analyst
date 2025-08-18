package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class t0a extends AtomicReference implements zl4 {
    public final f2a a;

    public t0a(f2a f2aVar, u0a u0aVar) {
        this.a = f2aVar;
        lazySet(u0aVar);
    }

    @Override // defpackage.zl4
    public final void g() {
        u0a u0aVar = (u0a) getAndSet(null);
        if (u0aVar != null) {
            u0aVar.a(this);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == null;
    }
}
