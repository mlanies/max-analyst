package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class eqb implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 a;
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public final je7 w0;
    public final ContextScope x0;

    public eqb(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9, je7 je7Var10, je7 je7Var11, je7 je7Var12, kke kkeVar, ox3 ox3Var) {
        this.a = je7Var;
        this.b = je7Var2;
        this.c = je7Var3;
        this.o = je7Var4;
        this.X = je7Var5;
        this.Y = je7Var6;
        this.Z = je7Var7;
        this.s0 = je7Var8;
        this.t0 = je7Var9;
        this.u0 = je7Var10;
        this.v0 = je7Var11;
        this.w0 = je7Var12;
        this.x0 = j1e.a(((w9a) kkeVar).b().limitedParallelism(1, "push").plus(ox3Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.eqb r4, defpackage.je5 r5, defpackage.vd5 r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r4.getClass()
            boolean r0 = r7 instanceof defpackage.cqb
            if (r0 == 0) goto L16
            r0 = r7
            cqb r0 = (defpackage.cqb) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Y = r1
            goto L1b
        L16:
            cqb r0 = new cqb
            r0.<init>(r4, r7)
        L1b:
            java.lang.Object r7 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            defpackage.od2.a0(r7)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            goto L51
        L2a:
            r4 = move-exception
            goto L4a
        L2c:
            r4 = move-exception
            goto L54
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            defpackage.od2.a0(r7)
            je7 r4 = r4.t0     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r4 = r4.getValue()     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            qx9 r4 = (defpackage.qx9) r4     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            r0.Y = r3     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            java.lang.Object r4 = r4.f(r5, r6, r0)     // Catch: java.lang.Throwable -> L2a java.util.concurrent.CancellationException -> L2c
            if (r4 != r1) goto L51
            goto L53
        L4a:
            java.lang.String r5 = "eqb"
            java.lang.String r6 = "notifyTracker: failed"
            defpackage.hm9.p(r5, r6, r4)
        L51:
            e5f r1 = defpackage.e5f.a
        L53:
            return r1
        L54:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqb.b(eqb, je5, vd5, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.qu7
    public final void a() {
        pag.e(this.x0.getCoroutineContext(), new CancellationException("logout"));
    }

    public final boolean c() {
        if (!((ri4) this.b.getValue()).d()) {
            je7 je7Var = this.a;
            if (!((ch3) je7Var.getValue()).e() && ((((ch3) je7Var.getValue()).d() && ((ch3) je7Var.getValue()).a().g()) || ((ch3) je7Var.getValue()).c())) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(long j, long j2) {
        oq0 oq0VarC = ((f5a) this.v0.getValue()).c();
        boolean z = oq0VarC.b;
        boolean z2 = oq0VarC.a;
        if (z2 && !z) {
            return false;
        }
        hm9.m0("eqb", "onMessagePush: skipped (authorized=" + z2 + ", external=" + z + "), chatServerId=" + j + ", messageId=" + j2, new Object[0]);
        return true;
    }

    public final void e(je5 je5Var, vd5 vd5Var) {
        long j = je5Var.a;
        long j2 = je5Var.b;
        if (d(j, j2)) {
            return;
        }
        StringBuilder sbK = au1.k(j, "onMessagePush: chatServerId=", ", messageId=");
        sbK.append(j2);
        hm9.n("eqb", sbK.toString());
        j47.T(this.x0, null, null, new dqb(this, je5Var, vd5Var, null), 3);
        f(false, c());
    }

    public final void f(boolean z, boolean z2) {
        hm9.n("eqb", "onPush: callPush=" + z + ", forceConnection=" + z2);
        je7 je7Var = this.c;
        ((p7b) ((m7b) je7Var.getValue())).a.l("app.last.firebase_push_time", Long.valueOf(System.currentTimeMillis()));
        if (z2) {
            ((p7b) ((m7b) je7Var.getValue())).a.y(true);
            ((k4a) ((pk) this.Z.getValue())).G(((ri4) this.b.getValue()).d());
            ((boe) this.X.getValue()).a();
        }
        ((ad) this.Y.getValue()).f("ACTION_FCM_PUSH");
    }
}
