package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class pt8 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ pt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.s0(true);
                break;
            case 1:
                bc7[] bc7VarArr2 = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.A0(((tt3) obj).a);
                break;
            default:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.A0(((tt3) obj).a);
                break;
        }
        return e5fVar;
    }
}
