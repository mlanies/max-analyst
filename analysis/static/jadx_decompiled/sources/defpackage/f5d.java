package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class f5d implements c5d {
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(f5d.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater d = AtomicLongFieldUpdater.newUpdater(f5d.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(f5d.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater f = AtomicLongFieldUpdater.newUpdater(f5d.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater g = AtomicIntegerFieldUpdater.newUpdater(f5d.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int a;
    public final vq0 b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    public f5d(int i, int i2) {
        this.a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(zr6.h(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(zr6.h(i, "The number of acquired permits should be in 0..").toString());
        }
        h5d h5dVar = new h5d(0L, null, 2);
        this.head$volatile = h5dVar;
        this.tail$volatile = h5dVar;
        this._availablePermits$volatile = i - i2;
        this.b = new vq0(5, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        r5.e(r3, r4.b);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.hu3 r5) {
        /*
            r4 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.f5d.g
            int r1 = r0.getAndDecrement(r4)
            int r2 = r4.a
            if (r1 > r2) goto L0
            e5f r3 = defpackage.e5f.a
            if (r1 <= 0) goto Lf
            goto L41
        Lf:
            kotlin.coroutines.Continuation r5 = defpackage.v3c.u(r5)
            sy1 r5 = defpackage.nu0.o(r5)
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L34
        L1d:
            int r1 = r0.getAndDecrement(r4)     // Catch: java.lang.Throwable -> L32
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2b
            vq0 r4 = r4.b     // Catch: java.lang.Throwable -> L32
            r5.e(r3, r4)     // Catch: java.lang.Throwable -> L32
            goto L34
        L2b:
            boolean r1 = r4.b(r5)     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L1d
            goto L34
        L32:
            r4 = move-exception
            goto L42
        L34:
            java.lang.Object r4 = r5.m()
            tx3 r5 = defpackage.tx3.a
            if (r4 != r5) goto L3d
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 != r5) goto L41
            r3 = r4
        L41:
            return r3
        L42:
            r5.u()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f5d.a(hu3):java.lang.Object");
    }

    public final boolean b(irf irfVar) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        h5d h5dVar = (h5d) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f.getAndIncrement(this);
        d5d d5dVar = d5d.a;
        long j = andIncrement / g5d.f;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(h5dVar, j, d5dVar);
            if (!SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM26getSegmentimpl = SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM26getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM26getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM26getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM26getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM26getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            } else {
                break;
            }
        }
        h5d h5dVar2 = (h5d) SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % g5d.f);
        AtomicReferenceArray atomicReferenceArray = h5dVar2.a;
        while (!atomicReferenceArray.compareAndSet(i, null, irfVar)) {
            if (atomicReferenceArray.get(i) != null) {
                Symbol symbol = g5d.b;
                Symbol symbol2 = g5d.c;
                AtomicReferenceArray atomicReferenceArray2 = h5dVar2.a;
                while (!atomicReferenceArray2.compareAndSet(i, symbol, symbol2)) {
                    if (atomicReferenceArray2.get(i) != symbol) {
                        return false;
                    }
                }
                ((ry1) irfVar).e(e5f.a, this.b);
                return true;
            }
        }
        irfVar.a(h5dVar2, i);
        return true;
    }

    public final void c() {
        int i;
        Object objFindSegmentInternal;
        boolean zG;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = g;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.a;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            h5d h5dVar = (h5d) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = d.getAndIncrement(this);
            long j = andIncrement2 / g5d.f;
            e5d e5dVar = e5d.a;
            while (true) {
                objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(h5dVar, j, e5dVar);
                if (SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal)) {
                    break;
                }
                Segment segmentM26getSegmentimpl = SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM26getSegmentimpl.id) {
                        break;
                    }
                    if (!segmentM26getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM26getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(this) != segment) {
                            if (segmentM26getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                                segmentM26getSegmentimpl.remove();
                            }
                        }
                    }
                    if (segment.decPointers$kotlinx_coroutines_core()) {
                        segment.remove();
                    }
                }
            }
            h5d h5dVar2 = (h5d) SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
            h5dVar2.cleanPrev();
            zG = false;
            if (h5dVar2.id <= j) {
                int i3 = (int) (andIncrement2 % g5d.f);
                Symbol symbol = g5d.b;
                AtomicReferenceArray atomicReferenceArray = h5dVar2.a;
                Object andSet = atomicReferenceArray.getAndSet(i3, symbol);
                if (andSet == null) {
                    int i4 = g5d.a;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == g5d.c) {
                            zG = true;
                            break;
                        }
                    }
                    Symbol symbol2 = g5d.b;
                    Symbol symbol3 = g5d.d;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, symbol2, symbol3)) {
                            if (atomicReferenceArray.get(i3) != symbol2) {
                                break;
                            }
                        } else {
                            zG = true;
                            break;
                        }
                    }
                    zG = !zG;
                } else if (andSet != g5d.e) {
                    boolean z = andSet instanceof ry1;
                    e5f e5fVar = e5f.a;
                    if (z) {
                        ry1 ry1Var = (ry1) andSet;
                        Symbol symbolL = ry1Var.l(e5fVar, this.b);
                        if (symbolL != null) {
                            ry1Var.q(symbolL);
                            zG = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof z3d)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        zG = ((y3d) ((z3d) andSet)).g(this, e5fVar);
                    }
                }
            }
        } while (!zG);
    }
}
