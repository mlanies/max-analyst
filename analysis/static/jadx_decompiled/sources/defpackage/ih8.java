package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class ih8 extends MediaRouter.VolumeCallback {
    public final hh8 a;

    public ih8(hh8 hh8Var) {
        this.a = hh8Var;
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeSetRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.b(i, routeInfo);
    }

    @Override // android.media.MediaRouter.VolumeCallback
    public final void onVolumeUpdateRequest(MediaRouter.RouteInfo routeInfo, int i) {
        this.a.a(i, routeInfo);
    }
}
