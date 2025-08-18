package defpackage;

/* loaded from: classes.dex */
public final class cp4 implements lx3 {
    public final /* synthetic */ lx3 a;
    public final Throwable b;

    public cp4(lx3 lx3Var, Throwable th) {
        this.a = lx3Var;
        this.b = th;
    }

    @Override // defpackage.lx3
    public final Object fold(Object obj, a66 a66Var) {
        return this.a.fold(obj, a66Var);
    }

    @Override // defpackage.lx3
    public final jx3 get(kx3 kx3Var) {
        return this.a.get(kx3Var);
    }

    @Override // defpackage.lx3
    public final lx3 minusKey(kx3 kx3Var) {
        return this.a.minusKey(kx3Var);
    }

    @Override // defpackage.lx3
    public final lx3 plus(lx3 lx3Var) {
        return this.a.plus(lx3Var);
    }
}
