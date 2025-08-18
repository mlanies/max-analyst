package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* loaded from: classes2.dex */
public final class owa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickChatMembers Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public owa(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.Y = pickChatMembers;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        owa owaVar = (owa) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        owaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        owa owaVar = new owa(continuation, this.Y);
        owaVar.X = obj;
        return owaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        if (((Boolean) this.X).booleanValue()) {
            bc7[] bc7VarArr = PickChatMembers.x0;
            PickChatMembers pickChatMembers = this.Y;
            ((eua) pickChatMembers.u0.getValue()).e(new l5g(pickChatMembers, 1));
        }
        return e5f.a;
    }
}
