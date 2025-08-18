package defpackage;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.RouteDiscoveryPreference;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class kf8 extends ug8 {
    public ArrayList A0;
    public final ArrayMap B0;
    public final MediaRouter2 t0;
    public final re6 u0;
    public final ArrayMap v0;
    public final if8 w0;
    public final jf8 x0;
    public final ff8 y0;
    public final a84 z0;

    public kf8(Context context, re6 re6Var) {
        super(context, null);
        this.v0 = new ArrayMap();
        this.w0 = new if8(this);
        this.x0 = new jf8(this);
        this.y0 = new ff8(this);
        this.A0 = new ArrayList();
        this.B0 = new ArrayMap();
        this.t0 = MediaRouter2.getInstance(context);
        this.u0 = re6Var;
        this.z0 = new a84(new Handler(Looper.getMainLooper()), 0);
    }

    @Override // defpackage.ug8
    public final sg8 c(String str) {
        Iterator it = this.v0.entrySet().iterator();
        while (it.hasNext()) {
            gf8 gf8Var = (gf8) ((Map.Entry) it.next()).getValue();
            if (TextUtils.equals(str, gf8Var.f)) {
                return gf8Var;
            }
        }
        return null;
    }

    @Override // defpackage.ug8
    public final tg8 d(String str) {
        return new hf8((String) this.B0.get(str), null);
    }

    @Override // defpackage.ug8
    public final tg8 e(String str, String str2) {
        String str3 = (String) this.B0.get(str);
        for (gf8 gf8Var : this.v0.values()) {
            zf8 zf8Var = gf8Var.o;
            if (TextUtils.equals(str2, zf8Var != null ? zf8Var.c() : gf8Var.g.getId())) {
                return new hf8(str3, gf8Var);
            }
        }
        return new hf8(str3, null);
    }

    @Override // defpackage.ug8
    public final void f(bg8 bg8Var) {
        ArrayList<String> arrayList;
        wg8 wg8Var;
        RouteDiscoveryPreference routeDiscoveryPreferenceBuild;
        String str;
        int i = eh8.d == null ? 0 : eh8.c().y;
        ff8 ff8Var = this.y0;
        jf8 jf8Var = this.x0;
        if8 if8Var = this.w0;
        if (i <= 0) {
            this.t0.unregisterRouteCallback(if8Var);
            this.t0.unregisterTransferCallback(jf8Var);
            this.t0.unregisterControllerCallback(ff8Var);
            return;
        }
        eh8.c();
        if (bg8Var == null) {
            bg8Var = new bg8(wg8.c, false);
        }
        bg8Var.a();
        ArrayList arrayListB = bg8Var.b.b();
        arrayListB.remove("android.media.intent.category.LIVE_AUDIO");
        if (arrayListB.isEmpty()) {
            arrayList = null;
        } else {
            Iterator it = arrayListB.iterator();
            arrayList = null;
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (str2 == null) {
                    throw new IllegalArgumentException("category must not be null");
                }
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList == null) {
            wg8Var = wg8.c;
        } else {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("controlCategories", arrayList);
            wg8Var = new wg8(arrayList, bundle);
        }
        boolean zB = bg8Var.b();
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBundle("selector", wg8Var.a);
        bundle2.putBoolean("activeScan", zB);
        MediaRouter2 mediaRouter2 = this.t0;
        wg8Var.a();
        if (!wg8Var.b.contains(null)) {
            boolean z = bundle2.getBoolean("activeScan");
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = wg8Var.b().iterator();
            while (it2.hasNext()) {
                str = (String) it2.next();
                str.getClass();
                switch (str) {
                    case "android.media.intent.category.REMOTE_PLAYBACK":
                        str = "android.media.route.feature.REMOTE_PLAYBACK";
                        break;
                    case "android.media.intent.category.LIVE_AUDIO":
                        str = "android.media.route.feature.LIVE_AUDIO";
                        break;
                    case "android.media.intent.category.LIVE_VIDEO":
                        str = "android.media.route.feature.LIVE_VIDEO";
                        break;
                }
                arrayList2.add(str);
            }
            routeDiscoveryPreferenceBuild = ef8.g(arrayList2, z).build();
        } else {
            ef8.n();
            routeDiscoveryPreferenceBuild = ef8.f(new ArrayList()).build();
        }
        a84 a84Var = this.z0;
        mediaRouter2.registerRouteCallback(a84Var, if8Var, routeDiscoveryPreferenceBuild);
        this.t0.registerTransferCallback(a84Var, jf8Var);
        this.t0.registerControllerCallback(a84Var, ff8Var);
    }

    public final MediaRoute2Info i(String str) {
        if (str == null) {
            return null;
        }
        Iterator it = this.A0.iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoI = c4.i(it.next());
            if (TextUtils.equals(mediaRoute2InfoI.getId(), str)) {
                return mediaRoute2InfoI;
            }
        }
        return null;
    }

    public final void j() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        Iterator it = this.t0.getRoutes().iterator();
        while (it.hasNext()) {
            MediaRoute2Info mediaRoute2InfoI = c4.i(it.next());
            if (mediaRoute2InfoI != null && !arraySet.contains(mediaRoute2InfoI) && !mediaRoute2InfoI.isSystemRoute()) {
                arraySet.add(mediaRoute2InfoI);
                arrayList.add(mediaRoute2InfoI);
            }
        }
        if (arrayList.equals(this.A0)) {
            return;
        }
        this.A0 = arrayList;
        ArrayMap arrayMap = this.B0;
        arrayMap.clear();
        Iterator it2 = this.A0.iterator();
        while (it2.hasNext()) {
            MediaRoute2Info mediaRoute2InfoI2 = c4.i(it2.next());
            Bundle extras = mediaRoute2InfoI2.getExtras();
            if (extras == null || extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") == null) {
                mediaRoute2InfoI2.toString();
            } else {
                arrayMap.put(mediaRoute2InfoI2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = this.A0.iterator();
        while (it3.hasNext()) {
            MediaRoute2Info mediaRoute2InfoI3 = c4.i(it3.next());
            zf8 zf8VarN = np8.N(mediaRoute2InfoI3);
            if (mediaRoute2InfoI3 != null) {
                arrayList2.add(zf8VarN);
            }
        }
        ArrayList arrayList3 = null;
        if (!arrayList2.isEmpty()) {
            Iterator it4 = arrayList2.iterator();
            while (it4.hasNext()) {
                zf8 zf8Var = (zf8) it4.next();
                if (zf8Var == null) {
                    throw new IllegalArgumentException("route must not be null");
                }
                if (arrayList3 == null) {
                    arrayList3 = new ArrayList();
                } else if (arrayList3.contains(zf8Var)) {
                    throw new IllegalArgumentException("route descriptor already added");
                }
                arrayList3.add(zf8Var);
            }
        }
        g(new vg8(arrayList3, true));
    }

    public final void k(MediaRouter2.RoutingController routingController) {
        gf8 gf8Var = (gf8) this.v0.get(routingController);
        if (gf8Var == null) {
            Objects.toString(routingController);
            return;
        }
        List selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            routingController.toString();
            return;
        }
        ArrayList arrayListX = np8.x(selectedRoutes);
        zf8 zf8VarN = np8.N(c4.i(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.a.getString(n1c.mr_dialog_default_group_name);
        zf8 zf8Var = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    zf8Var = new zf8(bundle);
                }
            } catch (Exception unused) {
            }
        }
        if (zf8Var == null) {
            vq7 vq7Var = new vq7(routingController.getId(), string);
            Bundle bundle2 = (Bundle) vq7Var.b;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
            bundle2.putInt("volume", routingController.getVolume());
            bundle2.putInt("volumeMax", routingController.getVolumeMax());
            bundle2.putInt("volumeHandling", routingController.getVolumeHandling());
            zf8VarN.a();
            vq7Var.h(zf8VarN.c);
            if (!arrayListX.isEmpty()) {
                Iterator it = arrayListX.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (TextUtils.isEmpty(str)) {
                        throw new IllegalArgumentException("groupMemberId must not be empty");
                    }
                    if (((ArrayList) vq7Var.c) == null) {
                        vq7Var.c = new ArrayList();
                    }
                    if (!((ArrayList) vq7Var.c).contains(str)) {
                        ((ArrayList) vq7Var.c).add(str);
                    }
                }
            }
            zf8Var = vq7Var.k();
        }
        ArrayList arrayListX2 = np8.x(routingController.getSelectableRoutes());
        ArrayList arrayListX3 = np8.x(routingController.getDeselectableRoutes());
        vg8 vg8Var = this.Z;
        if (vg8Var == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<zf8> list = vg8Var.c;
        if (!list.isEmpty()) {
            for (zf8 zf8Var2 : list) {
                String strC = zf8Var2.c();
                arrayList.add(new rg8(zf8Var2, arrayListX.contains(strC) ? 3 : 1, arrayListX3.contains(strC), arrayListX2.contains(strC), true));
            }
        }
        gf8Var.o = zf8Var;
        gf8Var.l(zf8Var, arrayList);
    }
}
