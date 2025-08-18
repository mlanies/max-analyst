package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes2.dex */
public final class kh3 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kh3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.a) {
            case 0:
                lh3 lh3Var = (lh3) this.b;
                hm9.n(lh3Var.l, "onAvailable");
                lh3Var.n(jh3.a((jh3) lh3Var.k.get(), true, true, 28));
                break;
            default:
                super.onAvailable(network);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 0:
                lh3 lh3Var = (lh3) this.b;
                lh3Var.getClass();
                lh3Var.h = lh3.j(networkCapabilities);
                lh3 lh3Var2 = (lh3) this.b;
                String str = lh3Var2.l;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "onCapabilitiesChanged, current connection is " + lh3Var2.h + ", capabilities=" + networkCapabilities, null);
                }
                ((lh3) this.b).o(network, networkCapabilities);
                break;
            default:
                a14.u().n(zn9.a, "Network capabilities changed: " + networkCapabilities);
                yn9 yn9Var = (yn9) this.b;
                yn9Var.q(zn9.a(yn9Var.Y));
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.a) {
            case 0:
                String str = ((lh3) this.b).l;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    ir6Var.d(us7.X, str, "onLost", null);
                }
                lh3 lh3Var = (lh3) this.b;
                lh3Var.n(jh3.a((jh3) lh3Var.k.get(), false, false, 30));
                break;
            default:
                a14.u().n(zn9.a, "Network connection lost");
                yn9 yn9Var = (yn9) this.b;
                yn9Var.q(zn9.a(yn9Var.Y));
                break;
        }
    }
}
