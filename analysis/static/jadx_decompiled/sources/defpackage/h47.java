package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class h47 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ k56 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h47(k56 k56Var, Continuation continuation) {
        super(2, continuation);
        this.Y = k56Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((h47) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h47 h47Var = new h47(this.Y, continuation);
        h47Var.X = obj;
        return h47Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        return r3.invoke();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r0.e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        throw r3;
     */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.X
            sx3 r4 = (defpackage.sx3) r4
            lx3 r4 = r4.getCoroutineContext()
            k56 r3 = r3.Y
            wse r0 = new wse     // Catch: java.lang.InterruptedException -> L40
            r0.<init>()     // Catch: java.lang.InterruptedException -> L40
            x77 r4 = defpackage.pag.n(r4)     // Catch: java.lang.InterruptedException -> L40
            r1 = 1
            cm4 r4 = defpackage.pag.q(r4, r1, r0)     // Catch: java.lang.InterruptedException -> L40
            r0.c = r4     // Catch: java.lang.InterruptedException -> L40
        L1d:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r4 = defpackage.wse.o     // Catch: java.lang.InterruptedException -> L40
            int r1 = r4.get(r0)     // Catch: java.lang.InterruptedException -> L40
            if (r1 == 0) goto L31
            r4 = 2
            if (r1 == r4) goto L38
            r4 = 3
            if (r1 != r4) goto L2c
            goto L38
        L2c:
            defpackage.wse.f(r1)     // Catch: java.lang.InterruptedException -> L40
            r3 = 0
            throw r3     // Catch: java.lang.InterruptedException -> L40
        L31:
            r2 = 0
            boolean r4 = r4.compareAndSet(r0, r1, r2)     // Catch: java.lang.InterruptedException -> L40
            if (r4 == 0) goto L1d
        L38:
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L42
            r0.e()     // Catch: java.lang.InterruptedException -> L40
            return r3
        L40:
            r3 = move-exception
            goto L47
        L42:
            r3 = move-exception
            r0.e()     // Catch: java.lang.InterruptedException -> L40
            throw r3     // Catch: java.lang.InterruptedException -> L40
        L47:
            java.util.concurrent.CancellationException r4 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r4.<init>(r0)
            java.lang.Throwable r3 = r4.initCause(r3)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h47.o(java.lang.Object):java.lang.Object");
    }
}
