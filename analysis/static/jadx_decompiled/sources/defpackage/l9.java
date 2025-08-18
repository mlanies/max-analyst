package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.addmembers.AddChatMembersScreen;

/* loaded from: classes2.dex */
public final class l9 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AddChatMembersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(Continuation continuation, AddChatMembersScreen addChatMembersScreen) {
        super(2, continuation);
        this.Y = addChatMembersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        l9 l9Var = (l9) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        l9Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        l9 l9Var = new l9(continuation, this.Y);
        l9Var.X = obj;
        return l9Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long[] jArrE0 = x53.E0((Set) this.X);
        bc7[] bc7VarArr = AddChatMembersScreen.x0;
        AddChatMembersScreen addChatMembersScreen = this.Y;
        addChatMembersScreen.getClass();
        bc7 bc7Var = AddChatMembersScreen.x0[1];
        addChatMembersScreen.u0.b(addChatMembersScreen, jArrE0);
        return e5f.a;
    }
}
