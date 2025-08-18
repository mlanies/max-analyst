package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.ThreadSafeHeap;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

/* loaded from: classes.dex */
public abstract class x35 implements Runnable, Comparable, cm4, ThreadSafeHeapNode {
    private volatile Object _heap;
    public long a;
    public int b = -1;

    public x35(long j) {
        this.a = j;
    }

    public final int b(long j, y35 y35Var, z35 z35Var) {
        synchronized (this) {
            if (this._heap == b45.a) {
                return 2;
            }
            synchronized (y35Var) {
                try {
                    x35 x35Var = (x35) y35Var.firstImpl();
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z35.X;
                    z35Var.getClass();
                    if (z35.Z.get(z35Var) != 0) {
                        return 1;
                    }
                    if (x35Var == null) {
                        y35Var.b = j;
                    } else {
                        long j2 = x35Var.a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - y35Var.b > 0) {
                            y35Var.b = j;
                        }
                    }
                    long j3 = this.a;
                    long j4 = y35Var.b;
                    if (j3 - j4 < 0) {
                        this.a = j4;
                    }
                    y35Var.addImpl(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.a - ((x35) obj).a;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // defpackage.cm4
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                Symbol symbol = b45.a;
                if (obj == symbol) {
                    return;
                }
                y35 y35Var = obj instanceof y35 ? (y35) obj : null;
                if (y35Var != null) {
                    y35Var.remove(this);
                }
                this._heap = symbol;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final ThreadSafeHeap getHeap() {
        Object obj = this._heap;
        if (obj instanceof ThreadSafeHeap) {
            return (ThreadSafeHeap) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final int getIndex() {
        return this.b;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setHeap(ThreadSafeHeap threadSafeHeap) {
        if (this._heap == b45.a) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = threadSafeHeap;
    }

    @Override // kotlinx.coroutines.internal.ThreadSafeHeapNode
    public final void setIndex(int i) {
        this.b = i;
    }

    public String toString() {
        return z7b.i(new StringBuilder("Delayed[nanos="), this.a, ']');
    }
}
