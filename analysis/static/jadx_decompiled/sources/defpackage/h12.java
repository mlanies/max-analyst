package defpackage;

import java.lang.Thread;

/* loaded from: classes2.dex */
public final class h12 implements Thread.UncaughtExceptionHandler {
    public final Thread.UncaughtExceptionHandler a;
    public final Thread.UncaughtExceptionHandler b;

    public h12(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, Thread.UncaughtExceptionHandler uncaughtExceptionHandler2) {
        this.a = uncaughtExceptionHandler;
        this.b = uncaughtExceptionHandler2;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        try {
            this.a.uncaughtException(thread, th);
        } finally {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
