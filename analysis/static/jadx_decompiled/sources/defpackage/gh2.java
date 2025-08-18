package defpackage;

import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* loaded from: classes2.dex */
public final class gh2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaTabWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gh2(Continuation continuation, ChatMediaTabWidget chatMediaTabWidget) {
        super(2, continuation);
        this.Y = chatMediaTabWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        gh2 gh2Var = (gh2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        gh2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        gh2 gh2Var = new gh2(continuation, this.Y);
        gh2Var.X = obj;
        return gh2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ch2 ch2Var = (ch2) this.X;
        bc7[] bc7VarArr = ChatMediaTabWidget.w0;
        ChatMediaTabWidget chatMediaTabWidget = this.Y;
        chatMediaTabWidget.getClass();
        bc7 bc7Var = ChatMediaTabWidget.w0[0];
        cla claVar = (cla) chatMediaTabWidget.X.getValue();
        claVar.setTitle(ch2Var.b);
        claVar.setAvatar(ch2Var.a);
        return e5f.a;
    }
}
