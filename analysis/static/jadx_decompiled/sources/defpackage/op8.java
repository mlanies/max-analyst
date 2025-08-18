package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class op8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ xp8 Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public op8(xp8 xp8Var, Continuation continuation) {
        super(2, continuation);
        this.Y = xp8Var;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        op8 op8Var = (op8) n((cn8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        op8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        op8 op8Var = new op8(this.Y, continuation);
        op8Var.X = obj;
        return op8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (!tpa.f((cn8) this.X, cn8.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xp8 xp8Var = this.Y;
        if (xp8Var.g.compareAndSet(false, true)) {
            j47.T(xp8Var.f, null, null, new wp8(xp8Var, null), 3);
        }
        return e5f.a;
    }
}
