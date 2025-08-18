package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class nb2 extends ffe implements a66 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ List Z;
    public final /* synthetic */ zb2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nb2(List list, zb2 zb2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = list;
        this.s0 = zb2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((nb2) n((sx3) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nb2 nb2Var = new nb2(this.Z, this.s0, continuation);
        nb2Var.Y = obj;
        return nb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    @Override // defpackage.gi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(java.lang.Object r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nb2.o(java.lang.Object):java.lang.Object");
    }
}
