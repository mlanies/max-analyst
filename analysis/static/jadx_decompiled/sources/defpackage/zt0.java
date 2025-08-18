package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;

/* loaded from: classes.dex */
public class zt0 implements e32 {
    private volatile /* synthetic */ Object _closeCause$volatile;
    public final int a;
    public final m56 b;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    public final vq0 c;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    public static final /* synthetic */ AtomicLongFieldUpdater o = AtomicLongFieldUpdater.newUpdater(zt0.class, "sendersAndCloseStatus$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater X = AtomicLongFieldUpdater.newUpdater(zt0.class, "receivers$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Y = AtomicLongFieldUpdater.newUpdater(zt0.class, "bufferEnd$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater Z = AtomicLongFieldUpdater.newUpdater(zt0.class, "completedExpandBuffersAndPauseFlag$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater s0 = AtomicReferenceFieldUpdater.newUpdater(zt0.class, Object.class, "sendSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater t0 = AtomicReferenceFieldUpdater.newUpdater(zt0.class, Object.class, "receiveSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater u0 = AtomicReferenceFieldUpdater.newUpdater(zt0.class, Object.class, "bufferEndSegment$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater v0 = AtomicReferenceFieldUpdater.newUpdater(zt0.class, Object.class, "_closeCause$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater w0 = AtomicReferenceFieldUpdater.newUpdater(zt0.class, Object.class, "closeHandler$volatile");

    public zt0(int i, m56 m56Var) {
        this.a = i;
        this.b = m56Var;
        if (i < 0) {
            throw new IllegalArgumentException(wg0.g(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j42 j42Var = bu0.a;
        this.bufferEnd$volatile = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag$volatile = Y.get(this);
        j42 j42Var2 = new j42(0L, null, this, 3);
        this.sendSegment$volatile = j42Var2;
        this.receiveSegment$volatile = j42Var2;
        this.bufferEndSegment$volatile = z() ? bu0.a : j42Var2;
        this.c = m56Var != null ? new vq0(1, this) : null;
        this._closeCause$volatile = bu0.s;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object C(defpackage.zt0 r13, kotlin.coroutines.Continuation r14) throws java.lang.Throwable {
        /*
            boolean r0 = r14 instanceof defpackage.xt0
            if (r0 == 0) goto L14
            r0 = r14
            xt0 r0 = (defpackage.xt0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xt0 r0 = new xt0
            r0.<init>(r13, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.o
            tx3 r0 = defpackage.tx3.a
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2e
            defpackage.od2.a0(r14)
            i42 r14 = (defpackage.i42) r14
            java.lang.Object r13 = r14.a
            goto L9a
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            defpackage.od2.a0(r14)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r14 = defpackage.zt0.t0
            java.lang.Object r14 = r14.get(r13)
            j42 r14 = (defpackage.j42) r14
        L41:
            boolean r1 = r13.x()
            if (r1 == 0) goto L51
            java.lang.Throwable r13 = r13.s()
            g42 r14 = new g42
            r14.<init>(r13)
            goto La0
        L51:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = defpackage.zt0.X
            long r4 = r1.getAndIncrement(r13)
            int r1 = defpackage.bu0.b
            long r7 = (long) r1
            long r7 = r4 / r7
            long r9 = (long) r1
            long r9 = r4 % r9
            int r3 = (int) r9
            long r9 = r14.id
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L6e
            j42 r1 = r13.r(r7, r14)
            if (r1 != 0) goto L6d
            goto L41
        L6d:
            r14 = r1
        L6e:
            r12 = 0
            r7 = r13
            r8 = r14
            r9 = r3
            r10 = r4
            java.lang.Object r1 = r7.H(r8, r9, r10, r12)
            kotlinx.coroutines.internal.Symbol r7 = defpackage.bu0.m
            if (r1 == r7) goto La1
            kotlinx.coroutines.internal.Symbol r7 = defpackage.bu0.o
            if (r1 != r7) goto L8b
            long r7 = r13.u()
            int r1 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r1 >= 0) goto L41
            r14.cleanPrev()
            goto L41
        L8b:
            kotlinx.coroutines.internal.Symbol r7 = defpackage.bu0.n
            if (r1 != r7) goto L9c
            r6.Y = r2
            r1 = r13
            r2 = r14
            java.lang.Object r13 = r1.D(r2, r3, r4, r6)
            if (r13 != r0) goto L9a
            return r0
        L9a:
            r14 = r13
            goto La0
        L9c:
            r14.cleanPrev()
            r14 = r1
        La0:
            return r14
        La1:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "unexpected"
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.C(zt0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final j42 a(zt0 zt0Var, long j, j42 j42Var) {
        Object objFindSegmentInternal;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        zt0Var.getClass();
        j42 j42Var2 = bu0.a;
        au0 au0Var = au0.a;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(j42Var, j, au0Var);
            if (!SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM26getSegmentimpl = SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = s0;
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(zt0Var);
                    if (segment.id >= segmentM26getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM26getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(zt0Var, segment, segmentM26getSegmentimpl)) {
                        if (atomicReferenceFieldUpdater.get(zt0Var) != segment) {
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
        boolean zM28isClosedimpl = SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal);
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = X;
        if (zM28isClosedimpl) {
            zt0Var.p();
            if (j42Var.id * bu0.b >= atomicLongFieldUpdater2.get(zt0Var)) {
                return null;
            }
            j42Var.cleanPrev();
            return null;
        }
        j42 j42Var3 = (j42) SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
        long j4 = j42Var3.id;
        if (j4 <= j) {
            return j42Var3;
        }
        long j5 = j4 * bu0.b;
        do {
            atomicLongFieldUpdater = o;
            j2 = atomicLongFieldUpdater.get(zt0Var);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j5) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(zt0Var, j2, (((int) (j2 >> 60)) << 60) + j3));
        if (j42Var3.id * bu0.b >= atomicLongFieldUpdater2.get(zt0Var)) {
            return null;
        }
        j42Var3.cleanPrev();
        return null;
    }

    public static final void b(zt0 zt0Var, Object obj, sy1 sy1Var) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        m56 m56Var = zt0Var.b;
        if (m56Var != null) {
            OnUndeliveredElementKt.callUndeliveredElement(m56Var, obj, sy1Var.b);
        }
        sy1Var.resumeWith(new njc(zt0Var.t()));
    }

    public static final int d(zt0 zt0Var, j42 j42Var, int i, Object obj, long j, Object obj2, boolean z) {
        zt0Var.getClass();
        j42Var.e(i, obj);
        if (z) {
            return zt0Var.I(j42Var, i, obj, j, obj2, z);
        }
        Object objC = j42Var.c(i);
        if (objC == null) {
            if (zt0Var.g(j)) {
                if (j42Var.a(null, i, bu0.d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (j42Var.a(null, i, obj2)) {
                    return 2;
                }
            }
        } else if (objC instanceof irf) {
            j42Var.e(i, null);
            if (zt0Var.F(objC, obj)) {
                j42Var.f(i, bu0.i);
                return 0;
            }
            Symbol symbol = bu0.k;
            if (j42Var.b.getAndSet((i * 2) + 1, symbol) != symbol) {
                j42Var.d(i, true);
            }
            return 5;
        }
        return zt0Var.I(j42Var, i, obj, j, obj2, z);
    }

    public static void v(zt0 zt0Var) {
        zt0Var.getClass();
        AtomicLongFieldUpdater atomicLongFieldUpdater = Z;
        if ((atomicLongFieldUpdater.addAndGet(zt0Var, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(zt0Var) & 4611686018427387904L) != 0) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0011, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A(long r5, defpackage.j42 r7) {
        /*
            r4 = this;
        L0:
            long r0 = r7.id
            int r0 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r0 >= 0) goto L11
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r0 = r7.getNext()
            j42 r0 = (defpackage.j42) r0
            if (r0 != 0) goto Lf
            goto L11
        Lf:
            r7 = r0
            goto L0
        L11:
            boolean r5 = r7.isRemoved()
            if (r5 == 0) goto L22
            kotlinx.coroutines.internal.ConcurrentLinkedListNode r5 = r7.getNext()
            j42 r5 = (defpackage.j42) r5
            if (r5 != 0) goto L20
            goto L22
        L20:
            r7 = r5
            goto L11
        L22:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.zt0.u0
            java.lang.Object r6 = r5.get(r4)
            kotlinx.coroutines.internal.Segment r6 = (kotlinx.coroutines.internal.Segment) r6
            long r0 = r6.id
            long r2 = r7.id
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L33
            goto L49
        L33:
            boolean r0 = r7.tryIncPointers$kotlinx_coroutines_core()
            if (r0 != 0) goto L3a
            goto L11
        L3a:
            boolean r0 = r5.compareAndSet(r4, r6, r7)
            if (r0 == 0) goto L4a
            boolean r4 = r6.decPointers$kotlinx_coroutines_core()
            if (r4 == 0) goto L49
            r6.remove()
        L49:
            return
        L4a:
            java.lang.Object r0 = r5.get(r4)
            if (r0 == r6) goto L3a
            boolean r5 = r7.decPointers$kotlinx_coroutines_core()
            if (r5 == 0) goto L22
            r7.remove()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.A(long, j42):void");
    }

    public final Object B(Object obj, Continuation continuation) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        m56 m56Var = this.b;
        if (m56Var == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56Var, obj, null, 2, null)) == null) {
            sy1Var.resumeWith(new njc(t()));
        } else {
            j47.e(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, t());
            sy1Var.resumeWith(new njc(undeliveredElementExceptionCallUndeliveredElementCatchingException$default));
        }
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(defpackage.j42 r11, int r12, long r13, kotlin.coroutines.Continuation r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.D(j42, int, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void E(irf irfVar, boolean z) {
        Throwable thT;
        if (irfVar instanceof ry1) {
            Continuation continuation = (Continuation) irfVar;
            if (z) {
                thT = s();
                if (thT == null) {
                    thT = new ClosedReceiveChannelException("Channel was closed");
                }
            } else {
                thT = t();
            }
            continuation.resumeWith(new njc(thT));
            return;
        }
        if (irfVar instanceof o8c) {
            ((o8c) irfVar).a.resumeWith(new i42(new g42(s())));
            return;
        }
        if (!(irfVar instanceof tt0)) {
            if (irfVar instanceof z3d) {
                ((y3d) ((z3d) irfVar)).g(this, bu0.l);
                return;
            } else {
                throw new IllegalStateException(("Unexpected waiter: " + irfVar).toString());
            }
        }
        tt0 tt0Var = (tt0) irfVar;
        sy1 sy1Var = tt0Var.b;
        tt0Var.b = null;
        tt0Var.a = bu0.l;
        Throwable thS = tt0Var.c.s();
        if (thS == null) {
            sy1Var.resumeWith(Boolean.FALSE);
        } else {
            sy1Var.resumeWith(new njc(thS));
        }
    }

    public final boolean F(Object obj, Object obj2) {
        if (obj instanceof z3d) {
            return ((y3d) ((z3d) obj)).g(this, obj2);
        }
        boolean z = obj instanceof o8c;
        m56 m56Var = this.b;
        if (z) {
            return bu0.a(((o8c) obj).a, new i42(obj2), m56Var != null ? e() : null);
        }
        if (!(obj instanceof tt0)) {
            if (obj instanceof ry1) {
                return bu0.a((ry1) obj, obj2, m56Var != null ? new ut0(3, this, zt0.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 0) : null);
            }
            throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
        }
        tt0 tt0Var = (tt0) obj;
        sy1 sy1Var = tt0Var.b;
        tt0Var.b = null;
        tt0Var.a = obj2;
        Boolean bool = Boolean.TRUE;
        m56 m56Var2 = tt0Var.c.b;
        return bu0.a(sy1Var, bool, m56Var2 != null ? new rt0(m56Var2, 0, obj2) : null);
    }

    public final boolean G(Object obj, j42 j42Var, int i) {
        char c;
        boolean z = obj instanceof ry1;
        e5f e5fVar = e5f.a;
        if (z) {
            return bu0.a((ry1) obj, e5fVar, null);
        }
        if (!(obj instanceof z3d)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        int iH = ((y3d) obj).h(this, e5fVar);
        Symbol symbol = b4d.a;
        if (iH == 0) {
            c = 1;
        } else if (iH != 1) {
            c = 3;
            if (iH != 2) {
                if (iH != 3) {
                    throw new IllegalStateException(("Unexpected internal result: " + iH).toString());
                }
                c = 4;
            }
        } else {
            c = 2;
        }
        if (c == 2) {
            j42Var.e(i, null);
        }
        return c == 1;
    }

    public final Object H(j42 j42Var, int i, long j, Object obj) {
        Object objC = j42Var.c(i);
        AtomicReferenceArray atomicReferenceArray = j42Var.b;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (objC == null) {
            if (j >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return bu0.n;
                }
                if (j42Var.a(objC, i, obj)) {
                    q();
                    return bu0.m;
                }
            }
        } else if (objC == bu0.d && j42Var.a(objC, i, bu0.i)) {
            q();
            Object obj2 = atomicReferenceArray.get(i * 2);
            j42Var.e(i, null);
            return obj2;
        }
        while (true) {
            Object objC2 = j42Var.c(i);
            if (objC2 == null || objC2 == bu0.e) {
                if (j < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (j42Var.a(objC2, i, bu0.h)) {
                        q();
                        return bu0.o;
                    }
                } else {
                    if (obj == null) {
                        return bu0.n;
                    }
                    if (j42Var.a(objC2, i, obj)) {
                        q();
                        return bu0.m;
                    }
                }
            } else {
                if (objC2 != bu0.d) {
                    Symbol symbol = bu0.j;
                    if (objC2 != symbol && objC2 != bu0.h) {
                        if (objC2 == bu0.l) {
                            q();
                            return bu0.o;
                        }
                        if (objC2 != bu0.g && j42Var.a(objC2, i, bu0.f)) {
                            boolean z = objC2 instanceof jrf;
                            if (z) {
                                objC2 = ((jrf) objC2).a;
                            }
                            if (G(objC2, j42Var, i)) {
                                j42Var.f(i, bu0.i);
                                q();
                                Object obj3 = atomicReferenceArray.get(i * 2);
                                j42Var.e(i, null);
                                return obj3;
                            }
                            j42Var.f(i, symbol);
                            j42Var.onSlotCleaned();
                            if (z) {
                                q();
                            }
                            return bu0.o;
                        }
                    }
                    return bu0.o;
                }
                if (j42Var.a(objC2, i, bu0.i)) {
                    q();
                    Object obj4 = atomicReferenceArray.get(i * 2);
                    j42Var.e(i, null);
                    return obj4;
                }
            }
        }
    }

    public final int I(j42 j42Var, int i, Object obj, long j, Object obj2, boolean z) {
        while (true) {
            Object objC = j42Var.c(i);
            if (objC == null) {
                if (!g(j) || z) {
                    if (z) {
                        if (j42Var.a(null, i, bu0.j)) {
                            j42Var.onSlotCleaned();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (j42Var.a(null, i, obj2)) {
                            return 2;
                        }
                    }
                } else if (j42Var.a(null, i, bu0.d)) {
                    return 1;
                }
            } else {
                if (objC != bu0.e) {
                    Symbol symbol = bu0.k;
                    if (objC == symbol) {
                        j42Var.e(i, null);
                        return 5;
                    }
                    if (objC == bu0.h) {
                        j42Var.e(i, null);
                        return 5;
                    }
                    if (objC == bu0.l) {
                        j42Var.e(i, null);
                        p();
                        return 4;
                    }
                    j42Var.e(i, null);
                    if (objC instanceof jrf) {
                        objC = ((jrf) objC).a;
                    }
                    if (F(objC, obj)) {
                        j42Var.f(i, bu0.i);
                        return 0;
                    }
                    if (j42Var.b.getAndSet((i * 2) + 1, symbol) == symbol) {
                        return 5;
                    }
                    j42Var.d(i, true);
                    return 5;
                }
                if (j42Var.a(objC, i, bu0.d)) {
                    return 1;
                }
            }
        }
    }

    public final void J(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        long j3;
        if (z()) {
            return;
        }
        do {
            atomicLongFieldUpdater = Y;
        } while (atomicLongFieldUpdater.get(this) <= j);
        int i = bu0.c;
        int i2 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = Z;
            if (i2 >= i) {
                do {
                    j2 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j2, 4611686018427387904L + (j2 & 4611686018427387903L)));
                while (true) {
                    long j4 = atomicLongFieldUpdater.get(this);
                    long j5 = atomicLongFieldUpdater2.get(this);
                    long j6 = j5 & 4611686018427387903L;
                    boolean z = (j5 & 4611686018427387904L) != 0;
                    if (j4 == j6 && j4 == atomicLongFieldUpdater.get(this)) {
                        break;
                    } else if (!z) {
                        atomicLongFieldUpdater2.compareAndSet(this, j5, j6 + 4611686018427387904L);
                    }
                }
                do {
                    j3 = atomicLongFieldUpdater2.get(this);
                } while (!atomicLongFieldUpdater2.compareAndSet(this, j3, j3 & 4611686018427387903L));
                return;
            }
            long j7 = atomicLongFieldUpdater.get(this);
            if (j7 == (atomicLongFieldUpdater2.get(this) & 4611686018427387903L) && j7 == atomicLongFieldUpdater.get(this)) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.p8c
    public final v3d c() {
        vt0 vt0Var = vt0.a;
        f8.c(3, vt0Var);
        wt0 wt0Var = wt0.a;
        f8.c(3, wt0Var);
        return new m5d(13, this, vt0Var, wt0Var, this.c, false);
    }

    @Override // defpackage.p8c
    public final void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        j(cancellationException, true);
    }

    public final ut0 e() {
        return new ut0(3, this, zt0.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0, 1);
    }

    @Override // defpackage.p8c
    public final Object f() {
        j42 j42Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = X;
        long j = atomicLongFieldUpdater.get(this);
        long j2 = o.get(this);
        if (w(j2, true)) {
            return new g42(s());
        }
        long j3 = j2 & 1152921504606846975L;
        Object obj = i42.b;
        if (j >= j3) {
            return obj;
        }
        Object obj2 = bu0.k;
        j42 j42Var2 = (j42) t0.get(this);
        while (!x()) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j4 = bu0.b;
            long j5 = andIncrement / j4;
            int i = (int) (andIncrement % j4);
            if (j42Var2.id != j5) {
                j42 j42VarR = r(j5, j42Var2);
                if (j42VarR == null) {
                    continue;
                } else {
                    j42Var = j42VarR;
                }
            } else {
                j42Var = j42Var2;
            }
            Object objH = H(j42Var, i, andIncrement, obj2);
            if (objH == bu0.m) {
                irf irfVar = obj2 instanceof irf ? (irf) obj2 : null;
                if (irfVar != null) {
                    irfVar.a(j42Var, i);
                }
                J(andIncrement);
                j42Var.onSlotCleaned();
            } else if (objH == bu0.o) {
                if (andIncrement < u()) {
                    j42Var.cleanPrev();
                }
                j42Var2 = j42Var;
            } else {
                if (objH == bu0.n) {
                    throw new IllegalStateException("unexpected".toString());
                }
                j42Var.cleanPrev();
                obj = objH;
            }
            return obj;
        }
        return new g42(s());
    }

    public final boolean g(long j) {
        return j < Y.get(this) || j < X.get(this) + ((long) this.a);
    }

    @Override // defpackage.p8c
    public final Object h(Continuation continuation) {
        return C(this, continuation);
    }

    @Override // defpackage.j5d
    public final boolean i(Throwable th) {
        return j(th, false);
    }

    @Override // defpackage.p8c
    public final tt0 iterator() {
        return new tt0(this);
    }

    public final boolean j(Throwable th, boolean z) {
        boolean z2;
        long j;
        long j2;
        long j3;
        Object obj;
        long j4;
        long j5;
        AtomicLongFieldUpdater atomicLongFieldUpdater = o;
        if (z) {
            do {
                j5 = atomicLongFieldUpdater.get(this);
                if (((int) (j5 >> 60)) != 0) {
                    break;
                }
                j42 j42Var = bu0.a;
            } while (!atomicLongFieldUpdater.compareAndSet(this, j5, (1 << 60) + (j5 & 1152921504606846975L)));
        }
        Symbol symbol = bu0.s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = v0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            do {
                j4 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(this, j4, (3 << 60) + (j4 & 1152921504606846975L)));
        } else {
            do {
                j = atomicLongFieldUpdater.get(this);
                int i = (int) (j >> 60);
                if (i == 0) {
                    j2 = j & 1152921504606846975L;
                    j3 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j2 = j & 1152921504606846975L;
                    j3 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(this, j, (j3 << 60) + j2));
        }
        p();
        if (z2) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = w0;
                obj = atomicReferenceFieldUpdater2.get(this);
                Symbol symbol2 = obj == null ? bu0.q : bu0.r;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol2)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
            }
            if (obj != null) {
                f8.c(1, obj);
                ((m56) obj).invoke(s());
            }
        }
        return z2;
    }

    @Override // defpackage.j5d
    public final void k(c01 c01Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = w0;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c01Var)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = bu0.q;
            if (obj != symbol) {
                if (obj == bu0.r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked".toString());
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
            Symbol symbol2 = bu0.r;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, symbol, symbol2)) {
                if (atomicReferenceFieldUpdater.get(this) != symbol) {
                    break;
                }
            }
            c01Var.invoke(s());
            return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0078, code lost:
    
        r1 = (defpackage.j42) r1.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.j42 l(long r12) {
        /*
            Method dump skipped, instructions count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.l(long):j42");
    }

    public final void m(long j) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        j42 j42Var = (j42) t0.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = X;
            long j2 = atomicLongFieldUpdater.get(this);
            if (j < Math.max(this.a + j2, Y.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j2, j2 + 1)) {
                int i = bu0.b;
                long j3 = j2 / i;
                int i2 = (int) (j2 % i);
                if (j42Var.id != j3) {
                    j42 j42VarR = r(j3, j42Var);
                    if (j42VarR == null) {
                        continue;
                    } else {
                        j42Var = j42VarR;
                    }
                }
                Object objH = H(j42Var, i2, j2, null);
                if (objH != bu0.o) {
                    j42Var.cleanPrev();
                    m56 m56Var = this.b;
                    if (m56Var != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(m56Var, objH, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j2 < u()) {
                    j42Var.cleanPrev();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return r1;
     */
    @Override // defpackage.j5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.lang.Object r23) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.n(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x01d3, code lost:
    
        r3.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01d6, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01ed, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        r4 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f1, code lost:
    
        r5 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f5, code lost:
    
        b(r26, r27, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
    
        r3 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x014f, code lost:
    
        if (r24 >= r5.get(r26)) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0151, code lost:
    
        r19.cleanPrev();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0154, code lost:
    
        r2 = r27;
        r3 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0158, code lost:
    
        b(r26, r2, r3);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [sy1] */
    @Override // defpackage.j5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(java.lang.Object r27, kotlin.coroutines.Continuation r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.o(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.j5d
    public final boolean p() {
        return w(o.get(this), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0199, code lost:
    
        v(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x019c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void q() {
        /*
            Method dump skipped, instructions count: 413
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.q():void");
    }

    public final j42 r(long j, j42 j42Var) {
        Object objFindSegmentInternal;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j2;
        j42 j42Var2 = bu0.a;
        au0 au0Var = au0.a;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(j42Var, j, au0Var);
            if (!SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM26getSegmentimpl = SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = t0;
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
        if (SegmentOrClosed.m28isClosedimpl(objFindSegmentInternal)) {
            p();
            if (j42Var.id * bu0.b >= u()) {
                return null;
            }
            j42Var.cleanPrev();
            return null;
        }
        j42 j42Var3 = (j42) SegmentOrClosed.m26getSegmentimpl(objFindSegmentInternal);
        if (!z() && j <= Y.get(this) / bu0.b) {
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u0;
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= j42Var3.id || !j42Var3.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, segment2, j42Var3)) {
                    if (atomicReferenceFieldUpdater2.get(this) != segment2) {
                        if (j42Var3.decPointers$kotlinx_coroutines_core()) {
                            j42Var3.remove();
                        }
                    }
                }
                if (segment2.decPointers$kotlinx_coroutines_core()) {
                    segment2.remove();
                }
            }
        }
        long j3 = j42Var3.id;
        if (j3 <= j) {
            return j42Var3;
        }
        long j4 = j3 * bu0.b;
        do {
            atomicLongFieldUpdater = X;
            j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j4) {
                break;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j2, j4));
        if (j42Var3.id * bu0.b >= u()) {
            return null;
        }
        j42Var3.cleanPrev();
        return null;
    }

    public final Throwable s() {
        return (Throwable) v0.get(this);
    }

    public final Throwable t() {
        Throwable thS = s();
        return thS == null ? new ClosedSendChannelException("Channel was closed") : thS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x01ae, code lost:
    
        r3 = (defpackage.j42) r3.getNext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01b5, code lost:
    
        if (r3 != null) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.toString():java.lang.String");
    }

    public final long u() {
        return o.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00c9, code lost:
    
        r0 = (defpackage.j42) r0.getPrev();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean w(long r19, boolean r21) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt0.w(long, boolean):boolean");
    }

    public final boolean x() {
        return w(o.get(this), true);
    }

    public boolean y() {
        return false;
    }

    public final boolean z() {
        long j = Y.get(this);
        return j == 0 || j == Long.MAX_VALUE;
    }
}
