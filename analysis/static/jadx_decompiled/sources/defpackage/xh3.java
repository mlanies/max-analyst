package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class xh3 {
    public static final Object b = new Object();
    public static volatile xh3 c;
    public final ConcurrentHashMap a;

    public xh3(int i) {
        switch (i) {
            case 1:
                this.a = new ConcurrentHashMap(16);
                break;
            default:
                this.a = new ConcurrentHashMap();
                break;
        }
    }

    public static xh3 a() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new xh3(0);
                    }
                } finally {
                }
            }
        }
        xh3 xh3Var = c;
        fp3.n(xh3Var);
        return xh3Var;
    }

    public void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof sjg)) {
            ConcurrentHashMap concurrentHashMap = this.a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((((Context) a9g.a(context).b).getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof sjg) {
            if (executor == null) {
                executor = null;
            }
            return executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
        }
        ConcurrentHashMap concurrentHashMap = this.a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = executor != null ? context.bindService(intent, i, executor, serviceConnection) : context.bindService(intent, serviceConnection, i);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }
}
