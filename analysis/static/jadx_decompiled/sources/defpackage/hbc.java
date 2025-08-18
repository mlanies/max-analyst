package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RenderNode;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.server.ServerHostBottomSheet;
import one.me.devmenu.server.ServerPortBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsListScreen;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class hbc implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ hbc(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        switch (this.a) {
            case 0:
                bc7[] bc7VarArr = RecordControlsWidget.b1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
            case 1:
                bc7[] bc7VarArr2 = RecordControlsWidget.b1;
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(1);
                return gradientDrawable2;
            case 2:
                bc7[] bc7VarArr3 = RecordControlsWidget.b1;
                return new wb5();
            case 3:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(704595023);
                return shapeDrawable;
            case 4:
                return new RenderNode("blur");
            case 5:
                return new wh1(kkc.END.a, kkc.INCOMING.a, kkc.BEEP.a, kkc.CONNECTING.a, kkc.CONNECTED.a, kkc.BUSY.a);
            case 6:
                float fC = fk4.c() * 24.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
            case 7:
                return new ShapeDrawable(new OvalShape());
            case 8:
                return new mtc();
            case 9:
                bc7[] bc7VarArr4 = ScheduledSendPickerViewModel.p;
                return ngg.w(0);
            case 10:
                bc7[] bc7VarArr5 = ScheduledSendPickerViewModel.p;
                return ngg.A(0);
            case 11:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1L));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = rwc.x0;
                return e5f.a;
            case 13:
                return Pattern.compile("^([0-9]+)X([0-9]+)");
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new mib(yea.H, null, 6);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr6 = ServerHostBottomSheet.G0;
                return new oo6();
            case 16:
                bc7[] bc7VarArr7 = ServerPortBottomSheet.B0;
                return new l6b();
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr8 = SettingMediaScreen.Y;
                return wuc.SETTINGS_MEDIA;
            case 18:
                bc7[] bc7VarArr9 = SettingMediaScreen.Y;
                mgd mgdVar = mgd.a;
                return new ndd(mgdVar.getAccessor().d(kke.class), mgdVar.getAccessor().d(kxc.class), mgdVar.getAccessor().d(rj.class));
            case 19:
                bc7[] bc7VarArr10 = SettingsBlacklistScreen.Z;
                ehd ehdVar = ehd.a;
                return new ped(new ep0(ehdVar.getAccessor().d(av0.class), ehdVar.b()));
            case 20:
                return new Matrix();
            case 21:
                return Collections.singletonList(hcd.DEV_MENU);
            case 22:
                return Collections.singletonList(hcd.APPEARANCE);
            case 23:
                return Collections.singletonList(hcd.ESIA_CONNECT);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return Collections.singletonList(hcd.INVITE_FRIENDS);
            case 25:
                return y53.M(hcd.NOTIFICATIONS, hcd.PRIVACY, hcd.MESSAGES, hcd.SAVED_MESSAGES, hcd.FOLDERS);
            case 26:
                kl7 kl7VarL = j1e.l();
                kl7VarL.add(hcd.SUPPORT);
                kl7VarL.add(hcd.ABOUT);
                return j1e.d(kl7VarL);
            case 27:
                kl7 kl7VarL2 = j1e.l();
                kl7VarL2.add(hcd.BATTERY);
                kl7VarL2.add(hcd.STORAGE);
                return j1e.d(kl7VarL2);
            case 28:
                bc7[] bc7VarArr11 = SettingsListScreen.B0;
                return new cn3(yfd.a.getAccessor().d(y7d.class));
            default:
                bc7[] bc7VarArr12 = SettingsStorageScreen.X;
                iid iidVar = iid.a;
                return new vid(iidVar.getAccessor().d(kke.class), iidVar.getAccessor().d(jp.class), iidVar.getAccessor().d(ng5.class), iidVar.getAccessor().d(ch9.class), (Context) iidVar.getAccessor().c(Context.class));
        }
    }

    public /* synthetic */ hbc(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = 8;
    }
}
