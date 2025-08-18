package defpackage;

/* loaded from: classes.dex */
public final class k43 implements AutoCloseable, sx3 {
    public final lx3 a;

    public k43(lx3 lx3Var) {
        this.a = lx3Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        pag.d(this.a);
    }

    @Override // defpackage.sx3
    public final lx3 getCoroutineContext() {
        return this.a;
    }
}
