package defpackage;

import java.util.Collections;

/* loaded from: classes2.dex */
public final class j9d extends g9d {
    public final l20 A0;
    public final boolean B0;
    public final String z0;

    public j9d(i9d i9dVar) {
        super(i9dVar);
        this.z0 = i9dVar.m;
        this.A0 = (l20) i9dVar.o;
        this.B0 = i9dVar.n;
    }

    @Override // defpackage.g9d
    public final bu8 y() {
        boolean z = this.B0;
        l20 l20VarA = this.A0;
        if (z) {
            j10 j10VarJ = l20VarA.j();
            j10VarJ.x = z10.b;
            l20VarA = j10VarJ.a();
        }
        m20 m20Var = new m20();
        m20Var.a = Collections.singletonList(l20VarA);
        k8g k8gVarC = m20Var.c();
        bu8 bu8Var = new bu8();
        bu8Var.n = k8gVarC;
        String str = this.z0;
        if (!oag.t(str)) {
            bu8Var.g = str;
        }
        bu8Var.F = null;
        return bu8Var;
    }

    @Override // defpackage.g9d
    public final long z(long j, e52 e52Var) {
        long jZ = super.z(j, e52Var);
        if (this.B0) {
            pk pkVarA = a();
            k4a k4aVar = (k4a) pkVarA;
            k4a.w(k4aVar, new pf9(((p7b) k4aVar.y()).a.o(), this.A0.g.b, j));
        }
        return jZ;
    }
}
