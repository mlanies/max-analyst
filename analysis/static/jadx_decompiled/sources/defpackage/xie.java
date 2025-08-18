package defpackage;

import kotlinx.coroutines.internal.ContextScope;
import one.me.sdk.vendor.StoreServicesInfo$ServicesException;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;
import one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener;

/* loaded from: classes2.dex */
public final class xie implements qu7 {
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final String a = xie.class.getName();
    public final je7 b;
    public final je7 c;
    public final je7 o;
    public final ContextScope s0;
    public final je7 t0;

    public xie(je7 je7Var, je7 je7Var2, je7 je7Var3, p67 p67Var, je7 je7Var4, je7 je7Var5, ox3 ox3Var, je7 je7Var6, je7 je7Var7) {
        this.b = je7Var;
        this.c = je7Var2;
        this.o = je7Var3;
        this.X = je7Var4;
        this.Y = je7Var6;
        this.Z = je7Var7;
        this.s0 = j1e.a(p67Var.a.limitedParallelism(1, "vendor").plus(ox3Var));
        this.t0 = je7Var5;
    }

    @Override // defpackage.qu7
    public final void a() {
        j1e.i(this.s0, null);
    }

    public final q33 b() {
        return (q33) this.c.getValue();
    }

    public final ty3 c() {
        return (ty3) this.t0.getValue();
    }

    public final String d() {
        String string = ((hyc) b()).g.getString("user.fcmToken", null);
        if (string != null && string.length() != 0) {
            g().getClass();
            if ("GCM".equals(((hyc) b()).g.getString("user.pushDeviceType", null))) {
                return string;
            }
        }
        j47.T(this.s0, null, null, new sie(this, (SystemServicesManager$PushTokenGeneratedListener) this.X.getValue(), null), 3);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r0 = "getPushToken: got "
            boolean r1 = r7 instanceof defpackage.tie
            if (r1 == 0) goto L15
            r1 = r7
            tie r1 = (defpackage.tie) r1
            int r2 = r1.s0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.s0 = r2
            goto L1a
        L15:
            tie r1 = new tie
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.Y
            tx3 r2 = defpackage.tx3.a
            int r3 = r1.s0
            r4 = 1
            if (r3 == 0) goto L38
            if (r3 != r4) goto L30
            one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener r6 = r1.X
            xie r5 = r1.o
            defpackage.od2.a0(r7)     // Catch: java.lang.Exception -> L2d
            goto L4e
        L2d:
            r6 = move-exception
            goto La0
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            defpackage.od2.a0(r7)
            u8e r7 = r5.g()     // Catch: java.lang.Exception -> L2d
            r1.o = r5     // Catch: java.lang.Exception -> L2d
            r1.X = r6     // Catch: java.lang.Exception -> L2d
            r1.s0 = r4     // Catch: java.lang.Exception -> L2d
            xe6 r7 = (defpackage.xe6) r7     // Catch: java.lang.Exception -> L2d
            java.lang.Object r7 = r7.b(r1)     // Catch: java.lang.Exception -> L2d
            if (r7 != r2) goto L4e
            return r2
        L4e:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = r5.a     // Catch: java.lang.Exception -> L2d
            if (r7 == 0) goto L5e
            int r2 = r7.length()     // Catch: java.lang.Exception -> L2d
            if (r2 != 0) goto L5b
            goto L5e
        L5b:
            java.lang.String r2 = "normal"
            goto L60
        L5e:
            java.lang.String r2 = "empty"
        L60:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2d
            r3.<init>(r0)     // Catch: java.lang.Exception -> L2d
            r3.append(r2)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = " token"
            r3.append(r0)     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Exception -> L2d
            defpackage.hm9.n(r1, r0)     // Catch: java.lang.Exception -> L2d
            q33 r0 = r5.b()     // Catch: java.lang.Exception -> L2d
            hyc r0 = (defpackage.hyc) r0     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "user.fcmToken"
            r0.m(r1, r7)     // Catch: java.lang.Exception -> L2d
            q33 r0 = r5.b()     // Catch: java.lang.Exception -> L2d
            u8e r1 = r5.g()     // Catch: java.lang.Exception -> L2d
            r1.getClass()     // Catch: java.lang.Exception -> L2d
            java.lang.String r1 = "GCM"
            hyc r0 = (defpackage.hyc) r0     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = "user.pushDeviceType"
            r0.m(r2, r1)     // Catch: java.lang.Exception -> L2d
            if (r7 == 0) goto La7
            int r0 = r7.length()     // Catch: java.lang.Exception -> L2d
            if (r0 != 0) goto L9c
            goto La7
        L9c:
            r6.onPushTokenGenerated(r7)     // Catch: java.lang.Exception -> L2d
            goto La7
        La0:
            java.lang.String r5 = r5.a
            java.lang.String r7 = "getPushToken: failed"
            defpackage.hm9.p(r5, r7, r6)
        La7:
            e5f r5 = defpackage.e5f.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xie.e(one.me.sdk.vendor.SystemServicesManager$PushTokenGeneratedListener, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final String f() {
        fl5 fl5Var;
        xe6 xe6Var = (xe6) g();
        if (!xe6Var.a()) {
            throw new StoreServicesInfo$ServicesNotAvailableException();
        }
        khe kheVar = xe6Var.c;
        ukg ukgVarC = null;
        if (kheVar.a() && (fl5Var = (fl5) kheVar.getValue()) != null) {
            try {
                Object obj = il5.m;
                fl5Var.a();
                ukgVarC = ((il5) fl5Var.d.a(jl5.class)).c();
            } catch (Exception e) {
                hm9.p(xe6Var.b, "getInstanceIdTask: failed to get FirebaseInstanceId", e);
            }
        }
        if (ukgVarC == null) {
            throw new StoreServicesInfo$ServicesException("failed to get instance id task");
        }
        try {
            return (String) j1e.b(ukgVarC);
        } catch (Exception e2) {
            throw new StoreServicesInfo$ServicesException("getServiceInstanceId: getInstanceId failed", e2);
        }
    }

    public final u8e g() {
        return (u8e) this.b.getValue();
    }
}
