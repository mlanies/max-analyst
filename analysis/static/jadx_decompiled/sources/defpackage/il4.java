package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.CountDownLatch;
import one.me.rlottie.RLottie;

/* loaded from: classes2.dex */
public final class il4 extends Thread {
    public static int Y;
    public final int X;
    public volatile Handler a = null;
    public final CountDownLatch b = new CountDownLatch(1);
    public long c;
    public final int o;

    public il4(String str) {
        int i = Y;
        Y = i + 1;
        this.o = i;
        this.X = -1000;
        setName(str);
        start();
    }

    public final void a(Runnable runnable) throws InterruptedException {
        try {
            this.b.await();
            this.a.removeCallbacks(runnable);
        } catch (Exception e) {
            RLottie.getLogger().o(e);
        }
    }

    public final void b(Runnable runnable) throws InterruptedException {
        this.c = SystemClock.elapsedRealtime();
        c(runnable, 0L);
    }

    public final boolean c(Runnable runnable, long j) throws InterruptedException {
        try {
            this.b.await();
        } catch (Exception e) {
            RLottie.getLogger().o(e);
        }
        return j <= 0 ? this.a.post(runnable) : this.a.postDelayed(runnable, j);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws SecurityException, IllegalArgumentException {
        Looper.prepare();
        this.a = new Handler(Looper.myLooper(), new hl4(0, this));
        this.b.countDown();
        int i = this.X;
        if (i != -1000) {
            Process.setThreadPriority(i);
        }
        Looper.loop();
    }
}
