package defpackage;

import java.util.concurrent.Callable;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zx3 extends ffe implements a66 {
    public tt0 X;
    public int Y;
    public final /* synthetic */ ilc Z;
    public final /* synthetic */ ay3 s0;
    public final /* synthetic */ e32 t0;
    public final /* synthetic */ Callable u0;
    public final /* synthetic */ e32 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx3(ilc ilcVar, ay3 ay3Var, zt0 zt0Var, Callable callable, zt0 zt0Var2, Continuation continuation) {
        super(2, continuation);
        this.Z = ilcVar;
        this.s0 = ay3Var;
        this.t0 = zt0Var;
        this.u0 = callable;
        this.v0 = zt0Var2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((zx3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new zx3(this.Z, this.s0, (zt0) this.t0, this.u0, (zt0) this.v0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004b A[Catch: all -> 0x0017, TRY_LEAVE, TryCatch #0 {all -> 0x0017, blocks: (B:7:0x0012, B:18:0x0035, B:22:0x0043, B:24:0x004b, B:14:0x0023, B:17:0x002f), top: B:31:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x005e -> B:8:0x0015). Please report as a decompilation issue!!! */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            tx3 r0 = defpackage.tx3.a
            int r1 = r8.Y
            r2 = 2
            r3 = 1
            ay3 r4 = r8.s0
            ilc r5 = r8.Z
            if (r1 == 0) goto L27
            if (r1 == r3) goto L21
            if (r1 != r2) goto L19
            tt0 r1 = r8.X
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L17
        L15:
            r9 = r1
            goto L35
        L17:
            r8 = move-exception
            goto L69
        L19:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L21:
            tt0 r1 = r8.X
            defpackage.od2.a0(r9)     // Catch: java.lang.Throwable -> L17
            goto L43
        L27:
            defpackage.od2.a0(r9)
            v47 r9 = r5.e
            r9.a(r4)
            e32 r9 = r8.t0     // Catch: java.lang.Throwable -> L17
            tt0 r9 = r9.iterator()     // Catch: java.lang.Throwable -> L17
        L35:
            r8.X = r9     // Catch: java.lang.Throwable -> L17
            r8.Y = r3     // Catch: java.lang.Throwable -> L17
            java.lang.Object r1 = r9.b(r8)     // Catch: java.lang.Throwable -> L17
            if (r1 != r0) goto L40
            return r0
        L40:
            r7 = r1
            r1 = r9
            r9 = r7
        L43:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L17
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L17
            if (r9 == 0) goto L61
            r1.c()     // Catch: java.lang.Throwable -> L17
            java.util.concurrent.Callable r9 = r8.u0     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r9.call()     // Catch: java.lang.Throwable -> L17
            e32 r6 = r8.v0     // Catch: java.lang.Throwable -> L17
            r8.X = r1     // Catch: java.lang.Throwable -> L17
            r8.Y = r2     // Catch: java.lang.Throwable -> L17
            java.lang.Object r9 = r6.o(r9, r8)     // Catch: java.lang.Throwable -> L17
            if (r9 != r0) goto L15
            return r0
        L61:
            v47 r8 = r5.e
            r8.c(r4)
            e5f r8 = defpackage.e5f.a
            return r8
        L69:
            v47 r9 = r5.e
            r9.c(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zx3.o(java.lang.Object):java.lang.Object");
    }
}
