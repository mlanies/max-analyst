package defpackage;

/* loaded from: classes2.dex */
public final class px implements uu, pfc {
    public final long a;
    public final mg4 b;
    public final ome c;
    public final wmc d;
    public final jc2 e;
    public final xb9 f;
    public final uu g;
    public final wxc h;
    public final String i = px.class.getName();
    public sk6 j;

    public px(long j, mg4 mg4Var, ome omeVar, wmc wmcVar, jc2 jc2Var, xb9 xb9Var, ix ixVar, wxc wxcVar) {
        this.a = j;
        this.b = mg4Var;
        this.c = omeVar;
        this.d = wmcVar;
        this.e = jc2Var;
        this.f = xb9Var;
        this.g = ixVar;
        this.h = wxcVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|2|(2:4|(1:6)(1:8))(0)|7|9|(1:(1:(1:(5:14|64|(1:74)|75|76)(2:15|16))(7:17|85|18|19|52|60|(1:62)(5:63|64|(5:66|68|70|72|74)|75|76)))(1:22))(4:23|(2:25|(8:30|(1:32)|33|(1:35)|36|(1:38)|39|(1:41)(1:42)))|77|78)|43|81|44|45|79|46|47|83|48|(1:50)(4:51|52|60|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x022a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x022b, code lost:
    
        r4 = r1;
        r5 = r8;
        r1 = r0;
        r8 = r7;
        r0 = r9;
        r9 = r10;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0232, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0233, code lost:
    
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0235, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0236, code lost:
    
        r14 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x026e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r2v16, types: [dc2, kec, lec] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    @Override // defpackage.pfc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(long r36, int r38, int r39, long r40, long r42, kotlin.coroutines.Continuation r44) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 682
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.a(long, int, int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r17, long r18, long r20, kotlin.coroutines.Continuation r22) throws java.lang.Throwable {
        /*
            r16 = this;
            r10 = r16
            r0 = r22
            boolean r1 = r0 instanceof defpackage.ox
            if (r1 == 0) goto L18
            r1 = r0
            ox r1 = (defpackage.ox) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.u0 = r2
        L16:
            r11 = r1
            goto L1e
        L18:
            ox r1 = new ox
            r1.<init>(r10, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3a
            if (r1 != r13) goto L32
            px r1 = r11.o
            defpackage.od2.a0(r0)
            goto L88
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            px r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L70
        L48:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r18
            r11.X = r14
            r9 = r17
            r11.Z = r9
            r7 = r20
            r11.Y = r7
            r11.u0 = r2
            r3 = 0
            r5 = 0
            r0 = r16
            r1 = r18
            r4 = r17
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L6c
            return r12
        L6c:
            r3 = r17
            r1 = r20
        L70:
            uu r0 = r10.g
            r11.o = r10
            r11.u0 = r13
            r16 = r0
            r17 = r3
            r18 = r14
            r20 = r1
            r22 = r11
            java.lang.Object r0 = r16.b(r17, r18, r20, r22)
            if (r0 != r12) goto L87
            return r12
        L87:
            r1 = r10
        L88:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.n(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.b(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pfc
    public final void c(sk6 sk6Var) {
        this.j = sk6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // defpackage.uu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(int r19, long r20, long r22, kotlin.coroutines.Continuation r24) throws java.lang.Throwable {
        /*
            r18 = this;
            r10 = r18
            r0 = r24
            boolean r1 = r0 instanceof defpackage.nx
            if (r1 == 0) goto L18
            r1 = r0
            nx r1 = (defpackage.nx) r1
            int r2 = r1.u0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.u0 = r2
        L16:
            r11 = r1
            goto L1e
        L18:
            nx r1 = new nx
            r1.<init>(r10, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r11.s0
            tx3 r12 = defpackage.tx3.a
            int r1 = r11.u0
            r13 = 2
            r2 = 1
            if (r1 == 0) goto L48
            if (r1 == r2) goto L3a
            if (r1 != r13) goto L32
            px r1 = r11.o
            defpackage.od2.a0(r0)
            goto L8f
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            long r1 = r11.Y
            int r3 = r11.Z
            long r4 = r11.X
            px r6 = r11.o
            defpackage.od2.a0(r0)
            r14 = r4
            r10 = r6
            goto L77
        L48:
            defpackage.od2.a0(r0)
            r11.o = r10
            r14 = r20
            r11.X = r14
            r9 = r19
            r11.Z = r9
            r7 = r22
            r11.Y = r7
            r11.u0 = r2
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r4 = 0
            r0 = r18
            r1 = r20
            r3 = r19
            r5 = r22
            r7 = r16
            r9 = r11
            java.lang.Object r0 = r0.a(r1, r3, r4, r5, r7, r9)
            if (r0 != r12) goto L73
            return r12
        L73:
            r3 = r19
            r1 = r22
        L77:
            uu r0 = r10.g
            r11.o = r10
            r11.u0 = r13
            r18 = r0
            r19 = r3
            r20 = r14
            r22 = r1
            r24 = r11
            java.lang.Object r0 = r18.d(r19, r20, r22, r24)
            if (r0 != r12) goto L8e
            return r12
        L8e:
            r1 = r10
        L8f:
            java.util.List r0 = (java.util.List) r0
            java.lang.String r1 = r1.i
            int r2 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getMessages: result count: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            defpackage.hm9.n(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.px.d(int, long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
