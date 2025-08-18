package defpackage;

import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class lyf implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final je7 c;
    public final Set d;
    public final zt0 e;
    public wsf f;

    public lyf(ja7 ja7Var, je7 je7Var, je7 je7Var2) {
        this.a = ja7Var;
        this.b = je7Var;
        this.c = je7Var2;
        v25 v25Var = hyf.o;
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            ((hyf) u1Var.next()).getClass();
            arrayList.add("WebAppRequestPhone");
        }
        this.d = x53.H0(arrayList);
        this.e = c37.a(0, 0, 7);
    }

    @Override // defpackage.ia7
    public final Object a(String str, String str2, Continuation continuation) {
        Object objE;
        boolean zContains = this.d.contains(str);
        e5f e5fVar = e5f.a;
        if (zContains) {
            hyf hyfVar = hyf.b;
            return (tpa.f(str, "WebAppRequestPhone") && (objE = e(str2, continuation)) == tx3.a) ? objE : e5fVar;
        }
        hm9.p(lyf.class.getName(), "Unknown method with name = " + str + " in JsDelegate: " + this, null);
        return e5fVar;
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
        ((y83) this.c.getValue()).c = wsfVar;
        this.f = wsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r8, kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.iyf
            if (r0 == 0) goto L13
            r0 = r9
            iyf r0 = (defpackage.iyf) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            iyf r0 = new iyf
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
            oyf r7 = r0.X
            lyf r8 = r0.o
            defpackage.od2.a0(r9)
            goto L8d
        L3f:
            whc r7 = r0.Y
            oyf r8 = r0.X
            lyf r2 = r0.o
            defpackage.od2.a0(r9)
            goto L75
        L49:
            defpackage.od2.a0(r9)
            ja7 r9 = defpackage.ja7.d
            r9.getClass()
            nyf r2 = defpackage.oyf.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r8 = r9.a(r2, r8)
            oyf r8 = (defpackage.oyf) r8
            whc r9 = new whc
            r9.<init>()
            r0.o = r7
            r0.X = r8
            r0.Y = r9
            r0.t0 = r5
            zt0 r2 = r7.e
            java.lang.Object r2 = r2.o(r9, r0)
            if (r2 != r1) goto L73
            return r1
        L73:
            r2 = r7
            r7 = r9
        L75:
            hyf r9 = defpackage.hyf.b
            jyf r9 = new jyf
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
            kyf r2 = new kyf
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lyf.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
