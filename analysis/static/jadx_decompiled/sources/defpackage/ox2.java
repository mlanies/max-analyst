package defpackage;

import one.me.chats.list.ChatsListWidget;

/* loaded from: classes.dex */
public final /* synthetic */ class ox2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatsListWidget b;

    public /* synthetic */ ox2(ChatsListWidget chatsListWidget, int i) {
        this.a = i;
        this.b = chatsListWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        boolean z = true;
        z = true;
        ChatsListWidget chatsListWidget = this.b;
        switch (this.a) {
            case 0:
                if (tpa.f(chatsListWidget.b, "all.chat.folder")) {
                    return (qn3) hr3.a.getAccessor().c(qn3.class);
                }
                qn3.a.getClass();
                return pn3.b;
            case 1:
                bc7[] bc7VarArr = ChatsListWidget.M0;
                return chatsListWidget.getRouter();
            case 2:
                bc7[] bc7VarArr2 = ChatsListWidget.M0;
                q84 q84Var = (q84) dh0.a.getAccessor().c(q84.class);
                hn2 hn2Var = new hn2(8);
                q84Var.getClass();
                return new oz2(chatsListWidget.b, hn2Var);
            case 3:
                bc7[] bc7VarArr3 = ChatsListWidget.M0;
                if (((mt2) chatsListWidget.p0().G0.getValue()).b && !chatsListWidget.o0().O0()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                bc7[] bc7VarArr4 = ChatsListWidget.M0;
                return new nx2((qn3) chatsListWidget.X.getValue(), chatsListWidget.b, (rg1) chatsListWidget.J0.getValue());
            case 5:
                bc7[] bc7VarArr5 = ChatsListWidget.M0;
                return new bh0(new khe(new ox2(chatsListWidget, 2)), false, null, 62);
            case 6:
                bc7[] bc7VarArr6 = ChatsListWidget.M0;
                aba abaVar = new aba(chatsListWidget.getContext(), null);
                abaVar.setIcon(woc.A0);
                abaVar.setTitle(new eqe(j0c.chats_list_empty_state_title));
                pla.a(abaVar, new re(9, abaVar, chatsListWidget));
                return abaVar;
            case 7:
                bc7[] bc7VarArr7 = ChatsListWidget.M0;
                gy2.c.P1().b(":settings/folder/members-picker?folder_id=".concat(chatsListWidget.b), null);
                return e5f.a;
            case 8:
                bc7[] bc7VarArr8 = ChatsListWidget.M0;
                return new rg1(new khe(new ox2(chatsListWidget, z ? 1 : 0)), new l5g(chatsListWidget, 0));
            default:
                bc7[] bc7VarArr9 = ChatsListWidget.M0;
                return new xu2(chatsListWidget.o0(), new ox2(chatsListWidget, 3), hr3.a.getAccessor().d(l67.class));
        }
    }
}
