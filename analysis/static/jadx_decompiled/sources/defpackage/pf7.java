package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pf7 extends ffe implements a66 {
    public xi9 X;
    public qf7 Y;
    public f4f Z;
    public int s0;
    public final /* synthetic */ qf7 t0;
    public final /* synthetic */ f4f u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pf7(qf7 qf7Var, f4f f4fVar, Continuation continuation) {
        super(2, continuation);
        this.t0 = qf7Var;
        this.u0 = f4fVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((pf7) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new pf7(this.t0, this.u0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:0|2|(8:(1:(1:(5:7|44|8|34|35)(2:12|13))(1:15))(2:16|(1:18)(1:19))|42|21|22|(2:24|(1:26))(2:31|(1:33))|27|34|35)|41|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        r12 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [xi9] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.s0
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L34
            if (r1 == r5) goto L27
            if (r1 == r4) goto L24
            if (r1 != r3) goto L1c
            xi9 r11 = r11.X
        L14:
            defpackage.od2.a0(r12)     // Catch: java.lang.Throwable -> L19
            goto L81
        L19:
            r12 = move-exception
            goto L8b
        L1c:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L24:
            xi9 r11 = r11.X
            goto L14
        L27:
            f4f r1 = r11.Z
            qf7 r5 = r11.Y
            xi9 r7 = r11.X
            defpackage.od2.a0(r12)
            r10 = r7
            r7 = r1
            r1 = r10
            goto L4d
        L34:
            defpackage.od2.a0(r12)
            qf7 r12 = r11.t0
            aj9 r1 = r12.f
            r11.X = r1
            r11.Y = r12
            f4f r7 = r11.u0
            r11.Z = r7
            r11.s0 = r5
            java.lang.Object r5 = r1.d(r11)
            if (r5 != r0) goto L4c
            return r0
        L4c:
            r5 = r12
        L4d:
            mz6 r12 = r5.a     // Catch: java.lang.Throwable -> L71
            long r8 = r7.b     // Catch: java.lang.Throwable -> L71
            java.util.concurrent.ConcurrentHashMap r12 = r12.k     // Catch: java.lang.Throwable -> L89
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> L89
            boolean r12 = r12.containsKey(r8)     // Catch: java.lang.Throwable -> L89
            long r7 = r7.b
            if (r12 == 0) goto L73
            r11.X = r1     // Catch: java.lang.Throwable -> L71
            r11.Y = r6     // Catch: java.lang.Throwable -> L71
            r11.Z = r6     // Catch: java.lang.Throwable -> L71
            r11.s0 = r4     // Catch: java.lang.Throwable -> L71
            defpackage.qf7.a(r5, r7)     // Catch: java.lang.Throwable -> L71
            if (r2 != r0) goto L6d
            return r0
        L6d:
            r11 = r1
            goto L81
        L6f:
            r11 = r1
            goto L8b
        L71:
            r12 = move-exception
            goto L6f
        L73:
            r11.X = r1     // Catch: java.lang.Throwable -> L71
            r11.Y = r6     // Catch: java.lang.Throwable -> L71
            r11.Z = r6     // Catch: java.lang.Throwable -> L71
            r11.s0 = r3     // Catch: java.lang.Throwable -> L71
            defpackage.qf7.b(r5, r7)     // Catch: java.lang.Throwable -> L71
            if (r2 != r0) goto L6d
            return r0
        L81:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r6)
            return r2
        L87:
            r12 = r11
            goto L6f
        L89:
            r11 = move-exception
            goto L87
        L8b:
            aj9 r11 = (defpackage.aj9) r11
            r11.e(r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pf7.o(java.lang.Object):java.lang.Object");
    }
}
