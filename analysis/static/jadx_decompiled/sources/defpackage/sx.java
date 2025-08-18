package defpackage;

import android.os.Looper;
import androidx.core.os.OperationCanceledException;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class sx implements Runnable {
    public static final ThreadPoolExecutor s0;
    public static fc9 t0;
    public final CountDownLatch Y;
    public final /* synthetic */ rgg Z;
    public final uh a;
    public final dc9 b;
    public volatile int c = 1;
    public final AtomicBoolean o = new AtomicBoolean();
    public final AtomicBoolean X = new AtomicBoolean();

    static {
        j40 j40Var = new j40(4);
        s0 = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), j40Var);
    }

    public sx(rgg rggVar) {
        this.Z = rggVar;
        uh uhVar = new uh(this);
        this.a = uhVar;
        this.b = new dc9(this, uhVar);
        this.Y = new CountDownLatch(1);
    }

    public final void a() throws InterruptedException {
        try {
            rgg rggVar = this.Z;
            Iterator it = rggVar.k.iterator();
            if (it.hasNext()) {
                ((mdg) it.next()).getClass();
                throw new UnsupportedOperationException();
            }
            try {
                rggVar.j.tryAcquire(0, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e) {
            if (!this.o.get()) {
                throw e;
            }
        }
    }

    public final void b(Object obj) {
        fc9 fc9Var;
        synchronized (sx.class) {
            try {
                if (t0 == null) {
                    t0 = new fc9(Looper.getMainLooper(), 0, false);
                }
                fc9Var = t0;
            } catch (Throwable th) {
                throw th;
            }
        }
        fc9Var.obtainMessage(1, new ec9(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.Z.b();
    }
}
