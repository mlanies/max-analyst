package defpackage;

import one.me.settings.media.ui.SettingMediaScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;
import one.me.stickerssettings.StickersSettingsScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import one.me.webview.FaqWebViewWidget;

/* loaded from: classes2.dex */
public final /* synthetic */ class ngd implements k64 {
    public final /* synthetic */ int a;

    public /* synthetic */ ngd(int i) {
        this.a = i;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new SettingMediaScreen();
            case 1:
                return new StartConversationScreen();
            case 2:
                return new PickChatMembers();
            case 3:
                return new ChatTitleIconScreen(null, pyd.o);
            case 4:
                return new StickersSettingsScreen();
            case 5:
                return new StickersScreen(a5e.c, 0L, 2, null);
            case 6:
                return new StickersScreen(a5e.o, 0L, 2, null);
            case 7:
                return new WebAppsSettingScreen();
            default:
                return new FaqWebViewWidget();
        }
    }
}
