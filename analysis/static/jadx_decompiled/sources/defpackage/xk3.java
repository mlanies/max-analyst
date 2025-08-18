package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xk3 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ zk3 Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xk3(zk3 zk3Var, Continuation continuation) {
        super(2, continuation);
        this.Z = zk3Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xk3) n((String) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xk3 xk3Var = new xk3(this.Z, continuation);
        xk3Var.Y = obj;
        return xk3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0141  */
    /* JADX WARN: Type inference failed for: r0v13, types: [ti9] */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 395
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk3.o(java.lang.Object):java.lang.Object");
    }
}
