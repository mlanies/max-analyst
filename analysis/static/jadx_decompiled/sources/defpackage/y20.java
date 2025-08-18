package defpackage;

import android.view.View;
import one.me.calllist.ui.CallHistoryScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.messages.media.audio.AudioListenView;

/* loaded from: classes2.dex */
public final /* synthetic */ class y20 implements View.OnClickListener {
    public final /* synthetic */ int a;

    public /* synthetic */ y20(int i) {
        this.a = i;
    }

    private final void a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                int i = AudioAttachView.w0;
                break;
            case 1:
                int i2 = AudioListenView.B0;
                break;
            case 2:
                bc7[] bc7VarArr = CallHistoryScreen.C0;
                z71.c.P1().b(":call-contact", null);
                break;
            case 3:
                bc7[] bc7VarArr2 = CallHistoryScreen.C0;
                z71.c.P1().b(":call-contact", null);
                break;
            case 4:
                bc7[] bc7VarArr3 = MediaKeyboardWidget.C0;
                sc7.c.P1().b(":stickers/settings", null);
                break;
            case 5:
                break;
            case 6:
                bc7[] bc7VarArr4 = ProfileAvatarsScreen.z0;
                break;
            default:
                int i3 = SafeModeOnboardingScreen.c;
                ihd.c.P1().b(":settings/privacy/pincode?mode=setup&replace_top=true", null);
                break;
        }
    }
}
