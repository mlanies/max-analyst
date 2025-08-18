package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class sy1 extends ol4 implements ry1, ux3, irf {
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    public final Continuation a;
    public final lx3 b;
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(sy1.class, "_decisionAndIndex$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater o = AtomicReferenceFieldUpdater.newUpdater(sy1.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater X = AtomicReferenceFieldUpdater.newUpdater(sy1.class, Object.class, "_parentHandle$volatile");

    public sy1(int i, Continuation continuation) {
        super(i);
        this.a = continuation;
        this.b = continuation.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = o7.a;
    }

    public static void s(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    public static Object w(ir9 ir9Var, Object obj, int i, c66 c66Var) {
        if ((obj instanceof lb3) || !v3c.v(i)) {
            return obj;
        }
        if (c66Var != null || (ir9Var instanceof iy1)) {
            return new jb3(obj, ir9Var instanceof iy1 ? (iy1) ir9Var : null, c66Var, (CancellationException) null, 16);
        }
        return obj;
    }

    @Override // defpackage.irf
    public final void a(Segment segment, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        p(segment);
    }

    @Override // defpackage.ry1
    public final void b(nx3 nx3Var) {
        e5f e5fVar = e5f.a;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        v(e5fVar, (dispatchedContinuation != null ? dispatchedContinuation.dispatcher : null) == nx3Var ? 4 : this.resumeMode, null);
    }

    public final void c(iy1 iy1Var, Throwable th) {
        try {
            iy1Var.b(th);
        } catch (Throwable th2) {
            wmd.v(this.b, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ry1
    public final boolean cancel(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof ir9)) {
                return false;
            }
            bz1 bz1Var = new bz1(this, th, (obj instanceof iy1) || (obj instanceof Segment));
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, bz1Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ir9 ir9Var = (ir9) obj;
            if (ir9Var instanceof iy1) {
                c((iy1) obj, th);
            } else if (ir9Var instanceof Segment) {
                g((Segment) obj, th);
            }
            if (!r()) {
                h();
            }
            i(this.resumeMode);
            return true;
        }
    }

    @Override // defpackage.ol4
    public final void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ir9) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof lb3) {
                return;
            }
            if (!(obj2 instanceof jb3)) {
                jb3 jb3Var = new jb3(obj2, (iy1) null, (c66) null, (CancellationException) th, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jb3Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                return;
            }
            jb3 jb3Var2 = (jb3) obj2;
            if (!(!(jb3Var2.e != null))) {
                throw new IllegalStateException("Must be called at most once".toString());
            }
            jb3 jb3VarA = jb3.a(jb3Var2, null, (CancellationException) th, 15);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, jb3VarA)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            iy1 iy1Var = jb3Var2.b;
            if (iy1Var != null) {
                c(iy1Var, th);
            }
            c66 c66Var = jb3Var2.c;
            if (c66Var != null) {
                f(c66Var, th, jb3Var2.a);
                return;
            }
            return;
        }
    }

    @Override // defpackage.ry1
    public final void d(m56 m56Var) {
        nu0.w(this, new hy1(1, m56Var));
    }

    @Override // defpackage.ry1
    public final void e(Object obj, c66 c66Var) {
        v(obj, this.resumeMode, c66Var);
    }

    public final void f(c66 c66Var, Throwable th, Object obj) {
        lx3 lx3Var = this.b;
        try {
            c66Var.invoke(th, obj, lx3Var);
        } catch (Throwable th2) {
            wmd.v(lx3Var, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    public final void g(Segment segment, Throwable th) {
        lx3 lx3Var = this.b;
        int i = c.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            segment.onCancellation(i, th, lx3Var);
        } catch (Throwable th2) {
            wmd.v(lx3Var, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    @Override // defpackage.ux3
    public final ux3 getCallerFrame() {
        Continuation continuation = this.a;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public final lx3 getContext() {
        return this.b;
    }

    @Override // defpackage.ol4
    public final Continuation getDelegate$kotlinx_coroutines_core() {
        return this.a;
    }

    @Override // defpackage.ol4
    public final Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        Throwable exceptionalResult$kotlinx_coroutines_core = super.getExceptionalResult$kotlinx_coroutines_core(obj);
        if (exceptionalResult$kotlinx_coroutines_core != null) {
            return exceptionalResult$kotlinx_coroutines_core;
        }
        return null;
    }

    @Override // defpackage.ux3
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.ol4
    public final Object getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj instanceof jb3 ? ((jb3) obj).a : obj;
    }

    public final void h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = X;
        cm4 cm4Var = (cm4) atomicReferenceFieldUpdater.get(this);
        if (cm4Var == null) {
            return;
        }
        cm4Var.dispose();
        atomicReferenceFieldUpdater.set(this, er9.a);
    }

    public final void i(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = c;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                boolean z = i == 4;
                Continuation continuation = this.a;
                if (z || !(continuation instanceof DispatchedContinuation) || v3c.v(i) != v3c.v(this.resumeMode)) {
                    v3c.E(this, continuation, z);
                    return;
                }
                DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) continuation;
                nx3 nx3Var = dispatchedContinuation.dispatcher;
                lx3 context = dispatchedContinuation.getContext();
                if (nx3Var.isDispatchNeeded(context)) {
                    nx3Var.mo20dispatch(context, this);
                    return;
                }
                a45 a45VarA = use.a();
                if (a45VarA.U()) {
                    a45VarA.n(this);
                    return;
                }
                a45VarA.S(true);
                try {
                    v3c.E(this, continuation, true);
                    do {
                    } while (a45VarA.m0());
                } finally {
                    try {
                        return;
                    } finally {
                    }
                }
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    @Override // defpackage.ry1
    public final boolean isActive() {
        return o.get(this) instanceof ir9;
    }

    @Override // defpackage.ry1
    public final boolean isCancelled() {
        return o.get(this) instanceof bz1;
    }

    @Override // defpackage.ry1
    public final Symbol j(Throwable th) {
        return x(new lb3(th, false), null);
    }

    public Throwable k(z87 z87Var) {
        return z87Var.getCancellationException();
    }

    @Override // defpackage.ry1
    public final Symbol l(Object obj, c66 c66Var) {
        return x(obj, c66Var);
    }

    public final Object m() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        boolean zR = r();
        do {
            atomicIntegerFieldUpdater = c;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                if (zR) {
                    u();
                }
                Object obj = o.get(this);
                if (obj instanceof lb3) {
                    throw ((lb3) obj).a;
                }
                if (v3c.v(this.resumeMode)) {
                    x77 x77Var = (x77) this.b.get(c32.X);
                    if (x77Var != null && !x77Var.isActive()) {
                        CancellationException cancellationException = x77Var.getCancellationException();
                        cancelCompletedResult$kotlinx_coroutines_core(obj, cancellationException);
                        throw cancellationException;
                    }
                }
                return getSuccessfulResult$kotlinx_coroutines_core(obj);
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((cm4) X.get(this)) == null) {
            o();
        }
        if (zR) {
            u();
        }
        return tx3.a;
    }

    public final void n() {
        cm4 cm4VarO = o();
        if (cm4VarO != null && (!(o.get(this) instanceof ir9))) {
            cm4VarO.dispose();
            X.set(this, er9.a);
        }
    }

    public final cm4 o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x77 x77Var = (x77) this.b.get(c32.X);
        if (x77Var == null) {
            return null;
        }
        cm4 cm4VarQ = pag.q(x77Var, true, new d03(this, 0));
        do {
            atomicReferenceFieldUpdater = X;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, cm4VarQ)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return cm4VarQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ad, code lost:
    
        s(r10, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b0, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(java.lang.Object r10) {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.sy1.o
            java.lang.Object r7 = r0.get(r9)
            boolean r1 = r7 instanceof defpackage.o7
            if (r1 == 0) goto L18
        La:
            boolean r1 = r0.compareAndSet(r9, r7, r10)
            if (r1 == 0) goto L11
            return
        L11:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto La
            goto L0
        L18:
            boolean r1 = r7 instanceof defpackage.iy1
            r2 = 0
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof kotlinx.coroutines.internal.Segment
            if (r1 != 0) goto Lad
            boolean r1 = r7 instanceof defpackage.lb3
            if (r1 == 0) goto L57
            r0 = r7
            lb3 r0 = (defpackage.lb3) r0
            r0.getClass()
            r1 = 1
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = defpackage.lb3.b
            r4 = 0
            boolean r1 = r3.compareAndSet(r0, r4, r1)
            if (r1 == 0) goto L53
            boolean r1 = r7 instanceof defpackage.bz1
            if (r1 == 0) goto L52
            boolean r1 = r7 instanceof defpackage.lb3
            if (r1 == 0) goto L3e
            goto L3f
        L3e:
            r0 = r2
        L3f:
            if (r0 == 0) goto L43
            java.lang.Throwable r2 = r0.a
        L43:
            boolean r0 = r10 instanceof defpackage.iy1
            if (r0 == 0) goto L4d
            iy1 r10 = (defpackage.iy1) r10
            r9.c(r10, r2)
            goto L52
        L4d:
            kotlinx.coroutines.internal.Segment r10 = (kotlinx.coroutines.internal.Segment) r10
            r9.g(r10, r2)
        L52:
            return
        L53:
            s(r10, r7)
            throw r2
        L57:
            boolean r1 = r7 instanceof defpackage.jb3
            if (r1 == 0) goto L8b
            r1 = r7
            jb3 r1 = (defpackage.jb3) r1
            iy1 r3 = r1.b
            if (r3 != 0) goto L87
            boolean r3 = r10 instanceof kotlinx.coroutines.internal.Segment
            if (r3 == 0) goto L67
            return
        L67:
            r3 = r10
            iy1 r3 = (defpackage.iy1) r3
            java.lang.Throwable r4 = r1.e
            if (r4 == 0) goto L72
            r9.c(r3, r4)
            return
        L72:
            r4 = 29
            jb3 r1 = defpackage.jb3.a(r1, r3, r2, r4)
        L78:
            boolean r2 = r0.compareAndSet(r9, r7, r1)
            if (r2 == 0) goto L7f
            return
        L7f:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r7) goto L78
            goto L0
        L87:
            s(r10, r7)
            throw r2
        L8b:
            boolean r1 = r10 instanceof kotlinx.coroutines.internal.Segment
            if (r1 == 0) goto L90
            return
        L90:
            r3 = r10
            iy1 r3 = (defpackage.iy1) r3
            jb3 r8 = new jb3
            r4 = 0
            r5 = 0
            r6 = 28
            r1 = r8
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
        L9e:
            boolean r1 = r0.compareAndSet(r9, r7, r8)
            if (r1 == 0) goto La5
            return
        La5:
            java.lang.Object r1 = r0.get(r9)
            if (r1 == r7) goto L9e
            goto L0
        Lad:
            s(r10, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy1.p(java.lang.Object):void");
    }

    @Override // defpackage.ry1
    public final void q(Object obj) {
        i(this.resumeMode);
    }

    public final boolean r() {
        return this.resumeMode == 2 && ((DispatchedContinuation) this.a).isReusable$kotlinx_coroutines_core();
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thA = pjc.a(obj);
        if (thA != null) {
            obj = new lb3(thA, false);
        }
        v(obj, this.resumeMode, null);
    }

    public String t() {
        return "CancellableContinuation";
    }

    @Override // defpackage.ol4
    public final Object takeState$kotlinx_coroutines_core() {
        return o.get(this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(t());
        sb.append('(');
        sb.append(c54.a0(this.a));
        sb.append("){");
        Object obj = o.get(this);
        sb.append(obj instanceof ir9 ? "Active" : obj instanceof bz1 ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(c54.u(this));
        return sb.toString();
    }

    public final void u() {
        Throwable thTryReleaseClaimedContinuation$kotlinx_coroutines_core;
        Continuation continuation = this.a;
        DispatchedContinuation dispatchedContinuation = continuation instanceof DispatchedContinuation ? (DispatchedContinuation) continuation : null;
        if (dispatchedContinuation == null || (thTryReleaseClaimedContinuation$kotlinx_coroutines_core = dispatchedContinuation.tryReleaseClaimedContinuation$kotlinx_coroutines_core(this)) == null) {
            return;
        }
        h();
        cancel(thTryReleaseClaimedContinuation$kotlinx_coroutines_core);
    }

    public final void v(Object obj, int i, c66 c66Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof ir9) {
                Object objW = w((ir9) obj2, obj, i, c66Var);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objW)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                        break;
                    }
                }
                if (!r()) {
                    h();
                }
                i(i);
                return;
            }
            if (obj2 instanceof bz1) {
                bz1 bz1Var = (bz1) obj2;
                bz1Var.getClass();
                if (bz1.c.compareAndSet(bz1Var, 0, 1)) {
                    if (c66Var != null) {
                        f(c66Var, bz1Var.a, obj);
                        return;
                    }
                    return;
                }
            }
            throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
        }
    }

    public final Symbol x(Object obj, c66 c66Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof ir9)) {
                boolean z = obj2 instanceof jb3;
                return null;
            }
            Object objW = w((ir9) obj2, obj, this.resumeMode, c66Var);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, objW)) {
                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    break;
                }
            }
            if (!r()) {
                h();
            }
            return ty1.a;
        }
    }
}
