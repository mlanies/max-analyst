package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class kqd extends AtomicBoolean implements zl4 {
    public final erd a;
    public final lqd b;

    public kqd(erd erdVar, lqd lqdVar) {
        this.a = erdVar;
        this.b = lqdVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.o(this);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get();
    }
}
