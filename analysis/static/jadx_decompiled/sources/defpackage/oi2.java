package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class oi2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        oi2 oi2Var = (oi2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        oi2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        oi2 oi2Var = new oi2(continuation, this.Y);
        oi2Var.X = obj;
        return oi2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof c64) {
            bc7[] bc7VarArr = ChatMediaViewerScreen.K0;
            ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
            chatMediaViewerScreen.z0();
            if (ChatMediaViewerScreen.v0(chatMediaViewerScreen)) {
                dkf dkfVarB0 = chatMediaViewerScreen.B0();
                dkfVarB0.pause();
                dkfVarB0.M0(null);
                dkfVarB0.N0();
            }
            hi2.c.R1((c64) wm9Var);
        }
        return e5f.a;
    }
}
