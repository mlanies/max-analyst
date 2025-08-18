package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class a69 implements z19 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessagesListWidget b;

    public /* synthetic */ a69(MessagesListWidget messagesListWidget, int i) {
        this.a = i;
        this.b = messagesListWidget;
    }

    @Override // defpackage.z19
    public final void a() {
        switch (this.a) {
            case 0:
                MessagesListWidget messagesListWidget = this.b;
                if (messagesListWidget.getView() != null) {
                    if (!messagesListWidget.s0().b()) {
                        hm9.m0("ScrollEvent", "Can't process itemsChangedCallback because scroll is not meet requirements", new Object[0]);
                        break;
                    } else {
                        messagesListWidget.r0().K.f(this);
                        break;
                    }
                } else {
                    hm9.m0("ScrollEvent", "Can't process itemsChangedCallback for scroll because root view is null", new Object[0]);
                    break;
                }
            default:
                MessagesListWidget messagesListWidget2 = this.b;
                t59 t59Var = messagesListWidget2.O0;
                EndlessRecyclerView2 endlessRecyclerView2U0 = messagesListWidget2.u0();
                if (!t59Var.c) {
                    t59Var.b(endlessRecyclerView2U0, 0, 0);
                }
                messagesListWidget2.M0.b(messagesListWidget2.u0(), 0, 0);
                break;
        }
    }

    @Override // defpackage.z19
    public final String getTag() {
        switch (this.a) {
            case 0:
                return "ScrollEvent";
            default:
                return "ReadMarkUpdater";
        }
    }
}
