package defpackage;

import org.apache.http.HttpStatus;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class k01 extends pnf implements zl1 {
    public final je7 X;
    public final je7 Y;
    public final q0e Z;
    public final ir1 b;
    public final je7 c;
    public final je7 o;
    public final w7c s0;
    public final s35 t0;

    public k01(je7 je7Var, ir1 ir1Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.b = ir1Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var;
        this.Y = je7Var4;
        q0e q0eVarA = r0e.a(nz4.a);
        this.Z = q0eVarA;
        this.s0 = new w7c(q0eVarA);
        this.t0 = new s35(0);
        ez0 ez0Var = (ez0) je7Var2.getValue();
        ez0Var.getClass();
        r((aa) ((yz0) ez0Var).F0.getValue());
        od2.L(new zn5(((yz0) ((ez0) je7Var2.getValue())).D0, new i01(this, null), 5), this.a);
        od2.L(new zn5(((yz0) ((ez0) je7Var2.getValue())).F0, new j01(this, null), 5), this.a);
        ((wr1) ((kr1) je7Var.getValue())).d(this);
    }

    @Override // defpackage.zl1
    public final void i() {
        pnf.o(this.t0, aj1.D);
    }

    public final ez0 q() {
        return (ez0) this.c.getValue();
    }

    public final void r(aa aaVar) {
        k01 k01Var = this;
        while (true) {
            q0e q0eVar = k01Var.Z;
            Object value = q0eVar.getValue();
            kl7 kl7VarL = j1e.l();
            eqe eqeVar = new eqe(b8a.t);
            int i = z7a.c;
            kl7VarL.add(new f01(0, eqeVar));
            kl7VarL.add(new e01(1, new eqe(b8a.f), 0, y7a.a, null, new ffd(aaVar.b, true), Integer.valueOf(x7a.h), HttpStatus.SC_NOT_MODIFIED));
            kl7VarL.add(new e01(2, new eqe(b8a.h), 0, y7a.h, null, new ffd(aaVar.c, true), Integer.valueOf(x7a.k), HttpStatus.SC_NOT_MODIFIED));
            je7 je7Var = k01Var.o;
            se5 se5Var = (se5) ((qe5) je7Var.getValue());
            se5Var.getClass();
            if (se5Var.n(PmsKey.gsse, false)) {
                kl7VarL.add(new e01(2, new eqe(b8a.y), 0, y7a.j, null, new ffd(aaVar.d, true), Integer.valueOf(x7a.t), HttpStatus.SC_NOT_MODIFIED));
            }
            se5 se5Var2 = (se5) ((qe5) je7Var.getValue());
            se5Var2.getClass();
            if (se5Var2.n(PmsKey.grse, false)) {
                kl7VarL.add(new e01(3, new eqe(b8a.w), 0, y7a.i, null, new ffd(aaVar.e, true), Integer.valueOf(x7a.l), HttpStatus.SC_NOT_MODIFIED));
            }
            kl7VarL.add(new g01(new eqe(b8a.u)));
            se5 se5Var3 = (se5) ((qe5) je7Var.getValue());
            se5Var3.getClass();
            if (se5Var3.n(PmsKey.gcwre, false)) {
                kl7VarL.add(new f01(1, new eqe(b8a.j)));
                kl7VarL.add(new e01(4, new eqe(b8a.A), 1, y7a.k, new eqe(b8a.B), new ffd(aaVar.g, true), Integer.valueOf(x7a.I0), 272));
            }
            if (q0eVar.c(value, j1e.d(kl7VarL))) {
                return;
            } else {
                k01Var = this;
            }
        }
    }
}
