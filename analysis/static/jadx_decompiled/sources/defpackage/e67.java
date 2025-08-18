package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final class e67 extends ffe implements a66 {
    public InviteByQrBottomSheet X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ InviteByQrBottomSheet s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e67(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.s0 = inviteByQrBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        e67 e67Var = new e67(this.s0, continuation);
        e67Var.Z = obj;
        return e67Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r9.Y
            e5f r2 = defpackage.e5f.a
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r3 = r9.s0
            r4 = 1
            if (r1 == 0) goto L21
            if (r1 != r4) goto L19
            one.me.inviteactions.invitebyqr.InviteByQrBottomSheet r0 = r9.X
            java.lang.Object r9 = r9.Z
            sx3 r9 = (defpackage.sx3) r9
            defpackage.od2.a0(r10)     // Catch: java.lang.Throwable -> L17
            goto L57
        L17:
            r10 = move-exception
            goto L76
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L21:
            defpackage.od2.a0(r10)
            java.lang.Object r10 = r9.Z
            sx3 r10 = (defpackage.sx3) r10
            bc7[] r1 = one.me.inviteactions.invitebyqr.InviteByQrBottomSheet.G0     // Catch: java.lang.Throwable -> L74
            je7 r1 = r3.D0     // Catch: java.lang.Throwable -> L74
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L74
            h67 r1 = (defpackage.h67) r1     // Catch: java.lang.Throwable -> L74
            r9.Z = r10     // Catch: java.lang.Throwable -> L74
            r9.X = r3     // Catch: java.lang.Throwable -> L74
            r9.Y = r4     // Catch: java.lang.Throwable -> L74
            je7 r5 = r1.Y     // Catch: java.lang.Throwable -> L74
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L74
            kke r5 = (defpackage.kke) r5     // Catch: java.lang.Throwable -> L74
            w9a r5 = (defpackage.w9a) r5     // Catch: java.lang.Throwable -> L74
            nx3 r5 = r5.b()     // Catch: java.lang.Throwable -> L74
            g67 r6 = new g67     // Catch: java.lang.Throwable -> L74
            r7 = 0
            r6.<init>(r1, r7)     // Catch: java.lang.Throwable -> L74
            java.lang.Object r9 = defpackage.j47.t0(r5, r6, r9)     // Catch: java.lang.Throwable -> L74
            if (r9 != r0) goto L53
            return r0
        L53:
            r0 = r3
            r8 = r10
            r10 = r9
            r9 = r8
        L57:
            android.net.Uri r10 = (android.net.Uri) r10     // Catch: java.lang.Throwable -> L17
            if (r10 != 0) goto L5c
            return r2
        L5c:
            khe r1 = r0.F0     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L17
            cn3 r1 = (defpackage.cn3) r1     // Catch: java.lang.Throwable -> L17
            android.content.Context r5 = r0.getContext()     // Catch: java.lang.Throwable -> L17
            r1.a(r5, r10)     // Catch: java.lang.Throwable -> L17
            r0.s0(r4)     // Catch: java.lang.Throwable -> L17
            r0 = r2
            goto L7b
        L70:
            r8 = r10
            r10 = r9
            r9 = r8
            goto L76
        L74:
            r9 = move-exception
            goto L70
        L76:
            njc r0 = new njc
            r0.<init>(r10)
        L7b:
            java.lang.Throwable r10 = defpackage.pjc.a(r0)
            if (r10 == 0) goto L99
            java.lang.Class r9 = r9.getClass()
            java.lang.String r9 = r9.getName()
            java.lang.String r0 = "shareQrCode: failed to share qr code"
            defpackage.hm9.p(r9, r0, r10)
            je7 r9 = r3.B0
            java.lang.Object r9 = r9.getValue()
            wha r9 = (defpackage.wha) r9
            r9.i()
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e67.o(java.lang.Object):java.lang.Object");
    }
}
