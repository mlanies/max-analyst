package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tsc extends ijc implements a66 {
    public int X;
    public int Y;
    public int Z;
    public Object[] c;
    public long[] o;
    public int s0;
    public long t0;
    public int u0;
    public /* synthetic */ Object v0;
    public final /* synthetic */ qi9 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tsc(qi9 qi9Var, Continuation continuation) {
        super(2, continuation);
        this.w0 = qi9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((tsc) n((f6d) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tsc tscVar = new tsc(this.w0, continuation);
        tscVar.v0 = obj;
        return tscVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004d -> B:22:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x004f -> B:14:0x0060). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0069 -> B:19:0x0086). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r21) throws java.lang.Throwable {
        /*
            r20 = this;
            r0 = r20
            tx3 r1 = defpackage.tx3.a
            int r2 = r0.u0
            r3 = 1
            r4 = 0
            r5 = 8
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.s0
            int r6 = r0.Z
            long r7 = r0.t0
            int r9 = r0.Y
            int r10 = r0.X
            long[] r11 = r0.o
            java.lang.Object[] r12 = r0.c
            java.lang.Object r13 = r0.v0
            f6d r13 = (defpackage.f6d) r13
            defpackage.od2.a0(r21)
            goto L86
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            defpackage.od2.a0(r21)
            java.lang.Object r2 = r0.v0
            f6d r2 = (defpackage.f6d) r2
            qi9 r6 = r0.w0
            java.lang.Object[] r7 = r6.c
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L94
            r9 = r4
        L3f:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L8f
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L60:
            if (r2 >= r6) goto L89
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L86
            int r4 = r9 << 3
            int r4 = r4 + r2
            r4 = r12[r4]
            r0.v0 = r13
            r0.c = r12
            r0.o = r11
            r0.X = r10
            r0.Y = r9
            r0.t0 = r7
            r0.Z = r6
            r0.s0 = r2
            r0.u0 = r3
            r13.c(r4, r0)
            return r1
        L86:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L60
        L89:
            if (r6 != r5) goto L94
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L8f:
            if (r9 == r8) goto L94
            int r9 = r9 + 1
            goto L3f
        L94:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tsc.o(java.lang.Object):java.lang.Object");
    }
}
