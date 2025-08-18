package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class wpb extends AtomicBoolean implements zl4 {
    public final f2a a;
    public final xpb b;

    public wpb(f2a f2aVar, xpb xpbVar) {
        this.a = f2aVar;
        this.b = xpbVar;
    }

    @Override // defpackage.zl4
    public final void g() {
        if (compareAndSet(false, true)) {
            this.b.z(this);
        }
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get();
    }
}
