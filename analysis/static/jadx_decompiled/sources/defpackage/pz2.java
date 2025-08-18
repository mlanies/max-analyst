package defpackage;

import java.util.Collection;
import java.util.Map;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.DevMenuScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class pz2 implements m56 {
    public final /* synthetic */ int a;

    public /* synthetic */ pz2(int i) {
        this.a = i;
    }

    @Override // defpackage.m56
    public final Object invoke(Object obj) {
        c7a c7aVar = c7a.c;
        z6a z6aVar = z6a.o;
        b7a b7aVar = b7a.a;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = ChatsTabWidget.C0;
                gy2.c.P1().b(":start-conversation", null);
                return e5fVar;
            case 1:
                ((Integer) obj).getClass();
                return Boolean.TRUE;
            case 2:
                bc7[] bc7VarArr2 = e53.k;
                return e5fVar;
            case 3:
                hm9.p("OneMeExecutors", "hanged threads", new ThreadExecutorStuckException((Collection) obj));
                return e5fVar;
            case 4:
                hm9.p("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj));
                return e5fVar;
            case 5:
                return ote.s(((TamErrorException) obj).a);
            case 6:
                fka fkaVar = (fka) obj;
                fkaVar.getIcon();
                return new dcf(-1, fkaVar.getIcon().k);
            case 7:
                return Boolean.valueOf(((vj3) obj) == vj3.o);
            case 8:
                return Boolean.valueOf(((vj3) obj) == vj3.a);
            case 9:
                yq3 yq3Var = (yq3) obj;
                return Boolean.valueOf(yq3Var.b || yq3Var.a == 7);
            case 10:
                return Boolean.valueOf(((yq3) obj).b);
            case 11:
                ((Boolean) obj).getClass();
                return e5fVar;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                jx3 jx3Var = (jx3) obj;
                if (jx3Var instanceof nx3) {
                    return (nx3) jx3Var;
                }
                return null;
            case 13:
                int i = DevMenuScreen.u0;
                hi4.c.P1().d();
                return e5fVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = DialogNotificationsSettingsScreen.Y;
                sv9.c.P1().d();
                return e5fVar;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Boolean.valueOf(((nu8) obj).c == mu8.Y);
            case 16:
                Map map = ((nu8) obj).f;
                Object obj2 = map != null ? map.get("url") : null;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                return null;
            case LangUtils.HASH_SEED /* 17 */:
                return obj;
            case 18:
                mr0.X(zr6.h(m55.v0.getAndIncrement(), "service-watchdog-"), new i55((Runnable) obj, 0));
                return e5fVar;
            case 19:
                return Boolean.valueOf(((je5) obj).f != 0);
            case 20:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case 21:
                return obj;
            case 22:
                return Boolean.valueOf(!(((vk6) obj) instanceof uk6));
            case 23:
                return Long.valueOf(((vk6) obj).getA());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return String.valueOf(((v8c) obj).a);
            case 25:
                izc izcVar = (izc) obj;
                return izcVar.getItemId() + "/" + z7b.k(izcVar.a);
            case 26:
                return String.valueOf(((nn3) obj).a);
            case 27:
                OneMeButton oneMeButton = (OneMeButton) obj;
                bc7[] bc7VarArr4 = InputNameScreen.B0;
                oneMeButton.setText(v0c.oneme_login_input_name_continue_button_disabled);
                oneMeButton.setMode(b7aVar);
                oneMeButton.setAppearance(z6aVar);
                oneMeButton.setSize(c7aVar);
                oneMeButton.setEnabled(false);
                return e5fVar;
            case 28:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                bc7[] bc7VarArr5 = InputNameScreen.B0;
                oneMeButton2.setId(hwb.oneme_login_input_name_continue_btn);
                oneMeButton2.setText(v0c.oneme_login_input_name_continue_button_active);
                oneMeButton2.setMode(b7aVar);
                oneMeButton2.setAppearance(z6aVar);
                oneMeButton2.setSize(c7aVar);
                oneMeButton2.setEnabled(true);
                return e5fVar;
            default:
                return ote.s(((TamErrorException) obj).a);
        }
    }
}
