package defpackage;

import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.LongAccumulator;
import java.util.concurrent.atomic.LongAdder;

/* loaded from: classes2.dex */
public final class n0f implements ct0 {
    public final ct0 a;
    public final LongAdder b = new LongAdder();
    public final LongAdder c = new LongAdder();
    public final AtomicLong d = new AtomicLong();
    public final LongAccumulator e = new LongAccumulator(new m0f(), 0);
    public final LongAdder f = new LongAdder();
    public final LongAdder g = new LongAdder();

    public n0f(hk4 hk4Var) {
        this.a = hk4Var;
    }

    @Override // defpackage.ct0
    public final ByteBuffer a(int i) {
        long j = i;
        this.b.add(j);
        this.d.addAndGet(j);
        this.f.increment();
        return this.a.a(i);
    }

    @Override // defpackage.ct0
    public final void b(ByteBuffer byteBuffer) {
        long jCapacity = byteBuffer.capacity();
        this.c.add(jCapacity);
        LongAccumulator longAccumulator = this.e;
        AtomicLong atomicLong = this.d;
        longAccumulator.accumulate(atomicLong.longValue());
        atomicLong.addAndGet(-jCapacity);
        this.g.increment();
        this.a.b(byteBuffer);
    }
}
