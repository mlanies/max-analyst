package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class eo7 extends Handler implements Runnable {
    public int X;
    public Thread Y;
    public boolean Z;
    public final /* synthetic */ int a;
    public final int b;
    public final long c;
    public IOException o;
    public volatile boolean s0;
    public final Object t0;
    public Object u0;
    public final /* synthetic */ Object v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo7(Object obj, Looper looper, Object obj2, Object obj3, int i, long j, int i2) {
        super(looper);
        this.a = i2;
        this.v0 = obj;
        this.t0 = obj2;
        this.u0 = obj3;
        this.b = i;
        this.c = j;
    }

    public final void a(boolean z) {
        switch (this.a) {
            case 0:
                this.s0 = z;
                this.o = null;
                if (hasMessages(0)) {
                    this.Z = true;
                    removeMessages(0);
                    if (!z) {
                        sendEmptyMessage(1);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((fo7) this.t0).a();
                            Thread thread = this.Y;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z) {
                    ((jo7) this.v0).b = null;
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    co7 co7Var = (co7) this.u0;
                    co7Var.getClass();
                    co7Var.o((fo7) this.t0, jElapsedRealtime, jElapsedRealtime - this.c, true);
                    this.u0 = null;
                    return;
                }
                return;
            default:
                this.s0 = z;
                this.o = null;
                if (hasMessages(1)) {
                    this.Z = true;
                    removeMessages(1);
                    if (!z) {
                        sendEmptyMessage(2);
                    }
                } else {
                    synchronized (this) {
                        try {
                            this.Z = true;
                            ((go7) this.t0).a();
                            Thread thread2 = this.Y;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } finally {
                        }
                    }
                }
                if (z) {
                    ((vq7) this.v0).c = null;
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    do7 do7Var = (do7) this.u0;
                    do7Var.getClass();
                    do7Var.m((go7) this.t0, jElapsedRealtime2, jElapsedRealtime2 - this.c, true);
                    this.u0 = null;
                    return;
                }
                return;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (this.s0) {
                    return;
                }
                int i = message.what;
                if (i == 0) {
                    this.o = null;
                    jo7 jo7Var = (jo7) this.v0;
                    ExecutorService executorService = (ExecutorService) jo7Var.a;
                    eo7 eo7Var = (eo7) jo7Var.b;
                    eo7Var.getClass();
                    executorService.execute(eo7Var);
                    return;
                }
                if (i == 3) {
                    throw ((Error) message.obj);
                }
                ((jo7) this.v0).b = null;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.c;
                co7 co7Var = (co7) this.u0;
                co7Var.getClass();
                if (this.Z) {
                    co7Var.o((fo7) this.t0, jElapsedRealtime, j, false);
                    return;
                }
                int i2 = message.what;
                if (i2 == 1) {
                    try {
                        co7Var.y((fo7) this.t0, jElapsedRealtime, j);
                        return;
                    } catch (RuntimeException e) {
                        fm9.c("Unexpected exception handling load completed", e);
                        ((jo7) this.v0).c = new Loader$UnexpectedLoaderException(e);
                        return;
                    }
                }
                if (i2 != 2) {
                    return;
                }
                IOException iOException = (IOException) message.obj;
                this.o = iOException;
                int i3 = this.X + 1;
                this.X = i3;
                b11 b11VarZ = co7Var.z((fo7) this.t0, jElapsedRealtime, j, iOException, i3);
                int i4 = b11VarZ.b;
                if (i4 == 3) {
                    ((jo7) this.v0).c = this.o;
                    return;
                }
                if (i4 != 2) {
                    if (i4 == 1) {
                        this.X = 1;
                    }
                    long jMin = b11VarZ.c;
                    if (jMin == -9223372036854775807L) {
                        jMin = Math.min((this.X - 1) * 1000, 5000);
                    }
                    jo7 jo7Var2 = (jo7) this.v0;
                    np8.f(((eo7) jo7Var2.b) == null);
                    jo7Var2.b = this;
                    if (jMin > 0) {
                        sendEmptyMessageDelayed(0, jMin);
                        return;
                    } else {
                        this.o = null;
                        ((ExecutorService) jo7Var2.a).execute(this);
                        return;
                    }
                }
                return;
            default:
                if (this.s0) {
                    return;
                }
                int i5 = message.what;
                if (i5 == 1) {
                    this.o = null;
                    vq7 vq7Var = (vq7) this.v0;
                    ExecutorService executorService2 = (ExecutorService) vq7Var.b;
                    eo7 eo7Var2 = (eo7) vq7Var.c;
                    eo7Var2.getClass();
                    executorService2.execute(eo7Var2);
                    return;
                }
                if (i5 == 4) {
                    throw ((Error) message.obj);
                }
                ((vq7) this.v0).c = null;
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                long j2 = jElapsedRealtime2 - this.c;
                do7 do7Var = (do7) this.u0;
                do7Var.getClass();
                if (this.Z) {
                    do7Var.m((go7) this.t0, jElapsedRealtime2, j2, false);
                    return;
                }
                int i6 = message.what;
                if (i6 == 2) {
                    try {
                        do7Var.v((go7) this.t0, jElapsedRealtime2, j2);
                        return;
                    } catch (RuntimeException e2) {
                        z04.v("Unexpected exception handling load completed", e2);
                        ((vq7) this.v0).o = new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e2);
                        return;
                    }
                }
                if (i6 != 3) {
                    return;
                }
                IOException iOException2 = (IOException) message.obj;
                this.o = iOException2;
                int i7 = this.X + 1;
                this.X = i7;
                b11 b11VarC = do7Var.C((go7) this.t0, jElapsedRealtime2, j2, iOException2, i7);
                int i8 = b11VarC.b;
                if (i8 == 3) {
                    ((vq7) this.v0).o = this.o;
                    return;
                }
                if (i8 != 2) {
                    if (i8 == 1) {
                        this.X = 1;
                    }
                    long jMin2 = b11VarC.c;
                    if (jMin2 == -9223372036854775807L) {
                        jMin2 = Math.min((this.X - 1) * 1000, 5000);
                    }
                    vq7 vq7Var2 = (vq7) this.v0;
                    fm9.k(((eo7) vq7Var2.c) == null);
                    vq7Var2.c = this;
                    if (jMin2 > 0) {
                        sendEmptyMessageDelayed(1, jMin2);
                        return;
                    } else {
                        this.o = null;
                        ((ExecutorService) vq7Var2.b).execute(this);
                        return;
                    }
                }
                return;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                try {
                    synchronized (this) {
                        z = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z) {
                        String simpleName = ((fo7) this.t0).getClass().getSimpleName();
                        j47.k(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        try {
                            ((fo7) this.t0).load();
                            j47.A();
                        } catch (Throwable th) {
                            j47.A();
                            throw th;
                        }
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (this.s0) {
                        return;
                    }
                    sendEmptyMessage(1);
                    return;
                } catch (IOException e) {
                    if (this.s0) {
                        return;
                    }
                    obtainMessage(2, e).sendToTarget();
                    return;
                } catch (OutOfMemoryError e2) {
                    if (this.s0) {
                        return;
                    }
                    fm9.c("OutOfMemory error loading stream", e2);
                    obtainMessage(2, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
                    return;
                } catch (Error e3) {
                    if (!this.s0) {
                        fm9.c("Unexpected error loading stream", e3);
                        obtainMessage(3, e3).sendToTarget();
                    }
                    throw e3;
                } catch (Exception e4) {
                    if (this.s0) {
                        return;
                    }
                    fm9.c("Unexpected exception loading stream", e4);
                    obtainMessage(2, new Loader$UnexpectedLoaderException(e4)).sendToTarget();
                    return;
                }
            default:
                try {
                    synchronized (this) {
                        z2 = !this.Z;
                        this.Y = Thread.currentThread();
                    }
                    if (z2) {
                        Trace.beginSection("load:".concat(((go7) this.t0).getClass().getSimpleName()));
                        try {
                            ((go7) this.t0).load();
                            Trace.endSection();
                        } catch (Throwable th2) {
                            Trace.endSection();
                            throw th2;
                        }
                    }
                    synchronized (this) {
                        this.Y = null;
                        Thread.interrupted();
                    }
                    if (this.s0) {
                        return;
                    }
                    sendEmptyMessage(2);
                    return;
                } catch (IOException e5) {
                    if (this.s0) {
                        return;
                    }
                    obtainMessage(3, e5).sendToTarget();
                    return;
                } catch (Exception e6) {
                    if (this.s0) {
                        return;
                    }
                    z04.v("Unexpected exception loading stream", e6);
                    obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e6)).sendToTarget();
                    return;
                } catch (OutOfMemoryError e7) {
                    if (this.s0) {
                        return;
                    }
                    z04.v("OutOfMemory error loading stream", e7);
                    obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e7)).sendToTarget();
                    return;
                } catch (Error e8) {
                    if (!this.s0) {
                        z04.v("Unexpected error loading stream", e8);
                        obtainMessage(4, e8).sendToTarget();
                    }
                    throw e8;
                }
        }
    }
}
