package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class m3 implements bm7 {
    public static final mqd Y;
    public static final Object Z;
    public volatile Object a;
    public volatile i3 b;
    public volatile l3 c;
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger X = Logger.getLogger(m3.class.getName());

    static {
        mqd k3Var;
        try {
            k3Var = new j3(AtomicReferenceFieldUpdater.newUpdater(l3.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(l3.class, l3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m3.class, l3.class, "c"), AtomicReferenceFieldUpdater.newUpdater(m3.class, i3.class, "b"), AtomicReferenceFieldUpdater.newUpdater(m3.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            k3Var = new k3();
        }
        Y = k3Var;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void c(m3 m3Var) {
        l3 l3Var;
        i3 i3Var;
        i3 i3Var2;
        i3 i3Var3;
        do {
            l3Var = m3Var.c;
        } while (!Y.e(m3Var, l3Var, l3.c));
        while (true) {
            i3Var = null;
            if (l3Var == null) {
                break;
            }
            Thread thread = l3Var.a;
            if (thread != null) {
                l3Var.a = null;
                LockSupport.unpark(thread);
            }
            l3Var = l3Var.b;
        }
        m3Var.b();
        do {
            i3Var2 = m3Var.b;
        } while (!Y.c(m3Var, i3Var2, i3.d));
        while (true) {
            i3Var3 = i3Var;
            i3Var = i3Var2;
            if (i3Var == null) {
                break;
            }
            i3Var2 = i3Var.c;
            i3Var.c = i3Var3;
        }
        while (i3Var3 != null) {
            i3 i3Var4 = i3Var3.c;
            e(i3Var3.a, i3Var3.b);
            i3Var3 = i3Var4;
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            X.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) throws ExecutionException {
        if (obj instanceof g3) {
            Throwable th = ((g3) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof h3) {
            throw new ExecutionException(((h3) obj).a);
        }
        if (obj == Z) {
            return null;
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (RuntimeException e) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e.getClass());
                sb.append(" thrown from get()]");
                return;
            } catch (ExecutionException e2) {
                sb.append("FAILURE, cause=[");
                sb.append(e2.getCause());
                sb.append("]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        sb.append(obj == this ? "this future" : String.valueOf(obj));
        sb.append("]");
    }

    public void b() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (obj != null) {
            return false;
        }
        if (!Y.d(this, obj, o ? new g3(z, new CancellationException("Future.cancel() was called.")) : z ? g3.c : g3.d)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        i3 i3Var = this.b;
        i3 i3Var2 = i3.d;
        if (i3Var != i3Var2) {
            i3 i3Var3 = new i3(runnable, executor);
            do {
                i3Var3.c = i3Var;
                if (Y.c(this, i3Var, i3Var3)) {
                    return;
                } else {
                    i3Var = this.b;
                }
            } while (i3Var != i3Var2);
        }
        e(runnable, executor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String g() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.a;
        if (obj != null) {
            return f(obj);
        }
        long jNanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            l3 l3Var = this.c;
            l3 l3Var2 = l3.c;
            if (l3Var != l3Var2) {
                l3 l3Var3 = new l3();
                do {
                    mqd mqdVar = Y;
                    mqdVar.B(l3Var3, l3Var);
                    if (mqdVar.e(this, l3Var, l3Var3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                h(l3Var3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.a;
                            if (obj2 != null) {
                                return f(obj2);
                            }
                            nanos = jNanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        h(l3Var3);
                    } else {
                        l3Var = this.c;
                    }
                } while (l3Var != l3Var2);
            }
            return f(this.a);
        }
        while (nanos > 0) {
            Object obj3 = this.a;
            if (obj3 != null) {
                return f(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = jNanoTime - System.nanoTime();
        }
        String string = toString();
        String string2 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = string2.toLowerCase(locale);
        StringBuilder sbK = au1.k(j, "Waited ", " ");
        sbK.append(timeUnit.toString().toLowerCase(locale));
        String string3 = sbK.toString();
        if (nanos + 1000 < 0) {
            String strG = au1.g(string3, " (plus ");
            long j2 = -nanos;
            long jConvert = timeUnit.convert(j2, TimeUnit.NANOSECONDS);
            long nanos2 = j2 - timeUnit.toNanos(jConvert);
            boolean z = jConvert == 0 || nanos2 > 1000;
            if (jConvert > 0) {
                String strG2 = strG + jConvert + " " + lowerCase;
                if (z) {
                    strG2 = au1.g(strG2, ",");
                }
                strG = au1.g(strG2, " ");
            }
            if (z) {
                strG = strG + nanos2 + " nanoseconds ";
            }
            string3 = au1.g(strG, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(au1.g(string3, " but future completed as timeout expired"));
        }
        throw new TimeoutException(rh4.j(string3, " for ", string));
    }

    public final void h(l3 l3Var) {
        l3Var.a = null;
        while (true) {
            l3 l3Var2 = this.c;
            if (l3Var2 == l3.c) {
                return;
            }
            l3 l3Var3 = null;
            while (l3Var2 != null) {
                l3 l3Var4 = l3Var2.b;
                if (l3Var2.a != null) {
                    l3Var3 = l3Var2;
                } else if (l3Var3 != null) {
                    l3Var3.b = l3Var4;
                    if (l3Var3.a == null) {
                        break;
                    }
                } else if (!Y.e(this, l3Var2, l3Var4)) {
                    break;
                }
                l3Var2 = l3Var4;
            }
            return;
        }
    }

    public boolean i(Object obj) {
        if (obj == null) {
            obj = Z;
        }
        if (!Y.d(this, null, obj)) {
            return false;
        }
        c(this);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof g3;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.a != null;
    }

    public boolean j(Throwable th) {
        th.getClass();
        if (!Y.d(this, null, new h3(th))) {
            return false;
        }
        c(this);
        return true;
    }

    public final String toString() {
        String strG;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof g3) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strG = g();
            } catch (RuntimeException e) {
                strG = "Exception thrown from implementation: " + e.getClass();
            }
            if (strG != null && !strG.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strG);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if (obj2 != null) {
                return f(obj2);
            }
            l3 l3Var = this.c;
            l3 l3Var2 = l3.c;
            if (l3Var != l3Var2) {
                l3 l3Var3 = new l3();
                do {
                    mqd mqdVar = Y;
                    mqdVar.B(l3Var3, l3Var);
                    if (mqdVar.e(this, l3Var, l3Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                h(l3Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return f(obj);
                    }
                    l3Var = this.c;
                } while (l3Var != l3Var2);
            }
            return f(this.a);
        }
        throw new InterruptedException();
    }
}
