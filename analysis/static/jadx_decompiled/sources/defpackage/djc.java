package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes.dex */
public final class djc implements gbd, qu7 {
    public final je7 a;
    public final je7 b;
    public final ContextScope c;
    public final q0e o = r0e.a(0);
    public final String X = "RestoreScheduledTaskExecutor";

    public djc(je7 je7Var, je7 je7Var2, kke kkeVar, ox3 ox3Var) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = j1e.a(((w9a) kkeVar).a().limitedParallelism(1, "restore-tasks-on-connect").plus(ox3Var));
    }

    @Override // defpackage.qu7
    public final void a() {
    }

    @Override // defpackage.gbd
    public final void c(int i) {
        this.o.m(null, Integer.valueOf(i));
    }
}
