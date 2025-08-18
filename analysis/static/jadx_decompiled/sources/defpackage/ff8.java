package defpackage;

import android.media.MediaRouter2;
import android.media.MediaRouter2$ControllerCallback;

/* loaded from: classes.dex */
public final class ff8 extends MediaRouter2$ControllerCallback {
    public final /* synthetic */ kf8 a;

    public ff8(kf8 kf8Var) {
        this.a = kf8Var;
    }

    public final void onControllerUpdated(MediaRouter2.RoutingController routingController) {
        this.a.k(routingController);
    }
}
