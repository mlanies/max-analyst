package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class nie extends pie implements gh8, hh8 {
    public static final ArrayList D0;
    public static final ArrayList E0;
    public boolean A0;
    public final ArrayList B0;
    public final ArrayList C0;
    public final oie t0;
    public final Object u0;
    public final Object v0;
    public final ih8 w0;
    public final MediaRouter.RouteCategory x0;
    public int y0;
    public boolean z0;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        D0 = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        E0 = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public nie(Context context, oie oieVar) {
        super(context, new ey1(21, new ComponentName("android", pie.class.getName())));
        this.B0 = new ArrayList();
        this.C0 = new ArrayList();
        this.t0 = oieVar;
        Object systemService = context.getSystemService("media_router");
        this.u0 = systemService;
        this.v0 = new kh8((jie) this);
        this.w0 = new ih8(this);
        this.x0 = ((MediaRouter) systemService).createRouteCategory((CharSequence) context.getResources().getString(n1c.mr_user_route_category_name), false);
        v();
    }

    public static mie n(Object obj) {
        Object tag = ((MediaRouter.RouteInfo) obj).getTag();
        if (tag instanceof mie) {
            return (mie) tag;
        }
        return null;
    }

    @Override // defpackage.hh8
    public final void a(int i, Object obj) {
        mie mieVarN = n(obj);
        if (mieVarN != null) {
            mieVarN.a.k(i);
        }
    }

    @Override // defpackage.hh8
    public final void b(int i, Object obj) {
        mie mieVarN = n(obj);
        if (mieVarN != null) {
            mieVarN.a.j(i);
        }
    }

    @Override // defpackage.ug8
    public final tg8 d(String str) {
        int iK = k(str);
        if (iK >= 0) {
            return new kie(((lie) this.B0.get(iK)).a);
        }
        return null;
    }

    @Override // defpackage.ug8
    public final void f(bg8 bg8Var) {
        boolean zB;
        int i = 0;
        if (bg8Var != null) {
            bg8Var.a();
            ArrayList arrayListB = bg8Var.b.b();
            int size = arrayListB.size();
            int i2 = 0;
            while (i < size) {
                String str = (String) arrayListB.get(i);
                i2 = str.equals("android.media.intent.category.LIVE_AUDIO") ? i2 | 1 : str.equals("android.media.intent.category.LIVE_VIDEO") ? i2 | 2 : i2 | 8388608;
                i++;
            }
            zB = bg8Var.b();
            i = i2;
        } else {
            zB = false;
        }
        if (this.y0 == i && this.z0 == zB) {
            return;
        }
        this.y0 = i;
        this.z0 = zB;
        v();
    }

    public final boolean i(Object obj) {
        String str;
        String str2;
        if (n(obj) != null || j(obj) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo routeInfoM = m();
        Context context = this.a;
        if (routeInfoM == obj) {
            str = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = ((MediaRouter.RouteInfo) obj).getName(context);
            str = String.format(locale, "ROUTE_%08x", Integer.valueOf((name != null ? name.toString() : "").hashCode()));
        }
        if (k(str) >= 0) {
            int i = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = str + "_" + i;
                if (k(str2) < 0) {
                    break;
                }
                i++;
            }
            str = str2;
        }
        lie lieVar = new lie(obj, str);
        CharSequence name2 = ((MediaRouter.RouteInfo) obj).getName(context);
        vq7 vq7Var = new vq7(str, name2 != null ? name2.toString() : "");
        o(lieVar, vq7Var);
        lieVar.c = vq7Var.k();
        this.B0.add(lieVar);
        return true;
    }

    public final int j(Object obj) {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lie) arrayList.get(i)).a == obj) {
                return i;
            }
        }
        return -1;
    }

    public final int k(String str) {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((lie) arrayList.get(i)).b.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(dh8 dh8Var) {
        ArrayList arrayList = this.C0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((mie) arrayList.get(i)).a == dh8Var) {
                return i;
            }
        }
        return -1;
    }

    public abstract MediaRouter.RouteInfo m();

    public void o(lie lieVar, vq7 vq7Var) {
        int supportedTypes = ((MediaRouter.RouteInfo) lieVar.a).getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            vq7Var.h(D0);
        }
        if ((supportedTypes & 2) != 0) {
            vq7Var.h(E0);
        }
        MediaRouter.RouteInfo routeInfo = (MediaRouter.RouteInfo) lieVar.a;
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = (Bundle) vq7Var.b;
        bundle.putInt("playbackType", playbackType);
        bundle.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle.putInt("volume", routeInfo.getVolume());
        bundle.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle.putInt("volumeHandling", routeInfo.getVolumeHandling());
    }

    public final void p(dh8 dh8Var) {
        ug8 ug8VarC = dh8Var.c();
        Object obj = this.u0;
        if (ug8VarC == this) {
            int iJ = j(((MediaRouter) obj).getSelectedRoute(8388611));
            if (iJ < 0 || !((lie) this.B0.get(iJ)).b.equals(dh8Var.b)) {
                return;
            }
            dh8Var.l();
            return;
        }
        MediaRouter mediaRouter = (MediaRouter) obj;
        MediaRouter.UserRouteInfo userRouteInfoCreateUserRoute = mediaRouter.createUserRoute(this.x0);
        mie mieVar = new mie(dh8Var, userRouteInfoCreateUserRoute);
        userRouteInfoCreateUserRoute.setTag(mieVar);
        userRouteInfoCreateUserRoute.setVolumeCallback(this.w0);
        w(mieVar);
        this.C0.add(mieVar);
        mediaRouter.addUserRoute(userRouteInfoCreateUserRoute);
    }

    public final void q(dh8 dh8Var) {
        int iL;
        if (dh8Var.c() == this || (iL = l(dh8Var)) < 0) {
            return;
        }
        mie mieVar = (mie) this.C0.remove(iL);
        ((MediaRouter.UserRouteInfo) mieVar.b).setTag(null);
        Object obj = mieVar.b;
        ((MediaRouter.UserRouteInfo) obj).setVolumeCallback(null);
        try {
            ((MediaRouter) this.u0).removeUserRoute((MediaRouter.UserRouteInfo) obj);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void r(dh8 dh8Var) {
        if (dh8Var.g()) {
            if (dh8Var.c() != this) {
                int iL = l(dh8Var);
                if (iL >= 0) {
                    t(((mie) this.C0.get(iL)).b);
                    return;
                }
                return;
            }
            int iK = k(dh8Var.b);
            if (iK >= 0) {
                t(((lie) this.B0.get(iK)).a);
            }
        }
    }

    public final void s() {
        ArrayList arrayList = this.B0;
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            zf8 zf8Var = ((lie) arrayList.get(i)).c;
            if (zf8Var == null) {
                throw new IllegalArgumentException("route must not be null");
            }
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
            } else if (arrayList2.contains(zf8Var)) {
                throw new IllegalArgumentException("route descriptor already added");
            }
            arrayList2.add(zf8Var);
        }
        g(new vg8(arrayList2, false));
    }

    public abstract void t(Object obj);

    public abstract void u();

    public final void v() {
        u();
        MediaRouter mediaRouter = (MediaRouter) this.u0;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean zI = false;
        for (int i = 0; i < routeCount; i++) {
            arrayList.add(mediaRouter.getRouteAt(i));
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            zI |= i(it.next());
        }
        if (zI) {
            s();
        }
    }

    public void w(mie mieVar) {
        int i;
        Object obj = mieVar.b;
        dh8 dh8Var = mieVar.a;
        ((MediaRouter.UserRouteInfo) obj).setName(dh8Var.d);
        int i2 = dh8Var.k;
        MediaRouter.UserRouteInfo userRouteInfo = (MediaRouter.UserRouteInfo) mieVar.b;
        userRouteInfo.setPlaybackType(i2);
        userRouteInfo.setPlaybackStream(dh8Var.l);
        userRouteInfo.setVolume(dh8Var.o);
        userRouteInfo.setVolumeMax(dh8Var.p);
        if (!dh8Var.e()) {
            i = dh8Var.n;
        } else if (eh8.d == null) {
            i = 0;
        } else {
            eh8.c().getClass();
            i = dh8Var.n;
        }
        userRouteInfo.setVolumeHandling(i);
    }
}
