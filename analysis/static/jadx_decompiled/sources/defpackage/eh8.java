package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class eh8 {
    public static final boolean c = Log.isLoggable("MediaRouter", 3);
    public static ah8 d;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public eh8(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static ah8 c() {
        ah8 ah8Var = d;
        if (ah8Var == null) {
            return null;
        }
        if (!ah8Var.b) {
            ah8Var.b = true;
            int i = Build.VERSION.SDK_INT;
            Context context = ah8Var.a;
            if (i >= 30) {
                int i2 = dl8.b;
                Intent intent = new Intent(context, (Class<?>) dl8.class);
                intent.setPackage(context.getPackageName());
                ah8Var.d = context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0;
            } else {
                ah8Var.d = false;
            }
            if (ah8Var.d) {
                ah8Var.e = new kf8(context, new re6(20, ah8Var));
            } else {
                ah8Var.e = null;
            }
            ah8Var.c = new jie(context, ah8Var);
            ah8Var.o = new fh8(new q57(11, ah8Var));
            ah8Var.a(ah8Var.c);
            kf8 kf8Var = ah8Var.e;
            if (kf8Var != null) {
                ah8Var.a(kf8Var);
            }
            xu3 xu3Var = new xu3(context, ah8Var);
            if (!xu3Var.a) {
                xu3Var.a = true;
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
                intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
                intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
                intentFilter.addDataScheme("package");
                Handler handler = (Handler) xu3Var.d;
                ((Context) xu3Var.b).registerReceiver((an) xu3Var.g, intentFilter, null, handler);
                handler.post((q57) xu3Var.h);
            }
        }
        return d;
    }

    public static eh8 d(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        b();
        if (d == null) {
            d = new ah8(context.getApplicationContext());
        }
        ArrayList arrayList = d.f;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                eh8 eh8Var = new eh8(context);
                arrayList.add(new WeakReference(eh8Var));
                return eh8Var;
            }
            eh8 eh8Var2 = (eh8) ((WeakReference) arrayList.get(size)).get();
            if (eh8Var2 == null) {
                arrayList.remove(size);
            } else if (eh8Var2.a == context) {
                return eh8Var2;
            }
        }
    }

    public static boolean e(wg8 wg8Var) {
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b();
        ah8 ah8VarC = c();
        ah8VarC.getClass();
        if (wg8Var.c()) {
            return false;
        }
        if (!ah8VarC.n) {
            ArrayList arrayList = ah8VarC.g;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dh8 dh8Var = (dh8) arrayList.get(i);
                if (dh8Var.d() || !dh8Var.h(wg8Var)) {
                }
            }
            return false;
        }
        return true;
    }

    public static void g(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        ah8 ah8VarC = c();
        dh8 dh8VarC = ah8VarC.c();
        if (ah8VarC.f() != dh8VarC) {
            ah8VarC.h(dh8VarC, i);
        }
    }

    public final void a(wg8 wg8Var, lz7 lz7Var, int i) {
        xg8 xg8Var;
        wg8 wg8Var2;
        if (wg8Var == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        if (lz7Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        if (c) {
            wg8Var.toString();
            lz7Var.toString();
            Integer.toHexString(i);
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((xg8) arrayList.get(i2)).b == lz7Var) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            xg8Var = new xg8(this, lz7Var);
            arrayList.add(xg8Var);
        } else {
            xg8Var = (xg8) arrayList.get(i2);
        }
        boolean z2 = true;
        if (i != xg8Var.d) {
            xg8Var.d = i;
            z = true;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if ((i & 1) != 0) {
            z = true;
        }
        xg8Var.e = jElapsedRealtime;
        wg8 wg8Var3 = xg8Var.c;
        wg8Var3.a();
        wg8Var.a();
        if (wg8Var3.b.containsAll(wg8Var.b)) {
            z2 = z;
        } else {
            wg8 wg8Var4 = xg8Var.c;
            if (wg8Var4 == null) {
                throw new IllegalArgumentException("selector must not be null");
            }
            wg8Var4.a();
            ArrayList<String> arrayList2 = !wg8Var4.b.isEmpty() ? new ArrayList<>(wg8Var4.b) : null;
            ArrayList arrayListB = wg8Var.b();
            if (!arrayListB.isEmpty()) {
                Iterator it = arrayListB.iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (str == null) {
                        throw new IllegalArgumentException("category must not be null");
                    }
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                    }
                    if (!arrayList2.contains(str)) {
                        arrayList2.add(str);
                    }
                }
            }
            if (arrayList2 == null) {
                wg8Var2 = wg8.c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList2);
                wg8Var2 = new wg8(arrayList2, bundle);
            }
            xg8Var.c = wg8Var2;
        }
        if (z2) {
            c().j();
        }
    }

    public final void f(lz7 lz7Var) {
        if (lz7Var == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        b();
        if (c) {
            lz7Var.toString();
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (((xg8) arrayList.get(i)).b == lz7Var) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.remove(i);
            c().j();
        }
    }
}
