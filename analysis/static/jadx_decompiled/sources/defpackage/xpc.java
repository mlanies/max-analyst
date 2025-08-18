package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class xpc extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ mn5 Z;
    public final /* synthetic */ uz9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xpc(zn5 zn5Var, ez9 ez9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zn5Var;
        this.s0 = ez9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xpc) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xpc xpcVar = new xpc((zn5) this.Z, (ez9) this.s0, continuation);
        xpcVar.Y = obj;
        return xpcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.X
            r2 = 1
            uz9 r3 = r7.s0
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r7 = r7.Y
            sx3 r7 = (defpackage.sx3) r7
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L13
            goto L39
        L13:
            r8 = move-exception
            goto L44
        L15:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L1d:
            defpackage.od2.a0(r8)
            java.lang.Object r8 = r7.Y
            sx3 r8 = (defpackage.sx3) r8
            mn5 r1 = r7.Z     // Catch: java.lang.Throwable -> L40
            xw r4 = new xw     // Catch: java.lang.Throwable -> L40
            r5 = 11
            r4.<init>(r5, r3)     // Catch: java.lang.Throwable -> L40
            r7.Y = r8     // Catch: java.lang.Throwable -> L40
            r7.X = r2     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r1.d(r4, r7)     // Catch: java.lang.Throwable -> L40
            if (r7 != r0) goto L38
            return r0
        L38:
            r7 = r8
        L39:
            r8 = r3
            ez9 r8 = (defpackage.ez9) r8     // Catch: java.lang.Throwable -> L13
            r8.b()     // Catch: java.lang.Throwable -> L13
            goto L5d
        L40:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L44:
            boolean r0 = r8 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L58
            ez9 r3 = (defpackage.ez9) r3
            boolean r0 = r3.e(r8)
            if (r0 != 0) goto L5d
            lx3 r7 = r7.getCoroutineContext()
            defpackage.f46.S(r7, r8)
            goto L5d
        L58:
            ez9 r3 = (defpackage.ez9) r3
            r3.b()
        L5d:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xpc.o(java.lang.Object):java.lang.Object");
    }
}
