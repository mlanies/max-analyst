package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class o8d extends g9d {
    public final String A0;
    public final List B0;
    public final long z0;

    public o8d(n8d n8dVar) {
        super(n8dVar);
        this.z0 = n8dVar.l;
        this.A0 = n8dVar.m;
        this.B0 = n8dVar.n;
    }

    @Override // defpackage.g9d, defpackage.d8d
    public final void x() {
        cu8 cu8VarQ;
        e52 e52VarC = b().C(this.c);
        if (e52VarC == null || (cu8VarQ = n().q(this.z0)) == null) {
            return;
        }
        vx8 vx8Var = vx8.DELETED;
        vx8 vx8Var2 = cu8VarQ.v0;
        if (vx8Var2 == vx8Var) {
            return;
        }
        n().x(cu8VarQ, iu8.X);
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ((bv4) e8dVar.q.getValue()).a(this.z0, this.c, this.A0, this.B0, vx8.EDITED, null, false);
        ((k4a) a()).C(this.c, this.z0, e52VarC.b.a, cu8VarQ.c, this.A0, cu8VarQ.s0, vx8Var2, cu8VarQ.n() ? (List) cu8VarQ.z0.a : null, false, cu8VarQ.R0);
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        bu8 bu8Var = new bu8();
        String str = this.A0;
        if (!oag.t(str)) {
            bu8Var.g = str;
        }
        List list = this.B0;
        if (!list.isEmpty()) {
            bu8Var.F = list;
        }
        bu8Var.H = this.y0;
        return bu8Var;
    }
}
