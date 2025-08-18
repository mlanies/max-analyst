package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* loaded from: classes2.dex */
public final class w22 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChangeOwnerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w22(Continuation continuation, ChangeOwnerScreen changeOwnerScreen) {
        super(2, continuation);
        this.Y = changeOwnerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w22 w22Var = (w22) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w22Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w22 w22Var = new w22(continuation, this.Y);
        w22Var.X = obj;
        return w22Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        x22 x22Var = (x22) this.X;
        if (!(x22Var instanceof x22)) {
            throw new NoWhenBranchMatchedException();
        }
        wha whaVar = new wha(this.Y);
        whaVar.g(x22Var.a);
        Integer num = x22Var.b;
        if (num != null) {
            whaVar.e(new kia(num.intValue()));
        }
        whaVar.i();
        return e5f.a;
    }
}
