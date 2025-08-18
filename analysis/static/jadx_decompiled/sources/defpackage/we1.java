package defpackage;

import android.widget.EditText;
import java.util.Collections;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chatscreen.ChatScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class we1 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ we1(int i) {
        this.a = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 1:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 2:
                return Long.valueOf(Long.MAX_VALUE - ((ve1) obj).Z);
            case 3:
                bc7[] bc7VarArr = CallOpponentsListWidget.H0;
                ((EditText) obj).getText().clear();
                return e5fVar;
            case 4:
                return Integer.valueOf(((fka) obj).getIcon().e);
            case 5:
                fka fkaVar = (fka) obj;
                fkaVar.getIcon();
                return new dcf(-1, fkaVar.getIcon().k);
            case 6:
                ((Long) obj).getClass();
                bc7[] bc7VarArr2 = ChangeOwnerScreen.u0;
                return nz4.a;
            case 7:
                return Integer.valueOf(((fka) obj).getIcon().j);
            case 8:
                fka fkaVar2 = (fka) obj;
                fkaVar2.getIcon();
                return new dcf(-1, fkaVar2.getIcon().k);
            case 9:
                return ((fs8) obj).a(true, false);
            case 10:
                return Integer.valueOf(((fka) obj).getText().h);
            case 11:
                return Integer.valueOf(((fka) obj).getText().h);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new dcf(0, ((fka) obj).getIcon().a.e);
            case 13:
                return Integer.valueOf(((fka) obj).getText().h);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Integer.valueOf(((fka) obj).getIcon().j);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Integer.valueOf(((fka) obj).getText().h);
            case 16:
                return Integer.valueOf(((fka) obj).getText().g);
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr3 = ChatMediaTabWidget.w0;
                ckb.c.f2();
                return e5fVar;
            case 18:
                u82 u82Var = (u82) obj;
                x82 x82Var = u82Var.r;
                if (x82Var == null) {
                    x82Var = x82.g;
                }
                w82 w82VarA = x82Var.a();
                w82VarA.c = 0L;
                u82Var.r = w82VarA.a();
                return e5fVar;
            case 19:
                rw8 rw8Var = (rw8) obj;
                return "p_id=" + rw8Var.a + ",m_id=" + rw8Var.e + ",sender=" + rw8Var.g;
            case 20:
                rw8 rw8Var2 = (rw8) obj;
                return new sx9(rw8Var2.c, rw8Var2.e, rw8Var2.i, ks4.DO_NOT_DISTURB_MODE);
            case 21:
                bc7[] bc7VarArr4 = ChatNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5fVar;
            case 22:
                fka fkaVar3 = (fka) obj;
                bc7[] bc7VarArr5 = ChatScreen.k1;
                fkaVar3.a().s().c.getClass();
                return new dcf(-1, fkaVar3.a().s().c.a);
            case 23:
                return pag.x((String) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return Boolean.valueOf(((nl2) obj).B0 == 0);
            case 25:
                e52 e52Var = (e52) obj;
                k92 k92Var = e52Var.b;
                if ((k92Var.b != j92.c && k92Var.a == 0 && k92Var.j == 0 && k92Var.f0 == null) || e52Var.F() || (k92Var.H.g && e52Var.c == null)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 26:
                bc7[] bc7VarArr6 = ChatsListSearchScreen.J0;
                return e5fVar;
            case 27:
                izc izcVar = (izc) obj;
                return izcVar.getItemId() + "/" + z7b.k(izcVar.a);
            case 28:
                return ((nl2) obj).C0;
            default:
                return Boolean.valueOf(((e52) obj).N());
        }
    }
}
