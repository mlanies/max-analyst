package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class mu3 {
    public volatile boolean a;
    public final Object b;
    public final Object c;
    public final Object d;

    public mu3(String str) {
        this.d = new CountDownLatch(1);
        HandlerThread handlerThread = new HandlerThread(str);
        this.c = handlerThread;
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        this.a = true;
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void a(Runnable runnable) {
        if (this.a) {
            ((Handler) this.b).removeCallbacksAndMessages(null);
            ((Handler) this.b).post(new wt1(this, 14, runnable));
            ((HandlerThread) this.c).quitSafely();
            this.a = false;
        }
    }

    public void c(Runnable runnable) {
        ((Handler) this.b).post(runnable);
    }

    public mu3() {
        this.b = new qx7(17);
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
    }
}
