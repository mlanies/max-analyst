package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class l69 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ l69(EndlessRecyclerView2 endlessRecyclerView2, MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MessagesListWidget messagesListWidget = this.b;
        switch (this.a) {
            case 0:
                y6c y6cVar = messagesListWidget.W0;
                if (y6cVar != null) {
                    messagesListWidget.u0().s0(y6cVar);
                    messagesListWidget.u0().m(y6cVar);
                    y6c y6cVar2 = messagesListWidget.W0;
                    if (y6cVar2 != null) {
                        y6cVar2.g = true;
                        break;
                    }
                }
                break;
            default:
                bc7[] bc7VarArr = MessagesListWidget.X0;
                messagesListWidget.p0().e(messagesListWidget.u0(), true);
                break;
        }
    }
}
