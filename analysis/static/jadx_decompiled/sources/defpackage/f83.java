package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f83 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ m83 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f83(m83 m83Var, Continuation continuation) {
        super(2, continuation);
        this.Z = m83Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((f83) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        f83 f83Var = new f83(this.Z, continuation);
        f83Var.Y = obj;
        return f83Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b3, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            r0 = 0
            tx3 r1 = defpackage.tx3.a
            int r2 = r12.X
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L1f
            if (r2 != r3) goto L17
            java.lang.Object r12 = r12.Y
            sx3 r12 = (defpackage.sx3) r12
            defpackage.od2.a0(r13)     // Catch: java.lang.Throwable -> L14
            goto Laf
        L14:
            r13 = move-exception
            goto Lb9
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L1f:
            defpackage.od2.a0(r13)
            java.lang.Object r13 = r12.Y
            sx3 r13 = (defpackage.sx3) r13
            bc7[] r2 = defpackage.m83.m
            m83 r2 = r12.Z
            q0e r5 = r2.h
            java.lang.Object r5 = r5.getValue()
            u83 r5 = (defpackage.u83) r5
            boolean r6 = r5 instanceof defpackage.p83
            if (r6 == 0) goto L39
            p83 r5 = (defpackage.p83) r5
            goto L3a
        L39:
            r5 = r4
        L3a:
            if (r5 == 0) goto L3f
            java.lang.Long r5 = r5.c
            goto L40
        L3f:
            r5 = r4
        L40:
            q0e r6 = r2.h
            java.lang.Object r7 = r6.getValue()
            r8 = r7
            u83 r8 = (defpackage.u83) r8
            r8.getClass()
            boolean r9 = r8 instanceof defpackage.p83
            if (r9 == 0) goto L68
            p83 r8 = (defpackage.p83) r8
            java.util.List r9 = r8.a
            java.lang.Object r10 = defpackage.x53.q0(r9)
            boolean r10 = r10 instanceof defpackage.r83
            if (r10 != 0) goto L62
            r83 r10 = defpackage.r83.a
            java.util.ArrayList r9 = defpackage.x53.u0(r9, r10)
        L62:
            r10 = 6
            p83 r8 = defpackage.p83.a(r8, r9, r10)
            goto L73
        L68:
            p83 r8 = new p83
            r83 r9 = defpackage.r83.a
            java.util.List r9 = java.util.Collections.singletonList(r9)
            r8.<init>(r4, r9, r0)
        L73:
            boolean r6 = r6.c(r7, r8)
            if (r6 == 0) goto L40
            je7 r6 = r2.d     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> Lb7
            pk r6 = (defpackage.pk) r6     // Catch: java.lang.Throwable -> Lb7
            tq2 r7 = new tq2     // Catch: java.lang.Throwable -> Lb7
            long[] r2 = r2.g     // Catch: java.lang.Throwable -> Lb7
            r7.<init>(r4, r0)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "userIds"
            r7.h(r0, r2)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r0 = "count"
            r2 = 50
            r7.e(r2, r0)     // Catch: java.lang.Throwable -> Lb7
            if (r5 == 0) goto L9f
            java.lang.Object r0 = r7.b     // Catch: java.lang.Throwable -> Lb7
            java.util.HashMap r0 = (java.util.HashMap) r0     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "marker"
            r0.put(r2, r5)     // Catch: java.lang.Throwable -> Lb7
        L9f:
            r12.Y = r13     // Catch: java.lang.Throwable -> Lb7
            r12.X = r3     // Catch: java.lang.Throwable -> Lb7
            k4a r6 = (defpackage.k4a) r6     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r12 = r6.J(r7, r12)     // Catch: java.lang.Throwable -> Lb7
            if (r12 != r1) goto Lac
            return r1
        Lac:
            r11 = r13
            r13 = r12
            r12 = r11
        Laf:
            uq2 r13 = (defpackage.uq2) r13     // Catch: java.lang.Throwable -> L14
            r4 = r13
            goto Lca
        Lb3:
            r11 = r13
            r13 = r12
            r12 = r11
            goto Lb9
        Lb7:
            r12 = move-exception
            goto Lb3
        Lb9:
            boolean r0 = r13 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto Lca
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            java.lang.String r0 = "request error!"
            defpackage.hm9.p(r12, r0, r13)
        Lca:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f83.o(java.lang.Object):java.lang.Object");
    }
}
