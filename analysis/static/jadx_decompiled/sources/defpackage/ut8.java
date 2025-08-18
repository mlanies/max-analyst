package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final class ut8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ut8 ut8Var = (ut8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        ut8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        ut8 ut8Var = new ut8(continuation, this.Y);
        ut8Var.X = obj;
        return ut8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        wm9 wm9Var = (wm9) this.X;
        bc7[] bc7VarArr = MessageContextMenuBottomSheet.Z0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        messageContextMenuBottomSheet.getClass();
        if (wm9Var instanceof c64) {
            messageContextMenuBottomSheet.s0(true);
            kr0 kr0Var = new kr0(messageContextMenuBottomSheet, new rt8(messageContextMenuBottomSheet, wm9Var));
            if (messageContextMenuBottomSheet.getRouter() != null) {
                messageContextMenuBottomSheet.getRouter().a(kr0Var);
            } else {
                messageContextMenuBottomSheet.addLifecycleListener(new o9(messageContextMenuBottomSheet, kr0Var, 7));
            }
        }
        return e5f.a;
    }
}
