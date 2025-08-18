package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class e58 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ p58 Y;
    public final /* synthetic */ long Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e58(p58 p58Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = p58Var;
        this.Z = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((e58) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new e58(this.Y, this.Z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r12) throws java.lang.Throwable {
        /*
            r11 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r11.X
            e5f r2 = defpackage.e5f.a
            r3 = 1
            r4 = 2
            p58 r5 = r11.Y
            if (r1 == 0) goto L21
            if (r1 == r3) goto L1d
            if (r1 != r4) goto L15
            defpackage.od2.a0(r12)
            goto Lcb
        L15:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L1d:
            defpackage.od2.a0(r12)
            goto L37
        L21:
            defpackage.od2.a0(r12)
            je7 r12 = r5.c
            java.lang.Object r12 = r12.getValue()
            r79 r12 = (defpackage.r79) r12
            r11.X = r3
            long r6 = r11.Z
            java.lang.Object r12 = r12.a(r6, r11)
            if (r12 != r0) goto L37
            return r0
        L37:
            cu8 r12 = (defpackage.cu8) r12
            if (r12 != 0) goto L3c
            return r2
        L3c:
            xp7 r1 = defpackage.p58.q(r5)
            p4d r1 = r1.f
            java.lang.CharSequence r1 = r1.k
            je7 r6 = r5.o
            java.lang.Object r6 = r6.getValue()
            xp7 r6 = (defpackage.xp7) r6
            p4d r6 = r6.f
            r7 = 0
            r6.k = r7
            p4d r6 = r5.r()
            java.util.ArrayList r6 = r6.d()
            p4d r7 = r5.r()
            r7.getClass()
            boolean r8 = r12.n()
            r9 = 0
            if (r8 == 0) goto L7d
            k8g r12 = r12.z0
            java.lang.Object r12 = r12.a
            java.util.List r12 = (java.util.List) r12
            p4c r8 = new p4c
            r10 = 22
            r8.<init>(r10)
            java.util.List r12 = defpackage.nd7.p(r12, r8)
            int r12 = r12.size()
            goto L7e
        L7d:
            r12 = r9
        L7e:
            java.util.concurrent.CopyOnWriteArraySet r7 = r7.a
            int r8 = r7.size()
            if (r12 == r8) goto L88
        L86:
            r9 = r3
            goto Lb1
        L88:
            java.util.Iterator r12 = r7.iterator()
        L8c:
            boolean r7 = r12.hasNext()
            if (r7 == 0) goto Lb1
            java.lang.Object r7 = r12.next()
            r4d r7 = (defpackage.r4d) r7
            boolean r8 = r7.f
            up7 r10 = r7.a
            if (r8 != 0) goto La3
            boolean r8 = r10 instanceof defpackage.j00
            if (r8 == 0) goto La3
            goto L86
        La3:
            awa r7 = r7.c
            boolean r7 = defpackage.awa.b(r7, r10)
            if (r7 == 0) goto Lac
            goto L86
        Lac:
            boolean r7 = r10 instanceof defpackage.j00
            if (r7 != 0) goto L8c
            goto L86
        Lb1:
            v48 r12 = new v48
            r12.<init>(r1, r6, r9)
            s35 r1 = r5.w0
            defpackage.pnf.o(r1, r12)
            a48 r12 = new a48
            r12.<init>(r3)
            r11.X = r4
            zt0 r1 = r5.t0
            java.lang.Object r11 = r1.o(r12, r11)
            if (r11 != r0) goto Lcb
            return r0
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e58.o(java.lang.Object):java.lang.Object");
    }
}
