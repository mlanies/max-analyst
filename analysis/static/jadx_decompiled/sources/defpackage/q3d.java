package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q3d extends pnf {
    public final q0e Y;
    public final w7c Z;
    public final hq7 b;
    public final e3d c;
    public final w7c s0;
    public final s35 o = new s35(0);
    public final s35 X = new s35(0);

    public q3d(hq7 hq7Var, e3d e3dVar) {
        this.b = hq7Var;
        this.c = e3dVar;
        mqc mqcVar = new mqc(new p3d(new m3d(((fz6) hq7Var).w0, this, 0), null, this));
        q0e q0eVarA = r0e.a(null);
        this.Y = q0eVarA;
        w7c w7cVar = new w7c(q0eVarA);
        this.Z = w7cVar;
        m3d m3dVar = new m3d(new j31(mqcVar, w7cVar, new r1b(3, (Continuation) null, 11), 4), this, 1);
        nz4 nz4Var = nz4.a;
        this.s0 = od2.X(m3dVar, this.a, wld.a, nz4Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object q(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.j3d
            if (r0 == 0) goto L13
            r0 = r5
            j3d r0 = (defpackage.j3d) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            j3d r0 = new j3d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r5)
            goto L44
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            defpackage.od2.a0(r5)
            r0.Y = r3
            hq7 r4 = r4.b
            r4.getClass()
            fz6 r4 = (defpackage.fz6) r4
            ac r4 = r4.w0
            java.lang.Object r5 = defpackage.od2.A(r4, r0)
            if (r5 != r1) goto L44
            return r1
        L44:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            boolean r4 = r5 instanceof java.util.Collection
            r0 = 0
            if (r4 == 0) goto L56
            r4 = r5
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L56
        L54:
            r3 = r0
            goto L6a
        L56:
            java.util.Iterator r4 = r5.iterator()
        L5a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r4.next()
            b86 r5 = (defpackage.b86) r5
            int r5 = r5.b
            if (r5 <= 0) goto L5a
        L6a:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q3d.q(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
