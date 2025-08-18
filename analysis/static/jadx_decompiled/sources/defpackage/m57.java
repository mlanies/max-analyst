package defpackage;

import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.media.MediaMetadataRetriever;
import android.util.Patterns;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.LoginScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class m57 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ m57(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        boolean z = false;
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = InviteByPhoneScreen.B0;
                return new cn3(c57.a.getAccessor().d(y7d.class));
            case 1:
                bc7[] bc7VarArr2 = InviteByQrBottomSheet.G0;
                return new h67();
            case 2:
                bc7[] bc7VarArr3 = InviteByQrBottomSheet.G0;
                return new cn3(c57.a.getAccessor().d(y7d.class));
            case 3:
                bc7[] bc7VarArr4 = InviteFriendsToMaxBottomSheet.E0;
                return new h67();
            case 4:
                return new w67();
            case 5:
                return new mcf(0);
            case 6:
                return new mcf(0);
            case 7:
                bc7[] bc7VarArr5 = KeyboardEmojiWidget.s0;
                kc7 kc7Var = kc7.a;
                return new az4(kc7Var.getAccessor().d(gj.class), (ji) kc7Var.getAccessor().c(ji.class), new y8((cz4) kc7Var.getAccessor().c(cz4.class)), (kke) kc7Var.getAccessor().c(kke.class), (x9c) kc7Var.getAccessor().d(x9c.class).getValue());
            case 8:
                bc7[] bc7VarArr6 = KeyboardStickersWidget.t0;
                kc7 kc7Var2 = kc7.a;
                return new bod(kc7Var2.getAccessor().d(o2e.class), kc7Var2.getAccessor().d(b6e.class));
            case 9:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(fk4.d().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
            case 10:
                return ((k24) ((c34) jyc.a.getAccessor().c(c34.class))).g;
            case 11:
                return bcf.a.c();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                int i = LinkInterceptorWidget.o;
                return (wj7) y8a.a.getAccessor().c(wj7.class);
            case 13:
                return Patterns.WEB_URL;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Patterns.WEB_URL;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new MediaMetadataRetriever();
            case 16:
                lt7 lt7Var = lt7.a;
                return new hu7(lt7Var.getAccessor().d(e5a.class), lt7Var.getAccessor().d(q33.class), lt7Var.getAccessor().d(f5a.class), lt7Var.getAccessor().d(u0b.class), lt7Var.getAccessor().d(cu7.class), lt7Var.getAccessor().d(xt7.class), lt7Var.getAccessor().d(ds3.class));
            case LangUtils.HASH_SEED /* 17 */:
                lt7 lt7Var2 = lt7.a;
                return new i80(lt7Var2.getAccessor().d(ad.class), lt7Var2.getAccessor().d(e5a.class));
            case 18:
                lt7 lt7Var3 = lt7.a;
                return new f80(lt7Var3.getAccessor().d(ad.class), lt7Var3.getAccessor().d(e5a.class));
            case 19:
                return new b80(lt7.a.getAccessor().d(e5a.class));
            case 20:
                bc7[] bc7VarArr7 = LoginScreen.c;
                return new iu7(lt7.a.getAccessor().d(eua.class));
            case 21:
                return new xa5(150L);
            case 22:
                return new xa5(150L);
            case 23:
                bc7[] bc7VarArr8 = LogsViewerScreen.Y;
                tu7 tu7Var = tu7.a;
                return new mv7((uca) tu7Var.getAccessor().c(uca.class), (kke) tu7Var.getAccessor().c(kke.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                bc7[] bc7VarArr9 = w38.K0;
                return e5f.a;
            case 25:
                bc7[] bc7VarArr10 = MediaBarPermissionWidget.Z;
                return new l48();
            case 26:
                bc7[] bc7VarArr11 = MediaBarWidget.d1;
                to2 to2Var = to2.a;
                return new urb(new djb((uuc) to2Var.getAccessor().c(uuc.class), ((w9a) to2Var.getDispatchers()).b(), z, 3), new trc((uuc) to2Var.getAccessor().c(uuc.class), ((w9a) to2Var.getDispatchers()).b()), (xp7) to2Var.getAccessor().c(xp7.class), (zi5) to2Var.getAccessor().c(zi5.class), (uuc) to2Var.getAccessor().c(uuc.class), (af8) to2Var.getAccessor().c(af8.class), to2Var.getDispatchers());
            case 27:
                bc7[] bc7VarArr12 = MediaBarWidget.d1;
                return new bm8();
            case 28:
                bc7[] bc7VarArr13 = MediaBarWidget.d1;
                return new q3d((hq7) to2.a.getAccessor().c(hq7.class), new e3d(false, true));
            default:
                return new Matrix();
        }
    }
}
