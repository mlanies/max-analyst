package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s95 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ t95 Z;
    public final /* synthetic */ String s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s95(t95 t95Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = t95Var;
        this.s0 = str;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((s95) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        s95 s95Var = new s95(this.Z, this.s0, continuation);
        s95Var.Y = obj;
        return s95Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x0013, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:17:0x004a, B:19:0x0050, B:20:0x0067), top: B:27:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067 A[Catch: all -> 0x0013, TRY_LEAVE, TryCatch #0 {all -> 0x0013, blocks: (B:6:0x000f, B:17:0x004a, B:19:0x0050, B:20:0x0067), top: B:27:0x000f }] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.X
            r2 = 1
            t95 r3 = r8.Z
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r8 = r8.Y
            sx3 r8 = (defpackage.sx3) r8
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L13
            goto L4a
        L13:
            r9 = move-exception
            goto L73
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L1d:
            defpackage.od2.a0(r9)
            java.lang.Object r9 = r8.Y
            sx3 r9 = (defpackage.sx3) r9
            q95 r1 = new q95     // Catch: java.lang.Throwable -> L6f
            java.lang.String r4 = r8.s0     // Catch: java.lang.Throwable -> L6f
            r5 = 0
            r1.<init>(r3, r4, r5)     // Catch: java.lang.Throwable -> L6f
            mqc r4 = new mqc     // Catch: java.lang.Throwable -> L6f
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6f
            r95 r1 = new r95     // Catch: java.lang.Throwable -> L6f
            r1.<init>(r9, r5)     // Catch: java.lang.Throwable -> L6f
            r5 = 5
            ac r1 = defpackage.od2.S(r4, r5, r1)     // Catch: java.lang.Throwable -> L6f
            r8.Y = r9     // Catch: java.lang.Throwable -> L6f
            r8.X = r2     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r8 = defpackage.od2.A(r1, r8)     // Catch: java.lang.Throwable -> L6f
            if (r8 != r0) goto L47
            return r0
        L47:
            r7 = r9
            r9 = r8
            r8 = r7
        L4a:
            k95 r9 = (defpackage.k95) r9     // Catch: java.lang.Throwable -> L13
            java.lang.Long r0 = r9.c     // Catch: java.lang.Throwable -> L13
            if (r0 == 0) goto L67
            s35 r1 = r3.o     // Catch: java.lang.Throwable -> L13
            vw7 r2 = defpackage.vw7.c     // Catch: java.lang.Throwable -> L13
            long r4 = r0.longValue()     // Catch: java.lang.Throwable -> L13
            osf r0 = defpackage.osf.o     // Catch: java.lang.Throwable -> L13
            java.lang.String r9 = r9.o     // Catch: java.lang.Throwable -> L13
            r2.getClass()     // Catch: java.lang.Throwable -> L13
            c64 r9 = defpackage.vw7.c2(r4, r0, r9)     // Catch: java.lang.Throwable -> L13
            defpackage.pnf.o(r1, r9)     // Catch: java.lang.Throwable -> L13
            goto La2
        L67:
            s35 r9 = r3.o     // Catch: java.lang.Throwable -> L13
            o95 r0 = defpackage.o95.b     // Catch: java.lang.Throwable -> L13
            defpackage.pnf.o(r9, r0)     // Catch: java.lang.Throwable -> L13
            goto La2
        L6f:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
        L73:
            java.lang.Class r8 = r8.getClass()
            java.lang.String r8 = r8.getName()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExternalCallback request failed due to "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.hm9.p(r8, r0, r9)
            s35 r8 = r3.o
            p95 r9 = new p95
            int r0 = defpackage.jpc.E
            eqe r1 = new eqe
            r1.<init>(r0)
            r9.<init>(r1)
            defpackage.pnf.o(r8, r9)
        La2:
            e5f r8 = defpackage.e5f.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s95.o(java.lang.Object):java.lang.Object");
    }
}
