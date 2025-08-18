package defpackage;

import kotlinx.coroutines.internal.MainDispatcherLoader;

/* loaded from: classes.dex */
public final class vra extends nx3 {
    public final jl4 a = new jl4();

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        jl4 jl4Var = this.a;
        jl4Var.getClass();
        jd4 jd4Var = ql4.a;
        cx7 immediate = MainDispatcherLoader.dispatcher.getImmediate();
        if (!immediate.isDispatchNeeded(lx3Var)) {
            if (!(jl4Var.b || !jl4Var.a)) {
                if (!jl4Var.d.offer(runnable)) {
                    throw new IllegalStateException("cannot enqueue any more runnables".toString());
                }
                jl4Var.a();
                return;
            }
        }
        immediate.mo20dispatch(lx3Var, new wt1(jl4Var, 29, runnable));
    }

    @Override // defpackage.nx3
    public final boolean isDispatchNeeded(lx3 lx3Var) {
        jd4 jd4Var = ql4.a;
        if (MainDispatcherLoader.dispatcher.getImmediate().isDispatchNeeded(lx3Var)) {
            return true;
        }
        jl4 jl4Var = this.a;
        return !(jl4Var.b || !jl4Var.a);
    }
}
