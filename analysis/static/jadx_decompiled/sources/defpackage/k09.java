package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class k09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        k09 k09Var = (k09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        k09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        k09 k09Var = new k09(continuation, this.Y);
        k09Var.X = obj;
        return k09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        CharSequence charSequence = (CharSequence) this.X;
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setText(charSequence);
        messageWriteWidget.q0().h(charSequence.length());
        return e5f.a;
    }
}
