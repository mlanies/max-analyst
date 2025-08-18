package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final /* synthetic */ class u72 implements qj3, xha {
    public final /* synthetic */ long a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ u72(p82 p82Var, long j, cu8 cu8Var, long j2) {
        this.c = p82Var;
        this.a = j;
        this.o = cu8Var;
        this.b = j2;
    }

    @Override // defpackage.xha
    public void I(yha yhaVar) {
        if (yhaVar == yha.X) {
            y0b y0bVar = (y0b) this.c;
            j47.T(y0bVar.d, ((w9a) y0bVar.b).b(), null, new v0b(y0bVar, (e52) this.o, this.a, this.b, null), 2);
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        es8 es8Var;
        u82 u82Var = (u82) obj;
        p82 p82Var = (p82) this.c;
        p82Var.getClass();
        if (u82Var.a == 0) {
            u82Var.a = this.a;
        }
        cu8 cu8Var = (cu8) this.o;
        boolean zX = cu8Var.x();
        long j = this.b;
        if (zX) {
            p82Var.R(j, u82Var, cu8Var);
        }
        e92 e92Var = u82Var.n;
        ng4 ng4Var = cu8Var.T0;
        long j2 = ng4Var != null ? ng4Var.a : cu8Var.o;
        mg4 mg4Var = cu8Var.U0;
        if (e92Var.c(mg4Var) == 0) {
            e92Var.a(new d92(j2, j2), mg4Var);
        } else {
            kpa kpaVarW = hm9.w(e92Var.d(mg4Var));
            d92 d92Var = (d92) kpaVarW.b;
            if (d92Var.b < j2) {
                l7 l7VarC = d92Var.c();
                l7VarC.b(j2);
                e92Var.d(mg4Var).remove(((Integer) kpaVarW.a).intValue());
                e92.e(mg4Var);
                e92Var.a(l7VarC.a(), mg4Var);
            }
        }
        mg4 mg4Var2 = mg4.REGULAR;
        if (mg4Var != mg4Var2) {
            return;
        }
        e52 e52VarC = p82Var.C(j);
        if (e52VarC != null && (es8Var = e52VarC.c) != null && es8Var.a.c < cu8Var.c) {
            p82.l0(u82Var, cu8Var);
        }
        if (e52VarC != null) {
            k92 k92Var = e52VarC.b;
            if (k92Var.x == 0 && k92Var.n.c(mg4Var2) == 0) {
                p82Var.v(j, u82Var, 0L);
            }
        }
        if (e52VarC == null || e52VarC.n() >= cu8Var.k() || e52VarC.b.m != 0) {
            return;
        }
        long jK = p82Var.K();
        Map mapD = u82Var.d();
        if (((Long) u82Var.d().get(Long.valueOf(jK))) != null) {
            mapD.put(Long.valueOf(jK), Long.valueOf(cu8Var.k()));
            u82Var.e = mapD;
        }
    }

    public /* synthetic */ u72(y0b y0bVar, e52 e52Var, long j, long j2) {
        this.c = y0bVar;
        this.o = e52Var;
        this.a = j;
        this.b = j2;
    }
}
