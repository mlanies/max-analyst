package defpackage;

import android.content.Context;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.dialogs.share.media.ChatMediaDownloadBottomSheet;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class m52 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ m52(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatAdminsScreen.w0;
                return Long.valueOf(((hyc) ((q33) xcb.a.d().getValue())).t());
            case 1:
                return new dh4(xcb.a.getAccessor().d(pk.class));
            case 2:
                neb nebVar = neb.a;
                return new a03(nebVar.getAccessor().d(qea.class), nebVar.getAccessor().d(o45.class));
            case 3:
                return (dfb) neb.a.getAccessor().c(dfb.class);
            case 4:
                return new mge(0);
            case 5:
                return new mge(0);
            case 6:
                return new mg3(wea.y, new eqe(yea.X), 3, false);
            case 7:
                return new tt3(wea.d0, new eqe(yea.v1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 8:
                return new tt3(wea.Z, new eqe(yea.D1), Integer.valueOf(woc.l1), (Integer) null, 20);
            case 9:
                return new mge(0);
            case 10:
                return new mge(0);
            case 11:
                bc7[] bc7VarArr2 = ChatMediaDownloadBottomSheet.E0;
                rkd rkdVar = rkd.a;
                return new ye2(rkdVar.getAccessor().d(r79.class), rkdVar.getAccessor().d(dfe.class), rkdVar.getAccessor().d(pk.class), rkdVar.getAccessor().d(zi5.class), rkdVar.getAccessor().d(af8.class), (Context) rkdVar.getAccessor().c(Context.class), (kke) rkdVar.getAccessor().c(kke.class), new qrc((uuc) rkdVar.getAccessor().c(uuc.class), ((w9a) ((kke) rkdVar.getAccessor().c(kke.class))).b(), (qra) rkdVar.getAccessor().c(qra.class)));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return xcb.a.h();
            case 13:
                return new fe2();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = ChatMediaViewerScreen.K0;
                return wuc.CHAT_MEDIA_VIEWER;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new tt3(wea.t0, new eqe(yea.Y1), Integer.valueOf(wfa.W), Integer.valueOf(woc.q), Integer.valueOf(wfa.Q));
            case 16:
                return new tt3(wea.s0, new eqe(yea.X1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case LangUtils.HASH_SEED /* 17 */:
                return new tt3(wea.r0, new eqe(yea.W1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 18:
                return new tt3(wea.q0, new eqe(yea.V1), Integer.valueOf(wfa.U), Integer.valueOf(woc.w), Integer.valueOf(wfa.P));
            case 19:
                bc7[] bc7VarArr4 = ChatMembersScreen.u0;
                return wuc.CHAT_INFO_ALL_PARTICIPANTS;
            case 20:
                return new eh4(xcb.a.getAccessor().d(pk.class));
            case 21:
                bc7[] bc7VarArr5 = ChatNotificationsSettingsScreen.Y;
                return new im2();
            case 22:
                return new eh4(xcb.a.getAccessor().d(pk.class));
            case 23:
                return xcb.a.getAccessor().d(xb9.class);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new zcb();
            case 25:
                return new gcb();
            case 26:
                bc7[] bc7VarArr6 = ChatScreen.k1;
                return new g39();
            case 27:
                bc7[] bc7VarArr7 = ChatScreen.k1;
                return new zz7();
            case 28:
                bc7[] bc7VarArr8 = ChatScreen.k1;
                return new cc8((wc7) to2.a.getAccessor().c(wc7.class), 7);
            default:
                bc7[] bc7VarArr9 = ChatScreen.k1;
                return to2.a.c();
        }
    }
}
