package defpackage;

import android.content.Context;
import android.os.Build;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class te8 extends pnf {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final d86 b;
    public final q3d c;
    public final s86 o;
    public final je7 s0;
    public final dua t0;
    public final dua u0;
    public final s35 v0;
    public final w7c w0;

    public te8(d86 d86Var, q3d q3dVar, s86 s86Var) {
        he8 he8Var = he8.a;
        khe kheVarD = he8Var.getAccessor().d(kke.class);
        khe kheVarD2 = he8Var.getAccessor().d(zi5.class);
        khe kheVarD3 = he8Var.getAccessor().d(y7d.class);
        khe kheVarD4 = he8Var.getAccessor().d(Context.class);
        this.b = d86Var;
        this.c = q3dVar;
        this.o = s86Var;
        this.X = kheVarD;
        this.Y = kheVarD2;
        this.Z = kheVarD3;
        this.s0 = kheVarD4;
        String[] strArr = eua.m;
        dua duaVar = new dua(strArr);
        this.t0 = duaVar;
        dua duaVar2 = new dua(Build.VERSION.SDK_INT >= 34 ? new String[]{"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"} : strArr);
        this.u0 = duaVar2;
        this.v0 = new s35(0);
        int i = 3;
        Continuation continuation = null;
        this.w0 = od2.X(new t03(new ac(new j31(new j31(duaVar, duaVar2, new i58(i, continuation, 2), 4), q3dVar.Z, new xi1(i, continuation, 3), 4), 29, this), 11), this.a, wld.a, new et3(new eqe(d86Var.s0 ? dda.b : dda.a)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object q(defpackage.te8 r5, java.io.File r6, android.net.Uri r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof defpackage.qe8
            if (r0 == 0) goto L13
            r0 = r8
            qe8 r0 = (defpackage.qe8) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qe8 r0 = new qe8
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            te8 r5 = r0.o
            defpackage.od2.a0(r8)     // Catch: java.lang.Throwable -> L2b
            goto L5f
        L2b:
            r6 = move-exception
            goto L61
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r8)
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> L2b
            if (r8 != 0) goto L5f
            if (r7 == 0) goto L5f
            je7 r8 = r5.s0     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L2b
            android.content.Context r8 = (android.content.Context) r8     // Catch: java.lang.Throwable -> L2b
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r7 = r8.openInputStream(r7)     // Catch: java.lang.Throwable -> L2b
            if (r7 == 0) goto L5f
            kj6 r8 = defpackage.kj6.o     // Catch: java.lang.Throwable -> L2b
            r0.o = r5     // Catch: java.lang.Throwable -> L2b
            r0.Z = r4     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r6 = r8.q(r6, r7, r0)     // Catch: java.lang.Throwable -> L2b
            if (r6 != r1) goto L5f
            goto L7a
        L5f:
            r7 = r3
            goto L66
        L61:
            njc r7 = new njc
            r7.<init>(r6)
        L66:
            java.lang.Throwable r6 = defpackage.pjc.a(r7)
            if (r6 == 0) goto L79
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getName()
            java.lang.String r7 = "failed to copy picked image"
            defpackage.hm9.p(r5, r7, r6)
        L79:
            r1 = r3
        L7a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.te8.q(te8, java.io.File, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
