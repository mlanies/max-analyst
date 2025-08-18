package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class kr extends pnf {
    public static final /* synthetic */ bc7[] E0;
    public final w7c A0;
    public final bq B0;
    public final s35 C0;
    public final w4d D0;
    public final je7 X;
    public final je7 Y;
    public final je7 Z;
    public final je7 b;
    public final jp c;
    public final je7 o;
    public final je7 s0;
    public final je7 t0;
    public final je7 u0;
    public final je7 v0;
    public volatile Map w0;
    public volatile Map x0;
    public final qp4 y0;
    public final q0e z0;

    static {
        oi9 oi9Var = new oi9(kr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        E0 = new bc7[]{oi9Var};
    }

    public kr() {
        bq bqVar;
        jq jqVar = jq.a;
        p7b p7bVar = (p7b) jqVar.getAccessor().c(p7b.class);
        khe kheVarD = jqVar.getAccessor().d(m7b.class);
        khe kheVarD2 = jqVar.getAccessor().d(Context.class);
        khe kheVarD3 = jqVar.getAccessor().d(ma2.class);
        khe kheVarD4 = jqVar.getAccessor().d(zu8.class);
        khe kheVarD5 = jqVar.getAccessor().d(el3.class);
        khe kheVarD6 = jqVar.getAccessor().d(k29.class);
        khe kheVarD7 = jqVar.getAccessor().d(kke.class);
        khe kheVarD8 = jqVar.getAccessor().d(qe5.class);
        this.b = kheVarD;
        this.c = p7bVar.c;
        this.o = kheVarD2;
        this.X = kheVarD3;
        this.Y = kheVarD4;
        this.Z = kheVarD5;
        this.s0 = kheVarD6;
        this.t0 = kheVarD7;
        this.u0 = tu0.r(3, new dr(kheVarD7, kheVarD8, 0));
        this.v0 = tu0.r(3, new x2(this, 2, kheVarD7));
        oz4 oz4Var = oz4.a;
        this.w0 = oz4Var;
        this.x0 = oz4Var;
        qp4 qp4VarB = qp4.u0.b((Context) kheVarD2.getValue());
        this.y0 = qp4VarB;
        q0e q0eVarA = r0e.a(null);
        this.z0 = q0eVarA;
        this.A0 = new w7c(q0eVarA);
        gq9 gq9VarY = ((pl8) qp4VarB.Y).y();
        if ((gq9VarY instanceof bq9) || (gq9VarY instanceof eq9) || gq9VarY.equals(fq9.b)) {
            bqVar = bq.a;
        } else if (gq9VarY.equals(cq9.b)) {
            bqVar = bq.b;
        } else {
            if (!gq9VarY.equals(dq9.b)) {
                throw new NoWhenBranchMatchedException();
            }
            bqVar = bq.c;
        }
        this.B0 = bqVar;
        this.C0 = new s35(0);
        this.D0 = mqd.D();
        pnf.n(this, null, null, new ir(this, null), 3);
    }

    public final es8 q(int i, String str, ix8 ix8Var, boolean z) {
        long j = i;
        je7 je7Var = this.b;
        return zu8.a((zu8) this.Y.getValue(), new cu8(j, 0L, 0L, 0L, ((p7b) ((m7b) je7Var.getValue())).a.n(), z ? 1L : ((p7b) ((m7b) je7Var.getValue())).a.t(), 0L, str, iu8.Z, vx8.ACTIVE, ((p7b) ((m7b) je7Var.getValue())).a.n(), null, null, null, 0, 0, 0L, null, null, null, false, 0, 0, 2, 0L, 0L, null, 0, 0L, 0, 0, 0L, new ArrayList(), ix8Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object r(kotlin.coroutines.Continuation r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof defpackage.gr
            if (r0 == 0) goto L13
            r0 = r14
            gr r0 = (defpackage.gr) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            gr r0 = new gr
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kr r13 = r0.o
            defpackage.od2.a0(r14)
            goto L5a
        L2a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L32:
            defpackage.od2.a0(r14)
            r0.o = r13
            r0.Z = r4
            je7 r14 = r13.t0
            java.lang.Object r14 = r14.getValue()
            kke r14 = (defpackage.kke) r14
            w9a r14 = (defpackage.w9a) r14
            nx3 r14 = r14.b()
            x5 r2 = new x5
            r5 = 10
            r2.<init>(r5, r13)
            h47 r5 = new h47
            r5.<init>(r2, r3)
            java.lang.Object r14 = defpackage.j47.t0(r14, r5, r0)
            if (r14 != r1) goto L5a
            return r1
        L5a:
            r6 = r14
            e52 r6 = (defpackage.e52) r6
            je7 r14 = r13.o
            java.lang.Object r14 = r14.getValue()
            android.content.Context r14 = (android.content.Context) r14
            int r0 = defpackage.o4a.g
            java.lang.String r14 = defpackage.z7.B(r14, r0)
            r0 = -3
            es8 r7 = r13.q(r0, r14, r3, r4)
            je7 r14 = r13.o
            java.lang.Object r0 = r14.getValue()
            android.content.Context r0 = (android.content.Context) r0
            int r1 = defpackage.o4a.j
            java.lang.String r0 = defpackage.z7.B(r0, r1)
            ix8 r1 = new ix8
            hx8 r2 = new hx8
            c6c r5 = new c6c
            d6c r8 = defpackage.d6c.c
            v5c r9 = new v5c
            java.lang.String r10 = "🔥"
            r9.<init>(r10)
            r5.<init>(r8, r9)
            r2.<init>(r5, r4)
            hx8 r5 = new hx8
            c6c r9 = new c6c
            v5c r10 = new v5c
            java.lang.String r11 = "❤️"
            r10.<init>(r11)
            r9.<init>(r8, r10)
            r5.<init>(r9, r4)
            hx8[] r2 = new defpackage.hx8[]{r2, r5}
            java.util.List r2 = defpackage.y53.M(r2)
            r5 = 2
            r1.<init>(r2, r5, r3)
            r2 = 0
            r5 = -2
            es8 r9 = r13.q(r5, r0, r1, r2)
            java.lang.Object r14 = r14.getValue()
            android.content.Context r14 = (android.content.Context) r14
            int r0 = defpackage.o4a.h
            java.lang.String r14 = defpackage.z7.B(r14, r0)
            r0 = -1
            es8 r8 = r13.q(r0, r14, r3, r4)
            zof r10 = defpackage.zof.X
            je7 r14 = r13.s0
            java.lang.Object r14 = r14.getValue()
            r11 = r14
            k29 r11 = (defpackage.k29) r11
            qp4 r13 = r13.y0
            fka r13 = r13.i()
            nr2 r12 = r13.a()
            qm2 r13 = new qm2
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kr.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Drawable s() {
        return (Drawable) (this.y0.j() ? this.w0 : this.x0).get(this.y0.g().a);
    }

    public final ArrayList t(List list) {
        ArrayList arrayList = new ArrayList(z53.S(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wre wreVar = (wre) it.next();
            Object obj = (this.y0.j() ? this.w0 : this.x0).get(wreVar.b);
            rre rreVarA = null;
            rre rreVar = obj instanceof rre ? (rre) obj : null;
            if (rreVar != null) {
                rreVarA = rreVar.a(0.45f);
            }
            arrayList.add(wre.k(wreVar, false, rreVarA, 7));
        }
        return arrayList;
    }
}
