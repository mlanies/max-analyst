package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes.dex */
public final class tda {
    public final Context a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;

    public tda(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, Context context) {
        this.a = context;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
    }

    public final gt9 a() {
        return (gt9) this.e.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.e52 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.pda
            if (r0 == 0) goto L13
            r0 = r6
            pda r0 = (defpackage.pda) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            pda r0 = new pda
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            e52 r5 = r0.X
            tda r4 = r0.o
            defpackage.od2.a0(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            qda r6 = new qda
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.fp3.I(r2, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L66
            gt9 r4 = r4.a()
            r4.getClass()
            r5.k0()
            r5.l0()
            java.lang.CharSequence r6 = r5.x0
            long r0 = r5.f()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L66:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tda.b(e52, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.uj3 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.rda
            if (r0 == 0) goto L13
            r0 = r6
            rda r0 = (defpackage.rda) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            rda r0 = new rda
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            uj3 r5 = r0.X
            tda r4 = r0.o
            defpackage.od2.a0(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            defpackage.od2.a0(r6)
            sda r6 = new sda
            r2 = 0
            r6.<init>(r4, r5, r2)
            r0.o = r4
            r0.X = r5
            r0.s0 = r3
            r2 = 200(0xc8, double:9.9E-322)
            java.lang.Object r6 = defpackage.fp3.I(r2, r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            android.graphics.Bitmap r6 = (android.graphics.Bitmap) r6
            if (r6 != 0) goto L62
            gt9 r4 = r4.a()
            r4.getClass()
            java.lang.CharSequence r6 = r5.m()
            long r0 = r5.n()
            android.graphics.Bitmap r6 = r4.e(r6, r0)
        L62:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tda.c(uj3, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final int d() {
        return qp4.u0.b(this.a).i().b().a.m;
    }

    public final int e() {
        return Long.hashCode(((p7b) ((m7b) this.b.getValue())).a.t());
    }

    public final dv9 f(String str, boolean z) {
        if (str.length() == 0) {
            return null;
        }
        return new dv9(str, z, new Uri.Builder().scheme("content").authority("one.me.android.notifications").appendPath("message_image").appendPath(str).appendPath(String.valueOf(z)).build());
    }
}
