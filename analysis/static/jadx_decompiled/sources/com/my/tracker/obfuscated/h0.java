package com.my.tracker.obfuscated;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import defpackage.nm;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public abstract class h0 {
    private static final Integer a = 1;
    private static final AtomicBoolean b = new AtomicBoolean();

    public static boolean a(Context context) {
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if ("debug_phone".equals(Settings.Secure.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused) {
            y0.b("LoggingHandler: case 0 failure");
        }
        try {
            if ("debug_phone".equals(Settings.System.getString(contentResolver, "bluetooth_name"))) {
                return true;
            }
        } catch (Throwable unused2) {
            y0.b("LoggingHandler: case 1 failure");
        }
        try {
            return "debug_phone".equals(Settings.Global.getString(contentResolver, "device_name"));
        } catch (Throwable unused3) {
            y0.b("LoggingHandler: case 2 failure");
            return false;
        }
    }

    public static boolean b(Context context) {
        if (String.valueOf(a).equals(w0.a(context.getPackageName() + "_mytracker_debug"))) {
            y0.a("LoggingHandler: debug data in SystemProperties has been found");
            return true;
        }
        y0.a("LoggingHandler: no debug data in SystemProperties");
        return false;
    }

    public static void c(Context context) {
        if (!b.compareAndSet(false, true)) {
            y0.a("LoggingHandler: instance has already been initialized");
        } else if (y0.a()) {
            y0.a("LoggingHandler: tracing has already been enabled");
        } else {
            h.a(new nm(context, 7));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(Context context) {
        if (a(context)) {
            y0.a(true);
            y0.a("LoggingHandler: debug mode is enabled by device name");
            return;
        }
        if (a.equals((Integer) w0.a(context, "com.my.tracker.debugMode", Integer.class))) {
            y0.a(true);
            y0.a("LoggingHandler: debug mode is enabled by manifest metadata");
        } else if (b(context)) {
            y0.a(true);
            y0.a("LoggingHandler: debug mode is enabled by system properties");
        }
    }
}
