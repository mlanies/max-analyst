package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class la extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ AdminWaitingRoomScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la(AdminWaitingRoomScreen adminWaitingRoomScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = adminWaitingRoomScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        la laVar = (la) n((na) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        laVar.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        la laVar = new la(this.Y, continuation);
        laVar.X = obj;
        return laVar;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        na naVar = (na) this.X;
        List list = naVar.b;
        bc7[] bc7VarArr = AdminWaitingRoomScreen.s0;
        AdminWaitingRoomScreen adminWaitingRoomScreen = this.Y;
        ((ja) adminWaitingRoomScreen.Z.getValue()).E(list);
        bc7[] bc7VarArr2 = AdminWaitingRoomScreen.s0;
        ft.g((OneMeButton) adminWaitingRoomScreen.o.T0(adminWaitingRoomScreen, bc7VarArr2[2]), !list.isEmpty(), 0L, null, 6);
        ft.g((OneMeButton) adminWaitingRoomScreen.X.T0(adminWaitingRoomScreen, bc7VarArr2[3]), !list.isEmpty(), 0L, null, 6);
        ft.g((RecyclerView) adminWaitingRoomScreen.c.T0(adminWaitingRoomScreen, bc7VarArr2[1]), !list.isEmpty(), 0L, null, 6);
        ft.g((aba) adminWaitingRoomScreen.Y.T0(adminWaitingRoomScreen, bc7VarArr2[4]), naVar.b.isEmpty() && naVar != na.c, 0L, null, 6);
        ((cla) adminWaitingRoomScreen.b.T0(adminWaitingRoomScreen, bc7VarArr2[0])).setSubtitle(naVar.a.b(adminWaitingRoomScreen.getContext()));
        return e5f.a;
    }
}
