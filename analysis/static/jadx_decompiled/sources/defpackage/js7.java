package defpackage;

import java.util.EnumSet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class js7 implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final ix Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final khe s0;

    public js7(zp zpVar, kke kkeVar, je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7) {
        this.a = je7Var2;
        this.b = je7Var3;
        this.c = je7Var4;
        this.o = je7Var;
        this.X = je7Var6;
        this.Y = je7Var7;
        int i = ft4.o;
        w9a w9aVar = (w9a) kkeVar;
        this.Z = new ix(w9aVar.b(), w9aVar.a(), z7.R(1000, kt4.MILLISECONDS), new g27(7), new hs7(je7Var, null), new es7(this, je7Var5));
        this.s0 = new khe(new z30(16, je7Var3));
        ((lqf) zpVar).i.add(new fs7(0, this));
    }

    public static void g(js7 js7Var, boolean z, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if (js7Var.c()) {
            return;
        }
        boolean z2 = ((gh3) js7Var.X.getValue()).b() == zh3.c;
        boolean zE = js7Var.e();
        boolean zContains = ((EnumSet) js7Var.s0.getValue()).contains(gs7.b);
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "LogController", "Trying to flush analytics, timeFromLastSend=" + nu0.G(Long.valueOf(((hyc) ((q33) js7Var.a.getValue())).g.getLong("user.lastSentLogTime", 0L))) + ", timeToSend=" + zE + ", wifi=" + z2 + ", force=" + z + ", sendOnAnyNetwork=" + zContains, null);
        }
        if (zContains || z2 || zE || z) {
            ((s8g) js7Var.c.getValue()).a(new c9d(false, true));
        }
    }

    @Override // defpackage.qu7
    public final void a() {
    }

    public final hmc b() {
        return (hmc) this.o.getValue();
    }

    public final boolean c() {
        ((se5) ((qe5) this.Y.getValue())).getClass();
        return !r2.n(PmsKey.f3analyticsenabled, true);
    }

    public final boolean d() {
        int i = ft4.o;
        qyc qycVar = (qyc) ((y7d) this.b.getValue());
        qycVar.getClass();
        long jS = z7.S(qycVar.q(PmsKey.f111sendlogsintervalsec, 10800L) / 12, kt4.SECONDS);
        long jCurrentTimeMillis = System.currentTimeMillis();
        kt4 kt4Var = kt4.MILLISECONDS;
        return ft4.c(ft4.g(z7.S(jCurrentTimeMillis, kt4Var), z7.S(((hyc) ((q33) this.a.getValue())).g.getLong("user.lastSentCriticalLogTime", 0L), kt4Var)), jS) >= 0;
    }

    public final boolean e() {
        int i = ft4.o;
        long jCurrentTimeMillis = System.currentTimeMillis();
        kt4 kt4Var = kt4.MILLISECONDS;
        long jG = ft4.g(z7.S(jCurrentTimeMillis, kt4Var), z7.S(((hyc) ((q33) this.a.getValue())).g.getLong("user.lastSentLogTime", 0L), kt4Var));
        qyc qycVar = (qyc) ((y7d) this.b.getValue());
        qycVar.getClass();
        long jS = z7.S(qycVar.q(PmsKey.f111sendlogsintervalsec, 10800L), kt4.SECONDS);
        if (ft4.c(jS, 0L) < 0) {
            jS = z7.R(3, kt4.HOURS);
        }
        return ft4.c(jG, jS) > 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.is7
            if (r0 == 0) goto L13
            r0 = r12
            is7 r0 = (defpackage.is7) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            is7 r0 = new is7
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            e5f r3 = defpackage.e5f.a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            js7 r10 = r0.o
            defpackage.od2.a0(r12)
            goto La1
        L2c:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L34:
            defpackage.od2.a0(r12)
            boolean r12 = r10.c()
            if (r12 == 0) goto L3e
            return r3
        L3e:
            boolean r12 = r10.d()
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L47
            goto L90
        L47:
            boolean r5 = r2.c()
            if (r5 == 0) goto L90
            us7 r5 = defpackage.us7.X
            je7 r6 = r10.a
            java.lang.Object r6 = r6.getValue()
            q33 r6 = (defpackage.q33) r6
            hyc r6 = (defpackage.hyc) r6
            ne7 r6 = r6.g
            java.lang.String r7 = "user.lastSentCriticalLogTime"
            r8 = 0
            long r6 = r6.getLong(r7, r8)
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r6)
            java.lang.String r6 = defpackage.nu0.G(r8)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Trying to flush critical analytics, awaitFlush="
            r7.<init>(r8)
            r7.append(r11)
            java.lang.String r8 = ", timeFromLastSend="
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ", timeToSend="
            r7.append(r6)
            r7.append(r12)
            java.lang.String r6 = r7.toString()
            r7 = 0
            java.lang.String r8 = "LogController"
            r2.d(r5, r8, r6, r7)
        L90:
            if (r12 == 0) goto Lb2
            if (r11 == 0) goto La1
            ix r11 = r10.Z
            r0.o = r10
            r0.Z = r4
            java.lang.Object r11 = r11.c(r0)
            if (r11 != r1) goto La1
            return r1
        La1:
            je7 r10 = r10.c
            java.lang.Object r10 = r10.getValue()
            s8g r10 = (defpackage.s8g) r10
            c9d r11 = new c9d
            r12 = 0
            r11.<init>(r12, r12)
            r10.a(r11)
        Lb2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.js7.f(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
