package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gs2 extends ffe implements a66 {
    public File X;
    public int Y;
    public /* synthetic */ Object Z;
    public final /* synthetic */ ks2 s0;
    public final /* synthetic */ Uri t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs2(ks2 ks2Var, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.s0 = ks2Var;
        this.t0 = uri;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((gs2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gs2 gs2Var = new gs2(this.s0, this.t0, continuation);
        gs2Var.Z = obj;
        return gs2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
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
            e5f r2 = defpackage.e5f.a
            r3 = 1
            if (r1 == 0) goto L1f
            if (r1 != r3) goto L17
            java.io.File r0 = r8.X
            java.lang.Object r1 = r8.Z
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L15
            goto L69
        L15:
            r9 = move-exception
            goto L72
        L17:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1f:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Z
            r1 = r9
            sx3 r1 = (defpackage.sx3) r1
            ks2 r9 = r8.s0
            bc7[] r4 = defpackage.ks2.I0
            je7 r9 = r9.s0
            java.lang.Object r9 = r9.getValue()
            kk5 r9 = (defpackage.kk5) r9
            ks2 r4 = r8.s0
            java.lang.String r4 = r4.F0
            java.io.File r9 = r9.q(r4)
            android.net.Uri r4 = r8.t0
            ks2 r5 = r8.s0
            boolean r6 = r9.exists()     // Catch: java.lang.Throwable -> L6b
            if (r6 != 0) goto L70
            if (r4 == 0) goto L70
            je7 r5 = r5.x0     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L6b
            android.content.Context r5 = (android.content.Context) r5     // Catch: java.lang.Throwable -> L6b
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch: java.lang.Throwable -> L6b
            java.io.InputStream r4 = r5.openInputStream(r4)     // Catch: java.lang.Throwable -> L6b
            if (r4 == 0) goto L70
            kj6 r5 = defpackage.kj6.o     // Catch: java.lang.Throwable -> L6b
            r8.Z = r1     // Catch: java.lang.Throwable -> L6b
            r8.X = r9     // Catch: java.lang.Throwable -> L6b
            r8.Y = r3     // Catch: java.lang.Throwable -> L6b
            java.lang.Object r4 = r5.q(r9, r4, r8)     // Catch: java.lang.Throwable -> L6b
            if (r4 != r0) goto L68
            return r0
        L68:
            r0 = r9
        L69:
            r9 = r0
            goto L70
        L6b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L72
        L70:
            r4 = r2
            goto L78
        L72:
            njc r4 = new njc
            r4.<init>(r9)
            r9 = r0
        L78:
            ks2 r0 = r8.s0
            java.lang.Throwable r4 = defpackage.pjc.a(r4)
            if (r4 == 0) goto L90
            r0.u()
            java.lang.Class r0 = r1.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r1 = "failed to copy picked image, e:"
            defpackage.hm9.p(r0, r1, r4)
        L90:
            ks2 r0 = r8.s0
            y7d r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            defpackage.j47.c0(r0, r1, r1)
            ks2 r0 = r8.s0
            y7d r0 = r0.o
            java.lang.String r1 = r9.getAbsolutePath()
            defpackage.j47.a0(r0, r1)
            android.content.Intent r0 = new android.content.Intent
            ks2 r1 = r8.s0
            je7 r1 = r1.x0
            java.lang.Object r1 = r1.getValue()
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Class<ru.ok.messages.views.ActAvatarCrop> r4 = ru.ok.messages.views.ActAvatarCrop.class
            r0.<init>(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.URI"
            android.net.Uri r4 = android.net.Uri.fromFile(r9)
            r0.putExtra(r1, r4)
            java.lang.String r1 = "ru.ok.tamtam.extra.FILE_PATH"
            java.lang.String r9 = r9.getAbsolutePath()
            r0.putExtra(r1, r9)
            java.lang.String r9 = "ru.ok.tamtam.extra.SHOW_RECAPTURE"
            r0.putExtra(r9, r3)
            java.lang.String r9 = "ru.ok.tamtam.extra.FOR_CHAT_BACKGROUND"
            r1 = 0
            r0.putExtra(r9, r1)
            ks2 r8 = r8.s0
            s35 r8 = r8.A0
            or2 r9 = new or2
            r9.<init>(r0)
            defpackage.pnf.o(r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gs2.o(java.lang.Object):java.lang.Object");
    }
}
