package defpackage;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class ndb implements qab {
    public final je7 a;
    public final je7 b;
    public final je7 c;

    public ndb(je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
    }

    @Override // defpackage.qab
    public final Object a(uj3 uj3Var, e52 e52Var, pdb pdbVar, rdb rdbVar, Long l, Continuation continuation) {
        kl7 kl7VarL = j1e.l();
        int i = ((u7b) this.a.getValue()).b(uj3Var.n()).a;
        boolean z = i == 10 || i == 20 || i == 40;
        String strP = uj3Var.p(kk0.c);
        String str = strP == null ? "" : strP;
        CharSequence charSequenceB = ((w7b) ((y7b) this.b.getValue()).a.getValue()).b(uj3Var);
        boolean zS = e52Var.s();
        boolean z2 = !pdbVar.a && zS;
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        kl7VarL.add(new zm3(jN, strD == null ? "" : strD, new iqe(charSequenceB), str, z, uj3Var.m(), rdbVar, 536903680, false, 256));
        int i2 = sea.S;
        kl7VarL.add(new x6(i2, new vfd(i2, 0, new eqe(vea.l1), null, null, null, new ffd(pdbVar.a, zS), null, null, 0, null, 1944), -2147482624));
        kl7VarL.add(new s0d(new eqe(vea.w1), i4f.p, 4096, 2));
        kl7VarL.add(new s0d(new eqe(vea.k1), null, 2048, 6));
        int i3 = sea.O;
        kl7VarL.add(new x6(i3, new vfd(i3, 0, new eqe(vea.t1), null, null, null, new ffd(pdbVar.b, z2), null, null, 0, null, 1944), 536871936));
        int i4 = sea.P;
        kl7VarL.add(new x6(i4, new vfd(i4, 0, new eqe(vea.i1), null, null, null, new ffd(pdbVar.c, z2), null, null, 0, null, 1944), 1073742848));
        int i5 = sea.F;
        kl7VarL.add(new x6(i5, new vfd(i5, 0, new eqe(vea.p1), null, null, null, new ffd(pdbVar.d, z2), null, null, 0, null, 1944), 1073742848));
        int i6 = sea.N;
        kl7VarL.add(new x6(i6, new vfd(i6, 0, new eqe(vea.s1), null, null, null, new ffd(pdbVar.e, z2), null, null, 0, null, 1944), -2147482624));
        kl7VarL.add(new s0d(jqe.a, null, 0, 14));
        if (zS && rdbVar == rdb.o) {
            int i7 = sea.D;
            kl7VarL.add(new x6(i7, new vfd(i7, 0, new eqe(vea.e), null, null, new Integer(woc.R0), cfd.a, null, null, 0, null, 1944), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            kl7VarL.add(new gh4(new eqe(vea.W0)));
        }
        return j1e.d(kl7VarL);
    }

    @Override // defpackage.qab
    public final Object b(uj3 uj3Var, e52 e52Var, pdb pdbVar, rdb rdbVar, Long l, Continuation continuation) {
        kl7 kl7VarL = j1e.l();
        int i = ((u7b) this.a.getValue()).b(uj3Var.n()).a;
        boolean z = i == 10 || i == 20 || i == 40;
        String strP = uj3Var.p(kk0.c);
        String str = strP == null ? "" : strP;
        CharSequence charSequenceB = ((w7b) ((y7b) this.b.getValue()).a.getValue()).b(uj3Var);
        boolean zS = e52Var.s();
        boolean z2 = !pdbVar.a && zS;
        boolean z3 = pdbVar.e;
        boolean z4 = z2 && z3;
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        boolean z5 = z2;
        boolean z6 = z4;
        kl7VarL.add(new zm3(jN, strD != null ? strD : "", new iqe(charSequenceB), str, z, uj3Var.m(), rdbVar, 536903680, false, 256));
        int i2 = sea.S;
        kl7VarL.add(new x6(i2, new vfd(i2, 0, new eqe(vea.l1), null, null, null, new ffd(pdbVar.a, zS), null, null, 0, null, 1944), -2147482624));
        kl7VarL.add(new s0d(new eqe(vea.m1), i4f.p, 4096, 2));
        kl7VarL.add(new s0d(new eqe(vea.k1), null, 2048, 6));
        int i3 = sea.O;
        kl7VarL.add(new x6(i3, new vfd(i3, 0, new eqe(vea.c1), null, null, null, new ffd(pdbVar.b, z5), null, null, 0, null, 1944), 536871936));
        int i4 = sea.P;
        kl7VarL.add(new x6(i4, new vfd(i4, 0, new eqe(vea.i1), null, null, null, new ffd(pdbVar.c, z5), null, null, 0, null, 1944), 1073742848));
        int i5 = sea.F;
        kl7VarL.add(new x6(i5, new vfd(i5, 0, new eqe(vea.N0), null, null, null, new ffd(pdbVar.d, z5), null, null, 0, null, 1944), 1073742848));
        int i6 = sea.N;
        vfd vfdVar = new vfd(i6, 0, new eqe(vea.b1), null, null, null, new ffd(z3, z5), null, null, 0, null, 1944);
        je7 je7Var = this.c;
        kl7VarL.add(new x6(i6, vfdVar, ((se5) ((qe5) je7Var.getValue())).p() ? 1073742848 : -2147482624));
        if (((se5) ((qe5) je7Var.getValue())).p()) {
            int i7 = sea.M;
            kl7VarL.add(new x6(i7, new vfd(i7, 0, new eqe(vea.a1), null, null, null, new ffd(pdbVar.f, z6), null, null, 0, null, 1944), -2147482624));
        }
        kl7VarL.add(new s0d(jqe.a, null, 0, 14));
        if (zS && rdbVar == rdb.o) {
            int i8 = sea.D;
            kl7VarL.add(new x6(i8, new vfd(i8, 0, new eqe(vea.e), null, null, new Integer(woc.R0), cfd.a, null, null, 0, null, 1944), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            kl7VarL.add(new gh4(new eqe(vea.W0)));
        }
        return j1e.d(kl7VarL);
    }
}
