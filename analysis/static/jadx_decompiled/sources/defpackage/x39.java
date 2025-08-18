package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x39 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ fv0 Y;
    public final /* synthetic */ n59 Z;
    public final /* synthetic */ long s0;
    public final /* synthetic */ z07 t0;
    public final /* synthetic */ kv0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x39(fv0 fv0Var, n59 n59Var, long j, z07 z07Var, kv0 kv0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = fv0Var;
        this.Z = n59Var;
        this.s0 = j;
        this.t0 = z07Var;
        this.u0 = kv0Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((x39) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new x39(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x39.o(java.lang.Object):java.lang.Object");
    }
}
