package defpackage;

import java.util.Iterator;

/* loaded from: classes.dex */
public final /* synthetic */ class dr implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ je7 b;
    public final /* synthetic */ je7 c;

    public /* synthetic */ dr(je7 je7Var) {
        this.a = 8;
        this.b = iyc.l;
        this.c = je7Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        Object next;
        switch (this.a) {
            case 0:
                return new ao7(this.b, this.c);
            case 1:
                return new ao7(this.b, this.c);
            case 2:
                return f46.a().plus(((w9a) ((kke) this.b.getValue())).b()).plus((lx3) this.c.getValue());
            case 3:
                at5 at5VarA = ((wt2) this.b.getValue()).a();
                tu2 su2Var = at5VarA.b() ? ru2.a : new su2(at5VarA.v0, at5VarA.Y, at5VarA.w0, at5VarA.x0, at5VarA.A0);
                jz2 jz2Var = (jz2) ((yu2) this.c.getValue());
                jz2Var.getClass();
                e52 e52Var = (e52) l6d.c0(jz2Var.h(jz2.i(new at(2, jz2Var.l().E(su2Var.a())), su2Var), su2Var));
                Long lValueOf = e52Var != null ? Long.valueOf(e52Var.a) : null;
                return Long.valueOf(lValueOf != null ? lValueOf.longValue() : -1L);
            case 4:
                at5 at5VarA2 = ((wt2) this.b.getValue()).a();
                tu2 su2Var2 = at5VarA2.b() ? ru2.a : new su2(at5VarA2.v0, at5VarA2.Y, at5VarA2.w0, at5VarA2.x0, at5VarA2.A0);
                jz2 jz2Var2 = (jz2) ((yu2) this.c.getValue());
                jz2Var2.getClass();
                Iterator it = jz2Var2.h(jz2.i(new at(2, jz2Var2.l().E(su2Var2.a())), su2Var2), su2Var2).iterator();
                if (it.hasNext()) {
                    next = it.next();
                    while (it.hasNext()) {
                        next = it.next();
                    }
                } else {
                    next = null;
                }
                e52 e52Var2 = (e52) next;
                Long lValueOf2 = e52Var2 != null ? Long.valueOf(e52Var2.a) : null;
                return Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : -1L);
            case 5:
                return new qe0(this.b, this.c);
            case 6:
                return new qe0(this.b, this.c);
            case 7:
                return j1e.a(pag.a().plus(((w9a) ((kke) this.b.getValue())).a().limitedParallelism(1, "non-contacts")).plus((lx3) this.c.getValue()));
            case 8:
                return new qe0(this.b, this.c);
            case 9:
                return j1e.a(((w9a) ((kke) this.b.getValue())).b().limitedParallelism(1, "shortcuts").plus((lx3) this.c.getValue()));
            default:
                return new xs2(this.b, this.c);
        }
    }

    public /* synthetic */ dr(je7 je7Var, je7 je7Var2, int i) {
        this.a = i;
        this.b = je7Var;
        this.c = je7Var2;
    }

    public /* synthetic */ dr(khe kheVar, je7 je7Var, lt2 lt2Var, int i) {
        this.a = i;
        this.b = kheVar;
        this.c = je7Var;
    }
}
