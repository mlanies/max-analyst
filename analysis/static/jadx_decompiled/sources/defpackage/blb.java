package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class blb {
    public final adb a;
    public final je7 b;
    public final ContextScope c;
    public final ua3 d;
    public final ConcurrentHashMap e;
    public final ConcurrentHashMap f;

    public blb(adb adbVar, je7 je7Var, je7 je7Var2, o45 o45Var) {
        this.a = adbVar;
        this.b = je7Var2;
        ContextScope contextScopeA = j1e.a(((w9a) ((kke) je7Var.getValue())).b().limitedParallelism(1, "profile_repository").plus(new qj(o45Var)));
        this.c = contextScopeA;
        this.d = ngg.a();
        this.e = new ConcurrentHashMap();
        this.f = new ConcurrentHashMap();
        uh uhVar = new uh(adbVar, 19, xlc.a(0, "SELECT * FROM profile"));
        od2.L(new zn5(new mqc(new cy3((ilc) adbVar.a, new String[]{"profile"}, uhVar, null)), new xkb(this, je7Var2, null), 5), contextScopeA);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r7, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ykb
            if (r0 == 0) goto L13
            r0 = r9
            ykb r0 = (defpackage.ykb) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            ykb r0 = new ykb
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            long r7 = r0.X
            blb r6 = r0.o
            defpackage.od2.a0(r9)
        L2a:
            r1 = r7
            goto L46
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.od2.a0(r9)
            ua3 r9 = r6.d
            r0.o = r6
            r0.X = r7
            r0.s0 = r3
            java.lang.Object r9 = r9.awaitInternal(r0)
            if (r9 != r1) goto L2a
            return r1
        L46:
            java.util.concurrent.ConcurrentHashMap r7 = r6.e
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r1)
            java.lang.Object r7 = r7.get(r8)
            oab r7 = (defpackage.oab) r7
            if (r7 == 0) goto L56
            return r7
        L56:
            java.lang.Class<blb> r7 = defpackage.blb.class
            java.lang.String r7 = r7.getName()
            ir6 r8 = defpackage.hm9.m
            if (r8 != 0) goto L61
            goto L6f
        L61:
            boolean r9 = r8.c()
            if (r9 == 0) goto L6f
            us7 r9 = defpackage.us7.X
            r0 = 0
            java.lang.String r3 = "getProfile: return stubProfile"
            r8.d(r9, r7, r3, r0)
        L6f:
            oab r7 = new oab
            oz4 r3 = defpackage.oz4.a
            nz4 r4 = defpackage.nz4.a
            je7 r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            uj3 r5 = r6.a(r1)
            r0 = r7
            r0.<init>(r1, r3, r4, r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blb.a(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(nab nabVar) {
        String name = blb.class.getName();
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, name, "putProfile: " + nabVar, null);
        }
        j47.T(this.c, null, null, new zkb(nabVar, this, null), 3);
    }
}
