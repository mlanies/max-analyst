package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.play.core.install.InstallException;
import java.util.ArrayList;
import java.util.List;
import one.me.android.join.JoinChatWidget;
import one.me.appupdate.forceupdate.ForceUpdateScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.partialmediaaccess.PartialMediaAccessWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.login.inputphone.InputPhoneScreen;
import one.me.mediapicker.permissions.MediaPickerPermissionWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.gallery.view.NumericCheckButton;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.messages.media.attaches.MessageAttachmentsLayout;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.media.mediabar.FrgLocalGif;
import ru.ok.messages.media.mediabar.MediaBarPreviewLayout;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class xx5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xx5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        ukg ukgVarQ;
        u86 u86Var;
        r4d r4dVar;
        int i = 2;
        vx3 vx3Var = vx3.b;
        int iU = 0;
        int i2 = 0;
        z = false;
        boolean z = false;
        z = false;
        boolean z2 = false;
        iU = 0;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                int i3 = ForceUpdateScreen.o;
                ForceUpdateScreen forceUpdateScreen = (ForceUpdateScreen) obj;
                Activity activity = forceUpdateScreen.getActivity();
                if (activity != null) {
                    xp xpVar = (xp) forceUpdateScreen.b;
                    xpVar.getClass();
                    if (!((xe6) ((u8e) bcf.a.getAccessor().c(u8e.class))).a()) {
                        up.a.getClass();
                        nd7.A(activity, tp.b);
                        return;
                    }
                    fig figVar = xpVar.b;
                    String packageName = figVar.b.getPackageName();
                    o97 o97Var = fkg.e;
                    fkg fkgVar = figVar.a;
                    ykg ykgVar = fkgVar.a;
                    if (ykgVar == null) {
                        Object[] objArr = {-9};
                        if (Log.isLoggable("PlayCore", 6)) {
                            o97.c(o97Var.b, "onError(%d)", objArr);
                        } else {
                            o97Var.getClass();
                        }
                        ukgVarQ = j1e.q(new InstallException(-9));
                    } else {
                        o97Var.b("requestUpdateInfo(%s)", packageName);
                        qne qneVar = new qne();
                        ykgVar.a().post(new jjg(ykgVar, qneVar, qneVar, new jjg(fkgVar, qneVar, packageName, qneVar)));
                        ukgVarQ = qneVar.a;
                    }
                    wp wpVar = new wp(iU, new vp(activity, iU));
                    ukgVarQ.getClass();
                    q67 q67Var = xne.a;
                    ukgVarQ.d(q67Var, wpVar);
                    ukgVarQ.c(q67Var, new ync(i, activity));
                    return;
                }
                return;
            case 1:
                int i4 = ForgotPinCodeDialog.y0;
                ForgotPinCodeDialog forgotPinCodeDialog = (ForgotPinCodeDialog) obj;
                forgotPinCodeDialog.getClass();
                bc7 bc7Var = BottomSheetWidget.x0[0];
                forgotPinCodeDialog.v0.b(forgotPinCodeDialog, Boolean.FALSE);
                bk bkVar = new bk(10, forgotPinCodeDialog);
                qyc qycVar = (qyc) ((y7d) ehd.a.getAccessor().d(y7d.class).getValue());
                qycVar.getClass();
                c54.W(forgotPinCodeDialog, qycVar.s(PmsKey.f120supportaccount, "max.ru/support"), bkVar);
                return;
            case 2:
                ((FrgLocalGif) obj).b();
                return;
            case 3:
                z86 z86Var = (z86) obj;
                int iH = z86Var.h();
                z96 z96Var = z86Var.F0;
                if (z96Var.b.a) {
                    iH--;
                }
                if (iH >= 0 && (u86Var = (u86) x53.j0(iH, (List) z96Var.w0.getValue())) != null) {
                    iU = z96Var.u(u86Var.c, true);
                    u86Var.h = iU;
                }
                NumericCheckButton numericCheckButton = z86Var.G0;
                if (numericCheckButton != null) {
                    numericCheckButton.setNumber(iU);
                    return;
                }
                return;
            case 4:
                bc7[] bc7VarArr = InputPhoneScreen.E0;
                InputPhoneScreen inputPhoneScreen = (InputPhoneScreen) obj;
                q27 q27VarQ0 = inputPhoneScreen.q0();
                q27VarQ0.u0.o1(q27VarQ0, q27.B0[0], (vxd) q27VarQ0.b.a(q27VarQ0.a, ((w9a) ((kke) q27VarQ0.o.getValue())).b(), vx3Var, new i27(inputPhoneScreen.p0().getCode(), inputPhoneScreen.p0().getPhoneWithoutCode(), q27VarQ0, null)));
                AppCompatTextView appCompatTextView = inputPhoneScreen.x0;
                if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
                    z2 = true;
                }
                OneMeButton oneMeButtonO0 = inputPhoneScreen.o0();
                oneMeButtonO0.setProgressEnabled(!z2);
                oneMeButtonO0.setClickable(z2);
                return;
            case 5:
                bc7[] bc7VarArr2 = InviteByPhoneScreen.B0;
                InviteByPhoneScreen inviteByPhoneScreen = (InviteByPhoneScreen) obj;
                c67 c67VarP0 = inviteByPhoneScreen.p0();
                c67VarP0.z0.o1(c67VarP0, c67.F0[0], (vxd) c67VarP0.b.a(c67VarP0.a, ((w9a) ((kke) c67VarP0.Z.getValue())).b(), vx3Var, new x57(c67VarP0, inviteByPhoneScreen.o0().getCode(), inviteByPhoneScreen.o0().getPhoneWithoutCode(), null)));
                AppCompatTextView appCompatTextView2 = inviteByPhoneScreen.v0;
                if (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0) {
                    z = true;
                }
                OneMeButton oneMeButtonN0 = inviteByPhoneScreen.n0();
                oneMeButtonN0.setProgressEnabled(!z);
                oneMeButtonN0.setClickable(z);
                return;
            case 6:
                bc7[] bc7VarArr3 = InviteByQrBottomSheet.G0;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) obj;
                inviteByQrBottomSheet.getClass();
                bc7[] bc7VarArr4 = InviteByQrBottomSheet.G0;
                bc7 bc7Var2 = bc7VarArr4[3];
                w4d w4dVar = inviteByQrBottomSheet.E0;
                x77 x77Var = (x77) w4dVar.T0(inviteByQrBottomSheet, bc7Var2);
                if (x77Var == null || !x77Var.isActive()) {
                    l67 l67Var = (l67) inviteByQrBottomSheet.C0.getValue();
                    Integer numD = ((an9) l67Var.b.getValue()).d();
                    l67Var.a("clicked_to_invite", (numD != null && numD.intValue() == 100) ? "plus" : "main", "invite_friends");
                    w4dVar.o1(inviteByQrBottomSheet, bc7VarArr4[3], j47.T(inviteByQrBottomSheet.getViewLifecycleScope(), null, vx3Var, new e67(inviteByQrBottomSheet, null), 1));
                    return;
                }
                return;
            case 7:
                bc7[] bc7VarArr5 = InviteFriendsToMaxBottomSheet.E0;
                InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = (InviteFriendsToMaxBottomSheet) obj;
                inviteFriendsToMaxBottomSheet.getClass();
                bc7[] bc7VarArr6 = InviteFriendsToMaxBottomSheet.E0;
                bc7 bc7Var3 = bc7VarArr6[0];
                w4d w4dVar2 = inviteFriendsToMaxBottomSheet.C0;
                x77 x77Var2 = (x77) w4dVar2.T0(inviteFriendsToMaxBottomSheet, bc7Var3);
                if (x77Var2 == null || !x77Var2.isActive()) {
                    w4dVar2.o1(inviteFriendsToMaxBottomSheet, bc7VarArr6[0], j47.T(inviteFriendsToMaxBottomSheet.getViewLifecycleScope(), null, vx3Var, new j67(inviteFriendsToMaxBottomSheet, null), 1));
                    return;
                }
                return;
            case 8:
                bc7[] bc7VarArr7 = JoinChatWidget.x0;
                JoinChatWidget joinChatWidget = (JoinChatWidget) obj;
                joinChatWidget.s0(true);
                if (!(joinChatWidget.requireActivity() instanceof nmc)) {
                    joinChatWidget.requireActivity().finish();
                    return;
                } else {
                    joinChatWidget.getRouter().C();
                    return;
                }
            case 9:
                ((we7) obj).H0.setChecked(!r11.isChecked());
                return;
            case 10:
                ((MaterialDatePicker) obj).l1();
                throw null;
            case 11:
                u48 u48Var = (u48) obj;
                t48 t48Var = u48Var.G0;
                if (t48Var == null || (r4dVar = u48Var.L0) == null) {
                    return;
                }
                la6 la6Var = (la6) u48Var.M0.getHierarchy();
                if (la6Var != null) {
                    wnc wncVar = la6Var.c;
                }
                int iH2 = u48Var.h();
                r48 r48Var = ((MediaBarPreviewLayout) t48Var).T0;
                if (r48Var == null) {
                    return;
                }
                ActLocalMedias actLocalMedias = (ActLocalMedias) r48Var;
                if (!tpa.f(actLocalMedias.Y0.X, "SELECTED_MEDIA_ALBUM")) {
                    return;
                }
                while (true) {
                    ArrayList arrayList = actLocalMedias.V0;
                    if (i2 >= arrayList.size()) {
                        return;
                    }
                    if (((up7) arrayList.get(i2)).b == r4dVar.a.b) {
                        actLocalMedias.c1.e(i2, true);
                        actLocalMedias.f1.x(iH2);
                        return;
                    }
                    i2++;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr8 = MediaBarWidget.d1;
                pnf.o(((MediaBarWidget) obj).u0().o, h86.a);
                return;
            case 13:
                bc7[] bc7VarArr9 = MediaPickerPermissionWidget.o;
                MediaPickerPermissionWidget mediaPickerPermissionWidget = (MediaPickerPermissionWidget) obj;
                boolean zB = ((eua) mediaPickerPermissionWidget.c.getValue()).b(eua.l);
                je7 je7Var = mediaPickerPermissionWidget.c;
                if (zB) {
                    ((eua) je7Var.getValue()).f(new l5g(mediaPickerPermissionWidget, 1), eua.m, 157);
                    return;
                } else {
                    ((eua) je7Var.getValue()).f(new l5g(mediaPickerPermissionWidget, 1), eua.n, 162);
                    return;
                }
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yk8 yk8Var = (yk8) obj;
                int i5 = yk8Var.a;
                gaa gaaVar = (gaa) yk8Var.c;
                gaaVar.getClass();
                bc7[] bc7VarArr10 = ChatMediaViewerScreen.K0;
                ChatMediaViewerScreen chatMediaViewerScreen = (ChatMediaViewerScreen) gaaVar.a;
                chatMediaViewerScreen.getClass();
                int iS = au1.s(i5);
                if (iS == 1 || iS == 2) {
                    if (chatMediaViewerScreen.B0().b()) {
                        chatMediaViewerScreen.B0().pause();
                        return;
                    } else {
                        chatMediaViewerScreen.B0().play();
                        return;
                    }
                }
                if (iS != 4) {
                    return;
                }
                yk8 yk8Var2 = chatMediaViewerScreen.A0;
                if (yk8Var2 != null) {
                    yk8Var2.b(4);
                }
                ck2 ck2VarD0 = chatMediaViewerScreen.D0();
                sb8 sb8VarX = ck2VarD0.x();
                if (sb8VarX instanceof jb8) {
                    pnf.o(ck2VarD0.N0, new m35((jb8) sb8VarX));
                    return;
                } else {
                    if (sb8VarX instanceof qb8) {
                        qb8 qb8Var = (qb8) sb8VarX;
                        ck2VarD0.v(qb8Var.a, qb8Var.X);
                        return;
                    }
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((MessageAttachmentsLayout) obj).a.M(0);
                return;
            case 16:
                bc7[] bc7VarArr11 = MessageContextMenuBottomSheet.Z0;
                ((MessageContextMenuBottomSheet) obj).s0(true);
                return;
            case LangUtils.HASH_SEED /* 17 */:
                dw8 dw8Var = (dw8) obj;
                cw8 cw8Var = dw8Var.Y;
                if (cw8Var == null) {
                    return;
                }
                vv8 vv8Var = cw8Var.e;
                if (vv8Var == null || cw8Var.d != null) {
                    a66 a66Var = dw8Var.o;
                    if (a66Var != null) {
                        a66Var.invoke(Long.valueOf(cw8Var.a), Long.valueOf(cw8Var.b));
                        return;
                    }
                    return;
                }
                m56 m56Var = dw8Var.X;
                if (m56Var != null) {
                    m56Var.invoke(vv8Var);
                    return;
                }
                return;
            case 18:
                ((fl9) obj).n(new fj0(18));
                return;
            case 19:
                bc7[] bc7VarArr12 = NotificationsSettingsScreen.v0;
                gx9 gx9VarM0 = ((NotificationsSettingsScreen) obj).m0();
                gx9VarM0.z0.o1(gx9VarM0, gx9.C0[0], j47.S(gx9VarM0.a, ((w9a) ((kke) gx9VarM0.X.getValue())).b(), vx3Var, new fx9(gx9VarM0, null)));
                return;
            case 20:
                ArrayList arrayList2 = new ArrayList();
                o7a o7aVar = (o7a) obj;
                li9 li9Var = o7aVar.t0;
                Object[] objArr2 = li9Var.a;
                int i6 = li9Var.b;
                for (int i7 = 0; i7 < i6; i7++) {
                    arrayList2.add(o7a.c((l7a) objArr2[i7]));
                }
                li9 li9Var2 = o7aVar.u0;
                Object[] objArr3 = li9Var2.a;
                int i8 = li9Var2.b;
                for (int i9 = 0; i9 < i8; i9++) {
                    arrayList2.add(o7a.c((l7a) objArr3[i9]));
                }
                xpd xpdVar = new xpd(o7aVar.getContext(), o7aVar.getCustomTheme() != null, arrayList2, new wz7(11, o7aVar));
                Rect rect = o7aVar.v0;
                view.getGlobalVisibleRect(rect);
                xpdVar.showAtLocation(view, 8388661, br7.D(o7aVar.getContext()) - rect.right, rh4.c(8, fk4.d().getDisplayMetrics().density, rect.bottom));
                return;
            case 21:
                ((i50) obj).b(yha.X);
                return;
            case 22:
                PopupWindow popupWindow = (PopupWindow) obj;
                if (popupWindow != null) {
                    popupWindow.showAsDropDown(view);
                    return;
                }
                return;
            case 23:
                PartialMediaAccessWidget partialMediaAccessWidget = (PartialMediaAccessWidget) obj;
                ((eua) partialMediaAccessWidget.a.getValue()).f(new l5g(partialMediaAccessWidget, 1), eua.m, 157);
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                gra graVar = (gra) obj;
                EditText editText = graVar.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = graVar.f;
                if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    graVar.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    graVar.f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    graVar.f.setSelection(selectionEnd);
                }
                graVar.q();
                return;
            case 25:
                bc7[] bc7VarArr13 = PickChatMembers.x0;
                syd.c.P1().b(":chat/add-icon?ids=".concat(x53.n0((Iterable) ((PickChatMembers) obj).v0().Z.a.getValue(), ",", null, null, null, 62)), null);
                return;
            case 26:
                f6b f6bVar = (f6b) obj;
                z5b z5bVar = f6bVar.a;
                if (z5bVar == null || !z5bVar.j()) {
                    return;
                }
                f6bVar.j(true);
                return;
            case 27:
                bc7[] bc7VarArr14 = ProfileChangeLinkScreen.v0;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                View view2 = profileChangeLinkScreen.getView();
                if (view2 != null) {
                    view2.clearFocus();
                }
                mr0.G(profileChangeLinkScreen);
                l22 l22VarP0 = profileChangeLinkScreen.p0();
                l22VarP0.t0.o1(l22VarP0, l22.u0[0], j47.T(l22VarP0.a, null, null, new k22(l22VarP0, null), 3));
                return;
            case 28:
                feb febVarO0 = ((ProfileEditAdminPermissionsWidget) ((mdb) ((jv5) obj).Y)).o0();
                febVarO0.D0.o1(febVarO0, feb.G0[0], j47.S(febVarO0.a, ((w9a) febVarO0.u()).a(), vx3Var, new xdb(febVarO0, null)));
                return;
            default:
                bc7[] bc7VarArr15 = ProfileEditAdminPermissionsWidget.x0;
                ((ProfileEditAdminPermissionsWidget) obj).o0().r();
                return;
        }
    }
}
