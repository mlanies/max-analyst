package defpackage;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class gf8 extends sg8 {
    public final String f;
    public final MediaRouter2.RoutingController g;
    public final Messenger h;
    public final Messenger i;
    public final Handler k;
    public zf8 o;
    public final /* synthetic */ kf8 p;
    public final SparseArray j = new SparseArray();
    public final AtomicInteger l = new AtomicInteger(1);
    public final nn6 m = new nn6(12, this);
    public int n = -1;

    public gf8(kf8 kf8Var, MediaRouter2.RoutingController routingController, String str) {
        Bundle controlHints;
        this.p = kf8Var;
        this.g = routingController;
        this.f = str;
        Messenger messenger = (routingController == null || (controlHints = routingController.getControlHints()) == null) ? null : (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
        this.h = messenger;
        this.i = messenger != null ? new Messenger(new cy(this)) : null;
        this.k = new Handler(Looper.getMainLooper());
    }

    @Override // defpackage.tg8
    public final void d() {
        this.g.release();
    }

    @Override // defpackage.tg8
    public final void f(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i);
        this.n = i;
        Handler handler = this.k;
        nn6 nn6Var = this.m;
        handler.removeCallbacks(nn6Var);
        handler.postDelayed(nn6Var, 1000L);
    }

    @Override // defpackage.tg8
    public final void i(int i) {
        MediaRouter2.RoutingController routingController = this.g;
        if (routingController == null) {
            return;
        }
        int volume = this.n;
        if (volume < 0) {
            volume = routingController.getVolume();
        }
        int iMax = Math.max(0, Math.min(volume + i, this.g.getVolumeMax()));
        this.n = iMax;
        this.g.setVolume(iMax);
        Handler handler = this.k;
        nn6 nn6Var = this.m;
        handler.removeCallbacks(nn6Var);
        handler.postDelayed(nn6Var, 1000L);
    }

    @Override // defpackage.sg8
    public final void m(String str) {
        MediaRoute2Info mediaRoute2InfoI;
        if (str == null || str.isEmpty() || (mediaRoute2InfoI = this.p.i(str)) == null) {
            return;
        }
        this.g.selectRoute(mediaRoute2InfoI);
    }

    @Override // defpackage.sg8
    public final void n(String str) {
        MediaRoute2Info mediaRoute2InfoI;
        if (str == null || str.isEmpty() || (mediaRoute2InfoI = this.p.i(str)) == null) {
            return;
        }
        this.g.deselectRoute(mediaRoute2InfoI);
    }

    @Override // defpackage.sg8
    public final void o(List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        String str = (String) list.get(0);
        kf8 kf8Var = this.p;
        MediaRoute2Info mediaRoute2InfoI = kf8Var.i(str);
        if (mediaRoute2InfoI == null) {
            return;
        }
        kf8Var.t0.transferTo(mediaRoute2InfoI);
    }
}
