package defpackage;

import android.media.MediaRouter;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Display;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class kh8 extends MediaRouter.Callback {
    public final gh8 a;

    public kh8(gh8 gh8Var) {
        this.a = gh8Var;
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        nie nieVar = (nie) this.a;
        if (nieVar.i(routeInfo)) {
            nieVar.s();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        nie nieVar = (nie) this.a;
        nieVar.getClass();
        if (nie.n(routeInfo) != null || (iJ = nieVar.j(routeInfo)) < 0) {
            return;
        }
        lie lieVar = (lie) nieVar.B0.get(iJ);
        String str = lieVar.b;
        CharSequence name = ((MediaRouter.RouteInfo) lieVar.a).getName(nieVar.a);
        vq7 vq7Var = new vq7(str, name != null ? name.toString() : "");
        nieVar.o(lieVar, vq7Var);
        lieVar.c = vq7Var.k();
        nieVar.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        Display presentationDisplay;
        jie jieVar = (jie) ((jh8) this.a);
        int iJ = jieVar.j(routeInfo);
        if (iJ >= 0) {
            lie lieVar = (lie) jieVar.B0.get(iJ);
            try {
                presentationDisplay = routeInfo.getPresentationDisplay();
            } catch (NoSuchMethodError unused) {
                presentationDisplay = null;
            }
            int displayId = presentationDisplay != null ? presentationDisplay.getDisplayId() : -1;
            if (displayId != lieVar.c.a.getInt("presentationDisplayId", -1)) {
                zf8 zf8Var = lieVar.c;
                if (zf8Var == null) {
                    throw new IllegalArgumentException("descriptor must not be null");
                }
                Bundle bundle = new Bundle(zf8Var.a);
                ArrayList<String> arrayList = !zf8Var.b().isEmpty() ? new ArrayList<>(zf8Var.b()) : null;
                zf8Var.a();
                ArrayList<? extends Parcelable> arrayList2 = zf8Var.c.isEmpty() ? null : new ArrayList<>(zf8Var.c);
                bundle.putInt("presentationDisplayId", displayId);
                if (arrayList2 != null) {
                    bundle.putParcelableArrayList("controlFilters", arrayList2);
                }
                if (arrayList != null) {
                    bundle.putStringArrayList("groupMemberIds", arrayList);
                }
                lieVar.c = new zf8(bundle);
                jieVar.s();
            }
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        nie nieVar = (nie) this.a;
        nieVar.getClass();
        if (nie.n(routeInfo) != null || (iJ = nieVar.j(routeInfo)) < 0) {
            return;
        }
        nieVar.B0.remove(iJ);
        nieVar.s();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteSelected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        dh8 dh8VarA;
        nie nieVar = (nie) this.a;
        if (routeInfo != ((MediaRouter) nieVar.u0).getSelectedRoute(8388611)) {
            return;
        }
        mie mieVarN = nie.n(routeInfo);
        if (mieVarN != null) {
            mieVarN.a.l();
            return;
        }
        int iJ = nieVar.j(routeInfo);
        if (iJ >= 0) {
            String str = ((lie) nieVar.B0.get(iJ)).b;
            ah8 ah8Var = (ah8) nieVar.t0;
            ah8Var.m.removeMessages(262);
            ch8 ch8VarD = ah8Var.d(ah8Var.c);
            if (ch8VarD == null || (dh8VarA = ch8VarD.a(str)) == null) {
                return;
            }
            dh8VarA.l();
        }
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteUnselected(MediaRouter mediaRouter, int i, MediaRouter.RouteInfo routeInfo) {
        this.a.getClass();
    }

    @Override // android.media.MediaRouter.Callback
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int iJ;
        nie nieVar = (nie) this.a;
        nieVar.getClass();
        if (nie.n(routeInfo) != null || (iJ = nieVar.j(routeInfo)) < 0) {
            return;
        }
        lie lieVar = (lie) nieVar.B0.get(iJ);
        int volume = routeInfo.getVolume();
        if (volume != lieVar.c.a.getInt("volume")) {
            zf8 zf8Var = lieVar.c;
            if (zf8Var == null) {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            Bundle bundle = new Bundle(zf8Var.a);
            ArrayList<String> arrayList = !zf8Var.b().isEmpty() ? new ArrayList<>(zf8Var.b()) : null;
            zf8Var.a();
            ArrayList<? extends Parcelable> arrayList2 = zf8Var.c.isEmpty() ? null : new ArrayList<>(zf8Var.c);
            bundle.putInt("volume", volume);
            if (arrayList2 != null) {
                bundle.putParcelableArrayList("controlFilters", arrayList2);
            }
            if (arrayList != null) {
                bundle.putStringArrayList("groupMemberIds", arrayList);
            }
            lieVar.c = new zf8(bundle);
            nieVar.s();
        }
    }
}
