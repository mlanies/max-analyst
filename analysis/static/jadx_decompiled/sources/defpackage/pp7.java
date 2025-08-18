package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class pp7 implements p26 {
    public static final /* synthetic */ bc7[] i;
    public final ContextScope c;
    public final int g;
    public volatile long h;
    public m26 a = m26.d;
    public final String b = pp7.class.getName();
    public final q0e d = r0e.a(nz4.a);
    public final w4d e = mqd.D();
    public final khe f = new khe(new m57(15));

    static {
        oi9 oi9Var = new oi9(pp7.class, "framesJob", "getFramesJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public pp7(kke kkeVar, gta gtaVar) {
        int i2;
        this.c = j1e.a(((w9a) kkeVar).b().plus(new qj(this)));
        int iOrdinal = gtaVar.a.ordinal();
        if (iOrdinal == 0) {
            i2 = 5;
        } else if (iOrdinal == 1) {
            i2 = 10;
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 20;
        }
        this.g = i2;
    }

    @Override // defpackage.p26
    public final m26 c() {
        return this.a;
    }

    @Override // defpackage.p26
    public final boolean d() {
        gef gefVar = this.a.a;
        if (gefVar == null) {
            return false;
        }
        Uri uriL = gefVar.l();
        int i2 = oaf.a;
        String scheme = uriL.getScheme();
        return TextUtils.isEmpty(scheme) || "file".equals(scheme);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.p26
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(long r10, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.np7
            if (r0 == 0) goto L13
            r0 = r12
            np7 r0 = (defpackage.np7) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            np7 r0 = new np7
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            int r9 = r0.X
            pp7 r10 = r0.o
            defpackage.od2.a0(r12)
            goto L67
        L2b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L33:
            defpackage.od2.a0(r12)
            int r12 = r9.g
            int r12 = r12 - r3
            double r4 = (double) r12
            float r10 = (float) r10
            long r11 = r9.h
            int r2 = r9.g
            long r6 = (long) r2
            long r11 = r11 / r6
            float r11 = (float) r11
            float r10 = r10 / r11
            double r10 = (double) r10
            double r10 = java.lang.Math.floor(r10)
            int r10 = (int) r10
            double r10 = (double) r10
            double r10 = java.lang.Math.min(r4, r10)
            int r10 = (int) r10
            q0e r11 = r9.d
            jp5 r12 = new jp5
            r2 = 3
            r12.<init>(r11, r10, r2)
            r0.o = r9
            r0.X = r10
            r0.s0 = r3
            java.lang.Object r12 = defpackage.od2.C(r12, r0)
            if (r12 != r1) goto L64
            return r1
        L64:
            r8 = r10
            r10 = r9
            r9 = r8
        L67:
            java.util.List r12 = (java.util.List) r12
            if (r12 == 0) goto L7d
            n26 r11 = new n26
            java.lang.Object r9 = r12.get(r9)
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            m26 r10 = r10.a
            int r12 = r10.b
            int r10 = r10.c
            r11.<init>(r12, r10, r9)
            goto L7e
        L7d:
            r11 = 0
        L7e:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp7.e(long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.p26
    public final void prepare() {
        gef gefVar = this.a.a;
        if (gefVar == null) {
            hm9.p(this.b, "You should call init before prepare!", null);
            return;
        }
        vxd vxdVarT = j47.T(this.c, null, null, new op7(this, gefVar, null), 3);
        this.e.o1(this, i[0], vxdVarT);
    }
}
