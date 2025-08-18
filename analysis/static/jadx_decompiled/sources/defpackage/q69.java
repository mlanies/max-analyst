package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class q69 implements z19 {
    public final /* synthetic */ MessagesListWidget a;

    public q69(MessagesListWidget messagesListWidget) {
        this.a = messagesListWidget;
    }

    @Override // defpackage.z19
    public final void b() {
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, "AutoPlayRegulator", "Player autoplay. Try start autoplay after recycler layout.", null);
        }
        MessagesListWidget messagesListWidget = this.a;
        bc7[] bc7VarArr = MessagesListWidget.X0;
        EndlessRecyclerView2 endlessRecyclerView2U0 = messagesListWidget.u0();
        pla.a(endlessRecyclerView2U0, new l69(endlessRecyclerView2U0, this.a, 1));
        this.a.r0().K.f(this);
    }

    @Override // defpackage.z19
    public final String getTag() {
        return "AutoPlayRegulator";
    }
}
