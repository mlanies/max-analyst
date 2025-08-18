package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;

/* loaded from: classes2.dex */
public final class j67 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ InviteFriendsToMaxBottomSheet Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j67(InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.Z = inviteFriendsToMaxBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((j67) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        j67 j67Var = new j67(this.Z, continuation);
        j67Var.Y = obj;
        return j67Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 0
            r3 = 1
            one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet r4 = r8.Z
            if (r1 == 0) goto L20
            if (r1 != r3) goto L18
            java.lang.Object r8 = r8.Y
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L15
            goto L8b
        L15:
            r9 = move-exception
            goto L94
        L18:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L20:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            sx3 r9 = (defpackage.sx3) r9
            android.content.Context r9 = r4.getContext()
            je7 r1 = r4.z0
            java.lang.Object r1 = r1.getValue()
            y7d r1 = (defpackage.y7d) r1
            qyc r1 = (defpackage.qyc) r1
            ne7 r5 = r1.g
            java.lang.String r6 = "invite-long"
            java.lang.String r5 = r5.getString(r6, r2)
            if (r5 == 0) goto L41
            r9 = r5
            goto L57
        L41:
            int r5 = defpackage.dpc.C
            java.lang.String r9 = r9.getString(r5)
            java.lang.String r1 = r1.p()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            java.lang.String r9 = java.lang.String.format(r9, r1)
        L57:
            android.content.Context r1 = r4.getContext()
            java.lang.String r5 = r9.toString()
            defpackage.tpa.o(r1, r5)
            je7 r1 = r4.B0     // Catch: java.lang.Throwable -> L92
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L92
            h67 r1 = (defpackage.h67) r1     // Catch: java.lang.Throwable -> L92
            r8.Y = r9     // Catch: java.lang.Throwable -> L92
            r8.X = r3     // Catch: java.lang.Throwable -> L92
            je7 r5 = r1.Y     // Catch: java.lang.Throwable -> L92
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L92
            kke r5 = (defpackage.kke) r5     // Catch: java.lang.Throwable -> L92
            w9a r5 = (defpackage.w9a) r5     // Catch: java.lang.Throwable -> L92
            nx3 r5 = r5.b()     // Catch: java.lang.Throwable -> L92
            g67 r6 = new g67     // Catch: java.lang.Throwable -> L92
            r6.<init>(r1, r2)     // Catch: java.lang.Throwable -> L92
            java.lang.Object r8 = defpackage.j47.t0(r5, r6, r8)     // Catch: java.lang.Throwable -> L92
            if (r8 != r0) goto L88
            return r0
        L88:
            r7 = r9
            r9 = r8
            r8 = r7
        L8b:
            android.net.Uri r9 = (android.net.Uri) r9     // Catch: java.lang.Throwable -> L15
            goto L9a
        L8e:
            r7 = r9
            r9 = r8
            r8 = r7
            goto L94
        L92:
            r8 = move-exception
            goto L8e
        L94:
            njc r0 = new njc
            r0.<init>(r9)
            r9 = r0
        L9a:
            boolean r0 = r9 instanceof defpackage.njc
            if (r0 == 0) goto L9f
            goto La0
        L9f:
            r2 = r9
        La0:
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r9 = defpackage.o37.a
            android.content.Context r9 = r4.getContext()
            defpackage.o37.d(r9, r8, r2)
            je7 r8 = r4.A0
            java.lang.Object r8 = r8.getValue()
            l67 r8 = (defpackage.l67) r8
            java.lang.String r9 = "clicked_to_invite"
            java.lang.String r0 = "main"
            java.lang.String r1 = "trigger_max"
            r8.a(r9, r0, r1)
            je7 r8 = r4.y0
            java.lang.Object r8 = r8.getValue()
            q33 r8 = (defpackage.q33) r8
            hyc r8 = (defpackage.hyc) r8
            java.lang.String r9 = "app.already.invited.friends"
            r8.j(r9, r3)
            r4.s0(r3)
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j67.o(java.lang.Object):java.lang.Object");
    }
}
