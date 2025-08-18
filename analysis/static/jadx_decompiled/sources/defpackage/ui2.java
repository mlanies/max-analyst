package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class ui2 extends ffe implements a66 {
    public /* synthetic */ long X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ui2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) {
        return ((ui2) n(new ft4(((ft4) obj).a), (Continuation) obj2)).o(e5f.a);
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ui2 ui2Var = new ui2(continuation, this.Y);
        ui2Var.X = ((ft4) obj).a;
        return ui2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        long j = this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        boolean z = chatMediaViewerScreen.H0;
        e5f e5fVar = e5f.a;
        if (z) {
            return e5fVar;
        }
        g07 g07VarA0 = chatMediaViewerScreen.A0();
        long jE = ft4.e(j);
        dkf dkfVarB0 = chatMediaViewerScreen.B0();
        gef gefVar = dkfVarB0.Z;
        g07VarA0.c(jE, gefVar != null ? dkfVarB0.o.e0() - gefVar.m() : 0L, chatMediaViewerScreen.B0().G0());
        return e5fVar;
    }
}
