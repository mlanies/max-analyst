package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.mediabar.MediaBarWidget;

/* loaded from: classes.dex */
public final class e68 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MediaBarWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e68(Continuation continuation, MediaBarWidget mediaBarWidget) {
        super(2, continuation);
        this.Y = mediaBarWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e68 e68Var = (e68) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        e68Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e68 e68Var = new e68(continuation, this.Y);
        e68Var.X = obj;
        return e68Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            r0 = 1
            defpackage.od2.a0(r7)
            java.lang.Object r7 = r6.X
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            r1 = 0
            one.me.chatscreen.mediabar.MediaBarWidget r6 = r6.Y
            if (r7 != 0) goto L20
            bc7[] r7 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            p58 r7 = r6.B0()
            boolean r7 = r7.s()
            if (r7 == 0) goto L1e
            goto L20
        L1e:
            r7 = r1
            goto L21
        L20:
            r7 = r0
        L21:
            bc7[] r2 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            f6b r2 = r6.x0()
            d6b r2 = r2.getScrollState()
            d6b r3 = defpackage.d6b.a
            if (r2 != r3) goto L31
            r2 = r0
            goto L32
        L31:
            r2 = r1
        L32:
            sv8 r3 = r6.w0()
            r4 = 8
            if (r7 == 0) goto L3c
            r5 = r1
            goto L3d
        L3c:
            r5 = r4
        L3d:
            r3.setVisibility(r5)
            bc7[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.d1
            r5 = 16
            r3 = r3[r5]
            qm0 r3 = r6.P0
            java.lang.Object r3 = r3.getValue()
            w12 r3 = (defpackage.w12) r3
            r5 = r7 ^ 1
            if (r5 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            r3.setVisibility(r1)
            znc r1 = r6.v0()
            boolean r1 = r1.n()
            if (r1 == 0) goto L6f
            if (r7 == 0) goto L65
            if (r2 == 0) goto L6f
        L65:
            p58 r6 = r6.B0()
            h7b r6 = r6.v0
            r6.z(r0)
            goto L82
        L6f:
            if (r7 == 0) goto L73
            if (r2 == 0) goto L82
        L73:
            int r7 = defpackage.vc7.a
            int r7 = defpackage.vc7.c
            boolean r7 = defpackage.vc7.b(r7)
            if (r7 == 0) goto L82
            tz5 r6 = r6.a1
            r6.m()
        L82:
            e5f r6 = defpackage.e5f.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e68.o(java.lang.Object):java.lang.Object");
    }
}
