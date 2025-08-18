package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class vj7 {
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final je7 k;
    public final je7 l;
    public final je7 m;
    public final je7 n;
    public final je7 o;
    public final je7 p;
    public final je7 q;
    public final String r = vj7.class.getName();

    public vj7(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, je7 je7Var13, je7 je7Var14, je7 je7Var15, je7 je7Var16, je7 je7Var17) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var6;
        this.d = je7Var4;
        this.e = je7Var7;
        this.f = je7Var3;
        this.g = je7Var8;
        this.h = je7Var9;
        this.i = je7Var10;
        this.j = je7Var5;
        this.k = je7Var11;
        this.l = je7Var12;
        this.m = je7Var13;
        this.n = je7Var14;
        this.o = je7Var15;
        this.p = je7Var16;
        this.q = je7Var17;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static final java.lang.Object a(defpackage.vj7 r44, defpackage.on5 r45, android.net.Uri r46, kotlin.coroutines.Continuation r47) {
        /*
            Method dump skipped, instructions count: 1986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.a(vj7, on5, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x018a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x018b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.on5 r21, android.net.Uri r22, long r23, long r25, long r27, kotlin.coroutines.Continuation r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.b(on5, android.net.Uri, long, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final iy2 c() {
        return (iy2) this.f.getValue();
    }

    public final String d(Uri uri) {
        se5 se5Var = (se5) ((qe5) this.l.getValue());
        se5Var.getClass();
        if (!se5Var.n(PmsKey.f36esiaenabled, false) || uri == null) {
            return null;
        }
        ((fl7) this.d.getValue()).getClass();
        String queryParameter = uri.getQueryParameter("externalCallback");
        if (queryParameter != null && queryParameter.equals("1")) {
            return uri.toString();
        }
        return null;
    }

    public final ac e(Uri uri) {
        return new ac(new mqc(new hj7(this, uri, null)), 18, new vp5(this, (Continuation) null, 5));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.on5 r21, android.net.Uri r22, defpackage.e52 r23, long r24, defpackage.mg4 r26, kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            r1 = r23
            r2 = r27
            boolean r3 = r2 instanceof defpackage.jj7
            if (r3 == 0) goto L19
            r3 = r2
            jj7 r3 = (defpackage.jj7) r3
            int r4 = r3.v0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.v0 = r4
            goto L1e
        L19:
            jj7 r3 = new jj7
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.t0
            tx3 r4 = defpackage.tx3.a
            int r5 = r3.v0
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L49
            if (r5 == r7) goto L39
            if (r5 != r6) goto L31
            defpackage.od2.a0(r2)
            goto Lb6
        L31:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L39:
            long r0 = r3.s0
            e52 r5 = r3.Z
            android.net.Uri r7 = r3.Y
            on5 r8 = r3.X
            vj7 r9 = r3.o
            defpackage.od2.a0(r2)
            r10 = r0
            r1 = r5
            goto L96
        L49:
            defpackage.od2.a0(r2)
            je7 r2 = r0.g
            java.lang.Object r2 = r2.getValue()
            r8 = r2
            hc2 r8 = (defpackage.hc2) r8
            long r9 = r1.a
            k92 r2 = r1.b
            long r11 = r2.a
            long r15 = r23.i(r24, r26)
            r17 = 0
            r13 = r24
            r19 = r26
            long r8 = defpackage.hc2.b(r8, r9, r11, r13, r15, r17, r19)
            je7 r2 = r0.h
            java.lang.Object r2 = r2.getValue()
            gc2 r2 = (defpackage.gc2) r2
            kld r2 = r2.a
            g00 r5 = new g00
            r10 = 2
            r5.<init>(r2, r8, r10)
            r3.o = r0
            r2 = r21
            r3.X = r2
            r8 = r22
            r3.Y = r8
            r3.Z = r1
            r9 = r24
            r3.s0 = r9
            r3.v0 = r7
            java.lang.Object r5 = defpackage.od2.A(r5, r3)
            if (r5 != r4) goto L92
            return r4
        L92:
            r7 = r8
            r10 = r9
            r9 = r0
            r8 = r2
        L96:
            long r0 = r1.a
            r2 = 0
            r3.o = r2
            r3.X = r2
            r3.Y = r2
            r3.Z = r2
            r3.v0 = r6
            r20 = r9
            r21 = r8
            r22 = r7
            r23 = r0
            r25 = r10
            r27 = r3
            java.lang.Object r0 = r20.k(r21, r22, r23, r25, r27)
            if (r0 != r4) goto Lb6
            return r4
        Lb6:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.f(on5, android.net.Uri, e52, long, mg4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.on5 r11, defpackage.cl7 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.kj7
            if (r0 == 0) goto L13
            r0 = r13
            kj7 r0 = (defpackage.kj7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kj7 r0 = new kj7
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 3
            if (r2 == 0) goto L42
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r7) goto L30
            defpackage.od2.a0(r13)
            goto L87
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            defpackage.od2.a0(r13)
            goto L79
        L3c:
            on5 r11 = r0.o
            defpackage.od2.a0(r13)
            goto L63
        L42:
            defpackage.od2.a0(r13)
            java.lang.String r12 = r12.X
            int r13 = defpackage.ft4.o
            kt4 r13 = defpackage.kt4.SECONDS
            long r8 = defpackage.z7.R(r7, r13)
            oj7 r13 = new oj7
            r13.<init>(r10, r12, r6)
            r0.o = r11
            r0.Z = r5
            long r8 = defpackage.j47.p0(r8)
            java.lang.Object r13 = defpackage.fp3.I(r8, r13, r0)
            if (r13 != r1) goto L63
            return r1
        L63:
            at5 r13 = (defpackage.at5) r13
            if (r13 == 0) goto L7a
            ti7 r10 = new ti7
            java.lang.String r12 = r13.a
            r10.<init>(r12)
            r0.o = r6
            r0.Z = r4
            java.lang.Object r10 = r11.a(r10, r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            return r3
        L7a:
            dj7 r10 = defpackage.dj7.a
            r0.o = r6
            r0.Z = r7
            java.lang.Object r10 = r11.a(r10, r0)
            if (r10 != r1) goto L87
            return r1
        L87:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.g(on5, cl7, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Uri h(Uri uri) {
        String scheme = uri.getScheme();
        je7 je7Var = this.d;
        return eae.k0(scheme, ((fl7) je7Var.getValue()).b, false) ? uri.buildUpon().scheme(((fl7) je7Var.getValue()).a).build() : uri;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00eb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.on5 r21, defpackage.dl7 r22, android.net.Uri r23, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 788
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.i(on5, dl7, android.net.Uri, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.on5 r18, android.net.Uri r19, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.j(on5, android.net.Uri, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.on5 r21, android.net.Uri r22, long r23, long r25, kotlin.coroutines.Continuation r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vj7.k(on5, android.net.Uri, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
