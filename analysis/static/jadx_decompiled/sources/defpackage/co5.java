package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class co5 extends ffe implements a66 {
    public mec X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ int s0;
    public final /* synthetic */ mn5 t0;
    public final /* synthetic */ m56 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public co5(int i, zn5 zn5Var, jy2 jy2Var, Continuation continuation) {
        super(2, continuation);
        this.s0 = i;
        this.t0 = zn5Var;
        this.u0 = jy2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((co5) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        co5 co5Var = new co5(this.s0, (zn5) this.t0, (jy2) this.u0, continuation);
        co5Var.Z = obj;
        return co5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L24
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            defpackage.od2.a0(r9)
            goto L5f
        L10:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L18:
            mec r1 = r8.X
            java.lang.Object r3 = r8.Z
            on5 r3 = (defpackage.on5) r3
            defpackage.od2.a0(r9)     // Catch: java.util.concurrent.CancellationException -> L22
            goto L4b
        L22:
            r9 = move-exception
            goto L64
        L24:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Z
            on5 r9 = (defpackage.on5) r9
            int r1 = r8.s0
            if (r1 <= 0) goto L70
            mec r4 = new mec
            r4.<init>()
            mn5 r5 = r8.t0     // Catch: java.util.concurrent.CancellationException -> L62
            bo5 r6 = new bo5     // Catch: java.util.concurrent.CancellationException -> L62
            r7 = 0
            r6.<init>(r4, r1, r9, r7)     // Catch: java.util.concurrent.CancellationException -> L62
            r8.Z = r9     // Catch: java.util.concurrent.CancellationException -> L62
            r8.X = r4     // Catch: java.util.concurrent.CancellationException -> L62
            r8.Y = r3     // Catch: java.util.concurrent.CancellationException -> L62
            java.lang.Object r1 = r5.d(r6, r8)     // Catch: java.util.concurrent.CancellationException -> L62
            if (r1 != r0) goto L49
            return r0
        L49:
            r3 = r9
            r1 = r4
        L4b:
            java.lang.Object r9 = r1.a
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            if (r9 == 0) goto L5f
            r1 = 0
            r8.Z = r1
            r8.X = r1
            r8.Y = r2
            java.lang.Object r8 = r3.a(r9, r8)
            if (r8 != r0) goto L5f
            return r0
        L5f:
            e5f r8 = defpackage.e5f.a
            return r8
        L62:
            r9 = move-exception
            r1 = r4
        L64:
            java.lang.Object r0 = r1.a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L6f
            m56 r8 = r8.u0
            r8.invoke(r0)
        L6f:
            throw r9
        L70:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r9 = "Chunk size must be greater than 0"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co5.o(java.lang.Object):java.lang.Object");
    }
}
