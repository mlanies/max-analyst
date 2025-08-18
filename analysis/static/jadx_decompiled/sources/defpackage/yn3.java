package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yn3 implements qn3 {
    public final rta b;
    public final Context c;
    public final je7 d;
    public final je7 e;
    public final je7 f;
    public final je7 g;
    public final je7 h;
    public final je7 i;
    public final je7 j;
    public final q0e k;
    public final w7c l;
    public final je7 m;
    public final je7 n;
    public final AtomicBoolean o;

    public yn3(je7 je7Var, je7 je7Var2, je7 je7Var3, je7 je7Var4, je7 je7Var5, je7 je7Var6, je7 je7Var7, je7 je7Var8, rta rtaVar, Context context, tm3 tm3Var) {
        this.b = rtaVar;
        this.c = context;
        this.d = je7Var2;
        this.e = je7Var4;
        this.f = je7Var5;
        this.g = je7Var3;
        this.h = je7Var6;
        this.i = je7Var7;
        this.j = je7Var8;
        q0e q0eVarA = r0e.a(dn3.d);
        this.k = q0eVarA;
        this.l = new w7c(q0eVarA);
        this.m = tu0.r(3, new z30(11, je7Var));
        je7 je7VarR = tu0.r(3, new md1(25, this));
        this.n = je7VarR;
        this.o = new AtomicBoolean(false);
        od2.L(new zn5(tm3Var.a(), new rn3(this, null), 5), (sx3) je7VarR.getValue());
        od2.L(new zn5(new cp5(new zn5(od2.E(new qn5(3, new m58(rtaVar.b, 21))), new qta(rtaVar, null)), new br(rtaVar, (Continuation) null, 12)), new sn3(this, null), 5), (sx3) je7VarR.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /* JADX WARN: Type inference failed for: r1v0, types: [tx3] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable c(defpackage.yn3 r5, kotlin.coroutines.Continuation r6) {
        /*
            r5.getClass()
            boolean r0 = r6 instanceof defpackage.un3
            if (r0 == 0) goto L16
            r0 = r6
            un3 r0 = (defpackage.un3) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.Z = r1
            goto L1b
        L16:
            un3 r0 = new un3
            r0.<init>(r5, r6)
        L1b:
            java.lang.Object r6 = r0.X
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yn3 r5 = r0.o
            defpackage.od2.a0(r6)
            goto L4c
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            defpackage.od2.a0(r6)
            je7 r6 = r5.d
            java.lang.Object r6 = r6.getValue()
            ds3 r6 = (defpackage.ds3) r6
            r0.o = r5
            r0.Z = r3
            el3 r6 = r6.a
            java.util.List r6 = r6.k()
            if (r6 != r1) goto L4c
            goto L91
        L4c:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            je7 r1 = r5.h
            java.lang.Object r1 = r1.getValue()
            oq3 r1 = (defpackage.oq3) r1
            r1.getClass()
            ca3 r2 = new ca3
            r3 = 2
            r2.<init>(r3, r1)
            java.util.List r6 = defpackage.x53.x0(r6, r2)
            lx3 r0 = r0.b
            kotlinx.coroutines.internal.ContextScope r0 = defpackage.j1e.a(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.z53.S(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L78:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L91
            java.lang.Object r2 = r6.next()
            tn3 r3 = new tn3
            r4 = 0
            r3.<init>(r2, r4, r5)
            r2 = 3
            zf4 r2 = defpackage.j47.h(r0, r4, r3, r2)
            r1.add(r2)
            goto L78
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn3.c(yn3, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021f A[EDGE_INSN: B:104:0x021f->B:67:0x021f BREAK  A[LOOP:4: B:55:0x01eb->B:107:0x01eb], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01cf A[LOOP:3: B:51:0x01c9->B:53:0x01cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0252 A[LOOP:7: B:74:0x024c->B:76:0x0252, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02b8 A[LOOP:9: B:84:0x02b2->B:86:0x02b8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02e3 A[LOOP:10: B:88:0x02dd->B:90:0x02e3, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable d(defpackage.yn3 r21, kotlin.coroutines.Continuation r22) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yn3.d(yn3, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    @Override // defpackage.qn3
    public final j0e a() {
        return this.l;
    }

    @Override // defpackage.qn3
    public final void b() {
        if (this.o.compareAndSet(false, true)) {
            j47.T((sx3) this.n.getValue(), null, null, new xn3(this, null), 3);
        }
    }
}
