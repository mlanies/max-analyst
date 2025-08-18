package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class p69 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p69(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.Y = messagesListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        p69 p69Var = (p69) n((a39) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        p69Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        p69 p69Var = new p69(continuation, this.Y);
        p69Var.X = obj;
        return p69Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        a39 a39Var = (a39) this.X;
        boolean zF = tpa.f(a39Var, z29.a);
        MessagesListWidget messagesListWidget = this.Y;
        if (zF) {
            bc7[] bc7VarArr = MessagesListWidget.X0;
            messagesListWidget.u0().x0(messagesListWidget.A0.j() - 1);
        } else if (tpa.f(a39Var, w29.a)) {
            bc7[] bc7VarArr2 = MessagesListWidget.X0;
            eg9 eg9VarA = messagesListWidget.x0().A();
            eg9VarA.getClass();
            eg9VarA.f.m(null, new yf9());
        } else if (a39Var instanceof y29) {
            bc7[] bc7VarArr3 = MessagesListWidget.X0;
            eg9 eg9VarA2 = messagesListWidget.x0().A();
            int i = ((y29) a39Var).a;
            List listD0 = x53.D0(((yf9) eg9VarA2.f.getValue()).a);
            boolean zIsEmpty = listD0.isEmpty();
            q0e q0eVar = eg9VarA2.f;
            if (zIsEmpty) {
                q0eVar.m(null, new yf9());
            } else {
                eg9VarA2.d.invoke(listD0, Integer.valueOf(i));
                q0eVar.m(null, new yf9());
            }
        } else {
            if (!(a39Var instanceof x29)) {
                throw new NoWhenBranchMatchedException();
            }
            c05 c05Var = messagesListWidget.V0;
            if (c05Var != null) {
                c05Var.q = true;
            }
        }
        return e5f.a;
    }
}
