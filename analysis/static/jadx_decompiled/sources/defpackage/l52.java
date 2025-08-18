package defpackage;

import one.me.members.list.MembersListWidget;
import one.me.profile.screens.members.ChatAdminsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class l52 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ChatAdminsScreen b;

    public /* synthetic */ l52(ChatAdminsScreen chatAdminsScreen, int i) {
        this.a = i;
        this.b = chatAdminsScreen;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        ChatAdminsScreen chatAdminsScreen = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatAdminsScreen.w0;
                return new MembersListWidget(chatAdminsScreen.o, new go8(chatAdminsScreen.n0(), ek2.ADMIN, (Integer) null, 12), null);
            case 1:
                bc7[] bc7VarArr2 = ChatAdminsScreen.w0;
                return new u52(chatAdminsScreen.n0());
            default:
                bc7[] bc7VarArr3 = ChatAdminsScreen.w0;
                f fVar = new f(1, chatAdminsScreen.m0(), u52.class, "getContextMenuActions", "getContextMenuActions(J)Ljava/util/List;", 0, 6);
                e11 e11Var = new e11(0, chatAdminsScreen.m0(), u52.class, "getButtonActions", "getButtonActions()Lkotlinx/coroutines/flow/Flow;", 0, 3);
                long jN0 = chatAdminsScreen.n0();
                xcb xcbVar = xcb.a;
                return new ro8(fVar, new k52(jN0, xcbVar.c(), xcbVar.e(), xcbVar.getAccessor().d(u7b.class), xcbVar.d(), xcbVar.getAccessor().d(y7b.class), xcbVar.g()), e11Var);
        }
    }
}
