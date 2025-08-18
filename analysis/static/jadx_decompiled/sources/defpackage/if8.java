package defpackage;

import android.media.MediaRouter2$RouteCallback;
import java.util.List;

/* loaded from: classes.dex */
public final class if8 extends MediaRouter2$RouteCallback {
    public final /* synthetic */ kf8 a;

    public if8(kf8 kf8Var) {
        this.a = kf8Var;
    }

    public final void onRoutesAdded(List list) {
        this.a.j();
    }

    public final void onRoutesChanged(List list) {
        this.a.j();
    }

    public final void onRoutesRemoved(List list) {
        this.a.j();
    }
}
