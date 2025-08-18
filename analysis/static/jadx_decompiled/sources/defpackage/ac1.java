package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.previewjoinlink.CallJoinLinkPreviewWidget;

/* loaded from: classes.dex */
public final class ac1 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallJoinLinkPreviewWidget Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac1(Continuation continuation, CallJoinLinkPreviewWidget callJoinLinkPreviewWidget) {
        super(2, continuation);
        this.Y = callJoinLinkPreviewWidget;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ac1 ac1Var = (ac1) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ac1Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ac1 ac1Var = new ac1(continuation, this.Y);
        ac1Var.X = obj;
        return ac1Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        if (wm9Var instanceof ea1) {
            bc7[] bc7VarArr = CallJoinLinkPreviewWidget.B0;
            CallJoinLinkPreviewWidget callJoinLinkPreviewWidget = this.Y;
            ((rg1) callJoinLinkPreviewWidget.c.getValue()).j(((ea1) wm9Var).b, true, false, true, new cc1(wm9Var, 0, callJoinLinkPreviewWidget));
        }
        return e5f.a;
    }
}
