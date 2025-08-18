package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class rvc extends ffe implements a66 {
    public long[] X;
    public long[] Y;
    public int Z;
    public int s0;
    public int t0;
    public int u0;
    public long v0;
    public int w0;
    public /* synthetic */ Object x0;
    public final /* synthetic */ mm3 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rvc(mm3 mm3Var, Continuation continuation) {
        super(2, continuation);
        this.y0 = mm3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((rvc) n((on5) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        rvc rvcVar = new rvc(this.y0, continuation);
        rvcVar.x0 = obj;
        return rvcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:23:0x0099). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0062). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006b -> B:20:0x0090). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008d -> B:20:0x0090). Please report as a decompilation issue!!! */
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
            int r2 = r0.w0
            r3 = 1
            r5 = 8
            if (r2 == 0) goto L2c
            if (r2 != r3) goto L24
            int r2 = r0.u0
            int r6 = r0.t0
            long r7 = r0.v0
            int r9 = r0.s0
            int r10 = r0.Z
            long[] r11 = r0.Y
            long[] r12 = r0.X
            java.lang.Object r13 = r0.x0
            on5 r13 = (defpackage.on5) r13
            defpackage.od2.a0(r21)
            goto L90
        L24:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L2c:
            defpackage.od2.a0(r21)
            java.lang.Object r2 = r0.x0
            on5 r2 = (defpackage.on5) r2
            mm3 r6 = r0.y0
            gi9 r6 = r6.a
            long[] r7 = r6.b
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L9e
            r9 = 0
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L99
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r2
            r2 = 0
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L62:
            if (r2 >= r6) goto L93
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L90
            int r14 = r9 << 3
            int r14 = r14 + r2
            r14 = r12[r14]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r14)
            r0.x0 = r13
            r0.X = r12
            r0.Y = r11
            r0.Z = r10
            r0.s0 = r9
            r0.v0 = r7
            r0.t0 = r6
            r0.u0 = r2
            r0.w0 = r3
            java.lang.Object r4 = r13.a(r4, r0)
            if (r4 != r1) goto L90
            return r1
        L90:
            long r7 = r7 >> r5
            int r2 = r2 + r3
            goto L62
        L93:
            if (r6 != r5) goto L9e
            r8 = r10
            r6 = r11
            r7 = r12
            r2 = r13
        L99:
            if (r9 == r8) goto L9e
            int r9 = r9 + 1
            goto L41
        L9e:
            e5f r0 = defpackage.e5f.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rvc.o(java.lang.Object):java.lang.Object");
    }
}
