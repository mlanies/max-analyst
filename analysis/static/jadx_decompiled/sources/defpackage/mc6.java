package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class mc6 {
    public static final long[] g = new long[0];
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 d;
    public final je7 e;
    public final je7 f;

    public mc6(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.d = je7Var4;
        this.e = je7Var5;
        this.f = je7Var6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r0v0, types: [mc6] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r17, defpackage.ek2 r19, long r20, java.lang.String r22, kotlin.coroutines.Continuation r23) throws java.lang.Throwable {
        /*
            r16 = this;
            r0 = r16
            r1 = r23
            boolean r2 = r1 instanceof defpackage.lc6
            if (r2 == 0) goto L17
            r2 = r1
            lc6 r2 = (defpackage.lc6) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            lc6 r2 = new lc6
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            tx3 r3 = defpackage.tx3.a
            int r4 = r2.Z
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L3b
            if (r4 != r6) goto L33
            mc6 r0 = r2.o
            defpackage.od2.a0(r1)     // Catch: java.lang.Throwable -> L31
        L2d:
            r15 = r1
            r1 = r0
            r0 = r15
            goto L7a
        L31:
            r1 = r0
            goto L82
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            defpackage.od2.a0(r1)
            au r1 = new au
            r4 = r19
            java.lang.String r10 = r4.a
            je7 r4 = r0.b
            java.lang.Object r4 = r4.getValue()
            y7d r4 = (defpackage.y7d) r4
            qyc r4 = (defpackage.qyc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r7 = ru.ok.tamtam.android.prefs.PmsKey.f73maxreadmarks
            r8 = 300(0x12c, float:4.2E-43)
            long r8 = (long) r8
            long r7 = r4.q(r7, r8)
            int r13 = (int) r7
            r7 = r1
            r8 = r17
            r11 = r20
            r14 = r22
            r7.<init>(r8, r10, r11, r13, r14)
            je7 r4 = r0.a     // Catch: java.lang.Throwable -> L31
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L31
            pk r4 = (defpackage.pk) r4     // Catch: java.lang.Throwable -> L31
            r2.o = r0     // Catch: java.lang.Throwable -> L31
            r2.Z = r6     // Catch: java.lang.Throwable -> L31
            k4a r4 = (defpackage.k4a) r4     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r4.J(r1, r2)     // Catch: java.lang.Throwable -> L31
            if (r1 != r3) goto L2d
            return r3
        L7a:
            fk2 r0 = (defpackage.fk2) r0     // Catch: java.lang.Throwable -> L82
            r1.b(r0)     // Catch: java.lang.Throwable -> L80
            return r0
        L80:
            r0 = move-exception
            goto L9d
        L82:
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L80
            ir6 r2 = defpackage.hm9.m     // Catch: java.lang.Throwable -> L80
            if (r2 != 0) goto L8f
            goto L9c
        L8f:
            boolean r3 = r2.c()     // Catch: java.lang.Throwable -> L80
            if (r3 == 0) goto L9c
            us7 r3 = defpackage.us7.s0     // Catch: java.lang.Throwable -> L80
            java.lang.String r4 = "fail to get chat members"
            r2.d(r3, r0, r4, r5)     // Catch: java.lang.Throwable -> L80
        L9c:
            return r5
        L9d:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "fail"
            defpackage.hm9.p(r1, r2, r0)
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Laf
            return r5
        Laf:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mc6.a(long, ek2, long, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(fk2 fk2Var) {
        if (fk2Var.c.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(fk2Var.c.size());
        xs xsVar = new xs(fk2Var.c.size());
        Iterator it = fk2Var.c.iterator();
        while (it.hasNext()) {
            dk2 dk2Var = (dk2) it.next();
            arrayList.add(dk2Var.a);
            wm3 wm3Var = dk2Var.a;
            xsVar.add(Long.valueOf(wm3Var.a));
            ((w7b) this.d.getValue()).d().f(wm3Var.a, iz7.l(dk2Var.b));
        }
        if (!arrayList.isEmpty()) {
            ((el3) this.c.getValue()).s(arrayList, g);
        }
        if (!xsVar.isEmpty()) {
            ((r47) this.e.getValue()).a(xsVar);
        }
        ((av0) this.f.getValue()).c(new ps3(0L, xsVar));
    }
}
