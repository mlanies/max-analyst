package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class ki2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaViewerScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.Y = chatMediaViewerScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ki2 ki2Var = (ki2) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ki2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ki2 ki2Var = new ki2(continuation, this.Y);
        ki2Var.X = obj;
        return ki2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        cj2 cj2Var = (cj2) this.X;
        ChatMediaViewerScreen chatMediaViewerScreen = this.Y;
        int iJ = chatMediaViewerScreen.D0.j();
        List list = cj2Var.a;
        ri2 ri2Var = new ri2(chatMediaViewerScreen, iJ, cj2Var);
        rg2 rg2Var = chatMediaViewerScreen.D0;
        rg2Var.getClass();
        rg2Var.y0.b(list, new yh0(1, ri2Var));
        return e5f.a;
    }
}
