package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class owd extends AtomicReferenceArray implements bqd {
    public static final Integer Y = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    public final int X;
    public final int a;
    public final AtomicLong b;
    public long c;
    public final AtomicLong o;

    public owd(int i) {
        super(1 << (32 - Integer.numberOfLeadingZeros(i - 1)));
        this.a = length() - 1;
        this.b = new AtomicLong();
        this.o = new AtomicLong();
        this.X = Math.min(i / 4, Y.intValue());
    }

    @Override // defpackage.dqd
    public final void clear() {
        while (true) {
            AtomicLong atomicLong = this.o;
            long j = atomicLong.get();
            int i = ((int) j) & this.a;
            Object obj = get(i);
            if (obj == null) {
                obj = null;
            } else {
                atomicLong.lazySet(j + 1);
                lazySet(i, null);
            }
            if (obj == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.b.get() == this.o.get();
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null is not a valid element");
        }
        AtomicLong atomicLong = this.b;
        long j = atomicLong.get();
        int i = this.a;
        int i2 = ((int) j) & i;
        if (j >= this.c) {
            long j2 = this.X + j;
            if (get(i & ((int) j2)) == null) {
                this.c = j2;
            } else if (get(i2) != null) {
                return false;
            }
        }
        lazySet(i2, obj);
        atomicLong.lazySet(j + 1);
        return true;
    }

    @Override // defpackage.dqd
    public final Object poll() {
        AtomicLong atomicLong = this.o;
        long j = atomicLong.get();
        int i = ((int) j) & this.a;
        Object obj = get(i);
        if (obj == null) {
            return null;
        }
        atomicLong.lazySet(j + 1);
        lazySet(i, null);
        return obj;
    }
}
