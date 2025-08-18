package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class eb3 extends AtomicReference implements zl4 {
    public final ab3 a;

    public eb3(ab3 ab3Var, fb3 fb3Var) {
        this.a = ab3Var;
        lazySet(fb3Var);
    }

    @Override // defpackage.zl4
    public final void g() {
        fb3 fb3Var = (fb3) getAndSet(null);
        if (fb3Var != null) {
            fb3Var.m(this);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == null;
    }
}
