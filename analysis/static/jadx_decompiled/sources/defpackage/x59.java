package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class x59 implements z19 {
    public final /* synthetic */ MessagesListWidget a;
    public final /* synthetic */ bxc b;

    public x59(MessagesListWidget messagesListWidget, bxc bxcVar) {
        this.a = messagesListWidget;
        this.b = bxcVar;
    }

    @Override // defpackage.z19
    public final void b() {
        bc7[] bc7VarArr = MessagesListWidget.X0;
        MessagesListWidget messagesListWidget = this.a;
        if (messagesListWidget.r0().w() != 0) {
            MessagesListWidget.o0(messagesListWidget, this.b);
            messagesListWidget.r0().K.f(this);
        }
    }

    @Override // defpackage.z19
    public final String getTag() {
        return "ScrollButton";
    }
}
