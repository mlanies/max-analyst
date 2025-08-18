package defpackage;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes2.dex */
public final class g8d extends d8d {
    public final long b;
    public final boolean c;
    public final String o = g8d.class.getName();

    public g8d(long j, boolean z) {
        this.b = j;
        this.c = z;
    }

    @Override // defpackage.d8d
    public final void x() throws Throwable {
        ArrayList arrayList;
        k92 k92Var;
        ArrayList arrayList2;
        StringBuilder sb = new StringBuilder("process, chatsIds = ");
        long j = this.b;
        sb.append(j);
        sb.append(" , forAll = ");
        boolean z = this.c;
        sb.append(z);
        hm9.n(this.o, sb.toString());
        if (j == 0) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        e52 e52VarC = g().C(j);
        if (e52VarC == null) {
            return;
        }
        k92 k92Var2 = e52VarC.b;
        long j2 = k92Var2.k;
        o().y(this.b, j2, vx8.DELETED);
        g().w(j);
        p82 p82VarG = g();
        p82VarG.getClass();
        v82 v82Var = v82.o;
        long j3 = e52VarC.a;
        p82VarG.c(j3, v82Var);
        p82VarG.h(j3, false, new un0(17));
        pk pkVarA = a();
        boolean z2 = e52VarC.F() || z;
        k4a k4aVar = (k4a) pkVarA;
        long j4 = e52VarC.a;
        if (k4aVar.o(j4)) {
            arrayList = arrayList3;
            k92Var = k92Var2;
            k4a.w(k4aVar, new l72(((p7b) k4aVar.y()).a.o(), j4, k92Var2.a, j2, z2));
        } else {
            arrayList = arrayList3;
            k92Var = k92Var2;
        }
        t().c(new m72(j));
        uj3 uj3VarL = e52VarC.l();
        if (uj3VarL != null) {
            arrayList2 = arrayList;
            arrayList2.add(Long.valueOf(uj3VarL.n()));
        } else {
            arrayList2 = arrayList;
        }
        vr7 vr7VarM = m();
        o().i(j);
        vr7VarM.getClass();
        e8d e8dVar = this.a;
        if (e8dVar == null) {
            e8dVar = null;
        }
        ((cea) e8dVar.x.getValue()).a(k92Var.a);
        if (!arrayList2.isEmpty()) {
            t().c(new ps3(arrayList2));
        }
        t().c(new vz2(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }
}
