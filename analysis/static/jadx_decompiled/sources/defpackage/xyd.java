package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.startconversation.StartConversationScreen;

/* loaded from: classes2.dex */
public final class xyd extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ StartConversationScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xyd(Continuation continuation, StartConversationScreen startConversationScreen) {
        super(2, continuation);
        this.Y = startConversationScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((xyd) n((List) obj, (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        xyd xydVar = new xyd(continuation, this.Y);
        xydVar.X = obj;
        return xydVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = StartConversationScreen.I0;
        StartConversationScreen startConversationScreen = this.Y;
        CharSequence charSequenceM0 = startConversationScreen.m0();
        boolean z = !(charSequenceM0 == null || charSequenceM0.length() == 0);
        e5f e5fVar = e5f.a;
        if (z) {
            return e5fVar;
        }
        startConversationScreen.y0.E(list);
        return e5fVar;
    }
}
