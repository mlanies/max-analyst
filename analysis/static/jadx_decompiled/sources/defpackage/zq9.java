package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zq9 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ ar9 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zq9(ar9 ar9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = ar9Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zq9) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        zq9 zq9Var = new zq9(this.Z, continuation);
        zq9Var.Y = obj;
        return zq9Var;
    }

    /* JADX WARN: Path cross not found for [B:33:0x0081, B:43:0x00ab], limit reached: 56 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0059 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:19:0x0053, B:21:0x0059), top: B:53:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0067 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x006d -> B:11:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00a3 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00b1 -> B:11:0x002f). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r10.X
            r2 = 2
            r3 = 1
            ar9 r4 = r10.Z
            if (r1 == 0) goto L28
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r1 = r10.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r11)
            r11 = r1
            goto L2f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L1f:
            java.lang.Object r1 = r10.Y
            sx3 r1 = (defpackage.sx3) r1
            defpackage.od2.a0(r11)
            r11 = r1
            goto L4c
        L28:
            defpackage.od2.a0(r11)
            java.lang.Object r11 = r10.Y
            sx3 r11 = (defpackage.sx3) r11
        L2f:
            bc7[] r1 = defpackage.ar9.i
            boolean r1 = r4.e()
            if (r1 == 0) goto Lbf
            boolean r1 = defpackage.j1e.z(r11)
            if (r1 == 0) goto Lbf
            long r5 = r4.b()
            r10.Y = r11
            r10.X = r3
            java.lang.Object r1 = defpackage.j47.y(r5, r10)
            if (r1 != r0) goto L4c
            return r0
        L4c:
            java.util.concurrent.locks.ReentrantLock r1 = r4.f
            gi9 r5 = r4.e
            r1.lock()
            boolean r6 = r5.i()     // Catch: java.lang.Throwable -> L61
            if (r6 != 0) goto L63
            gi9 r6 = defpackage.oag.j(r5)     // Catch: java.lang.Throwable -> L61
            r5.c()     // Catch: java.lang.Throwable -> L61
            goto L64
        L61:
            r10 = move-exception
            goto Lbb
        L63:
            r6 = 0
        L64:
            r1.unlock()
            if (r6 == 0) goto L2f
            boolean r1 = r6.i()
            if (r1 == 0) goto L70
            goto L2f
        L70:
            bc7[] r1 = defpackage.ar9.i
            r7 = 0
            r1 = r1[r7]
            w4d r7 = r4.g
            java.lang.Object r1 = r7.T0(r4, r1)
            x77 r1 = (defpackage.x77) r1
            java.util.concurrent.locks.ReentrantLock r7 = r4.f
            if (r1 == 0) goto Lab
            boolean r1 = r1.isActive()
            if (r1 != 0) goto Lab
            r7.lock()
            int r1 = defpackage.ft4.o     // Catch: java.lang.Throwable -> La6
            long r8 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> La6
            kt4 r1 = defpackage.kt4.NANOSECONDS     // Catch: java.lang.Throwable -> La6
            long r8 = defpackage.z7.S(r8, r1)     // Catch: java.lang.Throwable -> La6
            r4.h = r8     // Catch: java.lang.Throwable -> La6
            r7.unlock()
            r10.Y = r11
            r10.X = r2
            java.lang.Object r1 = r4.c(r6, r10)
            if (r1 != r0) goto L2f
            return r0
        La6:
            r10 = move-exception
            r7.unlock()
            throw r10
        Lab:
            r7.lock()
            r5.b(r6)     // Catch: java.lang.Throwable -> Lb6
            r7.unlock()
            goto L2f
        Lb6:
            r10 = move-exception
            r7.unlock()
            throw r10
        Lbb:
            r1.unlock()
            throw r10
        Lbf:
            e5f r10 = defpackage.e5f.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zq9.o(java.lang.Object):java.lang.Object");
    }
}
