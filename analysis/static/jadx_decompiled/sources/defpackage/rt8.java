package defpackage;

import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class rt8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm9 b;

    public /* synthetic */ rt8(wm9 wm9Var, int i) {
        this.a = i;
        this.b = wm9Var;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        wm9 wm9Var = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MessageContextMenuBottomSheet.Z0;
                u29.c.R1((c64) wm9Var);
                break;
            case 1:
                bc7[] bc7VarArr2 = MessagesListWidget.X0;
                gma gmaVar = (gma) wm9Var;
                u29.c.P1().b(":call-user?opponent_id=" + gmaVar.b + "&video_enabled=" + gmaVar.c, null);
                break;
            default:
                bc7[] bc7VarArr3 = MessagesListWidget.X0;
                u29.c.P1().b(":call-join-link?link=".concat(((ula) wm9Var).d), null);
                break;
        }
        return e5fVar;
    }

    public /* synthetic */ rt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, wm9 wm9Var) {
        this.a = 0;
        this.b = wm9Var;
    }
}
