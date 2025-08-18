package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class jo3 extends ffe implements a66 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ oo3 Z;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo3(int i, oo3 oo3Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = i;
        this.Z = oo3Var;
        this.s0 = j;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((jo3) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new jo3(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ad  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jo3.o(java.lang.Object):java.lang.Object");
    }
}
