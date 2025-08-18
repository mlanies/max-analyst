package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class prb extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ rrb Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prb(Continuation continuation, rrb rrbVar) {
        super(2, continuation);
        this.Y = rrbVar;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        prb prbVar = (prb) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        prbVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        prb prbVar = new prb(continuation, this.Y);
        prbVar.X = obj;
        return prbVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        rrb.a(this.Y, (gv1) this.X);
        return e5f.a;
    }
}
