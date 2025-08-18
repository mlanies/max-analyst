package defpackage;

import android.content.res.Resources;
import android.graphics.Paint;
import android.os.Looper;
import android.text.BoringLayout;
import android.util.DisplayMetrics;
import androidx.work.WorkRequest;
import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.EnumMap;
import java.util.concurrent.TimeUnit;
import one.me.android.externalcallback.ExternalCallbackWidget;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class zf3 implements k56 {
    public final /* synthetic */ int a;

    public /* synthetic */ zf3(int i) {
        this.a = i;
    }

    @Override // defpackage.k56
    public final Object invoke() {
        Object njcVar;
        e5f e5fVar = e5f.a;
        switch (this.a) {
            case 0:
                int i = ConfirmRemoveOpponentToCallBottomSheet.B0;
                return tnd.a;
            case 1:
                kpa kpaVar = new kpa(zh3.b, new long[]{60000, 80000});
                kpa kpaVar2 = new kpa(zh3.o, new long[]{60000, 80000});
                kpa kpaVar3 = new kpa(zh3.X, new long[]{15000, 20000, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS, 40000, 50000, 60000, 80000});
                zh3 zh3Var = zh3.c;
                long[] jArr = c37.c;
                kpa[] kpaVarArr = {kpaVar, kpaVar2, kpaVar3, new kpa(zh3Var, jArr), new kpa(zh3.Y, jArr)};
                EnumMap enumMap = new EnumMap(zh3.class);
                for (int i2 = 0; i2 < 5; i2++) {
                    kpa kpaVar4 = kpaVarArr[i2];
                    enumMap.put((EnumMap) kpaVar4.a, (Enum) kpaVar4.b);
                }
                return enumMap;
            case 2:
                neb nebVar = neb.a;
                return new a03(nebVar.getAccessor().d(qea.class), nebVar.getAccessor().d(o45.class));
            case 3:
                return (dfb) neb.a.getAccessor().c(dfb.class);
            case 4:
                return new pc6(neb.a.getAccessor().d(qea.class));
            case 5:
                bc7[] bc7VarArr = ContactListWidget.P0;
                je7 je7Var = iyc.a;
                return new cn3(jyc.a.getAccessor().d(y7d.class));
            case 6:
                return new zcb();
            case 7:
                return new gcb();
            case 8:
                return Boolean.FALSE;
            case 9:
                bc7[] bc7VarArr2 = zt3.o;
                return e5fVar;
            case 10:
                return new eqe(oda.g);
            case 11:
                return new eqe(oda.h);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 13:
                BoringLayout.Metrics metrics = new BoringLayout.Metrics();
                j34.E0.getFontMetricsInt(metrics);
                return metrics;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                try {
                    Field declaredField = Looper.class.getDeclaredField("sThreadLocal");
                    declaredField.setAccessible(true);
                    return (ThreadLocal) declaredField.get(null);
                } catch (Throwable unused) {
                    return null;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new cj4();
            case 16:
                int i3 = gj4.s0;
                return e5fVar;
            case LangUtils.HASH_SEED /* 17 */:
                bc7[] bc7VarArr3 = DialogNotificationsSettingsScreen.Y;
                return new pj4();
            case 18:
                return Resources.getSystem();
            case 19:
                return Float.valueOf(DisplayMetrics.DENSITY_DEVICE_STABLE / 160);
            case 20:
                return Float.valueOf(Math.min(fk4.d().getDisplayMetrics().density, ((Number) fk4.b.getValue()).floatValue()));
            case 21:
                return lld.a(1, 1, 2);
            case 22:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1L));
            case 23:
                return new zu4();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new iv4();
            case 25:
                try {
                    njcVar = MessageDigest.getInstance("SHA-256");
                } catch (Throwable th) {
                    njcVar = new njc(th);
                }
                return (MessageDigest) (njcVar instanceof njc ? null : njcVar);
            case 26:
                bc7[] bc7VarArr4 = EnterPinCodeScreen.X;
                return new o25();
            case 27:
                int i4 = ExternalCallbackWidget.B0;
                return new t95();
            case 28:
                int i5 = ExternalCallbackWidget.B0;
                sz6 sz6Var = new sz6();
                int iG = tu0.G(44 * fk4.d().getDisplayMetrics().density);
                sz6Var.setBounds(0, 0, iG, iG);
                return sz6Var;
            default:
                return new gqd(false);
        }
    }
}
