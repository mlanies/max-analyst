package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class duc extends y45 {
    public final rx3 a;

    public duc(int i, int i2, long j) {
        String str = joe.a;
        this.a = new rx3(i, i2, j);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        rx3.o(this.a, runnable, false, 6);
    }

    @Override // defpackage.nx3
    public final void dispatchYield(lx3 lx3Var, Runnable runnable) {
        rx3.o(this.a, runnable, true, 2);
    }

    @Override // defpackage.y45
    public final Executor n() {
        return this.a;
    }
}
