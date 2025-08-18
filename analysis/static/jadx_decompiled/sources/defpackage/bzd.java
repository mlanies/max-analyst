package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class bzd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        bzd bzdVar = (bzd) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        bzdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        bzd bzdVar = new bzd(continuation, this.Y);
        bzdVar.X = obj;
        return bzdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ryd rydVar = (ryd) this.X;
        if (!(rydVar instanceof ryd)) {
            throw new NoWhenBranchMatchedException();
        }
        StartConversationScreen startConversationScreen = this.Y;
        ((cn3) startConversationScreen.Z.getValue()).a(startConversationScreen.getContext(), rydVar.a);
        return e5f.a;
    }
}
