package com.my.tracker.obfuscated;

import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.MyTracker;
import com.my.tracker.MyTrackerConfig;
import com.my.tracker.MyTrackerParams;
import defpackage.au1;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z0 {
    private final MyTrackerParams a = new MyTrackerParams();
    final List b = new ArrayList();
    private String c = "";
    private volatile boolean d = true;
    private volatile boolean e = true;
    private volatile boolean f = true;
    private volatile boolean g = false;
    private volatile int h = 30;
    private volatile int i = 0;
    private volatile int j = 900;
    private volatile String k = null;
    private volatile String l = null;
    private volatile MyTrackerConfig.InstalledPackagesProvider m = null;
    private volatile MyTrackerConfig.OkHttpClientProvider n = null;
    private volatile Executor o = null;
    private volatile String p = "";
    private volatile String q = "";
    private volatile String r = "";
    private volatile String s = "";
    private volatile MyTracker.AttributionListener t = null;
    private volatile Handler u = null;

    public static class a {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final MyTrackerParams.a h;
        public final MyTrackerConfig.InstalledPackagesProvider i;

        public a(String str, int i, int i2, int i3, boolean z, boolean z2, boolean z3, MyTrackerParams.a aVar, MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = z;
            this.f = z2;
            this.g = z3;
            this.h = aVar;
            this.i = installedPackagesProvider;
        }
    }

    private z0() {
        s();
    }

    public static z0 r() {
        return new z0();
    }

    private void s() {
        d("tracker-api.vk-analytics.ru");
    }

    public void a(int i) {
        int i2 = 86400;
        if (i <= 86400) {
            i2 = 1;
            if (i < 1) {
                y0.a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to min 1");
            }
            this.j = i;
        }
        y0.a("Invalid bufferingPeriod value " + i + ", bufferingPeriod set to max 86400");
        i = i2;
        this.j = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public void c(int i) {
        int i2 = 7200;
        if (i <= 7200) {
            i2 = 30;
            if (i < 30) {
                y0.a("Invalid launchTimeout value " + i + ", timeout set to min 30");
            }
            this.h = i;
        }
        y0.a("Invalid launchTimeout value " + i + ", timeout set to max 7200");
        i = i2;
        this.h = i;
    }

    public void d(boolean z) {
        this.e = z;
    }

    public int e() {
        return this.j;
    }

    public int f() {
        return this.i;
    }

    public String g() {
        return this.c;
    }

    public int h() {
        return this.h;
    }

    public MyTrackerParams i() {
        return this.a;
    }

    public MyTrackerConfig.OkHttpClientProvider j() {
        return this.n;
    }

    public a k() {
        return new a(this.c, this.h, this.j, this.i, this.d, this.e, this.f, this.a.a(), this.m);
    }

    public String l() {
        return this.p;
    }

    public String m() {
        return this.l;
    }

    public boolean n() {
        return this.g;
    }

    public boolean o() {
        return this.d;
    }

    public boolean p() {
        return this.e;
    }

    public boolean q() {
        return this.f;
    }

    public void t() {
        this.l = "com.my.games.vendorapp";
    }

    public void b(int i) {
        if (i > 432000) {
            y0.a("Invalid forcingPeriod value " + i + ", forcingPeriod set to max 432000");
            this.i = 432000;
            return;
        }
        if (i >= 0) {
            this.i = i;
            return;
        }
        y0.a("Invalid forcingPeriod value " + i + ", forcingPeriod set to min 0");
        this.i = 0;
    }

    public Executor d() {
        return this.o;
    }

    public void e(String str) {
        this.l = str;
    }

    private void d(String str) {
        this.p = a1.a(str, "v3/");
        y0.a("trackerUrl set = " + this.p);
        this.q = a1.a("ip4", str, null);
        y0.a("ipv4TrackerUrl set = " + this.q);
        this.r = a1.a("mlapi", str, null);
        this.s = a1.a("beta-ml", str, null);
    }

    public void e(boolean z) {
        this.f = z;
    }

    public String a() {
        return this.k;
    }

    public void c(String str) {
        String strSubstring;
        String host;
        try {
            if (TextUtils.isEmpty(str)) {
                y0.c("setProxyHost: reset proxy host to default = tracker-api.vk-analytics.ru");
                s();
                return;
            }
            y0.c("setProxyHost: try to set proxy host = " + str);
            int iIndexOf = str.indexOf("://");
            if (iIndexOf > 0) {
                y0.c("setProxyHost: detected custom schema, will be suppressed");
                strSubstring = str.substring(iIndexOf + 3);
            } else {
                strSubstring = str;
            }
            URI uri = new URI(a1.a(strSubstring, null));
            if (uri.getUserInfo() != null) {
                y0.c("setProxyHost: detected custom userinfo, will be suppressed");
            }
            if (!TextUtils.isEmpty(uri.getPath())) {
                y0.c("setProxyHost: detected custom path, will be suppressed");
            }
            int port = uri.getPort();
            if (port != -1) {
                host = uri.getHost() + ":" + port;
            } else {
                host = uri.getHost();
            }
            if (host.startsWith("www.")) {
                y0.c("setProxyHost: proxyHost starts from 'www.' which is not recommended (check docs), continue anyway");
            }
            d(host);
            y0.c("setProxyHost: proxy host = " + host + " successfully set");
        } catch (Throwable th) {
            StringBuilder sbM = au1.m("setProxyHost: unable to set proxy host = ", str, " (reason: invalid url), using default = tracker-api.vk-analytics.ru,\norig error = ");
            sbM.append(th.getMessage());
            y0.c(sbM.toString());
            s();
        }
    }

    public void a(String str) {
        this.k = str;
    }

    public void a(MyTrackerConfig.InstalledPackagesProvider installedPackagesProvider) {
        this.m = installedPackagesProvider;
    }

    public void a(MyTracker.AttributionListener attributionListener, Handler handler) {
        this.t = attributionListener;
        this.u = handler;
    }

    public void b(boolean z) {
        a(z);
        this.g = z;
    }

    public void a(MyTrackerConfig.OkHttpClientProvider okHttpClientProvider) {
        this.n = okHttpClientProvider;
    }

    public Handler b() {
        return this.u;
    }

    public void a(Executor executor) {
        this.o = executor;
    }

    public void a(n nVar, n nVar2) {
        synchronized (this.b) {
            nVar.a(Boolean.valueOf(this.g));
            this.b.add(nVar2);
        }
    }

    private void a(boolean z) {
        synchronized (this.b) {
            try {
                Iterator it = this.b.iterator();
                while (it.hasNext()) {
                    ((n) it.next()).a(Boolean.valueOf(z));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(boolean z) {
        this.d = z;
    }

    public MyTracker.AttributionListener c() {
        return this.t;
    }
}
