package defpackage;

import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class d0e {
    public static d0e h;
    public static final long i = TimeUnit.MINUTES.toMillis(2);
    public volatile File b;
    public volatile File d;
    public long e;
    public volatile StatFs a = null;
    public volatile StatFs c = null;
    public volatile boolean g = false;
    public final ReentrantLock f = new ReentrantLock();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.StatFs] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static StatFs b(StatFs statFs, File file) {
        ?? r0 = 0;
        r0 = 0;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            if (statFs == null) {
                statFs = new StatFs(file.getAbsolutePath());
            } else {
                statFs.restat(file.getAbsolutePath());
            }
            r0 = statFs;
            return r0;
        } catch (IllegalArgumentException unused) {
            return r0;
        } catch (Throwable th) {
            nu0.H(th);
            throw r0;
        }
    }

    public final void a() {
        if (this.g) {
            return;
        }
        this.f.lock();
        try {
            if (!this.g) {
                this.b = Environment.getDataDirectory();
                this.d = Environment.getExternalStorageDirectory();
                this.a = b(this.a, this.b);
                this.c = b(this.c, this.d);
                this.e = SystemClock.uptimeMillis();
                this.g = true;
            }
        } finally {
            this.f.unlock();
        }
    }
}
