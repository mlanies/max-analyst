package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class b55 extends AtomicBoolean implements Runnable, zl4 {
    public final Runnable a;

    public b55(Runnable runnable) {
        this.a = runnable;
    }

    @Override // defpackage.zl4
    public final void g() {
        lazySet(true);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (get()) {
            return;
        }
        try {
            this.a.run();
        } finally {
        }
    }
}
