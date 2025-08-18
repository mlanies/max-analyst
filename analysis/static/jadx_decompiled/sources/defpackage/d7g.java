package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class d7g implements ServiceConnection {
    public b7g X;
    public boolean Y;
    public final Context a;
    public final Intent b;
    public final ScheduledExecutorService c;
    public final ArrayDeque o;

    public d7g(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new cm9("Firebase-FirebaseInstanceIdServiceConnection", 0));
        this.o = new ArrayDeque();
        this.Y = false;
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        xh3 xh3VarA;
        Context context;
        while (!this.o.isEmpty()) {
            try {
                b7g b7gVar = this.X;
                if (b7gVar == null || !b7gVar.isBinderAlive()) {
                    if (!this.Y) {
                        this.Y = true;
                        try {
                            xh3VarA = xh3.a();
                            context = this.a;
                        } catch (SecurityException unused) {
                        }
                        if (!xh3VarA.c(context, context.getClass().getName(), this.b, this, 65, null)) {
                            this.Y = false;
                            while (true) {
                                ArrayDeque arrayDeque = this.o;
                                if (arrayDeque.isEmpty()) {
                                    break;
                                } else {
                                    ((c7g) arrayDeque.poll()).b.d(null);
                                }
                            }
                        }
                    }
                    return;
                }
                this.X.a((c7g) this.o.poll());
            } finally {
            }
        }
    }

    public final synchronized ukg b(Intent intent) {
        c7g c7gVar;
        c7gVar = new c7g(intent);
        ScheduledExecutorService scheduledExecutorService = this.c;
        c7gVar.b.a.b(scheduledExecutorService, new gte(21, scheduledExecutorService.schedule(new ule(18, c7gVar), 20L, TimeUnit.SECONDS)));
        this.o.add(c7gVar);
        a();
        return c7gVar.b.a;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Objects.toString(componentName);
            }
            this.Y = false;
            if (iBinder instanceof b7g) {
                this.X = (b7g) iBinder;
                a();
            } else {
                Objects.toString(iBinder);
                while (true) {
                    ArrayDeque arrayDeque = this.o;
                    if (arrayDeque.isEmpty()) {
                        return;
                    } else {
                        ((c7g) arrayDeque.poll()).b.d(null);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Objects.toString(componentName);
        }
        a();
    }
}
