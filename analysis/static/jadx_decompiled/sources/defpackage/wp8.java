package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wp8 extends ffe implements a66 {
    public Object X;
    public int Y;
    public final /* synthetic */ xp8 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wp8(xp8 xp8Var, Continuation continuation) {
        super(2, continuation);
        this.Z = xp8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wp8) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new wp8(this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
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
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            xp8 r6 = r8.Z
            if (r1 == 0) goto L38
            if (r1 == r5) goto L34
            if (r1 == r4) goto L2c
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            java.lang.Object r8 = r8.X
            java.util.Collection r8 = (java.util.Collection) r8
            defpackage.od2.a0(r9)
            goto L76
        L1c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L24:
            java.lang.Object r1 = r8.X
            java.util.Collection r1 = (java.util.Collection) r1
            defpackage.od2.a0(r9)
            goto L66
        L2c:
            java.lang.Object r1 = r8.X
            c6d r1 = (defpackage.c6d) r1
            defpackage.od2.a0(r9)
            goto L52
        L34:
            defpackage.od2.a0(r9)
            goto L44
        L38:
            defpackage.od2.a0(r9)
            r8.Y = r5
            java.lang.Object r9 = defpackage.xp8.a(r6, r8)
            if (r9 != r0) goto L44
            return r0
        L44:
            r1 = r9
            c6d r1 = (defpackage.c6d) r1
            r8.X = r1
            r8.Y = r4
            java.io.Serializable r9 = defpackage.xp8.b(r6, r8)
            if (r9 != r0) goto L52
            return r0
        L52:
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.List r1 = defpackage.l6d.i0(r1)
            r8.X = r9
            r8.Y = r3
            java.lang.Object r1 = defpackage.pag.c(r1, r8)
            if (r1 != r0) goto L63
            return r0
        L63:
            r7 = r1
            r1 = r9
            r9 = r7
        L66:
            java.util.Collection r9 = (java.util.Collection) r9
            r8.X = r9
            r8.Y = r2
            java.lang.Object r8 = defpackage.pag.c(r1, r8)
            if (r8 != r0) goto L73
            return r0
        L73:
            r7 = r9
            r9 = r8
            r8 = r7
        L76:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.ArrayList r8 = defpackage.x53.t0(r8, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r8)
            je7 r8 = r6.c
            java.lang.Object r8 = r8.getValue()
            oq3 r8 = (defpackage.oq3) r8
            g27 r0 = new g27
            r1 = 16
            r0.<init>(r1)
            r8.c(r9, r0)
            gi9 r8 = new gi9
            int r0 = r9.size()
            r8.<init>(r0)
            jv r0 = new jv
            r1 = 2
            r0.<init>(r8, r1)
            au5 r8 = new au5
            r1 = 1
            r8.<init>(r1, r0)
            r9.removeIf(r8)
            r8 = 0
            q0e r0 = r6.j
            r0.m(r8, r9)
            java.util.concurrent.atomic.AtomicBoolean r8 = r6.g
            r9 = 0
            r8.set(r9)
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wp8.o(java.lang.Object):java.lang.Object");
    }
}
