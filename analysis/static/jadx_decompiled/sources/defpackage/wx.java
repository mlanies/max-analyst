package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class wx extends oue {
    public static final long h;
    public static final long i;
    public static wx j;
    public boolean e;
    public wx f;
    public long g;

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        h = millis;
        i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void i() {
        wx wxVar;
        if (!(!this.e)) {
            throw new IllegalStateException("Unbalanced enter/exit".toString());
        }
        long j2 = this.c;
        boolean z = this.a;
        if (j2 != 0 || z) {
            this.e = true;
            synchronized (wx.class) {
                try {
                    if (j == null) {
                        j = new wx();
                        tx txVar = new tx("Okio Watchdog");
                        txVar.setDaemon(true);
                        txVar.start();
                    }
                    long jNanoTime = System.nanoTime();
                    if (j2 != 0 && z) {
                        this.g = Math.min(j2, c() - jNanoTime) + jNanoTime;
                    } else if (j2 != 0) {
                        this.g = j2 + jNanoTime;
                    } else {
                        if (!z) {
                            throw new AssertionError();
                        }
                        this.g = c();
                    }
                    long j3 = this.g - jNanoTime;
                    wx wxVar2 = j;
                    while (true) {
                        wxVar = wxVar2.f;
                        if (wxVar == null || j3 < wxVar.g - jNanoTime) {
                            break;
                        } else {
                            wxVar2 = wxVar;
                        }
                    }
                    this.f = wxVar;
                    wxVar2.f = this;
                    if (wxVar2 == j) {
                        wx.class.notify();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final boolean j() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        synchronized (wx.class) {
            wx wxVar = j;
            while (wxVar != null) {
                wx wxVar2 = wxVar.f;
                if (wxVar2 == this) {
                    wxVar.f = this.f;
                    this.f = null;
                    return false;
                }
                wxVar = wxVar2;
            }
            return true;
        }
    }

    public IOException k(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void l() {
    }
}
