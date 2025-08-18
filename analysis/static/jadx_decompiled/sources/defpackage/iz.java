package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iz extends ffe implements a66 {
    public final /* synthetic */ kz X;
    public final /* synthetic */ cu8 Y;
    public final /* synthetic */ Long Z;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz(kz kzVar, cu8 cu8Var, Long l, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = kzVar;
        this.Y = cu8Var;
        this.Z = l;
        this.s0 = z;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((iz) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new iz(this.X, this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x016d  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz.o(java.lang.Object):java.lang.Object");
    }
}
