package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f2g implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final Set d;
    public final zt0 e;
    public wsf f;

    public f2g(ja7 ja7Var, je7 je7Var, je7 je7Var2) {
        this.a = ja7Var;
        this.b = je7Var;
        this.c = je7Var2;
        v25 v25Var = v1g.v0;
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(((v1g) u1Var.next()).a);
        }
        this.d = x53.H0(arrayList);
        this.e = c37.a(0, 0, 7);
    }

    public static final void e(f2g f2gVar, String str) {
        wsf wsfVar = f2gVar.f;
        if (wsfVar != null) {
            iwf.a((iwf) f2gVar.b.getValue(), str, wsfVar.a, wsfVar.b, true, 0, null, null, 240);
        }
    }

    public static ga7 f(Throwable th) {
        o1g o1gVar = th instanceof o1g ? (o1g) th : null;
        if (o1gVar instanceof n1g) {
            return new ea7(new ha7("too_many_keys", ((n1g) o1gVar).a ? 3 : 1));
        }
        if (o1gVar instanceof k1g) {
            return new ea7(new ha7("not_found", ((k1g) o1gVar).a ? 6 : 4));
        }
        if (o1gVar instanceof j1g) {
            return new ea7(new ha7("not_found", 1));
        }
        if (o1gVar == null) {
            return fa7.d;
        }
        if (o1gVar instanceof l1g) {
            return new ea7(new ha7("too_large_key", ((l1g) o1gVar).a ? 5 : 3));
        }
        if (o1gVar instanceof m1g) {
            return new ea7(new ha7("too_large_value", ((m1g) o1gVar).a ? 4 : 2));
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // defpackage.ia7
    public final Object a(String str, String str2, Continuation continuation) throws Throwable {
        Object objH;
        boolean zContains = this.d.contains(str);
        e5f e5fVar = e5f.a;
        if (!zContains) {
            hm9.p(f2g.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return e5fVar;
        }
        v1g v1gVar = v1g.o;
        boolean zF = tpa.f(str, "WebAppSecureStorageSaveKey");
        tx3 tx3Var = tx3.a;
        if (zF) {
            Object objJ = j(str2, true, continuation);
            return objJ == tx3Var ? objJ : e5fVar;
        }
        if (tpa.f(str, "WebAppSecureStorageGetKey")) {
            Object objI = i(str2, true, continuation);
            return objI == tx3Var ? objI : e5fVar;
        }
        if (tpa.f(str, "WebAppSecureStorageClear")) {
            Object objH2 = h(str2, true, continuation);
            return objH2 == tx3Var ? objH2 : e5fVar;
        }
        if (tpa.f(str, "WebAppDeviceStorageSaveKey")) {
            Object objJ2 = j(str2, false, continuation);
            return objJ2 == tx3Var ? objJ2 : e5fVar;
        }
        if (!tpa.f(str, "WebAppDeviceStorageGetKey")) {
            return (tpa.f(str, "WebAppDeviceStorageClear") && (objH = h(str2, false, continuation)) == tx3Var) ? objH : e5fVar;
        }
        Object objI2 = i(str2, false, continuation);
        return objI2 == tx3Var ? objI2 : e5fVar;
    }

    @Override // defpackage.ia7
    public final zt0 b() {
        return this.e;
    }

    @Override // defpackage.ia7
    public final Set c() {
        return this.d;
    }

    @Override // defpackage.ia7
    public final void d(wsf wsfVar) {
        this.f = wsfVar;
    }

    public final y83 g() {
        return (y83) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, boolean r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.w1g
            if (r0 == 0) goto L13
            r0 = r12
            w1g r0 = (defpackage.w1g) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            w1g r0 = new w1g
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.od2.a0(r12)
            goto Lb6
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            v1g r9 = r0.Y
            i1g r10 = r0.X
            f2g r11 = r0.o
            defpackage.od2.a0(r12)
            goto La0
        L41:
            m8e r9 = r0.Z
            v1g r10 = r0.Y
            i1g r11 = r0.X
            f2g r2 = r0.o
            defpackage.od2.a0(r12)
            goto L87
        L4d:
            defpackage.od2.a0(r12)
            ja7 r12 = defpackage.ja7.d
            r12.getClass()
            h1g r2 = defpackage.i1g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r12.a(r2, r10)
            i1g r10 = (defpackage.i1g) r10
            if (r11 == 0) goto L66
            v1g r12 = defpackage.v1g.Y
            goto L68
        L66:
            v1g r12 = defpackage.v1g.t0
        L68:
            m8e r2 = new m8e
            java.lang.String r7 = r10.a
            r2.<init>(r7, r11)
            r0.o = r9
            r0.X = r10
            r0.Y = r12
            r0.Z = r2
            r0.u0 = r5
            zt0 r11 = r9.e
            java.lang.Object r11 = r11.o(r2, r0)
            if (r11 != r1) goto L82
            return r1
        L82:
            r11 = r10
            r10 = r12
            r8 = r2
            r2 = r9
            r9 = r8
        L87:
            x1g r12 = new x1g
            r12.<init>(r11, r10, r2, r6)
            r0.o = r2
            r0.X = r11
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r12 = r9.c(r12, r0)
            if (r12 != r1) goto L9d
            return r1
        L9d:
            r9 = r10
            r10 = r11
            r11 = r2
        La0:
            w97 r12 = (defpackage.w97) r12
            y1g r2 = new y1g
            r2.<init>(r10, r9, r11, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r12.d(r2, r0)
            if (r9 != r1) goto Lb6
            return r1
        Lb6:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.h(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r11, boolean r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r13 instanceof defpackage.z1g
            if (r0 == 0) goto L13
            r0 = r13
            z1g r0 = (defpackage.z1g) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            z1g r0 = new z1g
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.s0
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L41
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.od2.a0(r13)
            goto Lb8
        L2f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L37:
            v1g r10 = r0.Y
            r1g r11 = r0.X
            f2g r12 = r0.o
            defpackage.od2.a0(r13)
            goto La2
        L41:
            n8e r10 = r0.Z
            v1g r11 = r0.Y
            r1g r12 = r0.X
            f2g r2 = r0.o
            defpackage.od2.a0(r13)
            goto L89
        L4d:
            defpackage.od2.a0(r13)
            ja7 r13 = defpackage.ja7.d
            r13.getClass()
            q1g r2 = defpackage.r1g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r11 = r13.a(r2, r11)
            r1g r11 = (defpackage.r1g) r11
            if (r12 == 0) goto L66
            v1g r13 = defpackage.v1g.X
            goto L68
        L66:
            v1g r13 = defpackage.v1g.s0
        L68:
            n8e r2 = new n8e
            java.lang.String r7 = r11.a
            java.lang.String r8 = r11.c
            r2.<init>(r7, r8, r12)
            r0.o = r10
            r0.X = r11
            r0.Y = r13
            r0.Z = r2
            r0.u0 = r5
            zt0 r12 = r10.e
            java.lang.Object r12 = r12.o(r2, r0)
            if (r12 != r1) goto L84
            return r1
        L84:
            r12 = r11
            r11 = r13
            r9 = r2
            r2 = r10
            r10 = r9
        L89:
            a2g r13 = new a2g
            r13.<init>(r12, r11, r2, r6)
            r0.o = r2
            r0.X = r12
            r0.Y = r11
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r13 = r10.c(r13, r0)
            if (r13 != r1) goto L9f
            return r1
        L9f:
            r10 = r11
            r11 = r12
            r12 = r2
        La2:
            w97 r13 = (defpackage.w97) r13
            b2g r2 = new b2g
            r2.<init>(r11, r10, r12, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r10 = r13.d(r2, r0)
            if (r10 != r1) goto Lb8
            return r1
        Lb8:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.i(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r17, boolean r18, kotlin.coroutines.Continuation r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f2g.j(java.lang.String, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
