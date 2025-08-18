package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class tx7 implements qj3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ String o;

    public /* synthetic */ tx7(yx7 yx7Var, long j, String str, int i) {
        this.a = i;
        this.b = yx7Var;
        this.c = j;
        this.o = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    @Override // defpackage.qj3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void accept(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.a
            switch(r0) {
                case 0: goto L41;
                default: goto L5;
            }
        L5:
            yx7 r0 = r9.b
            long r1 = r9.c
            java.lang.String r9 = r9.o
            java.util.List r10 = (java.util.List) r10
            r0.getClass()
            int r3 = r10.size()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r1
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r1 = new java.lang.Object[]{r3, r1}
            java.lang.String r2 = "yx7"
            java.lang.String r3 = "searchChats %d, finish %dms"
            defpackage.hm9.H(r2, r3, r1)
            r0.o = r10
            boolean r1 = r10.isEmpty()
            if (r1 != 0) goto L39
            av0 r1 = r0.e     // Catch: java.lang.Exception -> L39
            r1.d(r0)     // Catch: java.lang.Exception -> L39
        L39:
            px7 r0 = r0.i
            if (r0 == 0) goto L40
            r0.b(r9, r10)
        L40:
            return
        L41:
            yx7 r0 = r9.b
            long r1 = r9.c
            java.lang.String r9 = r9.o
            vx7 r10 = (defpackage.vx7) r10
            r0.getClass()
            java.lang.String r3 = "yx7"
            java.lang.String r4 = "searchChatsAndMessages %d, finish %d ms"
            monitor-enter(r10)
            java.util.ArrayList r5 = r10.c     // Catch: java.lang.Throwable -> Lca
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lca
            monitor-exit(r10)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r7 = java.lang.System.nanoTime()
            long r7 = r7 - r1
            long r1 = r6.toMillis(r7)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.Object[] r1 = new java.lang.Object[]{r5, r1}
            defpackage.hm9.H(r3, r4, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.ArrayList r2 = r10.c
            r1.<init>(r2)
            r0.n = r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L86
            av0 r2 = r0.e     // Catch: java.lang.Exception -> L86
            r2.d(r0)     // Catch: java.lang.Exception -> L86
        L86:
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 == 0) goto Lb7
            monitor-enter(r10)
            java.util.EnumSet r2 = r10.a     // Catch: java.lang.Throwable -> Lae
            wx7 r4 = defpackage.wx7.a     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto Lb0
            java.util.EnumSet r2 = r10.a     // Catch: java.lang.Throwable -> Lae
            wx7 r4 = defpackage.wx7.c     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto Lb0
            java.util.EnumSet r2 = r10.a     // Catch: java.lang.Throwable -> Lae
            wx7 r4 = defpackage.wx7.b     // Catch: java.lang.Throwable -> Lae
            boolean r2 = r2.contains(r4)     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto Lb0
            r2 = 1
            goto Lb1
        Lae:
            r9 = move-exception
            goto Lb5
        Lb0:
            r2 = r3
        Lb1:
            monitor-exit(r10)
            if (r2 != 0) goto Lb7
            goto Lc9
        Lb5:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lae
            throw r9
        Lb7:
            px7 r10 = r0.i
            if (r10 == 0) goto Lc9
            java.lang.String r10 = "yx7"
            java.lang.String r2 = "searchChatsAndMessages, notify listener"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            defpackage.hm9.H(r10, r2, r3)
            px7 r10 = r0.i
            r10.c(r9, r1)
        Lc9:
            return
        Lca:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lca
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tx7.accept(java.lang.Object):void");
    }
}
