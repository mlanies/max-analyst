package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class wyd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wyd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((wyd) n((dn3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wyd wydVar = new wyd(continuation, this.Y);
        wydVar.X = obj;
        return wydVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.X
            dn3 r10 = (defpackage.dn3) r10
            nz4 r0 = defpackage.nz4.a
            one.me.startconversation.StartConversationScreen r9 = r9.Y
            a3g r1 = r9.y0
            r1.E(r0)
            a3g r1 = r9.D0
            r1.E(r0)
            a3g r2 = r9.z0
            r2.E(r0)
            jzd r3 = r9.n0()
            js3 r3 = r3.v0
            w7c r3 = r3.i
            j0e r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            dn3 r3 = (defpackage.dn3) r3
            boolean r3 = r3.b()
            jv5 r4 = r9.E0
            if (r3 == 0) goto L75
            bc7[] r3 = one.me.startconversation.StartConversationScreen.I0
            r5 = 2
            r3 = r3[r5]
            fs r3 = r9.X
            java.lang.Object r3 = r3.a(r9)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L75
            je7 r3 = r9.w0
            java.lang.Object r3 = r3.getValue()
            eua r3 = (defpackage.eua) r3
            java.lang.String[] r5 = defpackage.eua.f
            boolean r3 = r3.b(r5)
            pr3 r5 = new pr3
            int r6 = defpackage.woc.J0
            int r7 = defpackage.a9a.r
            if (r3 == 0) goto L5e
            int r8 = defpackage.a9a.q
            goto L60
        L5e:
            int r8 = defpackage.a9a.p
        L60:
            if (r3 == 0) goto L64
            r3 = 0
            goto L6a
        L64:
            int r3 = defpackage.a9a.o
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L6a:
            r5.<init>(r6, r7, r8, r3)
            java.util.List r3 = java.util.Collections.singletonList(r5)
            r4.E(r3)
            goto L78
        L75:
            r4.E(r0)
        L78:
            java.lang.CharSequence r3 = r9.m0()
            e5f r4 = defpackage.e5f.a
            a3g r5 = r9.C0
            a3g r6 = r9.B0
            a3g r7 = r9.A0
            if (r3 == 0) goto L9d
            int r3 = r3.length()
            if (r3 != 0) goto L8d
            goto L9d
        L8d:
            java.util.List r9 = r10.a
            r7.E(r9)
            java.util.List r9 = r10.b
            r6.E(r9)
            java.util.List r9 = r10.c
            r5.E(r9)
            return r4
        L9d:
            jzd r10 = r9.n0()
            w7c r10 = r10.x0
            j0e r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            java.util.List r10 = (java.util.List) r10
            a3g r3 = r9.y0
            r3.E(r10)
            java.util.List r10 = defpackage.wmd.n()
            r1.E(r10)
            jzd r10 = r9.n0()
            w7c r10 = r10.u0
            j0e r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            dn3 r10 = (defpackage.dn3) r10
            java.util.List r10 = r10.a
            r7.E(r10)
            r6.E(r0)
            jzd r10 = r9.n0()
            w7c r10 = r10.u0
            j0e r10 = r10.a
            java.lang.Object r10 = r10.getValue()
            dn3 r10 = (defpackage.dn3) r10
            java.util.List r10 = r10.c
            r5.E(r10)
            je7 r9 = r9.t0
            java.lang.Object r9 = r9.getValue()
            bh0 r9 = (defpackage.bh0) r9
            w7c r9 = r9.s0
            j0e r9 = r9.a
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            r2.E(r9)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wyd.o(java.lang.Object):java.lang.Object");
    }
}
