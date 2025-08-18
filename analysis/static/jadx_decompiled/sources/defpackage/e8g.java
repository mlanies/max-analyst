package defpackage;

import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class e8g {
    public static final Method a;
    public static final Method b;
    public static final Method c;
    public static final Method d;
    public static Boolean e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", Integer.TYPE);
        } catch (Exception unused) {
            method = null;
        }
        a = method;
        try {
            method2 = WorkSource.class.getMethod("add", Integer.TYPE, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        c = method3;
        try {
            WorkSource.class.getMethod("get", Integer.TYPE);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", Integer.TYPE);
        } catch (Exception unused5) {
        }
        try {
            WorkSource.class.getMethod("createWorkChain", null);
        } catch (Exception unused6) {
        }
        try {
            Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", Integer.TYPE, String.class);
        } catch (Exception unused7) {
        }
        try {
            method4 = WorkSource.class.getMethod("isEmpty", null);
            try {
                method4.setAccessible(true);
            } catch (Exception unused8) {
            }
        } catch (Exception unused9) {
            method4 = null;
        }
        d = method4;
        e = null;
    }

    public static void a(WorkSource workSource, int i, String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method = b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
                return;
            } catch (Exception e2) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                return;
            }
        }
        Method method2 = a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i));
            } catch (Exception e3) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e3);
            }
        }
    }
}
