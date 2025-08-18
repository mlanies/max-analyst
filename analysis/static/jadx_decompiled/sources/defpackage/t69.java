package defpackage;

import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class t69 extends f77 implements kre {
    public final /* synthetic */ MessagesListWidget N0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t69(MessagesListWidget messagesListWidget, vge vgeVar) {
        super(vgeVar);
        this.N0 = messagesListWidget;
    }

    @Override // defpackage.kre
    public final void onThemeChanged(fka fkaVar) {
        vge vgeVar = this.N0.y0;
        if (vgeVar == null) {
            vgeVar = null;
        }
        vgeVar.onThemeChanged(fkaVar);
    }
}
