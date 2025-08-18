package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.PowerManager;
import android.view.View;
import java.io.IOException;

/* loaded from: classes.dex */
public final class wxe implements Runnable {
    public static final Object Z = new Object();
    public static Boolean s0;
    public static Boolean t0;
    public final Object X;
    public final Object Y;
    public final /* synthetic */ int a = 1;
    public final long b;
    public final Object c;
    public final Object o;

    public wxe(View view, y6c y6cVar, View view2, v6c v6cVar, v5c v5cVar, long j) {
        this.c = y6cVar;
        this.o = view2;
        this.X = v6cVar;
        this.Y = v5cVar;
        this.b = j;
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (Z) {
            try {
                Boolean bool = t0;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 : bool.booleanValue();
                t0 = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context) {
        boolean zBooleanValue;
        synchronized (Z) {
            try {
                Boolean bool = s0;
                zBooleanValue = (bool == null && bool == null) ? context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0 : bool.booleanValue();
                s0 = Boolean.valueOf(zBooleanValue);
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized boolean c() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.lang.Object r0 = r2.c     // Catch: java.lang.Throwable -> L14
            android.content.Context r0 = (android.content.Context) r0     // Catch: java.lang.Throwable -> L14
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L14
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r0 = move-exception
            goto L24
        L16:
            r0 = 0
        L17:
            if (r0 == 0) goto L21
            boolean r0 = r0.isConnected()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L21
            r0 = 1
            goto L22
        L21:
            r0 = 0
        L22:
            monitor-exit(r2)
            return r0
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxe.c():boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uxe uxeVar = (uxe) this.Y;
                Context context = (Context) this.c;
                boolean zB = b(context);
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.X;
                if (zB) {
                    wakeLock.acquire(mi3.a);
                }
                try {
                    try {
                        uxeVar.d(true);
                        if (!((jjf) this.o).i()) {
                            uxeVar.d(false);
                            if (!b(context)) {
                                return;
                            }
                        } else if (!a(context) || c()) {
                            if (uxeVar.e()) {
                                uxeVar.d(false);
                            } else {
                                uxeVar.f(this.b);
                            }
                            if (!b(context)) {
                                return;
                            }
                        } else {
                            vxe vxeVar = new vxe();
                            vxeVar.a = this;
                            context.registerReceiver(vxeVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                            if (!b(context)) {
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        if (b(context)) {
                            try {
                                wakeLock.release();
                            } catch (RuntimeException unused) {
                            }
                        }
                        throw th;
                    }
                } catch (IOException e) {
                    e.getMessage();
                    uxeVar.d(false);
                    if (!b(context)) {
                        return;
                    }
                }
                try {
                    wakeLock.release();
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            default:
                Rect rectC = y6c.c((y6c) this.c, (View) this.o);
                if (rectC == null) {
                    return;
                }
                String str = ((y6c) this.c).d;
                ir6 ir6Var = hm9.m;
                if (ir6Var != null && ir6Var.c()) {
                    us7 us7Var = us7.X;
                    v5c v5cVar = (v5c) this.Y;
                    ir6Var.d(us7Var, str, "Play reaction effect without pending, reaction:" + ((Object) v5cVar) + ", l:" + this.b, null);
                }
                y6c y6cVar = (y6c) this.c;
                v6c v6cVar = (v6c) this.X;
                y6c.d(y6cVar, v6cVar.b, v6cVar.a, rectC);
                return;
        }
    }

    public wxe(uxe uxeVar, Context context, jjf jjfVar, long j) {
        this.Y = uxeVar;
        this.c = context;
        this.b = j;
        this.o = jjfVar;
        this.X = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }
}
