package defpackage;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public abstract class on9 {
    public static final void a(ConnectivityManager connectivityManager, ConnectivityManager.NetworkCallback networkCallback) {
        connectivityManager.registerDefaultNetworkCallback(networkCallback);
    }
}
