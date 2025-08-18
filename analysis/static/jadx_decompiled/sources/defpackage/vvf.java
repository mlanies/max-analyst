package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class vvf implements ia7 {
    public static final List i = Collections.singletonList("unknown");
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final Set f;
    public final zt0 g;
    public wsf h;

    public vvf(ja7 ja7Var, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4) {
        this.a = ja7Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        this.e = je7Var4;
        v25 v25Var = evf.u0;
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(((evf) u1Var.next()).a);
        }
        this.f = x53.H0(arrayList);
        this.g = c37.a(0, 0, 7);
    }

    public static final void e(vvf vvfVar, String str) {
        wsf wsfVar = vvfVar.h;
        if (wsfVar != null) {
            iwf.a((iwf) vvfVar.b.getValue(), str, wsfVar.a, wsfVar.b, true, 0, null, null, 240);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ga7 f(java.lang.Throwable r7) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.f(java.lang.Throwable):ga7");
    }

    @Override // defpackage.ia7
    public final Object a(String str, String str2, Continuation continuation) throws Throwable {
        Object objJ;
        boolean zContains = this.f.contains(str);
        e5f e5fVar = e5f.a;
        if (!zContains) {
            hm9.p(vvf.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return e5fVar;
        }
        se5 se5Var = (se5) ((qe5) this.e.getValue());
        se5Var.getClass();
        if (!se5Var.n(PmsKey.f131webappbiometryenabled, false)) {
            hm9.m0(vvf.class.getName(), "Processing is disable", new Object[0]);
            return e5fVar;
        }
        evf evfVar = evf.o;
        boolean zF = tpa.f(str, "WebAppBiometryGetInfo");
        tx3 tx3Var = tx3.a;
        if (zF) {
            Object objI = i(str2, continuation);
            return objI == tx3Var ? objI : e5fVar;
        }
        if (tpa.f(str, "WebAppBiometryRequestAccess")) {
            Object objK = k(str2, continuation);
            return objK == tx3Var ? objK : e5fVar;
        }
        if (tpa.f(str, "WebAppBiometryUpdateToken")) {
            Object objL = l(str2, continuation);
            return objL == tx3Var ? objL : e5fVar;
        }
        if (!tpa.f(str, "WebAppBiometryRequestAuth")) {
            return (tpa.f(str, "WebAppBiometryOpenSettings") && (objJ = j(str2, continuation)) == tx3Var) ? objJ : e5fVar;
        }
        Object objH = h(str2, continuation);
        return objH == tx3Var ? objH : e5fVar;
    }

    @Override // defpackage.ia7
    public final zt0 b() {
        return this.g;
    }

    @Override // defpackage.ia7
    public final Set c() {
        return this.f;
    }

    @Override // defpackage.ia7
    public final void d(wsf wsfVar) {
        this.h = wsfVar;
    }

    public final y83 g() {
        return (y83) this.c.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.gvf
            if (r0 == 0) goto L13
            r0 = r11
            gvf r0 = (defpackage.gvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            gvf r0 = new gvf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.s0
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
            defpackage.od2.a0(r11)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            evf r9 = r0.Y
            etf r10 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L9c
        L41:
            in0 r9 = r0.Z
            evf r10 = r0.Y
            etf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r11)
            goto L83
        L4d:
            defpackage.od2.a0(r11)
            ja7 r11 = defpackage.ja7.d
            r11.getClass()
            dtf r2 = defpackage.etf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            etf r10 = (defpackage.etf) r10
            evf r11 = defpackage.evf.Z
            in0 r2 = new in0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L7f
            return r1
        L7f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L83:
            hvf r11 = new hvf
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            r9 = r10
            r10 = r2
            r2 = r5
        L9c:
            w97 r11 = (defpackage.w97) r11
            ivf r4 = new ivf
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto Lb2
            return r1
        Lb2:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.h(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.jvf
            if (r0 == 0) goto L13
            r0 = r10
            jvf r0 = (defpackage.jvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            jvf r0 = new jvf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.s0
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
            defpackage.od2.a0(r10)
            goto Lb0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            evf r8 = r0.Y
            avf r9 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r10)
            goto L9a
        L41:
            jn0 r8 = r0.Z
            evf r9 = r0.Y
            avf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r10)
            goto L81
        L4d:
            defpackage.od2.a0(r10)
            ja7 r10 = defpackage.ja7.d
            r10.getClass()
            zuf r2 = defpackage.avf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            avf r9 = (defpackage.avf) r9
            evf r10 = defpackage.evf.o
            jn0 r2 = new jn0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L7d
            return r1
        L7d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L81:
            kvf r10 = new kvf
            r10.<init>(r2, r9, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L97
            return r1
        L97:
            r8 = r9
            r9 = r2
            r2 = r5
        L9a:
            w97 r10 = (defpackage.w97) r10
            lvf r4 = new lvf
            r4.<init>(r9, r8, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto Lb0
            return r1
        Lb0:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.i(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(java.lang.String r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.mvf
            if (r0 == 0) goto L13
            r0 = r10
            mvf r0 = (defpackage.mvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            mvf r0 = new mvf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.s0
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
            defpackage.od2.a0(r10)
            goto Lb0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            evf r8 = r0.Y
            yvf r9 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r10)
            goto L9a
        L41:
            kn0 r8 = r0.Z
            evf r9 = r0.Y
            yvf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r10)
            goto L81
        L4d:
            defpackage.od2.a0(r10)
            ja7 r10 = defpackage.ja7.d
            r10.getClass()
            xvf r2 = defpackage.yvf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r9 = r10.a(r2, r9)
            yvf r9 = (defpackage.yvf) r9
            evf r10 = defpackage.evf.s0
            kn0 r2 = new kn0
            java.lang.String r7 = r9.a
            r2.<init>(r7)
            r0.o = r8
            r0.X = r9
            r0.Y = r10
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r8.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L7d
            return r1
        L7d:
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L81:
            nvf r10 = new nvf
            r10.<init>(r9, r5, r2, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r9
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r10 = r8.c(r10, r0)
            if (r10 != r1) goto L97
            return r1
        L97:
            r8 = r9
            r9 = r2
            r2 = r5
        L9a:
            w97 r10 = (defpackage.w97) r10
            ovf r4 = new ovf
            r4.<init>(r8, r2, r9, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r8 = r10.d(r4, r0)
            if (r8 != r1) goto Lb0
            return r1
        Lb0:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.j(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.pvf
            if (r0 == 0) goto L13
            r0 = r11
            pvf r0 = (defpackage.pvf) r0
            int r1 = r0.u0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.u0 = r1
            goto L18
        L13:
            pvf r0 = new pvf
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.s0
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
            defpackage.od2.a0(r11)
            goto Lb2
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            evf r9 = r0.Y
            btf r10 = r0.X
            vvf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L9c
        L41:
            hn0 r9 = r0.Z
            evf r10 = r0.Y
            btf r2 = r0.X
            vvf r5 = r0.o
            defpackage.od2.a0(r11)
            goto L83
        L4d:
            defpackage.od2.a0(r11)
            ja7 r11 = defpackage.ja7.d
            r11.getClass()
            atf r2 = defpackage.btf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r10 = r11.a(r2, r10)
            btf r10 = (defpackage.btf) r10
            evf r11 = defpackage.evf.X
            hn0 r2 = new hn0
            java.lang.String r7 = r10.a
            java.lang.String r8 = r10.c
            r2.<init>(r7, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.Z = r2
            r0.u0 = r5
            zt0 r5 = r9.g
            java.lang.Object r5 = r5.o(r2, r0)
            if (r5 != r1) goto L7f
            return r1
        L7f:
            r5 = r9
            r9 = r2
            r2 = r10
            r10 = r11
        L83:
            qvf r11 = new qvf
            r11.<init>(r2, r10, r5, r6)
            r0.o = r5
            r0.X = r2
            r0.Y = r10
            r0.Z = r6
            r0.u0 = r4
            java.lang.Object r11 = r9.c(r11, r0)
            if (r11 != r1) goto L99
            return r1
        L99:
            r9 = r10
            r10 = r2
            r2 = r5
        L9c:
            w97 r11 = (defpackage.w97) r11
            rvf r4 = new rvf
            r4.<init>(r10, r9, r2, r6)
            r0.o = r6
            r0.X = r6
            r0.Y = r6
            r0.u0 = r3
            java.lang.Object r9 = r11.d(r4, r0)
            if (r9 != r1) goto Lb2
            return r1
        Lb2:
            e5f r9 = defpackage.e5f.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.k(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(java.lang.String r19, kotlin.coroutines.Continuation r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vvf.l(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
