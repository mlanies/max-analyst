package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class do2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public do2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        do2 do2Var = (do2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        do2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        do2 do2Var = new do2(continuation, this.Y);
        do2Var.X = obj;
        return do2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof g43) {
            this.Y.getRouter().C();
        } else if (wm9Var instanceof c64) {
            vo2.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
