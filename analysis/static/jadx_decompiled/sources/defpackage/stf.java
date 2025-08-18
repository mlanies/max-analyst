package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class stf extends ffe implements a66 {
    public final /* synthetic */ ouf X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public stf(ouf oufVar, Continuation continuation) {
        super(2, continuation);
        this.X = oufVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        stf stfVar = (stf) n((sx3) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        stfVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        return new stf(this.X, continuation);
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        w97 w97Var = this.X.l;
        if (w97Var instanceof hn0) {
            ((hn0) w97Var).b(new tuf(evf.X));
        } else if (w97Var instanceof ln0) {
            ((ln0) w97Var).b(new tuf(evf.Y));
        } else if (w97Var instanceof in0) {
            ((in0) w97Var).b(new quf());
        }
        this.X.l = null;
        return e5f.a;
    }
}
