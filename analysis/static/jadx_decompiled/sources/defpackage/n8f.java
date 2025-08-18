package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import one.me.sdk.transfer.exceptions.HttpErrorException;
import one.me.sdk.transfer.exceptions.HttpUrlExpiredException;

/* loaded from: classes2.dex */
public final class n8f {
    public static final rl8 h;
    public final long a;
    public final int b;
    public final je7 d;
    public final long g;
    public final String c = n8f.class.getName();
    public final aj9 e = bj9.a();
    public final li9 f = new li9();

    static {
        Pattern pattern = rl8.d;
        h = fm9.A("application/octet-stream");
    }

    public n8f(je7 je7Var, w0f w0fVar, long j, int i) {
        this.a = j;
        this.b = i;
        this.d = je7Var;
        int i2 = bh3.$EnumSwitchMapping$0[w0fVar.c().ordinal()];
        this.g = (i2 == 1 || i2 == 2) ? PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE : i2 != 3 ? PlaybackStateCompat.ACTION_PREPARE : PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.i8f
            if (r0 == 0) goto L13
            r0 = r5
            i8f r0 = (defpackage.i8f) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            i8f r0 = new i8f
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aj9 r4 = r0.X
            n8f r0 = r0.o
            defpackage.od2.a0(r5)
            r5 = r4
            r4 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.od2.a0(r5)
            r0.o = r4
            aj9 r5 = r4.e
            r0.X = r5
            r0.s0 = r3
            java.lang.Object r0 = r5.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            int r1 = r4.b     // Catch: java.lang.Throwable -> L52
            r2 = 3
            if (r1 != r2) goto L54
            w6f r4 = r4.b()     // Catch: java.lang.Throwable -> L52
            goto L58
        L52:
            r4 = move-exception
            goto L5c
        L54:
            w6f r4 = r4.c()     // Catch: java.lang.Throwable -> L52
        L58:
            r5.e(r0)
            return r4
        L5c:
            r5.e(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.w6f b() {
        /*
            r22 = this;
            r0 = r22
            li9 r1 = r0.f
            int r2 = r1.b
            r4 = 1
            if (r2 != 0) goto Lb
            r2 = r4
            goto Lc
        Lb:
            r2 = 0
        Lc:
            r5 = 0
            long r7 = r0.a
            long r9 = r0.g
            if (r2 == 0) goto L22
            w6f r0 = new w6f
            long r2 = java.lang.Math.min(r9, r7)
            r0.<init>(r5, r2)
            r1.b(r0)
            goto Lbf
        L22:
            r0 = 0
        L23:
            int r2 = r1.b
            int r2 = r2 - r4
            if (r0 >= r2) goto L6e
            java.lang.Object r2 = r1.c(r0)
            w6f r2 = (defpackage.w6f) r2
            int r11 = r0 + 1
            java.lang.Object r12 = r1.c(r11)
            w6f r12 = (defpackage.w6f) r12
            long r13 = r2.b
            long r5 = r2.c
            int r5 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r5 != 0) goto L6c
            long r5 = r12.b
            long r3 = r12.c
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 != 0) goto L6c
            long r3 = r2.a
            long r3 = r3 + r13
            long r5 = r12.a
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L6c
            r1.d(r11)
            r1.d(r0)
            w6f r3 = new w6f
            long r4 = r12.b
            long r20 = r13 + r4
            long r4 = r2.a
            r15 = r3
            r16 = r4
            r18 = r20
            r15.<init>(r16, r18, r20)
            r1.a(r0, r3)
        L68:
            r4 = 1
            r5 = 0
            goto L23
        L6c:
            r0 = r11
            goto L68
        L6e:
            r3 = 0
        L6f:
            int r0 = r1.b
            r2 = 0
            if (r3 >= r0) goto Lbe
            java.lang.Object r0 = r1.c(r3)
            w6f r0 = (defpackage.w6f) r0
            int r4 = r1.b
            r5 = 1
            int r4 = r4 - r5
            if (r3 == r4) goto L88
            int r2 = r3 + 1
            java.lang.Object r2 = r1.c(r2)
            w6f r2 = (defpackage.w6f) r2
        L88:
            long r4 = r0.a
            long r11 = r0.b
            long r4 = r4 + r11
            if (r2 != 0) goto L9c
            int r0 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r0 >= 0) goto La8
            long r11 = r7 - r4
            long r11 = java.lang.Math.min(r9, r11)
        L99:
            r13 = 0
            goto Lab
        L9c:
            long r11 = r2.a
            int r0 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r0 >= 0) goto La8
            long r11 = r11 - r4
            long r11 = java.lang.Math.min(r9, r11)
            goto L99
        La8:
            r11 = -1
            goto L99
        Lab:
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto Lba
            w6f r0 = new w6f
            r0.<init>(r4, r11)
            r4 = 1
            int r3 = r3 + r4
            r1.a(r3, r0)
            goto Lbf
        Lba:
            r4 = 1
            int r3 = r3 + 1
            goto L6f
        Lbe:
            r0 = r2
        Lbf:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.b():w6f");
    }

    public final w6f c() {
        li9 li9Var = this.f;
        int i = li9Var.b;
        long j = this.a;
        if (i == 0) {
            w6f w6fVar = new w6f(0L, j);
            li9Var.b(w6fVar);
            return w6fVar;
        }
        if (i != 1) {
            return null;
        }
        if (i == 0) {
            throw new NoSuchElementException("ObjectList is empty.");
        }
        long j2 = ((w6f) li9Var.a[0]).b;
        if (j2 == j) {
            return null;
        }
        w6f w6fVar2 = new w6f(j2, j - j2);
        li9Var.b(w6fVar2);
        return w6fVar2;
    }

    public final void d(yic yicVar) throws HttpErrorException {
        Object njcVar;
        try {
            njcVar = yicVar.Y.a("X-Reason");
            if (njcVar == null) {
                njcVar = null;
            }
        } catch (Throwable th) {
            njcVar = new njc(th);
        }
        if (njcVar instanceof njc) {
            njcVar = null;
        }
        eq6 eq6VarJ = nu0.j(yicVar.o, (String) njcVar);
        boolean zM = yicVar.m();
        String str = this.c;
        if (zM || eq6VarJ.equals(nu0.b) || eq6VarJ.equals(nu0.c)) {
            hm9.m0(str, "getErrorUploadPositionFromResponse not loaded yet, starting upload from 0", new Object[0]);
            return;
        }
        boolean zEquals = eq6VarJ.equals(nu0.Z);
        i8c i8cVar = yicVar.Z;
        if (zEquals || eq6VarJ.equals(nu0.X)) {
            hm9.m0(str, "getErrorUploadPositionFromResponse forbidden or bad request: error=" + eq6VarJ, new Object[0]);
            throw new HttpUrlExpiredException("Expired url on GET", eq6VarJ, i8cVar != null ? i8cVar.U() : null);
        }
        hm9.p(str, "getErrorUploadPositionFromResponse error=" + eq6VarJ, null);
        throw new HttpErrorException("Failed receiving upload status", eq6VarJ, i8cVar != null ? i8cVar.U() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.vq6 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.e(vq6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.vq6 r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.k8f
            if (r0 == 0) goto L13
            r0 = r6
            k8f r0 = (defpackage.k8f) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            k8f r0 = new k8f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            n8f r4 = r0.o
            defpackage.od2.a0(r6)
            goto L6c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            defpackage.od2.a0(r6)
            l84 r6 = new l84
            r6.<init>()
            r6.a = r5
            java.util.UUID r5 = java.util.UUID.randomUUID()
            java.lang.String r5 = r5.toString()
            r6.Q(r5)
            ak5 r5 = new ak5
            r2 = 1
            r5.<init>(r2)
            java.lang.String r2 = "POST"
            r6.G(r2, r5)
            mhc r5 = r6.r()
            je7 r6 = r4.d
            java.lang.Object r6 = r6.getValue()
            u2a r6 = (defpackage.u2a) r6
            b8c r5 = r6.b(r5)
            r0.o = r4
            r0.Z = r3
            java.lang.Object r6 = defpackage.ay7.g(r5, r0)
            if (r6 != r1) goto L6c
            return r1
        L6c:
            yic r6 = (defpackage.yic) r6
            boolean r5 = r6.m()
            r0 = 0
            if (r5 == 0) goto La9
            r4.getClass()
            cj6 r5 = r6.Y
            java.lang.String r2 = "X-Last-Known-Byte"
            java.lang.String r5 = r5.a(r2)
            r2 = 0
            if (r5 == 0) goto L85
            goto L86
        L85:
            r5 = r2
        L86:
            if (r5 == 0) goto Lac
            long r5 = java.lang.Long.parseLong(r5)     // Catch: java.lang.NumberFormatException -> L90
            r2 = 1
            long r5 = r5 + r2
            goto Lad
        L90:
            one.me.sdk.transfer.exceptions.HttpUrlExpiredException r4 = new one.me.sdk.transfer.exceptions.HttpUrlExpiredException
            java.lang.String r0 = "Cannot parse range header='"
            java.lang.String r1 = "'"
            java.lang.String r5 = defpackage.zr6.i(r0, r5, r1)
            i8c r6 = r6.Z
            if (r6 == 0) goto La3
            java.lang.String r6 = r6.U()
            goto La4
        La3:
            r6 = r2
        La4:
            r0 = 2
            r4.<init>(r5, r2, r6, r0)
            throw r4
        La9:
            r4.d(r6)
        Lac:
            r5 = r0
        Lad:
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 == 0) goto Lbb
            li9 r4 = r4.f
            w6f r2 = new w6f
            r2.<init>(r0, r5)
            r4.b(r2)
        Lbb:
            e5f r4 = defpackage.e5f.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.f(vq6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00bc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bd A[Catch: all -> 0x009b, TryCatch #6 {all -> 0x009b, blocks: (B:48:0x00b6, B:74:0x0102, B:51:0x00bd, B:53:0x00c3, B:71:0x00ef, B:29:0x0071, B:31:0x007d, B:34:0x0087, B:45:0x00a7), top: B:91:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117 A[Catch: all -> 0x0037, TryCatch #3 {all -> 0x0037, blocks: (B:14:0x0033, B:77:0x010a, B:81:0x011f, B:82:0x0122, B:80:0x0117, B:83:0x0123), top: B:90:0x0025 }] */
    /* JADX WARN: Type inference failed for: r11v0, types: [n8f] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19, types: [xi9] */
    /* JADX WARN: Type inference failed for: r11v23, types: [xi9] */
    /* JADX WARN: Type inference failed for: r11v28 */
    /* JADX WARN: Type inference failed for: r11v3, types: [n8f] */
    /* JADX WARN: Type inference failed for: r11v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.vq6 r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.g(vq6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.m8f
            if (r0 == 0) goto L13
            r0 = r8
            m8f r0 = (defpackage.m8f) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            m8f r0 = new m8f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            aj9 r7 = r0.X
            n8f r0 = r0.o
            defpackage.od2.a0(r8)
            r8 = r7
            r7 = r0
            goto L47
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.od2.a0(r8)
            r0.o = r7
            aj9 r8 = r7.e
            r0.X = r8
            r0.s0 = r3
            java.lang.Object r0 = r8.d(r0)
            if (r0 != r1) goto L47
            return r1
        L47:
            r0 = 0
            li9 r7 = r7.f     // Catch: java.lang.Throwable -> L5d
            java.lang.Object[] r1 = r7.a     // Catch: java.lang.Throwable -> L5d
            int r7 = r7.b     // Catch: java.lang.Throwable -> L5d
            r2 = 0
            r4 = 0
        L51:
            if (r4 >= r7) goto L5f
            r5 = r1[r4]     // Catch: java.lang.Throwable -> L5d
            w6f r5 = (defpackage.w6f) r5     // Catch: java.lang.Throwable -> L5d
            long r5 = r5.c     // Catch: java.lang.Throwable -> L5d
            long r2 = r2 + r5
            int r4 = r4 + 1
            goto L51
        L5d:
            r7 = move-exception
            goto L68
        L5f:
            java.lang.Long r7 = new java.lang.Long     // Catch: java.lang.Throwable -> L5d
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L5d
            r8.e(r0)
            return r7
        L68:
            r8.e(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n8f.h(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String toString() {
        StringBuilder sbL = au1.l("(");
        li9 li9Var = this.f;
        Object[] objArr = li9Var.a;
        int i = li9Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            w6f w6fVar = (w6f) objArr[i2];
            if (sbL.length() > 1) {
                sbL.append(",");
            }
            sbL.append(w6fVar.a);
            sbL.append("-");
            sbL.append((w6fVar.a + w6fVar.b) - 1);
        }
        sbL.append(")");
        return sbL.toString();
    }
}
