package defpackage;

import one.me.complaintbottomsheet.ComplaintBottomSheet;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.pickerfolders.FoldersPickerScreen;
import one.me.login.neuroavatars.NeuroAvatarsScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes.dex */
public final /* synthetic */ class ka3 implements k64 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;

    public /* synthetic */ ka3(long j, int i) {
        this.a = i;
        this.b = j;
    }

    @Override // defpackage.k64
    public final Object a() {
        switch (this.a) {
            case 0:
                return new ComplaintBottomSheet(this.b);
            case 1:
                return new FolderEditScreen(this.b);
            case 2:
                return new FoldersPickerScreen(this.b);
            case 3:
                return new NeuroAvatarsScreen(this.b);
            case 4:
                return new ChatMediaTabWidget(this.b);
            case 5:
                return new ProfileInviteScreen(this.b);
            case 6:
                return new AddChatAdminsScreen(this.b);
            case 7:
                return new AddChatMembersScreen(this.b);
            case 8:
                return new ProfileMemberPermissionsScreen(this.b);
            case 9:
                return new PickSubscribersScreen(this.b);
            case 10:
                return new StickersScreen(a5e.X, this.b);
            default:
                return new WebAppSettingsScreen(this.b);
        }
    }
}
