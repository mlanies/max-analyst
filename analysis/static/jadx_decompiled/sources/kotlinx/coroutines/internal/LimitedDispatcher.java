package kotlinx.coroutines.internal;

import defpackage.au1;
import defpackage.cm4;
import defpackage.e5f;
import defpackage.hg4;
import defpackage.hz4;
import defpackage.lx3;
import defpackage.m56;
import defpackage.nx3;
import defpackage.qa4;
import defpackage.ry1;
import defpackage.wmd;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u00019B!\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ4\u0010\u0011\u001a\u00020\u000f2\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0016\u0010\u0010\u001a\u0012\u0012\b\u0012\u00060\u000eR\u00020\u0000\u0012\u0004\u0012\u00020\u000f0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aH\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ,\u0010!\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u00182\n\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096\u0001¢\u0006\u0004\b!\u0010\"J!\u0010#\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b#\u0010$J#\u0010%\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0016¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\n\u0010\f\u001a\u00060\nj\u0002`\u000bH\u0017¢\u0006\u0004\b'\u0010&J\u000f\u0010(\u001a\u00020\u0006H\u0016¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u0018H\u0097A¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010.R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010/R\u001e\u00101\u001a\f\u0012\b\u0012\u00060\nj\u0002`\u000b008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u000603j\u0002`48\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u000b\u00108\u001a\u0002078\u0002X\u0082\u0004¨\u0006:"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lnx3;", "Lhg4;", "dispatcher", "", "parallelism", "", "name", "<init>", "(Lnx3;ILjava/lang/String;)V", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlin/Function1;", "Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Le5f;", "startWorker", "dispatchInternal", "(Ljava/lang/Runnable;Lm56;)V", "", "tryAllocateWorker", "()Z", "obtainTaskOrDeallocateWorker", "()Ljava/lang/Runnable;", "", "timeMillis", "Lry1;", "continuation", "scheduleResumeAfterDelay", "(JLry1;)V", "Llx3;", "context", "Lcm4;", "invokeOnTimeout", "(JLjava/lang/Runnable;Llx3;)Lcm4;", "limitedParallelism", "(ILjava/lang/String;)Lnx3;", "dispatch", "(Llx3;Ljava/lang/Runnable;)V", "dispatchYield", "toString", "()Ljava/lang/String;", "time", "delay", "(J)V", "Lnx3;", "I", "Ljava/lang/String;", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "queue", "Lkotlinx/coroutines/internal/LockFreeTaskQueue;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "workerAllocationLock", "Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class LimitedDispatcher extends nx3 implements hg4 {
    private static final /* synthetic */ AtomicIntegerFieldUpdater runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    private final /* synthetic */ hg4 $$delegate_0;
    private final nx3 dispatcher;
    private final String name;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final Object workerAllocationLock;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0013\u0012\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00060\u0001j\u0002`\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "currentTask", "<init>", "(Lkotlinx/coroutines/internal/LimitedDispatcher;Ljava/lang/Runnable;)V", "Le5f;", "run", "()V", "Ljava/lang/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
    public final class Worker implements Runnable {
        private Runnable currentTask;

        public Worker(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    wmd.v(hz4.a, th);
                }
                Runnable runnableObtainTaskOrDeallocateWorker = LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                if (runnableObtainTaskOrDeallocateWorker == null) {
                    return;
                }
                this.currentTask = runnableObtainTaskOrDeallocateWorker;
                i++;
                if (i >= 16 && LimitedDispatcher.this.dispatcher.isDispatchNeeded(LimitedDispatcher.this)) {
                    LimitedDispatcher.this.dispatcher.mo20dispatch(LimitedDispatcher.this, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(nx3 nx3Var, int i, String str) {
        hg4 hg4Var = nx3Var instanceof hg4 ? (hg4) nx3Var : null;
        this.$$delegate_0 = hg4Var == null ? qa4.a : hg4Var;
        this.dispatcher = nx3Var;
        this.parallelism = i;
        this.name = str;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    private final void dispatchInternal(Runnable block, m56 startWorker) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            startWorker.invoke(new Worker(runnableObtainTaskOrDeallocateWorker));
        }
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnableRemoveFirstOrNull = this.queue.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                runningWorkers$volatile$FU.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                runningWorkers$volatile$FU.incrementAndGet(this);
            }
        }
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int i) {
        this.runningWorkers$volatile = i;
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            if (runningWorkers$volatile$FU.get(this) >= this.parallelism) {
                return false;
            }
            runningWorkers$volatile$FU.incrementAndGet(this);
            return true;
        }
    }

    @Override // defpackage.hg4
    public Object delay(long j, Continuation<? super e5f> continuation) {
        return this.$$delegate_0.delay(j, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: dispatch */
    public void mo20dispatch(lx3 context, Runnable block) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.mo20dispatch(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // defpackage.nx3
    public void dispatchYield(lx3 context, Runnable block) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(block);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        this.dispatcher.dispatchYield(this, new Worker(runnableObtainTaskOrDeallocateWorker));
    }

    @Override // defpackage.hg4
    public cm4 invokeOnTimeout(long timeMillis, Runnable block, lx3 context) {
        return this.$$delegate_0.invokeOnTimeout(timeMillis, block, context);
    }

    @Override // defpackage.nx3
    public nx3 limitedParallelism(int parallelism, String name) {
        LimitedDispatcherKt.checkParallelism(parallelism);
        return parallelism >= this.parallelism ? LimitedDispatcherKt.namedOrThis(this, name) : super.limitedParallelism(parallelism, name);
    }

    @Override // defpackage.hg4
    /* renamed from: scheduleResumeAfterDelay */
    public void mo21scheduleResumeAfterDelay(long timeMillis, ry1 continuation) {
        this.$$delegate_0.mo21scheduleResumeAfterDelay(timeMillis, continuation);
    }

    @Override // defpackage.nx3
    /* renamed from: toString */
    public String getName() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dispatcher);
        sb.append(".limitedParallelism(");
        return au1.h(sb, this.parallelism, ')');
    }
}
