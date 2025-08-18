package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qrc {
    public final uuc a;
    public final nx3 b;
    public final qra c;

    public qrc(uuc uucVar, nx3 nx3Var, qra qraVar) {
        this.a = uucVar;
        this.b = nx3Var;
        this.c = qraVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Comparable a(defpackage.qrc r11, java.lang.String r12, boolean r13, boolean r14, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrc.a(qrc, java.lang.String, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Comparable");
    }

    public static Object c(qrc qrcVar, String str, boolean z, Continuation continuation) {
        qrcVar.getClass();
        return j47.t0(qrcVar.b, new nrc(qrcVar, str, z, false, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, boolean r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof defpackage.mrc
            if (r0 == 0) goto L13
            r0 = r14
            mrc r0 = (defpackage.mrc) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            mrc r0 = new mrc
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L30
            if (r2 != r10) goto L28
            defpackage.od2.a0(r14)
            goto L4f
        L28:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L30:
            defpackage.od2.a0(r14)
            r0.Y = r10
            xq9 r14 = defpackage.xq9.a
            nx3 r2 = r11.b
            lx3 r14 = r14.plus(r2)
            orc r2 = new orc
            r8 = 0
            r3 = r2
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r14 = defpackage.j47.t0(r14, r2, r0)
            if (r14 != r1) goto L4f
            return r1
        L4f:
            if (r14 == 0) goto L52
            r9 = r10
        L52:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qrc.b(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri d(vuc vucVar, boolean z, boolean z2) {
        uuc uucVar = this.a;
        if (!z2) {
            return ((yd) uucVar).c(vucVar, uucVar.b(z));
        }
        String strB = uucVar.b(z);
        qra qraVar = ((yd) uucVar).c;
        StringBuilder sbL = au1.l(qraVar.a.getCacheDir().getPath());
        sbL.append(qra.b);
        String string = sbL.toString();
        try {
            File file = new File(string);
            if (!file.exists()) {
                file.mkdirs();
            }
        } catch (IOException e) {
            hm9.r("PathHelper", e, rh4.k("Failed to create dir=", string, " due to: ", e.getMessage()), new Object[0]);
        }
        File file2 = new File(string, strB);
        vucVar.f(file2);
        Context context = qraVar.a;
        return FileProvider.d(context, file2, context.getPackageName() + ".provider");
    }

    public final Object e(wv6 wv6Var, boolean z, boolean z2, lrc lrcVar) {
        sy1 sy1Var = new sy1(1, v3c.u(lrcVar));
        sy1Var.n();
        try {
            g0 g0VarA = s36.o().a(wv6Var, null);
            g0VarA.m(new prc(g0VarA, sy1Var, this, z2, z), qq1.a);
        } catch (Throwable th) {
            hm9.p("qrc", "onNewResultImpl: failed to save image", th);
            sy1Var.resumeWith(null);
        }
        return sy1Var.m();
    }
}
