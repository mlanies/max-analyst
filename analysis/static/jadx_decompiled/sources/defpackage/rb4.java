package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

/* loaded from: classes.dex */
public final class rb4 extends y45 implements Executor {
    public static final rb4 a = new rb4();
    public static final nx3 b;

    static {
        l5f l5fVar = l5f.a;
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        b = nx3.limitedParallelism$default(l5fVar, SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", 64 < available_processors ? available_processors : 64, 0, 0, 12, (Object) null), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        b.mo20dispatch(lx3Var, runnable);
    }

    @Override // defpackage.nx3
    public final void dispatchYield(lx3 lx3Var, Runnable runnable) {
        b.dispatchYield(lx3Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo20dispatch(hz4.a, runnable);
    }

    @Override // defpackage.nx3
    public final nx3 limitedParallelism(int i, String str) {
        return l5f.a.limitedParallelism(i, str);
    }

    @Override // defpackage.y45
    public final Executor n() {
        return this;
    }

    @Override // defpackage.nx3
    public final String toString() {
        return "Dispatchers.IO";
    }
}
