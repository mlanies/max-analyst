package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class qoe extends cx7 implements hg4 {
    public final poe a;

    public qoe(cx7 cx7Var) {
        this.a = new poe(cx7Var);
    }

    @Override // defpackage.hg4
    public final Object delay(long j, Continuation continuation) {
        return c37.j(this, j, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        ((nx3) this.a.a()).mo20dispatch(lx3Var, runnable);
    }

    @Override // defpackage.nx3
    public final void dispatchYield(lx3 lx3Var, Runnable runnable) {
        ((nx3) this.a.a()).dispatchYield(lx3Var, runnable);
    }

    @Override // defpackage.cx7
    public final cx7 getImmediate() {
        cx7 immediate;
        Object objA = this.a.a();
        cx7 cx7Var = objA instanceof cx7 ? (cx7) objA : null;
        return (cx7Var == null || (immediate = cx7Var.getImmediate()) == null) ? this : immediate;
    }

    @Override // defpackage.hg4
    public final cm4 invokeOnTimeout(long j, Runnable runnable, lx3 lx3Var) {
        Object objA = this.a.a();
        hg4 hg4Var = objA instanceof hg4 ? (hg4) objA : null;
        if (hg4Var == null) {
            hg4Var = qa4.a;
        }
        return hg4Var.invokeOnTimeout(j, runnable, lx3Var);
    }

    @Override // defpackage.nx3
    public final boolean isDispatchNeeded(lx3 lx3Var) {
        return ((nx3) this.a.a()).isDispatchNeeded(lx3Var);
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay */
    public final void mo21scheduleResumeAfterDelay(long j, ry1 ry1Var) {
        Object objA = this.a.a();
        hg4 hg4Var = objA instanceof hg4 ? (hg4) objA : null;
        if (hg4Var == null) {
            hg4Var = qa4.a;
        }
        hg4Var.mo21scheduleResumeAfterDelay(j, ry1Var);
    }
}
