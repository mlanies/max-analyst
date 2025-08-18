package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class vt0 extends p66 implements c66 {
    public static final vt0 a = new vt0(3, zt0.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0072, code lost:
    
        return defpackage.e5f.a;
     */
    @Override // defpackage.c66
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r9, java.lang.Object r10, java.lang.Object r11) {
        /*
            r8 = this;
            zt0 r9 = (defpackage.zt0) r9
            z3d r10 = (defpackage.z3d) r10
            java.util.concurrent.atomic.AtomicLongFieldUpdater r8 = defpackage.zt0.o
            r9.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.zt0.t0
            java.lang.Object r8 = r8.get(r9)
            j42 r8 = (defpackage.j42) r8
        L11:
            boolean r11 = r9.x()
            if (r11 == 0) goto L1e
            kotlinx.coroutines.internal.Symbol r8 = defpackage.bu0.l
            y3d r10 = (defpackage.y3d) r10
            r10.X = r8
            goto L70
        L1e:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r11 = defpackage.zt0.X
            long r6 = r11.getAndIncrement(r9)
            int r11 = defpackage.bu0.b
            long r0 = (long) r11
            long r2 = r6 / r0
            long r0 = r6 % r0
            int r11 = (int) r0
            long r0 = r8.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L3a
            j42 r0 = r9.r(r2, r8)
            if (r0 != 0) goto L39
            goto L11
        L39:
            r8 = r0
        L3a:
            r0 = r9
            r1 = r8
            r2 = r11
            r3 = r6
            r5 = r10
            java.lang.Object r0 = r0.H(r1, r2, r3, r5)
            kotlinx.coroutines.internal.Symbol r1 = defpackage.bu0.m
            if (r0 != r1) goto L55
            boolean r9 = r10 instanceof defpackage.irf
            if (r9 == 0) goto L4e
            irf r10 = (defpackage.irf) r10
            goto L4f
        L4e:
            r10 = 0
        L4f:
            if (r10 == 0) goto L70
            r10.a(r8, r11)
            goto L70
        L55:
            kotlinx.coroutines.internal.Symbol r11 = defpackage.bu0.o
            if (r0 != r11) goto L65
            long r0 = r9.u()
            int r11 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r11 >= 0) goto L11
            r8.cleanPrev()
            goto L11
        L65:
            kotlinx.coroutines.internal.Symbol r9 = defpackage.bu0.n
            if (r0 == r9) goto L73
            r8.cleanPrev()
            y3d r10 = (defpackage.y3d) r10
            r10.X = r0
        L70:
            e5f r8 = defpackage.e5f.a
            return r8
        L73:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "unexpected"
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vt0.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
