package defpackage;

import android.database.Cursor;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.mediapicker.MediaPickerScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.avatars.ProfileAvatarsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class wz7 implements m56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wz7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) throws Throwable {
        boolean z;
        boolean z2;
        d3b d3bVar;
        xx6 xx6Var;
        ix8 ix8Var;
        c6c c6cVar;
        xlc xlcVar;
        int iN;
        int iN2;
        int iN3;
        int iN4;
        int iN5;
        int iN6;
        int iN7;
        int iN8;
        int iN9;
        int iN10;
        int iN11;
        int iN12;
        int iN13;
        String string;
        int i;
        int i2;
        boolean z3;
        int i3;
        boolean z4;
        String string2;
        int i4;
        String string3;
        int i5;
        int i6;
        byte[] blob;
        int i7;
        Long lValueOf;
        int i8;
        Boolean boolValueOf;
        t19 t19Var;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(!((xz7) this.b).c.contains(Integer.valueOf(((MenuItem) obj).getItemId())));
            case 1:
                bc7[] bc7VarArr = MediaKeyboardWidget.C0;
                ((cc8) ((MediaKeyboardWidget) this.b).c.getValue()).Y.m(null, new tm9());
                return e5f.a;
            case 2:
                bc7[] bc7VarArr2 = MediaPickerScreen.B0;
                ((MediaPickerScreen) this.b).getRouter().C();
                return e5f.a;
            case 3:
                return Boolean.valueOf(((wn8) ((yn8) this.b)).a.contains(Long.valueOf(((kn8) obj).a)));
            case 4:
                return Boolean.valueOf(((Collection) this.b).contains(Long.valueOf(((kn8) obj).a)));
            case 5:
                int iIntValue = ((Integer) obj).intValue();
                MembersListWidget membersListWidget = (MembersListWidget) this.b;
                int iJ = iIntValue - membersListWidget.u0.j();
                a3g a3gVar = membersListWidget.t0;
                if (a3gVar.j() < iJ || iJ < 0) {
                    return null;
                }
                return (kn8) ((ol7) a3gVar.C(iJ));
            case 6:
                uj3 uj3Var = (uj3) obj;
                mec mecVar = (mec) this.b;
                return ((jq8) mecVar.a).y(new dk2(iz7.t(uj3Var), iz7.m(((u7b) ((jq8) mecVar.a).y0.getValue()).b(uj3Var.n())), 0L));
            case 7:
                return ((jq8) this.b).y((dk2) obj);
            case 8:
                n59 n59Var = (n59) this.b;
                long jLongValue = ((Long) obj).longValue();
                String str = n59Var.A0;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, ey8.h(jLongValue, "Load around from scroll logic, time: "), null);
                }
                ((bx) n59Var.o).r(jLongValue);
                return e5f.a;
            case 9:
                bc7[] bc7VarArr3 = MessagesSettingsScreen.Y;
                ((MessagesSettingsScreen) this.b).getRouter().C();
                return e5f.a;
            case 10:
                m07 m07Var = (m07) obj;
                nob nobVar = (nob) ((na9) this.b).g.getValue();
                nobVar.getClass();
                return nobVar.a(m07Var.d, m07Var.q);
            case 11:
                int iIntValue2 = ((Integer) obj).intValue();
                m7a m7aVar = ((o7a) this.b).a;
                if (m7aVar != null) {
                    m7aVar.c(iIntValue2);
                }
                return e5f.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                qj3 qj3Var = (qj3) this.b;
                Float f = (Float) obj;
                float fFloatValue = f.floatValue();
                try {
                    qj3Var.accept(f);
                } catch (Throwable th) {
                    hm9.p("ada", "Progress consumer has failed to accept the progress (" + fFloatValue + ") of media transform", th);
                }
                return e5f.a;
            case 13:
                ((lea) this.b).w0.setText(String.valueOf((CharSequence) obj));
                return Boolean.TRUE;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Boolean.valueOf(((View) obj).getId() != ((ela) this.b).getId());
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr4 = PickChatMembers.x0;
                i3a onBackPressedDispatcher = ((PickChatMembers) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return e5f.a;
            case 16:
                syd sydVar = (syd) obj;
                sydVar.a2();
                sydVar.R1(sydVar.Z1(((swa) ((twa) this.b)).a));
                return e5f.a;
            case LangUtils.HASH_SEED /* 17 */:
                int iIntValue3 = ((Integer) obj).intValue();
                PickerChatsListWidget pickerChatsListWidget = (PickerChatsListWidget) this.b;
                hdc hdcVar = (hdc) x53.g0(pickerChatsListWidget.w0.C());
                nxa nxaVar = pickerChatsListWidget.x0;
                if (hdcVar != nxaVar) {
                    nxaVar = pickerChatsListWidget.y0;
                }
                return Boolean.valueOf((nxaVar.j() <= iIntValue3 || iIntValue3 < 0) ? false : ((Set) pickerChatsListWidget.o0().Z.a.getValue()).contains(Long.valueOf(((pxa) ((ol7) nxaVar.C(iIntValue3))).s0.a)));
            case 18:
                int iIntValue4 = ((Integer) obj).intValue();
                bc7[] bc7VarArr5 = PickerMembersListWidget.x0;
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) this.b;
                CharSequence charSequence = (CharSequence) pickerMembersListWidget.o0().u0.a.getValue();
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                    z2 = true;
                } else {
                    z2 = false;
                    z = true;
                }
                if (!(z ^ z2)) {
                    nxa nxaVar2 = pickerMembersListWidget.Y;
                    if (iIntValue4 < nxaVar2.j()) {
                        return ((pxa) ((ol7) nxaVar2.C(iIntValue4))).c;
                    }
                }
                return null;
            case 19:
                db9 db9Var = (db9) obj;
                int i9 = PinBarsWidget.t0;
                PinBarsWidget pinBarsWidget = (PinBarsWidget) this.b;
                View view = pinBarsWidget.getView();
                if (view != null) {
                    pag.F(view, mi6.CONFIRM);
                }
                xza xzaVarM0 = pinBarsWidget.m0();
                int iOrdinal = db9Var.ordinal();
                if (iOrdinal == 0) {
                    d3bVar = d3b.c;
                } else if (iOrdinal == 1) {
                    d3bVar = d3b.o;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    d3bVar = d3b.X;
                }
                xzaVarM0.w0.c(d3bVar);
                return e5f.a;
            case 20:
                ((m0b) this.b).M0.invoke();
                return e5f.a;
            case 21:
                int iIntValue5 = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                d5b d5bVar = (d5b) this.b;
                sb.append(d5bVar.e[iIntValue5]);
                sb.append(": ");
                sb.append(d5bVar.i(iIntValue5).a());
                return sb.toString();
            case 22:
                bc7[] bc7VarArr6 = ProfileAvatarsScreen.z0;
                ((ProfileAvatarsScreen) this.b).getRouter().C();
                return e5f.a;
            case 23:
                bc7[] bc7VarArr7 = ProfileChangeLinkScreen.v0;
                i3a onBackPressedDispatcher2 = ((ProfileChangeLinkScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                gfb gfbVar = (gfb) obj;
                gfbVar.P1().b(":chat-list", null);
                gfbVar.P1().b(ey8.h(((qcb) ((vcb) this.b)).b, ":start-conversation/add-subscribers?id="), null);
                return e5f.a;
            case 25:
                LinearLayout linearLayout = (LinearLayout) obj;
                bc7[] bc7VarArr8 = ProfileInviteScreen.Y;
                cla claVar = new cla(linearLayout.getContext(), 6);
                claVar.setLayoutParams(new ti3(-1, -2));
                claVar.setTitle(yea.o);
                claVar.setForm(uka.a);
                claVar.setTextShimmerEnabled(false);
                claVar.setLeftActions(new kka(new ww9(20)));
                linearLayout.addView(claVar);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), null);
                recyclerView.setLayoutParams(new ti3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), tu0.G(16 * fk4.d().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) this.b;
                recyclerView.setAdapter(profileInviteScreen.o);
                recyclerView.setItemAnimator(null);
                bi9 bi9Var = k37.a;
                bi9 bi9Var2 = new bi9(1);
                bi9Var2.g(4);
                recyclerView.j(new q1d(qp4.u0.j(recyclerView), new y98(profileInviteScreen, 23, bi9Var2), null, 12));
                float f2 = 12;
                recyclerView.j(new nz7(e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(24 * fk4.d().getDisplayMetrics().density), tu0.G(f2 * fk4.d().getDisplayMetrics().density)), e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), 0), e37.a(tu0.G(fk4.d().getDisplayMetrics().density * f2), tu0.G(fk4.d().getDisplayMetrics().density * f2), 0), 1));
                linearLayout.addView(recyclerView);
                return e5f.a;
            case 26:
                return Integer.valueOf(((s07) this.b).a);
            case 27:
                j6c j6cVar = (j6c) obj;
                t6c t6cVar = ((u6c) this.b).b;
                if (t6cVar != null) {
                    MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) t6cVar;
                    MessageModel messageModelC0 = messageContextMenuBottomSheet.C0();
                    ((n7c) messageContextMenuBottomSheet.Q0.getValue()).q().l(new g7c(j6cVar.b, messageModelC0 != null ? messageModelC0.a : 0L, messageModelC0 != null ? messageModelC0.b : 0L, messageModelC0 != null ? messageModelC0.B0 : null));
                    messageContextMenuBottomSheet.s0(true);
                    if (!tpa.f((messageModelC0 == null || (ix8Var = messageModelC0.B0) == null || (c6cVar = ix8Var.c) == null) ? null : c6cVar.b, j6cVar.b) && (xx6Var = (xx6) o19.a.getAccessor().e()) != null) {
                        xx6Var.f(Collections.singleton(new wx6(ux6.X, 1)), wuc.CHAT);
                    }
                }
                return e5f.a;
            case 28:
                alc alcVar = (alc) this.b;
                alcVar.getClass();
                return alc.c(alcVar, (Continuation) obj);
            default:
                List<Long> list = (List) obj;
                t19 t19VarD = ((vlc) this.b).d();
                t19VarD.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM messages WHERE id in (");
                int size = list.size();
                a14.c(sb2, size);
                sb2.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sb2.append("?");
                int i10 = size + 1;
                xlc xlcVarA = xlc.a(i10, sb2.toString());
                int i11 = 1;
                for (Long l : list) {
                    if (l == null) {
                        xlcVarA.W(i11);
                    } else {
                        xlcVarA.j(i11, l.longValue());
                    }
                    i11++;
                }
                t19VarD.a().getClass();
                xlcVarA.j(i10, 10);
                ilc ilcVar = t19VarD.a;
                ilcVar.b();
                Cursor cursorO = ilcVar.o(xlcVarA, null);
                try {
                    iN = tfg.n(cursorO, "id");
                    iN2 = tfg.n(cursorO, "server_id");
                    iN3 = tfg.n(cursorO, "time");
                    iN4 = tfg.n(cursorO, "update_time");
                    iN5 = tfg.n(cursorO, "sender");
                    iN6 = tfg.n(cursorO, "cid");
                    iN7 = tfg.n(cursorO, "text");
                    iN8 = tfg.n(cursorO, "delivery_status");
                    iN9 = tfg.n(cursorO, "status");
                    iN10 = tfg.n(cursorO, "time_local");
                    iN11 = tfg.n(cursorO, "error");
                    iN12 = tfg.n(cursorO, "localized_error");
                    iN13 = tfg.n(cursorO, "attaches");
                    xlcVar = xlcVarA;
                } catch (Throwable th2) {
                    th = th2;
                    xlcVar = xlcVarA;
                }
                try {
                    int iN14 = tfg.n(cursorO, "media_type");
                    int iN15 = tfg.n(cursorO, "detect_share");
                    int iN16 = tfg.n(cursorO, "msg_link_type");
                    int iN17 = tfg.n(cursorO, "msg_link_id");
                    int iN18 = tfg.n(cursorO, "inserted_from_msg_link");
                    int iN19 = tfg.n(cursorO, "msg_link_chat_id");
                    int iN20 = tfg.n(cursorO, "msg_link_chat_name");
                    int iN21 = tfg.n(cursorO, "msg_link_chat_link");
                    int iN22 = tfg.n(cursorO, "msg_link_out_chat_id");
                    int iN23 = tfg.n(cursorO, "msg_link_out_msg_id");
                    int iN24 = tfg.n(cursorO, "type");
                    int iN25 = tfg.n(cursorO, "chat_id");
                    int iN26 = tfg.n(cursorO, "ttl");
                    int iN27 = tfg.n(cursorO, "channel_views");
                    int iN28 = tfg.n(cursorO, "channel_forwards");
                    int iN29 = tfg.n(cursorO, "view_time");
                    int iN30 = tfg.n(cursorO, "zoom");
                    int iN31 = tfg.n(cursorO, "options");
                    int iN32 = tfg.n(cursorO, "live_until");
                    int iN33 = tfg.n(cursorO, "elements");
                    int iN34 = tfg.n(cursorO, "reactions");
                    int iN35 = tfg.n(cursorO, "delayed_attrs_time_to_fire");
                    int iN36 = tfg.n(cursorO, "delayed_attrs_notify_sender");
                    int i12 = iN13;
                    ArrayList arrayList = new ArrayList(cursorO.getCount());
                    while (cursorO.moveToNext()) {
                        long j = cursorO.getLong(iN);
                        long j2 = cursorO.getLong(iN2);
                        long j3 = cursorO.getLong(iN3);
                        long j4 = cursorO.getLong(iN4);
                        long j5 = cursorO.getLong(iN5);
                        long j6 = cursorO.getLong(iN6);
                        String string4 = cursorO.isNull(iN7) ? null : cursorO.getString(iN7);
                        int i13 = cursorO.getInt(iN8);
                        t19VarD.a().getClass();
                        iu8.b.getClass();
                        iu8 iu8VarN = oz7.n(i13);
                        int i14 = cursorO.getInt(iN9);
                        t19VarD.a().getClass();
                        vx8 vx8VarB = v89.b(i14);
                        long j7 = cursorO.getLong(iN10);
                        String string5 = cursorO.isNull(iN11) ? null : cursorO.getString(iN11);
                        if (cursorO.isNull(iN12)) {
                            i = i12;
                            string = null;
                        } else {
                            string = cursorO.getString(iN12);
                            i = i12;
                        }
                        byte[] blob2 = cursorO.isNull(i) ? null : cursorO.getBlob(i);
                        t19VarD.a().getClass();
                        k8g k8gVarB = iz7.b(blob2);
                        int i15 = iN12;
                        int i16 = iN14;
                        int i17 = cursorO.getInt(i16);
                        iN14 = i16;
                        int i18 = iN15;
                        if (cursorO.getInt(i18) != 0) {
                            iN15 = i18;
                            i2 = iN16;
                            z3 = true;
                        } else {
                            iN15 = i18;
                            i2 = iN16;
                            z3 = false;
                        }
                        int i19 = cursorO.getInt(i2);
                        iN16 = i2;
                        int i20 = iN17;
                        long j8 = cursorO.getLong(i20);
                        iN17 = i20;
                        int i21 = iN18;
                        if (cursorO.getInt(i21) != 0) {
                            iN18 = i21;
                            i3 = iN19;
                            z4 = true;
                        } else {
                            iN18 = i21;
                            i3 = iN19;
                            z4 = false;
                        }
                        long j9 = cursorO.getLong(i3);
                        iN19 = i3;
                        int i22 = iN20;
                        if (cursorO.isNull(i22)) {
                            iN20 = i22;
                            i4 = iN21;
                            string2 = null;
                        } else {
                            string2 = cursorO.getString(i22);
                            iN20 = i22;
                            i4 = iN21;
                        }
                        if (cursorO.isNull(i4)) {
                            iN21 = i4;
                            i5 = iN22;
                            string3 = null;
                        } else {
                            string3 = cursorO.getString(i4);
                            iN21 = i4;
                            i5 = iN22;
                        }
                        long j10 = cursorO.getLong(i5);
                        iN22 = i5;
                        int i23 = iN23;
                        long j11 = cursorO.getLong(i23);
                        iN23 = i23;
                        int i24 = iN24;
                        int i25 = cursorO.getInt(i24);
                        t19VarD.a().getClass();
                        int iA = ey8.a(i25);
                        iN24 = i24;
                        int i26 = iN25;
                        long j12 = cursorO.getLong(i26);
                        iN25 = i26;
                        int i27 = iN26;
                        int i28 = cursorO.getInt(i27);
                        iN26 = i27;
                        int i29 = iN27;
                        int i30 = cursorO.getInt(i29);
                        iN27 = i29;
                        int i31 = iN28;
                        int i32 = cursorO.getInt(i31);
                        iN28 = i31;
                        int i33 = iN29;
                        long j13 = cursorO.getLong(i33);
                        iN29 = i33;
                        int i34 = iN30;
                        int i35 = cursorO.getInt(i34);
                        iN30 = i34;
                        int i36 = iN31;
                        int i37 = cursorO.getInt(i36);
                        iN31 = i36;
                        int i38 = iN32;
                        long j14 = cursorO.getLong(i38);
                        iN32 = i38;
                        int i39 = iN33;
                        byte[] blob3 = cursorO.isNull(i39) ? null : cursorO.getBlob(i39);
                        t19VarD.a().getClass();
                        List listA = v89.a(blob3);
                        iN33 = i39;
                        int i40 = iN34;
                        if (cursorO.isNull(i40)) {
                            i6 = i40;
                            i7 = iN11;
                            blob = null;
                        } else {
                            i6 = i40;
                            blob = cursorO.getBlob(i40);
                            i7 = iN11;
                        }
                        ix8 ix8VarC = t19VarD.a().c(blob);
                        int i41 = iN35;
                        if (cursorO.isNull(i41)) {
                            i8 = iN36;
                            lValueOf = null;
                        } else {
                            lValueOf = Long.valueOf(cursorO.getLong(i41));
                            i8 = iN36;
                        }
                        Integer numValueOf = cursorO.isNull(i8) ? null : Integer.valueOf(cursorO.getInt(i8));
                        if (numValueOf == null) {
                            t19Var = t19VarD;
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(numValueOf.intValue() != 0);
                            t19Var = t19VarD;
                        }
                        arrayList.add(new ru8(j, j2, j3, j4, j5, j6, string4, iu8VarN, vx8VarB, j7, string5, string, k8gVarB, i17, z3, i19, j8, z4, j9, string2, string3, j10, j11, iA, j12, i28, i30, i32, j13, i35, i37, j14, listA, ix8VarC, lValueOf, boolValueOf));
                        iN36 = i8;
                        iN11 = i7;
                        t19VarD = t19Var;
                        iN34 = i6;
                        iN35 = i41;
                        iN12 = i15;
                        i12 = i;
                    }
                    cursorO.close();
                    xlcVar.n();
                    return arrayList;
                } catch (Throwable th3) {
                    th = th3;
                    cursorO.close();
                    xlcVar.n();
                    throw th;
                }
        }
    }

    public /* synthetic */ wz7(Widget widget, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
