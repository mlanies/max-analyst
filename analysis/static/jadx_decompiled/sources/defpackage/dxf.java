package defpackage;

import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class dxf implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final xs e;
    public final zt0 f;
    public wsf g;

    public dxf(ja7 ja7Var, je7 je7Var, je7 je7Var2, je7 je7Var3) {
        this.a = ja7Var;
        this.b = je7Var;
        this.c = je7Var2;
        this.d = je7Var3;
        v25 v25Var = twf.o;
        xs xsVar = new xs(0);
        v25Var.getClass();
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            ((twf) u1Var.next()).getClass();
            xsVar.add("WebAppDownloadFile");
        }
        this.e = xsVar;
        this.f = c37.a(0, 0, 7);
    }

    public static final ga7 e(dxf dxfVar, Throwable th) {
        dxfVar.getClass();
        swf swfVar = th instanceof swf ? (swf) th : null;
        if (swfVar instanceof qwf) {
            return new ea7(new ha7("download_failed", 1));
        }
        if (swfVar instanceof rwf) {
            return new ea7(new ha7("invalid_params", 2));
        }
        if (swfVar instanceof pwf) {
            return new ea7(new ha7("denied_download_request", 3));
        }
        if (swfVar == null) {
            return fa7.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.dxf r9, defpackage.gxf r10, kotlin.coroutines.Continuation r11) throws java.lang.Throwable {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.vwf
            if (r0 == 0) goto L16
            r0 = r11
            vwf r0 = (defpackage.vwf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.t0 = r1
            goto L1b
        L16:
            vwf r0 = new vwf
            r0.<init>(r9, r11)
        L1b:
            java.lang.Object r11 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L57
            if (r2 == r6) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            defpackage.od2.a0(r11)
            goto Lb4
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            gxf r9 = r0.X
            dxf r10 = r0.o
            defpackage.od2.a0(r11)
            goto La0
        L45:
            gxf r9 = r0.X
            dxf r10 = r0.o
            defpackage.od2.a0(r11)
            goto L8c
        L4d:
            nwf r9 = r0.Y
            gxf r10 = r0.X
            dxf r2 = r0.o
            defpackage.od2.a0(r11)
            goto L76
        L57:
            defpackage.od2.a0(r11)
            nwf r11 = new nwf
            java.lang.String r2 = r10.b
            java.lang.String r8 = r10.c
            r11.<init>(r2, r8)
            r0.o = r9
            r0.X = r10
            r0.Y = r11
            r0.t0 = r6
            zt0 r2 = r9.f
            java.lang.Object r2 = r2.o(r11, r0)
            if (r2 != r1) goto L74
            goto Lb6
        L74:
            r2 = r9
            r9 = r11
        L76:
            xwf r11 = new xwf
            r11.<init>(r2, r10, r7)
            r0.o = r2
            r0.X = r10
            r0.Y = r7
            r0.t0 = r5
            java.lang.Object r11 = r9.e(r11, r0)
            if (r11 != r1) goto L8a
            goto Lb6
        L8a:
            r9 = r10
            r10 = r2
        L8c:
            w97 r11 = (defpackage.w97) r11
            ywf r2 = new ywf
            r2.<init>(r10, r9, r7)
            r0.o = r10
            r0.X = r9
            r0.t0 = r4
            java.lang.Object r11 = r11.c(r2, r0)
            if (r11 != r1) goto La0
            goto Lb6
        La0:
            w97 r11 = (defpackage.w97) r11
            zwf r2 = new zwf
            r2.<init>(r10, r9, r7)
            r0.o = r7
            r0.X = r7
            r0.t0 = r3
            java.lang.Object r9 = r11.d(r2, r0)
            if (r9 != r1) goto Lb4
            goto Lb6
        Lb4:
            e5f r1 = defpackage.e5f.a
        Lb6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxf.f(dxf, gxf, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.ia7
    public final Object a(String str, String str2, Continuation continuation) throws Throwable {
        Object next;
        twf.a.getClass();
        Iterator it = twf.o.iterator();
        while (true) {
            u1 u1Var = (u1) it;
            if (!u1Var.hasNext()) {
                next = null;
                break;
            }
            next = u1Var.next();
            ((twf) next).getClass();
            if ("WebAppDownloadFile".equals(str)) {
                break;
            }
        }
        twf twfVar = (twf) next;
        e5f e5fVar = e5f.a;
        if (twfVar == null) {
            hm9.p(dxf.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
            return e5fVar;
        }
        qyc qycVar = (qyc) ((y7d) this.d.getValue());
        qycVar.getClass();
        if (!qycVar.n(PmsKey.f55jsdownloaddelegate, false)) {
            return e5fVar;
        }
        if (uwf.$EnumSwitchMapping$0[twfVar.ordinal()] != 1) {
            throw new NoWhenBranchMatchedException();
        }
        Object objG = g(str2, continuation);
        return objG == tx3.a ? objG : e5fVar;
    }

    @Override // defpackage.ia7
    public final zt0 b() {
        return this.f;
    }

    @Override // defpackage.ia7
    public final Set c() {
        return this.e;
    }

    @Override // defpackage.ia7
    public final void d(wsf wsfVar) {
        this.g = wsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.axf
            if (r0 == 0) goto L13
            r0 = r9
            axf r0 = (defpackage.axf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            axf r0 = new axf
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L49
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            defpackage.od2.a0(r9)
            goto La1
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L37:
            gxf r7 = r0.X
            dxf r8 = r0.o
            defpackage.od2.a0(r9)
            goto L8d
        L3f:
            owf r7 = r0.Y
            gxf r8 = r0.X
            dxf r2 = r0.o
            defpackage.od2.a0(r9)
            goto L77
        L49:
            defpackage.od2.a0(r9)
            ja7 r9 = defpackage.ja7.d
            r9.getClass()
            fxf r2 = defpackage.gxf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            gxf r8 = (defpackage.gxf) r8
            owf r9 = new owf
            java.lang.String r2 = r8.c
            r9.<init>(r2)
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r5
            zt0 r2 = r7.f
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L75
            return r1
        L75:
            r2 = r7
            r7 = r9
        L77:
            bxf r9 = new bxf
            r9.<init>(r2, r8, r6)
            r0.o = r2
            r0.X = r8
            r0.Y = r6
            r0.t0 = r4
            java.lang.Object r9 = r7.c(r9, r0)
            if (r9 != r1) goto L8b
            return r1
        L8b:
            r7 = r8
            r8 = r2
        L8d:
            w97 r9 = (defpackage.w97) r9
            cxf r2 = new cxf
            r2.<init>(r8, r7, r6)
            r0.o = r6
            r0.X = r6
            r0.t0 = r3
            java.lang.Object r7 = r9.d(r2, r0)
            if (r7 != r1) goto La1
            return r1
        La1:
            e5f r7 = defpackage.e5f.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxf.g(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
