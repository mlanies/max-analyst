package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class tvc extends ffe implements a66 {
    public /* synthetic */ long X;
    public final /* synthetic */ vvc Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tvc(vvc vvcVar, Continuation continuation) {
        super(2, continuation);
        this.Y = vvcVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tvc tvcVar = (tvc) n(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tvcVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tvc tvcVar = new tvc(this.Y, continuation);
        tvcVar.X = ((Number) obj).longValue();
        return tvcVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = this.X;
        bc7[] bc7VarArr = vvc.A0;
        vvc vvcVar = this.Y;
        vxd vxdVarT = j47.T((jr1) vvcVar.c.getValue(), null, null, new mvc(j, vvcVar, null), 3);
        vvcVar.w0.o1(vvcVar, vvc.A0[0], vxdVarT);
        return e5f.a;
    }
}
