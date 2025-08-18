package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class zn9 {
    public static final String a = a14.O("NetworkStateTracker");

    public static final xn9 a(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilitiesA;
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            networkCapabilitiesA = mn9.a(connectivityManager, nn9.a(connectivityManager));
        } catch (SecurityException e) {
            a14.u().r(a, "Unable to validate active network", e);
        }
        boolean zB = networkCapabilitiesA != null ? mn9.b(networkCapabilitiesA, 16) : false;
        return new xn9(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
