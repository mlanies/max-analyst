package defpackage;

/* loaded from: classes.dex */
public final class n45 implements ox3 {
    public final /* synthetic */ m45 a = m45.a;

    public final boolean equals(Object obj) {
        return (obj instanceof n45) || (obj instanceof m45);
    }

    @Override // defpackage.lx3
    public Object fold(Object obj, a66 a66Var) {
        return this.a.fold(obj, a66Var);
    }

    @Override // defpackage.ox3
    public void g(lx3 lx3Var, Throwable th) {
        this.a.getClass();
        synchronized (m45.b) {
        }
    }

    @Override // defpackage.lx3
    public jx3 get(kx3 kx3Var) {
        return this.a.get(kx3Var);
    }

    @Override // defpackage.jx3
    public kx3 getKey() {
        return this.a.getKey();
    }

    public final int hashCode() {
        return m45.a.hashCode();
    }

    @Override // defpackage.lx3
    public lx3 minusKey(kx3 kx3Var) {
        return this.a.minusKey(kx3Var);
    }

    @Override // defpackage.lx3
    public lx3 plus(lx3 lx3Var) {
        return this.a.plus(lx3Var);
    }
}
