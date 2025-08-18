package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class q8d extends g9d {
    public final long A0;
    public final long B0;
    public final long z0;

    public q8d(p8d p8dVar) {
        super(p8dVar);
        this.z0 = p8dVar.l;
        this.A0 = p8dVar.m;
        this.B0 = p8dVar.n;
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        cu8 cu8VarQ = o().q(this.A0);
        if (g().C(this.z0) != null && cu8VarQ != null) {
            k8g k8gVar = cu8VarQ.z0;
            int i = k8gVar.i();
            for (int i2 = 0; i2 < i; i2++) {
                l20 l20VarH = k8gVar.h(i2);
                if (l20VarH == null) {
                    return null;
                }
                boolean zF = l20VarH.f();
                x10 x10Var = l20VarH.b;
                long j = this.B0;
                if ((zF && x10Var.s0 == j) || ((l20VarH.i() && l20VarH.d.a == j) || ((l20VarH.h() && l20VarH.f.a == j) || (l20VarH.g() && l20VarH.g.a == j)))) {
                    if (l20VarH.f()) {
                        x10 x10VarA = x10Var.b().a();
                        j10 j10VarJ = l20VarH.j();
                        j10VarJ.b = x10VarA;
                        l20VarH = j10VarJ.a();
                    }
                    m20 m20Var = new m20();
                    m20Var.a = Collections.singletonList(l20VarH);
                    k8g k8gVarC = m20Var.c();
                    String str = l20VarH.g() ? l20VarH.g.b : null;
                    bu8 bu8Var = new bu8();
                    bu8Var.g = str;
                    bu8Var.n = k8gVarC;
                    return bu8Var;
                }
            }
        }
        return null;
    }
}
