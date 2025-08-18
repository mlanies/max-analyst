package defpackage;

import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.n;
import ru.ok.android.externcalls.sdk.stat.signaling.SignalingStat;

/* loaded from: classes2.dex */
public final class hrf {
    public final Runnable a;
    public j3g c;
    public final Handler d;
    public boolean f;
    public final ExecutorService g;
    public volatile String h;
    public long i;
    public final boolean k;
    public sy4 m;
    public final SignalingStat n;
    public final u2a o;
    public final a25 p;
    public final b9b q;
    public long r;
    public final Object b = new Object();
    public final Object e = new Object();
    public volatile long j = SystemClock.elapsedRealtime();
    public volatile long l = 0;

    public hrf(long j, n nVar, SignalingStat signalingStat, ExecutorService executorService, a4c a4cVar, b4c b4cVar, u2a u2aVar, boolean z, a25 a25Var) {
        Uri.Builder builderBuildUpon = Uri.parse(a25Var.d).buildUpon();
        String str = a25Var.c;
        if (str != null) {
            builderBuildUpon.appendQueryParameter("userId", str);
        }
        builderBuildUpon.appendQueryParameter(ApiProtocol.KEY_TOKEN, a25Var.b).appendQueryParameter(ApiProtocol.PARAM_CONVERSATION_ID, a25Var.a);
        if (a25Var.h >= 6) {
            builderBuildUpon.appendQueryParameter("deviceIdx", String.valueOf(a25Var.o));
        }
        Long l = a25Var.f;
        if (l != null) {
            builderBuildUpon.appendQueryParameter(ApiProtocol.PARAM_PEER_ID, String.valueOf(l));
        }
        Locale locale = a25Var.n;
        if (locale != null) {
            builderBuildUpon.appendQueryParameter("locale", locale.getLanguage());
        }
        this.h = c(builderBuildUpon, a25Var);
        this.i = j;
        this.a = nVar;
        this.n = signalingStat;
        this.g = executorService;
        this.o = u2aVar;
        this.r = 20000L;
        this.k = z;
        this.p = a25Var;
        this.q = new b9b(a4cVar, 5, b4cVar);
        this.d = new Handler(Looper.myLooper(), new hl4(7, this));
        a("init");
    }

    public static String c(Uri.Builder builder, a25 a25Var) {
        Uri.Builder builderAppendQueryParameter = builder.appendQueryParameter(ClientCookie.VERSION_ATTR, Integer.toString(a25Var.h)).appendQueryParameter("capabilities", a25Var.i).appendQueryParameter("device", Build.MANUFACTURER + "/" + Build.MODEL).appendQueryParameter("platform", AbstractUploader.SDK_TYPE_STRING).appendQueryParameter("clientType", a25Var.g).appendQueryParameter("appVersion", a25Var.e).appendQueryParameter("osVersion", String.valueOf(Build.VERSION.SDK_INT)).appendQueryParameter("ispAsOrg", a25Var.k).appendQueryParameter("locCc", a25Var.l).appendQueryParameter("locReg", a25Var.m);
        Integer num = a25Var.j;
        if (num != null) {
            builderAppendQueryParameter.appendQueryParameter("ispAsNo", String.valueOf(num));
        }
        return builderAppendQueryParameter.build().toString();
    }

    public static String e(String str, String str2, String str3) {
        Uri.Builder builderBuildUpon;
        Uri uri = Uri.parse(str);
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames.contains(str2)) {
            builderBuildUpon = uri.buildUpon().clearQuery();
            for (String str4 : queryParameterNames) {
                if (str2.equals(str4)) {
                    builderBuildUpon.appendQueryParameter(str4, str3);
                } else {
                    builderBuildUpon.appendQueryParameter(str4, uri.getQueryParameter(str4));
                }
            }
        } else {
            builderBuildUpon = uri.buildUpon();
            builderBuildUpon.appendQueryParameter(str2, str3);
        }
        return builderBuildUpon.build().toString();
    }

    public final void a(String str) {
        this.q.o("connect, ".concat(str));
        if (this.r > 0) {
            this.d.removeMessages(2);
        }
        synchronized (this.e) {
            try {
                if (this.f) {
                    this.q.o("cant connect because released");
                    return;
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = this.j;
                if (j == 0 || jElapsedRealtime - j <= this.i) {
                    this.n.onConnect();
                    this.g.execute(new grf(this, 0));
                } else {
                    this.n.onTimeout();
                    this.q.o("not connecting, lastPongTime = " + j + " time = " + jElapsedRealtime);
                    Runnable runnable = this.a;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        this.q.o("transport.dispose");
        synchronized (this.e) {
            try {
                if (this.f) {
                    return;
                }
                this.f = true;
                this.d.removeCallbacksAndMessages(null);
                this.g.execute(new grf(this, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        this.q.o("handleDisconnected");
        if (this.r > 0) {
            this.d.removeMessages(2);
        }
        synchronized (this.b) {
            this.c = null;
        }
        synchronized (this.e) {
            try {
                if (!this.f) {
                    this.d.sendEmptyMessageDelayed(1, 2000L);
                }
            } finally {
            }
        }
        sy4 sy4Var = this.m;
        if (sy4Var != null) {
            synchronized (((rod) sy4Var.b).f) {
                ((rod) sy4Var.b).r = false;
            }
        }
    }

    public final void f(String str) {
        this.g.execute(new erf(this, str, 0));
    }
}
