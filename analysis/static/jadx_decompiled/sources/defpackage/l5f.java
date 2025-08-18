package defpackage;

import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* loaded from: classes.dex */
public final class l5f extends nx3 {
    public static final l5f a = new l5f();

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        jd4 jd4Var = jd4.b;
        jd4Var.a.n(runnable, joe.h, false);
    }

    @Override // defpackage.nx3
    public final void dispatchYield(lx3 lx3Var, Runnable runnable) {
        jd4 jd4Var = jd4.b;
        jd4Var.a.n(runnable, joe.h, true);
    }

    @Override // defpackage.nx3
    public final nx3 limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= joe.d ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // defpackage.nx3
    /* renamed from: toString */
    public final String getName() {
        return "Dispatchers.IO";
    }
}
