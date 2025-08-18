package com.my.tracker.obfuscated;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class h {
    private static volatile Executor a;
    public static final Handler b = new Handler(Looper.getMainLooper());
    private static final a c = new a();

    public static void a(Executor executor) {
        if (a != null) {
            y0.b("Async - unexpected init error");
            return;
        }
        if (executor == null) {
            executor = Executors.newSingleThreadExecutor();
        }
        a = executor;
    }

    public static void b(Runnable runnable) {
        Runnable runnableA = c.a(runnable);
        if (Looper.getMainLooper() == Looper.myLooper()) {
            runnableA.run();
        } else {
            b.post(runnableA);
        }
    }

    public static Executor a() {
        return a;
    }

    public static void a(Runnable runnable) {
        Runnable runnableA = c.a(runnable);
        Executor executor = a;
        if (executor == null) {
            y0.b("Async - background executor is not found");
        } else {
            executor.execute(runnableA);
        }
    }

    public static final class a {
        private final ArrayDeque a = new ArrayDeque();

        /* renamed from: com.my.tracker.obfuscated.h$a$a, reason: collision with other inner class name */
        public static final class RunnableC0001a implements Runnable {
            final a a;
            volatile Runnable b;

            public RunnableC0001a(a aVar) {
                this.a = aVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    Runnable runnable = this.b;
                    if (runnable != null) {
                        runnable.run();
                    }
                } catch (Throwable th) {
                    try {
                        y0.b("RunnableThrowableDecorator: exception has been caught", th);
                        a aVar = this.a;
                        if (aVar != null) {
                            aVar.a(this);
                        }
                    } finally {
                        a aVar2 = this.a;
                        if (aVar2 != null) {
                            aVar2.a(this);
                        }
                    }
                }
            }
        }

        public a() {
            for (int i = 0; i < 64; i++) {
                this.a.add(new RunnableC0001a(this));
            }
        }

        public Runnable a(Runnable runnable) {
            RunnableC0001a runnableC0001a;
            synchronized (this) {
                runnableC0001a = (RunnableC0001a) this.a.pollFirst();
            }
            if (runnableC0001a == null) {
                runnableC0001a = new RunnableC0001a(null);
            }
            runnableC0001a.b = runnable;
            return runnableC0001a;
        }

        public void a(RunnableC0001a runnableC0001a) {
            synchronized (this) {
                runnableC0001a.b = null;
                this.a.add(runnableC0001a);
            }
        }
    }
}
