package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* loaded from: classes2.dex */
public final class n9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n9 n9Var = (n9) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n9 n9Var = new n9(continuation, this.Y);
        n9Var.X = obj;
        return n9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (((wm9) this.X) instanceof g43) {
            this.Y.getRouter().C();
        }
        return e5f.a;
    }
}
