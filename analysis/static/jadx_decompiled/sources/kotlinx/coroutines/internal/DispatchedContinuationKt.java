package kotlinx.coroutines.internal;

import defpackage.a45;
import defpackage.e5f;
import defpackage.hs;
import defpackage.k56;
import defpackage.m56;
import defpackage.use;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\f\u001a\u00020\u000b*\b\u0012\u0004\u0012\u00020\u00060\nH\u0000¢\u0006\u0004\b\f\u0010\r\u001aB\u0010\u0015\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0013H\u0082\b¢\u0006\u0004\b\u0015\u0010\u0016\"\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\"\u0014\u0010\u001a\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"T", "Lkotlin/coroutines/Continuation;", "Lpjc;", "result", "Lkotlin/Function1;", "", "Le5f;", "onCancellation", "resumeCancellableWith", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lm56;)V", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "", "yieldUndispatched", "(Lkotlinx/coroutines/internal/DispatchedContinuation;)Z", "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "executeUnconfined", "(Lkotlinx/coroutines/internal/DispatchedContinuation;Ljava/lang/Object;IZLk56;)Z", "Lkotlinx/coroutines/internal/Symbol;", "UNDEFINED", "Lkotlinx/coroutines/internal/Symbol;", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {2, 0, 0})
/* loaded from: classes.dex */
public final class DispatchedContinuationKt {
    private static final Symbol UNDEFINED = new Symbol("UNDEFINED");
    public static final Symbol REUSABLE_CLAIMED = new Symbol("REUSABLE_CLAIMED");

    private static final boolean executeUnconfined(DispatchedContinuation<?> dispatchedContinuation, Object obj, int i, boolean z, k56 k56Var) {
        a45 a45VarA = use.a();
        if (z) {
            hs hsVar = a45VarA.c;
            if (hsVar != null ? hsVar.isEmpty() : true) {
                return false;
            }
        }
        if (a45VarA.U()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            a45VarA.n(dispatchedContinuation);
            return true;
        }
        a45VarA.S(true);
        try {
            k56Var.invoke();
            do {
            } while (a45VarA.m0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    public static boolean executeUnconfined$default(DispatchedContinuation dispatchedContinuation, Object obj, int i, boolean z, k56 k56Var, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        a45 a45VarA = use.a();
        if (z) {
            hs hsVar = a45VarA.c;
            if (hsVar != null ? hsVar.isEmpty() : true) {
                return false;
            }
        }
        if (a45VarA.U()) {
            dispatchedContinuation._state = obj;
            dispatchedContinuation.resumeMode = i;
            a45VarA.n(dispatchedContinuation);
            return true;
        }
        a45VarA.S(true);
        try {
            k56Var.invoke();
            do {
            } while (a45VarA.m0());
        } finally {
            try {
                return false;
            } finally {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x0061, DONT_GENERATE, TryCatch #0 {all -> 0x0061, blocks: (B:11:0x003d, B:13:0x004b, B:15:0x0051, B:28:0x0089, B:18:0x0063, B:20:0x0073, B:25:0x0080, B:27:0x0086, B:33:0x0096, B:36:0x009f, B:35:0x009c, B:23:0x0079), top: B:44:0x003d, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final <T> void resumeCancellableWith(kotlin.coroutines.Continuation<? super T> r6, java.lang.Object r7, defpackage.m56 r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto La9
            kotlinx.coroutines.internal.DispatchedContinuation r6 = (kotlinx.coroutines.internal.DispatchedContinuation) r6
            java.lang.Object r8 = defpackage.z7.T(r7, r8)
            nx3 r0 = r6.dispatcher
            lx3 r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6._state = r8
            r6.resumeMode = r1
            nx3 r7 = r6.dispatcher
            lx3 r8 = r6.getContext()
            r7.mo20dispatch(r8, r6)
            goto Lac
        L26:
            a45 r0 = defpackage.use.a()
            boolean r2 = r0.U()
            if (r2 == 0) goto L39
            r6._state = r8
            r6.resumeMode = r1
            r0.n(r6)
            goto Lac
        L39:
            r0.S(r1)
            r2 = 0
            lx3 r3 = r6.getContext()     // Catch: java.lang.Throwable -> L61
            c32 r4 = defpackage.c32.X     // Catch: java.lang.Throwable -> L61
            jx3 r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L61
            x77 r3 = (defpackage.x77) r3     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L63
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L63
            java.util.concurrent.CancellationException r7 = r3.getCancellationException()     // Catch: java.lang.Throwable -> L61
            r6.cancelCompletedResult$kotlinx_coroutines_core(r8, r7)     // Catch: java.lang.Throwable -> L61
            njc r8 = new njc     // Catch: java.lang.Throwable -> L61
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L61
            r6.resumeWith(r8)     // Catch: java.lang.Throwable -> L61
            goto L89
        L61:
            r7 = move-exception
            goto La0
        L63:
            kotlin.coroutines.Continuation<T> r8 = r6.continuation     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r6.countOrElement     // Catch: java.lang.Throwable -> L61
            lx3 r4 = r8.getContext()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = kotlinx.coroutines.internal.ThreadContextKt.updateThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.internal.ThreadContextKt.NO_THREAD_ELEMENTS     // Catch: java.lang.Throwable -> L61
            if (r3 == r5) goto L78
            z4f r8 = defpackage.v3c.G(r8, r4, r3)     // Catch: java.lang.Throwable -> L61
            goto L79
        L78:
            r8 = r2
        L79:
            kotlin.coroutines.Continuation<T> r5 = r6.continuation     // Catch: java.lang.Throwable -> L93
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L93
            if (r8 == 0) goto L86
            boolean r7 = r8.H()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L89
        L86:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
        L89:
            boolean r7 = r0.m0()     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L89
        L8f:
            r0.d(r1)
            goto Lac
        L93:
            r7 = move-exception
            if (r8 == 0) goto L9c
            boolean r8 = r8.H()     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto L9f
        L9c:
            kotlinx.coroutines.internal.ThreadContextKt.restoreThreadContext(r4, r3)     // Catch: java.lang.Throwable -> L61
        L9f:
            throw r7     // Catch: java.lang.Throwable -> L61
        La0:
            r6.handleFatalException$kotlinx_coroutines_core(r7, r2)     // Catch: java.lang.Throwable -> La4
            goto L8f
        La4:
            r6 = move-exception
            r0.d(r1)
            throw r6
        La9:
            r6.resumeWith(r7)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.DispatchedContinuationKt.resumeCancellableWith(kotlin.coroutines.Continuation, java.lang.Object, m56):void");
    }

    public static /* synthetic */ void resumeCancellableWith$default(Continuation continuation, Object obj, m56 m56Var, int i, Object obj2) {
        if ((i & 2) != 0) {
            m56Var = null;
        }
        resumeCancellableWith(continuation, obj, m56Var);
    }

    public static final boolean yieldUndispatched(DispatchedContinuation<? super e5f> dispatchedContinuation) {
        e5f e5fVar = e5f.a;
        a45 a45VarA = use.a();
        hs hsVar = a45VarA.c;
        boolean z = true;
        if (hsVar != null ? hsVar.isEmpty() : true) {
            return false;
        }
        if (a45VarA.U()) {
            dispatchedContinuation._state = e5fVar;
            dispatchedContinuation.resumeMode = 1;
            a45VarA.n(dispatchedContinuation);
        } else {
            a45VarA.S(true);
            try {
                dispatchedContinuation.run();
                do {
                } while (a45VarA.m0());
            } finally {
                try {
                    z = false;
                } finally {
                }
            }
            z = false;
        }
        return z;
    }
}
