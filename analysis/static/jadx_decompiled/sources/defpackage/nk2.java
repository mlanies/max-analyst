package defpackage;

import androidx.appcompat.widget.AppCompatEditText;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.members.ChatMembersScreen;

/* loaded from: classes2.dex */
public final class nk2 extends ffe implements a66 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMembersScreen Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk2(Continuation continuation, ChatMembersScreen chatMembersScreen) {
        super(2, continuation);
        this.Y = chatMembersScreen;
    }

    @Override // defpackage.a66
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        nk2 nk2Var = (nk2) n((kk2) obj, (Continuation) obj2);
        e5f e5fVar = e5f.a;
        nk2Var.o(e5fVar);
        return e5fVar;
    }

    @Override // defpackage.gi0
    public final Continuation n(Object obj, Continuation continuation) {
        nk2 nk2Var = new nk2(continuation, this.Y);
        nk2Var.X = obj;
        return nk2Var;
    }

    @Override // defpackage.gi0
    public final Object o(Object obj) throws Throwable {
        od2.a0(obj);
        kk2 kk2Var = (kk2) this.X;
        bc7[] bc7VarArr = ChatMembersScreen.u0;
        ChatMembersScreen chatMembersScreen = this.Y;
        chatMembersScreen.p0().setTitle(kk2Var.a);
        chatMembersScreen.p0().setSubtitle(kk2Var.b.b(chatMembersScreen.getContext()));
        chatMembersScreen.p0().setRightActions(kk2Var.c ? new pka(new xka(chatMembersScreen), new vka(woc.F, new mk2(chatMembersScreen, 2))) : new pka(null, new xka(chatMembersScreen)));
        String str = (String) chatMembersScreen.o0().u0.a.getValue();
        if (str != null) {
            eha searchView = chatMembersScreen.p0().getSearchView();
            if (searchView != null) {
                searchView.setExpandWithAnimation(false);
            }
            eha searchView2 = chatMembersScreen.p0().getSearchView();
            if (searchView2 != null && searchView2.w0) {
                searchView2.c(true);
                je7 je7Var = searchView2.C0;
                if (je7Var.a()) {
                    ((AppCompatEditText) je7Var.getValue()).setText(str);
                }
            }
            eha searchView3 = chatMembersScreen.p0().getSearchView();
            if (searchView3 != null) {
                searchView3.setExpandWithAnimation(true);
            }
        }
        return e5f.a;
    }
}
