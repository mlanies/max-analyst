package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class w09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        w09 w09Var = (w09) n((cz8) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        w09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        w09 w09Var = new w09(continuation, this.Y);
        w09Var.X = obj;
        return w09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cz8 cz8Var = (cz8) this.X;
        boolean z = false;
        if (cz8Var != null && cz8Var.a) {
            z = true;
        }
        bc7[] bc7VarArr = MessageWriteWidget.F0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.q0().setLeftOuterIconVisible(z);
        if (z) {
            messageWriteWidget.q0().setLeftOuterIconOnClickListener(new e09(0, messageWriteWidget.v0(), xz8.class, "onMiniAppClick", "onMiniAppClick$message_write_widget_release()V", 0, 2));
            messageWriteWidget.q0().setLeftOuterIconText(cz8Var != null ? cz8Var.b : null);
        }
        return e5f.a;
    }
}
