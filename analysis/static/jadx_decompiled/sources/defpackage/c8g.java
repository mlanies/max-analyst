package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c8g {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(c8g.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(c8g.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(c8g.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(c8g.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final nne a(nne nneVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c;
        if (atomicIntegerFieldUpdater.get(this) - d.get(this) == 127) {
            return nneVar;
        }
        if (((fm5) nneVar.taskContext).b == 1) {
            e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, nneVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final nne b() {
        nne nneVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (nneVar = (nne) this.a.getAndSet(i2, null)) != null) {
                if (((fm5) nneVar.taskContext).b == 1) {
                    e.decrementAndGet(this);
                }
                return nneVar;
            }
        }
    }

    public final nne c(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        nne nneVar = (nne) atomicReferenceArray.get(i2);
        if (nneVar != null) {
            if ((((fm5) nneVar.taskContext).b == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i2, nneVar, null)) {
                    if (atomicReferenceArray.get(i2) != nneVar) {
                    }
                }
                if (z) {
                    e.decrementAndGet(this);
                }
                return nneVar;
            }
        }
        return null;
    }
}
