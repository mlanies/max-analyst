package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;

/* loaded from: classes.dex */
public final class jie extends nie implements jh8 {
    @Override // defpackage.nie
    public final MediaRouter.RouteInfo m() {
        return ((MediaRouter) this.u0).getDefaultRoute();
    }

    @Override // defpackage.nie
    public final void o(lie lieVar, vq7 vq7Var) {
        z(lieVar, vq7Var);
        ((Bundle) vq7Var.b).putInt("deviceType", ((MediaRouter.RouteInfo) lieVar.a).getDeviceType());
    }

    @Override // defpackage.nie
    public final void t(Object obj) {
        ((MediaRouter) this.u0).selectRoute(8388611, (MediaRouter.RouteInfo) obj);
    }

    @Override // defpackage.nie
    public final void u() {
        boolean z = this.A0;
        Object obj = this.v0;
        Object obj2 = this.u0;
        if (z) {
            ((MediaRouter) obj2).removeCallback((MediaRouter.Callback) obj);
        }
        this.A0 = true;
        ((MediaRouter) obj2).addCallback(this.y0, (MediaRouter.Callback) obj, (this.z0 ? 1 : 0) | 2);
    }

    @Override // defpackage.nie
    public final void w(mie mieVar) {
        super.w(mieVar);
        ((MediaRouter.UserRouteInfo) mieVar.b).setDescription(mieVar.a.e);
    }

    public final boolean x(lie lieVar) {
        return ((MediaRouter.RouteInfo) lieVar.a).isConnecting();
    }

    public final void y(lie lieVar, vq7 vq7Var) {
        Display presentationDisplay;
        super.o(lieVar, vq7Var);
        Object obj = lieVar.a;
        boolean zIsEnabled = ((MediaRouter.RouteInfo) obj).isEnabled();
        Bundle bundle = (Bundle) vq7Var.b;
        if (!zIsEnabled) {
            bundle.putBoolean("enabled", false);
        }
        if (x(lieVar)) {
            bundle.putInt("connectionState", 1);
        }
        try {
            presentationDisplay = ((MediaRouter.RouteInfo) obj).getPresentationDisplay();
        } catch (NoSuchMethodError unused) {
            presentationDisplay = null;
        }
        if (presentationDisplay != null) {
            bundle.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
    }

    public final void z(lie lieVar, vq7 vq7Var) {
        y(lieVar, vq7Var);
        CharSequence description = ((MediaRouter.RouteInfo) lieVar.a).getDescription();
        if (description != null) {
            ((Bundle) vq7Var.b).putString("status", description.toString());
        }
    }
}
