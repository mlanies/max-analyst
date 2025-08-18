package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;
import ru.ok.android.externcalls.analytics.internal.upload.MultiFileUploader;

/* loaded from: classes.dex */
public final class jkg {
    public static final Object h = new Object();
    public static jkg i;
    public static HandlerThread j;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile fc9 c;
    public final xh3 d;
    public final long e;
    public final long f;
    public volatile Executor g;

    public jkg(Context context, Looper looper) {
        fud fudVar = new fud(2, this);
        this.b = context.getApplicationContext();
        fc9 fc9Var = new fc9(looper, fudVar, 5);
        Looper.getMainLooper();
        this.c = fc9Var;
        this.d = xh3.a();
        this.e = MultiFileUploader.UPLOAD_NEXT_INTERVAL;
        this.f = 300000L;
        this.g = null;
    }

    public final void a(String str, ServiceConnection serviceConnection, boolean z) {
        rjg rjgVar = new rjg(str, z);
        fp3.o(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.a) {
            try {
                sjg sjgVar = (sjg) this.a.get(rjgVar);
                if (sjgVar == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: ".concat(rjgVar.toString()));
                }
                if (!sjgVar.a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=".concat(rjgVar.toString()));
                }
                sjgVar.a.remove(serviceConnection);
                if (sjgVar.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, rjgVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b(rjg rjgVar, ehg ehgVar, String str) {
        boolean z;
        synchronized (this.a) {
            try {
                sjg sjgVar = (sjg) this.a.get(rjgVar);
                Executor executor = this.g;
                if (sjgVar == null) {
                    sjgVar = new sjg(this, rjgVar);
                    sjgVar.a.put(ehgVar, ehgVar);
                    sjgVar.a(str, executor);
                    this.a.put(rjgVar, sjgVar);
                } else {
                    this.c.removeMessages(0, rjgVar);
                    if (sjgVar.a.containsKey(ehgVar)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=".concat(rjgVar.toString()));
                    }
                    sjgVar.a.put(ehgVar, ehgVar);
                    int i2 = sjgVar.b;
                    if (i2 == 1) {
                        ehgVar.onServiceConnected(sjgVar.Y, sjgVar.o);
                    } else if (i2 == 2) {
                        sjgVar.a(str, executor);
                    }
                }
                z = sjgVar.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
