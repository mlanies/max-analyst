package defpackage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.text.Editable;
import android.view.View;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.profile.ProfileScreen;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsAvatarBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class elb implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ elb(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ProfileScreen.D0;
                ProfileScreen profileScreen = (ProfileScreen) obj;
                tpa.o(profileScreen.getContext(), profileScreen.r0().r());
                break;
            case 1:
                hnc hncVar = ((knc) obj).L0;
                if (hncVar != null) {
                    hncVar.b();
                    break;
                }
                break;
            case 2:
                e4d e4dVar = (e4d) obj;
                c86 c86Var = e4dVar.I0;
                if (c86Var != null) {
                    bqc bqcVar = e4dVar.F0;
                    bqcVar.getClass();
                    bc7[] bc7VarArr2 = SelectAlbumWidget.Y;
                    q3d q3dVarO0 = ((SelectAlbumWidget) bqcVar.b).o0();
                    q0e q0eVar = q3dVarO0.Y;
                    b86 b86Var = c86Var.a;
                    q0eVar.setValue(b86Var);
                    pnf.o(q3dVarO0.o, new g3d(b86Var));
                    pnf.o(q3dVarO0.X, new d3d());
                    break;
                }
                break;
            case 3:
                bc7[] bc7VarArr3 = ServerHostBottomSheet.G0;
                ServerHostBottomSheet serverHostBottomSheet = (ServerHostBottomSheet) obj;
                serverHostBottomSheet.getClass();
                CharSequence text = ((cka) serverHostBottomSheet.E0.T0(serverHostBottomSheet, ServerHostBottomSheet.G0[3])).getText();
                if (!(text == null || text.length() == 0)) {
                    oo6 oo6Var = (oo6) serverHostBottomSheet.y0.getValue();
                    String string = text.toString();
                    SharedPreferences.Editor editorEdit = oo6Var.Y.edit();
                    editorEdit.putString("Custom", string);
                    editorEdit.apply();
                    oo6Var.s(string);
                    break;
                }
                break;
            case 4:
                jcd jcdVar = (jcd) obj;
                FrgBaseSettings frgBaseSettings = jcdVar.N0;
                if (frgBaseSettings != null) {
                    frgBaseSettings.t1(jcdVar.M0.a);
                    break;
                }
                break;
            case 5:
                bc7[] bc7VarArr4 = SettingsAvatarBottomSheet.C0;
                bc7 bc7Var = bc7VarArr4[4];
                SettingsAvatarBottomSheet settingsAvatarBottomSheet = (SettingsAvatarBottomSheet) obj;
                fs fsVar = settingsAvatarBottomSheet.B0;
                if (!((Boolean) fsVar.a(settingsAvatarBottomSheet)).booleanValue()) {
                    bc7 bc7Var2 = bc7VarArr4[4];
                    fsVar.b(settingsAvatarBottomSheet, Boolean.TRUE);
                    settingsAvatarBottomSheet.getTargetController();
                }
                settingsAvatarBottomSheet.s0(true);
                break;
            case 6:
                Editable text2 = ((tmd) obj).H0.getText();
                if (text2 != null) {
                    text2.clear();
                    break;
                }
                break;
            case 7:
                int i = StickerView.x0;
                ((StickerView) obj).getClass();
                break;
            case 8:
                bc7[] bc7VarArr5 = StickersScreen.v0;
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                StickersScreen stickersScreen = (StickersScreen) obj;
                m7e m7eVar = (m7e) stickersScreen.o0().z0.a.getValue();
                intent.putExtra("android.intent.extra.TEXT", m7eVar != null ? m7eVar.c : null);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                coc cocVar = (coc) x53.q0(stickersScreen.getRouter().e());
                l6e.c.Z1(intent, cocVar != null ? cocVar.b : null);
                break;
            case 9:
                bc7[] bc7VarArr6 = SuggestionsWidget.B0;
                ((SuggestionsWidget) obj).C0();
                break;
            case 10:
                ((vka) ((yka) obj)).b.invoke(view);
                break;
            case 11:
                ((wka) obj).e.invoke(view);
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((ywe) obj).dismiss();
                break;
            case 13:
                zef zefVar = (zef) obj;
                o00 o00Var = zefVar.Y;
                Long l = zefVar.Z;
                if (o00Var != null && l != null) {
                    long jLongValue = l.longValue();
                    a66 a66Var = zefVar.o;
                    if (a66Var != null) {
                        a66Var.invoke(o00Var, Long.valueOf(jLongValue));
                        break;
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                dif.b((dif) obj);
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((drf) ((VpnPanelWidget) obj).b.getValue()).b.o(u9f.c);
                break;
            case 16:
                isf isfVar = ((lsf) obj).o;
                if (isfVar != null) {
                    bc7[] bc7VarArr7 = RecordControlsWidget.b1;
                    ((RecordControlsWidget) ((y8) isfVar).a).I0().u().e();
                    break;
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr8 = WebAppRootScreen.G0;
                zzf zzfVarZ0 = ((WebAppRootScreen) obj).z0();
                zzfVarZ0.getClass();
                zzfVarZ0.C0.o1(zzfVarZ0, zzf.T0[0], pnf.n(zzfVarZ0, null, vx3.b, new qzf(zzfVarZ0, null), 1));
                break;
            default:
                x37 x37Var = (x37) ((WelcomeScreen) obj).X.getValue();
                x37Var.getClass();
                x37Var.a(i24.e(new InputPhoneScreen(), null, null), "InputPhoneScreen");
                break;
        }
    }

    public /* synthetic */ elb(SettingsAvatarBottomSheet settingsAvatarBottomSheet, int i) {
        this.a = 5;
        this.b = settingsAvatarBottomSheet;
    }
}
