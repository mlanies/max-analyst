package defpackage;

import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class mk2 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatMembersScreen b;

    public /* synthetic */ mk2(ChatMembersScreen chatMembersScreen, int i) {
        this.a = i;
        this.b = chatMembersScreen;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        ChatMembersScreen chatMembersScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMembersScreen.u0;
                chatMembersScreen.getRouter().C();
                return e5fVar;
            case 1:
                ((Long) obj).getClass();
                bc7[] bc7VarArr2 = ChatMembersScreen.u0;
                return chatMembersScreen.n0().r();
            default:
                bc7[] bc7VarArr3 = ChatMembersScreen.u0;
                ro8 ro8VarO0 = chatMembersScreen.o0();
                ro8VarO0.Z.m(null, wz4.a);
                return e5fVar;
        }
    }
}
