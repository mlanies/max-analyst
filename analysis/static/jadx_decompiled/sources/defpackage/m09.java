package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class m09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        m09 m09Var = (m09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        m09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        m09 m09Var = new m09(continuation, this.Y);
        m09Var.X = obj;
        return m09Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r4) throws java.lang.Throwable {
        /*
            r3 = this;
            r0 = 0
            defpackage.od2.a0(r4)
            java.lang.Object r4 = r3.X
            p35 r4 = (defpackage.p35) r4
            if (r4 == 0) goto Lf
            java.lang.Object r4 = r4.a
            ty8 r4 = (defpackage.ty8) r4
            goto L10
        Lf:
            r4 = 0
        L10:
            bc7[] r1 = one.me.sdk.messagewrite.MessageWriteWidget.F0
            one.me.sdk.messagewrite.MessageWriteWidget r3 = r3.Y
            if (r4 == 0) goto L1d
            r3.getClass()
            iv8 r4 = r4.a
            if (r4 != 0) goto L1f
        L1d:
            iv8 r4 = defpackage.iv8.a
        L1f:
            sv8 r1 = r3.q0()
            r1.setEmojiExpandableState(r4)
            iv8 r1 = defpackage.iv8.b
            if (r4 != r1) goto L41
            sv8 r4 = r3.q0()
            zz8 r1 = new zz8
            r2 = 4
            r1.<init>(r3, r2)
            qv8 r3 = r4.c
            r3.setShowSoftInputOnFocus(r0)
            gv8 r4 = new gv8
            r4.<init>(r0, r1)
            r3.setOnFocusChangeListener(r4)
        L41:
            e5f r3 = defpackage.e5f.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m09.o(java.lang.Object):java.lang.Object");
    }
}
