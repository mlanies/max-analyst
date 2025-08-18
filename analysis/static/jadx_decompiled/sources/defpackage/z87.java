package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.internal.Symbol;

/* loaded from: classes.dex */
public class z87 implements x77, h03, vpa {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(z87.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _parentHandle$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(z87.class, Object.class, "_parentHandle$volatile");

    public z87(boolean z) {
        this._state$volatile = z ? a97.g : a97.f;
    }

    public static String E(Object obj) {
        if (!(obj instanceof t87)) {
            return obj instanceof nz6 ? ((nz6) obj).isActive() ? "Active" : "New" : obj instanceof lb3 ? "Cancelled" : "Completed";
        }
        t87 t87Var = (t87) obj;
        return t87Var.d() ? "Cancelling" : t87.b.get(t87Var) != 0 ? "Completing" : "Active";
    }

    public static final void access$continueCompleting(z87 z87Var, t87 t87Var, f03 f03Var, Object obj) {
        z87Var.getClass();
        f03 f03VarZ = z(f03Var);
        if (f03VarZ == null || !z87Var.G(t87Var, f03VarZ, obj)) {
            t87Var.a.close(2);
            f03 f03VarZ2 = z(f03Var);
            if (f03VarZ2 == null || !z87Var.G(t87Var, f03VarZ2, obj)) {
                z87Var.afterCompletion(z87Var.v(t87Var, obj));
            }
        }
    }

    public static final Object access$onAwaitInternalProcessResFunc(z87 z87Var, Object obj, Object obj2) throws Throwable {
        z87Var.getClass();
        if (obj2 instanceof lb3) {
            throw ((lb3) obj2).a;
        }
        return obj2;
    }

    public static final void access$onAwaitInternalRegFunc(z87 z87Var, z3d z3dVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = z87Var.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                if (!(state$kotlinx_coroutines_core instanceof lb3)) {
                    state$kotlinx_coroutines_core = a97.a(state$kotlinx_coroutines_core);
                }
                ((y3d) z3dVar).X = state$kotlinx_coroutines_core;
                return;
            }
        } while (z87Var.D(state$kotlinx_coroutines_core) < 0);
        ((y3d) z3dVar).c = pag.q(z87Var, true, new u87(z87Var, z3dVar, 0));
    }

    public static final void access$registerSelectForOnJoin(z87 z87Var, z3d z3dVar, Object obj) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = z87Var.getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                ((y3d) z3dVar).X = e5f.a;
                return;
            }
        } while (z87Var.D(state$kotlinx_coroutines_core) < 0);
        ((y3d) z3dVar).c = pag.q(z87Var, true, new u87(z87Var, z3dVar, 1));
    }

    public static /* synthetic */ JobCancellationException defaultCancellationException$kotlinx_coroutines_core$default(z87 z87Var, String str, Throwable th, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            th = null;
        }
        if (str == null) {
            str = z87Var.cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, z87Var);
    }

    public static /* synthetic */ void getOnAwaitInternal$annotations() {
    }

    public static /* synthetic */ void getOnJoin$annotations() {
    }

    public static /* synthetic */ CancellationException toCancellationException$default(z87 z87Var, Throwable th, String str, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i & 1) != 0) {
            str = null;
        }
        return z87Var.toCancellationException(th, str);
    }

    public static f03 z(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.isRemoved()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getPrevNode();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.getNextNode();
            if (!lockFreeLinkedListNode.isRemoved()) {
                if (lockFreeLinkedListNode instanceof f03) {
                    return (f03) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof tq9) {
                    return null;
                }
            }
        }
    }

    public final void A(tq9 tq9Var, Throwable th) throws Throwable {
        onCancelling(th);
        tq9Var.close(4);
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) tq9Var.getNext(); !tpa.f(nextNode, tq9Var); nextNode = nextNode.getNextNode()) {
            if ((nextNode instanceof k87) && ((k87) nextNode).c()) {
                try {
                    ((k87) nextNode).d(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        j47.e(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + nextNode + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
        }
        s(th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [gz6] */
    public final void B(ez4 ez4Var) {
        tq9 tq9Var = new tq9();
        if (!ez4Var.a) {
            tq9Var = new gz6(tq9Var);
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, ez4Var, tq9Var) && atomicReferenceFieldUpdater.get(this) == ez4Var) {
        }
    }

    public final void C(k87 k87Var) {
        k87Var.addOneIfEmpty(new tq9());
        LockFreeLinkedListNode nextNode = k87Var.getNextNode();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, k87Var, nextNode) && atomicReferenceFieldUpdater.get(this) == k87Var) {
        }
    }

    public final int D(Object obj) {
        if (obj instanceof ez4) {
            if (((ez4) obj).a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            ez4 ez4Var = a97.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, ez4Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            onStart();
            return 1;
        }
        if (!(obj instanceof gz6)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
        tq9 tq9Var = ((gz6) obj).a;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, tq9Var)) {
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                return -1;
            }
        }
        onStart();
        return 1;
    }

    public final Object F(Object obj, Object obj2) throws Throwable {
        if (!(obj instanceof nz6)) {
            return a97.a;
        }
        if (((obj instanceof ez4) || (obj instanceof k87)) && !(obj instanceof f03) && !(obj2 instanceof lb3)) {
            nz6 nz6Var = (nz6) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            Symbol symbol = a97.a;
            Object oz6Var = obj2 instanceof nz6 ? new oz6((nz6) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nz6Var, oz6Var)) {
                if (atomicReferenceFieldUpdater.get(this) != nz6Var) {
                    return a97.c;
                }
            }
            onCancelling(null);
            onCompletionInternal(obj2);
            t(nz6Var, obj2);
            return obj2;
        }
        nz6 nz6Var2 = (nz6) obj;
        tq9 tq9VarX = x(nz6Var2);
        if (tq9VarX == null) {
            return a97.c;
        }
        t87 t87Var = nz6Var2 instanceof t87 ? (t87) nz6Var2 : null;
        if (t87Var == null) {
            t87Var = new t87(tq9VarX, null);
        }
        synchronized (t87Var) {
            try {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = t87.b;
                if (atomicIntegerFieldUpdater.get(t87Var) != 0) {
                    return a97.a;
                }
                atomicIntegerFieldUpdater.set(t87Var, 1);
                if (t87Var != nz6Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, nz6Var2, t87Var)) {
                        if (atomicReferenceFieldUpdater2.get(this) != nz6Var2) {
                            return a97.c;
                        }
                    }
                }
                boolean zD = t87Var.d();
                lb3 lb3Var = obj2 instanceof lb3 ? (lb3) obj2 : null;
                if (lb3Var != null) {
                    t87Var.a(lb3Var.a);
                }
                Throwable thC = zD ^ true ? t87Var.c() : null;
                if (thC != null) {
                    A(tq9VarX, thC);
                }
                f03 f03VarZ = z(tq9VarX);
                if (f03VarZ != null && G(t87Var, f03VarZ, obj2)) {
                    return a97.b;
                }
                tq9VarX.close(2);
                f03 f03VarZ2 = z(tq9VarX);
                return (f03VarZ2 == null || !G(t87Var, f03VarZ2, obj2)) ? v(t87Var, obj2) : a97.b;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean G(t87 t87Var, f03 f03Var, Object obj) {
        while (pag.q(f03Var.b, false, new s87(this, t87Var, f03Var, obj)) == er9.a) {
            f03Var = z(f03Var);
            if (f03Var == null) {
                return false;
            }
        }
        return true;
    }

    public Object a(Continuation continuation) {
        return awaitInternal(continuation);
    }

    public void afterCompletion(Object obj) {
    }

    public void afterResume(Object obj) {
        afterCompletion(obj);
    }

    @Override // defpackage.x77
    public final e03 attachChild(h03 h03Var) {
        f03 f03Var = new f03(h03Var);
        f03Var.a = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (state$kotlinx_coroutines_core instanceof ez4) {
                ez4 ez4Var = (ez4) state$kotlinx_coroutines_core;
                if (ez4Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, f03Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                            break;
                        }
                    }
                    break loop0;
                }
                B(ez4Var);
            } else {
                boolean z = state$kotlinx_coroutines_core instanceof nz6;
                er9 er9Var = er9.a;
                if (!z) {
                    Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                    lb3 lb3Var = state$kotlinx_coroutines_core2 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core2 : null;
                    f03Var.d(lb3Var != null ? lb3Var.a : null);
                    return er9Var;
                }
                tq9 tq9VarB = ((nz6) state$kotlinx_coroutines_core).b();
                if (tq9VarB == null) {
                    C((k87) state$kotlinx_coroutines_core);
                } else if (!tq9VarB.addLast(f03Var, 7)) {
                    boolean zAddLast = tq9VarB.addLast(f03Var, 3);
                    Object state$kotlinx_coroutines_core3 = getState$kotlinx_coroutines_core();
                    if (state$kotlinx_coroutines_core3 instanceof t87) {
                        thC = ((t87) state$kotlinx_coroutines_core3).c();
                    } else {
                        lb3 lb3Var2 = state$kotlinx_coroutines_core3 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core3 : null;
                        if (lb3Var2 != null) {
                            thC = lb3Var2.a;
                        }
                    }
                    f03Var.d(thC);
                    if (zAddLast) {
                        break loop0;
                    }
                    return er9Var;
                }
            }
        }
        return f03Var;
    }

    public final Object awaitInternal(Continuation<Object> continuation) throws Throwable {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                if (state$kotlinx_coroutines_core instanceof lb3) {
                    throw ((lb3) state$kotlinx_coroutines_core).a;
                }
                return a97.a(state$kotlinx_coroutines_core);
            }
        } while (D(state$kotlinx_coroutines_core) < 0);
        return r(continuation);
    }

    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean cancelCoroutine(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public final boolean cancelImpl$kotlinx_coroutines_core(Object obj) throws Throwable {
        Symbol symbol;
        Object objF = a97.a;
        if (getOnCancelComplete$kotlinx_coroutines_core()) {
            do {
                Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
                if (state$kotlinx_coroutines_core instanceof nz6) {
                    if (state$kotlinx_coroutines_core instanceof t87) {
                        t87 t87Var = (t87) state$kotlinx_coroutines_core;
                        t87Var.getClass();
                        if (t87.b.get(t87Var) != 0) {
                        }
                    }
                    objF = F(state$kotlinx_coroutines_core, new lb3(u(obj), false));
                }
                objF = a97.a;
                break;
            } while (objF == a97.c);
            if (objF == a97.b) {
                return true;
            }
        }
        if (objF == a97.a) {
            Throwable thU = null;
            loop1: while (true) {
                Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
                if (!(state$kotlinx_coroutines_core2 instanceof t87)) {
                    if (!(state$kotlinx_coroutines_core2 instanceof nz6)) {
                        symbol = a97.d;
                        break;
                    }
                    if (thU == null) {
                        thU = u(obj);
                    }
                    nz6 nz6Var = (nz6) state$kotlinx_coroutines_core2;
                    if (nz6Var.isActive()) {
                        tq9 tq9VarX = x(nz6Var);
                        if (tq9VarX != null) {
                            t87 t87Var2 = new t87(tq9VarX, thU);
                            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, nz6Var, t87Var2)) {
                                if (atomicReferenceFieldUpdater.get(this) != nz6Var) {
                                    break;
                                }
                            }
                            A(tq9VarX, thU);
                            symbol = a97.a;
                            break loop1;
                        }
                        continue;
                    } else {
                        Object objF2 = F(state$kotlinx_coroutines_core2, new lb3(thU, false));
                        if (objF2 == a97.a) {
                            throw new IllegalStateException(("Cannot happen in " + state$kotlinx_coroutines_core2).toString());
                        }
                        if (objF2 != a97.c) {
                            objF = objF2;
                            break;
                        }
                    }
                } else {
                    synchronized (state$kotlinx_coroutines_core2) {
                        try {
                            t87 t87Var3 = (t87) state$kotlinx_coroutines_core2;
                            t87Var3.getClass();
                            if (t87.o.get(t87Var3) == a97.e) {
                                symbol = a97.d;
                            } else {
                                boolean zD = ((t87) state$kotlinx_coroutines_core2).d();
                                if (obj != null || !zD) {
                                    if (thU == null) {
                                        thU = u(obj);
                                    }
                                    ((t87) state$kotlinx_coroutines_core2).a(thU);
                                }
                                Throwable thC = zD ^ true ? ((t87) state$kotlinx_coroutines_core2).c() : null;
                                if (thC != null) {
                                    A(((t87) state$kotlinx_coroutines_core2).a, thC);
                                }
                                symbol = a97.a;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
            objF = symbol;
        }
        if (objF == a97.a || objF == a97.b) {
            return true;
        }
        if (objF == a97.d) {
            return false;
        }
        afterCompletion(objF);
        return true;
    }

    public void cancelInternal(Throwable th) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(th);
    }

    public String cancellationExceptionMessage() {
        return "Job was cancelled";
    }

    public boolean childCancelled(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return cancelImpl$kotlinx_coroutines_core(th) && getHandlesException$kotlinx_coroutines_core();
    }

    public final JobCancellationException defaultCancellationException$kotlinx_coroutines_core(String str, Throwable th) {
        if (str == null) {
            str = cancellationExceptionMessage();
        }
        return new JobCancellationException(str, th, this);
    }

    @Override // defpackage.lx3
    public <R> R fold(R r, a66 a66Var) {
        return (R) a66Var.invoke(r, this);
    }

    @Override // defpackage.lx3
    public <E extends jx3> E get(kx3 kx3Var) {
        return (E) tpa.r(this, kx3Var);
    }

    @Override // defpackage.x77
    public final CancellationException getCancellationException() {
        CancellationException cancellationException;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(state$kotlinx_coroutines_core instanceof t87)) {
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                return state$kotlinx_coroutines_core instanceof lb3 ? toCancellationException$default(this, ((lb3) state$kotlinx_coroutines_core).a, null, 1, null) : new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable thC = ((t87) state$kotlinx_coroutines_core).c();
        if (thC != null && (cancellationException = toCancellationException(thC, getClass().getSimpleName().concat(" is cancelling"))) != null) {
            return cancellationException;
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // defpackage.vpa
    public CancellationException getChildJobCancellationCause() {
        CancellationException cancellationExceptionC;
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof t87) {
            cancellationExceptionC = ((t87) state$kotlinx_coroutines_core).c();
        } else if (state$kotlinx_coroutines_core instanceof lb3) {
            cancellationExceptionC = ((lb3) state$kotlinx_coroutines_core).a;
        } else {
            if (state$kotlinx_coroutines_core instanceof nz6) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + state$kotlinx_coroutines_core).toString());
            }
            cancellationExceptionC = null;
        }
        CancellationException cancellationException = cancellationExceptionC instanceof CancellationException ? cancellationExceptionC : null;
        return cancellationException == null ? new JobCancellationException("Parent job is ".concat(E(state$kotlinx_coroutines_core)), cancellationExceptionC, this) : cancellationException;
    }

    @Override // defpackage.x77
    public final c6d getChildren() {
        return new at(5, new v87(this, null));
    }

    public final Object getCompletedInternal$kotlinx_coroutines_core() throws Throwable {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof nz6))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (state$kotlinx_coroutines_core instanceof lb3) {
            throw ((lb3) state$kotlinx_coroutines_core).a;
        }
        return a97.a(state$kotlinx_coroutines_core);
    }

    public final Throwable getCompletionCause() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof t87) {
            Throwable thC = ((t87) state$kotlinx_coroutines_core).c();
            if (thC != null) {
                return thC;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof nz6) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        if (state$kotlinx_coroutines_core instanceof lb3) {
            return ((lb3) state$kotlinx_coroutines_core).a;
        }
        return null;
    }

    public final boolean getCompletionCauseHandled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (state$kotlinx_coroutines_core instanceof lb3) {
            lb3 lb3Var = (lb3) state$kotlinx_coroutines_core;
            lb3Var.getClass();
            if (lb3.b.get(lb3Var) != 0) {
                return true;
            }
        }
        return false;
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        if (!(!(state$kotlinx_coroutines_core instanceof nz6))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        lb3 lb3Var = state$kotlinx_coroutines_core instanceof lb3 ? (lb3) state$kotlinx_coroutines_core : null;
        if (lb3Var != null) {
            return lb3Var.a;
        }
        return null;
    }

    public boolean getHandlesException$kotlinx_coroutines_core() {
        return true;
    }

    @Override // defpackage.jx3
    public final kx3 getKey() {
        return c32.X;
    }

    public final v3d getOnAwaitInternal() {
        w87 w87Var = w87.a;
        f8.c(3, w87Var);
        x87 x87Var = x87.a;
        f8.c(3, x87Var);
        return new m5d(13, this, w87Var, x87Var, null, false);
    }

    public boolean getOnCancelComplete$kotlinx_coroutines_core() {
        return false;
    }

    public final u3d getOnJoin() {
        y87 y87Var = y87.a;
        f8.c(3, y87Var);
        a8g a8gVar = new a8g();
        a8gVar.a = this;
        a8gVar.b = y87Var;
        a8gVar.c = null;
        Symbol symbol = b4d.a;
        a8gVar.o = a4d.a;
        return a8gVar;
    }

    public x77 getParent() {
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            return parentHandle$kotlinx_coroutines_core.getParent();
        }
        return null;
    }

    public final e03 getParentHandle$kotlinx_coroutines_core() {
        return (e03) _parentHandle$volatile$FU.get(this);
    }

    public final Object getState$kotlinx_coroutines_core() {
        return _state$volatile$FU.get(this);
    }

    public boolean handleJobException(Throwable th) {
        return false;
    }

    public void handleOnCompletionException$kotlinx_coroutines_core(Throwable th) throws Throwable {
        throw th;
    }

    public final void initParentJob(x77 x77Var) {
        er9 er9Var = er9.a;
        if (x77Var == null) {
            setParentHandle$kotlinx_coroutines_core(er9Var);
            return;
        }
        x77Var.start();
        e03 e03VarAttachChild = x77Var.attachChild(this);
        setParentHandle$kotlinx_coroutines_core(e03VarAttachChild);
        if (isCompleted()) {
            e03VarAttachChild.dispose();
            setParentHandle$kotlinx_coroutines_core(er9Var);
        }
    }

    @Override // defpackage.x77
    public final cm4 invokeOnCompletion(m56 m56Var) {
        return invokeOnCompletionInternal$kotlinx_coroutines_core(true, new gm4(1, m56Var));
    }

    public final cm4 invokeOnCompletionInternal$kotlinx_coroutines_core(boolean z, k87 k87Var) {
        er9 er9Var;
        boolean z2;
        boolean zAddLast;
        k87Var.a = this;
        loop0: while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            boolean z3 = state$kotlinx_coroutines_core instanceof ez4;
            er9Var = er9.a;
            z2 = true;
            if (!z3) {
                if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                    z2 = false;
                    break;
                }
                nz6 nz6Var = (nz6) state$kotlinx_coroutines_core;
                tq9 tq9VarB = nz6Var.b();
                if (tq9VarB == null) {
                    C((k87) state$kotlinx_coroutines_core);
                } else {
                    if (k87Var.c()) {
                        t87 t87Var = nz6Var instanceof t87 ? (t87) nz6Var : null;
                        Throwable thC = t87Var != null ? t87Var.c() : null;
                        if (thC != null) {
                            if (z) {
                                k87Var.d(thC);
                            }
                            return er9Var;
                        }
                        zAddLast = tq9VarB.addLast(k87Var, 5);
                    } else {
                        zAddLast = tq9VarB.addLast(k87Var, 1);
                    }
                    if (zAddLast) {
                        break;
                    }
                }
            } else {
                ez4 ez4Var = (ez4) state$kotlinx_coroutines_core;
                if (ez4Var.a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, k87Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                            break;
                        }
                    }
                    break loop0;
                }
                B(ez4Var);
            }
        }
        if (z2) {
            return k87Var;
        }
        if (z) {
            Object state$kotlinx_coroutines_core2 = getState$kotlinx_coroutines_core();
            lb3 lb3Var = state$kotlinx_coroutines_core2 instanceof lb3 ? (lb3) state$kotlinx_coroutines_core2 : null;
            k87Var.d(lb3Var != null ? lb3Var.a : null);
        }
        return er9Var;
    }

    @Override // defpackage.x77
    public boolean isActive() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof nz6) && ((nz6) state$kotlinx_coroutines_core).isActive();
    }

    @Override // defpackage.x77
    public final boolean isCancelled() {
        Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
        return (state$kotlinx_coroutines_core instanceof lb3) || ((state$kotlinx_coroutines_core instanceof t87) && ((t87) state$kotlinx_coroutines_core).d());
    }

    @Override // defpackage.x77
    public final boolean isCompleted() {
        return !(getState$kotlinx_coroutines_core() instanceof nz6);
    }

    public final boolean isCompletedExceptionally() {
        return getState$kotlinx_coroutines_core() instanceof lb3;
    }

    public boolean isScopedCoroutine() {
        return this instanceof jp0;
    }

    @Override // defpackage.x77
    public final Object join(Continuation<? super e5f> continuation) {
        boolean z;
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof nz6)) {
                z = false;
                break;
            }
            if (D(state$kotlinx_coroutines_core) >= 0) {
                z = true;
                break;
            }
        }
        e5f e5fVar = e5f.a;
        if (z) {
            Object objY = y(continuation);
            return objY == tx3.a ? objY : e5fVar;
        }
        pag.j(continuation.getContext());
        return e5fVar;
    }

    public Object m() {
        return getCompletedInternal$kotlinx_coroutines_core();
    }

    public final boolean makeCompleting$kotlinx_coroutines_core(Object obj) {
        Object objF;
        do {
            objF = F(getState$kotlinx_coroutines_core(), obj);
            if (objF == a97.a) {
                return false;
            }
            if (objF == a97.b) {
                return true;
            }
        } while (objF == a97.c);
        afterCompletion(objF);
        return true;
    }

    public final Object makeCompletingOnce$kotlinx_coroutines_core(Object obj) throws Throwable {
        Object objF;
        do {
            objF = F(getState$kotlinx_coroutines_core(), obj);
            if (objF == a97.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                lb3 lb3Var = obj instanceof lb3 ? (lb3) obj : null;
                throw new IllegalStateException(str, lb3Var != null ? lb3Var.a : null);
            }
        } while (objF == a97.c);
        return objF;
    }

    @Override // defpackage.lx3
    public lx3 minusKey(kx3 kx3Var) {
        return tpa.y(this, kx3Var);
    }

    public String nameString$kotlinx_coroutines_core() {
        return getClass().getSimpleName();
    }

    public void onCancelling(Throwable th) {
    }

    public void onCompletionInternal(Object obj) {
    }

    public void onStart() {
    }

    @Override // defpackage.h03
    public final void parentCancelled(vpa vpaVar) throws Throwable {
        cancelImpl$kotlinx_coroutines_core(vpaVar);
    }

    public x77 plus(x77 x77Var) {
        return x77Var;
    }

    public final Object r(Continuation continuation) {
        r87 r87Var = new r87(this, v3c.u(continuation));
        r87Var.n();
        nu0.w(r87Var, new hy1(2, pag.q(this, true, new d03(r87Var, 1))));
        return r87Var.m();
    }

    public final void removeNode$kotlinx_coroutines_core(k87 k87Var) {
        while (true) {
            Object state$kotlinx_coroutines_core = getState$kotlinx_coroutines_core();
            if (!(state$kotlinx_coroutines_core instanceof k87)) {
                if (!(state$kotlinx_coroutines_core instanceof nz6) || ((nz6) state$kotlinx_coroutines_core).b() == null) {
                    return;
                }
                k87Var.mo19remove();
                return;
            }
            if (state$kotlinx_coroutines_core != k87Var) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
            ez4 ez4Var = a97.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, state$kotlinx_coroutines_core, ez4Var)) {
                if (atomicReferenceFieldUpdater.get(this) != state$kotlinx_coroutines_core) {
                    break;
                }
            }
            return;
        }
    }

    public final boolean s(Throwable th) {
        if (isScopedCoroutine()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        return (parentHandle$kotlinx_coroutines_core == null || parentHandle$kotlinx_coroutines_core == er9.a) ? z : parentHandle$kotlinx_coroutines_core.a(th) || z;
    }

    public final void setParentHandle$kotlinx_coroutines_core(e03 e03Var) {
        _parentHandle$volatile$FU.set(this, e03Var);
    }

    @Override // defpackage.x77
    public final boolean start() {
        int iD;
        do {
            iD = D(getState$kotlinx_coroutines_core());
            if (iD == 0) {
                return false;
            }
        } while (iD != 1);
        return true;
    }

    public final void t(nz6 nz6Var, Object obj) throws Throwable {
        e03 parentHandle$kotlinx_coroutines_core = getParentHandle$kotlinx_coroutines_core();
        if (parentHandle$kotlinx_coroutines_core != null) {
            parentHandle$kotlinx_coroutines_core.dispose();
            setParentHandle$kotlinx_coroutines_core(er9.a);
        }
        CompletionHandlerException completionHandlerException = null;
        lb3 lb3Var = obj instanceof lb3 ? (lb3) obj : null;
        Throwable th = lb3Var != null ? lb3Var.a : null;
        if (nz6Var instanceof k87) {
            try {
                ((k87) nz6Var).d(th);
                return;
            } catch (Throwable th2) {
                handleOnCompletionException$kotlinx_coroutines_core(new CompletionHandlerException("Exception in completion handler " + nz6Var + " for " + this, th2));
                return;
            }
        }
        tq9 tq9VarB = nz6Var.b();
        if (tq9VarB != null) {
            tq9VarB.close(1);
            for (LockFreeLinkedListNode nextNode = (LockFreeLinkedListNode) tq9VarB.getNext(); !tpa.f(nextNode, tq9VarB); nextNode = nextNode.getNextNode()) {
                if (nextNode instanceof k87) {
                    try {
                        ((k87) nextNode).d(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            j47.e(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + nextNode + " for " + this, th3);
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                handleOnCompletionException$kotlinx_coroutines_core(completionHandlerException);
            }
        }
    }

    public final CancellationException toCancellationException(Throwable th, String str) {
        CancellationException jobCancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (jobCancellationException == null) {
            if (str == null) {
                str = cancellationExceptionMessage();
            }
            jobCancellationException = new JobCancellationException(str, th, this);
        }
        return jobCancellationException;
    }

    public final String toDebugString() {
        return nameString$kotlinx_coroutines_core() + '{' + E(getState$kotlinx_coroutines_core()) + '}';
    }

    public String toString() {
        return toDebugString() + '@' + c54.u(this);
    }

    public final Throwable u(Object obj) {
        if (!(obj == null ? true : obj instanceof Throwable)) {
            return ((vpa) obj).getChildJobCancellationCause();
        }
        Throwable th = (Throwable) obj;
        return th == null ? new JobCancellationException(cancellationExceptionMessage(), null, this) : th;
    }

    public final Object v(t87 t87Var, Object obj) throws Throwable {
        boolean zD;
        Throwable thW;
        lb3 lb3Var = obj instanceof lb3 ? (lb3) obj : null;
        Throwable th = lb3Var != null ? lb3Var.a : null;
        synchronized (t87Var) {
            zD = t87Var.d();
            ArrayList<Throwable> arrayListE = t87Var.e(th);
            thW = w(t87Var, arrayListE);
            if (thW != null && arrayListE.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListE.size()));
                for (Throwable th2 : arrayListE) {
                    if (th2 != thW && th2 != thW && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        j47.e(thW, th2);
                    }
                }
            }
        }
        if (thW != null && thW != th) {
            obj = new lb3(thW, false);
        }
        if (thW != null && (s(thW) || handleJobException(thW))) {
            lb3 lb3Var2 = (lb3) obj;
            lb3Var2.getClass();
            lb3.b.compareAndSet(lb3Var2, 0, 1);
        }
        if (!zD) {
            onCancelling(thW);
        }
        onCompletionInternal(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$volatile$FU;
        Object oz6Var = obj instanceof nz6 ? new oz6((nz6) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, t87Var, oz6Var) && atomicReferenceFieldUpdater.get(this) == t87Var) {
        }
        t(t87Var, obj);
        return obj;
    }

    public final Throwable w(t87 t87Var, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (t87Var.d()) {
                return new JobCancellationException(cancellationExceptionMessage(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public final tq9 x(nz6 nz6Var) {
        tq9 tq9VarB = nz6Var.b();
        if (tq9VarB != null) {
            return tq9VarB;
        }
        if (nz6Var instanceof ez4) {
            return new tq9();
        }
        if (nz6Var instanceof k87) {
            C((k87) nz6Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + nz6Var).toString());
    }

    public final Object y(Continuation continuation) {
        sy1 sy1Var = new sy1(1, v3c.u(continuation));
        sy1Var.n();
        nu0.w(sy1Var, new hy1(2, pag.q(this, true, new gm4(2, sy1Var))));
        Object objM = sy1Var.m();
        return objM == tx3.a ? objM : e5f.a;
    }

    public /* synthetic */ boolean cancel(Throwable th) throws Throwable {
        Throwable jobCancellationException;
        if (th == null || (jobCancellationException = toCancellationException$default(this, th, null, 1, null)) == null) {
            jobCancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(jobCancellationException);
        return true;
    }

    @Override // defpackage.lx3
    public lx3 plus(lx3 lx3Var) {
        return ema.z(this, lx3Var);
    }

    @Override // defpackage.x77
    public final cm4 invokeOnCompletion(boolean z, boolean z2, m56 m56Var) {
        k87 gm4Var;
        if (z) {
            gm4Var = new m67(m56Var);
        } else {
            gm4Var = new gm4(1, m56Var);
        }
        return invokeOnCompletionInternal$kotlinx_coroutines_core(z2, gm4Var);
    }

    @Override // defpackage.x77, defpackage.p8c
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(cancellationExceptionMessage(), null, this);
        }
        cancelInternal(cancellationException);
    }
}
