package defpackage;

import java.util.Objects;
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
public abstract class k1 extends w37 implements bm7 {
    public static final jt3 X;
    public static final tpa Y;
    public static final Object Z;
    public static final boolean o;
    public volatile Object a;
    public volatile v0 b;
    public volatile i1 c;

    static {
        boolean z;
        tpa b1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        o = z;
        X = new jt3(k1.class);
        Throwable th = null;
        try {
            b1Var = new h1();
            e = null;
        } catch (Error | Exception e) {
            e = e;
            try {
                b1Var = new x0(AtomicReferenceFieldUpdater.newUpdater(i1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i1.class, i1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k1.class, i1.class, "c"), AtomicReferenceFieldUpdater.newUpdater(k1.class, v0.class, "b"), AtomicReferenceFieldUpdater.newUpdater(k1.class, Object.class, "a"));
            } catch (Error | Exception e2) {
                th = e2;
                b1Var = new b1();
            }
        }
        Y = b1Var;
        if (th != null) {
            jt3 jt3Var = X;
            Logger loggerE = jt3Var.e();
            Level level = Level.SEVERE;
            loggerE.log(level, "UnsafeAtomicHelper is broken!", e);
            jt3Var.e().log(level, "SafeAtomicHelper is broken!", th);
        }
        Z = new Object();
    }

    public static void e(k1 k1Var, boolean z) {
        v0 v0Var = null;
        while (true) {
            k1Var.getClass();
            for (i1 i1VarQ = Y.q(k1Var); i1VarQ != null; i1VarQ = i1VarQ.b) {
                Thread thread = i1VarQ.a;
                if (thread != null) {
                    i1VarQ.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            k1Var.b();
            v0 v0Var2 = v0Var;
            v0 v0VarP = Y.p(k1Var);
            v0 v0Var3 = v0Var2;
            while (v0VarP != null) {
                v0 v0Var4 = v0VarP.c;
                v0VarP.c = v0Var3;
                v0Var3 = v0VarP;
                v0VarP = v0Var4;
            }
            while (v0Var3 != null) {
                v0Var = v0Var3.c;
                Runnable runnable = v0Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof z0) {
                    z0 z0Var = (z0) runnable;
                    k1Var = z0Var.a;
                    if (k1Var.a == z0Var) {
                        if (Y.j(k1Var, z0Var, h(z0Var.b))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = v0Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                v0Var3 = v0Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            X.e().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) throws ExecutionException {
        if (obj instanceof q0) {
            Throwable th = ((q0) obj).b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof t0) {
            throw new ExecutionException(((t0) obj).a);
        }
        if (obj == Z) {
            return null;
        }
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object h(defpackage.bm7 r6) {
        /*
            java.lang.String r0 = "get() did not throw CancellationException, despite reporting isCancelled() == true: "
            boolean r1 = r6 instanceof defpackage.d1
            r2 = 0
            if (r1 == 0) goto L2a
            k1 r6 = (defpackage.k1) r6
            java.lang.Object r6 = r6.a
            boolean r0 = r6 instanceof defpackage.q0
            if (r0 == 0) goto L26
            r0 = r6
            q0 r0 = (defpackage.q0) r0
            boolean r1 = r0.a
            if (r1 == 0) goto L26
            java.lang.Throwable r6 = r0.b
            if (r6 == 0) goto L24
            q0 r6 = new q0
            java.lang.Throwable r0 = r0.b
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0
            r6.<init>(r2, r0)
            goto L26
        L24:
            q0 r6 = defpackage.q0.d
        L26:
            java.util.Objects.requireNonNull(r6)
            return r6
        L2a:
            boolean r1 = r6 instanceof defpackage.w37
            if (r1 == 0) goto L4e
            r1 = r6
            w37 r1 = (defpackage.w37) r1
            k1 r1 = (defpackage.k1) r1
            r1.getClass()
            boolean r3 = r1 instanceof defpackage.d1
            if (r3 == 0) goto L45
            java.lang.Object r1 = r1.a
            boolean r3 = r1 instanceof defpackage.t0
            if (r3 == 0) goto L45
            t0 r1 = (defpackage.t0) r1
            java.lang.Throwable r1 = r1.a
            goto L46
        L45:
            r1 = 0
        L46:
            if (r1 == 0) goto L4e
            t0 r6 = new t0
            r6.<init>(r1)
            return r6
        L4e:
            boolean r1 = r6.isCancelled()
            boolean r3 = defpackage.k1.o
            r3 = r3 ^ 1
            r3 = r3 & r1
            if (r3 == 0) goto L5f
            q0 r6 = defpackage.q0.d
            java.util.Objects.requireNonNull(r6)
            return r6
        L5f:
            java.lang.Object r3 = i(r6)     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            if (r1 == 0) goto L82
            q0 r3 = new q0     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            r5.append(r6)     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            r3.<init>(r2, r4)     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
            return r3
        L7c:
            r6 = move-exception
            goto L87
        L7e:
            r0 = move-exception
            goto L8d
        L80:
            r3 = move-exception
            goto Lae
        L82:
            if (r3 != 0) goto L86
            java.lang.Object r3 = defpackage.k1.Z     // Catch: java.lang.Throwable -> L7c java.util.concurrent.CancellationException -> L7e java.util.concurrent.ExecutionException -> L80
        L86:
            return r3
        L87:
            t0 r0 = new t0
            r0.<init>(r6)
            return r0
        L8d:
            if (r1 != 0) goto La8
            t0 r1 = new t0
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "get() threw CancellationException, despite reporting isCancelled() == false: "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r0)
            r1.<init>(r2)
            return r1
        La8:
            q0 r6 = new q0
            r6.<init>(r2, r0)
            return r6
        Lae:
            if (r1 == 0) goto Lc7
            q0 r1 = new q0
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r6 = r5.toString()
            r4.<init>(r6, r3)
            r1.<init>(r2, r4)
            return r1
        Lc7:
            t0 r6 = new t0
            java.lang.Throwable r0 = r3.getCause()
            r6.<init>(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.h(bm7):java.lang.Object");
    }

    public static Object i(Future future) {
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
            Object objI = i(this);
            sb.append("SUCCESS, result=[");
            c(sb, objI);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    public void b() {
    }

    public final void c(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        q0 q0Var;
        Object obj = this.a;
        if (!(obj == null) && !(obj instanceof z0)) {
            return false;
        }
        if (o) {
            q0Var = new q0(z, new CancellationException("Future.cancel() was called."));
        } else {
            q0Var = z ? q0.c : q0.d;
            Objects.requireNonNull(q0Var);
        }
        boolean z2 = false;
        while (true) {
            if (Y.j(this, obj, q0Var)) {
                e(this, z);
                if (!(obj instanceof z0)) {
                    return true;
                }
                bm7 bm7Var = ((z0) obj).b;
                if (!(bm7Var instanceof d1)) {
                    bm7Var.cancel(z);
                    return true;
                }
                this = (k1) bm7Var;
                obj = this.a;
                if (!(obj == null) && !(obj instanceof z0)) {
                    return true;
                }
                z2 = true;
            } else {
                obj = this.a;
                if (!(obj instanceof z0)) {
                    return z2;
                }
            }
        }
    }

    @Override // defpackage.bm7
    public void d(Runnable runnable, Executor executor) {
        v0 v0Var;
        v0 v0Var2;
        z04.l(executor, "Executor was null.");
        if (!isDone() && (v0Var = this.b) != (v0Var2 = v0.d)) {
            v0 v0Var3 = new v0(runnable, executor);
            do {
                v0Var3.c = v0Var;
                if (Y.i(this, v0Var, v0Var3)) {
                    return;
                } else {
                    v0Var = this.b;
                }
            } while (v0Var != v0Var2);
        }
        f(runnable, executor);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x00b4 -> B:36:0x007d). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object get(long r20, java.util.concurrent.TimeUnit r22) throws java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            Method dump skipped, instructions count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public boolean isCancelled() {
        return this.a instanceof q0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return (!(r2 instanceof z0)) & (this.a != null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    public final void k(i1 i1Var) {
        i1Var.a = null;
        while (true) {
            i1 i1Var2 = this.c;
            if (i1Var2 == i1.c) {
                return;
            }
            i1 i1Var3 = null;
            while (i1Var2 != null) {
                i1 i1Var4 = i1Var2.b;
                if (i1Var2.a != null) {
                    i1Var3 = i1Var2;
                } else if (i1Var3 != null) {
                    i1Var3.b = i1Var4;
                    if (i1Var3.a == null) {
                        break;
                    }
                } else if (!Y.k(this, i1Var2, i1Var4)) {
                    break;
                }
                i1Var2 = i1Var4;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = Z;
        }
        if (!Y.j(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        if (!Y.j(this, null, new t0(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Lcd
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.a(r0)
            goto Lcd
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.a
            boolean r4 = r3 instanceof defpackage.z0
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L91
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            z0 r3 = (defpackage.z0) r3
            bm7 r3 = r3.b
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L8d
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L8d
        L83:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8d:
            r0.append(r2)
            goto Lbd
        L91:
            java.lang.String r3 = r6.j()     // Catch: java.lang.Throwable -> L9f
            if (r3 == 0) goto L9d
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> L9f
            if (r4 == 0) goto Lb0
        L9d:
            r3 = 0
            goto Lb0
        L9f:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb0:
            if (r3 == 0) goto Lbd
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lbd:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Lcd
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.a(r0)
        Lcd:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k1.toString():java.lang.String");
    }

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.a;
            if ((obj2 != null) & (!(obj2 instanceof z0))) {
                return g(obj2);
            }
            i1 i1Var = this.c;
            i1 i1Var2 = i1.c;
            if (i1Var != i1Var2) {
                i1 i1Var3 = new i1();
                do {
                    tpa tpaVar = Y;
                    tpaVar.C(i1Var3, i1Var);
                    if (tpaVar.k(this, i1Var, i1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.a;
                            } else {
                                k(i1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof z0))));
                        return g(obj);
                    }
                    i1Var = this.c;
                } while (i1Var != i1Var2);
            }
            Object obj3 = this.a;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
