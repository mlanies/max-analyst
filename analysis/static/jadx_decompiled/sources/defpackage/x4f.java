package defpackage;

/* loaded from: classes.dex */
public final class x4f extends nx3 {
    public static final x4f a = new x4f();

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public final void mo20dispatch(lx3 lx3Var, Runnable runnable) {
        u9g u9gVar = (u9g) lx3Var.get(u9g.b);
        if (u9gVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        u9gVar.a = true;
    }

    @Override // defpackage.nx3
    public final boolean isDispatchNeeded(lx3 lx3Var) {
        return false;
    }

    @Override // defpackage.nx3
    public final nx3 limitedParallelism(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // defpackage.nx3
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
