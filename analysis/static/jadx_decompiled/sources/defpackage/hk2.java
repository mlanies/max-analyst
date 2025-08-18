package defpackage;

import java.util.function.Consumer;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.contactlist.ContactListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class hk2 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ m56 b;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ hk2(v8 v8Var, int i) {
        this.a = i;
        this.b = (m56) v8Var;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        m56 m56Var = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMembersCompactWidget.Z;
                m56Var.invoke(obj);
                break;
            case 1:
                bc7[] bc7VarArr2 = ChatsListSearchScreen.J0;
                m56Var.invoke(obj);
                break;
            case 2:
                bc7[] bc7VarArr3 = ChatsListWidget.M0;
                m56Var.invoke(obj);
                break;
            case 3:
                bc7[] bc7VarArr4 = ChatsListWidget.M0;
                m56Var.invoke(obj);
                break;
            case 4:
                bc7[] bc7VarArr5 = ContactListWidget.P0;
                m56Var.invoke(obj);
                break;
            case 5:
                bc7[] bc7VarArr6 = MessagesListWidget.X0;
                m56Var.invoke(obj);
                break;
            case 6:
                bc7[] bc7VarArr7 = MessagesListWidget.X0;
                m56Var.invoke(obj);
                break;
            case 7:
                m56Var.invoke(obj);
                break;
            case 8:
                m56Var.invoke(obj);
                break;
            case 9:
                m56Var.invoke(obj);
                break;
            case 10:
                bc7[] bc7VarArr8 = StickersScreen.v0;
                m56Var.invoke(obj);
                break;
            case 11:
                bc7[] bc7VarArr9 = StickersSettingsScreen.Y;
                m56Var.invoke(obj);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr10 = WebAppRootScreen.G0;
                m56Var.invoke(obj);
                break;
            default:
                bc7[] bc7VarArr11 = WebAppRootScreen.G0;
                m56Var.invoke(obj);
                break;
        }
    }
}
