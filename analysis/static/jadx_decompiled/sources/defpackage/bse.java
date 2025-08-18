package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Looper;
import android.text.BoringLayout;
import java.io.IOException;
import java.nio.channels.AsynchronousSocketChannel;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import javax.crypto.Cipher;
import one.me.calls.ui.ui.call.panels.VpnPanelWidget;
import one.me.chatscreen.videomsg.VideoMessageWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.ThemeRoomBottomSheet;
import one.me.devmenu.threadsviewer.ThreadsStateViewerScreen;
import one.me.login.welcome.WelcomeScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import one.me.webapp.settings.WebAppSettingsScreen;
import one.me.webapp.settings.WebAppsSettingScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class bse implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ bse(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException {
        boolean zU = false;
        switch (this.a) {
            case 0:
                int i = ThemeRoomBottomSheet.A0;
                return new lse();
            case 1:
                return Looper.getMainLooper();
            case 2:
                bc7[] bc7VarArr = ThreadsStateViewerScreen.X;
                return new cte((iba) dte.a.getAccessor().c(iba.class));
            case 3:
                return AsynchronousSocketChannel.open();
            case 4:
                bc7[] bc7VarArr2 = w5f.j;
                return e5f.a;
            case 5:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setFilterBitmap(true);
                return paint;
            case 6:
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setFilterBitmap(true);
                return paint2;
            case 7:
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setFilterBitmap(true);
                return paint3;
            case 8:
                try {
                    Class<?> cls = Class.forName("android.os.SystemProperties");
                    zU = oag.u((String) cls.getMethod("get", String.class).invoke(cls, "ro.miui.ui.version.code"));
                } catch (Throwable unused) {
                }
                return Boolean.valueOf(zU);
            case 9:
                Paint paint4 = new Paint();
                paint4.setAntiAlias(true);
                paint4.setDither(true);
                return paint4;
            case 10:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                mdf.E0.getFontMetricsInt(metrics);
                return metrics;
            case 11:
                Paint paint5 = new Paint(1);
                paint5.setStyle(Paint.Style.FILL);
                return paint5;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return "captureFrame";
            case 13:
                return "setStencil";
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                bc7[] bc7VarArr3 = VideoMessageWidget.y0;
                return new ljf();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                bc7[] bc7VarArr4 = VideoMessageWidget.y0;
                int iG = tu0.G(8 * fk4.d().getDisplayMetrics().density);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setSize(iG, iG);
                return new InsetDrawable((Drawable) gradientDrawable, iG);
            case 16:
                int i2 = VpnPanelWidget.c;
                return new drf(zi1.a.b());
            case LangUtils.HASH_SEED /* 17 */:
                return new gqd(false);
            case 18:
                return new gqd(true);
            case 19:
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                return keyStore;
            case 20:
                return Cipher.getInstance("AES/CBC/PKCS7Padding");
            case 21:
                bc7[] bc7VarArr5 = WebAppRootScreen.G0;
                return wuc.MINIAPP;
            case 22:
                bc7[] bc7VarArr6 = WebAppSettingsScreen.s0;
                return wuc.SETTINGS_PRIVACY_MINIAPP;
            case 23:
                bc7[] bc7VarArr7 = WebAppsSettingScreen.X;
                return wuc.SETTINGS_PRIVACY_MINIAPPS;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                bc7[] bc7VarArr8 = WebAppsSettingScreen.X;
                return new g3g(((hyc) ((q33) jwf.a.getAccessor().c(q33.class))).t());
            case 25:
                bc7[] bc7VarArr9 = WelcomeScreen.s0;
                return wuc.AUTH_SIGN_METHOD;
            case 26:
                bc7[] bc7VarArr10 = WelcomeScreen.s0;
                return bcf.a.b();
            default:
                return new ocg();
        }
    }
}
