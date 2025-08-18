package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v97 extends ffe implements a66 {
    public tt0 X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ w97 s0;
    public final /* synthetic */ a66 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v97(w97 w97Var, xwf xwfVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = w97Var;
        this.t0 = xwfVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((v97) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        v97 v97Var = new v97(this.s0, (xwf) this.t0, continuation);
        v97Var.Z = obj;
        return v97Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0056 A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {all -> 0x0067, blocks: (B:7:0x0012, B:17:0x003e, B:21:0x004e, B:23:0x0056, B:12:0x0025, B:15:0x0032), top: B:29:0x0006 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0064 -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L29
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            tt0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            a66 r4 = (defpackage.a66) r4
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L67
        L15:
            r7 = r4
            goto L3e
        L17:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L1f:
            tt0 r1 = r6.X
            java.lang.Object r4 = r6.Z
            a66 r4 = (defpackage.a66) r4
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L67
            goto L4e
        L29:
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.Z
            sx3 r7 = (defpackage.sx3) r7
            w97 r7 = r6.s0
            zt0 r7 = r7.a     // Catch: java.lang.Throwable -> L67
            r7.getClass()     // Catch: java.lang.Throwable -> L67
            tt0 r1 = new tt0     // Catch: java.lang.Throwable -> L67
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L67
            a66 r7 = r6.t0
        L3e:
            r6.Z = r7     // Catch: java.lang.Throwable -> L67
            r6.X = r1     // Catch: java.lang.Throwable -> L67
            r6.Y = r3     // Catch: java.lang.Throwable -> L67
            java.lang.Object r4 = r1.b(r6)     // Catch: java.lang.Throwable -> L67
            if (r4 != r0) goto L4b
            return r0
        L4b:
            r5 = r4
            r4 = r7
            r7 = r5
        L4e:
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch: java.lang.Throwable -> L67
            boolean r7 = r7.booleanValue()     // Catch: java.lang.Throwable -> L67
            if (r7 == 0) goto L67
            java.lang.Object r7 = r1.c()     // Catch: java.lang.Throwable -> L67
            r6.Z = r4     // Catch: java.lang.Throwable -> L67
            r6.X = r1     // Catch: java.lang.Throwable -> L67
            r6.Y = r2     // Catch: java.lang.Throwable -> L67
            java.lang.Object r7 = r4.invoke(r7, r6)     // Catch: java.lang.Throwable -> L67
            if (r7 != r0) goto L15
            return r0
        L67:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v97.o(java.lang.Object):java.lang.Object");
    }
}
