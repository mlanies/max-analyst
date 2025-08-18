package defpackage;

import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;

/* loaded from: classes2.dex */
public final /* synthetic */ class qt8 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MessageContextMenuBottomSheet b;

    public /* synthetic */ qt8(MessageContextMenuBottomSheet messageContextMenuBottomSheet, int i) {
        this.a = i;
        this.b = messageContextMenuBottomSheet;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = MessageContextMenuBottomSheet.Z0;
                messageContextMenuBottomSheet.getClass();
                bc7[] bc7VarArr2 = MessageContextMenuBottomSheet.Z0;
                bc7 bc7Var = bc7VarArr2[9];
                fs fsVar = messageContextMenuBottomSheet.K0;
                if (!((Boolean) fsVar.a(messageContextMenuBottomSheet)).booleanValue()) {
                    bc7 bc7Var2 = bc7VarArr2[9];
                    fsVar.b(messageContextMenuBottomSheet, Boolean.TRUE);
                    Object targetController = messageContextMenuBottomSheet.getTargetController();
                    xt3 xt3Var = targetController instanceof xt3 ? (xt3) targetController : null;
                    if (xt3Var != null) {
                        xt3Var.onDismiss();
                    }
                }
                return e5f.a;
            case 1:
                bc7[] bc7VarArr3 = MessageContextMenuBottomSheet.Z0;
                bc7[] bc7VarArr4 = MessageContextMenuBottomSheet.Z0;
                bc7 bc7Var3 = bc7VarArr4[6];
                long jLongValue = ((Number) messageContextMenuBottomSheet.H0.a(messageContextMenuBottomSheet)).longValue();
                bc7 bc7Var4 = bc7VarArr4[7];
                long jLongValue2 = ((Number) messageContextMenuBottomSheet.I0.a(messageContextMenuBottomSheet)).longValue();
                bc7 bc7Var5 = bc7VarArr4[8];
                return new jq8(jLongValue, jLongValue2, ((Number) messageContextMenuBottomSheet.J0.a(messageContextMenuBottomSheet)).longValue());
            default:
                bc7[] bc7VarArr5 = MessageContextMenuBottomSheet.Z0;
                return Boolean.valueOf(messageContextMenuBottomSheet.E0().w());
        }
    }
}
