package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class lk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ lk2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMembersScreen.u0;
                return new bl2(62, chatMembersScreen.m0(), false);
            case 1:
                bc7[] bc7VarArr2 = ChatMembersScreen.u0;
                e11 e11Var = new e11(0, chatMembersScreen.n0(), bl2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 6);
                long jM0 = chatMembersScreen.m0();
                xcb xcbVar = xcb.a;
                return new ro8(new mk2(chatMembersScreen, 1), new d9(jM0, xcbVar.c(), xcbVar.getAccessor().d(u7b.class), xcbVar.d(), xcbVar.getAccessor().d(y7b.class), 1), e11Var);
            default:
                bc7[] bc7VarArr3 = ChatMembersScreen.u0;
                long jM02 = chatMembersScreen.m0();
                String string = chatMembersScreen.getArgs().getString("profile:memberslist:type");
                if (string == null) {
                    string = "";
                }
                return new MembersListWidget(chatMembersScreen.o, new go8(jM02, ek2.valueOf(string), (Integer) null, 12), null);
        }
    }
}
