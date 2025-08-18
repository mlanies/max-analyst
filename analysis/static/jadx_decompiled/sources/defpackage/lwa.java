package defpackage;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.media.AudioManager;
import androidx.recyclerview.widget.RecyclerView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.avatars.ProfileAvatarWidget;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.settings.SettingsListScreen;
import one.me.startconversation.StartConversationScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import org.webrtc.MediaStreamTrack;
import ru.ok.messages.services.PipWorker;
import ru.ok.onechat.reactions.ReactionsViewModel;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class lwa implements k56 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lwa(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        MessageContextMenuBottomSheet messageContextMenuBottomSheet;
        u6c u6cVar;
        z5b callback;
        String strValueOf;
        int i = 8;
        int i2 = 4;
        int i3 = 5;
        pq9 pq9Var = qp4.u0;
        int i4 = 2;
        e5f e5fVar = e5f.a;
        boolean z = false;
        iC = 0;
        int iC = 0;
        z = false;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = PickChatMembers.x0;
                int i5 = vc7.a;
                if (vc7.b(vc7.c)) {
                    mr0.G((PickChatMembers) obj);
                }
                return e5fVar;
            case 1:
                int i6 = PinBarsWidget.t0;
                n0b.c.P1().b(":call-join-link?link=".concat(((ch6) obj).a), null);
                return e5fVar;
            case 2:
                if (((jg3) obj).getState() != gg3.ERROR) {
                    int i7 = vc7.a;
                    if (vc7.b(vc7.c)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 3:
                ((PipWorker) obj).getApplicationContext();
                return ((y8a) vl.b()).k().u0;
            case 4:
                bc7[] bc7VarArr2 = ProfileAvatarWidget.X;
                return pq9Var.o(((ProfileAvatarWidget) obj).getContext()).c;
            case 5:
                bc7[] bc7VarArr3 = ProfileChangeLinkScreen.v0;
                ProfileChangeLinkScreen profileChangeLinkScreen = (ProfileChangeLinkScreen) obj;
                profileChangeLinkScreen.getClass();
                bc7 bc7Var = ProfileChangeLinkScreen.v0[1];
                int iOrdinal = ((reb) profileChangeLinkScreen.b.a(profileChangeLinkScreen)).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    return wuc.CHAT_LINK_EDITING;
                }
                if (iOrdinal == 2) {
                    return wuc.SETTINGS_SHORTNAME_CHANGE;
                }
                throw new NoWhenBranchMatchedException();
            case 6:
                feb febVarO0 = ((ProfileEditAdminPermissionsWidget) ((mdb) ((jv5) obj).Y)).o0();
                febVarO0.getClass();
                int i8 = vea.Z0;
                uj3 uj3VarT = febVarO0.t();
                String strD = uj3VarT != null ? uj3VarT.d() : null;
                if (strD == null) {
                    strD = "";
                }
                pnf.o(febVarO0.C0, new jdb(new gqe(i8, ys.m0(new Object[]{strD})), null, y53.M(new mg3(sea.K, new eqe(vea.Y0), 1, false), new mg3(sea.J, new eqe(vea.X0), 2, false))));
                return e5fVar;
            case 7:
                return new AtomicReference(((hyc) ((q33) ((xs2) obj).a.getValue())).g.getString("app.pushProxyList", null));
            case 8:
                float[] fArr = new float[8];
                for (int i9 = 0; i9 < 8; i9++) {
                    fArr[i9] = fk4.d().getDisplayMetrics().density * 4.0f;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, null, null));
                bsb bsbVar = (bsb) obj;
                ngg.G(shapeDrawable, pq9Var.j(bsbVar).b().e);
                int i10 = woc.i1;
                bs6 icon = pq9Var.j(bsbVar).getIcon();
                Drawable drawableB = kt3.b(bsbVar.getContext(), i10);
                ngg.G(drawableB, icon.b);
                LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, drawableB});
                int iG = tu0.G(bsbVar.a * fk4.d().getDisplayMetrics().density);
                layerDrawable.setLayerSize(0, iG, iG);
                int iG2 = tu0.G(24 * fk4.d().getDisplayMetrics().density);
                layerDrawable.setLayerSize(1, iG2, iG2);
                int i11 = (iG / 2) - (iG2 / 2);
                layerDrawable.setLayerInset(1, i11, i11, 0, 0);
                return layerDrawable;
            case 9:
                ((k56) ((j6e) obj).s0).invoke();
                return e5fVar;
            case 10:
                t6c t6cVar = ((u6c) obj).b;
                if (t6cVar != null && (u6cVar = (messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) t6cVar).P0) != null) {
                    ReactionsViewModel reactionsViewModelQ = ((n7c) messageContextMenuBottomSheet.Q0.getValue()).q();
                    MessageModel messageModelC0 = messageContextMenuBottomSheet.C0();
                    kl7 kl7VarJ = reactionsViewModelQ.j(messageModelC0 != null ? messageModelC0.B0 : null, false);
                    int measuredHeight = messageContextMenuBottomSheet.requireView().getMeasuredHeight();
                    f6b f6bVar = messageContextMenuBottomSheet.a;
                    if (f6bVar != null && (callback = f6bVar.getCallback()) != null) {
                        iC = callback.c();
                    }
                    u6cVar.a(kl7VarJ, (measuredHeight - iC) - messageContextMenuBottomSheet.Y0);
                    RecyclerView recyclerView = u6cVar.d;
                    pag.F(recyclerView, mi6.KEYBOARD_TAP);
                    pla.a(recyclerView, new q57(12, recyclerView, messageContextMenuBottomSheet));
                }
                return e5fVar;
            case 11:
                o19 o19Var = o19.a;
                iy2 iy2Var = (iy2) o19Var.getAccessor().c(iy2.class);
                khe kheVar = new khe(new lab(27));
                y7d y7dVar = (y7d) o19Var.getAccessor().c(y7d.class);
                av0 av0Var = (av0) o19Var.getAccessor().c(av0.class);
                l6c l6cVar = (l6c) o19Var.getAccessor().c(l6c.class);
                khe kheVarD = o19Var.getAccessor().d(p94.class);
                khe kheVarD2 = o19Var.getAccessor().d(pk.class);
                khe kheVarD3 = o19Var.getAccessor().d(ky1.class);
                khe kheVarD4 = o19Var.getAccessor().d(r5d.class);
                khe kheVarD5 = o19Var.getAccessor().d(gme.class);
                khe kheVarD6 = o19Var.getAccessor().d(ec6.class);
                o19Var.getAccessor().d(oz7.class);
                return new ReactionsViewModel(((n7c) obj).b, iy2Var, y7dVar, av0Var, l6cVar, kheVar, kheVarD, kheVarD2, kheVarD3, kheVarD4, kheVarD5, kheVarD6, o19Var.getAccessor().d(jx8.class), o19Var.getAccessor().d(gj.class));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return (AudioManager) ((Context) ((cbc) obj).Y.getValue()).getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            case 13:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(pq9Var.o(((mcc) obj).a).c.f().a);
                return shapeDrawable2;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((OneMeRoomDatabase) ((jlc) ((glc) obj).b).m()).x();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                jlc jlcVar = (jlc) obj;
                hlc hlcVarU = fp3.u(jlcVar.a, jlcVar.c, jlcVar.b);
                pfa pfaVar = (pfa) jlcVar;
                hlcVarU.a((da9[]) Arrays.copyOf(new da9[]{new fa9(pfaVar.Z, pfaVar.s0), new ea9(i2, i3, 10), new ea9(7, i, 11), new ea9()}, 4));
                iba ibaVar = jlcVar.o;
                hlcVarU.g = ibaVar.a();
                hlcVarU.h = ibaVar.c();
                for (Object obj2 : jlcVar.X) {
                    hlcVarU.e.add(obj2);
                }
                hlcVarU.d.add(new m23(1));
                return hlcVarU.b();
            case 16:
                return ((OneMeRoomDatabase) ((vlc) obj).a.m()).F();
            case LangUtils.HASH_SEED /* 17 */:
                return ((OneMeRoomDatabase) ((wlc) obj).a.m()).J();
            case 18:
                return ((OneMeRoomDatabase) ((hmc) obj).b.m()).Q();
            case 19:
                return ((OneMeRoomDatabase) ((jlc) ((imc) obj).b).m()).S();
            case 20:
                return ((OneMeRoomDatabase) ((jmc) obj).a.m()).T();
            case 21:
                return knc.w((knc) obj);
            case 22:
                bc7[] bc7VarArr4 = ScheduledSendPickerViewModel.p;
                String string = ((Application) obj).getString(dpc.u);
                if (string.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    char cCharAt = string.charAt(0);
                    if (Character.isLowerCase(cCharAt)) {
                        strValueOf = String.valueOf(cCharAt).toUpperCase(Locale.getDefault());
                        if (strValueOf.length() > 1) {
                            if (cCharAt != 329) {
                                strValueOf = strValueOf.charAt(0) + strValueOf.substring(1).toLowerCase(Locale.ROOT);
                            }
                        } else if (strValueOf.equals(String.valueOf(cCharAt).toUpperCase(Locale.ROOT))) {
                            strValueOf = String.valueOf(Character.toTitleCase(cCharAt));
                        }
                    } else {
                        strValueOf = String.valueOf(cCharAt);
                    }
                    sb.append((Object) strValueOf);
                    sb.append(string.substring(1));
                    string = sb.toString();
                }
                return new nb6(string);
            case 23:
                nb6 nb6Var = (nb6) ((ScheduledSendPickerViewModel) obj).g.getValue();
                Calendar calendar = Calendar.getInstance();
                Locale locale = Locale.getDefault();
                nb6Var.getClass();
                x34 x34Var = new x34(calendar.get(5), calendar.get(2), calendar.get(1), 0L, nb6Var.a);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("d MMMM", locale);
                ArrayList arrayList = new ArrayList(366);
                arrayList.add(x34Var);
                while (true) {
                    calendar.add(5, 1);
                    long size = arrayList.size();
                    int i12 = calendar.get(1);
                    int i13 = calendar.get(5);
                    int i14 = calendar.get(i4);
                    x34 x34Var2 = new x34(i13, i14, i12, size, simpleDateFormat.format(calendar.getTime()));
                    if (i13 == x34Var.b && i14 == x34Var.c) {
                        return arrayList;
                    }
                    arrayList.add(x34Var2);
                    i4 = 2;
                }
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (du4) ((zaa) ((v5d) obj).e.getValue()).a.getValue();
            case 25:
                w5d w5dVar = new w5d(((y5d) obj).a.getContext());
                w5dVar.setId(mda.O);
                w5dVar.setWillNotDraw(false);
                return w5dVar;
            case 26:
                t6d t6dVar = (t6d) obj;
                return Integer.valueOf(nu0.r(t6dVar, t6dVar.k));
            case 27:
                bc7[] bc7VarArr5 = SettingsListScreen.B0;
                return new wha((SettingsListScreen) obj);
            case 28:
                jrd jrdVar = (jrd) obj;
                return new dkf(jrdVar.a, jrdVar.b, jrdVar.c, jrdVar.d, jrdVar.e);
            default:
                bc7[] bc7VarArr6 = StartConversationScreen.I0;
                bc7 bc7Var2 = bc7VarArr6[0];
                StartConversationScreen startConversationScreen = (StartConversationScreen) obj;
                if (((Boolean) startConversationScreen.c.a(startConversationScreen)).booleanValue()) {
                    ((RecyclerView) startConversationScreen.u0.T0(startConversationScreen, bc7VarArr6[3])).x0(0);
                    bc7 bc7Var3 = bc7VarArr6[0];
                    startConversationScreen.c.b(startConversationScreen, Boolean.FALSE);
                }
                return e5fVar;
        }
    }
}
