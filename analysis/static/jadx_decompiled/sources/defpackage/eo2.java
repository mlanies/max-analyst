package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class eo2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eo2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        eo2 eo2Var = (eo2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        eo2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        eo2 eo2Var = new eo2(continuation, this.Y);
        eo2Var.X = obj;
        return eo2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        ez8 ez8Var = (ez8) this.X;
        boolean z = true;
        if (ez8Var.b.getAction() != 3 && ez8Var.b.getAction() != 1) {
            z = false;
        }
        this.Y.A0 = z;
        return e5f.a;
    }
}
