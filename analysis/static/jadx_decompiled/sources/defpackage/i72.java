package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class i72 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k72 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i72(k72 k72Var, Continuation continuation) {
        super(2, continuation);
        this.Z = k72Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((i72) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        i72 i72Var = new i72(this.Z, continuation);
        i72Var.Y = obj;
        return i72Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0140  */
    /* JADX WARN: Type inference failed for: r0v14, types: [ti9] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i72.o(java.lang.Object):java.lang.Object");
    }
}
