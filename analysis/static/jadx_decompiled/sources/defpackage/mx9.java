package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mx9 extends ffe implements a66 {
    public List X;
    public int Y;
    public final /* synthetic */ qx9 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx9(qx9 qx9Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Z = qx9Var;
        this.s0 = j;
        this.t0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((mx9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new mx9(this.Z, this.s0, this.t0, continuation);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(1:44)|(1:(1:(6:6|41|7|43|35|36)(2:13|14))(1:15))(3:21|22|(1:24))|46|26|39|27|(1:29)(4:30|43|35|36)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007e, code lost:
    
        r14 = r13;
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        r13 = move-exception;
     */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r13.Y
            qx9 r2 = r13.Z
            r3 = 2
            r4 = 1
            java.lang.String r5 = "qx9"
            if (r1 == 0) goto L2e
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1d
            java.util.List r13 = r13.X
            defpackage.od2.a0(r14)     // Catch: java.lang.Throwable -> L17 java.util.concurrent.CancellationException -> L1a
            goto L8f
        L17:
            r14 = move-exception
            goto L84
        L1a:
            r13 = move-exception
            goto La9
        L1d:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L25:
            defpackage.od2.a0(r14)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            goto L59
        L29:
            r14 = move-exception
            goto L52
        L2b:
            r13 = move-exception
            goto Laa
        L2e:
            defpackage.od2.a0(r14)
            long r8 = r13.s0
            long r10 = r13.t0
            je7 r14 = r2.b     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r14 = r14.getValue()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            ud5 r14 = (defpackage.ud5) r14     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r13.Y = r4     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r14.getClass()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            sd5 r1 = new sd5     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            r6 = r1
            r7 = r14
            r6.<init>()     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            ilc r14 = r14.a     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            java.lang.Object r14 = defpackage.z04.e0(r14, r1, r13)     // Catch: java.lang.Throwable -> L29 java.util.concurrent.CancellationException -> L2b
            if (r14 != r0) goto L59
            return r0
        L52:
            java.lang.String r1 = "onSelfReadMarkChanged: failed to remove sent analytics entries"
            defpackage.hm9.l(r5, r1, r14)
            nz4 r14 = defpackage.nz4.a
        L59:
            java.util.List r14 = (java.util.List) r14
            je7 r1 = r2.d     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            java.lang.Object r1 = r1.getValue()     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            yx9 r1 = (defpackage.yx9) r1     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            r13.X = r14     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            r13.Y = r3     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            r1.getClass()     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            ga r2 = new ga     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            r3 = 22
            r2.<init>(r1, r3, r14)     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            ilc r1 = r1.a     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            java.lang.Object r13 = defpackage.z04.e0(r1, r2, r13)     // Catch: java.util.concurrent.CancellationException -> L1a java.lang.Throwable -> L82
            if (r13 != r0) goto L7a
            return r0
        L7a:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L8f
        L7e:
            r12 = r14
            r14 = r13
            r13 = r12
            goto L84
        L82:
            r13 = move-exception
            goto L7e
        L84:
            java.lang.String r0 = "onSelfReadMarkChanged: failed to remove tracker messages"
            defpackage.hm9.l(r5, r0, r14)
            java.lang.Integer r14 = new java.lang.Integer
            r0 = 0
            r14.<init>(r0)
        L8f:
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            int r13 = r13.size()
            java.lang.String r0 = "onSelfReadMarkChanged: removed "
            java.lang.String r1 = " analyticsEntries, "
            java.lang.String r2 = " trackerMessages entries"
            java.lang.String r13 = defpackage.wg0.h(r0, r13, r1, r14, r2)
            defpackage.hm9.n(r5, r13)
            e5f r13 = defpackage.e5f.a
            return r13
        La9:
            throw r13
        Laa:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mx9.o(java.lang.Object):java.lang.Object");
    }
}
