package com.my.tracker;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.text.TextUtils;
import com.my.tracker.obfuscated.c1;
import com.my.tracker.obfuscated.i0;
import com.my.tracker.obfuscated.y0;
import com.my.tracker.obfuscated.z0;
import java.util.Map;

/* loaded from: classes.dex */
public final class MyTracker {
    public static final String VERSION = "4.0.0-beta1";
    private static volatile i0 a;

    public interface AttributionListener {
        void onReceiveAttribution(MyTrackerAttribution myTrackerAttribution);
    }

    public static final class a {
        public static final z0 a;
        static final MyTrackerConfig b;

        static {
            z0 z0VarR = z0.r();
            a = z0VarR;
            b = MyTrackerConfig.a(z0VarR);
        }
    }

    public static void flush() {
        i0 i0Var = a;
        if (i0Var == null) {
            y0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            i0Var.a();
        }
    }

    public static String getInstanceId(Context context) {
        return c1.a(context);
    }

    public static MyTrackerConfig getTrackerConfig() {
        return a.b;
    }

    public static MyTrackerParams getTrackerParams() {
        return a.a.i();
    }

    public static String handleDeeplink(Intent intent) {
        i0 i0Var = a;
        if (i0Var != null) {
            return i0Var.a(intent);
        }
        y0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        return null;
    }

    public static void initTracker(String str, Application application) {
        if (TextUtils.isEmpty(str)) {
            y0.b("MyTracker initialization failed: id can't be empty");
            return;
        }
        if (a != null) {
            y0.c("MyTracker has already been initialized");
            return;
        }
        synchronized (MyTracker.class) {
            try {
                if (a != null) {
                    y0.c("MyTracker has already been initialized");
                    return;
                }
                i0 i0VarA = i0.a(str, a.a, application);
                i0VarA.b();
                a = i0VarA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean isDebugMode() {
        return y0.a();
    }

    public static void setAttributionListener(AttributionListener attributionListener) {
        setAttributionListener(attributionListener, null);
    }

    public static void setDebugMode(boolean z) {
        y0.a(z);
    }

    public static void trackLaunchManually(Activity activity) {
        i0 i0Var = a;
        if (i0Var == null) {
            y0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            i0Var.a(activity);
        }
    }

    public static void trackLoginEvent(String str, String str2, Map<String, String> map) {
        i0 i0Var = a;
        if (i0Var == null) {
            y0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            i0Var.a(str, str2, map);
        }
    }

    public static void trackRegistrationEvent(String str, String str2, Map<String, String> map) {
        i0 i0Var = a;
        if (i0Var == null) {
            y0.b("MyTracker hasn't been initialized yet. You should call MyTracker.initTracker() method first");
        } else {
            i0Var.b(str, str2, map);
        }
    }

    public static void setAttributionListener(AttributionListener attributionListener, Handler handler) {
        a.a.a(attributionListener, handler);
    }

    public static void trackLoginEvent(String str, String str2) {
        trackLoginEvent(str, str2, null);
    }

    public static void trackRegistrationEvent(String str, String str2) {
        trackRegistrationEvent(str, str2, null);
    }
}
