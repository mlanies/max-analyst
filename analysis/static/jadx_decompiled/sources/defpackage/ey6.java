package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Debug;
import java.io.IOException;
import java.lang.Thread;
import java.util.Date;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class ey6 implements Thread.UncaughtExceptionHandler {
    public final zi5 a;
    public final m56 b;
    public final SharedPreferences c;
    public final Thread.UncaughtExceptionHandler d = Thread.getDefaultUncaughtExceptionHandler();
    public final AtomicBoolean e = new AtomicBoolean();

    public ey6(Context context, zi5 zi5Var, ww9 ww9Var) {
        this.a = zi5Var;
        this.b = ww9Var;
        this.c = context.getSharedPreferences("app_crash_prefs", 0);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) throws IOException {
        zi5 zi5Var;
        this.c.edit().putLong("pref_last_crash_time", System.currentTimeMillis()).apply();
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
        m56 m56Var = this.b;
        if (m56Var == null || !((Boolean) m56Var.invoke(th)).booleanValue() || !this.e.compareAndSet(false, true) || (zi5Var = this.a) == null) {
            return;
        }
        Debug.dumpHprofData(((kk5) zi5Var).i(ey8.i(new Date().getTime(), "oneme_heap_dump_-", ".hprof")).getAbsolutePath());
    }
}
