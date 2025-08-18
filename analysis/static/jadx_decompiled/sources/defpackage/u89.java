package defpackage;

/* loaded from: classes2.dex */
public final class u89 extends pnf {
    public final s35 X;
    public final hp b;
    public final q0e c;
    public final w7c o;

    public u89(hp hpVar) {
        this.b = hpVar;
        q0e q0eVarA = r0e.a(nz4.a);
        this.c = q0eVarA;
        this.o = new w7c(q0eVarA);
        this.X = new s35(0);
        q();
    }

    public final void q() {
        kl7 kl7VarL = j1e.l();
        kl7VarL.add(new vfd(Long.MAX_VALUE, 0, new eqe(vda.a), null, null, null, new ffd(((jp) this.b).g.getBoolean("app.messages.send.by.enter", false), true), null, null, 0, null, 1976));
        kl7VarL.add(new vfd(9223372036854775806L, 0, new eqe(vda.b), null, null, null, cfd.a, null, null, 0, null, 1976));
        kl7 kl7VarD = j1e.d(kl7VarL);
        this.c.setValue(kl7VarD);
        String name = u89.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, zr6.h(kl7VarD.getSize(), "process sections. finish, size:"), null);
        }
    }
}
