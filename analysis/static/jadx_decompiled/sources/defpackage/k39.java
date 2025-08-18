package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k39 extends ffe implements a66 {
    public ti9 X;
    public n59 Y;
    public Object Z;
    public int s0;
    public final /* synthetic */ n59 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k39(n59 n59Var, Continuation continuation) {
        super(2, continuation);
        this.t0 = n59Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((k39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new k39(this.t0, continuation);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0039 -> B:12:0x003c). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6) {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.s0
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r5.Z
            n59 r3 = r5.Y
            ti9 r4 = r5.X
            defpackage.od2.a0(r6)
            goto L3c
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1b:
            defpackage.od2.a0(r6)
            n59 r6 = r5.t0
            q0e r1 = r6.A1
            r3 = r6
            r4 = r1
        L24:
            java.lang.Object r1 = r4.getValue()
            r6 = r1
            z2e r6 = (defpackage.z2e) r6
            p31 r6 = r3.t0
            r5.X = r4
            r5.Y = r3
            r5.Z = r1
            r5.s0 = r2
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r0) goto L3c
            return r0
        L3c:
            z2e r6 = (defpackage.z2e) r6
            boolean r6 = r4.c(r1, r6)
            if (r6 == 0) goto L24
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k39.o(java.lang.Object):java.lang.Object");
    }
}
