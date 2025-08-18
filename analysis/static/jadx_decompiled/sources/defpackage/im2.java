package defpackage;

/* loaded from: classes2.dex */
public final class im2 extends pnf {
    public final w7c X;
    public final je7 b;
    public final je7 c;
    public final q0e o;

    public im2() {
        sw9 sw9Var = sw9.a;
        khe kheVarD = sw9Var.getAccessor().d(hp.class);
        this.b = sw9Var.getAccessor().d(pk.class);
        this.c = kheVarD;
        q0e q0eVarA = r0e.a(nz4.a);
        this.o = q0eVarA;
        this.X = new w7c(q0eVarA);
        q0eVarA.setValue(q());
    }

    public final kl7 q() {
        kl7 kl7VarL = j1e.l();
        boolean z = ((kxc) r()).o() != 1;
        boolean z2 = ((kxc) r()).o() == 0;
        boolean z3 = ((kxc) r()).o() == 2;
        kl7VarL.add(new vfd(dea.a, 0, new eqe(eea.a), null, null, null, new ffd(z, true), null, null, 0, null, 1976));
        if (z) {
            kl7VarL.add(new vfd(dea.f, 1, new eqe(eea.e), null, null, null, new efd(z2, true), null, null, 0, null, 1976));
            kl7VarL.add(new vfd(dea.g, 1, new eqe(eea.f), null, null, null, new efd(z3, true), null, null, 0, null, 1976));
        }
        return j1e.d(kl7VarL);
    }

    public final hp r() {
        return (hp) this.c.getValue();
    }

    public final void s(long j) {
        if (j == dea.a) {
            t(((kxc) r()).o() == 1 ? ((kxc) r()).g.getInt("app.notification.chats.show.last", 0) : 1);
        } else if (j == dea.f) {
            t(0);
        } else if (j == dea.g) {
            t(2);
        }
    }

    public final void t(int i) {
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        ((kxc) r()).s(i);
        pk pkVar = (pk) this.b.getValue();
        eaf eafVar = new eaf();
        eafVar.d = str;
        pkVar.a(new gaf(eafVar));
        this.o.setValue(q());
    }
}
