package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;

/* loaded from: classes2.dex */
public final class u9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddLinkBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u9(Continuation continuation, AddLinkBottomSheet addLinkBottomSheet) {
        super(2, continuation);
        this.Y = addLinkBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        u9 u9Var = (u9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        u9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        u9 u9Var = new u9(continuation, this.Y);
        u9Var.X = obj;
        return u9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
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
            mk7 r4 = (defpackage.mk7) r4
            jqe r0 = r4.b
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r3 = r3.Y
            android.content.Context r1 = r3.getContext()
            java.lang.CharSequence r0 = r0.b(r1)
            if (r0 == 0) goto L2a
            int r1 = r0.length()
            if (r1 != 0) goto L1c
            goto L2a
        L1c:
            cka r1 = r3.x0()
            java.lang.String r0 = r0.toString()
            aka r2 = defpackage.aka.a
            r1.d(r0, r2)
            goto L31
        L2a:
            cka r0 = r3.x0()
            r0.a()
        L31:
            bc7[] r0 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.x0
            r1 = 2
            r0 = r0[r1]
            q7c r1 = r3.u0
            java.lang.Object r3 = r1.T0(r3, r0)
            one.me.sdk.uikit.common.button.OneMeButton r3 = (one.me.sdk.uikit.common.button.OneMeButton) r3
            java.lang.String r0 = r4.a
            int r0 = r0.length()
            if (r0 <= 0) goto L52
            iqe r0 = defpackage.jqe.a
            jqe r4 = r4.b
            boolean r4 = defpackage.tpa.f(r4, r0)
            if (r4 == 0) goto L52
            r4 = 1
            goto L53
        L52:
            r4 = 0
        L53:
            r3.setEnabled(r4)
            e5f r3 = defpackage.e5f.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9.o(java.lang.Object):java.lang.Object");
    }
}
