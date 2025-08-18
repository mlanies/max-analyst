package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.cloudmessaging.zzt;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class vjg implements ServiceConnection {
    public final SparseArray X;
    public final /* synthetic */ pkg Y;
    public int a = 0;
    public final Messenger b;
    public djb c;
    public final ArrayDeque o;

    public vjg(pkg pkgVar) {
        this.Y = pkgVar;
        fc9 fc9Var = new fc9(Looper.getMainLooper(), new fud(1, this), 4);
        Looper.getMainLooper();
        this.b = new Messenger(fc9Var);
        this.o = new ArrayDeque();
        this.X = new SparseArray();
    }

    public final synchronized void a(int i, String str) {
        b(str, null);
    }

    public final synchronized void b(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Disconnected: ".concat(String.valueOf(str));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            this.a = 4;
            xh3.a().b((Context) this.Y.a, this);
            zzt zztVar = new zzt(str, securityException);
            Iterator it = this.o.iterator();
            while (it.hasNext()) {
                ((ckg) it.next()).c(zztVar);
            }
            this.o.clear();
            for (int i2 = 0; i2 < this.X.size(); i2++) {
                ((ckg) this.X.valueAt(i2)).c(zztVar);
            }
            this.X.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c() {
        if (this.a == 2 && this.o.isEmpty() && this.X.size() == 0) {
            this.a = 3;
            xh3.a().b((Context) this.Y.a, this);
        }
    }

    public final synchronized boolean d(ckg ckgVar) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                this.o.add(ckgVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.o.add(ckgVar);
            ((ScheduledExecutorService) this.Y.c).execute(new oig(this, 0));
            return true;
        }
        this.o.add(ckgVar);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            xh3 xh3VarA = xh3.a();
            Context context = (Context) this.Y.a;
            if (xh3VarA.c(context, context.getClass().getName(), intent, this, 1, null)) {
                ((ScheduledExecutorService) this.Y.c).schedule(new oig(this, 1), 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e) {
            b("Unable to bind to service", e);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        ((ScheduledExecutorService) this.Y.c).execute(new ihg(this, 1, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ((ScheduledExecutorService) this.Y.c).execute(new oig(this, 2));
    }
}
