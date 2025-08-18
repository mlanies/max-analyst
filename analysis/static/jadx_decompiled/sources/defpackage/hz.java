package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class hz extends ffe implements a66 {
    public final /* synthetic */ kz X;
    public final /* synthetic */ es8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ int s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz(kz kzVar, es8 es8Var, Long l, int i, Continuation continuation) {
        super(2, continuation);
        this.X = kzVar;
        this.Y = es8Var;
        this.Z = l;
        this.s0 = i;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((hz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new hz(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00d3  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz.o(java.lang.Object):java.lang.Object");
    }
}
