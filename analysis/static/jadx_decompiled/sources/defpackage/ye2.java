package defpackage;

import android.content.Context;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class ye2 extends pnf {
    public final xe2 A0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final Context b;
    public final kke c;
    public final qrc o;
    public final je7 s0;
    public final je7 t0;
    public final kld u0;
    public final v7c v0;
    public final q0e w0;
    public final w7c x0;
    public vxd y0;
    public final AtomicReference z0;

    public ye2(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, Context context, kke kkeVar, qrc qrcVar) {
        this.b = context;
        this.c = kkeVar;
        this.o = qrcVar;
        this.X = je7Var;
        this.Y = je7Var2;
        this.Z = je7Var3;
        this.s0 = je7Var4;
        this.t0 = je7Var5;
        kld kldVarA = lld.a(1, Integer.MAX_VALUE, 2);
        this.u0 = kldVarA;
        this.v0 = new v7c(kldVarA);
        q0e q0eVarA = r0e.a(Float.valueOf(0.0f));
        this.w0 = q0eVarA;
        this.x0 = new w7c(q0eVarA);
        this.z0 = new AtomicReference(null);
        this.A0 = new xe2(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.ye2 r22, java.lang.String r23, defpackage.k20 r24, defpackage.cu8 r25, kotlin.coroutines.Continuation r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.q(ye2, java.lang.String, k20, cu8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static int u(en4 en4Var, boolean z) {
        switch (en4Var.ordinal()) {
            case 0:
                return p0c.media_share_dialog_share_video_fail;
            case 1:
            case 3:
            case 5:
                return z ? p0c.media_share_dialog_download_media_fail_not_enough_space : p0c.media_share_dialog_download_media_fail;
            case 2:
                return p0c.media_share_dialog_share_photo_fail;
            case 4:
                return p0c.media_share_dialog_share_gif_fail;
            case 6:
                return p0c.media_share_dialog_share_file_fail;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void r() {
        pnf.n(this, ((w9a) this.c).b().plus(xq9.a), null, new pe2(this, null), 2);
        vxd vxdVar = this.y0;
        if (vxdVar != null) {
            vxdVar.cancel((CancellationException) null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(java.lang.String r12, defpackage.s10 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.se2
            if (r0 == 0) goto L14
            r0 = r14
            se2 r0 = (defpackage.se2) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.t0 = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            se2 r0 = new se2
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r7.Z
            tx3 r0 = defpackage.tx3.a
            int r1 = r7.t0
            e5f r8 = defpackage.e5f.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L4b
            if (r1 == r4) goto L3f
            if (r1 == r3) goto L3b
            if (r1 != r2) goto L33
            defpackage.od2.a0(r14)
            goto Lc1
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            defpackage.od2.a0(r14)
            goto L90
        L3f:
            s10 r13 = r7.Y
            java.lang.String r12 = r7.X
            ye2 r11 = r7.o
            defpackage.od2.a0(r14)     // Catch: java.lang.Throwable -> L49
            goto L6e
        L49:
            r14 = move-exception
            goto L71
        L4b:
            defpackage.od2.a0(r14)
            tq2 r14 = new tq2
            long r9 = r13.a
            r1 = 14
            r6 = 0
            r14.<init>(r9, r1, r6)
            te2 r1 = new te2     // Catch: java.lang.Throwable -> L49
            r1.<init>(r11, r14, r5)     // Catch: java.lang.Throwable -> L49
            r7.o = r11     // Catch: java.lang.Throwable -> L49
            r7.X = r12     // Catch: java.lang.Throwable -> L49
            r7.Y = r13     // Catch: java.lang.Throwable -> L49
            r7.t0 = r4     // Catch: java.lang.Throwable -> L49
            r9 = 30000(0x7530, double:1.4822E-319)
            java.lang.Object r14 = defpackage.fp3.H(r9, r1, r7)     // Catch: java.lang.Throwable -> L49
            if (r14 != r0) goto L6e
            return r0
        L6e:
            yg5 r14 = (defpackage.yg5) r14     // Catch: java.lang.Throwable -> L49
            goto L77
        L71:
            njc r1 = new njc
            r1.<init>(r14)
            r14 = r1
        L77:
            boolean r1 = r14 instanceof defpackage.njc
            if (r1 == 0) goto L7c
            r14 = r5
        L7c:
            yg5 r14 = (defpackage.yg5) r14
            if (r14 != 0) goto L91
            xe2 r11 = r11.A0
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.t0 = r3
            r11.a()
            if (r8 != r0) goto L90
            return r0
        L90:
            return r8
        L91:
            je7 r1 = r11.Y
            java.lang.Object r1 = r1.getValue()
            dfe r1 = (defpackage.dfe) r1
            java.lang.String r14 = r14.c
            je7 r3 = r11.s0
            java.lang.Object r3 = r3.getValue()
            zi5 r3 = (defpackage.zi5) r3
            java.lang.String r13 = r13.c
            kk5 r3 = (defpackage.kk5) r3
            java.io.File r3 = r3.i(r13)
            r7.o = r5
            r7.X = r5
            r7.Y = r5
            r7.t0 = r2
            efe r1 = r1.a
            xe2 r4 = r11.A0
            r6 = 0
            r2 = r14
            r5 = r12
            java.lang.Object r11 = r1.a(r2, r3, r4, r5, r6, r7)
            if (r11 != r0) goto Lc1
            return r0
        Lc1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ye2.s(java.lang.String, s10, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void t(boolean z) {
        ne2 ne2Var = (ne2) this.z0.get();
        if (ne2Var == null) {
            return;
        }
        r();
        this.u0.g(new in4(u(ne2Var.d, z)));
    }
}
