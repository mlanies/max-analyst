package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes.dex */
public final class p0 {
    private static volatile p0 b;
    private final SharedPreferences a;

    private p0(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static p0 a(Context context) {
        p0 p0Var;
        p0 p0Var2 = b;
        if (p0Var2 != null) {
            return p0Var2;
        }
        synchronized (p0.class) {
            try {
                p0Var = b;
                if (p0Var == null) {
                    p0Var = new p0(context.getSharedPreferences("mytracker_prefs", 0));
                    b = p0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return p0Var;
    }

    public String b() {
        return c("appId");
    }

    public String c() {
        return c("appSetId");
    }

    public void d(String str) {
        a("appVersion", str);
    }

    public void e(String str) {
        a("appId", str);
    }

    public String f() {
        return c("appsHash");
    }

    public void g(String str) {
        a("appVersionName", str);
    }

    public void h(String str) {
        a("appsHash", str);
    }

    public void i(String str) {
        a("attribution", str);
    }

    public String j() {
        return c("instanceId");
    }

    public void k(String str) {
        a("instanceId", str);
    }

    public String l() {
        return c("referrer");
    }

    public long m() {
        long jB = b("lastStopTimeStampSec");
        a("lastStopTimeStampSec", 0L);
        return jB;
    }

    public boolean n() {
        return a("apiReferrerSent");
    }

    public boolean o() {
        return a("huaweiApiReferrerSent");
    }

    public boolean p() {
        return a("preinstallRead");
    }

    public boolean q() {
        return a("referrerSent");
    }

    public void r() {
        a("apiReferrerSent", true);
    }

    public void s() {
        a("huaweiApiReferrerSent", true);
    }

    public void t() {
        a("preinstallRead", true);
    }

    public void u() {
        a("referrerSent", true);
    }

    public void b(long j) {
        a("lastUpdateTimestamp", j);
    }

    public void c(long j) {
        a("lastStopTimeStampSec", j);
    }

    public int d() {
        return (int) b("appSetIdScope");
    }

    public String e() {
        return c("appVersionName");
    }

    public void f(String str) {
        a("appSetId", str);
    }

    public String g() {
        return c("attribution");
    }

    public String h() {
        return c("firebaseAppInstanceId");
    }

    public long i() {
        return b("installTimestamp");
    }

    public void j(String str) {
        a("firebaseAppInstanceId", str);
    }

    public long k() {
        return b("lastUpdateTimestamp");
    }

    public void l(String str) {
        a("referrer", str);
    }

    public long b(String str) {
        try {
            return this.a.getLong(str, 0L);
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public String c(String str) {
        try {
            return this.a.getString(str, "");
        } catch (Throwable unused) {
            return "";
        }
    }

    public String a() {
        return c("appVersion");
    }

    public void a(long j) {
        a("installTimestamp", j);
    }

    public void a(int i) {
        a("appSetIdScope", i);
    }

    public boolean a(String str) {
        try {
            return this.a.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    public void a(String str, long j) {
        try {
            this.a.edit().putLong(str, j).commit();
        } catch (Throwable th) {
            y0.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, String str2) {
        try {
            this.a.edit().putString(str, str2).commit();
        } catch (Throwable th) {
            y0.a("PrefsCache error: ", th);
        }
    }

    public void a(String str, boolean z) {
        try {
            this.a.edit().putBoolean(str, z).commit();
        } catch (Throwable th) {
            y0.a("PrefsCache error: ", th);
        }
    }
}
