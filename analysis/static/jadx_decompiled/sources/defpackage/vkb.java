package defpackage;

import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes2.dex */
public final class vkb implements qab {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public vkb(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
    }

    public static void c(List list, uj3 uj3Var, jqe jqeVar, String str, boolean z, rdb rdbVar) {
        long jN = uj3Var.n();
        String strD = uj3Var.d();
        if (strD == null) {
            strD = "";
        }
        list.add(new zm3(jN, strD, rdbVar == rdb.c ? jqe.a : jqeVar, str, z, uj3Var.m(), rdbVar, 0, true, 128));
    }

    public static void d(List list, pdb pdbVar, boolean z) {
        int i = sea.I;
        long j = tea.c;
        eqe eqeVar = new eqe(vea.U0);
        odb odbVar = pdbVar.m;
        boolean z2 = odbVar.b;
        list.add(new x6(i, new vfd(j, 0, eqeVar, z2 ? jfd.b : jfd.o, null, null, new ffd(odbVar.a, z2), null, null, 0, null, 1968)));
        if (z) {
            list.add(new s0d(new eqe(vea.V0), i4f.p, 4096, 2));
        }
    }

    public static void e(List list, pdb pdbVar, boolean z) {
        int i = sea.F;
        long j = tea.b;
        eqe eqeVar = new eqe(z ? vea.y1 : vea.J1);
        eqe eqeVar2 = new eqe(vea.K1);
        odb odbVar = pdbVar.k;
        boolean z2 = odbVar.b;
        list.add(new x6(i, new vfd(j, 0, eqeVar, z2 ? jfd.b : jfd.o, eqeVar2, null, new ffd(odbVar.a, z2), null, null, 0, null, 1952)));
    }

    public static void g(List list, boolean z, boolean z2, rdb rdbVar) {
        if (z && rdbVar == rdb.o) {
            if (z2) {
                list.add(new x6(sea.D, new vfd(tea.a, 0, new eqe(vea.e), null, null, Integer.valueOf(woc.R0), cfd.a, null, null, 0, null, 1944), LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY));
            }
            list.add(new gh4(new eqe(vea.W0)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    @Override // defpackage.qab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.uj3 r32, defpackage.e52 r33, defpackage.pdb r34, defpackage.rdb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 630
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.a(uj3, e52, pdb, rdb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    @Override // defpackage.qab
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.uj3 r32, defpackage.e52 r33, defpackage.pdb r34, defpackage.rdb r35, java.lang.Long r36, kotlin.coroutines.Continuation r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.b(uj3, e52, pdb, rdb, java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void f(List list, pdb pdbVar, boolean z, boolean z2) {
        int i = sea.N;
        long j = tea.f;
        eqe eqeVar = new eqe(z ? vea.s1 : vea.b1);
        odb odbVar = pdbVar.l;
        boolean z3 = odbVar.b;
        jfd jfdVar = jfd.o;
        jfd jfdVar2 = jfd.b;
        vfd vfdVar = new vfd(j, 0, eqeVar, z3 ? jfdVar2 : jfdVar, null, null, new ffd(odbVar.a, z3), null, null, 0, null, 1968);
        je7 je7Var = this.d;
        list.add(new x6(i, vfdVar, (!((se5) ((qe5) je7Var.getValue())).p() || z) ? LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY : 536871936));
        if (!((se5) ((qe5) je7Var.getValue())).p() || z) {
            return;
        }
        list.add(new x6(sea.M, new vfd(tea.e, 0, new eqe(vea.a1), odbVar.b ? jfdVar2 : jfdVar, null, null, new ffd(pdbVar.f, z2), null, null, 0, null, 1936), -2147482624));
    }

    public final Boolean h(Long l, boolean z, e52 e52Var) {
        return Boolean.valueOf((l != null && l.longValue() == ((hyc) ((q33) this.e.getValue())).t() && z) || e52Var.d0());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.Long r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.tkb
            if (r0 == 0) goto L13
            r0 = r9
            tkb r0 = (defpackage.tkb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            tkb r0 = new tkb
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            defpackage.od2.a0(r9)
            goto L64
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L30:
            defpackage.od2.a0(r9)
            if (r8 == 0) goto L7d
            long r8 = r8.longValue()
            je7 r2 = r7.e
            java.lang.Object r2 = r2.getValue()
            q33 r2 = (defpackage.q33) r2
            hyc r2 = (defpackage.hyc) r2
            long r5 = r2.t()
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r2 != 0) goto L53
            int r7 = defpackage.vea.f1
            eqe r3 = new eqe
            r3.<init>(r7)
            goto L7d
        L53:
            je7 r7 = r7.c
            java.lang.Object r7 = r7.getValue()
            ds3 r7 = (defpackage.ds3) r7
            r0.Y = r4
            java.lang.Comparable r9 = r7.b(r8, r0)
            if (r9 != r1) goto L64
            return r1
        L64:
            uj3 r9 = (defpackage.uj3) r9
            if (r9 == 0) goto L7d
            java.lang.String r7 = r9.d()
            if (r7 == 0) goto L7d
            int r8 = defpackage.vea.e1
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            gqe r3 = new gqe
            java.util.List r7 = defpackage.ys.m0(r7)
            r3.<init>(r8, r7)
        L7d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.i(java.lang.Long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.Long r5, defpackage.uj3 r6, defpackage.e52 r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.ukb
            if (r0 == 0) goto L13
            r0 = r8
            ukb r0 = (defpackage.ukb) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            ukb r0 = new ukb
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            e52 r7 = r0.Y
            uj3 r6 = r0.X
            vkb r4 = r0.o
            defpackage.od2.a0(r8)
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.od2.a0(r8)
            r0.o = r4
            r0.X = r6
            r0.Y = r7
            r0.t0 = r3
            java.lang.Object r8 = r4.i(r5, r0)
            if (r8 != r1) goto L47
            return r1
        L47:
            jqe r8 = (defpackage.jqe) r8
            boolean r5 = r6.Y
            if (r5 == 0) goto L55
            int r4 = defpackage.vea.g1
            eqe r8 = new eqe
            r8.<init>(r4)
            goto L82
        L55:
            long r0 = r6.n()
            boolean r5 = r7.Y(r0)
            if (r5 == 0) goto L67
            int r4 = defpackage.vea.d1
            eqe r8 = new eqe
            r8.<init>(r4)
            goto L82
        L67:
            if (r8 != 0) goto L82
            je7 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            y7b r4 = (defpackage.y7b) r4
            je7 r4 = r4.a
            java.lang.Object r4 = r4.getValue()
            w7b r4 = (defpackage.w7b) r4
            java.lang.CharSequence r4 = r4.b(r6)
            iqe r8 = new iqe
            r8.<init>(r4)
        L82:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vkb.j(java.lang.Long, uj3, e52, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
