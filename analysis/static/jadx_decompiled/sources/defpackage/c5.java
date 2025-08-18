package defpackage;

import android.content.res.Resources;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.util.LangUtils;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.messages.widgets.ChatMsgSearchResultView;
import ru.ok.messages.settings.ActSettings;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class c5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Resources.NotFoundException {
        dw1 dw1Var;
        switch (this.a) {
            case 0:
                HashSet hashSet = ActAttachesView.z1;
                ((ActAttachesView) this.b).onBackPressed();
                break;
            case 1:
                int i = ActContactAvatars.h1;
                ((ActContactAvatars) this.b).finish();
                break;
            case 2:
                int i2 = ActLocalMedias.s1;
                ((ActLocalMedias) this.b).onBackPressed();
                break;
            case 3:
                int i3 = ActProfilePhoto.Y0;
                ((ActProfilePhoto) this.b).finish();
                break;
            case 4:
                int i4 = ActSettings.V0;
                ActSettings actSettings = (ActSettings) this.b;
                n16 n16VarS = actSettings.S();
                if (n16VarS.d.size() + (n16VarS.h == null ? 0 : 1) <= 0) {
                    actSettings.finish();
                    break;
                } else {
                    n16 n16VarS2 = actSettings.S();
                    n16VarS2.getClass();
                    n16VarS2.y(new l16(n16VarS2, -1, 0), false);
                    break;
                }
            case 5:
                bc7[] bc7VarArr = AddChatMembersScreen.x0;
                AddChatMembersScreen addChatMembersScreen = (AddChatMembersScreen) this.b;
                if (!((k9) addChatMembersScreen.v0().c).h) {
                    bc7[] bc7VarArr2 = BottomSheetWidget.x0;
                    lg3 lg3VarE = wg0.e(jpc.W, 6, null);
                    lg3VarE.a(new mg3(wea.j, new eqe(jpc.Y), 2, false));
                    lg3VarE.a(new mg3(wea.i, new eqe(jpc.X), 2, false));
                    lg3VarE.a(new mg3(wea.h, new eqe(jpc.r), 2, false));
                    lg3VarE.a.putBoolean("memorize_keyboard", false);
                    ConfirmationBottomSheet confirmationBottomSheetE = lg3VarE.e();
                    confirmationBottomSheetE.setTargetController(addChatMembersScreen);
                    uu3 parentController = addChatMembersScreen;
                    while (parentController.getParentController() != null) {
                        parentController = parentController.getParentController();
                    }
                    foc focVar = parentController instanceof foc ? (foc) parentController : null;
                    znc zncVarT = focVar != null ? focVar.T() : null;
                    confirmationBottomSheetE.z0(addChatMembersScreen);
                    if (zncVarT != null) {
                        coc cocVar = new coc(confirmationBottomSheetE, null, null, null, false, -1);
                        wg0.l(false, cocVar, true, "BottomSheetWidget");
                        zncVarT.G(cocVar);
                        break;
                    }
                } else {
                    addChatMembersScreen.h(wea.j, null);
                    break;
                }
                break;
            case 6:
                bc7[] bc7VarArr3 = AddLinkBottomSheet.x0;
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.b;
                addLinkBottomSheet.s0(true);
                zz7 zz7Var = (zz7) addLinkBottomSheet.v0.getValue();
                String string = addLinkBottomSheet.x0().getText().toString();
                w9 w9Var = addLinkBottomSheet.s0;
                int i5 = w9Var.a;
                zz7Var.getClass();
                pnf.o(zz7Var.b, new w9(i5, w9Var.b, string));
                break;
            case 7:
                ((ia) this.b).g();
                break;
            case 8:
                ((h71) this.b).J0.e(0, false);
                break;
            case 9:
                bc7[] bc7VarArr4 = CallIndicatorWidget.X;
                CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) this.b;
                mr0.H(callIndicatorWidget.requireActivity());
                s91 s91Var = (s91) callIndicatorWidget.o.getValue();
                wr1 wr1Var = (wr1) s91Var.c;
                if (!wr1Var.r()) {
                    je1.c.P1().b(":call-active?place=".concat(""), null);
                    break;
                } else {
                    j1e j1eVar = wr1Var.k().a;
                    boolean z = j1eVar != null && j1eVar.A();
                    y21 y21Var = (y21) ((l31) s91Var.b).k.getValue();
                    je1 je1Var = je1.c;
                    Long l = y21Var.a;
                    long jLongValue = l != null ? l.longValue() : 0L;
                    CharSequence charSequence = y21Var.c;
                    String string2 = charSequence != null ? charSequence.toString() : null;
                    String str = string2 != null ? string2 : "";
                    String str2 = y21Var.d;
                    String strEncodeToString = str2 != null ? Base64.encodeToString(str2.getBytes(StandardCharsets.UTF_8), 0) : null;
                    f64 f64VarP1 = je1Var.P1();
                    StringBuilder sbJ = z7b.j(":call-incoming?chat_id=", jLongValue, "&call_name=", str);
                    sbJ.append("&call_avatar=");
                    sbJ.append(strEncodeToString);
                    sbJ.append("&video_enabled=");
                    sbJ.append(z);
                    f64VarP1.b(sbJ.toString(), null);
                    break;
                }
                break;
            case 10:
                bc7[] bc7VarArr5 = CallRateBottomSheet.I0;
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                callRateBottomSheet.B0().s(((n04) callRateBottomSheet.H0.T0(callRateBottomSheet, CallRateBottomSheet.I0[7])).getText(), false);
                break;
            case 11:
                ln1 ln1Var = ((mn1) this.b).G0;
                if (ln1Var != null) {
                    bc7[] bc7VarArr6 = CallTopPanelWidget.o;
                    pnf.o(((CallTopPanelWidget) ((o9g) ln1Var).b).n0().b.M0, oj1.D);
                    break;
                }
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                no1 no1Var = (no1) this.b;
                lo1 lo1Var = no1Var.f1;
                if (lo1Var != null) {
                    gg1 gg1Var = no1Var.i1;
                    yxc yxcVar = CallScreen.R0;
                    ((ui1) lo1Var).a.D0().v(gg1Var);
                    break;
                }
                break;
            case 13:
                ew1 ew1Var = (ew1) this.b;
                rrb rrbVar = ew1Var.a;
                if (rrbVar == null) {
                    rrbVar = null;
                }
                urb urbVar = rrbVar.o;
                urb urbVar2 = urbVar != null ? urbVar : null;
                boolean zJ = urbVar2.y0.j();
                if (!zJ) {
                    pnf.o(urbVar2.w0, krb.a);
                }
                if (zJ) {
                    boolean z2 = !ew1Var.z0;
                    ew1Var.a(z2, true);
                    if (z2 && (dw1Var = ew1Var.y0) != null) {
                        an9.g(((MediaBarWidget) dw1Var).o, wuc.CHAT_ATTACH_PICKER_CAMERA);
                        break;
                    }
                }
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                ((b02) this.b).F0.invoke();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                nd2 nd2Var = BaseBottomSheetWidget.X;
                ((ChangeDisabledDialog) this.b).s0(true);
                break;
            case 16:
                int i6 = ChatMsgSearchResultView.L0;
                ((ChatMsgSearchResultView) this.b).getClass();
                break;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr7 = ChatsListWidget.M0;
                gy2.c.P1().b(":settings/folder/members-picker?folder_id=".concat(((ChatsListWidget) this.b).b), null);
                break;
            case 18:
                ((SwitchCompat) ((xz2) this.b).R0).toggle();
                break;
            case 19:
                h33 h33Var = (h33) this.b;
                EditText editText = h33Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    h33Var.q();
                    break;
                }
                break;
            case 20:
                int i7 = ConfirmAddOpponentToCallBottomSheet.A0;
                ((ConfirmAddOpponentToCallBottomSheet) this.b).s0(true);
                break;
            case 21:
                ConfirmPhoneScreen confirmPhoneScreen = (ConfirmPhoneScreen) this.b;
                bc7[] bc7VarArr8 = ConfirmPhoneScreen.C0;
                of3 of3VarR0 = confirmPhoneScreen.r0();
                of3VarR0.C0 = null;
                of3VarR0.b.a(of3VarR0.a, ((w9a) ((kke) of3VarR0.t0.getValue())).b(), vx3.a, new kf3(of3VarR0, null));
                break;
            case 22:
                ar3 ar3Var = (ar3) this.b;
                ar3Var.F0.t();
                ar3Var.G0.a(2, 3, 2);
                break;
            case 23:
                bc7[] bc7VarArr9 = ContactsPickerScreen.v0;
                as3 as3Var = (as3) ((ContactsPickerScreen) this.b).v0().c;
                sx3 sx3Var = as3Var.d;
                as3Var.e.o1(as3Var, as3.h[0], sx3Var != null ? j47.S(sx3Var, ((w9a) ((kke) as3Var.c.getValue())).b(), vx3.b, new zr3(as3Var, null)) : null);
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((ContextMenuPopupWindow) this.b).dismiss();
                break;
            case 25:
                ((gj4) this.b).a.invoke();
                break;
            case 26:
                ((qs4) this.b).u();
                break;
            case 27:
                pnf.o(((FolderEditScreen) ((jt5) this.b)).n0().x0, ot5.a);
                break;
            case 28:
                bc7[] bc7VarArr10 = FolderEditScreen.s0;
                ((FolderEditScreen) this.b).h(oba.d, null);
                break;
            default:
                ((k56) ((x51) this.b).G0).invoke();
                break;
        }
    }

    public /* synthetic */ c5(mn1 mn1Var, View view) {
        this.a = 11;
        this.b = mn1Var;
    }
}
