package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class li2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public li2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        li2 li2Var = (li2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        li2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        li2 li2Var = new li2(continuation, this.Y);
        li2Var.X = obj;
        return li2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        jqe jqeVar = ((dj2) this.X).a;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        CharSequence charSequenceB = jqeVar != null ? jqeVar.b(chatMediaViewerScreen.getContext()) : null;
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        if (charSequenceB.length() > 0) {
            bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
            chatMediaViewerScreen.C0().setTitle(charSequenceB);
        }
        return e5f.a;
    }
}
