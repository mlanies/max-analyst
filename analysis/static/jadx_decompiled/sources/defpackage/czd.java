package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class czd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        czd czdVar = (czd) n((c64) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        czdVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        czd czdVar = new czd(continuation, this.Y);
        czdVar.X = obj;
        return czdVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        syd.c.R1((c64) this.X);
        return e5f.a;
    }
}
