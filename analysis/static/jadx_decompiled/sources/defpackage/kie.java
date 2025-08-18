package defpackage;

import android.media.MediaRouter;

/* loaded from: classes.dex */
public final class kie extends tg8 {
    public final Object a;

    public kie(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.tg8
    public final void f(int i) {
        ((MediaRouter.RouteInfo) this.a).requestSetVolume(i);
    }

    @Override // defpackage.tg8
    public final void i(int i) {
        ((MediaRouter.RouteInfo) this.a).requestUpdateVolume(i);
    }
}
