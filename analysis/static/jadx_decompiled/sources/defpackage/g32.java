package defpackage;

/* loaded from: classes2.dex */
public final class g32 extends ol implements lme {
    public final String X;
    public final int Y;
    public final String o;

    public g32(long j, String str, String str2) {
        super(j);
        this.o = str;
        this.X = str2;
        this.Y = 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x009d  */
    @Override // defpackage.lme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(defpackage.gle r15) {
        /*
            r14 = this;
            mf9 r15 = (defpackage.mf9) r15
            p82 r0 = r14.m()
            f52 r1 = r15.X
            java.util.List r1 = java.util.Collections.singletonList(r1)
            gi9 r0 = r0.c0(r1)
            long[] r1 = r0.b
            long[] r0 = r0.a
            int r2 = r0.length
            int r2 = r2 + (-2)
            if (r2 < 0) goto La3
            r3 = 0
            r4 = r3
        L1b:
            r5 = r0[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L9d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L35:
            if (r9 >= r7) goto L9b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L97
            int r0 = r4 << 3
            int r0 = r0 + r9
            r0 = r1[r0]
            au8 r2 = r14.p()
            m7b r3 = r14.r()
            p7b r3 = (defpackage.p7b) r3
            t33 r3 = r3.a
            long r5 = r3.t()
            fs8 r7 = r15.o
            r3 = r0
            long r2 = r2.f(r3, r5, r7)
            au8 r4 = r14.p()
            cu8 r8 = r4.q(r2)
            java.lang.String r2 = r14.X
            if (r2 == 0) goto L7d
            int r2 = r2.length()
            if (r2 != 0) goto L6f
            goto L7d
        L6f:
            pk r2 = r14.j()
            k4a r2 = (defpackage.k4a) r2
            long r6 = r15.c
            java.lang.String r5 = r14.X
            r3 = r0
            r2.n(r3, r5, r6)
        L7d:
            p82 r2 = r14.m()
            long r5 = r15.c
            r3 = r0
            r7 = r8
            r2.S(r3, r5, r7)
            av0 r15 = r14.l()
            h32 r2 = new h32
            long r3 = r14.a
            r2.<init>(r3, r0)
            r15.c(r2)
            return
        L97:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L35
        L9b:
            if (r7 != r8) goto La3
        L9d:
            if (r4 == r2) goto La3
            int r4 = r4 + 1
            goto L1b
        La3:
            java.util.NoSuchElementException r14 = new java.util.NoSuchElementException
            java.lang.String r15 = "The LongSet is empty"
            r14.<init>(r15)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g32.e(gle):void");
    }

    @Override // defpackage.lme
    public final void g(pke pkeVar) {
        l().c(new oi0(this.a, pkeVar));
    }

    @Override // defpackage.ol
    public final dle i() {
        ju3 ju3Var = new ju3(2, null, nz4.a, this.o, null, null, null, null, null, null, true, this.Y, null, null, false, false);
        kna knaVar = new kna();
        knaVar.a = System.currentTimeMillis();
        wz wzVar = new wz(1);
        wzVar.add(ju3Var);
        knaVar.c = wzVar;
        return new tq2(0L, 0L, knaVar.a(), null, 0L);
    }
}
