package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class pl4 implements Executor {
    public final nx3 a;

    public pl4(nx3 nx3Var) {
        this.a = nx3Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        hz4 hz4Var = hz4.a;
        nx3 nx3Var = this.a;
        if (nx3Var.isDispatchNeeded(hz4Var)) {
            nx3Var.mo20dispatch(hz4Var, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        return this.a.toString();
    }
}
