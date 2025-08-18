package defpackage;

import one.me.chatscreen.ChatScreen;

/* loaded from: classes.dex */
public final class qo2 implements bha {
    public final /* synthetic */ ChatScreen a;

    public qo2(ChatScreen chatScreen) {
        this.a = chatScreen;
    }

    @Override // defpackage.bha
    public final void I(CharSequence charSequence) {
        bc7[] bc7VarArr = ChatScreen.k1;
        fl2 fl2Var = this.a.J0().o;
        fl2Var.getClass();
        if (charSequence != null) {
            charSequence.toString();
        }
        String string = charSequence != null ? charSequence.toString() : null;
        if (string == null) {
            string = "";
        }
        String str = string;
        il2 il2Var = (il2) fl2Var.a;
        il2Var.getClass();
        hm9.n("il2", "Search text changed ".concat(str));
        il2Var.a();
        il2Var.c = str;
        if (str.length() != 0) {
            j47.T(il2Var.e, null, null, new gl2(il2Var, str, 0L, null), 3);
            return;
        }
        fl2 fl2Var2 = il2Var.g;
        if (fl2Var2 != null) {
            fl2Var2.f();
        }
    }

    @Override // defpackage.bha
    public final void U() {
        ChatScreen chatScreen = this.a;
        if (chatScreen.getView() != null) {
            if (chatScreen.N0().b()) {
                chatScreen.N0().postDelayed(new cu1(12, chatScreen), 200L);
            } else {
                chatScreen.N0().f(true);
            }
            chatScreen.J0().q();
        }
    }

    @Override // defpackage.bha
    public final void g() {
        bc7[] bc7VarArr = ChatScreen.k1;
        this.a.N0().f(false);
    }

    @Override // defpackage.bha
    public final void n() {
        bc7[] bc7VarArr = ChatScreen.k1;
        this.a.J0().r(true);
    }
}
