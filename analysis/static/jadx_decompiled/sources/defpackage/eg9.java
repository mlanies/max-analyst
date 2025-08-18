package defpackage;

/* loaded from: classes2.dex */
public final class eg9 {
    public static final /* synthetic */ bc7[] i;
    public final sx3 a;
    public final kke b;
    public final j0e c;
    public final a66 d;
    public final je7 e;
    public final q0e f;
    public final w7c g;
    public final w4d h;

    static {
        oi9 oi9Var = new oi9(eg9.class, "newSelectionJob", "getNewSelectionJob()Lkotlinx/coroutines/Job;");
        nec.a.getClass();
        i = new bc7[]{oi9Var};
    }

    public eg9(je7 je7Var, sx3 sx3Var, kke kkeVar, j0e j0eVar, vw vwVar) {
        this.a = sx3Var;
        this.b = kkeVar;
        this.c = j0eVar;
        this.d = vwVar;
        this.e = je7Var;
        q0e q0eVarA = r0e.a(new yf9());
        this.f = q0eVarA;
        this.g = new w7c(q0eVarA);
        this.h = mqd.D();
    }

    public static zka a(gs8 gs8Var) {
        int iOrdinal = gs8Var.ordinal();
        if (iOrdinal == 0) {
            return new zka(mda.v, oda.l, woc.Z1);
        }
        if (iOrdinal == 1) {
            return new zka(mda.q, oda.e, woc.t);
        }
        if (iOrdinal == 4) {
            return new zka(mda.y, oda.o, woc.R1);
        }
        if (iOrdinal == 5) {
            return new zka(mda.s, oda.i, woc.w);
        }
        if (iOrdinal == 7) {
            return new zka(mda.x, oda.n, woc.E1);
        }
        if (iOrdinal != 8) {
            return null;
        }
        return new zka(mda.C, oda.s, woc.C1);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(java.util.Set r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.zf9
            if (r0 == 0) goto L13
            r0 = r6
            zf9 r0 = (defpackage.zf9) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            zf9 r0 = new zf9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kl7 r4 = r0.Y
            kl7 r5 = r0.X
            eg9 r0 = r0.o
            defpackage.od2.a0(r6)
            goto L57
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            defpackage.od2.a0(r6)
            kl7 r6 = defpackage.j1e.l()
            je7 r2 = r4.e
            java.lang.Object r2 = r2.getValue()
            ns8 r2 = (defpackage.ns8) r2
            r0.o = r4
            r0.X = r6
            r0.Y = r6
            r0.t0 = r3
            java.io.Serializable r5 = r2.e(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            r0 = r4
            r4 = r6
            r6 = r5
            r5 = r4
        L57:
            java.util.Collection r6 = (java.util.Collection) r6
            r4.addAll(r6)
            kl7 r4 = defpackage.j1e.d(r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r6 = 0
            java.util.ListIterator r4 = r4.listIterator(r6)
        L6a:
            r6 = r4
            il7 r6 = (defpackage.il7) r6
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L86
            java.lang.Object r6 = r6.next()
            gs8 r6 = (defpackage.gs8) r6
            r0.getClass()
            zka r6 = a(r6)
            if (r6 == 0) goto L6a
            r5.add(r6)
            goto L6a
        L86:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg9.b(java.util.Set, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(one.me.messages.list.loader.MessageModel r6, kotlin.coroutines.Continuation r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ag9
            if (r0 == 0) goto L13
            r0 = r7
            ag9 r0 = (defpackage.ag9) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.t0 = r1
            goto L18
        L13:
            ag9 r0 = new ag9
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.Z
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.t0
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            kl7 r5 = r0.Y
            kl7 r6 = r0.X
            eg9 r0 = r0.o
            defpackage.od2.a0(r7)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.od2.a0(r7)
            if (r6 != 0) goto L3d
            nz4 r5 = defpackage.nz4.a
            return r5
        L3d:
            kl7 r7 = defpackage.j1e.l()
            je7 r2 = r5.e
            java.lang.Object r2 = r2.getValue()
            ns8 r2 = (defpackage.ns8) r2
            r0.o = r5
            r0.X = r7
            r0.Y = r7
            r0.t0 = r3
            long r3 = r6.a
            java.io.Serializable r6 = r2.d(r3, r0)
            if (r6 != r1) goto L5a
            return r1
        L5a:
            r0 = r5
            r5 = r7
            r7 = r6
            r6 = r5
        L5e:
            java.util.Collection r7 = (java.util.Collection) r7
            r5.addAll(r7)
            kl7 r5 = defpackage.j1e.d(r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
            java.util.ListIterator r5 = r5.listIterator(r7)
        L71:
            r7 = r5
            il7 r7 = (defpackage.il7) r7
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L8d
            java.lang.Object r7 = r7.next()
            gs8 r7 = (defpackage.gs8) r7
            r0.getClass()
            zka r7 = a(r7)
            if (r7 == 0) goto L71
            r6.add(r7)
            goto L71
        L8d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eg9.c(one.me.messages.list.loader.MessageModel, kotlin.coroutines.Continuation):java.io.Serializable");
    }

    public final boolean d() {
        return !((yf9) this.g.a.getValue()).a.isEmpty();
    }

    public final void e(long j) {
        vxd vxdVarS = j47.S(this.a, ((w9a) this.b).a(), vx3.b, new cg9(j, this, null));
        this.h.o1(this, i[0], vxdVarS);
    }
}
