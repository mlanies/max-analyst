package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class wrd extends AtomicReference implements zl4 {
    public final erd a;

    public wrd(erd erdVar, xrd xrdVar) {
        this.a = erdVar;
        lazySet(xrdVar);
    }

    @Override // defpackage.zl4
    public final void g() {
        xrd xrdVar = (xrd) getAndSet(null);
        if (xrdVar != null) {
            xrdVar.o(this);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == null;
    }
}
