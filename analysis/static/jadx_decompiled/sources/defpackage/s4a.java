package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.animation.LinearInterpolator;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.android.OneMeApplication;
import one.me.calls.ui.ui.pip.PipScreen;
import one.me.chats.picker.chats.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.startconversation.channel.PickSubscribersScreen;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class s4a implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ s4a(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                int i = OneMeApplication.s0;
                gj gjVar = (gj) y8a.a.getAccessor().c(gj.class);
                gjVar.k.o1(gjVar, gj.p[0], j47.T(gjVar.j, null, vx3.b, new ej(gjVar, null), 1));
                return e5fVar;
            case 1:
                return new y5a("", "", 2, x5a.p, null, null);
            case 2:
                return e9f.c(woc.T1).toString();
            case 3:
                jd4 jd4Var = ql4.a;
                return MainDispatcherLoader.dispatcher;
            case 4:
                return new eaa(999, yoc.u0, Integer.valueOf(woc.y0), "NARNIA");
            case 5:
                je7 je7VarR = tu0.r(3, new xid(26));
                je7 je7VarR2 = tu0.r(3, new xid(27));
                return new yge((GradientDrawable) je7VarR2.getValue(), (GradientDrawable) je7VarR.getValue(), (GradientDrawable) je7VarR2.getValue(), (GradientDrawable) je7VarR.getValue());
            case 6:
                return new yge((GradientDrawable) tu0.r(3, new xid(23)).getValue(), (GradientDrawable) tu0.r(3, new xid(22)).getValue(), (GradientDrawable) tu0.r(3, new xid(24)).getValue(), (GradientDrawable) tu0.r(3, new xid(25)).getValue());
            case 7:
                return new xja(tu0.G(3 * fk4.d().getDisplayMetrics().density), fk4.d().getDisplayMetrics().density * 4.0f);
            case 8:
                return new vpe();
            case 9:
                return new LinearInterpolator();
            case 10:
                return new LinearInterpolator();
            case 11:
                j5c j5cVar = new j5c();
                j5cVar.a = new ThreadLocal();
                j5cVar.b = new ThreadLocal();
                return j5cVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr = OtherNotificationsSettingsScreen.Y;
                return new ina();
            case 13:
                bc7[] bc7VarArr2 = PickChatMembers.x0;
                return wuc.CREATE_CHAT_MEMBERS_PICKER;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = PickSubscribersScreen.z0;
                return nyd.a.b();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new gqd(false);
            case 16:
                return new gqd(true);
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr4 = PickerChatsListWidget.C0;
                return Boolean.FALSE;
            case 18:
                bc7[] bc7VarArr5 = PickerChatsListWidget.C0;
                ys2 ys2Var = ys2.a;
                return new tya(ys2Var.getAccessor().d(q33.class), ys2Var.getAccessor().d(w7b.class), ys2Var.getAccessor().d(u7b.class));
            case 19:
                bc7[] bc7VarArr6 = PickerChatsTabWidget.y0;
                je7 je7Var = iyc.a;
                jyc jycVar = jyc.a;
                return new mya((nba) ys2.a.getAccessor().c(nba.class), jycVar.s(), (rba) jycVar.getAccessor().c(rba.class));
            case 20:
                bc7[] bc7VarArr7 = PickerContactsListWidget.y0;
                ys2 ys2Var2 = ys2.a;
                return new dza((qn3) ys2Var2.getAccessor().c(qn3.class), ys2Var2.getAccessor().d(kke.class), ys2Var2.getAccessor().d(b0d.class));
            case 21:
                bc7[] bc7VarArr8 = PickerContactsListWidget.y0;
                return new bh0(dh0.a.getAccessor().d(os3.class), true, null, 46);
            case 22:
                int i2 = PinBarsWidget.t0;
                return new wza(null, null, 1);
            case 23:
                int i3 = m0b.N0;
                return e5fVar;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i4 = vc7.a;
                return Boolean.valueOf(vc7.b(vc7.c));
            case 25:
                return new ugf(n31.a.getAccessor().d(kr1.class));
            case 26:
                bc7[] bc7VarArr9 = PipScreen.o;
                return tnd.a;
            case 27:
                return PmsKey.keys_delegate$lambda$1();
            case 28:
                int i5 = f6b.w0;
                return e5fVar;
            default:
                return new mv0(xcb.a.d());
        }
    }
}
