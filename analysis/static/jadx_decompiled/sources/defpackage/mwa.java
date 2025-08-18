package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.startconversation.chat.PickChatMembers;

/* loaded from: classes2.dex */
public final class mwa extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ PickChatMembers Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mwa(Continuation continuation, PickChatMembers pickChatMembers) {
        super(2, continuation);
        this.Y = pickChatMembers;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        mwa mwaVar = (mwa) n((Set) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        mwaVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        mwa mwaVar = new mwa(continuation, this.Y);
        mwaVar.X = obj;
        return mwaVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long[] jArrE0 = x53.E0((Set) this.X);
        bc7[] bc7VarArr = PickChatMembers.x0;
        PickChatMembers pickChatMembers = this.Y;
        pickChatMembers.getClass();
        bc7 bc7Var = PickChatMembers.x0[0];
        pickChatMembers.t0.b(pickChatMembers, jArrE0);
        return e5f.a;
    }
}
