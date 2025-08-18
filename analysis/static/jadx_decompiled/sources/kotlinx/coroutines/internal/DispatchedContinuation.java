package kotlinx.coroutines.internal;

import defpackage.a45;
import defpackage.c32;
import defpackage.c54;
import defpackage.lx3;
import defpackage.m56;
import defpackage.mb3;
import defpackage.njc;
import defpackage.nx3;
import defpackage.ol4;
import defpackage.ry1;
import defpackage.sy1;
import defpackage.tpa;
import defpackage.use;
import defpackage.ux3;
import defpackage.v3c;
import defpackage.x77;
import defpackage.z4f;
import defpackage.z7;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001c\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u0004\u0018\u00010\u001e2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u001dH\u0000¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u001eH\u0000¢\u0006\u0004\b#\u0010$J\u0011\u0010)\u001a\u0004\u0018\u00010&H\u0010¢\u0006\u0004\b'\u0010(J\u001d\u0010,\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0016¢\u0006\u0004\b,\u0010-J6\u00102\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*2\u0016\b\b\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0013\u0018\u00010.H\u0080\b¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u00132\b\u00103\u001a\u0004\u0018\u00010&2\u0006\u0010\"\u001a\u00020\u001eH\u0010¢\u0006\u0004\b4\u00105J\u001a\u0010:\u001a\u00020\u000f2\b\u00107\u001a\u0004\u0018\u00010&H\u0080\b¢\u0006\u0004\b8\u00109J\u001e\u0010<\u001a\u00020\u00132\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*H\u0080\b¢\u0006\u0004\b;\u0010-J\u001f\u0010B\u001a\u00020\u00132\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00028\u0000H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010FR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010GR\u001e\u0010H\u001a\u0004\u0018\u00010&8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bH\u0010I\u0012\u0004\bJ\u0010\u0015R\u0014\u0010K\u001a\u00020&8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bK\u0010IR\u001a\u0010M\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bL\u0010\u001bR\u001c\u0010P\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0013\u0010U\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0T8\u0002X\u0082\u0004R\u000b\u0010>\u001a\u00020=8\u0016X\u0096\u0005¨\u0006V"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lol4;", "Lux3;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Lnx3;", "dispatcher", "continuation", "<init>", "(Lnx3;Lkotlin/coroutines/Continuation;)V", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable$kotlinx_coroutines_core", "()Z", "isReusable", "Le5f;", "awaitReusability$kotlinx_coroutines_core", "()V", "awaitReusability", "release$kotlinx_coroutines_core", "release", "Lsy1;", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "()Lsy1;", "claimReusableCancellableContinuation", "Lry1;", "", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "(Lry1;)Ljava/lang/Throwable;", "tryReleaseClaimedContinuation", "cause", "postponeCancellation$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)Z", "postponeCancellation", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "Lpjc;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "onCancellation", "resumeCancellableWith$kotlinx_coroutines_core", "(Ljava/lang/Object;Lm56;)V", "resumeCancellableWith", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "state", "resumeCancelled$kotlinx_coroutines_core", "(Ljava/lang/Object;)Z", "resumeCancelled", "resumeUndispatchedWith$kotlinx_coroutines_core", "resumeUndispatchedWith", "Llx3;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Llx3;Ljava/lang/Object;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "Lnx3;", "Lkotlin/coroutines/Continuation;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "countOrElement", "getReusableCancellableContinuation", "reusableCancellableContinuation", "getCallerFrame", "()Lux3;", "callerFrame", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "Lkotlinx/atomicfu/AtomicRef;", "_reusableCancellableContinuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class DispatchedContinuation<T> extends ol4 implements ux3, Continuation<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _reusableCancellableContinuation$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(DispatchedContinuation.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public Object _state;
    public final Continuation<T> continuation;
    public final Object countOrElement;
    public final nx3 dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(nx3 nx3Var, Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = nx3Var;
        this.continuation = continuation;
        this._state = DispatchedContinuationKt.UNDEFINED;
        this.countOrElement = ThreadContextKt.threadContextElements(getContext());
    }

    private final sy1 getReusableCancellableContinuation() {
        Object obj = _reusableCancellableContinuation$volatile$FU.get(this);
        if (obj instanceof sy1) {
            return (sy1) obj;
        }
        return null;
    }

    private final /* synthetic */ Object get_reusableCancellableContinuation$volatile() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    private final /* synthetic */ void loop$atomicfu(Object obj, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, m56 m56Var) {
        while (true) {
            m56Var.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void set_reusableCancellableContinuation$volatile(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    public final void awaitReusability$kotlinx_coroutines_core() {
        while (_reusableCancellableContinuation$volatile$FU.get(this) == DispatchedContinuationKt.REUSABLE_CLAIMED) {
        }
    }

    @Override // defpackage.ol4
    public void cancelCompletedResult$kotlinx_coroutines_core(Object takenState, Throwable cause) {
        if (takenState instanceof mb3) {
            ((mb3) takenState).b.invoke(cause);
        }
    }

    public final sy1 claimReusableCancellableContinuation$kotlinx_coroutines_core() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                _reusableCancellableContinuation$volatile$FU.set(this, DispatchedContinuationKt.REUSABLE_CLAIMED);
                return null;
            }
            if (obj instanceof sy1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, symbol)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        break;
                    }
                }
                return (sy1) obj;
            }
            if (obj != DispatchedContinuationKt.REUSABLE_CLAIMED && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(lx3 context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.dispatchYield(context, this);
    }

    @Override // defpackage.ux3
    public ux3 getCallerFrame() {
        Continuation<T> continuation = this.continuation;
        if (continuation instanceof ux3) {
            return (ux3) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public lx3 getContext() {
        return this.continuation.getContext();
    }

    @Override // defpackage.ol4
    public Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    @Override // defpackage.ux3
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable$kotlinx_coroutines_core() {
        return _reusableCancellableContinuation$volatile$FU.get(this) != null;
    }

    public final boolean postponeCancellation$kotlinx_coroutines_core(Throwable cause) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (tpa.f(obj, symbol)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, cause)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    break;
                }
            }
            return false;
        }
    }

    public final void release$kotlinx_coroutines_core() {
        awaitReusability$kotlinx_coroutines_core();
        sy1 reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0080 A[Catch: all -> 0x005b, DONT_GENERATE, TryCatch #0 {all -> 0x005b, blocks: (B:9:0x0037, B:11:0x0045, B:13:0x004b, B:26:0x0083, B:16:0x005d, B:18:0x006d, B:23:0x007a, B:25:0x0080, B:31:0x0090, B:34:0x0099, B:33:0x0096, B:21:0x0073), top: B:41:0x0037, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object r7, defpackage.m56 r8) {
        /*
            r6 = this;
            java.lang.Object r8 = defpackage.z7.T(r7, r8)
            nx3 r0 = r6.dispatcher
            lx3 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L20
            r6._state = r8
            r6.resumeMode = r1
            nx3 r7 = r6.dispatcher
            lx3 r8 = r6.getContext()
            r7.mo20dispatch(r8, r6)
            goto L9e
        L20:
            a45 r0 = defpackage.use.a()
            boolean r2 = r0.U()
            if (r2 == 0) goto L33
            r6._state = r8
            r6.resumeMode = r1
            r0.n(r6)
            goto L9e
        L33:
            r0.S(r1)
            r2 = 0
            lx3 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L5b
            c32 r4 = defpackage.c32.X     // Catch: java.lang.Throwable -> L5b
            jx3 r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L5b
            x77 r3 = (defpackage.x77) r3     // Catch: java.lang.Throwable -> L5b
            if (r3 == 0) goto L5d
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L5b
            if (r4 != 0) goto L5d
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L5b
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L5b
            njc r8 = new njc     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L5b
            goto L83
        L5b:
            r7 = move-exception
            goto L9a
        L5d:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L5b
            lx3 r4 = r8.getContext()     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L5b
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L5b
            if (r3 == r5) goto L72
            z4f r8 = defpackage.v3c.G(r8, r4, r3)     // Catch: java.lang.Throwable -> L5b
            goto L73
        L72:
            r8 = r2
        L73:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L8d
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L8d
            if (r8 == 0) goto L80
            boolean r7 = r8.H()     // Catch: java.lang.Throwable -> L5b
            if (r7 == 0) goto L83
        L80:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L5b
        L83:
            boolean r7 = r0.m0()     // Catch: java.lang.Throwable -> L5b
            if (r7 != 0) goto L83
        L89:
            r0.d(r1)
            goto L9e
        L8d:
            r7 = move-exception
            if (r8 == 0) goto L96
            boolean r8 = r8.H()     // Catch: java.lang.Throwable -> L5b
            if (r8 == 0) goto L99
        L96:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L5b
        L99:
            throw r7     // Catch: java.lang.Throwable -> L5b
        L9a:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> L9f
            goto L89
        L9e:
            return
        L9f:
            r6 = move-exception
            r0.d(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuation.resumeCancellableWith$kotlinx_coroutines_core(java.lang.Object, m56):void");
    }

    public final boolean resumeCancelled$kotlinx_coroutines_core(Object state) {
        x77 x77Var = (x77) getContext().get(c32.X);
        if (x77Var == null || x77Var.isActive()) {
            return false;
        }
        CancellationException cancellationException = x77Var.getCancellationException();
        cancelCompletedResult$kotlinx_coroutines_core(state, cancellationException);
        resumeWith(new njc(cancellationException));
        return true;
    }

    public final void resumeUndispatchedWith$kotlinx_coroutines_core(Object result) {
        Continuation<T> continuation = this.continuation;
        Object obj = this.countOrElement;
        lx3 context = continuation.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        z4f z4fVarG = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? v3c.G(continuation, context, objUpdateThreadContext) : null;
        try {
            this.continuation.resumeWith(result);
        } finally {
            if (z4fVarG == null || z4fVarG.H()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(Object result) {
        lx3 context = this.continuation.getContext();
        Object objT = z7.T(result, null);
        if (this.dispatcher.isDispatchNeeded(context)) {
            this._state = objT;
            this.resumeMode = 0;
            this.dispatcher.mo20dispatch(context, this);
            return;
        }
        a45 a45VarA = use.a();
        if (a45VarA.U()) {
            this._state = objT;
            this.resumeMode = 0;
            a45VarA.n(this);
            return;
        }
        a45VarA.S(true);
        try {
            lx3 context2 = getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context2, this.countOrElement);
            try {
                this.continuation.resumeWith(result);
                while (a45VarA.m0()) {
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context2, objUpdateThreadContext);
            }
        } finally {
            try {
            } finally {
            }
        }
    }

    @Override // defpackage.ol4
    public Object takeState$kotlinx_coroutines_core() {
        Object obj = this._state;
        this._state = DispatchedContinuationKt.UNDEFINED;
        return obj;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + c54.a0(this.continuation) + ']';
    }

    public final Throwable tryReleaseClaimedContinuation$kotlinx_coroutines_core(ry1 continuation) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$volatile$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = DispatchedContinuationKt.REUSABLE_CLAIMED;
            if (obj == symbol) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$volatile$FU;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, symbol, continuation)) {
                    if (atomicReferenceFieldUpdater2.get(this) != symbol) {
                        break;
                    }
                }
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _reusableCancellableContinuation$volatile$FU;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return (Throwable) obj;
        }
    }
}
