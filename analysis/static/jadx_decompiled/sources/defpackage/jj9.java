package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerAttribution;
import com.my.tracker.MyTrackerConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import javax.inject.Provider;
import one.me.android.OneMeApplication;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import org.webrtc.Predicate;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class jj9 implements qj3, b66, b7b, MyTrackerConfig.OkHttpClientProvider, MyTracker.AttributionListener, df9, Predicate, qa5, ra5, dwe, Provider, o1d, ru0, pic {
    public final /* synthetic */ int a;

    public /* synthetic */ jj9(int i) {
        this.a = i;
    }

    @Override // defpackage.qa5
    public ka5[] a() {
        switch (this.a) {
            case 18:
                return new ka5[]{new j2a()};
            default:
                return new ka5[]{new rpb()};
        }
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        switch (this.a) {
            case 0:
                hm9.o("lj9", "Can't update seek");
                break;
            case 1:
                hm9.o("sj9", "Error in timer");
                break;
            case 2:
            case 3:
            case 8:
            case 9:
            case Protos.Attaches.Attach.PRESENT /* 12 */:
            default:
                ConcurrentHashMap concurrentHashMap = sna.b;
                break;
            case 4:
                hm9.o("bk9", "Can't hide controls");
                break;
            case 5:
                hm9.o("bk9", "Can't update seek");
                break;
            case 6:
                hm9.p("fk9", "Can't setupUpdateAddress", (Throwable) obj);
                break;
            case 7:
                hm9.p("fk9", "Can't setupLiveLocationUpdate", (Throwable) obj);
                break;
            case 10:
                hm9.p("fk9", "Error in timer", (Throwable) obj);
                break;
            case 11:
                hm9.o("fk9", "Can't load initial live switch state");
                break;
            case 13:
                hm9.p("hk9", "Error in extractThumbnail", (Throwable) obj);
                break;
        }
    }

    @Override // defpackage.b66
    /* renamed from: apply */
    public Object mo131apply(Object obj) {
        switch (this.a) {
            case 2:
                return qy9.j((List) obj);
            case 3:
                List list = (List) obj;
                return list.isEmpty() ? m28.a : f28.e(list);
            case 8:
                return (List) obj;
            default:
                ((kw8) obj).getClass();
                return 0L;
        }
    }

    @Override // defpackage.dwe
    public String c() {
        return null;
    }

    @Override // defpackage.pic
    public void e(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        switch (this.a) {
            case 26:
                bitmap.recycle();
                break;
            default:
                bitmap.recycle();
                break;
        }
    }

    @Override // defpackage.ru0
    public su0 g(Bundle bundle) {
        np8.d(bundle.getInt(Integer.toString(0, 36), -1) == 1);
        float f = bundle.getFloat(Integer.toString(1, 36), -1.0f);
        return f == -1.0f ? new xsa() : new xsa(f);
    }

    @Override // javax.inject.Provider
    public Object get() {
        return null;
    }

    @Override // com.my.tracker.MyTrackerConfig.OkHttpClientProvider
    public u2a getOkHttpClient() {
        return ((k5c) y8a.a.getAccessor().c(k5c.class)).a;
    }

    @Override // defpackage.o1d
    public int i(int i) {
        bc7[] bc7VarArr = OtherNotificationsSettingsScreen.Y;
        return 4;
    }

    @Override // com.my.tracker.MyTracker.AttributionListener
    public void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution) {
        ul9.c.g(myTrackerAttribution.getDeeplink());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:38|(2:40|(4:42|(4:118|48|49|(2:129|143))|37|134)(4:64|(0)(3:124|67|68)|37|134))(2:81|(4:96|116|97|135))|120|83|37|134) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x012c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x012d, code lost:
    
        defpackage.hm9.l0("ServerPayload/PayloadCatching", "payloadCatching catch error", r0);
        r0 = defpackage.u7d.a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x013d, code lost:
    
        ((defpackage.r4a) r0.next()).getClass();
        defpackage.r4a.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x014a, code lost:
    
        r0 = defpackage.au1.s(defpackage.k7d.a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0150, code lost:
    
        if (r0 != 0) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0152, code lost:
    
        if (r0 != 1) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0159, code lost:
    
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x015a, code lost:
    
        throw r0;
     */
    @Override // defpackage.df9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.gy8 r17) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jj9.r(gy8):java.lang.Object");
    }

    @Override // defpackage.b7b
    public boolean test(Object obj) {
        switch (this.a) {
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((e08) obj).a.a();
            default:
                int i = hy9.a;
                return true;
        }
    }

    public /* synthetic */ jj9(OneMeApplication oneMeApplication) {
        this.a = 22;
    }

    @Override // defpackage.ra5
    /* renamed from: a */
    public la5[] mo8a() {
        switch (this.a) {
            case 19:
                return new la5[]{new k2a()};
            default:
                return new la5[]{new spb()};
        }
    }
}
