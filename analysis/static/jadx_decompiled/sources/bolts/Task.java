package bolts;

import defpackage.az1;
import defpackage.dne;
import defpackage.ene;
import defpackage.fne;
import defpackage.gne;
import defpackage.gu3;
import defpackage.hne;
import defpackage.hz1;
import defpackage.i76;
import defpackage.ine;
import defpackage.jne;
import defpackage.kne;
import defpackage.ld;
import defpackage.lne;
import defpackage.n5f;
import defpackage.q57;
import defpackage.rne;
import defpackage.vk4;
import defpackage.xp0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class Task<TResult> {
    public static final ExecutorService BACKGROUND_EXECUTOR;
    private static final Executor IMMEDIATE_EXECUTOR;
    private static Task<?> TASK_CANCELLED;
    private static Task<Boolean> TASK_FALSE;
    private static Task<?> TASK_NULL;
    private static Task<Boolean> TASK_TRUE;
    public static final Executor UI_THREAD_EXECUTOR;
    private static volatile lne unobservedExceptionHandler;
    private boolean cancelled;
    private boolean complete;
    private Exception error;
    private boolean errorHasBeenObserved;
    private TResult result;
    private n5f unobservedErrorNotifier;
    private final Object lock = new Object();
    private List<gu3> continuations = new ArrayList();

    static {
        xp0 xp0Var = xp0.d;
        BACKGROUND_EXECUTOR = xp0Var.a;
        IMMEDIATE_EXECUTOR = xp0Var.c;
        UI_THREAD_EXECUTOR = ld.b.a;
        TASK_NULL = new Task<>((Object) null);
        TASK_TRUE = new Task<>(Boolean.TRUE);
        TASK_FALSE = new Task<>(Boolean.FALSE);
        TASK_CANCELLED = new Task<>(true);
    }

    public Task() {
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor) {
        return call(callable, executor, null);
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable) {
        return call(callable, BACKGROUND_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> cancelled() {
        return (Task<TResult>) TASK_CANCELLED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeAfterTask(rne rneVar, gu3 gu3Var, Task<TResult> task, Executor executor, az1 az1Var) {
        try {
            executor.execute(new fne(rneVar, gu3Var, task, 1));
        } catch (Exception e) {
            rneVar.b(new ExecutorException(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <TContinuationResult, TResult> void completeImmediately(rne rneVar, gu3 gu3Var, Task<TResult> task, Executor executor, az1 az1Var) {
        try {
            executor.execute(new fne(rneVar, gu3Var, task, 0));
        } catch (Exception e) {
            rneVar.b(new ExecutorException(e));
        }
    }

    public static <TResult> kne create() {
        new Task();
        return new kne();
    }

    public static Task<Void> delay(long j) {
        return delay(j, xp0.d.b, null);
    }

    public static <TResult> Task<TResult> forError(Exception exc) {
        Task<TResult> task = new Task<>();
        if (task.trySetError(exc)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the error on a completed task.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <TResult> Task<TResult> forResult(TResult tresult) {
        if (tresult == 0) {
            return (Task<TResult>) TASK_NULL;
        }
        if (tresult instanceof Boolean) {
            return ((Boolean) tresult).booleanValue() ? (Task<TResult>) TASK_TRUE : (Task<TResult>) TASK_FALSE;
        }
        Task<TResult> task = new Task<>();
        if (task.trySetResult(tresult)) {
            return task;
        }
        throw new IllegalStateException("Cannot set the result of a completed task.");
    }

    public static lne getUnobservedExceptionHandler() {
        return null;
    }

    private void runContinuations() {
        synchronized (this.lock) {
            Iterator<gu3> it = this.continuations.iterator();
            while (it.hasNext()) {
                try {
                    it.next().a(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.continuations = null;
        }
    }

    public static void setUnobservedExceptionHandler(lne lneVar) {
    }

    public static Task<Void> whenAll(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rne rneVar = new rne();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new jne(obj, arrayList, atomicBoolean, atomicInteger, rneVar));
        }
        return rneVar.a;
    }

    public static <TResult> Task<List<TResult>> whenAllResult(Collection<? extends Task<TResult>> collection) {
        return (Task<List<TResult>>) whenAll(collection).onSuccess(new gne(1, collection));
    }

    public static Task<Task<?>> whenAny(Collection<? extends Task<?>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rne rneVar = new rne();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<?>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new ine(atomicBoolean, rneVar, 1));
        }
        return rneVar.a;
    }

    public static <TResult> Task<Task<TResult>> whenAnyResult(Collection<? extends Task<TResult>> collection) {
        if (collection.size() == 0) {
            return forResult(null);
        }
        rne rneVar = new rne();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends Task<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            it.next().continueWith(new ine(atomicBoolean, rneVar, 0));
        }
        return rneVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <TOut> Task<TOut> cast() {
        return this;
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, gu3 gu3Var) {
        return continueWhile(callable, gu3Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(gu3 gu3Var, Executor executor) {
        return continueWith(gu3Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(gu3 gu3Var, Executor executor) {
        return continueWithTask(gu3Var, executor, null);
    }

    public Exception getError() {
        Exception exc;
        synchronized (this.lock) {
            try {
                exc = this.error;
                if (exc != null) {
                    this.errorHasBeenObserved = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return exc;
    }

    public TResult getResult() {
        TResult tresult;
        synchronized (this.lock) {
            tresult = this.result;
        }
        return tresult;
    }

    public boolean isCancelled() {
        boolean z;
        synchronized (this.lock) {
            z = this.cancelled;
        }
        return z;
    }

    public boolean isCompleted() {
        boolean z;
        synchronized (this.lock) {
            z = this.complete;
        }
        return z;
    }

    public boolean isFaulted() {
        boolean z;
        synchronized (this.lock) {
            z = getError() != null;
        }
        return z;
    }

    public Task<Void> makeVoid() {
        return continueWithTask(new hne());
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(gu3 gu3Var, Executor executor) {
        return onSuccess(gu3Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(gu3 gu3Var, Executor executor) {
        return onSuccessTask(gu3Var, executor, null);
    }

    public boolean trySetCancelled() {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.cancelled = true;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetError(Exception exc) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.error = exc;
                this.errorHasBeenObserved = false;
                this.lock.notifyAll();
                runContinuations();
                if (!this.errorHasBeenObserved) {
                    getUnobservedExceptionHandler();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean trySetResult(TResult tresult) {
        synchronized (this.lock) {
            try {
                if (this.complete) {
                    return false;
                }
                this.complete = true;
                this.result = tresult;
                this.lock.notifyAll();
                runContinuations();
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void waitForCompletion() throws InterruptedException {
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, Executor executor, az1 az1Var) {
        rne rneVar = new rne();
        try {
            executor.execute(new i76(rneVar, 24, callable));
        } catch (Exception e) {
            rneVar.b(new ExecutorException(e));
        }
        return rneVar.a;
    }

    public static <TResult> Task<TResult> callInBackground(Callable<TResult> callable, az1 az1Var) {
        return call(callable, BACKGROUND_EXECUTOR, az1Var);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, gu3 gu3Var, az1 az1Var) {
        return continueWhile(callable, gu3Var, IMMEDIATE_EXECUTOR, az1Var);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(gu3 gu3Var, Executor executor, az1 az1Var) {
        boolean zIsCompleted;
        rne rneVar = new rne();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new dne(rneVar, gu3Var, executor, 0));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeImmediately(rneVar, gu3Var, this, executor, az1Var);
        }
        return rneVar.a;
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(gu3 gu3Var, Executor executor, az1 az1Var) {
        boolean zIsCompleted;
        rne rneVar = new rne();
        synchronized (this.lock) {
            try {
                zIsCompleted = isCompleted();
                if (!zIsCompleted) {
                    this.continuations.add(new dne(rneVar, gu3Var, executor, 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zIsCompleted) {
            completeAfterTask(rneVar, gu3Var, this, executor, az1Var);
        }
        return rneVar.a;
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(gu3 gu3Var, Executor executor, az1 az1Var) {
        return continueWithTask(new ene(gu3Var, 0), executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(gu3 gu3Var, Executor executor, az1 az1Var) {
        return continueWithTask(new ene(gu3Var, 1), executor);
    }

    public static Task<Void> delay(long j, az1 az1Var) {
        return delay(j, xp0.d.b, az1Var);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, gu3 gu3Var, Executor executor) {
        return continueWhile(callable, gu3Var, executor, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(gu3 gu3Var) {
        return onSuccess(gu3Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(gu3 gu3Var) {
        return onSuccessTask(gu3Var, IMMEDIATE_EXECUTOR);
    }

    private Task(TResult tresult) {
        trySetResult(tresult);
    }

    public Task<Void> continueWhile(Callable<Boolean> callable, gu3 gu3Var, Executor executor, az1 az1Var) {
        hz1 hz1Var = new hz1(0);
        hz1Var.b = new vk4(callable, gu3Var, executor, hz1Var);
        return makeVoid().continueWithTask((gu3) hz1Var.b, executor);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccess(gu3 gu3Var, az1 az1Var) {
        return onSuccess(gu3Var, IMMEDIATE_EXECUTOR, az1Var);
    }

    public <TContinuationResult> Task<TContinuationResult> onSuccessTask(gu3 gu3Var, az1 az1Var) {
        return onSuccessTask(gu3Var, IMMEDIATE_EXECUTOR, az1Var);
    }

    public static Task<Void> delay(long j, ScheduledExecutorService scheduledExecutorService, az1 az1Var) {
        if (j <= 0) {
            return forResult(null);
        }
        rne rneVar = new rne();
        scheduledExecutorService.schedule(new q57(27, rneVar), j, TimeUnit.MILLISECONDS);
        return rneVar.a;
    }

    public boolean waitForCompletion(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean zIsCompleted;
        synchronized (this.lock) {
            try {
                if (!isCompleted()) {
                    this.lock.wait(timeUnit.toMillis(j));
                }
                zIsCompleted = isCompleted();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zIsCompleted;
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable) {
        return call(callable, IMMEDIATE_EXECUTOR, null);
    }

    public static <TResult> Task<TResult> call(Callable<TResult> callable, az1 az1Var) {
        return call(callable, IMMEDIATE_EXECUTOR, az1Var);
    }

    private Task(boolean z) {
        if (z) {
            trySetCancelled();
        } else {
            trySetResult(null);
        }
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(gu3 gu3Var) {
        return continueWith(gu3Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(gu3 gu3Var) {
        return continueWithTask(gu3Var, IMMEDIATE_EXECUTOR, null);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWith(gu3 gu3Var, az1 az1Var) {
        return continueWith(gu3Var, IMMEDIATE_EXECUTOR, az1Var);
    }

    public <TContinuationResult> Task<TContinuationResult> continueWithTask(gu3 gu3Var, az1 az1Var) {
        return continueWithTask(gu3Var, IMMEDIATE_EXECUTOR, az1Var);
    }
}
