package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class vhf {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final ContextScope h;
    public final kld j;
    public final v7c k;
    public final String g = vhf.class.getName();
    public final ConcurrentHashMap.KeySetView i = ConcurrentHashMap.newKeySet();

    public vhf(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var7;
        this.h = j1e.a(((w9a) ((kke) je7Var6.getValue())).b().plus(f46.a()));
        kld kldVarB = lld.b(0, 0, 0, 7);
        this.j = kldVarB;
        this.k = new v7c(kldVarB);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.vhf r22, long r23, long r25, kotlin.coroutines.Continuation r27) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 555
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.a(vhf, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static String c(long j, long j2) {
        return j + ":" + j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r16, long r18, defpackage.l20 r20, defpackage.gef r21, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            r15 = this;
            r0 = r15
            r1 = r20
            r2 = r22
            boolean r3 = r2 instanceof defpackage.phf
            if (r3 == 0) goto L18
            r3 = r2
            phf r3 = (defpackage.phf) r3
            int r4 = r3.u0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L18
            int r4 = r4 - r5
            r3.u0 = r4
            goto L1d
        L18:
            phf r3 = new phf
            r3.<init>(r15, r2)
        L1d:
            java.lang.Object r2 = r3.s0
            tx3 r12 = defpackage.tx3.a
            int r4 = r3.u0
            r13 = 2
            r14 = 1
            if (r4 == 0) goto L46
            if (r4 == r14) goto L38
            if (r4 != r13) goto L30
            defpackage.od2.a0(r2)
            goto Lb2
        L30:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L38:
            long r0 = r3.Z
            gef r4 = r3.Y
            l20 r5 = r3.X
            vhf r6 = r3.o
            defpackage.od2.a0(r2)
            r1 = r0
            r0 = r6
            goto L72
        L46:
            defpackage.od2.a0(r2)
            je7 r2 = r0.f
            java.lang.Object r2 = r2.getValue()
            r4 = r2
            k6f r4 = (defpackage.k6f) r4
            java.lang.String r9 = r1.r
            d20 r10 = defpackage.d20.X
            r3.o = r0
            r3.X = r1
            r2 = r21
            r3.Y = r2
            r7 = r18
            r3.Z = r7
            r3.u0 = r14
            r5 = r16
            r11 = r3
            java.lang.Object r4 = r4.a(r5, r7, r9, r10, r11)
            if (r4 != r12) goto L6e
            return r12
        L6e:
            r5 = r1
            r4 = r2
            r1 = r18
        L72:
            long r6 = r4.e()
            one r8 = new one
            r8.<init>()
            r8.a = r1
            java.lang.String r1 = r5.r
            r8.b = r1
            r8.c = r6
            android.net.Uri r1 = r4.l()
            java.lang.String r1 = r1.toString()
            r8.g = r1
            r8.h = r14
            r8.n = r14
            pne r1 = new pne
            r1.<init>(r8)
            je7 r2 = r0.d
            java.lang.Object r2 = r2.getValue()
            rf5 r2 = (defpackage.rf5) r2
            t03 r1 = r2.a(r1)
            r2 = 0
            r3.o = r2
            r3.X = r2
            r3.Y = r2
            r3.u0 = r13
            java.lang.Enum r2 = r0.d(r1, r3)
            if (r2 != r12) goto Lb2
            return r12
        Lb2:
            m7g r0 = defpackage.m7g.c
            if (r2 != r0) goto Lb7
            goto Lb8
        Lb7:
            r14 = 0
        Lb8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.b(long, long, l20, gef, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum d(defpackage.t03 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.thf
            if (r0 == 0) goto L13
            r0 = r6
            thf r0 = (defpackage.thf) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            thf r0 = new thf
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.o
            tx3 r6 = defpackage.tx3.a
            int r1 = r0.Y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L28
            defpackage.od2.a0(r4)
            goto L42
        L28:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L30:
            defpackage.od2.a0(r4)
            uhf r4 = new uhf
            r1 = 2
            r4.<init>(r1, r2)
            r0.Y = r3
            java.lang.Object r4 = defpackage.od2.z(r5, r4, r0)
            if (r4 != r6) goto L42
            return r6
        L42:
            n7g r4 = (defpackage.n7g) r4
            if (r4 == 0) goto L48
            m7g r2 = r4.b
        L48:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vhf.d(t03, kotlin.coroutines.Continuation):java.lang.Enum");
    }
}
