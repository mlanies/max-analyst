package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class l1 implements bm7 {
    public static final v3c Y;
    public static final Object Z;
    public volatile Object a;
    public volatile w0 b;
    public volatile j1 c;
    public static final boolean o = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger X = Logger.getLogger(l1.class.getName());

    static {
        v3c c1Var;
        try {
            c1Var = new y0(AtomicReferenceFieldUpdater.newUpdater(j1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(j1.class, j1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l1.class, j1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(l1.class, w0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1Var = new c1();
        }
        Y = c1Var;
        if (th != null) {
            X.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void b(l1 l1Var) {
        w0 w0Var;
        w0 w0Var2;
        w0 w0Var3 = null;
        while (true) {
            j1 j1Var = l1Var.c;
            if (Y.e(l1Var, j1Var, j1.c)) {
                while (j1Var != null) {
                    Thread thread = j1Var.a;
                    if (thread != null) {
                        j1Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    j1Var = j1Var.b;
                }
                do {
                    w0Var = l1Var.b;
                } while (!Y.c(l1Var, w0Var, w0.d));
                while (true) {
                    w0Var2 = w0Var3;
                    w0Var3 = w0Var;
                    if (w0Var3 == null) {
                        break;
                    }
                    w0Var = w0Var3.c;
                    w0Var3.c = w0Var2;
                }
                while (w0Var2 != null) {
                    w0Var3 = w0Var2.c;
                    Runnable runnable = w0Var2.a;
                    if (runnable instanceof a1) {
                        a1 a1Var = (a1) runnable;
                        l1Var = a1Var.a;
                        if (l1Var.a == a1Var) {
                            if (Y.d(l1Var, a1Var, f(a1Var.b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        c(runnable, w0Var2.b);
                    }
                    w0Var2 = w0Var3;
                }
                return;
            }
        }
    }

    public static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            X.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object e(Object obj) throws ExecutionException {
        if (obj instanceof r0) {
            Throwable th = ((r0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof u0) {
            throw new ExecutionException(((u0) obj).a);
        }
        if (obj == Z) {
            return null;
        }
        return obj;
    }

    public static Object f(bm7 bm7Var) {
        if (bm7Var instanceof l1) {
            Object obj = ((l1) bm7Var).a;
            if (!(obj instanceof r0)) {
                return obj;
            }
            r0 r0Var = (r0) obj;
            return r0Var.a ? r0Var.b != null ? new r0(false, (CancellationException) r0Var.b) : r0.d : obj;
        }
        boolean zIsCancelled = bm7Var.isCancelled();
        if ((!o) && zIsCancelled) {
            return r0.d;
        }
        try {
            Object objG = g(bm7Var);
            return objG == null ? Z : objG;
        } catch (CancellationException e) {
            if (zIsCancelled) {
                return new r0(false, e);
            }
            return new u0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bm7Var, e));
        } catch (ExecutionException e2) {
            return new u0(e2.getCause());
        } catch (Throwable th) {
            return new u0(th);
        }
    }

    public static Object g(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public final void a(StringBuilder sb) {
        try {
            Object objG = g(this);
            sb.append("SUCCESS, result=[");
            sb.append(objG == this ? "this future" : String.valueOf(objG));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof a1)) {
            return false;
        }
        r0 r0Var = o ? new r0(z, new CancellationException("Future.cancel() was called.")) : z ? r0.c : r0.d;
        boolean z2 = false;
        while (true) {
            if (Y.d(this, obj, r0Var)) {
                b(this);
                if (!(obj instanceof a1)) {
                    return true;
                }
                bm7 bm7Var = ((a1) obj).b;
                if (!(bm7Var instanceof l1)) {
                    bm7Var.cancel(z);
                    return true;
                }
                this = (l1) bm7Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof a1)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof a1)) {
                    return z2;
                }
            }
        }
    }

    @Override // defpackage.bm7
    public final void d(Runnable runnable, Executor executor) {
        executor.getClass();
        w0 w0Var = this.b;
        w0 w0Var2 = w0.d;
        if (w0Var != w0Var2) {
            w0 w0Var3 = new w0(runnable, executor);
            do {
                w0Var3.c = w0Var;
                if (Y.c(this, w0Var, w0Var3)) {
                    return;
                } else {
                    w0Var = this.b;
                }
            } while (w0Var != w0Var2);
        }
        c(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00a8 -> B:36:0x0074). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String h() {
        Object obj = this.a;
        if (obj instanceof a1) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            bm7 bm7Var = ((a1) obj).b;
            return zr6.l(sb, bm7Var == this ? "this future" : String.valueOf(bm7Var), "]");
        }
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void i(j1 j1Var) {
        j1Var.a = null;
        while (true) {
            j1 j1Var2 = this.c;
            if (j1Var2 == j1.c) {
                return;
            }
            j1 j1Var3 = null;
            while (j1Var2 != null) {
                j1 j1Var4 = j1Var2.b;
                if (j1Var2.a != null) {
                    j1Var3 = j1Var2;
                } else if (j1Var3 != null) {
                    j1Var3.b = j1Var4;
                    if (j1Var3.a == null) {
                        break;
                    }
                } else if (!Y.e(this, j1Var2, j1Var4)) {
                    break;
                }
                j1Var2 = j1Var4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a instanceof r0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (!(r2 instanceof a1)) & (this.a != null);
    }

    public final String toString() {
        String strH;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.a instanceof r0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                strH = h();
            } catch (RuntimeException e) {
                strH = "Exception thrown from implementation: " + e.getClass();
            }
            if (strH != null && !strH.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(strH);
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
            if ((obj2 != null) & (!(obj2 instanceof a1))) {
                return e(obj2);
            }
            j1 j1Var = this.c;
            j1 j1Var2 = j1.c;
            if (j1Var != j1Var2) {
                j1 j1Var3 = new j1();
                do {
                    v3c v3cVar = Y;
                    v3cVar.C(j1Var3, j1Var);
                    if (v3cVar.e(this, j1Var, j1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                i(j1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof a1))));
                        return e(obj);
                    }
                    j1Var = this.c;
                } while (j1Var != j1Var2);
            }
            return e(this.a);
        }
        throw new InterruptedException();
    }
}
