package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w6 extends AtomicReference implements zl4 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6(int i, Object obj) {
        super(obj);
        this.a = i;
    }

    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    ((f6) obj).run();
                    return;
                } catch (Throwable th) {
                    throw q45.f(th);
                }
            default:
                ((Runnable) obj).run();
                return;
        }
    }

    @Override // defpackage.zl4
    public final void g() {
        Object andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        a(andSet);
    }

    @Override // defpackage.zl4
    public final boolean h() {
        return get() == null;
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        switch (this.a) {
            case 0:
                return "ActionDisposable(disposed=" + h() + ", " + get() + ")";
            default:
                return "RunnableDisposable(disposed=" + h() + ", " + get() + ")";
        }
    }
}
