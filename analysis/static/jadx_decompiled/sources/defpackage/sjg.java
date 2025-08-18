package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class sjg implements ServiceConnection {
    public final rjg X;
    public ComponentName Y;
    public final /* synthetic */ jkg Z;
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder o;

    public sjg(jkg jkgVar, rjg rjgVar) {
        this.Z = jkgVar;
        this.X = rjgVar;
    }

    public final void a(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            jkg jkgVar = this.Z;
            xh3 xh3Var = jkgVar.d;
            Context context = jkgVar.b;
            boolean zC = xh3Var.c(context, str, this.X.a(context), this, 4225, executor);
            this.c = zC;
            if (zC) {
                this.Z.c.sendMessageDelayed(this.Z.c.obtainMessage(1, this.X), this.Z.f);
            } else {
                this.b = 2;
                try {
                    jkg jkgVar2 = this.Z;
                    jkgVar2.d.b(jkgVar2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = iBinder;
                this.Y = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = null;
                this.Y = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
