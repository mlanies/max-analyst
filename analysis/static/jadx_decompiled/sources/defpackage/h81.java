package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final class h81 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallHistoryPageScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h81(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = callHistoryPageScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        h81 h81Var = (h81) n((fpa) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        h81Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        h81 h81Var = new h81(this.Y, continuation);
        h81Var.X = obj;
        return h81Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r3) throws java.lang.Throwable {
        /*
            r2 = this;
            defpackage.od2.a0(r3)
            java.lang.Object r3 = r2.X
            fpa r3 = (defpackage.fpa) r3
            epa r0 = defpackage.epa.a
            boolean r0 = defpackage.tpa.f(r3, r0)
            if (r0 != 0) goto L70
            boolean r0 = r3 instanceof defpackage.dpa
            if (r0 == 0) goto L6a
            dpa r3 = (defpackage.dpa) r3
            buc r0 = one.me.calllist.ui.page.CallHistoryPageScreen.u0
            one.me.calllist.ui.page.CallHistoryPageScreen r2 = r2.Y
            khe r0 = r2.Z
            java.lang.Object r0 = r0.getValue()
            e81 r0 = (defpackage.e81) r0
            java.util.Map r3 = r3.a
            java.util.Collection r3 = r3.values()
            r0.getClass()
            java.util.List r3 = defpackage.x53.D0(r3)
            r0.E(r3)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.n0()
            m81 r0 = r2.p0()
            boolean r0 = r0.r()
            r3.setRefreshingNext(r0)
            one.me.sdk.lists.widgets.EndlessRecyclerView2 r3 = r2.n0()
            m81 r2 = r2.p0()
            r2.getClass()
            huc r0 = defpackage.v81.b
            r0.getClass()
            v81 r0 = defpackage.v81.c
            v81 r1 = r2.b
            if (r1 != r0) goto L65
            k70 r2 = r2.o
            java.lang.Object r2 = r2.o
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            boolean r2 = r2.isEmpty()
            r0 = 1
            r2 = r2 ^ r0
            if (r2 == 0) goto L65
            goto L66
        L65:
            r0 = 0
        L66:
            r3.setRefreshingPrev(r0)
            goto L70
        L6a:
            kotlin.NoWhenBranchMatchedException r2 = new kotlin.NoWhenBranchMatchedException
            r2.<init>()
            throw r2
        L70:
            e5f r2 = defpackage.e5f.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h81.o(java.lang.Object):java.lang.Object");
    }
}
