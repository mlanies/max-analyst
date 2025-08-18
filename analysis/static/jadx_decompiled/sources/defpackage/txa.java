package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class txa extends pnf {
    public final w7c X;
    public final q0e Y;
    public final w7c Z;
    public final sya b;
    public final qza c;
    public final q0e o;
    public final s35 s0;
    public final q0e t0;
    public final w7c u0;

    public txa(Set set, sya syaVar, qza qzaVar, kke kkeVar) {
        this.b = syaVar;
        this.c = qzaVar;
        q0e q0eVarA = r0e.a(oz4.a);
        this.o = q0eVarA;
        this.X = new w7c(q0eVarA);
        q0e q0eVarA2 = r0e.a(set);
        this.Y = q0eVarA2;
        this.Z = new w7c(q0eVarA2);
        this.s0 = new s35(0);
        lld.b(0, Integer.MAX_VALUE, 0, 4);
        q0e q0eVarA3 = r0e.a("");
        this.t0 = q0eVarA3;
        mn5 mn5VarX = od2.x(od2.u(q0eVarA3, 200L));
        Object value = q0eVarA3.getValue();
        this.u0 = od2.X(mn5VarX, this.a, wld.a, value);
        od2.L(od2.F(od2.M(q0eVarA2, new sxa(this, null)), ((w9a) kkeVar).b()), this.a);
        qzaVar.c(this.a);
    }

    @Override // defpackage.pnf
    public final void p() {
        this.c.a();
    }

    public final void q(long j, fza fzaVar) {
        q0e q0eVar = this.Y;
        Set setG0 = x53.G0((Iterable) q0eVar.getValue());
        boolean zRemove = setG0.remove(Long.valueOf(j));
        qza qzaVar = this.c;
        if (zRemove) {
            qzaVar.e(j);
        } else {
            setG0.add(Long.valueOf(j));
            if (fzaVar != null) {
                qzaVar.b(new gza(j, fzaVar));
            } else {
                qzaVar.getClass();
            }
        }
        q0eVar.m(null, setG0);
    }
}
