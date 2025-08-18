package defpackage;

import one.me.chats.picker.chats.PickerChatsListWidget;

/* loaded from: classes.dex */
public final class hya implements mxa {
    public final /* synthetic */ PickerChatsListWidget a;

    public hya(PickerChatsListWidget pickerChatsListWidget) {
        this.a = pickerChatsListWidget;
    }

    @Override // defpackage.mxa
    public final boolean r(long j, fza fzaVar) {
        bc7[] bc7VarArr = PickerChatsListWidget.C0;
        PickerChatsListWidget pickerChatsListWidget = this.a;
        pickerChatsListWidget.getClass();
        bc7 bc7Var = PickerChatsListWidget.C0[2];
        if (((Boolean) pickerChatsListWidget.X.a(pickerChatsListWidget)).booleanValue()) {
            return false;
        }
        m56 m56Var = pickerChatsListWidget.Y;
        if (m56Var != null) {
            m56Var.invoke(Boolean.TRUE);
        }
        pickerChatsListWidget.o0().q(j, fzaVar);
        return true;
    }

    @Override // defpackage.mxa
    public final void z(long j, fza fzaVar) {
        bc7[] bc7VarArr = PickerChatsListWidget.C0;
        this.a.o0().q(j, fzaVar);
    }
}
