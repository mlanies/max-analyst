package defpackage;

import android.content.Context;
import android.os.Bundle;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.raisehand.RaiseHandActionBottomSheet;
import one.me.contactlist.ContactListWidget;
import one.me.filedownloadwarning.FileDownloadWarningBottomSheet;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;
import one.me.webapp.settings.WebAppSettingsScreen;

/* loaded from: classes2.dex */
public final /* synthetic */ class eh2 implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Bundle b;

    public /* synthetic */ eh2(Bundle bundle, int i) {
        this.a = i;
        this.b = bundle;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        fbb obbVar;
        uo3 uo3Var = uo3.b;
        uo3 uo3VarValueOf = null;
        uo3 uo3VarValueOf2 = null;
        Bundle bundle = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatMediaTabWidget.w0;
                return new dh2(bundle.getLong("chat_id"));
            case 1:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                return Integer.valueOf(bundle.getInt("bottom_snackbar_margin", 0));
            case 2:
                bc7[] bc7VarArr2 = ContactListWidget.P0;
                String string = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                try {
                    uo3VarValueOf = uo3.valueOf(string != null ? string : "");
                } catch (IllegalArgumentException unused) {
                }
                uo3 uo3Var2 = uo3VarValueOf == null ? uo3Var : uo3VarValueOf;
                hr3 hr3Var = hr3.a;
                return new oo3(uo3Var2, hr3Var.getAccessor().d(Context.class), (qn3) hr3Var.getAccessor().c(qn3.class), hr3Var.getAccessor().d(yx7.class), (kke) hr3Var.getAccessor().c(kke.class), hr3Var.getAccessor().d(b0d.class), hr3Var.getAccessor().d(xj3.class), hr3Var.getAccessor().d(ds3.class), hr3Var.getAccessor().d(iy2.class), hr3Var.getAccessor().d(ck3.class), hr3Var.getAccessor().d(qq3.class), hr3Var.getAccessor().d(yj3.class), hr3Var.getAccessor().d(gq3.class), hr3Var.getAccessor().d(afe.class), hr3Var.getAccessor().d(oc6.class), hr3Var.getAccessor().d(y7d.class), hr3Var.getAccessor().d(l67.class));
            case 3:
                bc7[] bc7VarArr3 = ContactListWidget.P0;
                String string2 = bundle != null ? bundle.getString("contact_screen_open_mode") : null;
                try {
                    uo3VarValueOf2 = uo3.valueOf(string2 != null ? string2 : "");
                } catch (IllegalArgumentException unused2) {
                }
                if (uo3VarValueOf2 != null) {
                    uo3Var = uo3VarValueOf2;
                }
                return Boolean.valueOf(uo3Var == uo3.a);
            case 4:
                int i2 = FileDownloadWarningBottomSheet.b;
                long j = bundle.getLong("chat_id");
                long j2 = bundle.getLong("message_id");
                String string3 = bundle.getString("attach_id");
                long j3 = bundle.getLong("file_id");
                String string4 = bundle.getString("file_name");
                if (string4 == null) {
                    throw new IllegalArgumentException("Required value was null.".toString());
                }
                String string5 = bundle.getString("file_url");
                if (string5 != null) {
                    return new jh5(new kh5(j, j2, string3, j3, string4, string5));
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            case 5:
                bc7[] bc7VarArr4 = KeyboardStickersWidget.t0;
                bundle.getLong("arg_key_chat_id");
                kc7 kc7Var = kc7.a;
                kke kkeVar = (kke) kc7Var.getAccessor().c(kke.class);
                khe kheVarD = kc7Var.getAccessor().d(o2e.class);
                khe kheVarD2 = kc7Var.getAccessor().d(x9c.class);
                khe kheVarD3 = kc7Var.getAccessor().d(md5.class);
                khe kheVarD4 = kc7Var.getAccessor().d(sc5.class);
                kc7Var.getAccessor().d(s8g.class);
                return new b8e(kkeVar, kheVarD, kheVarD2, kheVarD3, kheVarD4, new khe(new m57(8)), kc7Var.getAccessor().d(qe5.class));
            case 6:
                bc7[] bc7VarArr5 = ProfileAvatarsScreen.z0;
                long j4 = bundle.getLong("EXTRA_ID");
                String string6 = bundle.getString("EXTRA_TYPE");
                dp3 dp3Var = hdb.b;
                if (tpa.f(string6, "contact")) {
                    obbVar = new obb(j4);
                } else {
                    pz7 pz7Var = new pz7();
                    pz7Var.a = j4;
                    xcb xcbVar = xcb.a;
                    pz7Var.c = xcbVar.c();
                    pz7Var.b = xcbVar.h();
                    q0e q0eVarA = r0e.a(nz4.a);
                    pz7Var.d = q0eVarA;
                    pz7Var.e = new w7c(q0eVarA);
                    pz7Var.f = new dbb(new iqe(""));
                    obbVar = pz7Var;
                }
                xcb xcbVar2 = xcb.a;
                return new ccb(obbVar, xcbVar2.getAccessor().d(o45.class), xcbVar2.f());
            case 7:
                bc7[] bc7VarArr6 = ProfileInviteScreen.Y;
                long j5 = bundle.getLong("id");
                xcb xcbVar3 = xcb.a;
                return new jib(j5, xcbVar3.getAccessor().d(gh3.class), xcbVar3.c(), xcbVar3.f(), xcbVar3.b(), xcbVar3.getAccessor().d(rh0.class), xcbVar3.g(), xcbVar3.d());
            case 8:
                int i3 = ProfileMemberPermissionsScreen.o;
                long j6 = bundle.getLong("id");
                neb nebVar = neb.a;
                return new zjb(j6, nebVar.c(), nebVar.d(), nebVar.b(), nebVar.getAccessor().d(rh0.class), nebVar.getAccessor().d(gh3.class), nebVar.getAccessor().d(wha.class), nebVar.getAccessor().d(qe5.class));
            case 9:
                bc7[] bc7VarArr7 = RaiseHandActionBottomSheet.B0;
                gg1 gg1Var = (gg1) bundle.getParcelable("opponent_id");
                if (gg1Var == null) {
                    gg1Var = gg1.c;
                }
                return new i4c(gg1Var, zi1.a.b());
            case 10:
                bc7[] bc7VarArr8 = RecordExitBottomSheet.G0;
                ccc cccVarValueOf = ccc.valueOf(bundle.getString("open_type", "UNDEFINE"));
                je7 je7Var = yi1.a;
                zi1 zi1Var = zi1.a;
                khe kheVarD5 = zi1Var.getAccessor().d(lvc.class);
                je7 je7VarB = yi1.b();
                return new kcc(cccVarValueOf, bundle.containsKey("admin_record_settings") ? Boolean.valueOf(bundle.getBoolean("admin_record_settings")) : null, zi1Var.b(), je7VarB, kheVarD5, yi1.a());
            default:
                bc7[] bc7VarArr9 = WebAppSettingsScreen.s0;
                return new p0g(((hyc) ((q33) jwf.a.getAccessor().c(q33.class))).t(), bundle.getLong("bot_id_arg"));
        }
    }
}
