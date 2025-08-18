package defpackage;

import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Looper;
import android.telephony.TelephonyManager;
import java.util.HashMap;

/* loaded from: classes2.dex */
public abstract class jb9 {
    public static final boolean a = (Build.MANUFACTURER + " " + Build.MODEL + " " + Build.DEVICE).equalsIgnoreCase(new String[]{"HUAWEI CHM-U01 hwCHM-H"}[0]);

    public static Point a(int i, int i2) {
        if (i <= 1280 && i2 <= 720) {
            return new Point(i, i2);
        }
        int iMax = Math.max(i, i2);
        if (iMax > 1280) {
            float f = 1280.0f / iMax;
            i = Math.round(i * f);
            i2 = Math.round(i2 * f);
        }
        return new Point(i, i2);
    }

    public static String b(ConnectivityManager connectivityManager, TelephonyManager telephonyManager) {
        if (connectivityManager == null) {
            return "unknown";
        }
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        String subtypeName = activeNetworkInfo != null ? activeNetworkInfo.getType() == 0 ? activeNetworkInfo.getSubtypeName() : activeNetworkInfo.getTypeName() : "unknown";
        if (telephonyManager == null) {
            return subtypeName;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.getType() == 1) {
            return subtypeName;
        }
        StringBuilder sbO = rh4.o(subtypeName, ".");
        sbO.append(telephonyManager.getNetworkOperatorName());
        return sbO.toString();
    }

    public static String c(Object obj) {
        if (obj == null) {
            return "Ø";
        }
        return obj.getClass().getSimpleName() + '@' + System.identityHashCode(obj);
    }

    public static void d(d4c d4cVar, String str, String str2) {
        HashMap map = new HashMap(3);
        map.put("param", str + "_" + str2);
        d4cVar.log(d4c.COLLECTOR_WEBRTC, "callSpecError", map);
    }

    public static void e() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Main (UI) thread expected");
        }
    }
}
