package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class nn9 {
    public static final Network a(ConnectivityManager connectivityManager) {
        return connectivityManager.getActiveNetwork();
    }
}
