package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class e60 implements y3b {
    public static final /* synthetic */ bc7[] u0;
    public final kld X;
    public final v7c Y;
    public final w7c Z;
    public final kke a;
    public final t50 b;
    public final ch9 c;
    public final sx3 o;
    public final w4d s0;
    public final bkg t0;

    static {
        oi9 oi9Var = new oi9(e60.class, "updatePlayerJob", "getUpdatePlayerJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        u0 = new bc7[]{oi9Var};
    }

    public e60(kke kkeVar, t50 t50Var, ch9 ch9Var, sx3 sx3Var) {
        this.a = kkeVar;
        this.b = t50Var;
        this.c = ch9Var;
        this.o = sx3Var;
        kld kldVarB = lld.b(1, 0, 0, 6);
        this.X = kldVarB;
        this.Y = new v7c(kldVarB);
        this.Z = ((uh9) ch9Var).H;
        this.s0 = mqd.D();
        this.t0 = new bkg(3, new x5(17, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.e60 r12, kotlin.coroutines.Continuation r13) {
        /*
            ch9 r0 = r12.c
            r1 = r0
            uh9 r1 = (defpackage.uh9) r1
            bh9 r2 = r1.n()
            tb8 r3 = r1.B
            e5f r4 = defpackage.e5f.a
            tx3 r5 = defpackage.tx3.a
            kld r12 = r12.X
            if (r3 == 0) goto L27
            gd8 r3 = r3.d
            if (r3 == 0) goto L27
            kj6 r6 = defpackage.ub8.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L1e
            goto L27
        L1e:
            int r3 = r3.intValue()
            r6 = 2
            if (r3 != r6) goto L27
            goto L8f
        L27:
            tb8 r3 = r1.B
            if (r3 == 0) goto L3e
            gd8 r3 = r3.d
            if (r3 == 0) goto L3e
            kj6 r6 = defpackage.ub8.a
            java.lang.Integer r3 = r3.H
            if (r3 != 0) goto L36
            goto L3e
        L36:
            int r3 = r3.intValue()
            r6 = 3
            if (r3 != r6) goto L3e
            goto L8f
        L3e:
            int r1 = r1.v
            r3 = 1
            if (r1 != r3) goto L44
            goto L8f
        L44:
            if (r2 == 0) goto L8f
            boolean r1 = r0.b()
            if (r1 == 0) goto L4d
            goto L8f
        L4d:
            java.lang.CharSequence r1 = r2.a
            if (r1 != 0) goto L53
            java.lang.String r1 = ""
        L53:
            iqe r7 = new iqe
            r7.<init>(r1)
            iqe r8 = new iqe
            java.lang.CharSequence r1 = r2.b
            r8.<init>(r1)
            uh9 r0 = (defpackage.uh9) r0
            boolean r10 = r0.x
            xxc r1 = defpackage.d3b.b
            float r0 = r0.F
            r1.getClass()
            r1 = 1071644672(0x3fe00000, float:1.75)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L74
            d3b r0 = defpackage.d3b.X
        L72:
            r9 = r0
            goto L80
        L74:
            r1 = 1067450368(0x3fa00000, float:1.25)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L7d
            d3b r0 = defpackage.d3b.o
            goto L72
        L7d:
            d3b r0 = defpackage.d3b.c
            goto L72
        L80:
            ab9 r0 = new ab9
            r11 = 1
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11)
            java.lang.Object r12 = r12.a(r0, r13)
            if (r12 != r5) goto L98
        L8d:
            r4 = r12
            goto L98
        L8f:
            za9 r0 = defpackage.za9.a
            java.lang.Object r12 = r12.a(r0, r13)
            if (r12 != r5) goto L98
            goto L8d
        L98:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e60.e(e60, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.y3b
    public final void a() {
        ch9 ch9Var = this.c;
        boolean z = ((uh9) ch9Var).x;
        t50 t50Var = this.b;
        if (z) {
            ((uh9) t50Var.a).q();
        } else if (((uh9) ch9Var).w) {
            ((uh9) t50Var.a).r();
        }
    }

    @Override // defpackage.y3b
    public final void b() {
        ((uh9) this.c).t();
        j47.T(this.o, ((w9a) this.a).a(), null, new b60(this, null), 2);
    }

    @Override // defpackage.y3b
    public final void c(d3b d3bVar) {
        v25 v25Var = d3b.Z;
        float f = ((d3b) v25Var.get((d3bVar.ordinal() + 1) % v25Var.getSize())).a;
        uh9 uh9Var = (uh9) this.c;
        uh9Var.getClass();
        j47.T(uh9Var.h, null, null, new rh9(uh9Var, f, null), 3);
    }

    @Override // defpackage.y3b
    public final c64 d(Long l, boolean z) {
        Map map;
        bh9 bh9VarN = ((uh9) this.c).n();
        if (bh9VarN != null && (map = bh9VarN.c) != null) {
            Object obj = map.get("MediaMetadata.Extra.MESSAGE_ID");
            Long l2 = obj instanceof Long ? (Long) obj : null;
            if (l2 != null) {
                long jLongValue = l2.longValue();
                if (l != null) {
                    n0b n0bVar = n0b.c;
                    long jLongValue2 = l.longValue();
                    n0bVar.getClass();
                    return n0b.Z1(jLongValue2, jLongValue, z);
                }
                Object obj2 = map.get("MediaMetadata.Extra.CHAT_ID");
                Long l3 = obj2 instanceof Long ? (Long) obj2 : null;
                if (l3 == null) {
                    return null;
                }
                long jLongValue3 = l3.longValue();
                n0b.c.getClass();
                return n0b.Z1(jLongValue3, jLongValue, z);
            }
        }
        return null;
    }
}
