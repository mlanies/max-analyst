package defpackage;

/* loaded from: classes.dex */
public final class i4c extends pnf {
    public final gg1 b;
    public final ir1 c;
    public final w7c o;

    public i4c(gg1 gg1Var, ir1 ir1Var) {
        Object value;
        eqe eqeVar;
        gqe gqeVar;
        this.b = gg1Var;
        this.c = ir1Var;
        q0e q0eVarA = r0e.a(l4c.c);
        this.o = new w7c(q0eVarA);
        do {
            value = q0eVarA.getValue();
            l4c l4cVar = (l4c) value;
            fqa fqaVarD = this.c.d();
            fqa fqaVar = (fqa) ((pqa) ((w7c) this.c.e()).a.getValue()).c.get(this.b);
            eqeVar = tpa.f(fqaVarD.a.getId(), this.b) ? new eqe(b8a.v1) : new eqe(b8a.u1);
            ig1 ig1Var = fqaVarD.a;
            gqeVar = null;
            gqeVar = null;
            if (!tpa.f(ig1Var.getId(), this.b) && ig1Var.m()) {
                int i = b8a.t1;
                String name = fqaVar != null ? fqaVar.b.getName() : null;
                gqeVar = new gqe(i, ys.m0(new Object[]{name == null ? "" : name}));
            }
            l4cVar.getClass();
        } while (!q0eVarA.c(value, new l4c(eqeVar, gqeVar)));
    }
}
