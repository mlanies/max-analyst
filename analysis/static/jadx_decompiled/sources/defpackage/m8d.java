package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class m8d extends e9d {
    public final long D0;

    public m8d(l8d l8dVar) {
        super(l8dVar);
        this.D0 = l8dVar.p;
    }

    @Override // defpackage.g9d, defpackage.d8d
    public final void x() {
        e52 e52VarC = b().C(this.c);
        if (e52VarC == null) {
            return;
        }
        au8 au8VarN = n();
        long j = this.D0;
        cu8 cu8VarQ = au8VarN.q(j);
        if (cu8VarQ != null) {
            vx8 vx8Var = vx8.DELETED;
            vx8 vx8Var2 = cu8VarQ.v0;
            if (vx8Var2 == vx8Var) {
                return;
            }
            n().x(cu8VarQ, iu8.X);
            k8g k8gVar = y().n;
            List list = k8gVar != null ? (List) k8gVar.a : null;
            if (list == null) {
                list = nz4.a;
            }
            List list2 = list;
            e8d e8dVar = this.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            ((bv4) e8dVar.q.getValue()).a(this.D0, this.c, this.z0, this.A0, vx8.EDITED, list2, true);
            ((k4a) a()).C(this.c, this.D0, e52VarC.b.a, cu8VarQ.c, this.z0, cu8VarQ.s0, vx8Var2, cu8VarQ.n() ? (List) cu8VarQ.z0.a : null, true, cu8VarQ.R0);
            cu8 cu8VarQ2 = n().q(j);
            if (cu8VarQ2 != null) {
                int size = this.B0.size();
                for (int i = 0; i < size; i++) {
                    if (!(this.B0.get(i) instanceof k00)) {
                        o2 o2Var = (o2) this.B0.get(i);
                        String str = cu8VarQ2.z0.h(i).r;
                        e8d e8dVar2 = this.a;
                        if (e8dVar2 == null) {
                            e8dVar2 = null;
                        }
                        ((dg5) e8dVar2.b.getValue()).c(o2Var, this.D0, e52VarC.a, str);
                    }
                }
            }
        }
    }

    @Override // defpackage.e9d, defpackage.g9d
    public final bu8 y() throws Throwable {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(this.B0.size());
        for (o2 o2Var : this.B0) {
            e8d e8dVar = this.a;
            if (e8dVar == null) {
                e8dVar = null;
            }
            lpa lpaVarB = ((s9b) e8dVar.B.getValue()).b(o2Var, this.C0);
            if (lpaVarB != null) {
                o2 o2Var2 = (o2) lpaVarB.a;
                l20 l20Var = (l20) lpaVarB.b;
                if (o2Var2 != null && l20Var != null) {
                    arrayList2.add(o2Var2);
                    arrayList.add(l20Var);
                }
            }
        }
        this.B0 = arrayList2;
        m20 m20Var = new m20();
        m20Var.a = arrayList;
        k8g k8gVarC = m20Var.c();
        bu8 bu8Var = new bu8();
        bu8Var.n = k8gVarC;
        String str = this.z0;
        if (!oag.t(str)) {
            bu8Var.g = str;
        }
        List list = this.A0;
        if (list != null && !list.isEmpty()) {
            bu8Var.F = list;
        }
        bu8Var.H = this.y0;
        return bu8Var;
    }
}
