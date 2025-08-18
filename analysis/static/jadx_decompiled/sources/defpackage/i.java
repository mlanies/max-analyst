package defpackage;

import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.android.logout.LogoutScreen;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.devmenu.DevMenuScreen;
import one.me.devmenu.ThemeRoomBottomSheet;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.showroom.ShowroomScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class i implements k64 {
    public final /* synthetic */ int a;

    public /* synthetic */ i(int i) {
        this.a = i;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new AboutAppSettingsScreen();
            case 1:
                return new ForceUpdateScreen();
            case 2:
                return new PipScreen();
            case 3:
                return new CallOpponentsListWidget();
            case 4:
                return new CallAdminSettingsScreen();
            case 5:
                return new AdminWaitingRoomScreen();
            case 6:
                return new CallHistoryScreen();
            case 7:
                return new ChatsListSearchScreen();
            case 8:
                return new kr3();
            case 9:
                return new ContactListWidget(uo3.a);
            case 10:
                return new DevMenuScreen();
            case 11:
                return new LogsViewerScreen();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ServerHostBottomSheet();
            case 13:
                return new ServerPortBottomSheet();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ShowroomScreen();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ThreadsStateViewerScreen();
            case 16:
                return new ThemeRoomBottomSheet();
            case LangUtils.HASH_SEED /* 17 */:
                return new FoldersListScreen();
            case 18:
                return new FakeInAppReviewBottomSheet();
            case 19:
                return new InviteByPhoneScreen();
            case 20:
                return new InviteByQrBottomSheet();
            case 21:
                return new InviteFriendsToMaxBottomSheet();
            case 22:
                return new LoginScreen();
            case 23:
                return new LogoutScreen();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new MediaPickerScreen(new d86(false, false, false, false, nz4.a, false, false));
            case 25:
                return new MessagesSettingsScreen();
            case 26:
                return new NotificationsSettingsScreen();
            case 27:
                return new ChatNotificationsSettingsScreen();
            case 28:
                return new DialogNotificationsSettingsScreen();
            default:
                return new OtherNotificationsSettingsScreen();
        }
    }
}
