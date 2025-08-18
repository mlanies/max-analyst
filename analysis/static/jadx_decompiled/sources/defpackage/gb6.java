package defpackage;

/* loaded from: classes2.dex */
public final class gb6 {
    public static final /* synthetic */ int f = 0;
    public final pk a;
    public final av0 b;
    public final p82 c;
    public final ua3 d = ngg.a();
    public final fb6 e = new fb6(this);

    public gb6(pk pkVar, av0 av0Var, p82 p82Var) {
        this.a = pkVar;
        this.b = av0Var;
        this.c = p82Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Comparable a(long r9, boolean r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r12 instanceof defpackage.eb6
            if (r0 == 0) goto L13
            r0 = r12
            eb6 r0 = (defpackage.eb6) r0
            int r1 = r0.s0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.s0 = r1
            goto L18
        L13:
            eb6 r0 = new eb6
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.Y
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.s0
            r3 = 1
            r4 = 0
            java.lang.String r5 = "gb6"
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            long r9 = r0.X
            gb6 r8 = r0.o
            defpackage.od2.a0(r12)     // Catch: java.lang.Throwable -> L2f
            goto Lab
        L2f:
            r9 = move-exception
            goto Lce
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            defpackage.od2.a0(r12)
            r6 = 0
            int r12 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r12 != 0) goto L5c
            java.lang.Class<gb6> r8 = defpackage.gb6.class
            java.lang.String r8 = r8.getName()
            ir6 r9 = defpackage.hm9.m
            if (r9 != 0) goto L4e
            goto L5b
        L4e:
            boolean r10 = r9.c()
            if (r10 == 0) goto L5b
            us7 r10 = defpackage.us7.Z
            java.lang.String r11 = "invalid server chat id #0!"
            r9.d(r10, r8, r11, r4)
        L5b:
            return r4
        L5c:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r2 = "execute: "
            r12.<init>(r2)
            r12.append(r9)
            java.lang.String r2 = ", force: "
            r12.append(r2)
            r12.append(r11)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.n(r5, r12)
            p82 r12 = r8.c
            e52 r12 = r12.z(r9)
            if (r12 == 0) goto L85
            if (r11 != 0) goto L85
            java.lang.String r8 = "execute: chat contains!"
            defpackage.hm9.n(r5, r8)
            return r12
        L85:
            fb6 r11 = r8.e
            r11.a = r9
            av0 r11 = r8.b
            fb6 r12 = r8.e
            r11.d(r12)
            fb6 r11 = r8.e
            pk r12 = r8.a
            k4a r12 = (defpackage.k4a) r12
            long r6 = r12.j(r9)
            r11.b = r6
            ua3 r11 = r8.d     // Catch: java.lang.Throwable -> L2f
            r0.o = r8     // Catch: java.lang.Throwable -> L2f
            r0.X = r9     // Catch: java.lang.Throwable -> L2f
            r0.s0 = r3     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r12 = r11.awaitInternal(r0)     // Catch: java.lang.Throwable -> L2f
            if (r12 != r1) goto Lab
            return r1
        Lab:
            e52 r12 = (defpackage.e52) r12     // Catch: java.lang.Throwable -> L2f
            av0 r11 = r8.b
            fb6 r8 = r8.e
            r11.f(r8)
            java.lang.String r8 = "get chat info"
            defpackage.hm9.n(r5, r8)
            if (r12 != 0) goto Lcd
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r9)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.Object[] r8 = java.util.Arrays.copyOf(r8, r3)
            java.lang.String r9 = "chat info is null %d"
            defpackage.hm9.k0(r5, r4, r9, r8)
        Lcd:
            return r12
        Lce:
            av0 r10 = r8.b
            fb6 r8 = r8.e
            r10.f(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gb6.a(long, boolean, kotlin.coroutines.Continuation):java.lang.Comparable");
    }
}
