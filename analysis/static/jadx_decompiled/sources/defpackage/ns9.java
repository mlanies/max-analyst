package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ns9 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ ks9 Z;
    public final /* synthetic */ ps9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns9(long j, ks9 ks9Var, ps9 ps9Var, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = ks9Var;
        this.s0 = ps9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ns9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new ns9(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r12.X
            e5f r2 = defpackage.e5f.a
            r3 = 3
            r4 = 2
            r5 = 1
            ps9 r6 = r12.s0
            ks9 r7 = r12.Z
            if (r1 == 0) goto L26
            if (r1 == r5) goto L15
            if (r1 == r4) goto L22
            if (r1 != r3) goto L1a
        L15:
            defpackage.od2.a0(r13)
            goto Le1
        L1a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L22:
            defpackage.od2.a0(r13)
            goto L95
        L26:
            defpackage.od2.a0(r13)
            long r8 = java.lang.System.currentTimeMillis()
            long r10 = r12.Y
            long r8 = r8 - r10
            r10 = 3000(0xbb8, double:1.482E-320)
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            java.lang.String r1 = "ps9"
            if (r13 < 0) goto L49
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r8 = "handle "
            r13.<init>(r8)
            r13.append(r7)
            java.lang.String r13 = r13.toString()
            defpackage.hm9.n0(r1, r13)
        L49:
            fs8 r13 = r7.Y
            int r8 = r7.X
            int r8 = defpackage.au1.s(r8)
            if (r8 == 0) goto Ld0
            long r9 = r7.c
            if (r8 == r5) goto La9
            if (r8 == r4) goto L87
            if (r8 == r3) goto L76
            r12 = 4
            if (r8 != r12) goto L70
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "handle unknown type! "
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r12 = r12.toString()
            defpackage.hm9.n0(r1, r12)
            goto Le1
        L70:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L76:
            if (r13 != 0) goto L7e
            java.lang.String r12 = "message is null"
            defpackage.hm9.n0(r1, r12)
            return r2
        L7e:
            r12.X = r3
            java.lang.Object r12 = defpackage.ps9.a(r6, r9, r13, r12)
            if (r12 != r0) goto Le1
            return r0
        L87:
            java.lang.String r13 = "handle delete"
            defpackage.hm9.n(r1, r13)
            r12.X = r4
            java.lang.Object r13 = r6.c(r9, r12)
            if (r13 != r0) goto L95
            return r0
        L95:
            e52 r13 = (defpackage.e52) r13
            if (r13 == 0) goto Le1
            je7 r12 = r6.c
            java.lang.Object r12 = r12.getValue()
            rs9 r12 = (defpackage.rs9) r12
            java.util.Set r0 = r7.Z
            mg4 r1 = defpackage.mg4.DELAYED
            r12.b(r13, r0, r1)
            goto Le1
        La9:
            je7 r3 = r6.b
            java.lang.Object r3 = r3.getValue()
            js9 r3 = (defpackage.js9) r3
            hs9 r4 = defpackage.ps9.b(r6, r7)
            mg4 r7 = defpackage.mg4.DELAYED
            r3.a(r4, r7)
            if (r13 == 0) goto Le1
            wx8 r3 = defpackage.wx8.o
            wx8 r4 = r13.X
            if (r4 != r3) goto Le1
            java.lang.String r3 = "delayed message has error status"
            defpackage.hm9.n0(r1, r3)
            r12.X = r5
            java.lang.Object r12 = defpackage.ps9.a(r6, r9, r13, r12)
            if (r12 != r0) goto Le1
            return r0
        Ld0:
            je7 r12 = r6.b
            java.lang.Object r12 = r12.getValue()
            js9 r12 = (defpackage.js9) r12
            hs9 r13 = defpackage.ps9.b(r6, r7)
            mg4 r0 = defpackage.mg4.DELAYED
            r12.a(r13, r0)
        Le1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ns9.o(java.lang.Object):java.lang.Object");
    }
}
