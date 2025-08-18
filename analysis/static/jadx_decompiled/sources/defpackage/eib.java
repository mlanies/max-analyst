package defpackage;

/* loaded from: classes2.dex */
public final class eib implements on5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ on5 b;
    public final /* synthetic */ jib c;

    public /* synthetic */ eib(on5 on5Var, jib jibVar, int i) {
        this.a = i;
        this.b = on5Var;
        this.c = jibVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // defpackage.on5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r11, kotlin.coroutines.Continuation r12) throws java.lang.Throwable {
        /*
            r10 = this;
            e5f r0 = defpackage.e5f.a
            on5 r1 = r10.b
            jib r2 = r10.c
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            tx3 r5 = defpackage.tx3.a
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r10.a
            switch(r7) {
                case 0: goto L65;
                default: goto L12;
            }
        L12:
            boolean r7 = r12 instanceof defpackage.gib
            if (r7 == 0) goto L23
            r7 = r12
            gib r7 = (defpackage.gib) r7
            int r8 = r7.X
            r9 = r8 & r6
            if (r9 == 0) goto L23
            int r8 = r8 - r6
            r7.X = r8
            goto L28
        L23:
            gib r7 = new gib
            r7.<init>(r10, r12)
        L28:
            java.lang.Object r10 = r7.o
            int r12 = r7.X
            if (r12 == 0) goto L3a
            if (r12 != r4) goto L34
            defpackage.od2.a0(r10)
            goto L5e
        L34:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        L3a:
            defpackage.od2.a0(r10)
            ph0 r11 = (defpackage.ph0) r11
            boolean r10 = r11 instanceof defpackage.ph0
            if (r10 == 0) goto L5f
            long r10 = r11.a
            java.util.concurrent.atomic.AtomicLong r12 = r2.x0
            long r2 = r12.get()
            int r10 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r10 != 0) goto L52
            fz3 r10 = defpackage.fz3.a
            goto L53
        L52:
            r10 = 0
        L53:
            if (r10 == 0) goto L5e
            r7.X = r4
            java.lang.Object r10 = r1.a(r10, r7)
            if (r10 != r5) goto L5e
            r0 = r5
        L5e:
            return r0
        L5f:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L65:
            boolean r7 = r12 instanceof defpackage.dib
            if (r7 == 0) goto L76
            r7 = r12
            dib r7 = (defpackage.dib) r7
            int r8 = r7.X
            r9 = r8 & r6
            if (r9 == 0) goto L76
            int r8 = r8 - r6
            r7.X = r8
            goto L7b
        L76:
            dib r7 = new dib
            r7.<init>(r10, r12)
        L7b:
            java.lang.Object r10 = r7.o
            int r12 = r7.X
            if (r12 == 0) goto L8d
            if (r12 != r4) goto L87
            defpackage.od2.a0(r10)
            goto La0
        L87:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r3)
            throw r10
        L8d:
            defpackage.od2.a0(r10)
            e52 r11 = (defpackage.e52) r11
            bc7[] r10 = defpackage.jib.D0
            r2.q(r11)
            r7.X = r4
            java.lang.Object r10 = r1.a(r0, r7)
            if (r10 != r5) goto La0
            r0 = r5
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eib.a(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
