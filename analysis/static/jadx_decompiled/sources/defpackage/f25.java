package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class f25 extends Service {
    public int X;
    public final ExecutorService a;
    public b7g b;
    public final Object c;
    public int o;

    public f25() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new cm9("Firebase-Messaging-Intent-Handle", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.c = new Object();
        this.X = 0;
    }

    public final void a(Intent intent) {
        if (intent != null) {
            prf.b(intent);
        }
        synchronized (this.c) {
            try {
                int i = this.X - 1;
                this.X = i;
                if (i == 0) {
                    stopSelfResult(this.o);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void b(Intent intent);

    @Override // android.app.Service
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (this.b == null) {
                this.b = new b7g(new fd7(this));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.a.shutdown();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        synchronized (this.c) {
            this.o = i2;
            this.X++;
        }
        Intent intent2 = (Intent) ((ArrayDeque) c8d.r().o).poll();
        if (intent2 == null) {
            a(intent);
            return 2;
        }
        qne qneVar = new qne();
        this.a.execute(new v05(this, intent2, qneVar, 2));
        ukg ukgVar = qneVar.a;
        if (ukgVar.g()) {
            a(intent);
            return 2;
        }
        ukgVar.b(new cs(2), new d74(this, 11, intent));
        return 3;
    }
}
