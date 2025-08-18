package defpackage;

/* loaded from: classes2.dex */
public final class ik5 implements sff, pv1 {
    public long a;
    public Object b;
    public Object c;

    public ik5() {
        this.b = new bw4(this);
        this.c = new bw4(this);
    }

    @Override // defpackage.pv1
    public mv1 A() {
        pv1 pv1Var = (pv1) this.b;
        return pv1Var != null ? pv1Var.A() : mv1.a;
    }

    @Override // defpackage.pv1
    public nje c() {
        return (nje) this.c;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.sff
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object e(kotlin.coroutines.Continuation r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.gk5
            if (r0 == 0) goto L13
            r0 = r9
            gk5 r0 = (defpackage.gk5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            gk5 r0 = new gk5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.o
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.od2.a0(r9)
            goto L68
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.c
            java.lang.String r9 = (java.lang.String) r9
            ir6 r2 = defpackage.hm9.m
            if (r2 != 0) goto L3b
            goto L4f
        L3b:
            boolean r4 = r2.c()
            if (r4 == 0) goto L4f
            us7 r4 = defpackage.us7.X
            long r5 = r8.a
            java.lang.String r7 = "Fetch video. File fetcher, fileId "
            java.lang.String r5 = defpackage.ey8.h(r5, r7)
            r6 = 0
            r2.d(r4, r9, r5, r6)
        L4f:
            java.lang.Object r9 = r8.b
            pk r9 = (defpackage.pk) r9
            tq2 r2 = new tq2
            long r4 = r8.a
            r8 = 14
            r6 = 0
            r2.<init>(r4, r8, r6)
            r0.Y = r3
            k4a r9 = (defpackage.k4a) r9
            java.lang.Object r9 = r9.J(r2, r0)
            if (r9 != r1) goto L68
            return r1
        L68:
            yg5 r9 = (defpackage.yg5) r9
            ef5 r8 = new ef5
            java.lang.String r9 = r9.c
            r0 = 3
            r8.<init>(r0, r9)
            gf5 r9 = new gf5
            java.util.List r8 = java.util.Collections.singletonList(r8)
            r9.<init>(r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ik5.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.pv1
    public long getTimestamp() {
        pv1 pv1Var = (pv1) this.b;
        if (pv1Var != null) {
            return pv1Var.getTimestamp();
        }
        long j = this.a;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }

    @Override // defpackage.pv1
    public nv1 r() {
        pv1 pv1Var = (pv1) this.b;
        return pv1Var != null ? pv1Var.r() : nv1.a;
    }

    @Override // defpackage.pv1
    public int s() {
        pv1 pv1Var = (pv1) this.b;
        if (pv1Var != null) {
            return pv1Var.s();
        }
        return 1;
    }

    @Override // defpackage.pv1
    public lv1 v() {
        pv1 pv1Var = (pv1) this.b;
        return pv1Var != null ? pv1Var.v() : lv1.a;
    }

    public ik5(pv1 pv1Var, nje njeVar, long j) {
        this.b = pv1Var;
        this.c = njeVar;
        this.a = j;
    }
}
