package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final class tt8 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageContextMenuBottomSheet Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt8(Continuation continuation, MessageContextMenuBottomSheet messageContextMenuBottomSheet) {
        super(2, continuation);
        this.Y = messageContextMenuBottomSheet;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        tt8 tt8Var = (tt8) n(obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        tt8Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        tt8 tt8Var = new tt8(continuation, this.Y);
        tt8Var.X = obj;
        return tt8Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        List list = (List) this.X;
        bc7[] bc7VarArr = MessageContextMenuBottomSheet.Z0;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.Y;
        Bundle bundle = messageContextMenuBottomSheet.getArgs().getBundle("actions");
        List listF = bundle != null ? ay7.f(bundle) : null;
        if (listF == null) {
            listF = nz4.a;
        }
        messageContextMenuBottomSheet.W0.E(x53.t0(Collections.singletonList(new ut3(listF)), list));
        return e5f.a;
    }
}
