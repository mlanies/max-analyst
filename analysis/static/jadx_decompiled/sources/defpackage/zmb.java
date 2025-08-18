package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zmb extends ffe implements a66 {
    public int X;
    public final /* synthetic */ cnb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmb(cnb cnbVar, Continuation continuation) {
        super(2, continuation);
        this.Y = cnbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zmb) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zmb(this.Y, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r5.X
            r2 = 2
            r3 = 1
            cnb r4 = r5.Y
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            defpackage.od2.a0(r6)
            goto L37
        L12:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L1a:
            defpackage.od2.a0(r6)
            goto L2c
        L1e:
            defpackage.od2.a0(r6)
            pab r6 = r4.O0
            r5.X = r3
            java.lang.Object r6 = r6.A(r5)
            if (r6 != r0) goto L2c
            return r0
        L2c:
            pab r6 = r4.O0
            r5.X = r2
            java.lang.Object r6 = r6.n(r5)
            if (r6 != r0) goto L37
            return r0
        L37:
            e52 r6 = (defpackage.e52) r6
            if (r6 == 0) goto L49
            s35 r5 = r4.A0
            nkb r0 = new nkb
            hdb r1 = defpackage.hdb.c
            long r2 = r6.a
            r0.<init>(r2, r1)
            defpackage.pnf.o(r5, r0)
        L49:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zmb.o(java.lang.Object):java.lang.Object");
    }
}
