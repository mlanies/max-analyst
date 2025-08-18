package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes.dex */
public final class wx2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatsListWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx2(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.Y = chatsListWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        wx2 wx2Var = (wx2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        wx2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        wx2 wx2Var = new wx2(continuation, this.Y);
        wx2Var.X = obj;
        return wx2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            tr3.c.R1((c64) wm9Var);
        } else if (wm9Var instanceof fyd) {
            bc7[] bc7VarArr = ChatsListWidget.M0;
            fyd fydVar = (fyd) wm9Var;
            ((rg1) this.Y.J0.getValue()).l(fydVar.b, fydVar.c, new by2(wm9Var, 0));
        } else {
            boolean z = wm9Var instanceof wla;
        }
        return e5f.a;
    }
}
