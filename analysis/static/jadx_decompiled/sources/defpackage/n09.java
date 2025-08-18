package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class n09 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n09(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        n09 n09Var = (n09) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        n09Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        n09 n09Var = new n09(continuation, this.Y);
        n09Var.X = obj;
        return n09Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        int i;
        od2.a0(obj);
        p35 p35Var = (p35) this.X;
        uy8 uy8Var = p35Var != null ? (uy8) p35Var.a : null;
        MessageWriteWidget messageWriteWidget = this.Y;
        if (uy8Var != null) {
            bc7[] bc7VarArr = MessageWriteWidget.F0;
            messageWriteWidget.getClass();
            i = uy8Var.a;
        } else {
            i = 0;
        }
        q0e q0eVar = messageWriteWidget.C0;
        if (i == 2) {
            messageWriteWidget.q0().setLeftIcon(woc.e1);
            q0eVar.m(null, Boolean.TRUE);
        } else {
            messageWriteWidget.q0().setEmojiExpandableState(iv8.a);
            qv8 qv8Var = messageWriteWidget.q0().c;
            qv8Var.setShowSoftInputOnFocus(true);
            qv8Var.setOnFocusChangeListener(null);
            messageWriteWidget.q0().setLeftIcon(woc.a1);
            q0eVar.m(null, Boolean.FALSE);
        }
        return e5f.a;
    }
}
