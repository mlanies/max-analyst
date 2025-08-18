package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class re2 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ ye2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ String s0;
    public final /* synthetic */ en4 t0;
    public final /* synthetic */ long u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re2(ye2 ye2Var, long j, String str, en4 en4Var, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = ye2Var;
        this.Z = j;
        this.s0 = str;
        this.t0 = en4Var;
        this.u0 = j2;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((re2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new re2(this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[RETURN] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.re2.o(java.lang.Object):java.lang.Object");
    }
}
