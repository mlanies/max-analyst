package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes.dex */
public final class m67 extends k87 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(m67.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile = 0;
    public final m56 b;

    public m67(m56 m56Var) {
        this.b = m56Var;
    }

    @Override // defpackage.k87
    public final boolean c() {
        return true;
    }

    @Override // defpackage.k87
    public final void d(Throwable th) {
        if (c.compareAndSet(this, 0, 1)) {
            this.b.invoke(th);
        }
    }
}
