package defpackage;

import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes2.dex */
public final class s2g implements ia7 {
    public final ja7 a;
    public final je7 b;
    public final Set c;
    public final zt0 d;
    public wsf e;

    public s2g(ja7 ja7Var, je7 je7Var) {
        this.a = ja7Var;
        this.b = je7Var;
        v25 v25Var = o2g.Y;
        ArrayList arrayList = new ArrayList(z53.S(v25Var, 10));
        u1 u1Var = new u1(0, v25Var);
        while (u1Var.hasNext()) {
            arrayList.add(((o2g) u1Var.next()).a);
        }
        this.c = x53.H0(arrayList);
        this.d = c37.a(0, 0, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    @Override // defpackage.ia7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, kotlin.coroutines.Continuation r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2g.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.ia7
    public final zt0 b() {
        return this.d;
    }

    @Override // defpackage.ia7
    public final Set c() {
        return this.c;
    }

    @Override // defpackage.ia7
    public final void d(wsf wsfVar) {
        this.e = wsfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.q2g
            if (r0 == 0) goto L13
            r0 = r7
            q2g r0 = (defpackage.q2g) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            q2g r0 = new q2g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.od2.a0(r7)
            goto L7f
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            l2g r5 = r0.Y
            y0g r6 = r0.X
            s2g r2 = r0.o
            defpackage.od2.a0(r7)
            goto L6a
        L3c:
            defpackage.od2.a0(r7)
            ja7 r7 = defpackage.ja7.d
            r7.getClass()
            x0g r2 = defpackage.y0g.Companion
            cc7 r2 = r2.serializer()
            java.lang.Object r6 = r7.a(r2, r6)
            y0g r6 = (defpackage.y0g) r6
            l2g r7 = new l2g
            boolean r2 = r6.b
            r7.<init>(r2)
            r0.o = r5
            r0.X = r6
            r0.Y = r7
            r0.t0 = r4
            zt0 r2 = r5.d
            java.lang.Object r2 = r2.o(r7, r0)
            if (r2 != r1) goto L68
            return r1
        L68:
            r2 = r5
            r5 = r7
        L6a:
            r2g r7 = new r2g
            r4 = 0
            r7.<init>(r6, r2, r4)
            r0.o = r4
            r0.X = r4
            r0.Y = r4
            r0.t0 = r3
            java.lang.Object r5 = r5.c(r7, r0)
            if (r5 != r1) goto L7f
            return r1
        L7f:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s2g.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
