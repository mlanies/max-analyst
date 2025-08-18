package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ResizableAtomicArray;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public final class rx3 implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater s0 = AtomicLongFieldUpdater.newUpdater(rx3.class, "parkedWorkersStack$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater t0 = AtomicLongFieldUpdater.newUpdater(rx3.class, "controlState$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater u0 = AtomicIntegerFieldUpdater.newUpdater(rx3.class, "_isTerminated$volatile");
    public static final Symbol v0 = new Symbol("NOT_IN_STACK");
    public final yd6 X;
    public final yd6 Y;
    public final ResizableAtomicArray Z;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String o;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    public rx3(int i, int i2, long j) {
        String str = joe.a;
        this.a = i;
        this.b = i2;
        this.c = j;
        this.o = str;
        if (i < 1) {
            throw new IllegalArgumentException(wg0.g(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(rh4.h("Max pool size ", i2, i, " should be greater than or equals to core pool size ").toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(wg0.g(i2, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(ey8.i(j, "Idle worker keep alive time ", " must be positive").toString());
        }
        this.X = new yd6(false);
        this.Y = new yd6(false);
        this.Z = new ResizableAtomicArray((i + 1) * 2);
        this.controlState$volatile = i << 42;
        this._isTerminated$volatile = 0;
    }

    public static /* synthetic */ void o(rx3 rx3Var, Runnable runnable, boolean z, int i) {
        fm5 fm5Var = joe.g;
        if ((i & 4) != 0) {
            z = false;
        }
        rx3Var.n(runnable, fm5Var, z);
    }

    public final void S(qx3 qx3Var, int i, int i2) {
        while (true) {
            long j = s0.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
            if (i3 == i) {
                if (i2 == 0) {
                    Object objC = qx3Var.c();
                    while (true) {
                        if (objC == v0) {
                            i3 = -1;
                            break;
                        }
                        if (objC == null) {
                            i3 = 0;
                            break;
                        }
                        qx3 qx3Var2 = (qx3) objC;
                        int iB = qx3Var2.b();
                        if (iB != 0) {
                            i3 = iB;
                            break;
                        }
                        objC = qx3Var2.c();
                    }
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (s0.compareAndSet(this, j, i3 | j2)) {
                    return;
                }
            }
        }
    }

    public final boolean U(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.a;
        if (i < i2) {
            int iM = m();
            if (iM == 1 && i2 > 1) {
                m();
            }
            if (iM > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() throws java.lang.InterruptedException {
        /*
            r8 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.rx3.u0
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r8, r1, r2)
            if (r0 != 0) goto Lc
            goto Lae
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            boolean r1 = r0 instanceof defpackage.qx3
            r3 = 0
            if (r1 == 0) goto L18
            qx3 r0 = (defpackage.qx3) r0
            goto L19
        L18:
            r0 = r3
        L19:
            if (r0 == 0) goto L24
            rx3 r1 = r0.s0
            boolean r1 = defpackage.tpa.f(r1, r8)
            if (r1 == 0) goto L24
            goto L25
        L24:
            r0 = r3
        L25:
            kotlinx.coroutines.internal.ResizableAtomicArray r1 = r8.Z
            monitor-enter(r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = defpackage.rx3.t0     // Catch: java.lang.Throwable -> Lc0
            long r4 = r4.get(r8)     // Catch: java.lang.Throwable -> Lc0
            r6 = 2097151(0x1fffff, double:1.0361303E-317)
            long r4 = r4 & r6
            int r4 = (int) r4
            monitor-exit(r1)
            if (r2 > r4) goto L76
            r1 = r2
        L37:
            kotlinx.coroutines.internal.ResizableAtomicArray r5 = r8.Z
            java.lang.Object r5 = r5.get(r1)
            qx3 r5 = (defpackage.qx3) r5
            if (r5 == r0) goto L71
        L41:
            java.lang.Thread$State r6 = r5.getState()
            java.lang.Thread$State r7 = java.lang.Thread.State.TERMINATED
            if (r6 == r7) goto L52
            java.util.concurrent.locks.LockSupport.unpark(r5)
            r6 = 10000(0x2710, double:4.9407E-320)
            r5.join(r6)
            goto L41
        L52:
            c8g r5 = r5.a
            yd6 r6 = r8.Y
            r5.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = defpackage.c8g.b
            java.lang.Object r7 = r7.getAndSet(r5, r3)
            nne r7 = (defpackage.nne) r7
            if (r7 == 0) goto L66
            r6.addLast(r7)
        L66:
            nne r7 = r5.b()
            if (r7 != 0) goto L6d
            goto L71
        L6d:
            r6.addLast(r7)
            goto L66
        L71:
            if (r1 == r4) goto L76
            int r1 = r1 + 1
            goto L37
        L76:
            yd6 r1 = r8.Y
            r1.close()
            yd6 r1 = r8.X
            r1.close()
        L80:
            if (r0 == 0) goto L88
            nne r1 = r0.a(r2)
            if (r1 != 0) goto Laf
        L88:
            yd6 r1 = r8.X
            java.lang.Object r1 = r1.removeFirstOrNull()
            nne r1 = (defpackage.nne) r1
            if (r1 != 0) goto Laf
            yd6 r1 = r8.Y
            java.lang.Object r1 = r1.removeFirstOrNull()
            nne r1 = (defpackage.nne) r1
            if (r1 != 0) goto Laf
            if (r0 == 0) goto La2
            r1 = 5
            r0.h(r1)
        La2:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.rx3.s0
            r1 = 0
            r0.set(r8, r1)
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.rx3.t0
            r0.set(r8, r1)
        Lae:
            return
        Laf:
            r1.run()     // Catch: java.lang.Throwable -> Lb3
            goto L80
        Lb3:
            r1 = move-exception
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.Thread$UncaughtExceptionHandler r4 = r3.getUncaughtExceptionHandler()
            r4.uncaughtException(r3, r1)
            goto L80
        Lc0:
            r8 = move-exception
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx3.close():void");
    }

    public final boolean e0() {
        Symbol symbol;
        int iB;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = s0;
            long j = atomicLongFieldUpdater.get(this);
            qx3 qx3Var = (qx3) this.Z.get((int) (2097151 & j));
            if (qx3Var == null) {
                qx3Var = null;
            } else {
                long j2 = (PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE + j) & (-2097152);
                Object objC = qx3Var.c();
                while (true) {
                    symbol = v0;
                    if (objC == symbol) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    qx3 qx3Var2 = (qx3) objC;
                    iB = qx3Var2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = qx3Var2.c();
                }
                if (iB >= 0 && atomicLongFieldUpdater.compareAndSet(this, j, j2 | iB)) {
                    qx3Var.g(symbol);
                }
            }
            if (qx3Var == null) {
                return false;
            }
            if (qx3.t0.compareAndSet(qx3Var, -1, 0)) {
                LockSupport.unpark(qx3Var);
                return true;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        o(this, runnable, false, 6);
    }

    public final int m() {
        synchronized (this.Z) {
            try {
                if (u0.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = t0;
                long j = atomicLongFieldUpdater.get(this);
                int i = (int) (j & 2097151);
                int i2 = i - ((int) ((j & 4398044413952L) >> 21));
                if (i2 < 0) {
                    i2 = 0;
                }
                if (i2 >= this.a) {
                    return 0;
                }
                if (i >= this.b) {
                    return 0;
                }
                int i3 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i3 <= 0 || this.Z.get(i3) != null) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                qx3 qx3Var = new qx3(this, i3);
                this.Z.setSynchronized(i3, qx3Var);
                if (i3 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
                int i4 = i2 + 1;
                qx3Var.start();
                return i4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(Runnable runnable, sne sneVar, boolean z) {
        nne zneVar;
        int i;
        joe.f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof nne) {
            zneVar = (nne) runnable;
            zneVar.submissionTime = jNanoTime;
            zneVar.taskContext = sneVar;
        } else {
            zneVar = new zne(runnable, jNanoTime, sneVar);
        }
        boolean z2 = false;
        boolean z3 = ((fm5) zneVar.taskContext).b == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = t0;
        long jAddAndGet = z3 ? atomicLongFieldUpdater.addAndGet(this, PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        qx3 qx3Var = threadCurrentThread instanceof qx3 ? (qx3) threadCurrentThread : null;
        if (qx3Var == null || !tpa.f(qx3Var.s0, this)) {
            qx3Var = null;
        }
        if (qx3Var != null && (i = qx3Var.c) != 5 && (((fm5) zneVar.taskContext).b != 0 || i != 2)) {
            qx3Var.Z = true;
            c8g c8gVar = qx3Var.a;
            if (z) {
                zneVar = c8gVar.a(zneVar);
            } else {
                c8gVar.getClass();
                nne nneVar = (nne) c8g.b.getAndSet(c8gVar, zneVar);
                zneVar = nneVar == null ? null : c8gVar.a(nneVar);
            }
        }
        if (zneVar != null) {
            if (!(((fm5) zneVar.taskContext).b == 1 ? this.Y.addLast(zneVar) : this.X.addLast(zneVar))) {
                throw new RejectedExecutionException(zr6.l(new StringBuilder(), this.o, " was terminated"));
            }
        }
        if (z && qx3Var != null) {
            z2 = true;
        }
        if (z3) {
            if (z2 || e0() || U(jAddAndGet)) {
                return;
            }
            e0();
            return;
        }
        if (z2 || e0() || U(atomicLongFieldUpdater.get(this))) {
            return;
        }
        e0();
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ResizableAtomicArray resizableAtomicArray = this.Z;
        int iCurrentLength = resizableAtomicArray.currentLength();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < iCurrentLength; i6++) {
            qx3 qx3Var = (qx3) resizableAtomicArray.get(i6);
            if (qx3Var != null) {
                c8g c8gVar = qx3Var.a;
                c8gVar.getClass();
                int i7 = c8g.b.get(c8gVar) != null ? (c8g.c.get(c8gVar) - c8g.d.get(c8gVar)) + 1 : c8g.c.get(c8gVar) - c8g.d.get(c8gVar);
                int iS = au1.s(qx3Var.c);
                if (iS == 0) {
                    i++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(i7);
                    sb.append('c');
                    arrayList.add(sb.toString());
                } else if (iS == 1) {
                    i2++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i7);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (iS == 2) {
                    i3++;
                } else if (iS == 3) {
                    i4++;
                    if (i7 > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(i7);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else {
                    if (iS != 4) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i5++;
                }
            }
        }
        long j = t0.get(this);
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.o);
        sb4.append('@');
        sb4.append(c54.u(this));
        sb4.append("[Pool Size {core = ");
        int i8 = this.a;
        sb4.append(i8);
        sb4.append(", max = ");
        ms2.k(sb4, this.b, "}, Worker States {CPU = ", i, ", blocking = ");
        ms2.k(sb4, i2, ", parked = ", i3, ", dormant = ");
        ms2.k(sb4, i4, ", terminated = ", i5, "}, running workers queues = ");
        sb4.append(arrayList);
        sb4.append(", global CPU queue size = ");
        sb4.append(this.X.getSize());
        sb4.append(", global blocking queue size = ");
        sb4.append(this.Y.getSize());
        sb4.append(", Control State {created workers= ");
        sb4.append((int) (2097151 & j));
        sb4.append(", blocking tasks = ");
        sb4.append((int) ((4398044413952L & j) >> 21));
        sb4.append(", CPUs acquired = ");
        sb4.append(i8 - ((int) ((j & 9223367638808264704L) >> 42)));
        sb4.append("}]");
        return sb4.toString();
    }
}
