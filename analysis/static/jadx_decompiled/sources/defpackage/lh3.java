package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class lh3 implements gh3 {
    public final Context a;
    public final Executor b;
    public final wmc c;
    public final je7 d;
    public final AtomicReference e;
    public final khe f;
    public final khe g;
    public volatile zh3 h;
    public final CopyOnWriteArraySet i;
    public final kh3 j;
    public final AtomicReference k;
    public final String l;

    public lh3(Context context, Executor executor, wmc wmcVar, khe kheVar) {
        this.a = context;
        this.b = executor;
        this.c = wmcVar;
        this.d = kheVar;
        AtomicReference atomicReference = new AtomicReference(Boolean.FALSE);
        this.e = atomicReference;
        final int i = 0;
        this.f = new khe(new k56(this) { // from class: ih3
            public final /* synthetic */ lh3 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (ConnectivityManager) this.b.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) this.b.a.getSystemService("phone");
                }
            }
        });
        final int i2 = 1;
        this.g = new khe(new k56(this) { // from class: ih3
            public final /* synthetic */ lh3 b;

            {
                this.b = this;
            }

            @Override // defpackage.k56
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (ConnectivityManager) this.b.a.getSystemService("connectivity");
                    default:
                        return (TelephonyManager) this.b.a.getSystemService("phone");
                }
            }
        });
        this.h = zh3.b;
        this.i = new CopyOnWriteArraySet();
        this.j = new kh3(0, this);
        this.k = new AtomicReference(jh3.f);
        this.l = lh3.class.getName();
        atomicReference.set(Boolean.valueOf(m(false)));
        an anVar = new an(5, this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.RESTRICT_BACKGROUND_CHANGED");
        z7.N(context, anVar, intentFilter, null, 4);
    }

    public static zh3 j(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return zh3.b;
        }
        if (networkCapabilities.hasTransport(1)) {
            return zh3.c;
        }
        if (!networkCapabilities.hasTransport(0)) {
            return zh3.b;
        }
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        return linkDownstreamBandwidthKbps <= 150 ? zh3.o : linkDownstreamBandwidthKbps <= 23000 ? zh3.X : zh3.Y;
    }

    @Override // defpackage.gh3
    public final boolean a() {
        return k().getRestrictBackgroundStatus() != 3;
    }

    @Override // defpackage.gh3
    public final zh3 b() {
        zh3 zh3Var = this.h;
        zh3 zh3VarJ = zh3.b;
        if (zh3Var != zh3VarJ) {
            return this.h;
        }
        Network activeNetwork = k().getActiveNetwork();
        if (activeNetwork != null) {
            try {
                zh3VarJ = j(k().getNetworkCapabilities(activeNetwork));
            } catch (SecurityException e) {
                l("failed getNetworkCapabilities", e);
                zh3VarJ = zh3.b;
            }
        }
        this.h = zh3VarJ;
        return zh3VarJ;
    }

    @Override // defpackage.gh3
    public final void c(fh3 fh3Var) {
        if (fh3Var != null) {
            this.i.add(fh3Var);
        }
    }

    @Override // defpackage.gh3
    public final boolean d() {
        jh3 jh3Var = (jh3) this.k.get();
        if (jh3Var != null && ((Boolean) this.e.get()).booleanValue()) {
            return jh3Var.e;
        }
        NetworkCapabilities networkCapabilitiesI = i(h());
        if (networkCapabilitiesI != null) {
            return networkCapabilitiesI.hasTransport(4);
        }
        return false;
    }

    @Override // defpackage.gh3
    public final void e(fh3 fh3Var) {
        if (fh3Var != null) {
            this.i.remove(fh3Var);
        }
    }

    @Override // defpackage.gh3
    public final boolean f() {
        boolean z = false;
        if (((Boolean) this.e.get()).booleanValue()) {
            jh3 jh3Var = (jh3) this.k.get();
            if (jh3Var.a) {
                return jh3Var.b;
            }
            return false;
        }
        RuntimeException runtimeException = new RuntimeException() { // from class: one.me.net.connection.impl.internal.ConnectionInfoNougatImpl$RegisterDefaultNetworkCallbackException
        };
        hm9.l0(this.l, "default network callback is not registered yet", runtimeException);
        ((cba) ((o45) ((cf7) this.d.getValue()).a.c(o45.class))).c(runtimeException, true);
        NetworkInfo activeNetworkInfo = k().getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting()) {
            z = true;
        }
        String str = this.l;
        ir6 ir6Var = hm9.m;
        if (ir6Var == null || !ir6Var.c()) {
            return z;
        }
        ir6Var.d(us7.X, str, ey8.j("fallbackOnDeprecatedCheckOfConnection: isConnected = ", z), null);
        return z;
    }

    @Override // defpackage.gh3
    public final boolean g() {
        return ((TelephonyManager) this.g.getValue()).isNetworkRoaming();
    }

    public final Network h() {
        String str = this.l;
        try {
            Network activeNetwork = k().getActiveNetwork();
            if (activeNetwork != null) {
                return activeNetwork;
            }
            hm9.m0(str, "Unable to get active network (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            hm9.p(str, "Failed to get active network", th);
            return null;
        }
    }

    public final NetworkCapabilities i(Network network) {
        String str = this.l;
        try {
            NetworkCapabilities networkCapabilities = k().getNetworkCapabilities(network);
            if (networkCapabilities != null) {
                return networkCapabilities;
            }
            hm9.m0(str, "Unable to get active network capabilities (background/blocked?)", new Object[0]);
            return null;
        } catch (Throwable th) {
            hm9.p(str, "Failed to get active network capabilities", th);
            return null;
        }
    }

    @Override // defpackage.gh3
    public final void invalidate() {
        String str = this.l;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "invalidate", null);
        }
        this.e.set(Boolean.valueOf(m(true)));
        if (((Boolean) this.e.get()).booleanValue()) {
            return;
        }
        o(null, null);
    }

    public final ConnectivityManager k() {
        return (ConnectivityManager) this.f.getValue();
    }

    public final void l(String str, Throwable th) {
        hm9.p(this.l, str, th);
        wmc wmcVar = this.c;
        wmcVar.getClass();
        hm9.p("ConnectionInfo", str, th);
        ((xie) ((v4) wmcVar.a).c(xie.class)).c().a(null, th);
    }

    public final boolean m(boolean z) {
        String str = this.l;
        ir6 ir6Var = hm9.m;
        if (ir6Var != null && ir6Var.c()) {
            ir6Var.d(us7.X, str, "registerNetworkCallback", null);
        }
        if (z) {
            try {
                k().unregisterNetworkCallback(this.j);
            } catch (Throwable th) {
                hm9.p(this.l, "registerNetworkCallback, unable to unregister default network callback", th);
            }
        }
        try {
            k().registerDefaultNetworkCallback(this.j);
            String str2 = this.l;
            ir6 ir6Var2 = hm9.m;
            if (ir6Var2 != null && ir6Var2.c()) {
                ir6Var2.d(us7.Y, str2, "registerNetworkCallback, default network callback successfully registered", null);
            }
            return true;
        } catch (Throwable th2) {
            l("Unable to register default network callback", th2);
            return false;
        }
    }

    public final void n(jh3 jh3Var) {
        if (tpa.f((jh3) this.k.get(), jh3Var)) {
            hm9.n(this.l, "inet equals!");
            return;
        }
        this.k.set(jh3Var);
        jh3 jh3Var2 = (jh3) this.k.get();
        if (!jh3Var2.a ? false : jh3Var2.b) {
            String str = this.l;
            ir6 ir6Var = hm9.m;
            if (ir6Var != null && ir6Var.c()) {
                ir6Var.d(us7.Y, str, "updateInet, " + jh3Var + " has working connection", null);
            }
        } else {
            hm9.m0(this.l, "updateInet, " + jh3Var + " has no working connection", new Object[0]);
        }
        this.b.execute(new cu1(18, this));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0023 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o(android.net.Network r18, android.net.NetworkCapabilities r19) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh3.o(android.net.Network, android.net.NetworkCapabilities):void");
    }
}
