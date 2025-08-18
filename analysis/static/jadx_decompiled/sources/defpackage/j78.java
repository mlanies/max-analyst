package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import one.me.android.OneMeApplication;
import one.me.android.di.ConcurrentComponent;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.notifications.settings.NotificationsSettingsScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.nano.b;

/* loaded from: classes2.dex */
public final /* synthetic */ class j78 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ j78(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        int i = 0;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return new Path();
            case 1:
                return new byte[131072];
            case 2:
                bc7[] bc7VarArr = MediaPickerScreen.B0;
                return wuc.AVATAR_PICKER_GALLERY;
            case 3:
                bc7[] bc7VarArr2 = MediaPickerScreen.B0;
                return new s86(new j78(4));
            case 4:
                bc7[] bc7VarArr3 = MediaPickerScreen.B0;
                return Boolean.FALSE;
            case 5:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 6:
                nz4 nz4Var = nz4.a;
                return new qn5(3, new hn8(nz4Var, nz4Var));
            case 7:
                float[] fArr = new float[8];
                while (i < 8) {
                    fArr[i] = fk4.d().getDisplayMetrics().density * 16.0f;
                    i++;
                }
                return fArr;
            case 8:
                return new dg3(i2);
            case 9:
                return new ix3(fk4.d().getDisplayMetrics().density * 4.0f);
            case 10:
                return new ix3(fk4.d().getDisplayMetrics().density * 76.0f);
            case 11:
                return new ik6();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                bc7[] bc7VarArr4 = MessagesSettingsScreen.Y;
                return wuc.SETTINGS_MESSAGES;
            case 13:
                bc7[] bc7VarArr5 = MessagesSettingsScreen.Y;
                return new u89((hp) p89.a.getAccessor().c(hp.class));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new sc4(om9.c, 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new sc4(om9.c, 2);
            case 16:
                bc7[] bc7VarArr6 = NotificationsSettingsScreen.v0;
                return wuc.SETTINGS_NOTIFICATIONS;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr7 = NotificationsSettingsScreen.v0;
                return new gx9();
            case 18:
                bc7[] bc7VarArr8 = NotificationsSettingsScreen.v0;
                return new bh0(sw9.a.getAccessor().d(lw9.class), true, null, 46);
            case 19:
                int i3 = OneMeApplication.s0;
                lqf lqfVar = (lqf) bcf.a.getAccessor().c(lqf.class);
                lqfVar.getClass();
                hm9.n("lqf", "registerSelf");
                lqfVar.j.a.add(lqfVar);
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    q9b.s0.Y.a(lqfVar.m);
                } else {
                    new Handler(Looper.getMainLooper()).post(new jqf(lqfVar, i));
                }
                return e5f.a;
            case 20:
                int i4 = OneMeApplication.s0;
                qyc qycVar = (qyc) o7b.a.getAccessor().c(qyc.class);
                qycVar.h.add((tke) jyc.a.getAccessor().c(tke.class));
                return e5f.a;
            case 21:
                int i5 = OneMeApplication.s0;
                byte[] bArr = b.a;
                s36.d = new lq9();
                return e5f.a;
            case 22:
                int i6 = OneMeApplication.s0;
                ((b5) y4.a.getAccessor().d(b5.class).getValue()).b();
                return e5f.a;
            case 23:
                int i7 = OneMeApplication.s0;
                j47.T(j1e.a(((w9a) jyc.a.s()).b().plus(pag.a())), null, null, new a5a(2, null), 3);
                return e5f.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                int i8 = OneMeApplication.s0;
                ConcurrentComponent.INSTANCE.getExecutors().c().execute(new kc(9));
                return e5f.a;
            case 25:
                int i9 = OneMeApplication.s0;
                x45 x45Var = sd3.a;
                j47.t0 = yxc.o;
                j47.u0 = c32.c;
                j47.v0 = nd2.c;
                return e5f.a;
            case 26:
                int i10 = OneMeApplication.s0;
                np npVar = np.a;
                xe6 xe6Var = (xe6) ((u8e) bcf.a.getAccessor().c(u8e.class));
                npVar.b("services_name", xe6Var.f);
                int i11 = xe6Var.d;
                Context context = xe6Var.a;
                if (i11 == -1) {
                    xe6Var.d = ee6.d.b(context, fe6.a);
                }
                npVar.b("services_status", String.valueOf(xe6Var.d));
                if (xe6Var.e == -1) {
                    Object obj = ee6.c;
                    int i12 = pe6.e;
                    try {
                        i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    xe6Var.e = i;
                }
                npVar.b("services_version", String.valueOf(xe6Var.e));
                return e5f.a;
            case 27:
                int i13 = OneMeApplication.s0;
                uca ucaVar = (uca) y8a.a.getAccessor().c(uca.class);
                ucaVar.d(us7.Y, ucaVar.getClass().getName(), "oneMeLogger init", null);
                return e5f.a;
            case 28:
                int i14 = OneMeApplication.s0;
                return new ly5();
            default:
                int i15 = OneMeApplication.s0;
                return (ee3) y8a.a.getAccessor().c(ee3.class);
        }
    }
}
