package defpackage;

/* loaded from: classes2.dex */
public final class snf implements dh3 {
    public final m56 a;
    public final je7 b;
    public final kld c;
    public final v7c o;

    public snf(je7 je7Var, m56 m56Var) {
        this.a = m56Var;
        this.b = je7Var;
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.c = kldVarB;
        this.o = new v7c(kldVarB);
    }

    public final x77 a(sx3 sx3Var, lx3 lx3Var, vx3 vx3Var, a66 a66Var) {
        return j47.S(sx3Var, lx3Var, vx3Var, new rnf(this, a66Var, null));
    }

    @Override // defpackage.dh3
    public final v7c f() {
        return this.o;
    }
}
