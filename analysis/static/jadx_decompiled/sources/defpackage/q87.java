package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q87 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ q40 Z;
    public final /* synthetic */ m56 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q87(q40 q40Var, xt2 xt2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = q40Var;
        this.s0 = xt2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((q87) n((o87) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        q87 q87Var = new q87(this.Z, (xt2) this.s0, continuation);
        q87Var.Y = obj;
        return q87Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009f A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.X
            r2 = 2
            r3 = 1
            q40 r4 = r9.Z
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L13
            defpackage.od2.a0(r10)
            goto La0
        L13:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L1b:
            java.lang.Object r1 = r9.Y
            java.lang.String r1 = (java.lang.String) r1
            defpackage.od2.a0(r10)
            goto L58
        L23:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Y
            o87 r10 = (defpackage.o87) r10
            java.lang.String r1 = r10.a
            java.lang.Object r5 = r4.b
            a66 r5 = (defpackage.a66) r5
            java.lang.Object r6 = r4.c
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Peek from queue job="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            r5.invoke(r6, r7)
            x77 r10 = r10.b
            boolean r5 = r10.isCancelled()
            if (r5 != 0) goto L72
            r9.Y = r1
            r9.X = r3
            java.lang.Object r10 = r10.join(r9)
            if (r10 != r0) goto L58
            return r0
        L58:
            java.lang.Object r10 = r4.b
            a66 r10 = (defpackage.a66) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Executed job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
            goto L8b
        L72:
            java.lang.Object r10 = r4.b
            a66 r10 = (defpackage.a66) r10
            java.lang.Object r3 = r4.c
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Cancelled job="
            r5.<init>(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r10.invoke(r3, r5)
        L8b:
            java.lang.Object r10 = r4.X
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            r10.remove(r1)
            r10 = 0
            r9.Y = r10
            r9.X = r2
            m56 r10 = r9.s0
            java.lang.Object r9 = r10.invoke(r9)
            if (r9 != r0) goto La0
            return r0
        La0:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q87.o(java.lang.Object):java.lang.Object");
    }
}
