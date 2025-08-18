package defpackage;

import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;
import java.util.Map;
import org.apache.http.util.LangUtils;
import org.webrtc.CameraEnumerationAndroid;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class ky6 implements Comparator {
    public final /* synthetic */ int a;

    public /* synthetic */ ky6(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return xfg.f(Long.valueOf(((zp7) obj2).X), Long.valueOf(((zp7) obj).X));
            case 1:
                return xfg.f(Long.valueOf(((zp7) obj2).X), Long.valueOf(((zp7) obj).X));
            case 2:
                return xfg.f(Long.valueOf(((zp7) obj2).X), Long.valueOf(((zp7) obj).X));
            case 3:
                return xfg.f(Integer.valueOf(f46.Q((String) ((Map.Entry) obj).getKey())), Integer.valueOf(f46.Q((String) ((Map.Entry) obj2).getKey())));
            case 4:
                return xfg.f(Long.valueOf(((ns7) obj).a), Long.valueOf(((ns7) obj2).a));
            case 5:
                return xfg.f(Long.valueOf(((ql2) obj2).m), Long.valueOf(((ql2) obj).m));
            case 6:
                return xfg.f(Long.valueOf(((l38) obj).Y), Long.valueOf(((l38) obj2).Y));
            case 7:
                return xfg.f(Integer.valueOf(((tsa) obj).b), Integer.valueOf(((tsa) obj2).b));
            case 8:
                return xfg.f(Integer.valueOf(((tsa) obj).b), Integer.valueOf(((tsa) obj2).b));
            case 9:
                return xfg.f(Boolean.valueOf(((nn3) obj2).s0), Boolean.valueOf(((nn3) obj).s0));
            case 10:
                return ((sud) obj).b - ((sud) obj2).b;
            case 11:
                e52 e52Var = ((kzc) obj2).o;
                Long lValueOf = e52Var != null ? Long.valueOf(e52Var.m()) : null;
                e52 e52Var2 = ((kzc) obj).o;
                return xfg.f(lValueOf, e52Var2 != null ? Long.valueOf(e52Var2.m()) : null);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return xfg.f(Long.valueOf(((e52) obj2).m()), Long.valueOf(((e52) obj).m()));
            case 13:
                return xfg.f(Long.valueOf(((uw0) obj2).b), Long.valueOf(((uw0) obj).b));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return xfg.f(Boolean.valueOf(!((w3e) obj).s0), Boolean.valueOf(!((w3e) obj2).s0));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 16:
                return ((eof) obj).b - ((eof) obj2).b;
            case LangUtils.HASH_SEED /* 17 */:
                CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) obj;
                CameraEnumerationAndroid.CaptureFormat captureFormat2 = (CameraEnumerationAndroid.CaptureFormat) obj2;
                return Integer.compare(captureFormat2.width * captureFormat2.height, captureFormat.width * captureFormat.height);
            default:
                return ((Scope) obj).b.compareTo(((Scope) obj2).b);
        }
    }
}
