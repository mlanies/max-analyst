package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class uq extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sm2 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq(sm2 sm2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = sm2Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        uq uqVar = (uq) n((qm2) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        uqVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        uq uqVar = new uq(this.Y, continuation);
        uqVar.X = obj;
        return uqVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        this.Y.a((qm2) this.X);
        return e5f.a;
    }
}
