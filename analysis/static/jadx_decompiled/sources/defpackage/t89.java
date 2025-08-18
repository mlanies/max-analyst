package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.settings.MessagesSettingsScreen;

/* loaded from: classes2.dex */
public final class t89 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessagesSettingsScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t89(Continuation continuation, MessagesSettingsScreen messagesSettingsScreen) {
        super(2, continuation);
        this.Y = messagesSettingsScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        t89 t89Var = (t89) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        t89Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        t89 t89Var = new t89(continuation, this.Y);
        t89Var.X = obj;
        return t89Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            s89.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
