package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class v28 extends ConcurrentLinkedQueue implements y28 {
    public int a;
    public final AtomicInteger b = new AtomicInteger();

    @Override // defpackage.y28
    public final int d() {
        return this.b.get();
    }

    @Override // defpackage.y28
    public final int i() {
        return this.a;
    }

    @Override // defpackage.y28
    public final void k() {
        poll();
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, defpackage.dqd
    public final boolean offer(Object obj) {
        this.b.getAndIncrement();
        return super.offer(obj);
    }

    @Override // java.util.concurrent.ConcurrentLinkedQueue, java.util.Queue, defpackage.dqd
    public final Object poll() {
        Object objPoll = super.poll();
        if (objPoll != null) {
            this.a++;
        }
        return objPoll;
    }
}
