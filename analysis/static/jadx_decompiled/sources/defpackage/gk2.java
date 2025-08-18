package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class gk2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersCompactWidget b;

    public /* synthetic */ gk2(ChatMembersCompactWidget chatMembersCompactWidget, int i) {
        this.a = i;
        this.b = chatMembersCompactWidget;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        ChatMembersCompactWidget chatMembersCompactWidget = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMembersCompactWidget.Z;
                return new MembersListWidget(chatMembersCompactWidget.b, new go8(chatMembersCompactWidget.m0(), ek2.MEMBER, (Integer) 10, 4), null);
            case 1:
                bc7[] bc7VarArr2 = ChatMembersCompactWidget.Z;
                return new bl2(60, chatMembersCompactWidget.m0(), true);
            default:
                bc7[] bc7VarArr3 = ChatMembersCompactWidget.Z;
                e11 e11Var = new e11(0, chatMembersCompactWidget.n0(), bl2.class, "getMemberListActions", "getMemberListActions()Lkotlinx/coroutines/flow/Flow;", 0, 5);
                long jM0 = chatMembersCompactWidget.m0();
                xcb xcbVar = xcb.a;
                return new ro8(new l(25, chatMembersCompactWidget), new d9(jM0, xcbVar.c(), xcbVar.getAccessor().d(u7b.class), xcbVar.d(), xcbVar.getAccessor().d(y7b.class), 1), e11Var);
        }
    }
}
