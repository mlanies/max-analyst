package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.sdk.arch.Widget;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import one.me.sharedata.ShareDataPickerScreen;
import one.me.stickerspreview.StickerPreviewScreen;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class rpc implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rpc() {
        this.a = 11;
        this.b = np3.b;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                ((zl4) this.b).g();
                return e5f.a;
            case 1:
                int i = SafeModeOnboardingScreen.c;
                i3a onBackPressedDispatcher = ((SafeModeOnboardingScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            case 2:
                int iIntValue = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                t6d t6dVar = (t6d) this.b;
                sb.append(t6dVar.f[iIntValue]);
                sb.append(": ");
                sb.append(t6dVar.g[iIntValue].a());
                return sb.toString();
            case 3:
                bc7[] bc7VarArr = SettingMediaScreen.Y;
                ((SettingMediaScreen) this.b).getRouter().C();
                return e5f.a;
            case 4:
                bc7[] bc7VarArr2 = SettingsBlacklistScreen.Z;
                ((SettingsBlacklistScreen) this.b).getRouter().C();
                return e5f.a;
            case 5:
                bc7[] bc7VarArr3 = SettingsPrivacyScreen.Z;
                ((SettingsPrivacyScreen) this.b).getRouter().C();
                return e5f.a;
            case 6:
                bc7[] bc7VarArr4 = SettingsStorageScreen.X;
                ((SettingsStorageScreen) this.b).getRouter().C();
                return e5f.a;
            case 7:
                bc7[] bc7VarArr5 = ShareDataPickerScreen.D0;
                i3a onBackPressedDispatcher2 = ((ShareDataPickerScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return e5f.a;
            case 8:
                bc7[] bc7VarArr6 = StickerPreviewScreen.A0;
                ((StickerPreviewScreen) this.b).getRouter().C();
                return e5f.a;
            case 9:
                bc7[] bc7VarArr7 = StickersScreen.v0;
                ((StickersScreen) this.b).getRouter().C();
                return e5f.a;
            case 10:
                bc7[] bc7VarArr8 = StickersShowcaseScreen.v0;
                ((StickersShowcaseScreen) this.b).getRouter().C();
                return e5f.a;
            case 11:
                return Boolean.valueOf(((op3) obj).b == ((np3) this.b));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                if (!((dk2) obj).a.u0.contains(vm3.BOT)) {
                    ((qi8) this.b).getClass();
                }
                return true;
            case 13:
                fs8 fs8Var = (fs8) obj;
                int i2 = raf.$EnumSwitchMapping$0[((saf) this.b).b.ordinal()];
                if (i2 == 1) {
                    j = fs8Var.b;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ng4 ng4Var = fs8Var.D0;
                    j = ng4Var != null ? ng4Var.a : 0L;
                }
                return Long.valueOf(j);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ejf ejfVar = (ejf) this.b;
                byte[] bArr = (byte[]) obj;
                String name = ejf.class.getName();
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, name, "Capture first frame to have a preview", null);
                }
                j47.T(ejfVar.t0, ((w9a) ((kke) ejfVar.o.getValue())).a(), null, new djf(bArr, ejfVar, null), 2);
                return e5f.a;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                p8b p8bVar = (p8b) obj;
                bc7[] bc7VarArr9 = VideoMessageWidget.y0;
                ((ejf) ((VideoMessageWidget) this.b).o0()).G0.m(null, Boolean.valueOf(p8bVar == p8b.b));
                return e5f.a;
            case 16:
                bc7[] bc7VarArr10 = WebAppSettingsScreen.s0;
                ((WebAppSettingsScreen) this.b).getRouter().C();
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr11 = WebAppsSettingScreen.X;
                ((WebAppsSettingScreen) this.b).getRouter().C();
                return e5f.a;
            default:
                return Widget.binding$lambda$8((k56) this.b, obj);
        }
    }

    public /* synthetic */ rpc(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
