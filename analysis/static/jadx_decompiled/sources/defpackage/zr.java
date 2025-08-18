package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class zr extends pnf {
    public static final /* synthetic */ bc7[] J0;
    public final w4d A0;
    public final je7 B0;
    public final je7 C0;
    public aq D0;
    public final q0e E0;
    public final w7c F0;
    public final s35 G0;
    public final q0e H0;
    public final w7c I0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final jp c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final qp4 v0;
    public volatile Map w0;
    public volatile Map x0;
    public volatile ze0 y0;
    public volatile ze0 z0;

    static {
        oi9 oi9Var = new oi9(zr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        J0 = new bc7[]{oi9Var};
    }

    public zr(je7 je7Var, p7b p7bVar, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, je7 je7Var9) {
        aq aqVar;
        this.b = je7Var;
        this.c = p7bVar.c;
        this.o = je7Var2;
        this.X = je7Var3;
        this.Y = je7Var4;
        this.Z = je7Var5;
        this.s0 = je7Var6;
        this.t0 = je7Var7;
        this.u0 = je7Var8;
        qp4 qp4VarB = qp4.u0.b(t());
        this.v0 = qp4VarB;
        oz4 oz4Var = oz4.a;
        this.w0 = oz4Var;
        this.x0 = oz4Var;
        this.A0 = mqd.D();
        this.B0 = tu0.r(3, new dr(je7Var8, je7Var9, 1));
        this.C0 = tu0.r(3, new x2(this, 3, je7Var8));
        gq9 gq9VarY = ((pl8) qp4VarB.Y).y();
        if ((gq9VarY instanceof bq9) || (gq9VarY instanceof eq9) || gq9VarY.equals(fq9.b)) {
            aqVar = aq.a;
        } else if (gq9VarY.equals(cq9.b)) {
            aqVar = aq.b;
        } else {
            if (!gq9VarY.equals(dq9.b)) {
                throw new NoWhenBranchMatchedException();
            }
            aqVar = aq.c;
        }
        this.D0 = aqVar;
        List listD0 = x53.D0(aq.X);
        ArrayList arrayList = new ArrayList(z53.S(listD0, 10));
        Iterator it = listD0.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            aq aqVar2 = (aq) it.next();
            if (aqVar2 == this.D0) {
                z = true;
            }
            arrayList.add(new eq(aqVar2, Boolean.valueOf(z)));
        }
        q0e q0eVarA = r0e.a(arrayList);
        this.E0 = q0eVarA;
        this.F0 = new w7c(q0eVarA);
        this.G0 = new s35(0);
        q0e q0eVarA2 = r0e.a(nz4.a);
        this.H0 = q0eVarA2;
        this.I0 = new w7c(q0eVarA2);
        if (w()) {
            s(true, true);
            s(false, false);
        } else {
            s(false, true);
            s(true, false);
        }
    }

    public final es8 q(int i, String str) {
        return zu8.a((zu8) this.Z.getValue(), new cu8(i, 0L, 0L, 0L, ((p7b) u()).a.n(), ((p7b) u()).a.t(), 0L, str, iu8.Z, vx8.ACTIVE, ((p7b) u()).a.n(), null, null, null, 0, 0, 0L, null, null, null, false, 0, 0, 2, 0L, 0L, null, 0, 0L, 0, 0, 0L, new ArrayList(), null, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.vr
            if (r0 == 0) goto L13
            r0 = r8
            vr r0 = (defpackage.vr) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            vr r0 = new vr
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            zr r7 = r0.o
            defpackage.od2.a0(r8)
            goto L56
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            defpackage.od2.a0(r8)
            r0.o = r7
            r0.Z = r3
            kke r8 = r7.v()
            w9a r8 = (defpackage.w9a) r8
            nx3 r8 = r8.b()
            x5 r2 = new x5
            r3 = 11
            r2.<init>(r3, r7)
            h47 r3 = new h47
            r4 = 0
            r3.<init>(r2, r4)
            java.lang.Object r8 = defpackage.j47.t0(r8, r3, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            r1 = r8
            e52 r1 = (defpackage.e52) r1
            android.content.Context r8 = r7.t()
            int r0 = defpackage.o4a.i
            java.lang.String r8 = defpackage.z7.B(r8, r0)
            r0 = -2
            es8 r3 = r7.q(r0, r8)
            android.content.Context r8 = r7.t()
            int r0 = defpackage.o4a.f
            java.lang.String r8 = defpackage.z7.B(r8, r0)
            r0 = -1
            es8 r2 = r7.q(r0, r8)
            pm2 r8 = new pm2
            zof r4 = defpackage.zof.X
            je7 r0 = r7.t0
            java.lang.Object r0 = r0.getValue()
            r5 = r0
            k29 r5 = (defpackage.k29) r5
            qp4 r7 = r7.v0
            fka r7 = r7.i()
            nr2 r6 = r7.a()
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(boolean z, boolean z2) {
        pnf.n(this, ((w9a) v()).b(), null, new wr(this, z, z2, null), 2);
    }

    public final Context t() {
        return (Context) this.o.getValue();
    }

    public final m7b u() {
        return (m7b) this.b.getValue();
    }

    public final kke v() {
        return (kke) this.u0.getValue();
    }

    public final boolean w() {
        return ((tme) this.X.getValue()).e();
    }

    public final void x() {
        vxd vxdVarN = pnf.n(this, ((w9a) v()).b(), null, new yr(this, null), 2);
        this.A0.o1(this, J0[0], vxdVarN);
    }
}
