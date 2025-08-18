package defpackage;

/* loaded from: classes.dex */
public final class hzc extends pnf {
    public final ru3 X = new ru3(9, this);
    public final w7c Y;
    public final w7c Z;
    public final long b;
    public final o92 c;
    public final fl2 o;
    public final s35 s0;

    public hzc(ezc ezcVar, long j, o92 o92Var, fl2 fl2Var) {
        this.b = j;
        this.c = o92Var;
        this.o = fl2Var;
        this.Y = (w7c) fl2Var.i;
        w7c w7cVar = (w7c) fl2Var.j;
        this.Z = w7cVar;
        this.s0 = new s35(0);
        od2.L(new zn5(new v7c(ezcVar.a), new fzc(this, null), 5), this.a);
        od2.L(new zn5(new t03(w7cVar, 11), new gzc(this, null), 5), this.a);
    }

    public final void q() {
        this.X.f(false);
        fl2 fl2Var = this.o;
        il2 il2Var = (il2) fl2Var.a;
        il2Var.g = null;
        il2Var.a();
        il2Var.a();
        ((q0e) fl2Var.h).setValue(null);
        ((q0e) fl2Var.g).m(null, qzc.a);
    }

    public final void r(boolean z) {
        this.X.f(true);
        fl2 fl2Var = this.o;
        fl2Var.getClass();
        rzc rzcVar = new rzc(z);
        q0e q0eVar = (q0e) fl2Var.g;
        if (tpa.f(q0eVar.getValue(), rzcVar)) {
            return;
        }
        q0eVar.m(null, rzcVar);
        il2 il2Var = (il2) fl2Var.a;
        j47.T(il2Var.e, null, null, new hl2(il2Var, null), 3);
        il2Var.g = fl2Var;
    }
}
