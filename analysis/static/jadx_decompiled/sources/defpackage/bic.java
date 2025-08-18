package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;

/* loaded from: classes.dex */
public final class bic extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ gb0 c;

    public bic(gb0 gb0Var) {
        this.c = gb0Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        ((Handler) this.c.e).post(new aic(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        ((Handler) this.c.e).post(new aic(this, 1));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean zHasCapability = networkCapabilities.hasCapability(16);
        boolean z = this.a;
        gb0 gb0Var = this.c;
        if (z && this.b == zHasCapability) {
            if (zHasCapability) {
                ((Handler) gb0Var.e).post(new aic(this, 1));
            }
        } else {
            this.a = true;
            this.b = zHasCapability;
            ((Handler) gb0Var.e).post(new aic(this, 0));
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        ((Handler) this.c.e).post(new aic(this, 0));
    }
}
