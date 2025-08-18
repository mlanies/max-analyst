package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wa2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ je7 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wa2(je7 je7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = je7Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wa2 wa2Var = (wa2) n((List) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wa2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wa2 wa2Var = new wa2(this.Y, continuation);
        wa2Var.X = obj;
        return wa2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ((i8a) ((ra2) this.Y.getValue())).b.g((List) this.X);
        return e5f.a;
    }
}
