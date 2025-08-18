package defpackage;

import android.graphics.Paint;
import android.os.Looper;
import android.text.TextPaint;
import java.util.WeakHashMap;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.login.inputphone.InputPhoneScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class fh5 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ fh5(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                return new gqd(true);
            case 1:
                bc7[] bc7VarArr = mh5.f;
                return zd6.a;
            case 2:
                return new Paint(1);
            case 3:
                return new ix3(fk4.d().getDisplayMetrics().density * 12.0f);
            case 4:
                return new WeakHashMap(1);
            case 5:
                bc7[] bc7VarArr2 = FoldersListScreen.Z;
                return wuc.SETTINGS_FOLDERS;
            case 6:
                bc7[] bc7VarArr3 = FoldersListScreen.Z;
                return new iw5();
            case 7:
                bc7[] bc7VarArr4 = ForwardPickerScreen.I0;
                return wuc.CHAT_FORWARD;
            case 8:
                bc7[] bc7VarArr5 = ForwardPickerScreen.I0;
                return e5fVar;
            case 9:
                bc7[] bc7VarArr6 = ForwardPickerScreen.I0;
                return new cc8(null, 15);
            case 10:
                return e5fVar;
            case 11:
                return Looper.getMainLooper().getThread();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new qec("width=\"(\\d+)", 0);
            case 13:
                return new qec("height=\"(\\d+)", 0);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new TextPaint();
            case 16:
                bc7[] bc7VarArr7 = bu6.J0;
                return e5fVar;
            case LangUtils.HASH_SEED /* 17 */:
                return new pu6();
            case 18:
                return new gqd(false);
            case 19:
                return new gqd(true);
            case 20:
                bc7[] bc7VarArr8 = InputNameScreen.B0;
                return wuc.AUTH_EMPTY_PROFILE;
            case 21:
                bc7[] bc7VarArr9 = InputPhoneScreen.E0;
                return wuc.AUTH_PHONE_LOGIN;
            case 22:
                bc7[] bc7VarArr10 = InputPhoneScreen.E0;
                lt7 lt7Var = lt7.a;
                lt7Var.getClass();
                return new q27(new khe(new m57(17)), lt7Var.getAccessor().d(kke.class), lt7Var.getAccessor().d(gh3.class));
            case 23:
                return new byte[]{72, 84, 84, 80, 47, 49, 46, 49, 32, 50, 48, 52, 32, 78, 111, 32, 67, 111, 110, 116, 101, 110, 116};
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new gqd(false);
            case 25:
                return new gqd(true);
            case 26:
                return new gqd(false);
            case 27:
                return new gqd(true);
            case 28:
                bc7[] bc7VarArr11 = InviteByPhoneScreen.B0;
                return wuc.CONTACTS_SEARCH_BY_PHONE;
            default:
                bc7[] bc7VarArr12 = InviteByPhoneScreen.B0;
                return new c67();
        }
    }
}
