package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class o57 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ InviteByPhoneScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o57(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.Y = inviteByPhoneScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        o57 o57Var = (o57) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        o57Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        o57 o57Var = new o57(continuation, this.Y);
        o57Var.X = obj;
        return o57Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        l57 l57Var = (l57) this.X;
        if (!(l57Var instanceof l57)) {
            throw new NoWhenBranchMatchedException();
        }
        InviteByPhoneScreen inviteByPhoneScreen = this.Y;
        ((cn3) inviteByPhoneScreen.w0.getValue()).a(inviteByPhoneScreen.getContext(), l57Var.a);
        return e5f.a;
    }
}
