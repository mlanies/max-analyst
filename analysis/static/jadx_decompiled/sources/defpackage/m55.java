package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes2.dex */
public class m55 implements ExecutorService {
    public static final AtomicInteger v0 = new AtomicInteger(0);
    public volatile boolean X;
    public final AtomicLong Y;
    public final qv7 Z;
    public final ExecutorService a;
    public final hba b;
    public final boolean c;
    public final j55 o;
    public final ReentrantReadWriteLock s0;
    public final Condition t0;
    public volatile Thread u0;

    public m55(ExecutorService executorService, hba hbaVar, m56 m56Var) {
        j55.t.getClass();
        sp3 sp3Var = sp3.c;
        this.a = executorService;
        this.b = hbaVar;
        this.c = false;
        this.o = sp3Var;
        this.Y = new AtomicLong(0L);
        qv7 qv7Var = new qv7();
        qv7Var.b = i24.c;
        qv7Var.c = i24.d;
        qv7Var.d = i24.e;
        qv7Var.c(6);
        this.Z = qv7Var;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.s0 = reentrantReadWriteLock;
        this.t0 = reentrantReadWriteLock.writeLock().newCondition();
        m56Var.invoke(new dd4(17, this));
    }

    public static long c(long j, long j2) {
        long jE = ft4.e(j);
        long jE2 = ft4.e(j2);
        long j3 = jE + jE2;
        return ((jE ^ j3) & (jE2 ^ j3)) < 0 ? z7.S(Long.MAX_VALUE, kt4.MILLISECONDS) : z7.S(j3, kt4.MILLISECONDS);
    }

    public final void a(long j) {
        qv7 qv7Var = this.Z;
        ReentrantReadWriteLock reentrantReadWriteLock = this.s0;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            qv7Var.d(j);
            int i3 = qv7Var.f;
            int i4 = qv7Var.e;
            if (i3 / i4 < 0.25f && i4 >= 4192) {
                int i5 = i3 == 7 ? 8 : i3 + ((i3 - 1) / 7);
                int iNumberOfLeadingZeros = i5 > 0 ? (-1) >>> Integer.numberOfLeadingZeros(i5) : 0;
                if (iNumberOfLeadingZeros < i4) {
                    qv7Var.e(iNumberOfLeadingZeros);
                }
            }
            this.t0.signal();
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        } catch (Throwable th) {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
            throw th;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public final urf b() {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        long jG = g();
        return new urf(name, jG, jG, null, this.c ? l6d.i0(l6d.Z(l6d.Y(ys.Q(threadCurrentThread.getStackTrace()), 2), new jy2(11, this))) : nz4.a);
    }

    public final void d() {
        this.X = true;
        ReentrantReadWriteLock reentrantReadWriteLock = this.s0;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.t0.signal();
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final long e(urf urfVar) {
        long andIncrement = this.Y.getAndIncrement();
        ReentrantReadWriteLock reentrantReadWriteLock = this.s0;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            this.Z.f(andIncrement, urf.a(urfVar, 0L, this.u0, 23));
            return andIncrement;
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(i(runnable, b()));
    }

    public final void f(long j) {
        qv7 qv7Var = this.Z;
        ReentrantReadWriteLock reentrantReadWriteLock = this.s0;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        int i = 0;
        int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
        for (int i2 = 0; i2 < readHoldCount; i2++) {
            lock.unlock();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            urf urfVar = (urf) qv7Var.b(j);
            urf urfVarA = urfVar != null ? urf.a(urfVar, g(), Thread.currentThread(), 19) : null;
            if (urfVarA != null) {
                qv7Var.f(j, urfVarA);
            }
        } finally {
            while (i < readHoldCount) {
                lock.lock();
                i++;
            }
            writeLock.unlock();
        }
    }

    public final long g() {
        ((sp3) this.o).getClass();
        int i = ft4.o;
        return z7.S(System.nanoTime(), kt4.NANOSECONDS);
    }

    public final k55 h(Callable callable, urf urfVar) {
        return new k55(callable, new g55(this, e(urfVar), 0), new h55(this, 0));
    }

    public final l55 i(Runnable runnable, urf urfVar) {
        return new l55(runnable, new g55(this, e(urfVar), 1), new h55(this, 1));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.a.shutdown();
        d();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        List<Runnable> listShutdownNow = this.a.shutdownNow();
        ArrayList arrayList = new ArrayList();
        for (Runnable runnable : listShutdownNow) {
            if (runnable instanceof l55) {
                runnable = ((l55) runnable).a;
            }
            arrayList.add(runnable);
        }
        d();
        return arrayList;
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Callable callable) {
        return this.a.submit(h(callable, b()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(i(runnable, b()), obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future submit(Runnable runnable) {
        return this.a.submit(i(runnable, b()));
    }

    @Override // java.util.concurrent.ExecutorService
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAll(arrayList, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList(z53.S(collection, 10));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h((Callable) it.next(), b()));
        }
        return this.a.invokeAny(arrayList, j, timeUnit);
    }
}
