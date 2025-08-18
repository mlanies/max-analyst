package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class a19 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a19(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        a19 a19Var = (a19) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        a19Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        a19 a19Var = new a19(continuation, this.Y);
        a19Var.X = obj;
        return a19Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        boolean zBooleanValue = ((Boolean) this.X).booleanValue();
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setKeyboardVisible(zBooleanValue);
        ywe yweVar = messageWriteWidget.D0;
        if (yweVar != null) {
            yweVar.dismiss();
        }
        messageWriteWidget.D0 = null;
        return e5f.a;
    }
}
