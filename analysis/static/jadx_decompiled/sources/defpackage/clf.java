package defpackage;

import java.util.Map;
import ru.ok.messages.video.fetcher.FetcherException;

/* loaded from: classes2.dex */
public final /* synthetic */ class clf implements d38, qj3 {
    public final /* synthetic */ dlf a;
    public final /* synthetic */ l20 b;
    public final /* synthetic */ k20 c;

    public /* synthetic */ clf(dlf dlfVar, k20 k20Var, l20 l20Var) {
        this.a = dlfVar;
        this.c = k20Var;
        this.b = l20Var;
    }

    @Override // defpackage.qj3
    public void accept(Object obj) {
        dlf dlfVar = this.a;
        dlfVar.getClass();
        String str = this.b.r;
        dlfVar.a.getClass();
        lff.a.put(str, new kff((ff5) obj, System.currentTimeMillis()));
        ad adVar = (ad) dlfVar.c.get();
        if (adVar != null) {
            k20 k20Var = this.c;
            if (oag.t(k20Var.i)) {
                adVar.f("ACTION_VIDEO_FETCH_OK");
            } else {
                adVar.g("ACTION_VIDEO_FETCH_OK", k20Var.i);
            }
        }
    }

    @Override // defpackage.d38
    public void d(j28 j28Var) {
        dlf dlfVar = this.a;
        dlfVar.getClass();
        k20 k20Var = this.c;
        String str = k20Var.h;
        if (!oag.t(str) && !x9g.b(str) && oag.t(ypf.b(str)) && oag.t(a37.b(str))) {
            if (j28Var.h()) {
                return;
            }
            j28Var.onError(new FetcherException(5, "Video hosting in black list"));
            return;
        }
        if (k20Var.g) {
            if (k20Var.k > dlfVar.g.a.n()) {
                if (j28Var.h()) {
                    return;
                }
                j28Var.onError(new FetcherException(7, "live stream not started"));
                return;
            }
        }
        l20 l20Var = this.b;
        String strB = dlfVar.b(l20Var);
        if (!oag.t(strB)) {
            hm9.m("VideoRipper", "getVideoContent: local path = %s", strB);
            if (j28Var.h()) {
                return;
            }
            j28Var.b();
            return;
        }
        dlfVar.a.getClass();
        Map map = lff.a;
        String str2 = l20Var.r;
        kff kffVar = (kff) map.get(str2);
        ff5 ff5Var = null;
        if (kffVar != null) {
            if (kffVar.b + 3600000 > System.currentTimeMillis()) {
                ff5Var = kffVar.a;
            } else {
                map.remove(str2);
            }
        }
        if (ff5Var == null) {
            if (j28Var.h()) {
                return;
            }
            j28Var.b();
        } else {
            if (j28Var.h()) {
                return;
            }
            j28Var.a(ff5Var);
        }
    }

    public /* synthetic */ clf(dlf dlfVar, l20 l20Var, k20 k20Var) {
        this.a = dlfVar;
        this.b = l20Var;
        this.c = k20Var;
    }
}
