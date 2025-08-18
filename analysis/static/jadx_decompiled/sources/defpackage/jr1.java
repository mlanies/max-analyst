package defpackage;

/* loaded from: classes.dex */
public final class jr1 implements sx3 {
    public final khe a;

    public jr1(je7 je7Var, je7 je7Var2) {
        this.a = new khe(new dr(je7Var, je7Var2, 2));
    }

    @Override // defpackage.sx3
    public final lx3 getCoroutineContext() {
        return (lx3) this.a.getValue();
    }
}
