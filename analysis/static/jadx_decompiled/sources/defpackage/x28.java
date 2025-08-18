package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class x28 extends AtomicReferenceArray implements y28 {
    public final AtomicInteger a;
    public int b;

    public x28(int i) {
        super(i);
        this.a = new AtomicInteger();
    }

    @Override // defpackage.dqd
    public final void clear() {
        do {
            int i = this.b;
            Object obj = null;
            if (i != length()) {
                AtomicInteger atomicInteger = this.a;
                while (true) {
                    Object obj2 = get(i);
                    if (obj2 != null) {
                        this.b = i + 1;
                        lazySet(i, null);
                        obj = obj2;
                        break;
                    } else if (atomicInteger.get() == i) {
                        break;
                    }
                }
            }
            if (obj == null) {
                return;
            }
        } while (!isEmpty());
    }

    @Override // defpackage.y28
    public final int d() {
        return this.a.get();
    }

    @Override // defpackage.y28
    public final int i() {
        return this.b;
    }

    @Override // defpackage.dqd
    public final boolean isEmpty() {
        return this.b == this.a.get();
    }

    @Override // defpackage.y28
    public final void k() {
        int i = this.b;
        lazySet(i, null);
        this.b = i + 1;
    }

    @Override // defpackage.dqd
    public final boolean offer(Object obj) {
        Objects.requireNonNull(obj, "value is null");
        int andIncrement = this.a.getAndIncrement();
        if (andIncrement >= length()) {
            return false;
        }
        lazySet(andIncrement, obj);
        return true;
    }

    @Override // defpackage.y28
    public final Object peek() {
        int i = this.b;
        if (i == length()) {
            return null;
        }
        return get(i);
    }

    @Override // defpackage.dqd
    public final Object poll() {
        int i = this.b;
        if (i == length()) {
            return null;
        }
        AtomicInteger atomicInteger = this.a;
        do {
            Object obj = get(i);
            if (obj != null) {
                this.b = i + 1;
                lazySet(i, null);
                return obj;
            }
        } while (atomicInteger.get() != i);
        return null;
    }
}
